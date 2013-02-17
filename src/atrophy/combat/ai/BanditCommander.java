/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class BanditCommander extends TeamsCommander{

	public BanditCommander(TurnProcess turnProcess, LevelManager levelManager) {
		super(turnProcess, "Bandits", levelManager);
	}
	
}
