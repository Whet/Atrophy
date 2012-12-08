package atrophy.combat.ai;

import atrophy.combat.CombatInorganicManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.SpeedBooster;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.Abilities;

public class MuleAi extends VehicleAi {

	private static final int ARMOUR = 200;
	public static final String MULE = "MULE";

	public MuleAi(PanningManager panningManager, FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler, String name, double x, double y, CombatInorganicManager combatInorganicManager, LevelManager levelManager, LootBox lootBox, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, AiCrowd aiCrowd) {
		super(panningManager, floatingIcons, mouseAbilityHandler, name, MuleAi.MULE, x, y, levelManager, combatInorganicManager, lootBox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd);
		this.setArmour(ARMOUR);
		this.setDefaultArmour(ARMOUR);
		this.setFov(0);
		this.setDefaultFov(0);
		this.setMoveDistance(34);
		this.setDefaultMoveDistance(34);
		
		defaultSkills();
	}
	
	private void defaultSkills() {
		this.clearSkills();
		this.setSkill(Abilities.SCAN_SCIENCE, 0);
		this.setSkill(Abilities.XRAY_SCAN, 0);
		this.setSkill(Abilities.SPEED_BOOSTER, 0);
		this.setSkill(Abilities.STEALTH1, 0);
		this.setSkill(Abilities.STEALTH2, 0);
	}

	@Override
	public void aim(Ai targetAi) {}
	
	@Override
	public void assignAbilities() {
		this.clearAbilities();
		this.setArmour(ARMOUR);
		
		if(this.getInventory().hasItem(SensorSuite.getInstance())){
			this.getAbilities().add(Abilities.XRAY_SCAN);
		}
		if(this.getInventory().hasItem(MediumStealthField.getInstance())){
			this.getAbilities().add(Abilities.STEALTH2);
		}
		if(this.getInventory().hasItem(LightStealthField.getInstance())){
			this.getAbilities().add(Abilities.STEALTH1);
		}
		if(this.getInventory().hasItem(ScienceScanner.getInstance())){
			this.getAbilities().add(Abilities.SCAN_SCIENCE);
		}
		if(this.getInventory().hasItem(SpeedBooster.getInstance())){
			this.getAbilities().add(Abilities.SPEED_BOOSTER);
		}
		if(this.getInventory().hasItem(UnitDetector.getInstance())){
			this.getAbilities().add(Abilities.UNIT_DETECTOR);
		}
	}

}
