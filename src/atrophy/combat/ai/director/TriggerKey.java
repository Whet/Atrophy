package atrophy.combat.ai.director;

import atrophy.combat.ai.Ai;
import atrophy.combat.items.Weapon;

public abstract class TriggerKey {

	public static TriggerKey getWeaponKey(Weapon weapon, Ai target) {
		return new WeaponKey(weapon, target);
	}
	
	public abstract Judgement createJudgement();
	
	private static class WeaponKey extends TriggerKey {

		private Ai target;
		private Weapon weapon;
		
		public WeaponKey(Weapon weapon, Ai target) {
			this.weapon = weapon;
			this.target = target;
		}

		@Override
		public Judgement createJudgement() {
			return null;
		}
		
		
	}
	
}
