package atrophy.combat.ai;

import java.util.Random;

import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.Portal;
import atrophy.combat.mechanics.Abilities;

public class AiActions {

	public static final String WELD_OPEN = "Weld2";

	public static final String WELD_SHUT = "Weld1";

	public static final String WELD_TOGGLE = "Weld";

	public static final String THROW_GRENADE = "ThrowGrenade";

	public static final String THROW_STUN_GRENADE = "ThrowStunGrenade";

	public static final String NO_ACTION = "";

	public static final String BACKSTAB = "Backstab";

	public static final String STUN_TARGET = "StunTarget";

	public static final String LOOT = "Loot";

	public static final String LOOTING = "Looting";

	private static final String GRAPPLE_TARGET = "Grapple";

	private int actionTurns;
	
	private int oldActionTurns;
	
	private String oldAction;
	
	private String action;
	
	private double[] actionLocation;
	
	private AiCombatActions aiCombatActions;

	private MouseAbilityHandler mouseAbilityHandler;

	private FloatingIcons floatingIcons;

	private AiCrowd aiCrowd;

	private LootBox lootBox;

	private CombatMembersManager combatMembersManager;
	private CombatVisualManager combatVisualManager;
	private CombatUiManager combatUiManager;
	private CombatNCEManager combatInorganicManager;
	private LevelManager levelManager;
	
	public AiActions(AiCrowd aiCrowd, CombatVisualManager combatVisualManager, CombatUiManager combatUiManager, CombatMembersManager combatMembersManager, CombatNCEManager combatInorganicManager, FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler, LootBox lootBox, LevelManager levelManager){
		actionTurns = 0;
		oldActionTurns = 0;
		oldAction = NO_ACTION;
		action = NO_ACTION;
		actionLocation = new double[]{0,0};
		
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.aiCrowd = aiCrowd;
		this.floatingIcons = floatingIcons;
		this.lootBox = lootBox;
		this.combatMembersManager = combatMembersManager;
		this.combatVisualManager = combatVisualManager;
		this.aiCombatActions = new AiCombatActions(combatVisualManager, mouseAbilityHandler, aiCrowd);
		this.combatUiManager = combatUiManager;
		this.combatInorganicManager = combatInorganicManager;
		this.levelManager = levelManager;
	}

	public int getActionTurns() {
		return actionTurns;
	}

	public int getOldActionTurns() {
		return oldActionTurns;
	}

	public String getOldAction() {
		return oldAction;
	}

	public void setActionTurns(int actionTurns) {
		this.actionTurns = actionTurns;
	}

	public void setOldActionTurns(int oldActionTurns) {
		this.oldActionTurns = oldActionTurns;
	}

	public void setOldAction(String oldAction) {
		this.oldAction = oldAction;
	}

	public void incrementActionTurns() {
		this.actionTurns++;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public double[] getActionLocation() {
		return actionLocation;
	}

	public void setActionLocation(double[] actionLocation) {
		this.actionLocation = actionLocation;
	}
	
	public void setActionLocation(double x, double y) {
		this.actionLocation[0] = x;
		this.actionLocation[1] = y;
	}

	public void setWeldingShut(Ai invoker){
		
		invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
		
		Portal targetPortal = null;
		
		for(int i = 0; i < invoker.getLevelBlock().getPortalCount(); i++){
			
			// only check for portals which are open
			if(invoker.getLevelBlock().getPortal(i).canUse() &&
			   (targetPortal == null ||
			   Maths.getDistance(invoker.getLocation(), invoker.getLevelBlock().getPortal(i).getLocation()) <
			   Maths.getDistance(invoker.getLocation(), targetPortal.getLocation()))){
				
				targetPortal = invoker.getLevelBlock().getPortal(i);
			}
			
		}
		
		if(targetPortal != null){
			
			invoker.moveWithinRadius(targetPortal.getLocation(),AiData.INTERACTION_RANGE);
			
			this.setAction(WELD_SHUT);
			
			if(this.getOldAction().startsWith(WELD_TOGGLE)){
				this.setActionTurns(getOldActionTurns());
			}
			
			invoker.setLookAngle(targetPortal.getLocation());
			invoker.setAbilityLocation(targetPortal.getLocation()[0], targetPortal.getLocation()[1]);
		}
		
	}
	
	public void setWeldingShut(Ai invoker, Portal blockPortal){
		
		if(blockPortal != null){
			
			invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
			
			invoker.moveWithinRadius(blockPortal.getLocation(),AiData.INTERACTION_RANGE);
			
			invoker.setLookAngle(blockPortal.getLocation());
			
			this.setAction(WELD_SHUT);
			
			if(this.getOldAction().startsWith(WELD_TOGGLE)){
				this.setActionTurns(this.getOldActionTurns());
			}
			
			invoker.setLookAngle(blockPortal.getLocation());
			
			invoker.setAbilityLocation(blockPortal.getLocation()[0], blockPortal.getLocation()[1]);
		}
	}
	
	public void setWeldingOpen(Ai invoker, Portal blockPortal){
		
		if(blockPortal != null){
			
			invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
			
			invoker.moveWithinRadius(blockPortal.getLocation(),AiData.INTERACTION_RANGE);
			
			invoker.setLookAngle(blockPortal.getLocation());
			
			this.setAction(WELD_OPEN);
			
			if(this.getOldAction().startsWith(WELD_TOGGLE)){
				this.setActionTurns(this.getOldActionTurns());
			}
			
			invoker.setLookAngle(blockPortal.getLocation());
			
			invoker.setAbilityLocation(blockPortal.getLocation()[0], blockPortal.getLocation()[1]);
		}
	}
	
	public void setWelding(Ai invoker){
		
		invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
		
		Portal targetPortal = null;
		
		for(int i = 0; i < invoker.getLevelBlock().getPortalCount(); i++){
			
			if(targetPortal == null ||
			   Maths.getDistance(invoker.getLocation(), invoker.getLevelBlock().getPortal(i).getLocation()) <
			   Maths.getDistance(invoker.getLocation(), targetPortal.getLocation())){
				
				targetPortal = invoker.getLevelBlock().getPortal(i);
			}
			
		}
		
		if(targetPortal != null){
			
			invoker.moveWithinRadius(targetPortal.getLocation(),AiData.INTERACTION_RANGE);
		
			invoker.setLookAngle(targetPortal.getLocation());
			
			if(targetPortal.canUse()){
				this.setAction(WELD_SHUT);
			}
			else{
				this.setAction(WELD_OPEN);
			}
			
			if(this.getOldAction().startsWith(WELD_TOGGLE)){
				this.setActionTurns(this.getOldActionTurns());
			}
			
			invoker.setAbilityLocation(targetPortal.getLocation()[0], targetPortal.getLocation()[1]);
			
			invoker.setLookAngle(this.actionLocation);
		}
		
	}
	
	public void weldTurnAction(Ai invoker){
		if(Maths.getDistance(invoker.getLocation(), invoker.getMoveLocation()) > 0){
			invoker.moveIntra(invoker.getMoveLocation());
			this.setActionTurns(0);
		}
		this.setAction(WELD_TOGGLE);
		
		if(this.getActionTurns() > Abilities.turnsToDo(Abilities.WELDING, invoker.getSkillLevel(Abilities.WELDING))){
			this.weldAction(invoker);
			this.setActionTurns(0);
		}
		// if at the location, therefore started welding
		else if(Maths.getDistance(invoker.getLocation(), invoker.getMoveLocation()) == 0){
			incrementActionTurns();
		}
		
		invoker.setLookAngle(this.actionLocation);
	}
	
	public void weldTurnAction(Ai invoker, boolean openDoor){
		if(Maths.getDistance(invoker.getLocation(), invoker.getMoveLocation()) > 0){
			invoker.moveIntra(invoker.getMoveLocation());
			this.setActionTurns(0);
		}
		
		// reset action in case moveIntra set to ""
		if(!openDoor){
			this.setAction(WELD_SHUT);
		}
		else{
			this.setAction(WELD_OPEN);
		}
		
		// only weld when enough turns gone by
		if(this.getActionTurns() > Abilities.turnsToDo(Abilities.WELDING, invoker.getSkillLevel(Abilities.WELDING))){
			weldAction(invoker,openDoor);
			this.setActionTurns(0);
		}
		// if at the location, therefore started welding
		else if(Maths.getDistance(invoker.getLocation(), invoker.getMoveLocation()) == 0){
			incrementActionTurns();
		}
		
		invoker.setLookAngle(this.actionLocation);
	}
	
	public void weldAction(Ai invoker){
		Portal targetPortal = null;
		
		for(int i = 0; i < invoker.getLevelBlock().getPortalCount(); i++){
			if(Maths.getDistance(invoker.getLocation(), invoker.getLevelBlock().getPortal(i).getLocation()) <= AiData.INTERACTION_RANGE &&
			   (targetPortal == null ||
			   Maths.getDistance(invoker.getLocation(), invoker.getLevelBlock().getPortal(i).getLocation()) <
			   Maths.getDistance(invoker.getLocation(), targetPortal.getLocation()))){
				
				targetPortal = invoker.getLevelBlock().getPortal(i);
			}
		}
		
		if(targetPortal != null &&
		   Maths.getDistance(invoker.getLocation(), targetPortal.getLocation()) <= AiData.INTERACTION_RANGE){
			
			targetPortal.setWelded(targetPortal.canUse());
			
			invoker.setLookAngle(this.actionLocation);
			
			invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
		}
	}
	
	public void weldAction(Ai invoker, boolean openDoor){
		Portal targetPortal = null;
		
		for(int i = 0; i < invoker.getLevelBlock().getPortalCount(); i++){
			if(invoker.getLevelBlock().getPortal(i).canUse() != openDoor &&
			   Maths.getDistance(invoker.getLocation(), invoker.getLevelBlock().getPortal(i).getLocation()) <= AiData.INTERACTION_RANGE &&
			   (targetPortal == null ||
			   Maths.getDistance(invoker.getLocation(), invoker.getLevelBlock().getPortal(i).getLocation()) <
			   Maths.getDistance(invoker.getLocation(), targetPortal.getLocation()))){
				
				targetPortal = invoker.getLevelBlock().getPortal(i);
			}
		}
		
		if(targetPortal != null &&
		   Maths.getDistance(invoker.getLocation(), targetPortal.getLocation()) <= AiData.INTERACTION_RANGE){
			
			targetPortal.setWelded(targetPortal.canUse());
			
			invoker.setLookAngle(this.actionLocation);
			
			invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
			
		}
	}
	
	public void xrayScan(Ai invoker){
		invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
		this.setAction(Abilities.XRAY_SCAN);
	}
	
	public void scanScience(Ai invoker){
		invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
		this.setAction(Abilities.SCAN_SCIENCE);
	}
	
	public void loot(Ai invoker, Ai lootAi){
		
		if(lootAi == invoker.getOldTargetAi() && this.getOldAction().equals(LOOTING)){
			
			invoker.setMoveLocationToSelf();
			
			invoker.setTargetAi(lootAi);
			this.setAction(LOOTING);
			
			lootBox.loadLootDisplay(invoker, lootAi, true);
			
		}
		else{
			invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
			
			if(Maths.getDistance(invoker.getLocation(), lootAi.getLocation()) > AiData.INTERACTION_RANGE &&
				invoker.getLevelBlock() == lootAi.getLevelBlock()){
				
				invoker.moveWithinRadius(lootAi.getLocation(), AiData.INTERACTION_RANGE);
			}
			else if(invoker.getLevelBlock() == lootAi.getLevelBlock()){
				invoker.setMoveLocationToSelf();
			}
			else{
				try{
					invoker.setMoveLocation(lootAi.getLocation(), true);
				}
				catch(PathNotFoundException pnfe){return;}
			}
			
			this.setAction(LOOT);
			
			if(this.getOldAction().equals(LOOT) && lootAi == invoker.getOldTargetAi()){
				this.setActionTurns(this.getOldActionTurns());
			}
			
			invoker.setTargetAi(lootAi);
		}
	}
	
	public void lootingAction(Ai invoker){
		invoker.setTrueLookAngle(invoker.getTargetAi().getLocation());
		if(Maths.getDistance(invoker.getLocation(), invoker.getTargetAi().getLocation()) > AiData.INTERACTION_RANGE){
			this.setAction(LOOT);
			this.setOldAction(LOOT);
			this.setActionTurns(0);
			this.setOldActionTurns(0);
			this.loot(invoker, invoker.getTargetAi());
		}
	}
	
	public Lootable stashSearch(Ai invoker) {
		Lootable loot = invoker.getLevelBlock().getStash(invoker.getLocation());
		lootBox.loadLootDisplay(invoker, loot, true);
		return null;
	}
	
	public void tradeWithClosestAlly(Ai invoker){
		
		Ai closestAlly = null;
		
		for(int i = 0; i < combatMembersManager.getAllyCount(); i++){
			if(combatMembersManager.getAlly(i) != invoker &&
			   combatMembersManager.getAlly(i).getLevelBlock() == invoker.getLevelBlock() &&
			   (closestAlly == null ||
			    Maths.getDistance(combatMembersManager.getAlly(i).getLocation(), invoker.getLocation()) < Maths.getDistance(closestAlly.getLocation(), invoker.getLocation()))){
				
				closestAlly =  combatMembersManager.getAlly(i);
			}
		}
		
		if(closestAlly != null){
			invoker.loot(closestAlly);
		}
	}
	
	public void tradeWithAlly(Ai invoker, Ai closestAlly){
		invoker.loot(closestAlly);
	}
	
	public void setStunTarget(Ai invoker, Ai targetAi){
		invoker.setTargetAi(targetAi);
		this.setAction(STUN_TARGET);
	}
	
	public void setGrappleTarget(Ai invoker, Ai targetAi) {
		invoker.setTargetAi(targetAi);
		this.setAction(GRAPPLE_TARGET);
	}
	
	public void stunTarget(Ai invoker){
		
		if(invoker.getTargetAi() != null && Maths.getDistance(invoker.getLocation(), invoker.getTargetAi().getLocation()) <= MeleeWeapon1.RANGE){
			
			// break any alliances with the faction if visible
			breakAlliance(invoker);
			
			makeHatedWithTarget(invoker);
			
			if(new Random().nextInt(5) < 2)
				invoker.getTargetAi().setStunnedTurns(3);
			
			invoker.setTargetAi(null);
			this.setAction(NO_ACTION);
			invoker.setMoveLocationToSelf();
			
			
		}
		else {
			Ai targetAi = invoker.getTargetAi();
			invoker.moveWithinRadius(invoker.getTargetAi().getLocation(), invoker.getWeapon().getRange());
			invoker.aiPathing.move(invoker);
			this.setAction(STUN_TARGET);
			invoker.setTargetAi(targetAi);
		}
		
		this.setActionTurns(0);
	}
	
	public void grappleTarget(Ai invoker){
		
		if(Maths.getDistance(invoker.getLocation(), invoker.getTargetAi().getLocation()) <= MeleeWeapon1.RANGE){
			
			// break any alliances with the faction if visible
			breakAlliance(invoker);
			
			invoker.getTargetAi().setStunnedTurns(2);
			makeHatedWithTarget(invoker);
			
			invoker.setTargetAi(null);
			this.setAction(NO_ACTION);
			invoker.setMoveLocationToSelf();
		}
		else{
			invoker.moveWithinRadius(invoker.getTargetAi().getLocation(), invoker.getWeapon().getRange());
			invoker.aiPathing.move(invoker);
			this.setAction(GRAPPLE_TARGET);
		}
		
		this.setActionTurns(0);
	}

	public void setBackstabTarget(Ai invoker, Ai targetAi){
		invoker.setTargetAi(targetAi);
		this.setAction(BACKSTAB);
	}
	
	public void backstabTarget(Ai invoker){
		
		if(Maths.getDistance(invoker.getLocation(), invoker.getTargetAi().getLocation()) <= invoker.getWeapon().getRange() + 10){
			
			// break any alliances with the faction if visible
			makeHatedWithTarget(invoker);
			
			if(!CombatVisualManager.spotFovNoRadius(invoker.getTargetAi(),invoker.getLocation())){
				invoker.getTargetAi().setDead(invoker, true);
			}
			
			invoker.setLocation(invoker.getTargetAi().getLocation().clone());
			
			makeHatedWithTarget(invoker);
			
			invoker.setTargetAi(null);
			this.setAction(NO_ACTION);
			combatUiManager.getActionText().updateMode();
			invoker.setMoveLocationToSelf();
		}
		else{
			invoker.moveWithinRadius(invoker.getTargetAi().getLocation(), invoker.getWeapon().getRange());
			invoker.move();
		}
		
		this.setActionTurns(0);
	}

	private void breakAlliance(Ai invoker) {
		if(invoker.getTargetAi() instanceof ThinkingAi &&
		   combatVisualManager.isAiInSight(invoker.getTargetAi(), invoker, invoker.getTargetAi().getFaction())){
			
			((ThinkingAi) invoker.getTargetAi()).getCommander().removeAlliance(invoker.getFaction());
			
		}
	}
	
	private void makeHatedWithTarget(Ai invoker) {
		if(invoker.getTargetAi() instanceof ThinkingAi && combatVisualManager.isAiInSight(invoker.getTargetAi(), invoker, invoker.getTargetAi().getFaction())){
			
			TeamsCommander commander = ((ThinkingAi) invoker.getTargetAi()).getCommander();
			commander.removeAlliance(invoker.getFaction());
			commander.addHatedAi(invoker);
			
		}
	}
	
	public void specialActions(Ai invoker) {
		invoker.setSwing(0);
		if(!this.getAction().equals(this.getOldAction())){
			setActionTurns(0);
		}
		
		switch(this.getAction()){
			case BACKSTAB:
				backstabTarget(invoker);
			break;
			case STUN_TARGET:
				stunTarget(invoker);
			break;
			case GRAPPLE_TARGET:
				grappleTarget(invoker);
			break;
			case WELD_TOGGLE:
				weldTurnAction(invoker);
			break;
			case WELD_SHUT:
				weldTurnAction(invoker,false);
			break;
			case WELD_OPEN:
				weldTurnAction(invoker,true);
			break;
			case Abilities.XRAY_SCAN:
				Abilities.applyAbility(invoker, Abilities.XRAY_SCAN, invoker.getSkillLevel(Abilities.XRAY_SCAN));
			break;
			case Abilities.SCAN_SCIENCE:
				if(getActionTurns() > Abilities.turnsToDo(Abilities.SCAN_SCIENCE, invoker.getSkillLevel(Abilities.SCAN_SCIENCE))){
					if(!invoker.getInventory().isFull() && invoker.getLevelBlock().hasScience()){
						invoker.aiData.addItem(ScienceSupply.getInstance());
						invoker.getLevelBlock().setContainsScience(false);
					}
					this.setAction(NO_ACTION);
				}
				invoker.aiActions.incrementActionTurns();
			break;
			case LOOT:
				invoker.setTrueLookAngle(invoker.getTargetAi().getLocation());
				invoker.lootTurnAction();
			break;
			case LOOTING:
				lootingAction(invoker);
			break;
			case Abilities.STASH_SEARCH:
				this.stashSearch(invoker);
			break;
			case NO_ACTION:
			default:
				this.aiCombatActions.reload(invoker);
				this.setActionTurns(0);
			break;
			
		}
	}

	public void attack(Ai invoker) {
		this.aiCombatActions.attack(invoker);
	}

	public void shoot(Ai invoker) {
		this.aiCombatActions.shoot(invoker);
	}

	public int getSwing() {
		return this.aiCombatActions.getSwing();
	}
	
	public int getOldTargetSwing() {
		return this.aiCombatActions.getOldTargetSwing();
	}

	public Ai getTargetAi() {
		return this.aiCombatActions.getTargetAi();
	}
	
	public Ai getOldTargetAi() {
		return this.aiCombatActions.getOldTargetAi();
	}

	public void aim(Ai invoker, Ai targetAi) {
		this.aiCombatActions.aim(invoker, targetAi);
	}

	public void setOldTargetAi(Ai oldTargetAi) {
		this.aiCombatActions.setOldTargetAi(oldTargetAi);
	}

	public void setOldTargetSwing(int oldTargetSwing) {
		this.aiCombatActions.setOldTargetSwing(oldTargetSwing);
	}

	public void setTargetAi(Ai targetAi) {
		this.aiCombatActions.setTargetAi(targetAi);
	}

	public void setSwing(int swing) {
		this.aiCombatActions.setSwing(swing);
	}

}
