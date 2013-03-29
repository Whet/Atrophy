/*
 * 
 */
package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

/**
 * The Class MobileInvisibility.
 */
public class MobileInvisibility extends Effect{

	/**
	 * The Constant DURATION.
	 */
	public static final int DURATION = 8;
	
	/**
	 * The Constant COOLDOWN.
	 */
	public static final int COOLDOWN = 20;
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Mobile Stealth";
	
	/**
	 * Instantiates a new mobile invisibility.
	 *
	 * @param skillLevel the skill level
	 */
	public MobileInvisibility(int skillLevel){
		super(DURATION,COOLDOWN - (2 * skillLevel), NAME, skillLevel);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.combatEffects.Effect#applyEffect(atrophy.combat.ai.Ai)
	 */
	@Override
	protected void applyEffect(Ai affectedAi) {
		affectedAi.setStealthed(true);
		if(!affectedAi.getAction().equals("") &&
		   !affectedAi.getAction().equals("Move") &&
		   !affectedAi.getAction().equals("Stealthed") &&
		   !affectedAi.getAction().startsWith("Applying:")){
			this.stopEffect();
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
