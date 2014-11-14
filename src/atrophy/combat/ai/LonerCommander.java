package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Squad;

public class LonerCommander extends TeamsCommander{
	
	public LonerCommander(Squad squad, TurnProcess turnProcess, LevelManager levelManager) {
		super(squad, turnProcess, Faction.LONER, levelManager);
	}
	
	@Override
	public boolean canPursue(ThinkingAi thinkingAi) {
		return true;
	}

}
