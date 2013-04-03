package atrophy.combat.display;

import java.util.HashMap;
import java.util.Map;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.FloatingIcons;

public class DaemonImage extends AiImage {
	
	private static final Map<Animation, double[]> ANIMATION_OFFSETS = new HashMap<>();
	
	{
		ANIMATION_OFFSETS.put(Animation.IDLE_MELEE, 	new double[]{0.25, 0.66});
		ANIMATION_OFFSETS.put(Animation.ATTACK_MELEE, 	new double[]{0.22, 0.63});
	}

	public DaemonImage(AiCrowd aiCrowd,
			CombatMembersManager combatMembersManager,
			CombatUiManager combatUiManager,
			CombatVisualManager combatVisualManager,
			PanningManager panningManager, double x, double y,
			MouseAbilityHandler mouseAbilityHandler, FloatingIcons floatingIcons) {
		super(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager,
				panningManager, x, y, mouseAbilityHandler, floatingIcons);
		
		attackFrame = 6;
	}
	
	public void setAnimation(Animation animation, int maxFrame) {
		this.frame = 0;
		this.maxFrame = maxFrame;
		
		if(!this.animation.equals(animation) && !animation.equals(Animation.WALK)) {
			this.animation = animation;
			this.imageChanged = true;
			this.setTween(null);
			this.setLocation(this.getAi().getLocation()[0], this.getAi().getLocation()[1]);
			updateAnimation();
		}
		
		this.animation = animation;
		
		double[] animationOffset = ANIMATION_OFFSETS.get(animation);
		this.xOffset = animationOffset[0];
		this.yOffset = animationOffset[1];
	}
	
	public void setAttackingAnimation(Ai targetAi) {
		
		this.attackTarget = targetAi;
		
		int maxFrame = 6;
		
		if(this.getAi().getWeapon().isMelee())
			maxFrame = 7;

		this.setAnimation(getAttackAnimation(), maxFrame);
	}
	
	public void updateAnimation() {

		if(!this.getAi().isDead())
			this.frame++;
		else if(deathFrame < attackFrame)
			deathFrame++;
		
		if(this.frame == maxFrame && !this.getAi().isDead()) {
			this.setAnimation(this.getIdleAnimation(), 4);
		}
		
		this.setImage(aiCrowd.getAnimationFrame("DaemonFull", frame, animation));
		
		if(deathFrame == attackFrame && !this.animation.equals(Animation.DEAD)) {
			this.setAnimation(Animation.DEAD, 1);
			this.updateAnimation();
		}
		
		if(this.isVisible() && this.frame == attackFrame &&
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
