package atrophy.combat.combatEffects;

import atrophy.combat.ai.Ai;

public class ProtectPowerEffect extends Effect {

	public static final int[] DURATION = {3, 5, 10};
	
	public static final String NAME = "Protection";
	
	public ProtectPowerEffect(int skillLevel) {
		super(DURATION[skillLevel], 1, NAME, skillLevel);
	}

	@Override
	protected void removeEffect(Ai affectedAi) {}

	@Override
	protected void applyEffect(Ai affectedAi) {}

}
