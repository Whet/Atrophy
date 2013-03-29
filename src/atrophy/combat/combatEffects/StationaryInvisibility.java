/*
 * 
 */
package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

/**
 * The Class StationaryInvisibility.
 */
public class StationaryInvisibility extends Effect{

	/**
	 * The Constant DURATION.
	 */
	public static final int DURATION = 20;
	
	/**
	 * The Constant COOLDOWN.
	 */
	public static final int COOLDOWN = 4;
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Stationary Stealth";
	
	/**
	 * Instantiates a new stationary invisibility.
	 *
	 * @param skillLevel the skill level
	 */
	public StationaryInvisibility(int skillLevel){
		super(DURATION + 3 * skillLevel,COOLDOWN, NAME, skillLevel);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.combatEffects.Effect#applyEffect(atrophy.combat.ai.Ai)
	 */
	@Override
	protected void applyEffect(Ai affectedAi) {
		affectedAi.setStealthed(true);
		if(affectedAi.didMove() ||(
		   !affectedAi.getAction().equals("") &&
		   !affectedAi.getAction().equals("Stealthed") &&
		   !affectedAi.getAction().startsWith("Applying:"))){
			this.stopEffect();
			affectedAi.setStealthed(false);
		}
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.combatEffects.Effect#removeEffect(atrophy.combat.ai.Ai)
	 */
	@Override
	protected void removeEffect(Ai affectedAi) {
		affectedAi.setStealthed(false);
	}

}
