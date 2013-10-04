/*
 * 
 */
package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Squad;

public class WhiteVistaCommander extends TeamsCommander{
	
	public WhiteVistaCommander(Squad squad, TurnProcess turnProcess, LevelManager levelManager) {
		super(squad, turnProcess, "White Vista", levelManager);
		this.addAlliance(AiGenerator.LONER);
	}

}
