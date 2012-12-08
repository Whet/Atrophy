/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;




// TODO: Auto-generated Javadoc
/**
 * The Class WhiteVistaCommander.
 */
public class WhiteVistaCommander extends TeamsCommander{
	
	/**
	 * Instantiates a new white vista commander.
	 * @param levelManager 
	 */
	public WhiteVistaCommander(TurnProcess turnProcess, LevelManager levelManager) {
		super(turnProcess, "White Vista", levelManager);
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.TeamsCommander#canPursue(atrophy.combat.ai.thinkingAi.ThinkingTeamObject)
	 */
	@Override
	public boolean canPursue(ThinkingTeamObject thinkingTeamObject) {
		return true;
	}

}
