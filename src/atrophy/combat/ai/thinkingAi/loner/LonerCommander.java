/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.thinkingAi.loner;

import atrophy.combat.ai.thinkingAi.TeamsCommander;
import atrophy.combat.ai.thinkingAi.ThinkingTeamObject;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;



// TODO: Auto-generated Javadoc
/**
 * The Class LonerCommander.
 */
public class LonerCommander extends TeamsCommander{
	
	/**
	 * Instantiates a new loner commander.
	 * @param levelManager 
	 */
	public LonerCommander(TurnProcess turnProcess, LevelManager levelManager) {
		super(turnProcess, "Loner", levelManager);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.TeamsCommander#updateInformation()
	 */
	@Override
	public void updateInformation(){
		this.setTargetRoom(null);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.TeamsCommander#canPursue(atrophy.combat.ai.thinkingAi.ThinkingTeamObject)
	 */
	@Override
	public boolean canPursue(ThinkingTeamObject thinkingTeamObject) {
		return true;
	}

}
