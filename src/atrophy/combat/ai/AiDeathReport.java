package atrophy.combat.ai;

import atrophy.combat.items.Weapon;
import atrophy.combat.level.LevelBlock;

public class AiDeathReport {

	public final Ai killer;
	public final Weapon weapon;
	public final LevelBlock room;
	public final int timeOfDeath;
	
	public AiDeathReport(Ai killer, Weapon weapon, LevelBlock room, int timeOfDeath) {
		this.killer = killer;
		this.weapon = weapon;
		this.room = room;
		this.timeOfDeath = timeOfDeath;
	}

	public Ai getTalker() {
		return null;
	}
	
}
