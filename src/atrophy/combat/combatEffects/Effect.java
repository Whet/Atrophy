/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

/**
 * The Class Effect.
 */
public abstract class Effect {
	
	/**
	 * The time left.
	 */
	private int timeLeft;
	
	/**
	 * The cool down.
	 */
	private int coolDown;
	
	/**
	 * The expired.
	 */
	private boolean expired;
	
	/**
	 * The name.
	 */
	private String name;
	
	/**
	 * The skill level.
	 */
	protected int skillLevel;
	
	/**
	 * Instantiates a new effect.
	 *
	 * @param timeLeft the time left
	 * @param cooldown the cooldown
	 * @param name the name
	 * @param skillLevel the skill level
	 */
	public Effect(int timeLeft, int cooldown, String name, int skillLevel){
		this.timeLeft = timeLeft;
		this.coolDown = cooldown;
		
		this.name = name;		
		
		expired = false;
		
		this.skillLevel = skillLevel;
	}
	
	/**
	 * Tick effect.
	 *
	 * @param affectedAi the affected ai
	 */
	public void tickEffect(Ai affectedAi){
		
		this.tickTimer();
		
		if(timeLeft > 0){
			this.applyEffect(affectedAi);
		}
		else{
			this.removeEffect(affectedAi);	
		}
		
		if(coolDown <= 0){
			this.expired = true;
		}
		
		//System.out.println("DUR: "+this.timeLeft +" CDN: "+this.coolDown);
	}
	
	/**
	 * Removes the effect.
	 *
	 * @param affectedAi the affected ai
	 */
	protected abstract void removeEffect(Ai affectedAi);

	/**
	 * Apply effect.
	 *
	 * @param affectedAi the affected ai
	 */
	protected abstract void applyEffect(Ai affectedAi);
	
	/**
	 * Tick timer.
	 */
	private void tickTimer(){
		if(timeLeft > 0){
			timeLeft--;
		}
		else{
			this.coolDown--;
		}
	}
	
	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public int getDuration(){
		return this.timeLeft;
	}
	
	/**
	 * Gets the cooldown.
	 *
	 * @return the cooldown
	 */
	public int getCooldown(){
		return this.coolDown;
	}
	
	/**
	 * Checks if is expired.
	 *
	 * @return true, if is expired
	 */
	public boolean isExpired(){
		return expired;
	}
	
	/**
	 * Stop effect.
	 */
	protected void stopEffect(){
		this.timeLeft = 0;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName(){
		return this.name;
	}
}
