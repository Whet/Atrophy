package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Squad;

public class BanditCommander extends TeamsCommander{

	public BanditCommander(Squad squad, TurnProcess turnProcess, LevelManager levelManager) {
		super(squad, turnProcess, Faction.BANDITS, levelManager);
	}
	
}
