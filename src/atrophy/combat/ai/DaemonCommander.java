/*
 * 
 */
package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class DaemonCommander extends TeamsCommander{
	
	public DaemonCommander(TurnProcess turnProcess, LevelManager levelManager) {
		super(turnProcess, AiGenerator.DAEMON, levelManager);
	}
	
	@Override
	public boolean canPursue(ThinkingAi thinkingAi) {
		return true;
	}

}
