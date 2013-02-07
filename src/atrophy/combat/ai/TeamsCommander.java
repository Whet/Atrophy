/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.Portal;
import atrophy.combat.mechanics.TurnProcess;

public class TeamsCommander {
	
	private Set<ThinkingAi> teamAi;
	private Set<String> alliances;
	private Set<Ai> hatedAi;
	
	private Map<Ai, AiJob> jobAssignments;
	
	private Map<LevelBlock, DefenceHeuristic> defenceHeuristics;
	private PriorityQueue<LevelBlock> priorityRoomQueue;
	
	private Set<Ai> lootedAi;
	
	private ArrayList<Portal> blockedPortals;
	private ArrayList<Portal> openPortals;
	
	private String faction;
	
	private int turnsToNextUpdate;

	private TurnProcess turnProcess;
	private LevelManager levelManager;
	
	public TeamsCommander(TurnProcess turnProcess, String faction, LevelManager levelManager){

		this.faction = faction;
		this.levelManager = levelManager;
		
		teamAi = new HashSet<ThinkingAi>();
		blockedPortals = new ArrayList<Portal>(2);
		openPortals = new ArrayList<Portal>(2);
		lootedAi = new HashSet<Ai>();
		alliances = new HashSet<String>();
		hatedAi = new HashSet<Ai>();
		jobAssignments = new HashMap<>();
		defenceHeuristics = new HashMap<>();	
		
		Comparator<LevelBlock> comparator = new Comparator<LevelBlock>() {
			
			@Override
			public int compare(LevelBlock o1, LevelBlock o2) {
				if(defenceHeuristics.get(o1).getF() > defenceHeuristics.get(o2).getF()) return 1;
				else if(defenceHeuristics.get(o1).getF() < defenceHeuristics.get(o2).getF()) return -1;
				return 0;
			}
		};
		priorityRoomQueue = new PriorityQueue<>(10, comparator );
		
		turnsToNextUpdate = 0;
		
		this.turnProcess = turnProcess;
	}
	
	public LevelBlock getTargetRoom(ThinkingAi ai){
		
		AiJob aiJob = this.jobAssignments.get(ai);
		
		if(aiJob != null) {
			return aiJob.getJobBlock();
		}
		
		return levelManager.randomRoom();
	}
	
	public String getFaction(){
		return this.faction;
	}
	
	public void updateInformation(){
		
		this.turnsToNextUpdate --;
		
		if(this.turnsToNextUpdate <= 0){
			
			for(int i = 0; i < this.openPortals.size(); i++){
				if(this.openPortals.get(i).canUse()){
					this.openPortals.remove(i);
				}
			}
		
		}
		
	}
	
	public ArrayList<Portal> getBlockedPortals(){
		return this.blockedPortals;
	}
	
	public ArrayList<Portal> getOpenPortals(){
		return this.openPortals;
	}
	
	public boolean requestDoorOpen(Portal door){
		return false;
	}

	public boolean canPursue(ThinkingAi ai) {
		return false;
	}

	public boolean reportUnits(int enemyCount, LevelBlock levelBlock) {
		
		if(this.defenceHeuristics.get(levelBlock) == null) {
			this.defenceHeuristics.put(levelBlock, new DefenceHeuristic());
			this.priorityRoomQueue.add(levelBlock);
		}
		
		if(this.defenceHeuristics.get(levelBlock).dangerH < enemyCount){
			this.defenceHeuristics.get(levelBlock).dangerH = enemyCount;
		}
		
		return true;
	}
	
	public List<LevelBlock> getDangerRooms(int leastDangerLevel){
		List<LevelBlock> blocks = new ArrayList<>();
		for(LevelBlock block : this.priorityRoomQueue){
			if(this.defenceHeuristics.get(block).dangerH >= leastDangerLevel)
				blocks.add(block);
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
	
	public void purge(){
		this.blockedPortals = null;
		this.openPortals = null;
	}

	public void addAi(ThinkingAi ai) {
		this.teamAi.add(ai);
	}

	public void setBlockHeuristic(LevelBlock levelBlock, int heuristicValue) {
		if(this.defenceHeuristics.get(levelBlock) == null) {
			this.defenceHeuristics.put(levelBlock, new DefenceHeuristic());
			this.priorityRoomQueue.add(levelBlock);
		}
		
		this.defenceHeuristics.get(levelBlock).missionH = heuristicValue;
	}

	public LevelBlock getSpawnRoom() {
		return this.priorityRoomQueue.peek();
	}

}
