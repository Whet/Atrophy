/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import atrophy.combat.ai.AiJob.JobType;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.Portal;
import atrophy.combat.mechanics.TurnProcess;

public class TeamsCommander {
	
	private static final int UPDATE_GAP = 20;

	private static final int ASSIGNMENT_MODIFIER = 10;

	private static final int SCOUT_JOBS = 3;
	
	private Set<ThinkingAi> teamAi;
	private Set<String> alliances;
	private Set<Ai> hatedAi;
	private Set<Ai> lootedAi;
	private Set<AiJob> jobs;
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
		
		teamAi = new HashSet<ThinkingAi>();
		blockedPortals = new ArrayList<Portal>();
		lootedAi = new HashSet<Ai>();
		alliances = new HashSet<String>();
		hatedAi = new HashSet<Ai>();
		this.jobs = new HashSet<>();
		jobAssignments = new HashMap<>();
		defenceHeuristics = new HashMap<>();	
		
		turnsToNextUpdate = 0;
		
		this.turnProcess = turnProcess;
	}
	
	public String getFaction(){
		return this.faction;
	}
	
	public void updateInformation(){
		
		this.turnsToNextUpdate --;
		
		if(this.turnsToNextUpdate <= 0){
			
			removeDeadJobs();
			updateAssignmentHeuristics();
			updateDefenceHeuristics();
			createJobs();
			
			this.turnsToNextUpdate = UPDATE_GAP;
		
		}
	}
	
	private void removeDeadJobs() {
		
		Iterator<Entry<Ai, AiJob>> entryIt = this.jobAssignments.entrySet().iterator();
		
		while(entryIt.hasNext()) {
			Entry<Ai, AiJob> entry = entryIt.next();
			
			if(entry.getKey().isDead()) {
				entryIt.remove();
			}
		}
	}

	private void updateAssignmentHeuristics() {
		
		for(Entry<LevelBlock, DefenceHeuristic> entry : this.defenceHeuristics.entrySet()) {
			
			entry.getValue().assignmentModifier = 0;
			
			for(AiJob job : this.jobAssignments.values()){
				if(job.getJobBlock() == entry.getKey())
					entry.getValue().assignmentModifier += ASSIGNMENT_MODIFIER;
			}
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
							job.setTargetEmployeeCount(entry.getValue().getDefence());
						break;
						case OPEN_DOOR:
						break;
						case SCOUT:
							job.setTargetEmployeeCount(entry.getValue().getDanger());
						break;
						default:
						break;
					}
					break;
				}
			}
			
			if(!jobExists) {
				if(entry.getValue().getDefence() > 0){
					// Create a defence job
					AiJob job = new AiJob(entry.getValue().getDefence(), entry.getKey(), JobType.DEFEND);
					jobs.add(job);
				}
				else if(entry.getValue().getDanger() > 0){
					// Create a job to secure area
					AiJob job = new AiJob(entry.getValue().getDanger(), entry.getKey(), JobType.SECURE);
					jobs.add(job);
				}
			}
			
			assignedRooms.add(entry.getKey());
		}
		
		// Create jobs to scout random rooms which don't have defence/secure jobs
		for(int i = 0; i < SCOUT_JOBS; i++){
			LevelBlock room = levelManager.randomRoom();
			if(!assignedRooms.contains(room)) {
				AiJob job = new AiJob(1, room, JobType.SCOUT);
				jobs.add(job);
				this.checkForNullHeuristic(room);
			}
		}
	}

	private void checkForNullHeuristic(LevelBlock room) {
		if(this.defenceHeuristics.get(room) == null) {
			this.defenceHeuristics.put(room, new DefenceHeuristic());
		}
	}
	
	public AiJob getJob(ThinkingAi ai){
		if(this.jobAssignments.get(ai) != null && !this.jobAssignments.get(ai).isOverFilled())
			return this.jobAssignments.get(ai);
		
		else if(this.jobAssignments.get(ai) != null && this.jobAssignments.get(ai).isOverFilled())
			this.jobAssignments.remove(ai);
		
		return bestJob(ai);
	}
	
	private AiJob bestJob(ThinkingAi ai) {
		for(AiJob job : this.jobs){
			if(!job.isJobFilled())
				return takeJob(ai, job);
		}
		return null;
	}

	private AiJob takeJob(ThinkingAi ai, AiJob job) {
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
