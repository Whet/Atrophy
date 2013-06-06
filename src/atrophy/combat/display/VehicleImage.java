package atrophy.combat.display;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.ui.FloatingIcons;
import watoydoEngine.utils.Maths;

public class VehicleImage extends AiImage {

	private double[] previousLocation;
	
	public VehicleImage(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, PanningManager panningManager, double x, double y, MouseAbilityHandler mouseAbilityHandler, FloatingIcons floatingIcons) {
		super(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, x, y, mouseAbilityHandler, floatingIcons);
		
		this.previousLocation = new double[]{x,y};
		this.setAnimation(Animation.IDLE_MELEE, 0);
	}
	
	@Override
	public void updateTween() {
		super.updateTween();
		
		if(Maths.getDistance(previousLocation, this.getAi().getLocation()) > 18)
			this.setRotation(Maths.getRads(previousLocation, this.getAi().getLocation()) + (Math.PI / 2));
		
		previousLocation = this.getAi().getLocation().clone();
		
	}
	
	@Override
	public void updateAnimation() {
		
		if(!this.getAi().isDead())
			this.frame++;
		else if(deathFrame < attackFrame)
			deathFrame++;
		
		if(this.frame >= maxFrame && !this.getAi().isDead()) {
			this.setAnimation(this.getIdleAnimation(), 0);
		}
		
		this.setImage(aiCrowd.getAnimationFrame(this.getAi().getImage() + "Full", frame, animation));
		
		if(deathFrame >= attackFrame && !this.animation.equals(Animation.DEAD)) {
			this.setAnimation(Animation.DEAD, 0);
			this.updateAnimation();
		}
		
		if(this.isVisible() && this.frame >= attackFrame &&
		  (this.animation.equals(Animation.ATTACK_MELEE) || this.animation.equals(Animation.ATTACK_WEP1) || this.animation.equals(Animation.ATTACK_WEP2) || this.animation.equals(Animation.ATTACK_WEP3))){
			floatingIcons.addEffect(this.getAi().getWeapon().getFireEffect(panningManager, this.getAi().getLocation(), attackTarget.getLocation()));
			attackTarget = null;
		}
		
		if(imageChanged) {
			this.imageChanged = false;
			updateImage();
		}
	}
	

}
