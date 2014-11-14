package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Squad;

public class DaemonCommander extends TeamsCommander{
	
	public DaemonCommander(Squad squad, TurnProcess turnProcess, LevelManager levelManager) {
		super(squad, turnProcess, Faction.DAEMON, levelManager);
	}
	
	@Override
	public boolean canPursue(ThinkingAi thinkingAi) {
		return true;
	}

}
