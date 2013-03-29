/*
 * 
 */
package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

/**
 * The Class SpeedBoost.
 */
public class SpeedBoost extends Effect{

	/**
	 * The Constant DURATION.
	 */
	public static final int DURATION = 12;
	
	/**
	 * The Constant COOLDOWN.
	 */
	public static final int COOLDOWN = 30;
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Speed Boost";
	
	/**
	 * The Constant MOVE_DISTANCE_BOOST.
	 */
	public static final int MOVE_DISTANCE_BOOST = 40;
	
	/**
	 * Instantiates a new speed boost.
	 *
	 * @param skillLevel the skill level
	 */
	public SpeedBoost(int skillLevel){
		super(DURATION,COOLDOWN, NAME, skillLevel);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.combatEffects.Effect#applyEffect(atrophy.combat.ai.Ai)
	 */
	@Override
	protected void applyEffect(Ai affectedAi) {
		affectedAi.setMoveDistance(affectedAi.getDefaultMoveDistance() + MOVE_DISTANCE_BOOST + (10 * skillLevel));
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.combatEffects.Effect#removeEffect(atrophy.combat.ai.Ai)
	 */
	@Override
	protected void removeEffect(Ai affectedAi) {
		affectedAi.setMoveDistance(affectedAi.getDefaultMoveDistance());
	}
	
}
