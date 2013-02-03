package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.combatEffects.Effect;
import atrophy.combat.items.ArmourPlates1;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.HackTool;
import atrophy.combat.items.Inventory;
import atrophy.combat.items.Item;
import atrophy.combat.items.KillTags;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.MeleeWeapon2;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.SpeedBooster;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.items.Weapon;
import atrophy.combat.items.WeldingTorch;
import atrophy.combat.mechanics.Abilities;

public class AiData {

	public static final int INTERACTION_RANGE = 60;

	private static final int DEFAULT_FOV = 120;
	
	private Weapon weapon;
	
	private ArrayList<Effect> activeEffects;
	
	private Effect queuedEffect;

	private Map<String,Integer> skillLevels;
	
	private int armour;
	
	private int accuracyBoost;
	
	private int defaultArmour;
	
	private int defaultFov;
	
	private int fov;
	
	private ArrayList<String> abilities;
	
	private Inventory inventory;

	private boolean stealthed;
	
	private MouseAbilityHandler mouseAbilityHandler;
	
	public AiData(MouseAbilityHandler mouseAbilityHandler, Ai invoker, Weapon weapon){
		
		this.defaultArmour = 15;
		this.armour = 15;
		this.accuracyBoost = 0;
		
		
		this.fov = DEFAULT_FOV;
		this.defaultFov = fov;
		
		this.weapon = weapon;
	
		inventory = new Inventory();
		
		this.activeEffects = new ArrayList<Effect>();
		this.skillLevels = new HashMap<String, Integer>();
		
		abilities = new ArrayList<String>(1);
		
		defaultSkills();
		assignAbilities(invoker);
		
		this.mouseAbilityHandler = mouseAbilityHandler;
	}
	
	private void defaultSkills() {
		this.setSkill(Abilities.GRENADETHROWER, 0);
		this.setSkill(Abilities.SCAN_SCIENCE, 0);
		this.setSkill(Abilities.XRAY_SCAN, 0);
		this.setSkill(Abilities.SPEED_BOOSTER, 0);
		this.setSkill(Abilities.STEALTH1, 0);
		this.setSkill(Abilities.STEALTH2, 0);
		this.setSkill(Abilities.STUNGRENADETHROWER, 0);
		this.setSkill(Abilities.WELDING, 0);
	}
	
	public void clearSkills(){
		this.skillLevels.clear();
	}
	
	public void assignAbilities(Ai invoker){
		
		this.abilities.clear();
		
		this.abilities.add(Abilities.SPEECH);
		
		// Ability Items
		if(this.inventory.hasItem(GrenadeItem.getInstance())){
			this.abilities.add(Abilities.GRENADETHROWER);
		}
		if(this.inventory.hasItem(StunGrenadeItem.getInstance())){
			this.abilities.add(Abilities.STUNGRENADETHROWER);
		}
		if(this.inventory.hasItem(WeldingTorch.getInstance())){
			this.abilities.add(Abilities.WELDING);
		}
		if(this.inventory.hasItem(SensorSuite.getInstance())){
			this.abilities.add(Abilities.XRAY_SCAN);
		}
		if(this.inventory.hasItem(MediumStealthField.getInstance())){
			this.abilities.add(Abilities.STEALTH2);
		}
		if(this.inventory.hasItem(LightStealthField.getInstance())){
			this.abilities.add(Abilities.STEALTH1);
		}
		if(this.inventory.hasItem(ScienceScanner.getInstance())){
			this.abilities.add(Abilities.SCAN_SCIENCE);
		}
		if(this.inventory.hasItem(SpeedBooster.getInstance())){
			this.abilities.add(Abilities.SPEED_BOOSTER);
		}
		if(this.inventory.hasItem(UnitDetector.getInstance())){
			this.abilities.add(Abilities.UNIT_DETECTOR);
		}
		if(this.inventory.hasItem(KillTags.getInstance())){
			this.abilities.add(Abilities.KILL_TAGS);
		}
		if(this.inventory.hasItem(HackTool.getInstance())){
			this.abilities.add(Abilities.HACK);
		}
		
		// Melee
		if(this.getWeapon() instanceof MeleeWeapon1){
			this.abilities.add(Abilities.PARRY);
		}
		else if(this.getWeapon() instanceof MeleeWeapon2){
//			this.abilities.add(Abilities.SLIT_MELEE);
			this.abilities.add(Abilities.PARRY);
		}
		
		// Armour
		if(this.inventory.hasItem(ArmourPlates2.getInstance())){
			this.setArmour(ArmourPlates2.ARMOUR_VALUE);
		}
		else if(this.inventory.hasItem(ArmourPlates1.getInstance())){
			this.setArmour(ArmourPlates1.ARMOUR_VALUE);
		}
		else{
			this.setArmour(this.getDefaultArmour());
		}
		
		// Accuracy Mods
		if(true) {
			this.accuracyBoost = 0;
		}
		
		
		if(invoker.getLevelBlock() == null){
			return;
		}
		
		if(invoker.getLevelBlock().isInStealth(invoker.getLocation()) && 
		   Maths.getDistance(invoker.getLocation(), invoker.getMoveLocation()) == 0 &&
		   !invoker.getAction().equals(AiCombatActions.AIMING) && !invoker.getAction().equals(AiCombatActions.SHOOTING)){
			this.abilities.add(Abilities.STASH_SEARCH);
			this.stealthed = true;
		}
		
	}
	
	public void clearAbilities(){
		this.abilities.clear();
	}
	
	public void handleEffects(Ai invoker, String action){
		if(this.queuedEffect != null &&
		   action.startsWith("Applying:") &&
		   !hasActiveEffect(queuedEffect.getName())){
			
			this.activeEffects.add(queuedEffect);
		}
		queuedEffect = null;
		
		Iterator<Effect> itr = activeEffects.iterator();
		Effect element;
		while(itr.hasNext()) {

			element = itr.next(); 
		    
		    element.tickEffect(invoker);
		    
		    if(element.isExpired()){
		    	itr.remove();
		    }
		} 
	}

	public boolean hasActiveEffect(String effectName){
		for(Effect loopEffect: this.activeEffects){
			if(effectName.equals(loopEffect.getName())){
				return true;
			}
		}
		return false;
	}
	
	public Effect getEffect(String effectName){
		
		for(Effect loopEffect: this.activeEffects){
			if(effectName.equals(loopEffect.getName())){
				return loopEffect;
			}
		}
		return null;
	}
	
	public Effect getEffect(int index){
		return this.activeEffects.get(index);
	}
	
	public int getNumberOfEffects(){
		return this.activeEffects.size();
	}
	
	public void setSkill(String ability, int skillLevel){
		this.skillLevels.put(ability,skillLevel);
	}
	
	public void setArmour(int armour){
		this.armour = armour;
	}
	
	public Map<String, Integer> getSkills(){
		return this.skillLevels;
	}

	public void resetStates() {
		this.fov = this.defaultFov;	
		this.stealthed = false;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public ArrayList<Effect> getActiveEffects() {
		return activeEffects;
	}

	public Effect getQueuedEffect() {
		return queuedEffect;
	}

	public Map<String, Integer> getSkillLevels() {
		return skillLevels;
	}

	public int getArmour() {
		return armour;
	}

	public int getFov() {
		return fov;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void setQueuedEffect(Effect queuedEffect) {
		this.queuedEffect = queuedEffect;
	}

	public void setFov(int fov) {
		this.fov = fov;
	}
	
	public int getAccuracyBoost() {
		return accuracyBoost;
	}

	public int getDefaultArmour() {
		return defaultArmour;
	}

	public void setDefaultArmour(int defaultArmour) {
		this.defaultArmour = defaultArmour;
	}

	public int getSkillLevel(String ability) {
		return this.skillLevels.get(ability);
	}

	public void setAbilities(ArrayList<String> abilities){
		this.abilities = abilities;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public boolean addItem(Item item) {
		return this.inventory.addItem(item);
	}

	public void removeGrenade() {
		this.inventory.removeGrenade();
	}

	public void removeStunGrenade() {
		this.inventory.removeStunGrenade();
	}

	public boolean hasAbility(String ability) {
		return this.abilities.contains(ability);
	}

	public boolean isStealthed() {
		return this.stealthed;
	}

	public ArrayList<String> getAbilities() {
		return this.abilities;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setStealthed(boolean stealthed) {
		this.stealthed = stealthed;
	}
	
	public int getDefaultFov() {
		return defaultFov;
	}

	public void setDefaultFov(int defaultFov) {
		this.defaultFov = defaultFov;
	}

	public void addEffect(Ai invoker, Effect effect) {
		if(!this.hasActiveEffect(effect.getName())){
			invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
			invoker.setAction("Applying: "+effect.getName());
			setQueuedEffect(effect);
		}
	}
	
	
	
}
