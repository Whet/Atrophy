package atrophy.combat.ai;

import atrophy.combat.items.Weapon;
import watoydoEngine.gubbinz.Maths;

public class ThinkingAiEmotion {

	// Aggression profiles
	public static final int PASSIVE = -2;
	public static final int PASSIVE_RESPOND = -1;	
	public static final int PASSIVE_COMBATSCORE_DIFFERENCE = 80;
	public static final int AGGRESSIVE_FIGHTER = 1; 
	public static final int MINDLESS_TERROR = 2;	
	
	public static final int AGGRESSIVE_FIGHTER_COMBATSCORE_DIFFERENCE = 120;
	public static final int MINDLESS_TERROR_COMBATSCORE_DIFFERENCE = 80;
	
	public static final double AGGRESSION_RESTORE_RATE = 0.005;
	
	public static final double TEAM_MEMBER_KILLED = +1.5;
	public static final double SHOT_AT = +0.8;
	public static final double AIMING_AGGRESSION = +0.3;
	public static final double FAILED_INTIMIDATION = +0.2;
	public static final double SUCCESSFUL_INTIMIDATION = -0.3;
	public static final double HIGHWAYMAN_FIGHT = + 0.4;

	
	private int baseAggression;
	private double aggression;
	private boolean aggressionModified;
	
	private ThinkingAi ai;
	
	public ThinkingAiEmotion(ThinkingAi ai) {
		aggression = ThinkingAiEmotion.PASSIVE_RESPOND;
		baseAggression = ThinkingAiEmotion.PASSIVE_RESPOND;
		aggressionModified = false;
		
		this.ai = ai;
	}

	public boolean isAggressionModified() {
		return aggressionModified;
	}

	public double getAggression() {
		return aggression;
	}

	public void setAggressionModified(boolean aggressionModified) {
		this.aggressionModified = aggressionModified;
	}
	
	public void setAggression(int aggression) {
		this.aggression = aggression;
	}
	
	public void setBaseAggression(int aggression){
		this.baseAggression = aggression;
		this.aggression = aggression;
	}
	
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
	
	public void reactToCloseEnemy(Ai target) {
		
		if(ai.getIncapTurns() == 0 && target.getIncapTurns() == 0){
			double distance = Maths.getDistance(ai.getLocation(), target.getLocation());
			
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

	public boolean hasAccuracyForAggressionLevel(ThinkingAi thinkingAi){
		if(Math.abs(getAggression()) > 1 && thinkingAi.getSwing() * Weapon.SWING_BONUS + thinkingAi.getWeapon().getAccuracy() > 60 * getAggression()){
			return true;
		}
		else if(thinkingAi.getSwing() * Weapon.SWING_BONUS + thinkingAi.getWeapon().getAccuracy() > 50){
			return true;
		}
		return false;
	}

	public int getCombatScoreThreshold() {
		int threshold = 0;
		switch((int)Math.floor(getAggression())){
			case ThinkingAiEmotion.PASSIVE:
				threshold = 0;
			break;
			case ThinkingAiEmotion.PASSIVE_RESPOND:
			case 0:
				threshold = ThinkingAiEmotion.PASSIVE_COMBATSCORE_DIFFERENCE;
			break;
			case ThinkingAiEmotion.AGGRESSIVE_FIGHTER:
				threshold = ThinkingAiEmotion.AGGRESSIVE_FIGHTER_COMBATSCORE_DIFFERENCE;
			break;
			case ThinkingAiEmotion.MINDLESS_TERROR:
				threshold = ThinkingAiEmotion.MINDLESS_TERROR_COMBATSCORE_DIFFERENCE;
			break;
		}
		return threshold;
	}
	
}
