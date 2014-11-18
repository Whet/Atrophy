package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.List;

import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.Portal;

public abstract class AiJob {

	protected JobType type;
	
	protected int targetEmployeeCount;
	protected LevelBlock levelBlock;
	
	protected List<Ai> employees;
	
	protected int duration;
	
	// Mission too dangerous etc.
	protected boolean invalidated;
	
	public AiJob(int targetEmployeeCount, LevelBlock levelBlock, JobType type, int duration){
		this.targetEmployeeCount = targetEmployeeCount;
		this.levelBlock = levelBlock;
		this.employees = new ArrayList<>();
		this.type = type;
		this.duration = duration;
		this.invalidated = false;
	}
	
	public boolean isInvalidated() {
		return invalidated;
	}

	public void setInvalidated(boolean invalidated) {
		this.invalidated = invalidated;
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

	public abstract void expire();


	public static enum JobType {
		SCOUT, DEFEND, OPEN_DOOR, SECURE, STASH_ITEM, BRING_BACK_FOOD
	}
	
	public static class StashItemJob extends AiJob{

		private boolean itemGiven = false;
		
		public StashItemJob(int targetEmployeeCount, LevelBlock levelBlock, JobType type, int duration) {
			super(targetEmployeeCount, levelBlock, type, duration);
		}
		
		@Override
		public boolean isExpired() {
			return itemGiven;
		}

		@Override
		public void expire() {
			this.itemGiven = true;
		}
	}
	
	public static class DefendJob extends AiJob{
		public DefendJob(int targetEmployeeCount, LevelBlock levelBlock) {
			super(targetEmployeeCount, levelBlock, JobType.DEFEND, 0);
		}

		@Override
		public boolean isExpired(){
			return false;
		}

		@Override
		public void expire() {
			this.duration = 0;
		}
	}
	
	public static class ReturnJob extends AiJob{
		private Ai prey;

		public ReturnJob(LevelBlock levelBlock, Ai prey) {
			super(1, levelBlock, JobType.BRING_BACK_FOOD, 0);
			this.prey = prey;
		}

		@Override
		public boolean isExpired(){
			return false;
		}

		@Override
		public void expire() {
			this.duration = 0;
		}

		public Ai getPrey() {
			return prey;
		}
		
	}
	
	public static class ScoutJob extends AiJob{
		public ScoutJob(int targetEmployeeCount, LevelBlock levelBlock, JobType type, int duration) {
			super(targetEmployeeCount, levelBlock, type, duration);
		}

		@Override
		public void expire() {
			this.duration = 0;
		}
	}

	public static class SecureJob extends AiJob{
		
		public SecureJob(int targetCombatScore, LevelBlock levelBlock, int duration) {
			super(targetCombatScore, levelBlock, JobType.SECURE, duration);
		}
		
		@Override
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

		@Override
		public boolean isOverFilled() {
			return false;
		}

		@Override
		public void expire() {
			this.duration = 0;
		}
		
	}
	
	public static class OpenDoorJob extends AiJob{
		
		private Portal door;
		
		public OpenDoorJob(Portal door) {
			super(1, door.getLinkedBlocks()[0], JobType.OPEN_DOOR, 30);
			this.door = door;
		}

		public Portal getDoor() {
			return door;
		}
		
		@Override
		public boolean isExpired() {
			return door.canUse();
		}

		@Override
		public void expire() {
			this.duration = 0;
		}
		
	}

}
