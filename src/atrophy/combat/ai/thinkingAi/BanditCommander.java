/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.thinkingAi;

import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

// TODO: Auto-generated Javadoc
/**
 * The Class BanditCommander.
 */
public class BanditCommander extends TeamsCommander{

	/**
	 * Instantiates a new bandit commander.
	 * @param levelManager 
	 */
	public BanditCommander(TurnProcess turnProcess, LevelManager levelManager) {
		super(turnProcess, "Bandits", levelManager);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.TeamsCommander#canPursue(atrophy.combat.ai.thinkingAi.ThinkingTeamObject)
	 */
	@Override
	public boolean canPursue(ThinkingTeamObject thinkingTeamObject) {
		return true;
	}
}
