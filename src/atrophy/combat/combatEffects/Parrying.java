/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

/**
 * The Class MobileInvisibility.
 */
public class Parrying extends Effect{

	/**
	 * The Constant DURATION.
	 */
	public static final int DURATION = 1;
	
	/**
	 * The Constant COOLDOWN.
	 */
	public static final int COOLDOWN = 5;
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Parry";

	public static final int STUN_TURNS = 2;
	
	/**
	 * Instantiates a new mobile invisibility.
	 *
	 * @param skillLevel the skill level
	 */
	public Parrying(){
		super(DURATION,COOLDOWN, NAME, 0);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.combatEffects.Effect#applyEffect(atrophy.combat.ai.Ai)
	 */
	@Override
	protected void applyEffect(Ai affectedAi) {
		this.stopEffect();
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.combatEffects.Effect#removeEffect(atrophy.combat.ai.Ai)
	 */
	@Override
	protected void removeEffect(Ai affectedAi) {
	}
	
	@Override
	public boolean isExpired() {
		return true;
	}

}
