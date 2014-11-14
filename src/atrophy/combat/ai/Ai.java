package atrophy.combat.ai;

import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.combatEffects.Effect;
import atrophy.combat.combatEffects.ProtectPowerEffect;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.Inventory;
import atrophy.combat.items.Item;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.Weapon;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.Portal;
import atrophy.combat.mechanics.Abilities;
import atrophy.combat.mechanics.TurnProcess;

public class Ai implements Lootable {

	protected AiData aiData;
	protected AiPathing aiPathing;
	protected AiActions aiActions;

	private AiDeathReport deathReport;
	private String name;
	private String image;
	private String team;
	protected boolean dead;
	private boolean killCounted;
	private double lookAngle;
	private double editLookAngle;
	private int stunnedTurns;
	private int incapTurns;
	private boolean broadcastingLocation;
	private boolean ignoreLOS;
	private boolean skippingTurns;

	protected MouseAbilityHandler mouseAbilityHandler;
	protected FloatingIcons floatingIcons;
	protected CombatVisualManager combatVisualManager;
	protected CombatUiManager combatUiManager;
	protected CombatMembersManager combatMembersManager;
	protected AiCrowd aiCrowd;
	protected TurnProcess turnProcess;
	protected LootBox lootBox;
	protected PanningManager panningManager;
	private Ai nextAi;

	public Ai(FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler,
			  String name, double x, double y,
			  LevelManager levelManager, LootBox lootBox,
			  CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager,
			  AiCrowd aiCrowd, PanningManager panningManager, TurnProcess turnProcess){
		
		this.name = name;
		image = "";
		
		dead = false;

		killCounted = false;
		
		lookAngle = new Random().nextInt(360);
		editLookAngle = lookAngle;
		
		stunnedTurns = 0;
		incapTurns = 0;
		
		broadcastingLocation = false;
		
		ignoreLOS = false;
		
		skippingTurns = false;
		
		this.aiCrowd = aiCrowd;
		this.combatVisualManager = combatVisualManager;
		this.combatUiManager = combatUiManager;
		this.combatMembersManager = combatMembersManager;
		this.lootBox = lootBox;
		this.panningManager = panningManager;
		
		aiActions = new AiActions(aiCrowd, combatVisualManager, combatUiManager, combatMembersManager, mouseAbilityHandler, lootBox);
		aiPathing = new AiPathing(aiCrowd, levelManager, x,y);
		aiData = new AiData(mouseAbilityHandler, this, new MeleeWeapon1());
		
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.floatingIcons = floatingIcons;
		this.turnProcess = turnProcess;
		
	}
	
	public Ai(ThinkingAi thinkingAi, LevelManager levelManager) {
		this.name = thinkingAi.getName();
		image = thinkingAi.getImage();
		
		dead = false;

		killCounted = false;
		
		lookAngle = thinkingAi.getLookAngle();
		editLookAngle = lookAngle;
		
		stunnedTurns = thinkingAi.getStunnedTurns();
		incapTurns = thinkingAi.getIncapTurns();
		
		broadcastingLocation = false;
		
		this.team = "1Player";
		
		ignoreLOS = false;

		skippingTurns = false;
		aiActions = new AiActions(thinkingAi.aiCrowd, thinkingAi.combatVisualManager, thinkingAi.combatUiManager, thinkingAi.combatMembersManager, mouseAbilityHandler, thinkingAi.lootBox);
		aiPathing = new AiPathing(aiCrowd, levelManager, thinkingAi.getLocation()[0], thinkingAi.getLocation()[1]);
		aiData = new AiData(mouseAbilityHandler, thinkingAi, thinkingAi.getWeapon());
		
		this.setMoveLocationToSelf();

		aiData.setInventory(thinkingAi.getInventory());
		
		this.aiData.setAbilities(thinkingAi.getAbilities());
		assignAbilities();
		this.setArmour(thinkingAi.getArmour());
		
		this.mouseAbilityHandler = thinkingAi.mouseAbilityHandler;
		this.floatingIcons = thinkingAi.floatingIcons;
		this.turnProcess = thinkingAi.turnProcess;
		
	}
	
	public double[] getActionLocation() {
		return this.aiActions.getActionLocation();
	}

	public void setActionLocation(double[] actionLocation) {
		aiActions.setActionLocation(actionLocation);
	}
	
	public void action(){
		
		if(this.isDead()) {
			endTurn();
			return;
		}
		
		resetMoveUnits();
		
		resetStates();
		
		if(stunnedTurns == 0 && this.incapTurns == 0){
			this.aiData.handleEffects(this, this.getAction());
			
			if(this.getAction().equals("Move")){
				aiPathing.move(this);
				
				this.aiActions.setActionTurns(0);
			}
			else if(this.getTargetAi() != null && 
					!this.getAction().equals("Loot") && !this.getAction().equals("Looting") && !this.getAction().equals("Backstab") && !this.getAction().equals(AiActions.STUN_TARGET) && !this.getAction().equals(Abilities.HACK)){
				attack();
				
				this.aiActions.setActionTurns(0);
			}
			else{
				specialActions();
			}
			
			this.setOldTargetAi(this.getTargetAi());
			
			assignAbilities();
			
			// remove action from applying here to stop a free reload turn
			if(this.getAction().startsWith("Applying:")){
				this.aiActions.setAction("");
			}
		}
		
		if(this.stunnedTurns > 0){
			this.stunnedTurns--;
			incapTurns = 0;
		}
		if(this.incapTurns > 0){
			this.incapTurns--;
		}
		
		this.setOldAction(this.getAction());
		this.setOldActionTurns(this.getActionTurns());
		endTurn();
	}
	
	protected void endTurn() {
		
		if(nextAi == null || nextAi == this) {
			turnProcess.lastAiUpdated();
			this.nextAi = null;
		}
		else {
			nextAi.action();
			this.nextAi = null;
		}
	}

	public int getIncapTurns() {
		return incapTurns;
	}

	public void setIncapTurns(int incapTurns) {
		this.incapTurns = incapTurns;
	}

	protected void resetMoveUnits(){
		this.aiPathing.resetMoveUnits(this);
	}
	
	public int getOldActionTurns() {
		return this.aiActions.getOldActionTurns();
	}

	public void setOldActionTurns(int oldActionTurns) {
		this.aiActions.setOldActionTurns(oldActionTurns);
	}

	public void setOldAction(String oldAction) {
		this.aiActions.setOldAction(oldAction);
	}

	public String getOldAction() {
		return this.aiActions.getOldAction();
	}

	public void setActionTurns(int actionTurns) {
		this.aiActions.setActionTurns(actionTurns);
	}

	protected void resetStates(){
		
		this.aiData.resetStates();
		
		this.lookAngle = this.editLookAngle;
		
		this.ignoreLOS = false;
	}
	
	protected void specialActions(){
		this.aiActions.specialActions(this);
	}

	protected void attack(){
		this.aiActions.attack(this);
	}

	protected void shoot(){
		this.aiActions.shoot(this);
	}
	
	public void removeOrders(MouseAbilityHandler mouseAbilityHandler){
		removeOrdersWithoutUpdate(mouseAbilityHandler);
	}
	
	protected void removeOrdersWithoutUpdate(MouseAbilityHandler mouseAbilityHandler){
		this.setAction(AiActions.NO_ACTION);
		this.setSwing(0);
		this.setTargetAi(null);
		this.aiPathing.removeOrders();
		mouseAbilityHandler.cancelAbilitySetting();
	}
	
	public void moveWithinRadius(double[] location, double radius){
		this.aiPathing.moveWithinRadius(this,location,radius);
	}
	
	public void moveWithinRadius(double x, double y, double radius, boolean ignoreClosedDoors) {
		this.aiPathing.moveWithinRadius(this,x,y,radius,ignoreClosedDoors);
	}
	
	public void setWeldingShut(){
		this.aiActions.setWeldingShut(this);
	}
	
	public void setWeldingShut(Portal blockPortal){
		this.aiActions.setWeldingShut(this, blockPortal);
	}
	
	public void setWeldingOpen(Portal blockPortal){
		this.aiActions.setWeldingOpen(this, blockPortal);
	}
	
	public void setWelding(){
		this.aiActions.setWelding(this);
	}
	
	public void xrayScan(){
		this.aiActions.xrayScan(this);
	}
	
	public void scanScience(){
		this.aiActions.scanScience(this);
	}
	
	public void loot(Ai lootAi){
		this.aiActions.loot(this, lootAi);
	}
	
	protected void lootTurnAction(){
		if(this.getLevelBlock() == this.getTargetAi().getLevelBlock() &&
		   Maths.getDistance(this.getLocation(), this.getTargetAi().getLocation()) <= AiData.INTERACTION_RANGE){
			
			if(this.getActionTurns() > Abilities.TURNS_TO_LOOT){
				this.setAction(AiActions.LOOTING);
				this.setActionTurns(0);
				
//				LootBox.getInstance().loadLootDisplay(this, this.getTargetAi(), true);
			}
			
			this.aiActions.incrementActionTurns();
		}
		else{
			// have to store ai in case the move action removes this
			Ai targetAi = this.getTargetAi();
			
			this.moveWithinRadius(targetAi.getLocation(), AiData.INTERACTION_RANGE);
			
			this.move();
			this.setAction(AiActions.LOOT);
			
			this.setTargetAi(targetAi);
		}
	}
	
	public Lootable stashSearch() {
		return this.aiActions.stashSearch(this);
	}
	
	public void tradeWithClosestAlly(){
		this.aiActions.tradeWithClosestAlly(this);
	}
	
	public void tradeWithAlly(Ai closestAlly){
		this.aiActions.tradeWithAlly(this, closestAlly);
	}
	
	public void setStunTarget(Ai targetAi){
		this.aiActions.setStunTarget(this, targetAi);
	}
	
	public void setGrappleTarget(Ai targetAi) {
		this.aiActions.setGrappleTarget(this, targetAi);		
	}
	
	public void setBackstabTarget(Ai targetAi){
		this.aiActions.setBackstabTarget(this, targetAi);
	}
	
	public void backstabTarget(){
		this.aiActions.backstabTarget(this);
	}
	
	public boolean didMove() {
		return this.aiPathing.didMove();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public String getImage() {
		return image;
	}
	
	public int getMoveDistance() {
		return this.aiPathing.getMoveDistance();
	}
	
	public int getDefaultMoveDistance(){
		return this.aiPathing.getDefaultMoveDistance();
	}
	
	public double[] getLocation() {
		return this.aiPathing.getLocation();
	}
	
	public double[] getMoveLocation() {
		return this.aiPathing.getMoveLocation();
	}
	
	@Override
	public Weapon getWeapon() {
		return this.aiData.getWeapon();
	}
	
	public int getSwing() {
		return this.aiActions.getSwing();
	}
	
	public int getReloadTurns() {
		return this.aiData.getWeapon().getTurnsSpentReloading();
	}
	
	public boolean isDead() {
		return dead;
	}
	
	public boolean isKillCounted() {
		return killCounted;
	}
	
	public Ai getTargetAi(){
		return this.aiActions.getTargetAi();
	}
	
	public Faction getFaction(){
		Pattern numberPattern = Pattern.compile("[0-9]+");
		Matcher numberMatcher;
		numberMatcher = numberPattern.matcher(team);
		numberMatcher.find();
		String faction = team.substring(numberMatcher.group().length());
		return Faction.getFaction(faction);
	}
	
	public String getTeam(){
		return this.team;
	}
	
	public String getAction(){
		return this.aiActions.getAction();
	}
	
	public double getLookAngle(){
		return this.lookAngle;
	}
	
	public double getEditLookAngle(){
		return this.editLookAngle;
	}
	
	public double getFov(){
		return this.aiData.getFov();
	}
	
	public LevelBlock getLevelBlock(){
		return aiPathing.getLevelBlock();
	}
	
	public Stack<Portal> getPortalPathway(){
		return this.aiPathing.getPortalPathway();
	}
	
	public Stack<double[]> getRoomPathway() {
		return this.aiPathing.getRoomPathway();
	}
	
	public double getMoveAngle(){
		return Maths.getDegrees(this.aiPathing.getLocation(), this.aiPathing.getMoveLocation());
	}
	
	public boolean isTargetHostile(Ai target){
		if(!target.isDead() && 
		   (!this.getFaction().equals(target.getFaction()))){
			return true;
		}
		return false;
	}

	public int getArmour(){
		return this.aiData.getArmour();
	}
	
	public ArrayList<String> getAbilities(){
		return this.aiData.getAbilities();
	}
	
	public boolean hasAbility(String ability){
		return this.aiData.hasAbility(ability);
	}
	
	public int getSkillLevel(String ability){
		return this.aiData.getSkillLevel(ability);
	}
	
	public double[] getAbilityLocation(){
		return this.aiActions.getActionLocation();
	}
	
	public boolean isStealthed(){
		return this.aiData.isStealthed();
	}
	
	public int getStunnedTurns() {
		return stunnedTurns;
	}
	
	@Override
	public Inventory getInventory(){
		return this.aiData.getInventory();
	}
	
	public int getActionTurns(){
		return this.aiActions.getActionTurns();
	}
	
	public boolean isBroadcastingLocation(){
		return this.broadcastingLocation;
	}
	
	public boolean hasActiveEffect(String effectName){
		return this.aiData.hasActiveEffect(effectName);
	}
	
	public boolean hasEffect(String effectName){
		return this.aiData.hasEffect(effectName);
	}
	
	public Effect getEffect(String effectName){
		return this.aiData.getEffect(effectName);
	}
	
	public Effect getEffect(int index){
		return this.aiData.getEffect(index);
	}
	
	public int getNumberOfEffects(){
		return this.aiData.getNumberOfEffects();
	}
	
	public int getCombatScore(){
		return this.aiData.getWeapon().getCombatScore();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setImage(String image){
		this.image = image;
	}
	
	public void setLocation(double[] location) {
		this.setLocation(location[0], location[1]);
	}
	
	public void setLocation(double x, double y) {
		this.aiPathing.setLocation(x,y);
	}
	
	public void setMoveLocation(double[] moveLocation)throws PathNotFoundException{
		this.setMoveLocation(moveLocation[0],moveLocation[1]);
	}
	
	public void setMoveLocation(double x, double y)throws PathNotFoundException{
		
		this.removeOrdersWithoutUpdate(mouseAbilityHandler);
		
		this.aiPathing.setMoveLocation(this, x,y);
	}
	
	public void setMoveLocation(double[] location, boolean ignoreBlockedDoors) throws PathNotFoundException{
		setMoveLocation(location[0],location[1],ignoreBlockedDoors);
	}
	
	public void setMoveLocation(double x, double y, boolean ignoreBlockedDoors)throws PathNotFoundException{
		
		this.removeOrdersWithoutUpdate(mouseAbilityHandler);
		
		this.aiPathing.setMoveLocation(this,x,y,ignoreBlockedDoors);
		
	}
	
	public void setMoveLocationToSelf(){
		this.aiPathing.cancelMovement();
	}
	
	public void aim(Ai targetAi){
		this.aiActions.aim(this,targetAi);
	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		this.aiData.setWeapon(weapon);
	}
	
	public void setSwing(int swing) {
		this.aiActions.setSwing(swing);
	}
	
	public void setDead(Ai killer, boolean dead) {
		
		if(this.hasActiveEffect(ProtectPowerEffect.NAME))
			return;
		
		// Make sure dead unit show smashed helmet
		if(dead && !this.dead){	
			this.setTargetAi(null); 
			this.setSkippingTurns(true);
			
			this.deathReport = new AiDeathReport(this, killer, killer.getWeapon(), this.getLevelBlock(), turnProcess.getTurnCount());
		}
		
		this.dead = dead;
		
	}
	
	public void setDead(boolean dead) {
		
		if(this.hasActiveEffect(ProtectPowerEffect.NAME))
			return;
		
		// Make sure dead unit show smashed helmet
		if(dead && !this.dead){	
			this.setTargetAi(null); 
			this.setSkippingTurns(true);
			
			this.deathReport = new AiDeathReport(this, this.getLevelBlock(), turnProcess.getTurnCount());
		}
		
		this.dead = dead;
		
	}
	
	public void bodyFound(boolean killCounted) {
		this.killCounted = killCounted;
	}
	
	public AiDeathReport getDeathReport() {
		return this.deathReport;
	}
	
	public void setTeam(String team){
		this.team = team;
	}
	
	public void setTargetAi(Ai targetAi){
		this.aiActions.setTargetAi(targetAi);
	}
	
	public void setLookAngle(double[] lookLocation){
		this.editLookAngle = Maths.getDegrees(this.getLocation(), lookLocation);
	}
	
	public void setLookAngle(double lookAngle){
		this.editLookAngle = lookAngle;
	}
	
	protected void setTrueLookAngle(double[] lookLocation){
		setTrueLookAngle(lookLocation[0], lookLocation[1]);
	}
	
	protected void setTrueLookAngle(double lookAngle){
		this.lookAngle = lookAngle;
		this.editLookAngle = lookAngle;
	}
	
	protected void setTrueLookAngle(double x, double y){
		this.lookAngle = Maths.getDegrees(this.getLocation()[0],this.getLocation()[1], x, y);
		this.editLookAngle = lookAngle;
	}
	
	public void setLevelBlock(LevelBlock residentBlock){
		this.aiPathing.setLevelBlock(residentBlock);
	}
	
	public void setAction(String action){
		this.aiActions.setAction(action);
	}
	
	public void setFov(int fov){
		this.aiData.setFov(fov);
	}
	
	protected void deletePortalPathway(){
		this.aiPathing.deletePortalPathway();
	}
	
	public void setMoveDistance(int moveDistance){
		this.aiPathing.setMoveDistance(moveDistance);
	}
	
	public void setDefaultMoveDistance(int defaultMoveDistance){
		this.aiPathing.setDefaultMoveDistance(defaultMoveDistance);
	}
	
	public void resetMoveDistance(){
		this.aiPathing.resetMoveDistance();
	}
	
	public void setAbilityLocation(double x, double y){
		this.aiActions.setActionLocation(x,y);
	}
	
	public void setStealthed(boolean stealthed){
		this.aiData.setStealthed(stealthed);
	}
	
	public void setStunnedTurns(int stunnedTurns) {
		this.stunnedTurns = stunnedTurns;
	}

	public void setArmour(int armour){
		this.aiData.setArmour(armour);
	}
	
	@Override
	public void addItem(Item item){
		this.aiData.addItem(item);
		this.assignAbilities();
	}
	
	public void setBroadcastingLocation(boolean broadcastingLocation){
		this.broadcastingLocation = broadcastingLocation;
	}
	
	public void addEffect(Effect effect){
		this.aiData.addEffect(this, effect);
	}
	
	public boolean isInCover(){
		return this.getLevelBlock().isInCover(this.getLocation());
	}
	
	public Polygon getCoverObject(){
		return this.getLevelBlock().getCoverObject(this.getLocation());
	}
	
	public void setSkill(String ability, int skillLevel){
		this.aiData.setSkill(ability, skillLevel);
	}
	
	public Map<String, Integer> getSkills(){
		return this.aiData.getSkills();
	}

	public boolean isSkippingTurns() {
		return skippingTurns;
	}

	public void setSkippingTurns(boolean skippingTurns) {
		this.skippingTurns = skippingTurns;
	}

	public void moveIntra(double[] moveLocation){
		this.aiPathing.moveIntra(this, moveLocation);
	}
	
	public void purge() {
		this.aiPathing = null;
		this.aiData = null;
		this.aiActions = null;
	}

	public void ignoreLOS(boolean ignoreLOS) {
		this.ignoreLOS = ignoreLOS;
	}
	
	public boolean isIgnoringLOS(){		
		return this.ignoreLOS;
	}

	@Override
	public void assignAbilities() {
		this.aiData.assignAbilities(this);
	}
	
	public void clearAbilities() {
		this.aiData.clearAbilities();
	}

	public void setOldTargetSwing(int oldTargetSwing) {
		this.aiActions.setOldTargetSwing(oldTargetSwing);
	}

	public Ai getOldTargetAi() {
		return this.aiActions.getOldTargetAi();
	}

	public void setOldTargetAi(Ai oldTargetAi) {
		this.aiActions.setOldTargetAi(oldTargetAi);
	}

	public void move() {
		this.aiPathing.move(this);
	}

	public void cancelMovement() {
		this.aiPathing.cancelMovement();
	}
	
	public void setDefaultFov(int defaultFov){
		this.aiData.setDefaultFov(defaultFov);
	}
	
	public void setDefaultArmour(int defaultArmour){
		this.aiData.setDefaultArmour(defaultArmour);
	}

	public void clearSkills(){
		this.aiData.clearSkills();
	}

	public Color getTeamColour() {
		Color returnColour = null;
		switch(this.getFaction()){
			case BANDITS:
				returnColour = Color.red;
			break;
			case WHITE_VISTA:
				returnColour = Color.white;
			break;
			case LONER:
				returnColour = Color.gray;
			break;
			case PLAYER:
				returnColour = Color.green;
			break;
		}
		return returnColour;
	}

	public void setNextAi(Ai nextAi) {
		this.nextAi = nextAi;
	}

	public void updateLevelBlock() {
		this.aiPathing.updateLevelBlock();
	}

}
