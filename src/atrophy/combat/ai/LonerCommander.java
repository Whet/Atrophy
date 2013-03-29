/*
 * 
 */
package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class LonerCommander extends TeamsCommander{
	
	public LonerCommander(TurnProcess turnProcess, LevelManager levelManager) {
		super(turnProcess, "Loner", levelManager);
	}
	
	@Override
	public boolean canPursue(ThinkingAi thinkingAi) {
		return true;
	}

}
