/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

import atrophy.combat.ai.AiJob.JobType;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.Portal;
import atrophy.combat.mechanics.TurnProcess;

public class TeamsCommander<E> {
	
	private static final int UPDATE_GAP = 20;

	private static final int ASSIGNMENT_MODIFIER = 10;

	private Set<ThinkingAi> teamAi;
	private Set<String> alliances;
	private Set<Ai> hatedAi;
	private Set<Ai> lootedAi;
	private PriorityQueue<AiJob> jobs;
	private Map<Ai, AiJob> jobAssignments;
	private Map<LevelBlock, DefenceHeuristic> defenceHeuristics;
	
	private ArrayList<Portal> blockedPortals;
	
	private String faction;
	
	private int turnsToNextUpdate;

	private TurnProcess turnProcess;
	private LevelManager levelManager;
	
	public TeamsCommander(TurnProcess turnProcess, String faction, LevelManager levelManager){

		this.faction = faction;
		this.levelManager = levelManager;
		this.turnProcess = turnProcess;
		
		teamAi = new HashSet<ThinkingAi>();
		blockedPortals = new ArrayList<Portal>();
		lootedAi = new HashSet<Ai>();
		alliances = new HashSet<String>();
		hatedAi = new HashSet<Ai>();
		jobAssignments = new HashMap<>();
		defenceHeuristics = new HashMap<>();	
		
		turnsToNextUpdate = 0;
		
		Comparator<AiJob> comparator = new Comparator<AiJob>() {
			
			@Override
			public int compare(AiJob job1, AiJob job2) {
				
				int compareInt = 0;
				
				// Defend and secure jobs are only equal if their heuristics are equal
				if((job1.getType() == job2.getType() && job1.getType() != JobType.DEFEND && job1.getType() != JobType.SECURE) || job1.isJobFilled() && job2.isJobFilled())
					return 0;
				
				if(job1.isJobFilled())
					return 1;
				
				if(job2.isJobFilled())
					return -1;
				
				switch(job1.getType()){
					case DEFEND:
						if(JobType.DEFEND == job2.getType()){
							int job1Defence = defenceHeuristics.get(job1.getJobBlock()).getDefenceAfterAssignment();
							int job2Defence = defenceHeuristics.get(job2.getJobBlock()).getDefenceAfterAssignment();
							
							if(job1Defence > job2Defence){
								compareInt = -1;
							}
							else if(job1Defence < job2Defence){
								compareInt = 1;
							}
							else{
								compareInt = 0;
							}
						}
						// High priority
						compareInt = -1;
					break;
					case OPEN_DOOR:
						// Low priority
						compareInt = 1;
					break;
					case SCOUT:
						// Low priority
						if(job2.getType() != JobType.DEFEND && job2.getType() != JobType.SECURE)
							compareInt = -1;
						else
							compareInt = 1;
					break;
					case SECURE:
						if(JobType.SECURE == job2.getType()){
							int job1Danger = defenceHeuristics.get(job1.getJobBlock()).getDangerAfterAssignment();
							int job2Danger = defenceHeuristics.get(job2.getJobBlock()).getDangerAfterAssignment();
							
							if(job1Danger > job2Danger){
								compareInt = -1;
							}
							else if(job1Danger < job2Danger){
								compareInt = 1;
							}
							else{
								compareInt = 0;
							}
						}
						// Med priority
						if(job2.getType() != JobType.DEFEND)
							compareInt = -1;
						else
							compareInt = 1;
							
					break;
					default:
						compareInt = 0;
					break;
				}
				
				return compareInt;
			}
		};
		
		this.jobs = new PriorityQueue<AiJob>(10, comparator);
	}
	
	public String getFaction(){
		return this.faction;
	}
	
	public void updateInformation(){
		
		this.turnsToNextUpdate --;
		
		if(this.turnsToNextUpdate <= 0){
			
			removeDeadJobs();
			updateDefenceHeuristics();
			createJobs();
			
			this.turnsToNextUpdate = UPDATE_GAP;
		
		}
	}
	
	private void removeDeadJobs() {
		Set<AiJob> expiredJobs = new HashSet<>();

		Iterator<Entry<Ai, AiJob>> entryIt = this.jobAssignments.entrySet().iterator();
		
		while(entryIt.hasNext()){
			Entry<Ai, AiJob> entry = entryIt.next();
			
			if(entry.getValue().isExpired() || entry.getValue().isEmpty()) {
				System.out.println(entry.getKey().getName() + "'s " + entry.getValue().getType() + " job expired");
				expiredJobs.add(entry.getValue());
				entryIt.remove();
			}
		}
		
		this.jobs.removeAll(expiredJobs);
		
		for(Ai ai : this.teamAi){
			if(ai.isDead() && this.jobAssignments.get(ai) != null){
				System.out.println(ai.getName() + "'s " + this.jobAssignments.get(ai).getType() + " job is free since they died");
				this.jobAssignments.get(ai).remove(ai);
				this.jobAssignments.remove(ai);
			}
		}
		
		for(DefenceHeuristic heuristic : this.defenceHeuristics.values()){
			heuristic.assignmentModifier = 0;
		}
	}

	private void updateDefenceHeuristics() {

		Set<LevelBlock> missionImportantRooms = new HashSet<>();
		
		for(Entry<LevelBlock, DefenceHeuristic> entry : this.defenceHeuristics.entrySet()){
			if(entry.getValue().missionH > 0)
				missionImportantRooms.add(entry.getKey());
		}
		
		// Make nearby rooms have higher defence values
		for(LevelBlock room : missionImportantRooms){
			for(LevelBlock adjacentRoom : room.getConnectedRooms()){
				
				if(!levelManager.isRoomBanned(this.getFaction(), adjacentRoom)){
					checkForNullHeuristic(adjacentRoom);
					
					// This method allows defence bonuses to stack
					this.defenceHeuristics.get(adjacentRoom).defenceH = this.defenceHeuristics.get(room).missionH / 4;
				}
			}
		}
	}
	
	private void createJobs() {
		boolean jobExists;
		
		Set<LevelBlock> assignedRooms = new HashSet<>();
		
		for(Entry<LevelBlock, DefenceHeuristic> entry : this.defenceHeuristics.entrySet()){
			
			jobExists = false;
			
			for(AiJob job : this.jobAssignments.values()){
				if(job.getJobBlock() == entry.getKey()){
					jobExists = true;
					
					// Update job to new heuristics
					switch(job.getType()){
						case DEFEND:
							int targetEmployeeCount = entry.getValue().getDefence() / 10;
							
							if(targetEmployeeCount <= 0)
								targetEmployeeCount = 1;
							
							job.setTargetEmployeeCount(targetEmployeeCount);
						break;
						case OPEN_DOOR:
						break;
						case SECURE:
							job.setTargetEmployeeCount(entry.getValue().getDanger());
						break;
						default:
						break;
					}
					break;
				}
			}
			
			if(!jobExists) {
				if(turnProcess.getTurnCount() == 0 && entry.getValue().getDefence() > 0){
					// Create a defence job
					int targetEmployeeCount = entry.getValue().getDefence() / 10;
					
					if(targetEmployeeCount <= 0)
						targetEmployeeCount = 1;
					
					AiJob job = new AiJob.DefendJob(targetEmployeeCount, entry.getKey());
					jobs.add(job);
					assignedRooms.add(entry.getKey());
				}
				else if(entry.getValue().getDanger() > 0){
					// Create a job to secure area
					AiJob job = new AiJob.SecureJob(entry.getValue().getDanger(), entry.getKey(), turnsToNextUpdate + 10);
					jobs.add(job);
					assignedRooms.add(entry.getKey());
				}
			}
			
		}
		
		if(this.getFaction().equals(AiGenerator.WHITE_VISTA)){
			for(AiJob job : this.jobs){
				System.out.println("Job Posting: " + job.getType() + " for " + job.getTargetEmployeeCount() + " people");
			}
		}
	}

	private void checkForNullHeuristic(LevelBlock room) {
		if(this.defenceHeuristics.get(room) == null) {
			this.defenceHeuristics.put(room, new DefenceHeuristic());
		}
	}
	
	public AiJob getJob(ThinkingAi ai){
		
		if(this.jobAssignments.get(ai) != null)
			return this.jobAssignments.get(ai);
		
		return bestJob(ai);
	}
	
	private AiJob bestJob(ThinkingAi ai) {

		// Make a random scout job so the ai stays busy
		if(allJobsFull())
			return takeJob(ai, createScoutJob());
		
		AiJob bestJob = takeJob(ai, this.jobs.peek());
		// Force re-ordering of jobs
		this.jobs.remove();
		this.jobs.add(bestJob);
		
		return bestJob;
	}
	
	private AiJob createScoutJob() {
		LevelBlock room = null;
		do{
			room = levelManager.randomRoom();
		}
		while(levelManager.isRoomBanned(this.getFaction(), room));
		
		AiJob job = new AiJob(1, room, JobType.SCOUT, turnsToNextUpdate + 15);
		jobs.add(job);
		this.checkForNullHeuristic(room);
		
		return job;
	}

	private AiJob takeJob(ThinkingAi ai, AiJob job) {
		System.out.println(ai.getName() + " is taking job: " + job.getType());
		job.addAi(ai);
		this.jobAssignments.put(ai, job);
		this.defenceHeuristics.get(job.getJobBlock()).assignmentModifier += ASSIGNMENT_MODIFIER;
		return job;
	}

	public void transferJobs(ThinkingAi ai, AiJob oldJob, AiJob newJob) {
		oldJob.remove(ai);
		newJob.addAi(ai);
	}
	
	public ArrayList<Portal> getBlockedPortals(){
		return this.blockedPortals;
	}
	
	public boolean requestDoorOpen(Portal door){
		return false;
	}

	public boolean canPursue(ThinkingAi ai) {
		return false;
	}

	public boolean reportUnits(int enemyCount, LevelBlock levelBlock) {
		checkForNullHeuristic(levelBlock);
		
		if(this.defenceHeuristics.get(levelBlock).dangerH < enemyCount){
			this.defenceHeuristics.get(levelBlock).dangerH = enemyCount;
		}
		
		return true;
	}
	
	public List<LevelBlock> getDangerRooms(int leastDangerLevel){
		List<LevelBlock> blocks = new ArrayList<>();
		for(Entry<LevelBlock, DefenceHeuristic> entry : this.defenceHeuristics.entrySet()){
			if(entry.getValue().dangerH >= leastDangerLevel)
				blocks.add(entry.getKey());
		}
		return blocks;
	}
	
	private boolean allJobsFull() {
		for(AiJob job : this.jobs){
			if(!job.isJobFilled())
				return false;
		}
		return true;
	}
	
	public void addLootedAi(Ai lootAi) {
		this.lootedAi.add(lootAi);
	}
	
	public boolean isAiLooted(Ai ai) {
		return this.lootedAi.contains(ai);
	}
	
	public void removeAlliance(String faction) {
		this.alliances.remove(faction);
	}

	public void addAlliance(String faction) {
		this.alliances.add(faction);
	}
	
	public boolean isAlliedWith(String faction) {
		return this.alliances.contains(faction);
	}
	
	public void addHatedAi(Ai hatedAi){
		this.hatedAi.add(hatedAi);
	}
	
	public boolean isAiHated(Ai ai){
		return this.hatedAi.contains(ai);
	}
	
	public void addAi(ThinkingAi ai) {
		this.teamAi.add(ai);
	}

	public void setBlockHeuristic(LevelBlock levelBlock, int heuristicValue) {
		checkForNullHeuristic(levelBlock);
		
		this.defenceHeuristics.get(levelBlock).missionH = heuristicValue;
	}

	public LevelBlock getSpawnRoom() {
		return this.getHighestDefencePriority();
	}

	private LevelBlock getHighestDefencePriority() {
		Entry<LevelBlock, DefenceHeuristic> bestEntry = null;
		for(Entry<LevelBlock, DefenceHeuristic> entry : this.defenceHeuristics.entrySet()){
			if(bestEntry == null || entry.getValue().getDefenceAfterAssignment() > bestEntry.getValue().getDefenceAfterAssignment())
				bestEntry = entry;
		}
		
		if(bestEntry == null) {
			
			LevelBlock levelBlock;
			
			do{
				levelBlock = levelManager.randomRoom();
			}
			while(levelManager.isRoomBanned(this.getFaction(), levelBlock));
				
			this.checkForNullHeuristic(levelBlock);
			return levelBlock;
		}
			
		
		return bestEntry.getKey();
	}

}
