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
	
	@Override
	protected AiJob bestJob(ThinkingAi ai) {
		if(this.jobAssignments.get(ai) != null)
			return this.jobAssignments.get(ai);
		
		// Make a random scout job so the ai stays busy
		if(allJobsFull())
			return takeJob(ai, createScoutJob());
		
		AiJob bestJob = takeJob(ai, this.jobs.peek());
		// Force re-ordering of jobs
		this.jobs.remove();
		this.jobs.add(bestJob);
		
		return bestJob;
	}
	
	@Override
	public boolean addSuspectedAi(Ai killer, Ai killed) {
		return false;
	}
	
	@Override
	public boolean isSuspected(Ai suspect) {
		return false;
	}

	@Override
	public void removeSuspected(Ai ai) { }

	@Override
	public void removeHatedAi(Ai speaker) { }

}
