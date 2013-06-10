/*
 * 
 */
package atrophy.combat.ai;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import watoydoEngine.utils.Maths;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.conversation.Dialogue;
import atrophy.combat.ai.conversation.Topic;
import atrophy.combat.combatEffects.MobileInvisibility;
import atrophy.combat.combatEffects.Parrying;
import atrophy.combat.combatEffects.SpeedBoost;
import atrophy.combat.combatEffects.StationaryInvisibility;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Item;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.Weapon;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.MissionManager;
import atrophy.combat.level.Portal;
import atrophy.combat.levelAssets.Grenade;
import atrophy.combat.mechanics.Abilities;
import atrophy.combat.mechanics.TurnProcess;

// TODO: Auto-generated Javadoc
/**
 * The Class ThinkingAi.
 */
public class ThinkingAi extends Ai{
	
	protected static enum AiMode {
		EMPTY, CAMPING, FLEEING, PATROLLING, ENGAGING, LOOT
	}
	
	private AiNode aiNode;
	
	protected AiMode aiMode;
	
	private int turnCounter;
	
	private Ai chaseAi;
	
	private AiJob job;
	private boolean doingJob;

	private boolean blockPlayerConvo;
	
	ThinkingAiEmotion emotionManager;
	private CombatNCEManager combatInorganicManager;
	private LevelManager levelManager;

	public ThinkingAi(PanningManager panningManager, CombatVisualManager combatVisualManager, TurnProcess turnProcess, FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler, AiCrowd aiCrowd, CombatMembersManager combatMembersManager, String name, double x, double y, LevelManager levelManager, CombatNCEManager combatInorganicManager, CombatUiManager combatUiManager, LootBox lootBox){
		super(floatingIcons, mouseAbilityHandler, name,x,y, combatInorganicManager, levelManager, lootBox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd, panningManager, turnProcess);
		aiMode = AiMode.EMPTY;
		turnCounter = 0;
		chaseAi = null;
		doingJob = true;
		blockPlayerConvo = false;
		this.combatMembersManager = combatMembersManager;
		this.turnProcess = turnProcess;
		this.aiCrowd = aiCrowd;
		this.combatVisualManager = combatVisualManager;
		this.combatInorganicManager = combatInorganicManager;
		this.levelManager = levelManager;
		this.emotionManager = new ThinkingAiEmotion(this);
	}

	@Override
	public void action(){
		
		if(this.getName().equals("Sorrowful Solovich"))
			System.out.println();
		
		this.resetMoveUnits();
		
		if(turnCounter > 0){
			turnCounter -= 1;
		}
		
		if(this.getStunnedTurns() == 0 && this.getIncapTurns() == 0){
			think();
		}
		else if(this.getStunnedTurns() > 0){
			this.setStunnedTurns(getStunnedTurns() - 1);
			this.setIncapTurns(0);
			endTurn();
		}
		else if(this.getIncapTurns() > 0){
			this.setIncapTurns(this.getIncapTurns() - 1);
			endTurn();
		}
	}
	
	private void think(){		
		
		if(this.aiNode != null && doingJob){
			aiNode.think(this);
			return;
		}
		else if(doingJob) {
			this.job = this.getCommander().getJob(this);
			if(this.getLevelBlock() == this.job.getJobBlock())
				this.job.tickJob();
		}
		
		this.gatherEnvironmentData();
	}
	
	private void commitThoughts(){
		resetStates();
		
		if(this.getStunnedTurns() == 0 && this.getIncapTurns() == 0){
		
			this.aiData.handleEffects(this, this.getAction());
			
			if(aiMode.equals(AiMode.LOOT) && this.getAction().equals("")){
				this.aiMode = (AiMode.LOOT);
			}
			
			if(Maths.getDistance(this.getLocation(), this.getMoveLocation()) > 0){
				this.aiPathing.move(this);
				
				this.setActionTurns(0);
			}
			else if(this.getTargetAi() != null && !this.aiMode.equals(AiMode.LOOT)&&!this.getAction().equals("Loot") && !this.getAction().equals("Looting")){
				attack();
				
				this.setActionTurns(0);
			}
			else{
				specialActions();
			}
			
			assignAbilities();
			
			// remove action from applying here to stop a free reload turn
			if(this.getAction().startsWith("Applying:")){
				this.setAction("");
			}
		}
		
		this.setOldAction(this.getAction());
		this.setOldActionTurns(this.getActionTurns());
		endTurn();
	}

	protected void gatherEnvironmentData(){
		// since this is done during a turn some variables that are swept up at the end of the turn will be incorrect
		// e.g aiming at a dead target
		cleanupIntraTurnVars();

		if(this.getTargetAi() == null || this.aiMode.equals(AiMode.LOOT) || this.getWeapon().isMelee()){
			engageWithHostiles();
		}
		else{
			respondToEnvironmentData();
		}
	}
	
	protected void respondToEnvironmentData(){
		
		computeAiMode();
		
		if(this.aiMode.equals(AiMode.ENGAGING)){
			this.computeWhenToFire();
			emotionManager.modifyAggression(ThinkingAiEmotion.AIMING_AGGRESSION);
		}
		else{
			this.computeLookDirection();
		}
		
		// start to reset aggression if no change occurred
		if(!this.emotionManager.isAggressionModified()){
			emotionManager.resetAggression(ThinkingAiEmotion.AGGRESSION_RESTORE_RATE);
		}
		
		if(this.emotionManager.getAggression() < ThinkingAiEmotion.MINDLESS_TERROR){
			blockPlayerConvo = false;
		}
		
		this.emotionManager.setAggressionModified(false);
	}

	private void computeAiMode(){
		
		try{
			
			fleeFromGrenades();
			
			if(!this.aiMode.equals(AiMode.ENGAGING) &&
			   !this.aiMode.equals(AiMode.FLEEING) &&
			   !this.aiMode.equals(AiMode.LOOT) &&
			   !this.getAction().startsWith("Applying")){
				
				this.setSwing(0);
				
				act();
			}
			else if(this.aiMode.equals(AiMode.FLEEING)){ 
				fleeingAction();
			}
		}
		catch(PathNotFoundException pnfe){
			try{
				// if the formation tried to go somewhere outside the level the levelblock will be null
				if(pnfe.getLevelBlock() != null){
					// try to create a direct path ignoring blocked doors
					this.setMoveLocation(pnfe.getMoveLocation(levelManager), true);
					
					if(this.getPortalPathway() == null){
						throw new PathNotFoundException(pnfe.getLevelBlock());
					}
					
					tryToClearPath();
				}
				else{
					idle();
				}
			}
			catch(PathNotFoundException pnfe1){
				idle();
			}
		}
		
		this.resetMoveDistance();
		
		commitThoughts();
	}
	
	private void tryToClearPath() {
		// if the path is blocked by a portal then open it
		if(this.getAbilities().contains(Abilities.WELDING)){
			for(int i = 0; i < this.getLevelBlock().getPortalCount(); i++){
				
				if(!this.getLevelBlock().getPortal(i).canUse() &&
				   this.getPortalPathway().contains(this.getLevelBlock().getPortal(i))){
					this.setWeldingOpen(this.getLevelBlock().getPortal(i));
					break;
				}
			}
		}
		else {
			for(int i = 0; i < this.getLevelBlock().getPortalCount(); i++){
				
				if(!this.getLevelBlock().getPortal(i).canUse() &&
				   this.getPortalPathway().contains(this.getLevelBlock().getPortal(i))){
					// if the request to get the door open is denied
					if(!this.getCommander().requestDoorOpen(this.getLevelBlock().getPortal(i))){
						this.idle();
					}
					
					break;
				}
			}
		}
	}

	private void idle() {
		this.aiMode = AiMode.CAMPING;
		this.setMoveLocationToSelf();
		doingJob = true;
	}

	private void act() throws PathNotFoundException {
		if(this.chaseAi != null){
			if(this.emotionManager.getAggression() > 0 && !(this.chaseAi instanceof DaemonAi) && (this.getCommander().canPursue(this) || this.chaseAi.getLevelBlock() == this.getLevelBlock())){
				chasetarget();
			}
			else{
				this.chaseAi = null;
			}
		}
		else if(this.aiInRoomToLoot()){
			this.interactWithDeadAi();
		}
		else if(this.job != null && this.getLevelBlock() != this.job.getJobBlock()){
			this.setMoveLocation(levelManager.randomInPosition(this.job.getJobBlock()));
		}
		else if(Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0 && this.turnCounter == 0){
		
			this.aiMode = AiMode.CAMPING;
			Random random = new Random();
			boolean openDoor = false;
			
			for(Portal door : this.getLevelBlock().getPortals()) {
				if(door.canUse()) {
					openDoor = true;
				}
			}
			
			// if can weld then weld instead of camping
			if(openDoor && this.getAbilities().contains(Abilities.WELDING)){
				
				for(Portal door : this.getLevelBlock().getPortals()) {
					if(door.canUse()) {
						this.setWeldingShut(door);
						return;
					}
				}
			}
			else if(this.getAbilities().contains(Abilities.XRAY_SCAN) && this.getWeapon().hasFullAmmo() && Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0){
				this.xrayScan();
			}
			// check if has full ammo or abilities will stop reloading
			else if(this.getAbilities().contains(Abilities.STEALTH1) && !this.hasActiveEffect(StationaryInvisibility.NAME) && Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0){
				this.addEffect(new StationaryInvisibility(this.getSkillLevel(Abilities.STEALTH1)));
			}
			else if(this.job != null && random.nextInt(4) >= 3){
				this.job.getJobBlock().moveTowardsRandomRegion(this, this.job.getJobBlock().getCover(), false);
				this.turnCounter = random.nextInt(20) + 16;
			}
			else{
				this.setMoveLocation(levelManager.randomInPosition(this.getLevelBlock()));
				this.turnCounter = random.nextInt(20) + 16;
			}
			
		}
		// do not set turnCounter == 0, otherwise it will be reset to a higher value and the ai will cycle in place
		if(this.aiMode.equals(AiMode.CAMPING) && this.turnCounter == 1 && !this.getAction().startsWith("Applying:")){
			doingJob = true;
		}
	}

	private void fleeingAction() {
		if(this.turnCounter == 0){
			this.turnCounter = 6;
		}
		else if(this.turnCounter == 1){
			this.doingJob = true;
		}
		
		if(Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0){
			this.aiMode = AiMode.CAMPING;
		}
	}

	private void chasetarget() throws PathNotFoundException{
		// go invisible then chase
		if(this.hasAbility(Abilities.STEALTH2) &&
		   !this.hasEffect(MobileInvisibility.NAME)){
			this.addEffect(new MobileInvisibility(this.getSkillLevel(Abilities.STEALTH2)));
		}
		// go fast then chase
		else if(this.hasAbility(Abilities.SPEED_BOOSTER) &&
			    !this.hasEffect(SpeedBoost.NAME)){
			this.addEffect(new SpeedBoost(this.getSkillLevel(Abilities.SPEED_BOOSTER)));
		}
		else{
			this.setMoveLocation(this.chaseAi.getLocation().clone());
			this.chaseAi = null;
		}
	}

	public void moveTowardsNearestRegion(List<Polygon> regions) throws PathNotFoundException{
		this.getLevelBlock().moveTowardsNearestRegion(this, regions, true);
	}
	
	public Polygon moveTowardsRandomRegion(List<Polygon> regions) throws PathNotFoundException{
		return this.getLevelBlock().moveTowardsRandomRegion(this, regions, true);
	}

	private void fleeFromGrenades() throws PathNotFoundException{
		
		if(!this.aiMode.equals(AiMode.FLEEING)){
			// if a grenade is spotted then flee
			for(int i = 0; i < combatInorganicManager.getLevelAssets().size(); i++){
				if(combatInorganicManager.getLevelAsset(i) instanceof Grenade &&
				   levelManager.getBlock(combatInorganicManager.getLevelAsset(i).getLocation())	== this.getLevelBlock()){
					flee();

					// if can't flee in time then move to cover
					if(this.getLevelBlock().getCover().size() > 0 &&
					    Maths.getDistance(this.getMoveLocation(), this.getLocation()) / this.getMoveDistance() >= Grenade.FUSE_TIME){
						
						this.moveTowardsNearestRegion(this.getLevelBlock().getCover());
						
					}
					// otherwise run to a corner to try and escape los (not calculated, just random)
					else{
						double shortestDistance = 0;
						int index = 0;
						for(int j = 0; j < this.getLevelBlock().getHitBox().npoints; j++){
							if(j == 0 || shortestDistance > Maths.getDistance(this.getLocation()[0], this.getLocation()[1],
									                                           this.getLevelBlock().getHitBox().xpoints[j], this.getLevelBlock().getHitBox().ypoints[j])){
								shortestDistance = Maths.getDistance(this.getLocation()[0], this.getLocation()[1],
												   this.getLevelBlock().getHitBox().xpoints[j], this.getLevelBlock().getHitBox().ypoints[j]);
								index = j;
							}
						}
						
						this.setMoveLocation(this.getLevelBlock().getHitBox().xpoints[index],this.getLevelBlock().getHitBox().ypoints[index]);
					}
					break;
				}
			}
		}
	}
	
	protected void flee() throws PathNotFoundException{
		
		// run through closest door
		Portal fleePortal = null;
		
		for(int j = 0; j < this.getLevelBlock().getPortalCount(); j++){
			if(this.getLevelBlock().getPortal(j).canUse() &&
			   (fleePortal == null || Maths.getDistance(fleePortal.getLocation(), this.getLocation()) > 
			                          Maths.getDistance(this.getLevelBlock().getPortal(j).getLocation(), this.getLocation())
			   )){
				
				fleePortal = this.getLevelBlock().getPortal(j);
			}
		}
		
		if(fleePortal != null){
			this.aiMode = AiMode.FLEEING;
			this.doingJob = false;
			this.chaseAi = null;
			this.setTargetAi(null);
			this.setMoveLocation(levelManager.randomInPosition(fleePortal.linksTo(this.getLevelBlock())));
		}
		else{
			// all doors closed, throw path not found exception
			throw new PathNotFoundException(this.getLevelBlock());
		}
	}
	
	private void fleeCheckForEnemy() throws PathNotFoundException {
		// run through closest door
		Portal fleePortal = null;
		
		ArrayList<Ai> hostileAiInRoom = new ArrayList<Ai>(2);
		
		for(Ai ai : aiCrowd.getActors()){
			if(this.isTargetHostile(ai) && combatVisualManager.isAiInSight(ai, this.getFaction())){
				hostileAiInRoom.add(ai);
			}
		}
		
		for(int j = 0; j < this.getLevelBlock().getPortalCount(); j++){
			// check that enemies aren't closer to the target than unit
			if(this.getLevelBlock().getPortal(j).canUse() && !levelManager.isRoomBanned(this.getFaction(), getLevelBlock().getPortal(j).linksTo(this.getLevelBlock())) && 
			   closestDistanceToPoint(hostileAiInRoom, this.getLevelBlock().getPortal(j).getLocation()) > 
			                          Maths.getDistance(this.getLevelBlock().getPortal(j).getLocation(), this.getLocation()) &&
			                          
			   (fleePortal == null || (Maths.getDistance(fleePortal.getLocation(), this.getLocation()) > 
			                          Maths.getDistance(this.getLevelBlock().getPortal(j).getLocation(), this.getLocation()))
			   )){
				
				fleePortal = this.getLevelBlock().getPortal(j);
			}
		}
		
		if(fleePortal != null){
			this.aiMode = AiMode.FLEEING;
			this.doingJob = false;
			this.chaseAi = null;
			this.setTargetAi(null);
			this.setMoveLocation(levelManager.randomInPosition(fleePortal.linksTo(this.getLevelBlock())));
		}
		else{
			// all doors closed or ai blocking path, throw path not found exception
			throw new PathNotFoundException(this.getLevelBlock());
		}
	}
	
	private double closestDistanceToPoint(ArrayList<Ai> units, double[] location){
		
		Double distance = null;
		
		for(Ai ai : units){
			if(distance == null || Maths.getDistance(ai.getLocation(), location) < distance){
				distance = Maths.getDistance(ai.getLocation(), location);
			}
		}
		
		return distance;
	}
	
	protected void cleanupIntraTurnVars(){
		// chase an ai, ignore commander
		if(this.getTargetAi() == null && this.chaseAi != null){
			this.aiMode = AiMode.PATROLLING;
			doingJob = false;
			this.setSwing(0);
		}
		// stops units stacking on corpse
		if(this.chaseAi != null && this.chaseAi.isDead()){
			this.chaseAi = null;
			doingJob = true;
		}
		
		if(this.getAction().equals("Loot") && this.getCommander().isAiLooted(this.getTargetAi())){
			this.removeOrdersWithoutUpdate(mouseAbilityHandler);
			this.aiMode = AiMode.EMPTY;
		}
		
		// stops ai locking up to stare at corpse
		if(this.getTargetAi() != null && this.getTargetAi().isDead()){
			this.setTargetAi(null);
			
			// if else to stop ai running back into a room they ran from e.g grenade avoidance
			if(this.turnCounter > 0){
				this.aiMode = AiMode.CAMPING;
				this.doingJob = false;
			}
			else{
				this.aiMode = AiMode.PATROLLING;
				this.doingJob = true;
			}
		}
	}
	
	protected void engageWithHostiles(){

		Ai target = null;
		
		// Shuffle the ai so that one hated individual will not get targeted over others with groups of ai
		ArrayList<Ai> shuffledAi = aiCrowd.getShuffledAi();
		
		for(int i = 0; i < shuffledAi.size(); i++){
			
			// determine if target is hostile and if it is visible by the team
			Ai ai = shuffledAi.get(i);
			
			
			if(this.getCommander().isSuspected(ai)) {
				this.getCommander().addHatedAi(ai);
				if(!ai.getFaction().equals(AiGenerator.LONER))
					this.getCommander().removeAlliance(ai.getFaction());
				this.getCommander().removeFriend(ai);
				System.out.println(ai.getName() + "  has been caught for murder and is hated");
			}
			
			if(canBeEngaged(ai)){
				
				// Prioritise hatedAi or ai aiming at ai
				if(this.getCommander().isAiHated(ai) || ai.getTargetAi() == this){
					target = ai;
					break;
				}
				
			    // find closest target
			    if(this.getTargetAi() == null || Maths.getDistance(this.getLocation(), ai.getLocation()) <
						  						 Maths.getDistance(this.getLocation(), this.getTargetAi().getLocation())){

				   target = ai;
				}
			   
			}
		}
		
		if(target != null){
			int enemyCount = combatMembersManager.getFactionStrength(target.getFaction(), this.getLevelBlock());
			this.emotionEngageReaction(enemyCount, target);
			
			this.getCommander().reportUnits(enemyCount,this.getLevelBlock());
		}
		else{
			this.interactWithDeadAi();
			
			respondToEnvironmentData();
			
			this.getCommander().reportUnits(0, this.getLevelBlock());
		}
	}
	
	protected boolean canBeEngaged(Ai ai) {
		if(this.isTargetHostile(ai) &&
		   ai.getLevelBlock() == this.getLevelBlock() &&
		   combatVisualManager.isAiInSight(ai, this.getFaction())){
			return true;
		}
		return false;
	}

	protected void emotionEngageReaction(int enemyCount, Ai target) {
		
		// friendly count is mainly made up of what the individual's strength is
		// if combat is initiated the team may easily win but each ai wants to live
		int friendlyCount = (int)((combatMembersManager.getFactionStrength(this.getFaction(), this.getLevelBlock()) - this.getCombatScore()) / (float)1.5) + this.getCombatScore();
		
		emotionManager.reactToCloseEnemy(target);
		
		if(this.emotionManager.getAggression() > 0){
			aggressiveEngageReaction(friendlyCount,enemyCount,target);
		}
		else if(this.emotionManager.getAggression() < 0){
			passiveEngageReaction(friendlyCount,enemyCount,target);
		}
		else{
		
			if(new Random().nextBoolean()){
				aggressiveEngageReaction(friendlyCount,enemyCount,target);
			}
			else{
				passiveEngageReaction(friendlyCount,enemyCount,target);
			}
		}
		
		respondToEnvironmentData();
	}

	protected void passiveEngageReaction(int friendlyCount, int enemyCount, Ai target) {
		
		if(this.getWeapon().isMelee() && this.getWeapon().isInRange(this, target) && !this.hasEffect(Parrying.NAME) && new Random().nextInt(4) > 1){
			this.addEffect(new Parrying());
			return;
		}
		
		// if being aimed at then engage
		if(this.isBeingTargeted() || this.getCommander().isAiHated(target) && emotionManager.getAggression() > ThinkingAiEmotion.PASSIVE){
			// if fight is possible then engage
			if(friendlyCount >= enemyCount || target.getStunnedTurns() > 0 || target.getIncapTurns() > 0){
				this.aiMode = AiMode.ENGAGING;
				this.aim(target);
				emotionManager.modifyAggression(ThinkingAiEmotion.AIMING_AGGRESSION);
			}
			// low chance of winning, run
			else{
				// go invisible then flee
				if(this.hasAbility(Abilities.STEALTH2) &&
				   !this.hasEffect(MobileInvisibility.NAME)){
					this.addEffect(new MobileInvisibility(this.getSkillLevel(Abilities.STEALTH2)));
					return;
				}
				// go fast then flee
				else if(this.hasAbility(Abilities.SPEED_BOOSTER) &&
					    !this.hasEffect(SpeedBoost.NAME)){
					this.addEffect(new SpeedBoost(this.getSkillLevel(Abilities.SPEED_BOOSTER)));
					return;
				}
				try {
					this.fleeCheckForEnemy();
				} 
				catch (PathNotFoundException e) {
					// Act as normal
				}
			}
		}
		else{
			if(friendlyCount * 2 < enemyCount){
				try {
					this.fleeCheckForEnemy();
				} 
				catch (PathNotFoundException pnfe) {
					// Act as normal
				}
			}
		}
	}
	
	protected void aggressiveEngageReaction(int friendlyCount, int enemyCount, Ai target) {
		
		if(this.getWeapon().isMelee() && this.getWeapon().isInRange(this, target) && !this.hasEffect(Parrying.NAME) && new Random().nextInt(4) > 1){
			this.addEffect(new Parrying());
			return;
		}
		
		// if fight is possible then engage
		if(friendlyCount >= enemyCount || emotionManager.getAggression() >= ThinkingAiEmotion.MINDLESS_TERROR || target.getStunnedTurns() > 0 || target.getIncapTurns() > 0){
			this.aiMode = AiMode.ENGAGING;
			this.aim(target);
		}
		// if a a minor difference in combat ability then call help or shank if using melee
		else if(enemyCount - friendlyCount < this.emotionManager.getCombatScoreThreshold() && ( ( this.getWeapon().isMelee() && this.getWeapon().isInRange(this, target)))){
			this.aiMode = AiMode.ENGAGING;
			this.aim(target);
		}
		// low chance of winning
		// engage if being targeted
		else if(this.isBeingTargeted()){
			this.aiMode = AiMode.ENGAGING;
			this.aim(target);
		}
		else{
			// Become more passive
			emotionManager.modifyAggression(-0.1);
		}
	}
	
	protected void computeWhenToFire(){
		   
		if(this.getSwing() > 0 &&
		   (emotionManager.hasAccuracyForAggressionLevel(this) ||
		    this.getSwing() == this.getWeapon().getMaxSwing())){
			
			this.setAction(AiCombatActions.SHOOTING);
		}
	}
	
	public void aim(Ai ai){
		
		this.setSwing(0);
		
		this.setMoveLocationToSelf();
		
		// remove portal pathway
		this.deletePortalPathway();
		
		this.setTargetAi(ai);
		chaseAi = ai;
		this.setAction(AiCombatActions.AIMING);
		
		// if in range then increase swing by 1
		if(Maths.getDistance(this.getLocation(), ai.getLocation()) <= this.getWeapon().getRange()){
			this.setSwing(1);
		}
	}
	
	protected void computeLookDirection(){
		
		if(this.aiMode.equals(AiMode.PATROLLING)){
			// then look towards portal or look towards move point if in same room
			if(this.getPortalPathway() == null){
				this.setTrueLookAngle(this.getMoveLocation());
			}
			else{
				this.setTrueLookAngle(this.getPortalPathway().get(this.getPortalPathway().size() - 1).getLocation());
			}
		}
		else if(this.aiMode.equals(AiMode.CAMPING)){
			Random rand = new Random();
			
			if(rand.nextBoolean()){
				// look at random portal
				this.setTrueLookAngle(this.getLevelBlock().getPortal(rand.nextInt(this.getLevelBlock().getPortalCount())).getLocation());
			}
			else{
				//look at corner
				this.setTrueLookAngle(this.getLevelBlock().getHitBox().xpoints[rand.nextInt(this.getLevelBlock().getHitBox().npoints)],
									  this.getLevelBlock().getHitBox().ypoints[rand.nextInt(this.getLevelBlock().getHitBox().npoints)]);
			}
	}
		else if(this.getTargetAi() != null && this.aiMode.equals(AiMode.LOOT)){
			this.setTrueLookAngle(Maths.getDegrees(this.getLocation(), this.getTargetAi().getLocation()));
		}
		else{
			this.setTrueLookAngle(new Random().nextInt(360));
		}

	}
	
	@Override
	protected void lootTurnAction(){
		
		if(this.getLevelBlock() == this.getTargetAi().getLevelBlock() &&
		   Maths.getDistance(this.getLocation(), getTargetAi().getLocation()) <= AiData.INTERACTION_RANGE){
			
			if(this.getActionTurns() > Abilities.TURNS_TO_LOOT){
				
				this.computeWhatToLoot(this.getTargetAi());
				
				this.assignAbilities();
				this.getTargetAi().assignAbilities();
				
				this.setActionTurns(0);
				
				this.aiMode = AiMode.CAMPING;
				this.setAction("");
				
				return;
			}
			this.setActionTurns(this.getActionTurns() + 1);
		}
		else{
			// have to store ai in case the move action removes this
			Ai targetAi = this.getTargetAi();
			
			this.moveWithinRadius(targetAi.getLocation(), AiData.INTERACTION_RANGE);
			
			this.aiPathing.move(this);
			this.setAction("Loot");
			
			this.setTargetAi(targetAi);
		}

	}
	
	private void computeWhatToLoot(Lootable targetAi) {
		
		if(targetAi.getWeapon() != null && this.getWeapon().isMelee() && !targetAi.getWeapon().isMelee()){
			Weapon thisWeapon = this.getWeapon();
			
			this.setWeapon(targetAi.getWeapon());
			
			targetAi.setWeapon(thisWeapon);
		}
		
		Iterator<Item> itemIt = targetAi.getInventory().getIterator();
		
		while(itemIt.hasNext()){

			Item item = itemIt.next();
			
			if(!this.getInventory().hasItem(item)){
				this.getInventory().addItem(item);
				itemIt.remove();
			}
			else if(item instanceof GrenadeItem || item instanceof StunGrenadeItem){
				this.getInventory().addItem(item);
				itemIt.remove();
			}
			
			if(this.getInventory().isFull()){
				break;
			}
		}
		
		if(targetAi.getInventory().isEmpty()){
			this.getCommander().addLootedAi(this.getTargetAi());
		}
	}
	
	private boolean aiInRoomToLoot() {
		if(!this.getInventory().isFull())
		for(Ai ai : aiCrowd.getActors()){
			if(ai.getLevelBlock() == this.getLevelBlock() && (ai.isDead() || (this.isTargetHostile(ai) && ai.getIncapTurns() > 0)) && !this.getCommander().isAiLooted(ai) && hasStuffToLoot(ai) && combatVisualManager.isAiInSight(ai, this.getFaction())){
				return true;
			}
		}
		return false;
	}

	protected void interactWithDeadAi() {
		// Loot
		if(!this.getInventory().isFull()) {
			for(Ai ai : aiCrowd.getActors()){
				if(ai.getLevelBlock() == this.getLevelBlock() && (ai.isDead() || (this.isTargetHostile(ai) && ai.getIncapTurns() > 0)) && !this.getCommander().isAiLooted(ai) && hasStuffToLoot(ai) && combatVisualManager.isAiInSight(ai, this.getFaction())){
					this.aiMode = AiMode.LOOT;
					this.setAction("Loot");
					this.loot(ai);
					
					this.setTrueLookAngle(ai.getLocation());
					
					return;
				}
			}
			// Stash Loot
			if(this.hasAbility(Abilities.STASH_SEARCH)){
				this.computeWhatToLoot(this.stashSearch());
			}
		}
		
		// Investigate dead bodies
		for(Ai ai : aiCrowd.getActors()){
			if(ai.getLevelBlock() == this.getLevelBlock() && ai.isDead() && !this.getCommander().isInvestigated(ai) && combatVisualManager.isAiInSight(ai, this.getFaction())) {
				this.getCommander().addInvestigatedAi(ai);
				
				// Chance to recognise killer
				AiDeathReport deathReport = ai.getDeathReport();
				
				// Don't investigate deaths we caused
				if(deathReport.killer == null || (deathReport.killer.getFaction().equals(this.getFaction()) && (!this.getFaction().equals(AiGenerator.LONER) || deathReport.killer == this)))
					return;
				if(turnProcess.getTurnCount() - deathReport.timeOfDeath < 20 && deathReport.weapon.getName().equals(deathReport.killer.getWeapon().getName()) &&
				  (combatVisualManager.isAiInSight(deathReport.killer, this.getFaction()) || new Random().nextInt(10) < 7)) {
					this.getCommander().addSuspectedAi(deathReport.killer, deathReport.killed);
				}
			}
		}
		
	}
	
	@Override
	public Lootable stashSearch() {
		Lootable loot = this.getLevelBlock().getStash(this.getLocation());
		return loot;
	}
	
	private boolean hasStuffToLoot(Ai targetAi){
		
		if(this.getWeapon().isMelee() && !targetAi.getWeapon().isMelee()){
			return true;
		}
		
		for(int i = 0; i < targetAi.getInventory().getItemCount(); i++){
			
			Item item = targetAi.getInventory().getItemAt(i);
			
			if(!this.getInventory().hasItem(item)){
				return true;
			}
			else if(item instanceof GrenadeItem || item instanceof StunGrenadeItem){
				return true;
			}
		}
		
		return false;
	}

	protected boolean isBeingTargeted() {
		for(Ai ai : aiCrowd.getActors()){
			if(!ai.getFaction().equals(this.getFaction()) && 
			   (ai.getTargetAi() != null && ai.getTargetAi().getFaction().equals(this.getFaction()) && ( ai.getAction().equals(AiCombatActions.SHOOTING) || ai.getAction().equals(AiCombatActions.AIMING))) &&
			   combatVisualManager.isAiInSight(ai, this.getFaction())){
				return true;
			}
		}
		return false;
	}

	public void waitForTurns(int count) {
		this.turnCounter = count;
		this.doingJob = false;
		this.aiMode = AiMode.CAMPING;
	}
	
	public boolean isListeningToCommand(){
		return this.doingJob;
	}
	
	@Override
	public boolean isTargetHostile(Ai target){
		if(!target.isDead() && !this.getFaction().equals(target.getFaction()) && !this.getCommander().isAlliedWith(target.getFaction()) && !this.getCommander().isAiFriend(target)){
			return true;
		}
		return false;
	}
	
	@Override
	public void setLevelBlock(LevelBlock residentBlock) {
		super.setLevelBlock(residentBlock);
		
		// Remove smart nodes on room change
		if(this.aiNode != null && !this.aiNode.hasPriority(this.getName())){
			this.aiNode.releaseNode(this);
			this.aiNode = null;
		}
	}
	
	@Override
	public void setDead(Ai killer, boolean dead) {
		super.setDead(killer, dead);
		if(this.aiNode != null && this.aiNode.behaviours.contains(AiNode.COMMAND_ON_DEATH)) {
			this.aiNode.runDeathCommands();
		}
	}
	
	@Override
	public void setDead(boolean dead) {
		super.setDead(dead);
		if(this.aiNode != null && this.aiNode.behaviours.contains(AiNode.COMMAND_ON_DEATH)) {
			this.aiNode.runDeathCommands();
		}
	}
	
	public boolean isBlockPlayerConvo() {
		return blockPlayerConvo;
	}

	public void setBlockPlayerConvo(boolean blockPlayerConvo) {
		this.blockPlayerConvo = blockPlayerConvo;
	}
	
	public void respondToMessage(Topic message, Ai speaker) {
		switch(message){
			// Engage ai
			case ATTACK:
				this.aiMode = AiMode.ENGAGING;
				this.aim(speaker);
				this.aiNode.freeThinkTurns = 6;
			break;
			// Take money from ai
			case PAY:
			break;
			// Take items from ai
			case GIVE_ITEMS:
				this.aiMode = AiMode.LOOT;
				this.setAction("Loot");
				
				this.loot(speaker);
				
				int stunTurns = (int)Math.ceil((Maths.getDistance(this.getLocation(), speaker.getLocation()) / this.getMoveDistance())) + 6;
				
				speaker.setIncapTurns(stunTurns);
				this.aiNode.freeThinkTurns = stunTurns + 1;
			break;
			// Open trade with ai
			case TRADE:
			break;
			default:
			break;
		}
	}
	
	public boolean willJoinPlayer(@SuppressWarnings("unused") Ai player){
		return false;
	}

	public AiNode getThinkingNode() {
		return aiNode;
	}

	public void setThinkingNode(AiNode thinkingNode) {
		this.aiNode = thinkingNode;
	}

	@Override
	public void purge() {
		super.purge();
		this.chaseAi = null;
	}
	
	@Override
	public boolean isSkippingTurns() {
		return true;
	}
	
	public static class AiNode{
		
		public static final String PRI_STORY = "STORY";
		public static final String PRI_HIGHWAYMAN = "HIGHWAYMAN";
		public static final String PRI_SHOPKEEP = "SHOP";
		public static final String PRI_DEFENDER = "DEFENDER";
		private static final String FOLLOW_PLAYER = "FOLLOW_PLAYER";
		private static final String COMMAND_ON_DEATH = "COMMAND_ON_DEATH";
		private static final String STAY_IN_ROOM = "STAY_IN_ROOM";
		
		private double[] location;
		private double angle;
		private Set<String> useableFactions;
		private String[] disabler;
		
		// Whether this node describes a behaviour that requires the ai to be at the location
		// you can create a node which allows the to sell stuff but they don't have to be at the node
		private boolean mustBeOccupied;
		
		private Set<String> talkMapTags;
		
		private int freeThinkTurns;
		private int maxUsers;
		private HashSet<ThinkingAi> users;
		private HashSet<String> priorities;
		private ArrayList<String> behaviours;
		
		private LevelBlock startBlock;
		
		// whether this node will think for the ai
		// can be used to make nodes purely for dialogue
		private boolean thinks;

		@SuppressWarnings("unused")
		private TurnProcess turnProcess;
		private MessageBox messageBox;
		private AiCrowd aiCrowd;
		private MissionManager missionManager;

		public AiNode(AiCrowd aiCrowd, MessageBox messageBox, TurnProcess turnProcess, MissionManager missionManager, double x, double y){
			this.location = new double[]{x,y};
			
			angle = 361;
			
			useableFactions = new HashSet<String>();
			
			disabler = new String[0];
			
			mustBeOccupied = false;
			
			talkMapTags = new HashSet<String>();
			
			freeThinkTurns = 0;
			
			thinks = false;
			
			maxUsers = 0;
			
			users = new HashSet<ThinkingAi>();
			priorities = new HashSet<String>();
			behaviours = new ArrayList<>();
			
			this.aiCrowd = aiCrowd;
			this.turnProcess = turnProcess;
			this.messageBox = messageBox;
			this.missionManager = missionManager;
		}
		
		public void runDeathCommands() {
			for(int i = 0; i < this.behaviours.size(); i++) {
				if(this.behaviours.get(i).startsWith("#"))
					this.missionManager.runCommand(this.behaviours.get(i).substring(1));
			}
		}

		public boolean grabNode(ThinkingAi ai){
			if(users.size() < maxUsers || maxUsers == 0){
				this.users.add(ai);
				return true;
			}
			return false;
		}
		
		public void releaseNode(ThinkingAi ai){
			this.users.remove(ai);
		}
		
		public void think(ThinkingAi ai){
			
			if(this.behaviours.contains(STAY_IN_ROOM) && this.startBlock == null)
				this.startBlock = ai.getLevelBlock();
				
			if(!thinks || this.behaviours.size() > 0){
				if(!useDialogue(ai)){
					
					if(this.behaviours.contains(FOLLOW_PLAYER) && ai.levelManager.getBlock(ai.getMoveLocation()) != ai.combatMembersManager.getCurrentAi().getLevelBlock()){
						try {
							ai.setMoveLocation(ai.levelManager.randomInPosition(ai.combatMembersManager.getCurrentAi().getLevelBlock()));
						} catch (PathNotFoundException e) {
							// can't move to target
						}
					}
					else if(this.behaviours.contains(STAY_IN_ROOM) && ai.levelManager.getBlock(ai.getMoveLocation()) != this.startBlock) {
						try {
							ai.setMoveLocation(ai.levelManager.randomInPosition(startBlock));
						} catch (PathNotFoundException e) {
							// can't move to target
						}
					}
					else if(!this.behaviours.contains(STAY_IN_ROOM) && !this.behaviours.contains(FOLLOW_PLAYER)){
						if(ai.doingJob) {
							ai.job = ai.getCommander().getJob(ai);
							if(ai.getLevelBlock() == ai.job.getJobBlock())
								ai.job.tickJob();
						}
					}

					ai.gatherEnvironmentData();
					
				}
				return;
			}
				
			if(checkForDisable(ai)){
				return;
			}
			
			// Allow ai to operate if being aimed at
			if(ai.isBeingTargeted()){
				freeThinkTurns = 3;
			}
			
			if(freeThinkTurns > 0){
				freeThinkTurns--;
				ai.gatherEnvironmentData();
				return;
			}
			
			if(!this.mustBeOccupied || Maths.getDistance(ai.getLocation(), this.location) == 0){
			
				if(hasAngle())
					ai.setTrueLookAngle(this.angle);
				else 
					ai.setTrueLookAngle(new Random().nextInt(360));
			
			}
			else if(Maths.getDistance(ai.getLocation(), this.location) != 0){
				// move to node
				try {
					ai.setMoveLocation(this.location.clone());
					ai.setTrueLookAngle(Maths.getDegrees(ai.getLocation(), ai.getMoveLocation()));
					ai.commitThoughts();
					return;
				}
				catch (PathNotFoundException e) {
					// idle
				}
			}

			if(!useDialogue(ai))
				ai.endTurn();
		}

		private boolean useDialogue(ThinkingAi ai) {
			if(hasDialogue()){
				
				Dialogue dialogue = getInitiatorDialogue();
				
				
				Ai talkTarget = null;
				
				// find a player unit in sight
				for(Ai actor : aiCrowd.getActors()){
					if(actor.getFaction().equals(AiGenerator.PLAYER) && !actor.isDead() && !(actor instanceof VehicleAi) && dialogue.canTalkTo(actor) && CombatVisualManager.isAiInSight(ai, actor)){
						talkTarget = actor;
						break;
					}
				}
				
				if(talkTarget == null){
					return false;
				}
				
				dialogue.talkedTo(talkTarget);
				
				messageBox.setConversation(talkTarget, ai, dialogue);
				messageBox.setVisible(true);
				return true;
			}
			return false;
		}

		private boolean checkForDisable(ThinkingAi ai) {
			
			for(int i = 0; i < this.disabler.length; i++){
			
				String disabler = this.disabler[i];
				
				boolean inverse = true;
				
				if(disabler.startsWith("!")){
					inverse = false;
					disabler = disabler.substring(1);
				}
				
				switch(disabler){
					case "WHITE_VISTA_PRESENT":
						if(checkForFactionInBlock(ai.getLevelBlock(), AiGenerator.WHITE_VISTA) && inverse){
							
//							if(ai.doingJob) {
//								ai.job = ai.getCommander().getJob(ai);
//								if(ai.getLevelBlock() == ai.job.getJobBlock())
//									ai.job.tickJob();
//							}
							
							ai.gatherEnvironmentData();
							return true;
						}
						break;
							
					case "BANDITS_PRESENT":
						if(checkForFactionInBlock(ai.getLevelBlock(), AiGenerator.BANDITS) && inverse){
							
//							if(ai.doingJob) {
//								ai.job = ai.getCommander().getJob(ai);
//								if(ai.getLevelBlock() == ai.job.getJobBlock())
//									ai.job.tickJob();
//							}
							
							ai.gatherEnvironmentData();
							return true;
						}
						break;
							
					case "PLAYER_PRESENT":
						if(checkForFactionInBlock(ai.getLevelBlock(), AiGenerator.PLAYER) && inverse){
							
//							if(ai.doingJob) {
//								ai.job = ai.getCommander().getJob(ai);
//								if(ai.getLevelBlock() == ai.job.getJobBlock())
//									ai.job.tickJob();
//							}
							
							ai.gatherEnvironmentData();
							return true;
						}
						break;
							
					case "LONER_PRESENT":
						if(checkForFactionInBlock(ai.getLevelBlock(), AiGenerator.LONER) && inverse){
							
//							if(ai.doingJob) {
//								ai.job = ai.getCommander().getJob(ai);
//								if(ai.getLevelBlock() == ai.job.getJobBlock())
//									ai.job.tickJob();
//							}
							
							ai.gatherEnvironmentData();
							return true;
						}
						break;
				}
			
			}
			
			return false;
		}

		private boolean checkForFactionInBlock(LevelBlock levelBlock, String faction) {
			for(int i = 0; i < aiCrowd.getActorCount(); i++){
				Ai ai = aiCrowd.getActor(i);
				if(!ai.isDead() && ai.getFaction().equals(faction) && ai.getLevelBlock() == levelBlock){
					return true;
				}
			}
			return false;
		}

		public double[] getLocation() {
			return location;
		}

		public boolean hasAngle(){
			return angle != 361;
		}
		
		public double getAngle() {
			return angle;
		}

		public boolean canUse(String faction) {
			return this.useableFactions.contains(faction);
		}

		public void setAngle(double angle) {
			this.angle = angle;
		}

		public void addUsableFaction(String faction, String mapOwner){
			
			// When loner is map owner: loner/white vista/bandits work
			if(mapOwner.equals(AiGenerator.LONER)){
				
				if(faction.equals("INVADER") || faction.equals("OWNER")){
					faction = "";
				}
				
			}
			// When wv/bandits are owner: owner/invader/loner work
			else{
				
				if(faction.equals(AiGenerator.WHITE_VISTA) || faction.equals(AiGenerator.BANDITS)){
					faction = "";
				}
				else if(faction.equals("OWNER")){
					faction = mapOwner;
				}
				else if(faction.equals("INVADER") && mapOwner.equals(AiGenerator.BANDITS)){
					faction = AiGenerator.WHITE_VISTA;
				}
				else if(faction.equals("INVADER") && mapOwner.equals(AiGenerator.WHITE_VISTA)){
					faction = AiGenerator.BANDITS;
				}
				
			}
			
			this.useableFactions.add(faction);
		}

		public boolean mustBeOccupied() {
			return mustBeOccupied;
		}

		public void setMustBeOccupied(boolean mustBeOccupied) {
			this.mustBeOccupied = mustBeOccupied;
		}
		
		public boolean hasDialogue(){
			for(String talkMap : talkMapTags){
				if(missionManager.getTalkMap(talkMap).getDialogue().isInitiator())
					return true;
			}
			return false;
		}
		
		public Dialogue getInitiatorDialogue(){
			for(String talkMap : talkMapTags){
				if(missionManager.getTalkMap(talkMap).getDialogue().isInitiator())
					return missionManager.getTalkMap(talkMap).getDialogue();
			}
			return null;
		}

		public void setDisabler(String[] disabler){
			this.disabler = disabler;
		}

		public void finish(ThinkingAi ai) {
			if(this.thinks){
				ai.endTurn();
			}
			else{
				
//				if(ai.doingJob) {
//					ai.job = ai.getCommander().getJob(ai);
//					if(ai.getLevelBlock() == ai.job.getJobBlock())
//						ai.job.tickJob();
//				}
				
				ai.gatherEnvironmentData();
			}
		}

		public void setThinks(boolean hasThoughts) {
			this.thinks = hasThoughts;
		}

//		public List<Dialogue> getTopics() {
//			List<Dialogue> topics = new ArrayList<>();
//			
//			for(String topicTag : this.talkMapTags){
//				topics.add(missionManager.getTalkMap(topicTag).getDialogue());
//			}
//			
//			return topics;
//		}
		
		public Dialogue getTopic() {
			
			for(String topicTag : this.talkMapTags){
				return missionManager.getTalkMap(topicTag).getDialogue();
			}
			
			return null;
		}

		public boolean hasTopics(){
			return this.talkMapTags.size() > 0;
		}

		public int getMaxUsers() {
			return maxUsers;
		}

		public void setMaxUsers(int maxUsers) {
			this.maxUsers = maxUsers;
		}

		public boolean isFull() {
			if(this.users.size() < this.maxUsers)
				return true;
			return false;
		}
		
		public void addPriorities(List<String> priorities){
			for(int i = 0; i < priorities.size(); i++){
				this.priorities.add(priorities.get(i));
			}
		}
		
		public boolean hasPriority(String priority){
			return this.priorities.contains(priority);
		}

		public void subscribeToTalkMaps(String[] talkMaps) {
			for(String talkMap : talkMaps){
				this.talkMapTags.add(talkMap);
			}
		}

		public void addBehaviours(ArrayList<String> behaviours) {
			this.behaviours.addAll(behaviours);
		}
		
	}


	public AiNode getAiNode() {
		return this.aiNode;
	}

	public void setAiNode(AiNode aiNode) {
		
		// Only release a node if it isn't personalised
		if(this.aiNode != null && this.aiNode.hasPriority(this.getName()))
			return;
			
		this.aiNode = aiNode;
	}

	public boolean stationaryNode() {
		return this.aiNode.mustBeOccupied;
	}

	public double getAggression() {
		return this.emotionManager.getAggression();
	}

	public void modifyAggression(double aggression) {
		this.emotionManager.modifyAggression(aggression);
	}

	public void setBaseAggression(int aggression) {
		this.emotionManager.setBaseAggression(aggression);
	}

	public TeamsCommander getCommander() {
		return combatMembersManager.getCommander(this.getFaction());
	}

	protected AiJob getJob() {
		return this.job;
	}
}
