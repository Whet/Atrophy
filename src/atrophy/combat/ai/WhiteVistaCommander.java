/*
 * 
 */
package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class WhiteVistaCommander extends TeamsCommander{
	
	public WhiteVistaCommander(TurnProcess turnProcess, LevelManager levelManager) {
		super(turnProcess, "White Vista", levelManager);
		this.addAlliance(AiGenerator.LONER);
	}

}
