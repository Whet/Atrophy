package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

public class RapidFireEffect extends Effect{

	public static final int DURATION = 2;
	
	public static final int COOLDOWN = 20;
	
	public static final String NAME = "Rapid Fire";
	
	public RapidFireEffect(){
		super(DURATION,COOLDOWN, NAME, 0);
	}
	
	@Override
	protected void applyEffect(Ai affectedAi) {
	}

	@Override
	protected void removeEffect(Ai affectedAi) {
	}

}
