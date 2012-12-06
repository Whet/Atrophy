package atrophy.combat.ai;

import atrophy.actions.MouseAbilityHandler;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelManager;


public class VehicleAi extends Ai {

	private String vehicleType;
	
	public VehicleAi(PanningManager panningManager, FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler, String name, String vehicleType, double x, double y, LevelManager levelManager, CombatInorganicManager combatInorganicManager, LootBox lootBox, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, AiCrowd aiCrowd) {
		super(floatingIcons, mouseAbilityHandler, name, x, y, combatInorganicManager, levelManager, lootBox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd, panningManager);
		this.vehicleType = vehicleType;
	}

	@Override
	public void setDead(boolean dead) {
		this.dead = dead;
		
		if(this.dead){	
			
			this.setTargetAi(null); 
			this.setSkippingTurns(true);
			
			if(!this.getImage().endsWith("Dead")){
				this.setImage(getImage() + "Dead");
			}
		}
		
	}
	
	@Override
	public void loot(Ai lootAi) {}
	
	@Override
	public void assignAbilities() {
		this.clearAbilities();
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	
	
	
}
