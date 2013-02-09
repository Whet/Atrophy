package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.List;

import atrophy.combat.level.LevelBlock;

public class AiJob {

	private JobType type;
	
	private int targetEmployeeCount;
	private LevelBlock levelBlock;
	
	private List<Ai> employees;
	
	public AiJob(int targetEmployeeCount, LevelBlock levelBlock, JobType type){
		this.targetEmployeeCount = targetEmployeeCount;
		this.levelBlock = levelBlock;
		this.employees = new ArrayList<>();
		this.type = type;
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
	
	public boolean isJobFilled(){
		return this.employees.size() >= targetEmployeeCount;
	}
	
	public boolean isOverFilled() {
		return this.employees.size() > targetEmployeeCount;
	}
	
	public JobType getType() {
		return type;
	}
	
	public void setTargetEmployeeCount(int targetEmployeeCount) {
		this.targetEmployeeCount = targetEmployeeCount;
	}

	public static enum JobType {
		SCOUT, DEFEND, OPEN_DOOR, SECURE
	}

}
