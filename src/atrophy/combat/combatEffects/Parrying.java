/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

/**
 * The Class MobileInvisibility.
 */
public class Parrying extends Effect{

	public static final int DURATION = 2;
	public static final int COOLDOWN = 5;
	
	public static final String NAME = "Parry";

	public static final int STUN_TURNS = 2;
	
	public Parrying(){
		super(DURATION,COOLDOWN, NAME, 0);
	}
	
	@Override
	protected void applyEffect(Ai affectedAi) {
	}

	@Override
	protected void removeEffect(Ai affectedAi) {
	}
	
}
