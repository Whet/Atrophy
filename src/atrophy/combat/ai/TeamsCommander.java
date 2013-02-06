/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.Portal;
import atrophy.combat.mechanics.Abilities;
import atrophy.combat.mechanics.TurnProcess;

public class TeamsCommander {
	
	protected static enum JobTitle {
		ROOM_DEFENDER, LAYER_DEFENDER, ROAMER
	}

	// Update for dead units to reassign
	private static final int UPDATE_MAX_GAP = 30;

	// Update for danger of room
	// can't be too short or a unit will think room is safe when they leave and are just looking at door
	private static final int COMMANDER_UPDATE_TURN_GAP = 8;
	
	private Set<ThinkingAi> teamAi;
	
	private Set<String> alliances;
	
	private Set<Ai> hatedAi;
	
	private Map<Ai, JobTitle> jobAssignments;
	
	private ArrayList<LevelBlock> scoutRooms;
	
	private Map<LevelBlock,int[]> enemyCountInRoom;
	
	private Set<Ai> lootedAi;
	
	private ArrayList<Portal> blockedPortals;
	
	private ArrayList<Portal> openPortals;
	
	private int maxLayerDefenders; 
	
	private int maxRoomDefenders; 
	
	private LevelBlock targetRoom;
	
	private String faction;
	
	private int[] jobBoard;
	
	private int turnsToNextUpdate;

	private TurnProcess turnProcess;
	private LevelManager levelManager;
	
	public TeamsCommander(TurnProcess turnProcess, String faction, LevelManager levelManager){

		this.faction = faction;
		this.levelManager = levelManager;
		
		teamAi = new HashSet<ThinkingAi>();
		blockedPortals = new ArrayList<Portal>(2);
		openPortals = new ArrayList<Portal>(2);
		scoutRooms = new ArrayList<LevelBlock>();
		enemyCountInRoom = new HashMap<LevelBlock,int[]>();
		lootedAi = new HashSet<Ai>();
		alliances = new HashSet<String>();
		hatedAi = new HashSet<Ai>();
		jobAssignments = new HashMap<>();
		
		jobBoard = new int[3];
		jobBoard[0] = 0;
		jobBoard[1] = 0;
		jobBoard[2] = 0;
		
		
		turnsToNextUpdate = 0;
		
		this.setTargetRoom(levelManager.getTargetBlock(this.getFaction()));
		
		this.turnProcess = turnProcess;
	}
	
	public LevelBlock getTargetRoom(ThinkingAi ai){
		
		LevelBlock returnBlock = null;
		
		if(targetRoom != null){
			do{
				if(jobAssignments.get(ai) != null){
				
					switch(jobAssignments.get(ai)){
						case LAYER_DEFENDER:
							returnBlock = firstLayerDefender(ai);
						break;
						
						case ROOM_DEFENDER:
							returnBlock = this.targetRoom;
						break;
							
						case ROAMER:
							returnBlock = hunterSeeker();
						break;
					}
				}
				else{
					this.assignNewJob(ai);
				}
				//loop to assign rooms to teams that were unemployed at start of function
			}while(returnBlock == null);
		}
		else{
			return levelManager.randomRoom(this.getFaction(), this.getDangerRooms(ai.getCombatScore()));
		}
		
		return returnBlock;
	}
	
	private void assignNewJob(ThinkingAi ai){
			
		if(jobBoard[1] < maxRoomDefenders){
			jobBoard[1]++;
			jobAssignments.put(ai, JobTitle.ROOM_DEFENDER);
		}
		else if(jobBoard[0] < maxLayerDefenders){
			jobBoard[0]++;
			jobAssignments.put(ai, JobTitle.LAYER_DEFENDER);
		}
		else{
			jobBoard[2]++;
			jobAssignments.put(ai, JobTitle.ROAMER);
		}
	}
	
	private LevelBlock firstLayerDefender(ThinkingAi ai){
		return levelManager.randomRoom();
	}
	
	private LevelBlock hunterSeeker(){
		
		// return a room where enemies have been reported
		if(this.scoutRooms.size() > 0){
			return this.scoutRooms.get(new Random().nextInt(this.scoutRooms.size()));
		}
		
		LevelBlock notBannedRoom;
		
		do{
			notBannedRoom = levelManager.randomRoom();
		}while(levelManager.isRoomBanned(this.getFaction(), notBannedRoom));
		
		return notBannedRoom;
	}
	
	public String getFaction(){
		return this.faction;
	}
	
	public void updateInformation(){
		
		this.turnsToNextUpdate --;
		
		if(this.turnsToNextUpdate <= 0){
			
			turnsToNextUpdate = new Random().nextInt(UPDATE_MAX_GAP);
		
			
			// check if a blocked portal was added to open portals
			for(int i = 0; i < this.openPortals.size(); i++){
				// this will be reached if a door was welded shut and an ai wants to get out
				// so wait until the door has been opened, then remove it from the open list
				// this was the door will be resealed but units will get through
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
		// Send ai to open door
		// there are no members of the faction with the weld ability
		// the door will never be opened
		return false;
	}

	protected void setTargetRoom(LevelBlock targetRoom){
		this.targetRoom = targetRoom;
	}
	
	public boolean canPursue(ThinkingAi ai) {
		if(jobAssignments.get(ai) == null){
			this.assignNewJob(ai);
		}
		if(this.targetRoom == null || jobAssignments.get(ai).equals(JobTitle.ROAMER) || jobAssignments.get(ai).equals(JobTitle.LAYER_DEFENDER)){
			return true;
		}
		return false;
	}

	public boolean reportUnits(int enemyCount, LevelBlock levelBlock) {
		boolean alreadyReported = this.scoutRooms.contains(levelBlock);
		
		if(!alreadyReported){
			this.scoutRooms.add(levelBlock);
		}
		
		// only update the enemy count at the block if it hasn't been reported
		// if a certain amount of turns has passed
		// or if the enemy count is greater
		if(!alreadyReported ||
		   this.enemyCountInRoom.get(levelBlock) == null ||
		   turnProcess.getTurnCount() - this.enemyCountInRoom.get(levelBlock)[1] > COMMANDER_UPDATE_TURN_GAP ||
		   this.enemyCountInRoom.get(levelBlock)[0] < enemyCount){
			
			int[] enemyCountAndTurn = {enemyCount, turnProcess.getTurnCount()};
			this.enemyCountInRoom.put(levelBlock, enemyCountAndTurn);
		}
		
		return !alreadyReported;
	}
	
	protected void addDangerRoom(LevelBlock room){
		if(!this.scoutRooms.contains(room)){
			this.scoutRooms.add(room);
		}
	}
	
	public ArrayList<LevelBlock> getDangerRooms(){
		return new ArrayList<LevelBlock>(this.scoutRooms);
	}
	
	public ArrayList<LevelBlock> getDangerRooms(int combatScore) {
		
		ArrayList<LevelBlock> dangerRooms = new ArrayList<LevelBlock>();
		
		Iterator<LevelBlock> setIt = this.scoutRooms.iterator();
		
		while(setIt.hasNext()){
			LevelBlock current = setIt.next();
			if(this.enemyCountInRoom.get(current)[0] > combatScore){
				dangerRooms.add(current);
			}
		}
		
		return dangerRooms;
	}
	
	public int getCombatScore(LevelBlock block) {
		if(this.scoutRooms.contains(block)){
			return this.enemyCountInRoom.get(block)[0];
		}
		else{
			return 0;
		}
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
		this.targetRoom = null;
		this.scoutRooms = null;
	}

	public JobTitle getJob(ThinkingAi thinkingAi) {
		return this.jobAssignments.get(thinkingAi);
	}

	public void addAi(ThinkingAi ai) {
		this.teamAi.add(ai);
	}

}
