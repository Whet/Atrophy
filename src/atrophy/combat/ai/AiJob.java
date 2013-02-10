package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.List;

import atrophy.combat.level.LevelBlock;

public class AiJob {

	protected JobType type;
	
	protected int targetEmployeeCount;
	protected LevelBlock levelBlock;
	
	protected List<Ai> employees;
	
	protected int duration;
	
	public AiJob(int targetEmployeeCount, LevelBlock levelBlock, JobType type, int duration){
		this.targetEmployeeCount = targetEmployeeCount;
		this.levelBlock = levelBlock;
		this.employees = new ArrayList<>();
		this.type = type;
		this.duration = duration;
	}

	public void tickJob(){
		this.duration--;
	}
	
	public boolean isExpired(){
		return this.duration <= 0;
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
	
	public boolean isEmpty() {
		return this.employees.size() == 0;
	}
	
	public JobType getType() {
		return type;
	}
	
	public void setTargetEmployeeCount(int targetEmployeeCount) {
		this.targetEmployeeCount = targetEmployeeCount;
	}
	
	public int getTargetEmployeeCount() {
		return targetEmployeeCount;
	}



	public static enum JobType {
		SCOUT, DEFEND, OPEN_DOOR, SECURE
	}
	
	public static class DefendJob extends AiJob{
		public DefendJob(int targetEmployeeCount, LevelBlock levelBlock) {
			super(targetEmployeeCount, levelBlock, JobType.DEFEND, 0);
		}

		public boolean isExpired(){
			return false;
		}
	}

	public static class SecureJob extends AiJob{
		
		public SecureJob(int targetCombatScore, LevelBlock levelBlock, int duration) {
			super(targetCombatScore, levelBlock, JobType.SECURE, duration);
		}
		
		public boolean isJobFilled(){
			return this.getCombatScore() >= this.targetEmployeeCount;
		}
		
		private int getCombatScore() {
			int combatScore = 0;
			
			for(int i = 0; i < this.employees.size(); i++) {
				combatScore += this.employees.get(i).getCombatScore();
			}
			
			return combatScore;
		}

		public boolean isOverFilled() {
			return false;
		}
		
	}

}
