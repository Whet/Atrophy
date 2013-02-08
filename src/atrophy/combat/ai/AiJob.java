package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.List;

import atrophy.combat.level.LevelBlock;

public class AiJob {

	private List<Ai> employees;
	private LevelBlock levelBlock;
	
	public AiJob(LevelBlock levelBlock){
		this.levelBlock = levelBlock;
		this.employees = new ArrayList<>();
	}

	public LevelBlock getJobBlock() {
		return levelBlock;
	}
	
	public void addAi(Ai ai){
		this.employees.add(ai);
	}
	
	public void remove(Ai ai){
		this.employees.remove(ai);
	}
	
}
