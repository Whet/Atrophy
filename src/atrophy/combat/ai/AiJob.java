package atrophy.combat.ai;

import atrophy.combat.level.LevelBlock;

public class AiJob {

	private LevelBlock levelBlock;
	
	public AiJob(LevelBlock levelBlock){
		this.levelBlock = levelBlock;
	}

	public LevelBlock getJobBlock() {
		return levelBlock;
	}
	
	
	
}
