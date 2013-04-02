package atrophy.combat.ai;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.mechanics.ScoringMechanics;

public class AiCombatActions {

	public static final String AIMING = "Aim";
	
	public static final String SHOOTING = "Shoot";
	
	private int swing;
	
	private int oldTargetSwing;
	
	private Ai targetAi;

	private Ai oldTargetAi;

	private CombatVisualManager combatVisualManager;
	private MouseAbilityHandler mouseAbilityHandler;
	private AiCrowd aiCrowd;
	
	public AiCombatActions(CombatVisualManager combatVisualManager, MouseAbilityHandler mouseAbilityHandler, AiCrowd aiCrowd){
		this.swing = 0;
		this.oldTargetSwing = 0;
		this.combatVisualManager = combatVisualManager;
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.aiCrowd = aiCrowd;
	}

	public void attack(Ai invoker) {
		
		// if the target is still in the same room engage
		if(this.targetAi != null && this.targetAi.getLevelBlock() == invoker.getLevelBlock() && invoker.getWeapon().ignoresLOS() ||(
		   (!this.targetAi.isStealthed() || CombatVisualManager.spotStealth(invoker, this.targetAi)) && CombatVisualManager.isInFiringSight(invoker.getLocation()[0],
				   																												   invoker.getLocation()[1], 
					   																										       this.targetAi.getLocation()[0], 
					   																										       this.targetAi.getLocation()[1], invoker.getLevelBlock()))){
			
			if(invoker.getWeapon().isInRange(invoker, this.getTargetAi())){
				// break any alliances with the faction if visible
				if(this.getTargetAi() instanceof ThinkingAi &&
				   combatVisualManager.isAiInSight(invoker, targetAi.getFaction())){
					
					((ThinkingAi) this.getTargetAi()).getCommander().removeAlliance(invoker.getFaction());
					((ThinkingAi) this.getTargetAi()).getCommander().addHatedAi(invoker);
					
				}
				
				// if fire action and if bullets left to fire and a target to shoot at
				// or if melee, can't charge up swing so just attack
				if(invoker.getWeapon().isMelee() || (invoker.getAction().equals(SHOOTING) && invoker.getWeapon().hasAmmo())){			
					shoot(invoker);
				}
				// if target and ammo, then increase swing
				else if(invoker.getAction().equals(AIMING) && invoker.getWeapon().hasAmmo()){
	
					swing++;
					oldTargetSwing = swing;
					
					if(swing > invoker.getWeapon().getMaxSwing()){
						this.swing = invoker.getWeapon().getMaxSwing();
					}
					
					// look at target
					invoker.setTrueLookAngle(this.targetAi.getLocation());
				}
				else{
					// reload whilst still looking at target
					
					reload(invoker);
					
					// reset swing
					swing = 0;
					oldTargetSwing = swing;
					
					invoker.setTrueLookAngle(this.targetAi.getLocation());
				}
			}
			else{
				
				Ai target = this.getTargetAi();
				
				// move towards target until in range
				invoker.moveWithinRadius(this.getTargetAi().getLocation(), invoker.getWeapon().getRange() - (Math.random() * 10));
				invoker.setAction("Move");
				invoker.move();
				invoker.setActionTurns(0);
				
				// reset to aiming
				invoker.removeOrdersWithoutUpdate(mouseAbilityHandler);
				this.targetAi = target;
				invoker.setAction(AIMING);
				this.swing = 0;
				
				invoker.setTrueLookAngle(this.targetAi.getLocation());
			}
		}
		else{
			
			// target is lost
			this.targetAi = null;
			
			reload(invoker);
			
			// reset swing
			swing = 0;
			oldTargetSwing = swing;
			
			invoker.setAction(AiActions.NO_ACTION);
		}
	}


	public void shoot(Ai invoker) {
		
		AiImage actorMask = aiCrowd.getActorMask(invoker);
		actorMask.setAttackingAnimation(invoker.getTargetAi());
		
		// Update aggression of ai
		if(this.getTargetAi() instanceof ThinkingAi){
			((ThinkingAi) this.getTargetAi()).modifyAggression(ThinkingAiEmotion.SHOT_AT);
		}
		
		// look at target
		invoker.setTrueLookAngle(this.getTargetAi().getLocation());
		
		// increase shot count
		invoker.getWeapon().reduceAmmoByOne();
		
		// if a hit
		// being in the weapons range allows a re-roll
		if(ScoringMechanics.killedTarget(invoker,this.getTargetAi())){
			
			// kill target
			this.getTargetAi().setDead(true);
			
			// if the killer belongs to player faction then the kill is counted
			if(invoker.getFaction().equals(AiGenerator.PLAYER)){
				this.getTargetAi().bodyFound(true);
			}
			
			// Cancel aim
			this.setTargetAi(null);
			
			invoker.setAction(AiActions.NO_ACTION);
			
		}
		// if target still alive then go back to aiming
		else{
			invoker.setAction(AIMING);
		}
		
		// reset swing counter
		swing = 0;
		oldTargetSwing = 0;
	}

	public int getSwing() {
		return swing;
	}

	public int getOldTargetSwing() {
		return oldTargetSwing;
	}

	public Ai getTargetAi() {
		return targetAi;
	}

	public Ai getOldTargetAi() {
		return oldTargetAi;
	}

	public void setSwing(int swing) {
		this.swing = swing;
	}

	public void setOldTargetSwing(int oldTargetSwing) {
		this.oldTargetSwing = oldTargetSwing;
	}

	public void setTargetAi(Ai targetAi) {
		this.targetAi = targetAi;
	}

	public void setOldTargetAi(Ai oldTargetAi) {
		this.oldTargetAi = oldTargetAi;
	}

	public void aim(Ai invoker, Ai newTargetAi) {
			//if(!this.action.equals("Looting")){
			
			// if already selected then clicks alternate between firing and aiming
			if(newTargetAi == targetAi){
				
				if(invoker.getAction().equals(AIMING)){
					// if no swing then cancel aim altogether or no ammo
					if(swing == 0 || !invoker.getWeapon().hasAmmo()){
						invoker.setAction("");
						this.targetAi = null;
					}
					// otherwise fire
					else{
						invoker.setAction(SHOOTING);
					}
				}
				else if(invoker.getAction().equals(SHOOTING)){
					this.targetAi = newTargetAi;
					invoker.setAction(AIMING);
				}
			}
			else{
				this.targetAi = newTargetAi;
				
				invoker.setAction(AIMING);
				
				this.swing = 0;
				
			}
			
			
			// if user selects a different target then returns to original within the pause between turns, restore original swing
			if(newTargetAi == oldTargetAi){
				this.swing = oldTargetSwing;
			}
			
			invoker.cancelMovement();
			
			// update swing counter
//			combatUiManager.getCombatInfo().updateText();
		//}
	}
	
	public void reload(Ai invoker){
		if(!invoker.getWeapon().hasFullAmmo()){
			invoker.getWeapon().reload();
		}
	}
	
}
