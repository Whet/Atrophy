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
	/**
	 * The Constant UPDATE_MAX_GAP.
	 */
	private static final int UPDATE_MAX_GAP = 30;

	// Update for danger of room
	// can't be too short or a unit will think room is safe when they leave and are just looking at door
	/**
	 * The Constant COMMANDER_UPDATE_TURN_GAP.
	 */
	private static final int COMMANDER_UPDATE_TURN_GAP = 8;
	
	/**
	 * The alliances.
	 */
	private Set<String> alliances;
	
	/**
	 * The hated ai.
	 */
	private Set<Ai> hatedAi;
	
	/**
	 * The teams.
	 */
	private ArrayList<ThinkingTeamObject> teams;
	
	/**
	 * The team type.
	 */
	private HashMap<ThinkingTeamObject,JobTitle> teamType;
	
	/**
	 * The team defend assignments.
	 */
	private HashMap<ThinkingTeamObject,LevelBlock> teamDefendAssignments;
	
	/**
	 * The defend rooms.
	 */
	private ArrayList<LevelBlock> defendRooms;
	
	/**
	 * The scout rooms.
	 */
	private ArrayList<LevelBlock> scoutRooms;
	
	/**
	 * The enemy count in room.
	 */
	private Map<LevelBlock,int[]> enemyCountInRoom;
	
	/**
	 * The looted ai.
	 */
	private Set<Ai> lootedAi;
	
	/**
	 * The blocked portals.
	 */
	private ArrayList<Portal> blockedPortals;
	
	/**
	 * The open portals.
	 */
	private ArrayList<Portal> openPortals;
	
	/**
	 * The max layer defenders.
	 */
	private int maxLayerDefenders; 
	
	/**
	 * The max room defenders.
	 */
	private int maxRoomDefenders; 
	
	/**
	 * The target room.
	 */
	private LevelBlock targetRoom;
	
	/**
	 * The faction.
	 */
	private String faction;
	
	/**
	 * The job board.
	 */
	private int[] jobBoard;
	
	/**
	 * The check for job stability.
	 */
	private boolean checkForJobStability;
	
	/**
	 * The turns to next update.
	 */
	private int turnsToNextUpdate;

	private TurnProcess turnProcess;

	private LevelManager levelManager;
	
	/**
	 * Instantiates a new teams commander.
	 *
	 * @param faction the faction
	 */
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
	
	/*
	 * 0 = 1st layer defender
	 * 1 = core defender, welds doors
	 * 2 = hunter seeker
	 * 
	 */
	
	/**
	 * Adds the team.
	 *
	 * @param team the team
	 */
	public void addTeam(ThinkingTeamObject team){
		if(!this.teams.contains(team)){
			this.teams.add(team);
			this.restartJobs();
		}
	}
	
	/**
	 * Gets the target room.
	 *
	 * @param team the team
	 * @return the target room
	 */
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
	
	/**
	 * Assign new job.
	 *
	 * @param team the team
	 */
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
	
	/**
	 * First layer defender.
	 *
	 * @param team the team
	 * @return the level block
	 */
	private LevelBlock firstLayerDefender(ThinkingTeamObject team){
		
		if(this.teamDefendAssignments.containsKey(team)){
			return this.teamDefendAssignments.get(team);
		}
		
		this.teamDefendAssignments.put(team, this.defendRooms.get(0));
		this.defendRooms.remove(0);
		return this.teamDefendAssignments.get(team);
	}
	
	/**
	 * Hunter seeker.
	 *
	 * @return the level block
	 */
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
	
	/**
	 * Gets the faction.
	 *
	 * @return the faction
	 */
	public String getFaction(){
		return this.faction;
	}
	
	/**
	 * Update information.
	 */
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
	
	/**
	 * Check job stability.
	 */
	public void checkJobStability(){
		this.checkForJobStability = true;
	}
	
	/**
	 * Computes the job stability.
	 */
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
	
	/**
	 * Restart jobs.
	 */
	private void restartJobs(){
		updateDefendRooms();
		updateJobs();
		updateTeams();
	}
	
	/**
	 * Removes the dead teams.
	 *
	 * @return true, if successful
	 */
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
	
	/**
	 * Update jobs.
	 */
	private void updateJobs(){
		
		unemployAll();
		
		maxLayerDefenders = this.defendRooms.size();
		maxRoomDefenders = 1;
		
		pickPriorityTeams();
		pickLeftOverTeams();
	}
	
	/**
	 * Pick left over teams.
	 */
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

	/**
	 * Unemploy all.
	 */
	private void unemployAll(){
		this.teamType.clear();
		this.teamDefendAssignments.clear();
		
		jobBoard[0] = 0;
		jobBoard[1] = 0;
		jobBoard[2] = 0;
	}
	
	/**
	 * Pick priority teams.
	 */
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
	
	/**
	 * Update defend rooms.
	 */
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
	
	/**
	 * Update teams.
	 */
	private void updateTeams(){
		for(ThinkingTeamObject team: this.teams){
			team.setTargetRoom(getTargetRoom(team));
		}
	}
	
	/**
	 * Gets the blocked portals.
	 *
	 * @return the blocked portals
	 */
	public ArrayList<Portal> getBlockedPortals(){
		return this.blockedPortals;
	}
	
	/**
	 * Gets the open portals.
	 *
	 * @return the open portals
	 */
	public ArrayList<Portal> getOpenPortals(){
		return this.openPortals;
	}
	
	/**
	 * Request door open.
	 *
	 * @param door the door
	 * @return true, if successful
	 */
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
	
	/**
	 * Checks for ability.
	 *
	 * @param ability the ability
	 * @return true, if successful
	 */
	public boolean hasAbility(String ability){
		for(int i = 0; i < this.teams.size(); i++){
			if(this.teams.get(i).hasAbility(ability)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Sets the target room.
	 *
	 * @param targetRoom the new target room
	 */
	protected void setTargetRoom(LevelBlock targetRoom){
		this.targetRoom = targetRoom;
	}
	
	/**
	 * Gets the team number.
	 *
	 * @return the team number
	 */
	protected int getTeamNumber(){
		return this.teams.size();
	}
	
	/**
	 * Gets the team.
	 *
	 * @param index the index
	 * @return the team
	 */
	protected ThinkingTeamObject getTeam(int index){
		return this.teams.get(index);
	}

	/**
	 * Can pursue.
	 *
	 * @param thinkingTeamObject the thinking team object
	 * @return true, if successful
	 */
	public boolean canPursue(ThinkingTeamObject thinkingTeamObject) {
		if(teamType.get(thinkingTeamObject) == null){
			this.assignNewJob(thinkingTeamObject);
		}
		if(this.targetRoom == null || teamType.get(thinkingTeamObject).equals(JobTitle.ROAMER) || teamType.get(thinkingTeamObject).equals(JobTitle.LAYER_DEFENDER)){
			return true;
		}
		return false;
	}

	/**
	 * Report units.
	 *
	 * @param enemyCount the enemy count
	 * @param levelBlock the level block
	 * @return true, if successful
	 */
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
	
	/**
	 * Adds the danger room.
	 *
	 * @param room the room
	 */
	protected void addDangerRoom(LevelBlock room){
		if(!this.scoutRooms.contains(room)){
			this.scoutRooms.add(room);
		}
	}
	
	/**
	 * Gets the danger rooms.
	 *
	 * @return the danger rooms
	 */
	public ArrayList<LevelBlock> getDangerRooms(){
		return new ArrayList<LevelBlock>(this.scoutRooms);
	}
	
	/**
	 * Gets the danger rooms.
	 *
	 * @param combatScore the combat score
	 * @return the danger rooms
	 */
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
	
	/**
	 * Gets the combat score.
	 *
	 * @param block the block
	 * @return the combat score
	 */
	public int getCombatScore(LevelBlock block) {
		if(this.scoutRooms.contains(block)){
			return this.enemyCountInRoom.get(block)[0];
		}
		else{
			return 0;
		}
	}
	
	/**
	 * Adds the looted ai.
	 *
	 * @param lootAi the loot ai
	 */
	public void addLootedAi(Ai lootAi) {
		this.lootedAi.add(lootAi);
	}
	
	/**
	 * Checks if is ai looted.
	 *
	 * @param ai the ai
	 * @return true, if is ai looted
	 */
	public boolean isAiLooted(Ai ai) {
		return this.lootedAi.contains(ai);
	}
	
	/**
	 * Removes the alliance.
	 *
	 * @param faction the faction
	 */
	public void removeAlliance(String faction) {
		this.alliances.remove(faction);
	}

	/**
	 * Adds the alliance.
	 *
	 * @param faction the faction
	 */
	public void addAlliance(String faction) {
		this.alliances.add(faction);
	}
	
	/**
	 * Checks if is allied with.
	 *
	 * @param faction the faction
	 * @return true, if is allied with
	 */
	public boolean isAlliedWith(String faction) {
		return this.alliances.contains(faction);
	}
	
	/**
	 * Adds the hated ai.
	 *
	 * @param hatedAi the hated ai
	 */
	public void addHatedAi(Ai hatedAi){
		this.hatedAi.add(hatedAi);
	}
	
	/**
	 * Checks if is ai hated.
	 *
	 * @param ai the ai
	 * @return true, if is ai hated
	 */
	public boolean isAiHated(Ai ai){
		return this.hatedAi.contains(ai);
	}
	
	/**
	 * Purge.
	 */
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

	/**
	 * Gets the job.
	 *
	 * @param thinkingTeamObject the thinking team object
	 * @return the job
	 */
	public JobTitle getJob(ThinkingTeamObject thinkingTeamObject) {
		return this.teamType.get(thinkingTeamObject);
	}

}
