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

// TODO: Auto-generated Javadoc
/**
 * The Class TeamsCommander.
 */
public class TeamsCommander {
	
	protected static enum JobTitle {
		ROOM_DEFENDER, LAYER_DEFENDER, ROAMER
	}

	// Update for dead units to reassign
	private static final int UPDATE_MAX_GAP = 30;

	// Update for danger of room
	// can't be too short or a unit will think room is safe when they leave and are just looking at door
	private static final int COMMANDER_UPDATE_TURN_GAP = 8;
	
	private Set<String> alliances;
	
	private Set<Ai> hatedAi;
	
	private ArrayList<ThinkingTeamObject> teams;
	
	private HashMap<ThinkingTeamObject,JobTitle> teamType;
	
	private HashMap<ThinkingTeamObject,LevelBlock> teamDefendAssignments;
	
	private ArrayList<LevelBlock> defendRooms;
	
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
	
	private boolean checkForJobStability;
	
	private int turnsToNextUpdate;

	private TurnProcess turnProcess;

	private LevelManager levelManager;
	
	public TeamsCommander(TurnProcess turnProcess, String faction, LevelManager levelManager){

		this.faction = faction;
		this.levelManager = levelManager;
		
		teams = new ArrayList<ThinkingTeamObject>(2);
		teamType = new HashMap<ThinkingTeamObject,JobTitle>(2);
		defendRooms = new ArrayList<LevelBlock>(2);
		blockedPortals = new ArrayList<Portal>(2);
		openPortals = new ArrayList<Portal>(2);
		teamDefendAssignments = new HashMap<ThinkingTeamObject,LevelBlock>(2);
		scoutRooms = new ArrayList<LevelBlock>();
		enemyCountInRoom = new HashMap<LevelBlock,int[]>();
		lootedAi = new HashSet<Ai>();
		alliances = new HashSet<String>();
		hatedAi = new HashSet<Ai>();
		
		jobBoard = new int[3];
		jobBoard[0] = 0;
		jobBoard[1] = 0;
		jobBoard[2] = 0;
		
		checkForJobStability = false;
		
		turnsToNextUpdate = 0;
		
		this.setTargetRoom(levelManager.getTargetBlock(this.getFaction()));
		
		this.turnProcess = turnProcess;
	}
	
	public void addTeam(ThinkingTeamObject team){
		if(!this.teams.contains(team)){
			this.teams.add(team);
			this.restartJobs();
		}
	}
	
	public LevelBlock getTargetRoom(ThinkingTeamObject team){
		
		LevelBlock returnBlock = null;
		
		if(targetRoom != null){
			do{
				if(teamType.get(team) != null){
				
					switch(teamType.get(team)){
						case LAYER_DEFENDER:
							returnBlock = firstLayerDefender(team);
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
					this.assignNewJob(team);
				}
				//loop to assign rooms to teams that were unemployed at start of function
			}while(returnBlock == null);
		}
		else{
			return levelManager.randomRoom(this.getFaction(), this.getDangerRooms(team.getCombatScore()));
		}
		
		return returnBlock;
	}
	
	private void assignNewJob(ThinkingTeamObject team){
			
		team.removeAbilities();
		
		if(jobBoard[1] < maxRoomDefenders){
			jobBoard[1]++;
			teamType.put(team, JobTitle.ROOM_DEFENDER);
			team.addAbility(Abilities.WELDING);
		}
		else if(jobBoard[0] < maxLayerDefenders){
			jobBoard[0]++;
			teamType.put(team, JobTitle.LAYER_DEFENDER);
		}
		else{
			jobBoard[2]++;
			teamType.put(team, JobTitle.ROAMER);
		}
	}
	
	private LevelBlock firstLayerDefender(ThinkingTeamObject team){
		
		if(this.teamDefendAssignments.containsKey(team)){
			return this.teamDefendAssignments.get(team);
		}
		
		this.teamDefendAssignments.put(team, this.defendRooms.get(0));
		this.defendRooms.remove(0);
		return this.teamDefendAssignments.get(team);
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
		
			// if dead teams were removed then check for vital jobs		
			if(this.removeDeadTeams() && !this.checkForJobStability && this.targetRoom != null){
				restartJobs();
			}
			else if(this.checkForJobStability  && this.targetRoom != null){
				this.computeJobStability();
			}
			
			this.checkForJobStability = false;
			
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
	
	public void checkJobStability(){
		this.checkForJobStability = true;
	}
	
	private void computeJobStability(){
		boolean criticalJobLost = false;
		
		// jobs are not critical if there is no target room
		if(this.targetRoom != null){
			// if a team lost a specialist, check to see if all high priority jobs are performing optimally
			// if for instance a job which needs a welder, the team loses its welder, so see if there is a spare team with a welder to replace them
			for(ThinkingTeamObject team : this.teams){
				switch(this.teamType.get(team)){
					case LAYER_DEFENDER:
						if(!team.hasAbility(Abilities.WELDING) &&
						   this.hasAbility(Abilities.WELDING)){
							criticalJobLost = true;
						}
					break;
					
					case ROOM_DEFENDER:
						if(!team.hasAbility(Abilities.XRAY_SCAN) &&
						   this.hasAbility(Abilities.XRAY_SCAN)){
							criticalJobLost = true;
						}
					break;
					default:
					break;
				}
				
				if(criticalJobLost){
					restartJobs();
					return;
				}
			}
		}
	}
	
	private void restartJobs(){
		updateDefendRooms();
		updateJobs();
		updateTeams();
	}
	
	private boolean removeDeadTeams(){
		
		boolean editMade = false;
		
		ListIterator<ThinkingTeamObject> litr = teams.listIterator(); 
		ThinkingTeamObject element;
		while(litr.hasNext()) {

			element = litr.next(); 
		    
		    if(element.isDead()){
		    	litr.remove();
		    	editMade = true;
		    }
		}
		
		return editMade;
	}
	
	private void updateJobs(){
		
		unemployAll();
		
		maxLayerDefenders = this.defendRooms.size();
		maxRoomDefenders = 1;
		
		pickPriorityTeams();
		pickLeftOverTeams();
	}
	
	private void pickLeftOverTeams() {
		for(ThinkingTeamObject team:this.teams){
			if(!this.teamType.containsKey(team)){
				if(this.jobBoard[1] < maxRoomDefenders){
					jobBoard[1]++;
					teamType.put(team, JobTitle.ROOM_DEFENDER);
					team.addAbility(Abilities.WELDING);
				}
				else if(this.jobBoard[0] < maxLayerDefenders){
					jobBoard[0]++;
					teamType.put(team, JobTitle.LAYER_DEFENDER);
				}
				else{
					jobBoard[2]++;
					teamType.put(team, JobTitle.ROAMER);
				}
			}
		}
	}

	private void unemployAll(){
		this.teamType.clear();
		this.teamDefendAssignments.clear();
		
		jobBoard[0] = 0;
		jobBoard[1] = 0;
		jobBoard[2] = 0;
	}
	
	private void pickPriorityTeams(){
		for(ThinkingTeamObject team:this.teams){
			if(this.jobBoard[1] < maxRoomDefenders &&
			    team.hasAbility(Abilities.WELDING)){
				jobBoard[1]++;
				teamType.put(team, JobTitle.ROOM_DEFENDER);
				team.addAbility(Abilities.WELDING);
			}
			else if(this.jobBoard[0] < maxLayerDefenders &&
				team.hasAbility(Abilities.XRAY_SCAN)){
				jobBoard[0]++;
				teamType.put(team, JobTitle.LAYER_DEFENDER);
			}
			else if(team.hasAbility(Abilities.STEALTH1) || team.hasAbility(Abilities.STEALTH2)){
				jobBoard[2]++;
				teamType.put(team, JobTitle.ROAMER);
			}
		}
	}
	
	private void updateDefendRooms(){
		
		if(this.targetRoom != null){
			this.defendRooms.clear();
			this.teamDefendAssignments.clear();
			this.blockedPortals.clear();
			
			LevelBlock defendRoom;
			// add rooms within 1 door of the target room
			for(int i = 0; i < this.targetRoom.getPortalCount(); i++){
				
				defendRoom = this.targetRoom.getPortal(i).linksTo(this.targetRoom);
				
				// don't add dead ends
				// unless the target room is a dead end
				// or if the room connects to a large amount of rooms (likely to contain enemies)
				if(!this.defendRooms.contains(defendRoom) &&
					this.targetRoom.getPortalCount() == 1){
					
					if(!levelManager.isRoomBanned(this.getFaction(), defendRoom))
						this.defendRooms.add(defendRoom);
					
					this.blockedPortals.add(this.targetRoom.getPortal(i));
					//System.out.println(this.targetRoom.getPortal(i).getTag() + " BLOCK");
					
				}
			}
		}
	}
	
	private void updateTeams(){
		for(ThinkingTeamObject team: this.teams){
			team.setTargetRoom(getTargetRoom(team));
		}
	}
	
	public ArrayList<Portal> getBlockedPortals(){
		return this.blockedPortals;
	}
	
	public ArrayList<Portal> getOpenPortals(){
		return this.openPortals;
	}
	
	public boolean requestDoorOpen(Portal door){
		if(this.hasAbility(Abilities.WELDING)){
			if(!this.openPortals.contains(door)){
				this.openPortals.add(door);
			}
			return true;
		}
		// there are no members of the faction with the weld ability
		// the door will never be opened
		return false;
	}

	public boolean hasAbility(String ability){
		for(int i = 0; i < this.teams.size(); i++){
			if(this.teams.get(i).hasAbility(ability)){
				return true;
			}
		}
		return false;
	}
	
	protected void setTargetRoom(LevelBlock targetRoom){
		this.targetRoom = targetRoom;
	}
	
	protected int getTeamNumber(){
		return this.teams.size();
	}
	
	protected ThinkingTeamObject getTeam(int index){
		return this.teams.get(index);
	}

	public boolean canPursue(ThinkingTeamObject thinkingTeamObject) {
		if(teamType.get(thinkingTeamObject) == null){
			this.assignNewJob(thinkingTeamObject);
		}
		if(this.targetRoom == null || teamType.get(thinkingTeamObject).equals(JobTitle.ROAMER) || teamType.get(thinkingTeamObject).equals(JobTitle.LAYER_DEFENDER)){
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
		this.defendRooms = null;
		this.openPortals = null;
		this.targetRoom = null;
		this.teamDefendAssignments = null;
		this.teams = null;
		this.teamType = null;
		this.scoutRooms = null;
	}

	public JobTitle getJob(ThinkingTeamObject thinkingTeamObject) {
		return this.teamType.get(thinkingTeamObject);
	}

}
