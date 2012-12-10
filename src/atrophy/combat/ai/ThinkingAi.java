/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.combatEffects.MobileInvisibility;
import atrophy.combat.combatEffects.SpeedBoost;
import atrophy.combat.combatEffects.StationaryInvisibility;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.MessageBox.Dialogue;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Item;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.Weapon;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.Portal;
import atrophy.combat.levelAssets.Grenade;
import atrophy.combat.mechanics.Abilities;
import atrophy.combat.mechanics.TurnProcess;

// TODO: Auto-generated Javadoc
/**
 * The Class ThinkingAi.
 */
public class ThinkingAi extends Ai{
	
	// Aggression values
	/**
	 * The Constant PASSIVE.
	 */
	public static final int PASSIVE = -2;
	
	/**
	 * The Constant PASSIVE_RESPOND.
	 */
	public static final int PASSIVE_RESPOND = -1;	
	
	/**
	 * The Constant PASSIVE_COMBATSCORE_DIFFERENCE.
	 */
	public static final int PASSIVE_COMBATSCORE_DIFFERENCE = 80;
	
	/**
	 * The Constant AGGRESSIVE_FIGHTER.
	 */
	public static final int AGGRESSIVE_FIGHTER = 1; 
 
 /**
  * The Constant AGGRESSIVE_FIGHTER_COMBATSCORE_DIFFERENCE.
  */
 public static final int AGGRESSIVE_FIGHTER_COMBATSCORE_DIFFERENCE = 120;
	
	/**
	 * The Constant MINDLESS_TERROR.
	 */
	public static final int MINDLESS_TERROR = 2;	
	
	/**
	 * The Constant MINDLESS_TERROR_COMBATSCORE_DIFFERENCE.
	 */
	public static final int MINDLESS_TERROR_COMBATSCORE_DIFFERENCE = 80;
	
	/**
	 * The Constant AGGRESSION_RESTORE_RATE.
	 */
	public static final double AGGRESSION_RESTORE_RATE = 0.005;
	
	/**
	 * The Constant TEAM_MEMBER_KILLED.
	 */
	public static final double TEAM_MEMBER_KILLED = +1.5;
	
	/**
	 * The Constant SHOT_AT.
	 */
	public static final double SHOT_AT = +0.8;
	
	/**
	 * The Constant AIMING_AGGRESSION.
	 */
	public static final double AIMING_AGGRESSION = +0.3;
	
	/**
	 * The Constant FAILED_INTIMIDATION.
	 */
	public static final double FAILED_INTIMIDATION = +0.2;
	
	/**
	 * The Constant SUCCESSFUL_INTIMIDATION.
	 */
	public static final double SUCCESSFUL_INTIMIDATION = -0.3;
	
	/**
	 * The Constant HIGHWAYMAN_FIGHT.
	 */
	public static final double HIGHWAYMAN_FIGHT = + 0.4;
	
	/**
	 * The thinking node.
	 */
	private AiNode aiNode;
	
	/**
	 * The ai mode.
	 */
	private String aiMode;
	
	/**
	 * The turn counter.
	 */
	private int turnCounter;
	
	/**
	 * The chase ai.
	 */
	private Ai chaseAi;
	
	/**
	 * The listening to command.
	 */
	private boolean listeningToCommand;

	/**
	 * The base aggression.
	 */
	private int baseAggression;
	
	/**
	 * The aggression.
	 */
	private double aggression;
	
	/**
	 * The block player convo.
	 */
	private boolean blockPlayerConvo;
	
	/**
	 * The aggression modified.
	 */
	private boolean aggressionModified;

	private CombatInorganicManager combatInorganicManager;
	private LevelManager levelManager;

	// set start location and name
	/**
	 * Instantiates a new thinking ai.
	 *
	 * @param name the name
	 * @param x the x
	 * @param y the y
	 * @param levelManager 
	 * @param combatInorganicManager 
	 */
	public ThinkingAi(PanningManager panningManager, CombatVisualManager combatVisualManager, TurnProcess turnProcess, FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler, AiCrowd aiCrowd, CombatMembersManager combatMembersManager, String name, double x, double y, LevelManager levelManager, CombatInorganicManager combatInorganicManager, CombatUiManager combatUiManager, LootBox lootBox){
		super(floatingIcons, mouseAbilityHandler, name,x,y, combatInorganicManager, levelManager, lootBox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd, panningManager);
		aiMode = "";
		turnCounter = 0;
		chaseAi = null;
		listeningToCommand = true;
		aggression = PASSIVE_RESPOND;
		baseAggression = PASSIVE_RESPOND;
		blockPlayerConvo = false;
		aggressionModified = false;
		this.combatMembersManager = combatMembersManager;
		this.turnProcess = turnProcess;
		this.aiCrowd = aiCrowd;
		this.combatVisualManager = combatVisualManager;
		this.combatInorganicManager = combatInorganicManager;
		this.levelManager = levelManager;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#action()
	 */
	@Override
	/**
	 * Overrides the action function of Ai to implement think().
	 */
	public void action(){
		
		// reset movement units
		this.resetMoveUnits();
		
		if(turnCounter > 0){
			turnCounter -= 1;
		}
		
		if(this.getStunnedTurns() == 0){
			think();
		}
		else{
			this.setStunnedTurns(this.getStunnedTurns() - 1);
			turnProcess.currentAiDone(true);
		}
	}
	
	/**
	 * Commit thoughts.
	 */
	private void commitThoughts(){
		resetStates();
		
		if(this.getStunnedTurns() == 0 && this.getIncapTurns() == 0){
		
			this.aiData.handleEffects(this, this.getAction());
			
			if(aiMode.equals("Loot") && this.getAction().equals("")){
				this.setAction("Loot");
			}
			
			if(Maths.getDistance(this.getLocation(), this.getMoveLocation()) > 0){
				this.aiPathing.move(this);
				
				this.setActionTurns(0);
			}
			else if(this.getTargetAi() != null && !this.aiMode.equals("Loot")&&!this.getAction().equals("Loot") && !this.getAction().equals("Looting")){
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
		
		if(this.getIncapTurns() > 0){
			this.setIncapTurns(this.getIncapTurns() - 1);
		}
		
		this.setOldAction(this.getAction());
		this.setOldActionTurns(this.getActionTurns());
		
		turnProcess.currentAiDone(true);
	}

	/**
	 * Think.
	 */
	private void think(){		
		
		if(this.aiNode != null && listeningToCommand){
			aiNode.think(this);
			return;
		}
		
		this.gatherEnvironmentData();
	}
	
	/**
	 * Gather environment data.
	 */
	protected void gatherEnvironmentData(){
		// since this is done during a turn some variables that are swept up at the end of the turn will be incorrect
		// e.g aiming at a dead target
		cleanupIntraTurnVars();

		if(this.getTargetAi() == null || this.aiMode.equals("Loot") || this.getWeapon().isMelee()){
			engageWithHostiles();
		}
		else{
			respondToEnvironmentData();
		}
	}
	
	/**
	 * Respond to environment data.
	 */
	protected void respondToEnvironmentData(){
		
		computeAiMode();
		
		if(this.aiMode.equals("Engaging")){
			this.computeWhenToFire();
			this.modifyAggression(AIMING_AGGRESSION);
		}
		else{
			this.computeLookDirection();
		}
		
		// start to reset aggression if no change occurred
		if(!aggressionModified){
			this.resetAggression(AGGRESSION_RESTORE_RATE);
		}
		
		if(this.aggression < MINDLESS_TERROR){
			blockPlayerConvo = false;
		}
		
		aggressionModified = false;
	}

	/**
	 * Computes the ai mode.
	 */
	private void computeAiMode(){
		
		try{
			
			fleeFromGrenades();
			
			// if not engaging then see if in correct room
			if(!this.aiMode.equals("Engaging") &&
			   !this.aiMode.equals("Fleeing") &&
			   !this.aiMode.equals("Loot") &&
			   !this.getAction().startsWith("Applying")){
				
				this.setSwing(0);
				
				if(this.listeningToCommand){
 					actUnderCommand();
				}
				else{
					actIgnoreCommand();
				}
			}
			else if(this.aiMode.equals("Fleeing")){ 
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
		
		// if the ai is the leader of a formation, slow down slightly to let others catch up
		if(this.getTeamObject().getTeamSize() > 1 &&
		   this.getTeamObject().getTeamFormation() != null &&
		   this.getTeamObject().getTeamFormation().isLeader(this) &&
		   this.isListeningToCommand()){
			
			this.setMoveDistance(this.getDefaultMoveDistance() - 5);
		}
		else{
			this.resetMoveDistance();
		}
		
		commitThoughts();
	}
	
	/**
	 * Try to clear path.
	 */
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
		else if(this.getTeamObject().hasAbility(Abilities.WELDING)){
			for(Ai ai : this.getTeamObject().getTeamMembers()){
				if(ai.hasAbility(Abilities.WELDING) && ai.getTargetAi() == null){
					for(int i = 0; i < this.getLevelBlock().getPortalCount(); i++){
						
						if(!this.getLevelBlock().getPortal(i).canUse() &&
						   this.getPortalPathway().contains(this.getLevelBlock().getPortal(i))){
							ai.setWeldingOpen(this.getLevelBlock().getPortal(i));
							break;
						}
					}
					break;
				}
			}
		}
		// can't unweld and no-one in team can so request it is opened 
		else if(!this.getTeamObject().hasAbility(Abilities.WELDING)){
			for(int i = 0; i < this.getLevelBlock().getPortalCount(); i++){
				
				if(!this.getLevelBlock().getPortal(i).canUse() &&
				   this.getPortalPathway().contains(this.getLevelBlock().getPortal(i))){
					// if the request to get the door open is denied
					if(!this.getTeamObject().requestDoorOpen(this.getLevelBlock().getPortal(i))){
						// create a new target location
					//	throw new PathNotFoundException(pnfe.getLevelBlock());
						this.idle();
					}
					
					break;
				}
			}
		}
	}

	/**
	 * Idle.
	 */
	private void idle() {
		this.aiMode = "Camping";
		this.setMoveLocationToSelf();
		listeningToCommand = true;
	}

	/**
	 * Act ignore command.
	 *
	 * @throws PathNotFoundException the path not found exception
	 */
	private void actIgnoreCommand() throws PathNotFoundException {
		if(this.chaseAi != null){
			if(this.aggression > 0 && (this.getTeamObject().canPursue() || this.chaseAi.getLevelBlock() == this.getLevelBlock())){
				chasetarget();
			}
			else{
				this.chaseAi = null;
			}
		}
		else if(this.aiInRoomToLoot()){
			this.lootAiInRoom();
		}
		else if(Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0 &&
		   this.turnCounter == 0){
			
			this.aiMode = "Camping";
			this.turnCounter = 6;
		}
		// do not set turnCounter == 0, otherwise it will be reset to a higher value and the ai will cycle in place
		if(this.aiMode.equals("Camping") && this.turnCounter == 1 && !this.getAction().startsWith("Applying:")){
			listeningToCommand = true;
		}
	}

	/**
	 * Fleeing action.
	 */
	private void fleeingAction() {
		if(this.turnCounter == 0){
			this.turnCounter = 6;
		}
		else if(this.turnCounter == 1){
			this.listeningToCommand = true;
		}
		
		if(Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0){
			this.aiMode = "Camping";
		}
	}

	/**
	 * Chasetarget.
	 *
	 * @throws PathNotFoundException the path not found exception
	 */
	private void chasetarget() throws PathNotFoundException{
		// call for help if strong enemy
		this.getTeamObject().requestHelp(this.chaseAi.getLevelBlock());
		// go invisible then chase
		if(this.hasAbility(Abilities.STEALTH2) &&
		   !this.hasActiveEffect(MobileInvisibility.NAME)){
			this.addEffect(new MobileInvisibility(this.getSkillLevel(Abilities.STEALTH2)));
		}
		// go fast then chase
		else if(this.hasAbility(Abilities.SPEED_BOOSTER) &&
			    !this.hasActiveEffect(SpeedBoost.NAME)){
			this.addEffect(new SpeedBoost(this.getSkillLevel(Abilities.SPEED_BOOSTER)));
		}
		else{
			this.setMoveLocation(this.chaseAi.getLocation());
			this.chaseAi = null;
		}
	}

	/**
	 * Move towards nearest region.
	 *
	 * @param regions the regions
	 * @throws PathNotFoundException the path not found exception
	 */
	public void moveTowardsNearestRegion(ArrayList<Polygon> regions) throws PathNotFoundException{
		this.getLevelBlock().moveTowardsNearestRegion(this, regions);
	}
	
	/**
	 * Move towards random region.
	 *
	 * @param regions the regions
	 * @return the polygon
	 * @throws PathNotFoundException the path not found exception
	 */
	public Polygon moveTowardsRandomRegion(ArrayList<Polygon> regions) throws PathNotFoundException{
		return this.getLevelBlock().moveTowardsRandomRegion(this, regions);
	}

	/**
	 * Flee from grenades.
	 *
	 * @throws PathNotFoundException the path not found exception
	 */
	private void fleeFromGrenades() throws PathNotFoundException{
		
		if(!this.aiMode.equals("Fleeing")){
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
	
	/**
	 * Flee.
	 *
	 * @throws PathNotFoundException the path not found exception
	 */
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
			this.aiMode = "Fleeing";
			this.listeningToCommand = false;
			this.chaseAi = null;
			this.setTargetAi(null);
			this.setMoveLocation(levelManager.randomInPosition(fleePortal.linksTo(this.getLevelBlock())));
		}
		else{
			// all doors closed, throw path not found exception
			throw new PathNotFoundException(this.getLevelBlock());
		}
	}
	
	/**
	 * Flee check for enemy.
	 *
	 * @throws PathNotFoundException the path not found exception
	 */
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
			this.aiMode = "Fleeing";
			this.listeningToCommand = false;
			this.chaseAi = null;
			this.setTargetAi(null);
			this.setMoveLocation(levelManager.randomInPosition(fleePortal.linksTo(this.getLevelBlock())));
		}
		else{
			// all doors closed or ai blocking path, throw path not found exception
			throw new PathNotFoundException(this.getLevelBlock());
		}
	}
	
	/**
	 * Closest distance to point.
	 *
	 * @param units the units
	 * @param location the location
	 * @return the double
	 */
	private double closestDistanceToPoint(ArrayList<Ai> units, double[] location){
		
		Double distance = null;
		
		for(Ai ai : units){
			if(distance == null || Maths.getDistance(ai.getLocation(), location) < distance){
				distance = Maths.getDistance(ai.getLocation(), location);
			}
		}
		
		return distance;
	}
	
	/**
	 * Cleanup intra turn vars.
	 */
	protected void cleanupIntraTurnVars(){
		// chase an ai, ignore commander
		if(this.getTargetAi() == null && this.chaseAi != null){
			this.aiMode = "Patrolling";
			listeningToCommand = false;
			this.setSwing(0);
		}
		// stops units stacking on corpse
		if(this.chaseAi != null && this.chaseAi.isDead()){
			this.chaseAi = null;
			listeningToCommand = true;
		}
		
		if(this.getAction().equals("Loot") && this.getTeamObject().isAiLooted(this.getTargetAi())){
			this.removeOrdersWithoutUpdate(mouseAbilityHandler);
			this.aiMode = "";
		}
		
		// stops ai locking up to stare at corpse
		if(this.getTargetAi() != null && this.getTargetAi().isDead()){
			this.setTargetAi(null);
			
			// if else to stop ai running back into a room they ran from e.g grenade avoidance
			if(this.turnCounter > 0){
				this.aiMode = "Camping";
				this.listeningToCommand = false;
			}
			else{
				this.aiMode = "Patrolling";
				this.listeningToCommand = true;
			}
		}
	}
	
	/**
	 * Engage with hostiles.
	 */
	protected void engageWithHostiles(){

		int enemyCount = 0;
		
		Ai target = null;
		
		// Shuffle the ai so that one hated individual will not get targeted over others with groups of ai
		ArrayList<Ai> shuffledAi = aiCrowd.getShuffledAi();
		
		for(int i = 0; i < shuffledAi.size(); i++){
			
			// determine if target is hostile and if it is visible by the team
			if(canBeEngaged(shuffledAi.get(i))){
				
				// Prioritise hatedAi or ai aiming at ai
				if(this.getTeamObject().isAiHated(shuffledAi.get(i)) || shuffledAi.get(i).getTargetAi() == this){
					target = shuffledAi.get(i);
					break;
				}
				
			    // find closest target
			    if(this.getTargetAi() == null || Maths.getDistance(this.getLocation(), shuffledAi.get(i).getLocation()) <
						  						 Maths.getDistance(this.getLocation(), this.getTargetAi().getLocation())){

				   target = shuffledAi.get(i);
				}
			   
			}
		}
		
		// Combat score of enemies in room and closest target has been established
		if(target != null){
			enemyCount = combatMembersManager.getFactionStrength(target.getFaction(), this.getLevelBlock());
			this.emotionEngageReaction(enemyCount, target);
			
			// report enemies to commander
			// only speak if the area is not already reported
			this.getTeamObject().reportUnits(enemyCount,this.getLevelBlock());
		}
		else{
			
			this.lootAiInRoom();
			
			respondToEnvironmentData();
			
			// report enemies to commander
			// only speak if the area is not already reported
			this.getTeamObject().reportUnits(enemyCount,this.getLevelBlock());
		}
	}
	
	/**
	 * Can be engaged.
	 *
	 * @param ai the ai
	 * @return true, if successful
	 */
	protected boolean canBeEngaged(Ai ai) {
		if(this.isTargetHostile(ai) &&
		   ai.getLevelBlock() == this.getLevelBlock() &&
		   combatVisualManager.isAiInSight(ai, this.getFaction())){
			return true;
		}
		return false;
	}

	/**
	 * Emotion engage reaction.
	 *
	 * @param enemyCount the enemy count
	 * @param target the target
	 */
	protected void emotionEngageReaction(int enemyCount, Ai target) {
		
		// friendly count is mainly made up of what the individual's strength is
		// if combat is initiated the team may easily win but each ai wants to live
		int friendlyCount = (int)((combatMembersManager.getFactionStrength(this.getFaction(), this.getLevelBlock()) - this.getCombatScore()) / (float)1.5) + this.getCombatScore();
		
		reactToCloseEnemy(target);
		
		if(aggression > 0){
			aggressiveEngageReaction(friendlyCount,enemyCount,target);
		}
		else if(aggression < 0){
			
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

	/**
	 * React to close enemy.
	 *
	 * @param target the target
	 */
	protected void reactToCloseEnemy(Ai target) {
		
		if(this.getIncapTurns() == 0 && target.getIncapTurns() == 0){
			double distance = Maths.getDistance(this.getLocation(), target.getLocation());
			
			if(distance < 140){
				if(this.aggression < 0){
					this.modifyAggression(-0.05);
				}
				else{
					this.modifyAggression(0.05);
				}
			}
			else if(distance < 100){
				if(this.aggression < 0){
					this.modifyAggression(-0.1);
				}
				else{
					this.modifyAggression(0.1);
				}
			}
			// melee range
			else if(distance <= 60){
				if(this.aggression < 0){
					if(target.getWeapon().isMelee()){
						this.modifyAggression(-0.6);
					}
					else{
						this.modifyAggression(-0.3);
					}
				}
				else{
					if(target.getWeapon().isMelee()){
						this.modifyAggression(+0.6);
					}
					else{
						this.modifyAggression(+0.3);
					}
				}
			}
		}
		
	}

	/**
	 * Passive engage reaction.
	 *
	 * @param friendlyCount the friendly count
	 * @param enemyCount the enemy count
	 * @param target the target
	 */
	protected void passiveEngageReaction(int friendlyCount, int enemyCount, Ai target) {
		// if being aimed at then engage
		if(this.isBeingTargeted() || this.getTeamObject().isAiHated(target) && this.aggression > PASSIVE){
			// if fight is possible then engage
			if(friendlyCount >= enemyCount){
				this.aiMode = "Engaging";
				this.aim(target);
				this.modifyAggression(AIMING_AGGRESSION);
			}
			// if a a minor difference in combat ability then call help
			else if(enemyCount - friendlyCount < getCombatScoreThreshold() && this.getTeamObject().getTeamSizeInRoom(this.getLevelBlock()) < this.getTeamObject().getTeamSize()){
				this.getTeamObject().requestHelp(this.getLevelBlock());
				this.aiMode = "Engaging";
				this.aim(target);
				this.modifyAggression(AIMING_AGGRESSION);
			}
			// if more than minor difference and no grenades in room and this isn't a room the ai is defending
			else if(this.hasAbility(Abilities.GRENADETHROWER) && this.getLevelBlock() != this.getTeamObject().getLevelBlock() &&
					   !combatInorganicManager.isGrenadeInRoom(this.getLevelBlock()) ){
				
				this.throwGrenade(target.getLocation()[0], target.getLocation()[1]);
			}
			// low chance of winning, run
			else{
				getANewRoom();
//				try {
					// go invisible then flee
					if(this.hasAbility(Abilities.STEALTH2) &&
					   !this.hasActiveEffect(MobileInvisibility.NAME)){
						this.addEffect(new MobileInvisibility(this.getSkillLevel(Abilities.STEALTH2)));
						return;
					}
					// go fast then flee
					else if(this.hasAbility(Abilities.SPEED_BOOSTER) &&
						    !this.hasActiveEffect(SpeedBoost.NAME)){
						this.addEffect(new SpeedBoost(this.getSkillLevel(Abilities.SPEED_BOOSTER)));
						return;
					}
//					this.fleeCheckForEnemy();
//				} 
//				catch (PathNotFoundException pnfe) {
//					// can't flee so stay and engage
//					this.aiMode = "Engaging";
//					this.aim(target);
//					return;
//				}
			}
		}
		else{
			if(friendlyCount < enemyCount){
				getANewRoom();
				try {
					this.fleeCheckForEnemy();
				} 
				catch (PathNotFoundException pnfe) {
					// Act as normal
				}
			}
		}
	}
	
	/**
	 * Gets the a new room.
	 *
	 * @return the a new room
	 */
	protected void getANewRoom(){
		this.getTeamObject().newRoom();
	}

	/**
	 * Aggressive engage reaction.
	 *
	 * @param friendlyCount the friendly count
	 * @param enemyCount the enemy count
	 * @param target the target
	 */
	protected void aggressiveEngageReaction(int friendlyCount, int enemyCount, Ai target) {
		
		// if fight is possible then engage
		if(friendlyCount >= enemyCount || aggression >= MINDLESS_TERROR){
			this.aiMode = "Engaging";
			this.aim(target);
		}
		// if a a minor difference in combat ability then call help or shank if using melee
		else if(enemyCount - friendlyCount < this.getCombatScoreThreshold() && ( ( this.getWeapon().isMelee() && this.getWeapon().isInRange(this, target) ) ||
				                                                                this.getTeamObject().getTeamSizeInRoom(this.getLevelBlock()) < this.getTeamObject().getTeamSize())){
			this.getTeamObject().requestHelp(this.getLevelBlock());
			this.aiMode = "Engaging";
			this.aim(target);
		}
		// if more than minor difference and no grenades in room and this isn't a room the ai is defending
		else if(this.hasAbility(Abilities.GRENADETHROWER) && this.getLevelBlock() != this.getTeamObject().getLevelBlock() &&
			    !combatInorganicManager.isGrenadeInRoom(this.getLevelBlock()) ){
			
			this.throwGrenade(target.getLocation()[0], target.getLocation()[1]);
		}
		// low chance of winning
		// engage if being targeted
		else if(this.isBeingTargeted()){
			this.aiMode = "Engaging";
			this.aim(target);
		}
		else{
			// Become more passive
			this.modifyAggression(-0.1);
		}
	}
	
	

	/**
	 * Gets the combat score threshold.
	 *
	 * @return the combat score threshold
	 */
	protected int getCombatScoreThreshold() {
		int threshold = 0;
		switch((int)Math.floor(this.aggression)){
			case PASSIVE:
				threshold = 0;
			break;
			case PASSIVE_RESPOND:
			case 0:
				threshold = PASSIVE_COMBATSCORE_DIFFERENCE;
			break;
			case AGGRESSIVE_FIGHTER:
				threshold = AGGRESSIVE_FIGHTER_COMBATSCORE_DIFFERENCE;
			break;
			case MINDLESS_TERROR:
				threshold = MINDLESS_TERROR_COMBATSCORE_DIFFERENCE;
			break;
		}
		return threshold;
	}

	/**
	 * Act under command.
	 *
	 * @throws PathNotFoundException the path not found exception
	 */
	private void actUnderCommand() throws PathNotFoundException{

		this.getTeamObject().joinFormation(this);

		if(this.getLevelBlock() == this.getTeamObject().getLevelBlock()){
			this.aiMode = "Camping";
			
			if(this.getTeamObject().getTeamFormation() != null &&
			   this.getTeamObject().getTeamFormation().isInFormation(this) &&
			   this.aiMode.equals(this.getTeamObject().getTeamFormation().getFormationType())){
				
				this.aiMode = "Camping";
				this.setMoveLocation(this.getTeamObject().getTeamFormation().getLocation(this));
			}
			else if(this.getTeamObject().getTeamFormation() == null && this.getLevelBlock().isInCover(this.getMoveLocation())){
				this.aiMode = "Camping";
			}
			else{
				this.aiMode = "Camping";
				
				if(this.getLevelBlock().getStealthRegion().size() > 0){
					this.moveTowardsNearestRegion(this.getLevelBlock().getStealthRegion());
				}
				else{
					this.moveTowardsNearestRegion(this.getLevelBlock().getCover());
				}
			}
			
			// if can weld then weld instead of camping
			if(this.getAbilities().contains(Abilities.WELDING) &&
			   this.getTeamObject().canUse(Abilities.WELDING)){
				this.setWeldingShut(this.getTeamObject().getBlockedPortal());
				
				// if not welding, because no doors to weld shut, try to open some
				if(!this.getAction().contains("Weld")){
					this.setWeldingOpen(this.getTeamObject().getOpenPortal());
				}
			}
			else if(this.getAbilities().contains(Abilities.XRAY_SCAN) &&
					this.getWeapon().hasFullAmmo() &&
					Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0){
				this.xrayScan();
			}
			// check if has full ammo or abilities will stop reloading
			else if(this.getAbilities().contains(Abilities.STEALTH1) &&
					!this.hasActiveEffect(StationaryInvisibility.NAME) &&
					Maths.getDistance(this.getLocation(), this.getMoveLocation()) == 0){
				this.addEffect(new StationaryInvisibility(this.getSkillLevel(Abilities.STEALTH1)));
			}
		}
		else{
			if(this.getTeamObject().getTeamFormation() != null &&
			   this.getTeamObject().getTeamFormation().isInFormation(this) &&
			   !this.getTeamObject().getTeamFormation().isLeader(this) &&
			   this.aiMode.equals(this.getTeamObject().getTeamFormation().getFormationType())){
				
				this.aiMode = "Patrolling";
				this.setMoveLocation(this.getTeamObject().getTeamFormation().getLocation(this));
			}
			else{
				this.aiMode = "Patrolling";
				
				// if not moving to room then move to room
				if(levelManager.getBlock(this.getMoveLocation()) != this.getTeamObject().getLevelBlock()){
					this.setMoveLocation(levelManager.randomInPosition(this.getTeamObject().getLevelBlock()), this.getTeamObject().getRoomsToAvoid());
				}
			}
			
		}
	}

	/**
	 * Computes the when to fire.
	 */
	protected void computeWhenToFire(){
		   
		if(this.getSwing() > 0 &&
		    // fire if 60% chance to hit
		   (accuracyForAggression() ||
		    this.getSwing() == this.getWeapon().getMaxSwing() ||
		    // or fire asap if the enemy has a good shot
		    this.getTargetAi().getSwing() * Weapon.SWING_BONUS + this.getTargetAi().getWeapon().getAccuracy() > 60)){
			
			this.setAction(AiCombatActions.SHOOTING);
		}
	}
	
	/**
	 * Accuracy for aggression.
	 *
	 * @return true, if successful
	 */
	private boolean accuracyForAggression(){
		if(Math.abs(aggression) > 1 && this.getSwing() * Weapon.SWING_BONUS + this.getWeapon().getAccuracy() > 60 * this.aggression){
			return true;
		}
		else if(this.getSwing() * Weapon.SWING_BONUS + this.getWeapon().getAccuracy() > 50){
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#aim(atrophy.combat.ai.Ai)
	 */
	public void aim(Ai ai){
		
		this.setSwing(0);
		
		this.setMoveLocationToSelf();
		
		// remove portal pathway
		this.deletePortalPathway();
		
		//System.out.println(this.getName() + " I'm aiming at "+ ai.getName() +"!");
		
		this.setTargetAi(ai);
		chaseAi = ai;
		this.setAction(AiCombatActions.AIMING);
		
		// if in range then increase swing by 1
		if(Maths.getDistance(this.getLocation(), ai.getLocation()) <= this.getWeapon().getRange()){
			this.setSwing(1);
		}
	}
	
	/**
	 * Computes the look direction.
	 */
	protected void computeLookDirection(){
		
		if(this.aiMode.equals("Patrolling")){
			
			// if there isn't a formation or this is not in it or this is the leader of it
			if(this.getTeamObject().getTeamFormation() == null ||
					(
							!this.getTeamObject().getTeamFormation().isInFormation(this) ||
							this.getTeamObject().getTeamFormation().isLeader(this)) ||
							!this.aiMode.equals(this.getTeamObject().getTeamFormation().getFormationType())
					){
				
				// then look towards portal or look towards move point if in same room
				if(this.getPortalPathway() == null){
					this.setTrueLookAngle(this.getMoveLocation());
				}
				else{
					this.setTrueLookAngle(this.getPortalPathway().get(this.getPortalPathway().size() - 1).getLocation());
				}
			}
			else if(this.getTeamObject().getTeamFormation() != null &&
					this.aiMode.equals(this.getTeamObject().getTeamFormation().getFormationType())){
				// find where to look in the formation
				this.setTrueLookAngle(this.getTeamObject().getTeamFormation().getHeading(this));
			}
		}
		else if(this.aiMode.equals("Camping")){
			if(this.getTeamObject().getTeamFormation() == null ||
					(
					!this.getTeamObject().getTeamFormation().isInFormation(this) ||
					this.getTeamObject().getTeamFormation().isLeader(this)) ||
					!this.aiMode.equals(this.getTeamObject().getTeamFormation().getFormationType())
			   ){
				// look at a portal to this room or a corner
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
			else if(this.getTeamObject().getTeamFormation() != null &&
					this.aiMode.equals(this.getTeamObject().getTeamFormation().getFormationType())){
				// find where to look in the formation
				this.setTrueLookAngle(this.getTeamObject().getTeamFormation().getHeading(this));
			}
		}
		else if(this.getTargetAi() != null && this.aiMode.equals("Loot")){
			this.setTrueLookAngle(Maths.getDegrees(this.getLocation(), this.getTargetAi().getLocation()));
		}
		else{
			this.setTrueLookAngle(new Random().nextInt(360));
		}

	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#lootTurnAction()
	 */
	@Override
	protected void lootTurnAction(){
		
		if(this.getLevelBlock() == this.getTargetAi().getLevelBlock() &&
		   Maths.getDistance(this.getLocation(), getTargetAi().getLocation()) <= AiData.INTERACTION_RANGE){
			
			if(this.getActionTurns() > Abilities.TURNS_TO_LOOT){
				
				this.computeWhatToLoot(this.getTargetAi());
				
				this.assignAbilities();
				this.getTargetAi().assignAbilities();
				
				this.setActionTurns(0);
				
				this.setAiMode("Camping");
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
	
	/**
	 * Computes the what to loot.
	 *
	 * @param targetAi the target ai
	 */
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
			this.getTeamObject().addLootedAi(this.getTargetAi());
		}
	}
	
	/**
	 * Ai in room to loot.
	 *
	 * @return true, if successful
	 */
	private boolean aiInRoomToLoot() {
		if(!this.getInventory().isFull())
		for(Ai ai : aiCrowd.getActors()){
			if(ai.getLevelBlock() == this.getLevelBlock() && (ai.isDead() || (this.isTargetHostile(ai) && ai.getIncapTurns() > 0)) && !this.getTeamObject().isAiLooted(ai) && hasStuffToLoot(ai) && combatVisualManager.isAiInSight(ai, this.getFaction())){
				return true;
			}
		}
		return false;
	}

	/**
	 * Loot ai in room.
	 */
	protected void lootAiInRoom() {
		if(!this.getInventory().isFull())
		for(Ai ai : aiCrowd.getActors()){
			if(ai.getLevelBlock() == this.getLevelBlock() && (ai.isDead() || (this.isTargetHostile(ai) && ai.getIncapTurns() > 0)) && !this.getTeamObject().isAiLooted(ai) && hasStuffToLoot(ai) && combatVisualManager.isAiInSight(ai, this.getFaction())){
				this.setAiMode("Loot");
				this.setAction("Loot");
				this.loot(ai);
				
				this.setTrueLookAngle(ai.getLocation());
				
				return;
			}
		}
		
		if(this.hasAbility(Abilities.STASH_SEARCH)){
			this.computeWhatToLoot(this.stashSearch());
		}
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#stashSearch()
	 */
	@Override
	public Lootable stashSearch() {
		Lootable loot = this.getLevelBlock().getStash(this.getLocation());
		return loot;
	}
	
	/**
	 * Checks for stuff to loot.
	 *
	 * @param targetAi the target ai
	 * @return true, if successful
	 */
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

	/**
	 * Checks if is being targeted.
	 *
	 * @return true, if is being targeted
	 */
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
	
	/**
	 * Gets the ai mode.
	 *
	 * @return the ai mode
	 */
	public String getAiMode() {
		return aiMode;
	}

	/**
	 * Sets the ai mode.
	 *
	 * @param aiMode the new ai mode
	 */
	public void setAiMode(String aiMode) {
		this.aiMode = aiMode;
	}

	/**
	 * Wait for turns.
	 *
	 * @param count the count
	 */
	public void waitForTurns(int count) {
		this.turnCounter = count;
		this.listeningToCommand = false;
		this.aiMode = "Camping";
	}
	
	// getters
	/**
	 * Gets the team object.
	 *
	 * @return the team object
	 */
	public ThinkingTeamObject getTeamObject(){
		return (ThinkingTeamObject) combatMembersManager.getTeamObject(this);
	}
	
	/**
	 * Checks if is listening to command.
	 *
	 * @return true, if is listening to command
	 */
	public boolean isListeningToCommand(){
		return this.listeningToCommand;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#isTargetHostile(atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean isTargetHostile(Ai target){
		if( !target.isDead() &&
		   (!this.getFaction().equals(target.getFaction())) &&
		   // also checks for alliances
		    !this.getTeamObject().isAlliedWith(target.getFaction())){
			return true;
		}
		return false;
	}
	
	// Remove smart nodes on room change
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#setLevelBlock(atrophy.combat.level.LevelBlock)
	 */
	@Override
	public void setLevelBlock(LevelBlock residentBlock) {
		super.setLevelBlock(residentBlock);
		
		if(this.aiNode != null && !this.aiNode.hasPriority(this.getName())){
			this.aiNode.releaseNode(this);
			this.aiNode = null;
			this.getTeamObject().aiReleasedNode(this);
		}
	}
	
	/**
	 * Gets the aggression.
	 *
	 * @return the aggression
	 */
	public double getAggression() {
		return aggression;
	}

	/**
	 * Sets the aggression.
	 *
	 * @param aggression the new aggression
	 */
	public void setAggression(int aggression) {
		this.aggression = aggression;
	}
	
	/**
	 * Sets the base aggression.
	 *
	 * @param aggression the new base aggression
	 */
	public void setBaseAggression(int aggression){
		this.baseAggression = aggression;
		this.aggression = aggression;
	}
	
	/**
	 * Modify aggression.
	 *
	 * @param aggression the aggression
	 */
	public void modifyAggression(double aggression){
		this.aggression += aggression;
		if(this.aggression < this.baseAggression - 1.5){
			this.aggression = this.baseAggression -1.5;
		}
		else if(this.aggression > this.baseAggression + 1.5){
			this.aggression = this.baseAggression + 1.5;
		}
		aggressionModified = true;
	}
	
	/**
	 * Reset aggression.
	 *
	 * @param normal the normal
	 */
	public void resetAggression(double normal){
		if(this.aggression > this.baseAggression){
			this.aggression -= normal;
			if(aggression < this.baseAggression){
				this.aggression = this.baseAggression;
			}
		}
		else if(this.aggression < this.baseAggression){
			this.aggression += normal;
			if(aggression > this.baseAggression){
				this.aggression = this.baseAggression;
			}
		}
	}
	
	/**
	 * Checks if is block player convo.
	 *
	 * @return true, if is block player convo
	 */
	public boolean isBlockPlayerConvo() {
		return blockPlayerConvo;
	}

	/**
	 * Sets the block player convo.
	 *
	 * @param blockPlayerConvo the new block player convo
	 */
	public void setBlockPlayerConvo(boolean blockPlayerConvo) {
		this.blockPlayerConvo = blockPlayerConvo;
	}
	
	/**
	 * Respond to message.
	 *
	 * @param message the message
	 * @param speaker the speaker
	 */
	public void respondToMessage(String message, Ai speaker) {
		switch(message){
			// Engage ai
			case "ATTACK":
				this.aiMode = "Engaging";
				this.aim(speaker);
				this.aiNode.freeThinkTurns = 6;
			break;
			// Take money from ai
			case "PAY":
			break;
			// Take items from ai
			case "GIVE_ITEMS":
				this.setAiMode("Loot");
				this.setAction("Loot");
				
				this.loot(speaker);
				
				int stunTurns = (int)Math.ceil((Maths.getDistance(this.getLocation(), speaker.getLocation()) / this.getMoveDistance())) + 6;
				
				speaker.setIncapTurns(stunTurns);
				this.aiNode.freeThinkTurns = stunTurns + 1;
			break;
			// Open trade with ai
			case "TRADE":
			break;
		}
	}
	
	/**
	 * Will join player.
	 *
	 * @param player the player
	 * @return true, if successful
	 */
	public boolean willJoinPlayer(@SuppressWarnings("unused") Ai player){
		return false;
	}

	/**
	 * Gets the thinking node.
	 *
	 * @return the thinking node
	 */
	public AiNode getThinkingNode() {
		return aiNode;
	}

	/**
	 * Sets the thinking node.
	 *
	 * @param thinkingNode the new thinking node
	 */
	public void setThinkingNode(AiNode thinkingNode) {
		this.aiNode = thinkingNode;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#purge()
	 */
	@Override
	public void purge() {
		super.purge();
		this.chaseAi = null;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.Ai#isSkippingTurns()
	 */
	@Override
	public boolean isSkippingTurns() {
		return true;
	}
	
	
	/**
	 * The Class AiNode.
	 */
	public static class AiNode{
		
		/**
		 * The Constant PRI_STORY.
		 */
		public static final String PRI_STORY = "STORY";
		
		/**
		 * The Constant PRI_HIGHWAYMAN.
		 */
		public static final String PRI_HIGHWAYMAN = "HIGHWAYMAN";
		
		/**
		 * The Constant PRI_SHOPKEEP.
		 */
		public static final String PRI_SHOPKEEP = "SHOP";
		
		/**
		 * The Constant PRI_DEFENDER.
		 */
		public static final String PRI_DEFENDER = "DEFENDER";
		
		/**
		 * The location.
		 */
		private double[] location;
		
		/**
		 * The angle.
		 */
		private double angle;
		
		/**
		 * The useable factions.
		 */
		private Set<String> useableFactions;
		
		/**
		 * The disabler.
		 */
		private String[] disabler;
		
		// Whether this node describes a behaviour that requires the ai to be at the location
		// you can create a node which allows the to sell stuff but they don't have to be at the node
		/**
		 * The must be occupied.
		 */
		private boolean mustBeOccupied;
		
		/**
		 * The dialogue.
		 */
		private Dialogue dialogue;
		
		/**
		 * The topics.
		 */
		private Dialogue topics;
		
		/**
		 * The free think turns.
		 */
		private int freeThinkTurns;
		
		/**
		 * The max users.
		 */
		private int maxUsers;
		
		/**
		 * The users.
		 */
		private HashSet<ThinkingAi> users;
		
		/**
		 * The priorities.
		 */
		private HashSet<String> priorities;
		
		// whether this node will think for the ai
		// can be used to make nodes purely for dialogue
		/**
		 * The thinks.
		 */
		private boolean thinks;

		private TurnProcess turnProcess;

		private MessageBox messageBox;

		private AiCrowd aiCrowd;

		/**
		 * Instantiates a new ai node.
		 *
		 * @param x the x
		 * @param y the y
		 */
		public AiNode(AiCrowd aiCrowd, MessageBox messageBox, TurnProcess turnProcess, double x, double y){
			this.location = new double[]{x,y};
			
			angle = 361;
			
			useableFactions = new HashSet<String>();
			
			disabler = new String[0];
			
			mustBeOccupied = false;
			
			dialogue = null;
			
			freeThinkTurns = 0;
			
			thinks = false;
			
			maxUsers = 0;
			
			users = new HashSet<ThinkingAi>();
			priorities = new HashSet<String>();
			
			this.aiCrowd = aiCrowd;
			this.turnProcess = turnProcess;
			this.messageBox = messageBox;
		}
		
		/**
		 * Grab node.
		 *
		 * @param ai the ai
		 * @return true, if successful
		 */
		public boolean grabNode(ThinkingAi ai){
			if(users.size() < maxUsers || maxUsers == 0){
				this.users.add(ai);
				return true;
			}
			return false;
		}
		
		/**
		 * Release node.
		 *
		 * @param ai the ai
		 */
		public void releaseNode(ThinkingAi ai){
			this.users.remove(ai);
		}
		
		/**
		 * Think.
		 *
		 * @param ai the ai
		 */
		public void think(ThinkingAi ai){
			
			if(!thinks){
				if(!useDialogue(ai)){
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
				turnProcess.currentAiDone(true);
		}

		/**
		 * Use dialogue.
		 *
		 * @param ai the ai
		 * @return true, if successful
		 */
		private boolean useDialogue(ThinkingAi ai) {
			if(hasDialogue() && this.dialogue.getTargetFaction().equals(AiGenerator.PLAYER)){
				
				Ai talkTarget = null;
				
				// find a player unit in sight
				for(Ai actor : aiCrowd.getActors()){
					if(actor.getFaction().equals(AiGenerator.PLAYER) && !actor.isDead() && dialogue.canTalkTo(actor) && CombatVisualManager.isAiInSight(ai, actor)){
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

		// Check to see if the node is active
		/**
		 * Check for disable.
		 *
		 * @param ai the ai
		 * @return true, if successful
		 */
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
							ai.gatherEnvironmentData();
							return true;
						}
						break;
							
					case "BANDITS_PRESENT":
						if(checkForFactionInBlock(ai.getLevelBlock(), AiGenerator.BANDITS) && inverse){
							ai.gatherEnvironmentData();
							return true;
						}
						break;
							
					case "PLAYER_PRESENT":
						if(checkForFactionInBlock(ai.getLevelBlock(), AiGenerator.PLAYER) && inverse){
							ai.gatherEnvironmentData();
							return true;
						}
						break;
							
					case "LONER_PRESENT":
						if(checkForFactionInBlock(ai.getLevelBlock(), AiGenerator.LONER) && inverse){
							ai.gatherEnvironmentData();
							return true;
						}
						break;
				}
			
			}
			
			return false;
		}

		/**
		 * Check for faction in block.
		 *
		 * @param levelBlock the level block
		 * @param faction the faction
		 * @return true, if successful
		 */
		private boolean checkForFactionInBlock(LevelBlock levelBlock, String faction) {
			for(int i = 0; i < aiCrowd.getActorCount(); i++){
				Ai ai = aiCrowd.getActor(i);
				if(!ai.isDead() && ai.getFaction().equals(faction) && ai.getLevelBlock() == levelBlock){
					return true;
				}
			}
			return false;
		}

		/**
		 * Gets the location.
		 *
		 * @return the location
		 */
		public double[] getLocation() {
			return location;
		}

		/**
		 * Checks for angle.
		 *
		 * @return true, if successful
		 */
		public boolean hasAngle(){
			return angle != 361;
		}
		
		/**
		 * Gets the angle.
		 *
		 * @return the angle
		 */
		public double getAngle() {
			return angle;
		}

		/**
		 * Can use.
		 *
		 * @param faction the faction
		 * @return true, if successful
		 */
		public boolean canUse(String faction) {
			return this.useableFactions.contains(faction);
		}

		/**
		 * Sets the angle.
		 *
		 * @param angle the new angle
		 */
		public void setAngle(double angle) {
			this.angle = angle;
		}

		/**
		 * Adds the usable faction.
		 *
		 * @param faction the faction
		 * @param mapOwner the map owner
		 */
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

		/**
		 * Must be occupied.
		 *
		 * @return true, if successful
		 */
		public boolean mustBeOccupied() {
			return mustBeOccupied;
		}

		/**
		 * Sets the must be occupied.
		 *
		 * @param mustBeOccupied the new must be occupied
		 */
		public void setMustBeOccupied(boolean mustBeOccupied) {
			this.mustBeOccupied = mustBeOccupied;
		}
		
		/**
		 * Checks for dialogue.
		 *
		 * @return true, if successful
		 */
		public boolean hasDialogue(){
			return this.dialogue != null;
		}

		/**
		 * Gets the dialogue.
		 *
		 * @return the dialogue
		 */
		public Dialogue getDialogue() {
			return this.dialogue;
		}
		
		/**
		 * Sets the dialogue.
		 *
		 * @param dialogue the new dialogue
		 */
		public void setDialogue(Dialogue dialogue){
			this.dialogue = dialogue;
		}
		
		/**
		 * Sets the disabler.
		 *
		 * @param disabler the new disabler
		 */
		public void setDisabler(String[] disabler){
			this.disabler = disabler;
		}

		/**
		 * Finish.
		 *
		 * @param ai the ai
		 */
		public void finish(ThinkingAi ai) {
			if(this.thinks){
				turnProcess.currentAiDone(true);
			}
			else{
				ai.gatherEnvironmentData();
			}
		}

		/**
		 * Sets the thinks.
		 *
		 * @param hasThoughts the new thinks
		 */
		public void setThinks(boolean hasThoughts) {
			this.thinks = hasThoughts;
		}

		/**
		 * Gets the topics.
		 *
		 * @return the topics
		 */
		public Dialogue getTopics() {
			return topics;
		}

		/**
		 * Sets the topics.
		 *
		 * @param topics the new topics
		 */
		public void setTopics(Dialogue topics) {
			this.topics = topics;
		}
		
		/**
		 * Checks for topics.
		 *
		 * @return true, if successful
		 */
		public boolean hasTopics(){
			return this.topics != null;
		}

		/**
		 * Gets the max users.
		 *
		 * @return the max users
		 */
		public int getMaxUsers() {
			return maxUsers;
		}

		/**
		 * Sets the max users.
		 *
		 * @param maxUsers the new max users
		 */
		public void setMaxUsers(int maxUsers) {
			this.maxUsers = maxUsers;
		}

		/**
		 * Checks if is full.
		 *
		 * @return true, if is full
		 */
		public boolean isFull() {
			if(this.users.size() < this.maxUsers)
				return true;
			return false;
		}
		
		/**
		 * Adds the priorities.
		 *
		 * @param priorities the priorities
		 */
		public void addPriorities(List<String> priorities){
			for(int i = 0; i < priorities.size(); i++){
				this.priorities.add(priorities.get(i));
			}
		}
		
		/**
		 * Checks for priority.
		 *
		 * @param priority the priority
		 * @return true, if successful
		 */
		public boolean hasPriority(String priority){
			return this.priorities.contains(priority);
		}
		
	}


	/**
	 * Gets the ai node.
	 *
	 * @return the ai node
	 */
	public AiNode getAiNode() {
		return this.aiNode;
	}

	/**
	 * Sets the ai node.
	 *
	 * @param aiNode the new ai node
	 */
	public void setAiNode(AiNode aiNode) {
		
		// Only release a node if it isn't personalised
		if(this.aiNode != null && this.aiNode.hasPriority(this.getName()))
			return;
			
		this.aiNode = aiNode;
	}

	/**
	 * Stationary node.
	 *
	 * @return true, if successful
	 */
	public boolean stationaryNode() {
		return this.aiNode.mustBeOccupied;
	}
}
