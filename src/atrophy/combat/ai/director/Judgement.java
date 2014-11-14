package atrophy.combat.ai.director;

import atrophy.combat.ai.Ai;
import atrophy.combat.items.Weapon;

public abstract class Judgement {

	protected static Judgement createKillJudgement(Weapon weapon, Ai target) {
		return new KillJudgement(weapon, target);
	}
	
	private static class KillJudgement extends Judgement {
		
		@SuppressWarnings("unused")
		private Ai target;
		@SuppressWarnings("unused")
		private Weapon weapon;
		
		public KillJudgement(Weapon weapon, Ai target) {
			this.target = target;
			this.weapon = weapon;
		}
		
	}
	
}
