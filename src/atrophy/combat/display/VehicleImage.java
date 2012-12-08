package atrophy.combat.display;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import watoydoEngine.gubbinz.Maths;

public class VehicleImage extends AiImage {

	private double[] previousLocation;
	
	public VehicleImage(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, PanningManager panningManager, String tag, double x, double y, MouseAbilityHandler mouseAbilityHandler) {
		super(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, tag, x, y, mouseAbilityHandler);
		
		this.previousLocation = new double[]{x,y};
	}
	
	@Override
	public void updateTween() {
		super.updateTween();
		
		if(Maths.getDistance(previousLocation, this.getAi().getLocation()) > 18)
			this.setRotation(Maths.getRads(previousLocation, this.getAi().getLocation()) + (Math.PI / 2));
		
		previousLocation = this.getAi().getLocation().clone();
		
	}
	

}
