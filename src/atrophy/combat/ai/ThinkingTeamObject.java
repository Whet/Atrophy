/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.TeamsCommander.JobTitle;
import atrophy.combat.ai.ThinkingAi.AiNode;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.Portal;
import atrophy.combat.mechanics.Abilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ThinkingTeamObject.
 */
public abstract class ThinkingTeamObject extends TeamObject{
	
	/**
	 * The team alive.
	 */
	private boolean teamAlive;
	
	/**
	 * The target level block.
	 */
	private LevelBlock targetLevelBlock;

	/**
	 * The team turn counter.
	 */
	private int teamTurnCounter;
	
	/**
	 * The room changed.
	 */
	private boolean roomChanged;
	
	/**
	 * The team formation.
	 */
	private Formation teamFormation;
	
	/**
	 * The commander.
	 */
	private TeamsCommander commander;
	
	/**
	 * The team abilities.
	 */
	private ArrayList<String> teamAbilities;
	
	/**
	 * The allowed abilities.
	 */
	private HashMap<String,Boolean> allowedAbilities;
	
	/**
	 * The smart terrain users.
	 */
	protected HashMap<ThinkingAi, AiNode> smartTerrainUsers;

	/**
	 * Instantiates a new thinking team object.
	 *
	 * @param faction the faction
	 * @param colour the colour
	 */
	public ThinkingTeamObject(CombatVisualManager combatVisualManager, String faction, Color colour){
		super(combatVisualManager, faction, colour);
		
		teamTurnCounter = 0;
		this.targetLevelBlock = null;
		roomChanged = false;
		this.teamFormation = null;
		
		teamAbilities = null;
		
		allowedAbilities = new HashMap<String,Boolean>();
		
		smartTerrainUsers = new HashMap<ThinkingAi, AiNode>();
		
		teamAlive = true;
	}
	
	/**
	 * Timer gone off.
	 *
	 * @return true, if successful
	 */
	public boolean timerGoneOff(){
		if(this.teamTurnCounter == 0){
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the level block.
	 *
	 * @return the level block
	 */
	public LevelBlock getLevelBlock(){
		return this.targetLevelBlock;
	}
	
	/**
	 * Whole team in block.
	 *
	 * @return true, if successful
	 */
	public boolean wholeTeamInBlock(){
		for(int i = 0; i < this.getTeamSize(); i++){
			if(this.getTeamMember(i).getLevelBlock() != this.targetLevelBlock){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Inits the team abilities.
	 */
	private void initTeamAbilities(){
		
		teamAbilities = new ArrayList<String>(4);
		
		for(int i = 0; i < this.getTeamSize(); i++){
			for(int j = 0; j < this.getTeamMember(i).getAbilities().size(); j++){
				if(!teamAbilities.contains(this.getTeamMember(i).getAbilities().get(j))){
					this.teamAbilities.add(this.getTeamMember(i).getAbilities().get(j));
				}
			}
		}
	}
	
	/**
	 * Check for abilities discrepancies.
	 */
	private void checkForAbilitiesDiscrepancies(){
		
		boolean abilityLost = false;
		
		for(int i = 0; i < this.teamAbilities.size(); i++){
			if(!this.hasAbility(this.teamAbilities.get(i))){
				this.teamAbilities.remove(i);
				abilityLost = true;
			}
		}
		
		if(abilityLost){
			this.commander.checkJobStability();
		}
	}
	
	/**
	 * Request help.
	 *
	 * @param levelBlock the level block
	 * @return true, if successful
	 */
	public boolean requestHelp(LevelBlock levelBlock) {
		if(this.targetLevelBlock !=  levelBlock){
			setTargetRoom(levelBlock);
			// break formation
			this.teamFormation = null;
			return true;
		}
		return false;
	}

	/**
	 * Tick turn timer.
	 */
	public void tickTurnTimer(){
		if(this.teamAlive){
			this.updateTeam();
			
			checkForAbilitiesDiscrepancies();
			
			if(this.teamTurnCounter > 0){
				
				if(this.wholeTeamInBlock()){
					teamTurnCounter--;
					
					this.assignToSmartTerrain();
				}
				
			}
			else{
				
				if(this.targetLevelBlock != this.commander.getTargetRoom(this) &&
				   this.getTeamFormation() != null){
					this.getTeamFormation().randomiseElements();
				}
				
				roomChanged = false;
				this.targetLevelBlock = this.commander.getTargetRoom(this);
				// length of stay is relative to the number of portals i.e the predicted traffic through the room
				this.teamTurnCounter = (int)(this.targetLevelBlock.getPortalCount() * 8 + (Math.random() * 30));
				
				resetSmartTerrains();
			}
			
			updateAbilities();
		}
	}
	
	/**
	 * Reset smart terrains.
	 */
	private void resetSmartTerrains() {
		Iterator<ThinkingAi> aiIt = this.smartTerrainUsers.keySet().iterator();
		
		while(aiIt.hasNext()){
			ThinkingAi ai = aiIt.next();
			
			// remove nodes that require ai to stand in place
			if(ai.getAiNode() != null && ai.stationaryNode()){
				ai.getAiNode().releaseNode(ai);
				ai.setAiNode(null);
				aiIt.remove();
			}
		}
	}

	/**
	 * Assign to smart terrain.
	 */
	private void assignToSmartTerrain() {
		ArrayList<AiNode> nodes = this.targetLevelBlock.getNodesFor(this.getFaction());
		
		// remove nodes being used
		Iterator<AiNode> nodeIt = nodes.iterator();
		
		while(nodeIt.hasNext()){
			AiNode next = nodeIt.next();
			if(this.smartTerrainUsers.containsValue(next) && next.isFull())
				nodeIt.remove();
		}
		
		// if no nodes to use exit method
		if(nodes.size() == 0)
			return;
			
		// work out what ai are free to place
		ArrayList<ThinkingAi> freeAgents = new ArrayList<ThinkingAi>();
		
		for(int i = 0; i < this.getTeamSize(); i++){
			if(!this.smartTerrainUsers.containsKey(this.getTeamMember(i)))
				freeAgents.add((ThinkingAi) this.getTeamMember(i));
		}
		
		// if no agents to use exit method
		if(freeAgents.size() == 0)
			return;
		
		int i = 0;
		int j = 0;
		
		// work out what nodes are worth using
		while(i < nodes.size()){
			
			if(nodeIsValuable(nodes.get(i))){
			
				if(j >= freeAgents.size())
					return;
				
				if(nodes.get(i).grabNode(freeAgents.get(j))){
					freeAgents.get(j).setAiNode(nodes.get(i));
					this.smartTerrainUsers.put(freeAgents.get(j), nodes.get(i));
					
					j++;
					
					if(nodes.get(i).isFull())
						i++;
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		
	}

	/**
	 * Node is valuable.
	 *
	 * @param aiNode the ai node
	 * @return true, if successful
	 */
	private boolean nodeIsValuable(AiNode aiNode) {
		if(aiNode.hasPriority(AiNode.PRI_STORY)){
			return true;
		}
		
		JobTitle teamRole = this.commander.getJob(this);
		
		if(teamRole == null){
			return false;
		}
		
		switch(teamRole){
			case LAYER_DEFENDER:
				if(aiNode.hasPriority(AiNode.PRI_DEFENDER)){
					return true;
				}
				return false;
		
			case ROOM_DEFENDER:
				if(aiNode.hasPriority(AiNode.PRI_DEFENDER)){
					return true;
				}
				return false;
				
			case ROAMER:
				return false;
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.TeamObject#getTeamSize()
	 */
	@Override
	public int getTeamSize(){
		int alive = 0;
		for(Ai ai : this.getTeamMembers()){
			if(!ai.isDead()){
				alive++;
			}
		}
		return alive;
	}
	
	/**
	 * Gets the team size in room.
	 *
	 * @param levelBlock the level block
	 * @return the team size in room
	 */
	public int getTeamSizeInRoom(LevelBlock levelBlock) {
		int teamInRoom = 0;
		for(Ai ai : this.getTeamMembers()){
			if(!ai.isDead() && ai.getLevelBlock() == levelBlock){
				teamInRoom++;
			}
		}
		return teamInRoom;
	}
	
	/**
	 * Check if alive.
	 */
	private void checkIfAlive(){
		
		if(this.getTeamSize() == 0){
			this.teamAlive = false;
			return;
		}
		
		for(int i = 0; i < this.getTeamSize(); i++){
			if(!this.getTeamMember(i).isDead()){
				this.teamAlive = true;
				return;
			}
		}
		this.teamAlive = false;
	}
	
	/**
	 * Sets the target room.
	 *
	 * @param targetRoom the new target room
	 */
	public void setTargetRoom(LevelBlock targetRoom){
		if(!roomChanged){
			roomChanged = true;
			this.targetLevelBlock = targetRoom;
			this.teamTurnCounter = (int)(40 + (Math.random() * 20));
		}
	}
	
	/**
	 * Sets the target room ignore setting.
	 *
	 * @param targetRoom the new target room ignore setting
	 */
	protected void setTargetRoomIgnoreSetting(LevelBlock targetRoom) {
		roomChanged = true;
		this.targetLevelBlock = targetRoom;
		this.teamTurnCounter = (int)(40 + (Math.random() * 20));
	}
	
	/**
	 * Join formation.
	 *
	 * @param ai the ai
	 */
	public void joinFormation(ThinkingAi ai){
		if(this.teamFormation != null){
			this.teamFormation.joinFormation(ai);
		}
	}
	
	/**
	 * Gets the team formation.
	 *
	 * @return the team formation
	 */
	public Formation getTeamFormation(){
		return this.teamFormation;
	}
	
	/**
	 * Sets the formation.
	 *
	 * @param teamFormation the new formation
	 */
	public void setFormation(Formation teamFormation){
		this.teamFormation = teamFormation;
	}
	
	/**
	 * Adds the alliance.
	 *
	 * @param faction the faction
	 */
	public void addAlliance(String faction){
		this.commander.addAlliance(faction);
	}
	
	/**
	 * Removes the alliance.
	 *
	 * @param faction the faction
	 */
	public void removeAlliance(String faction){
		this.commander.removeAlliance(faction);
	}
	
	/**
	 * Checks if is allied with.
	 *
	 * @param faction the faction
	 * @return true, if is allied with
	 */
	public boolean isAlliedWith(String faction){
		return this.commander.isAlliedWith(faction);
	}
	
	/**
	 * Sets the commander.
	 *
	 * @param commander the new commander
	 */
	public void setCommander(TeamsCommander commander){
		this.commander = commander;
	}
	
	/**
	 * Checks for ability.
	 *
	 * @param ability the ability
	 * @return true, if successful
	 */
	public boolean hasAbility(String ability){
		for(Ai ai: this.getTeamMembers()){
			if(ai.getAbilities().contains(ability) &&
			   !ai.isDead()){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Adds the ability.
	 *
	 * @param ability the ability
	 */
	public void addAbility(String ability){
		this.allowedAbilities.put(ability, false);
	}
	
	/**
	 * Can use.
	 *
	 * @param ability the ability
	 * @return true, if successful
	 */
	public boolean canUse(String ability){
		
		if(!this.allowedAbilities.containsKey(ability)){
			return false;
		}
		boolean bool = this.allowedAbilities.get(ability).booleanValue();
		
		return bool;
	}
	
	/**
	 * Update abilities.
	 */
	private void updateAbilities(){
		
		if(this.allowedAbilities.get(Abilities.WELDING) != null){
			// don't lock out members
			if(wholeTeamInBlock()){
				this.allowedAbilities.put(Abilities.WELDING, true);
			}
			else{
				this.allowedAbilities.put(Abilities.WELDING, false);
			}
		}
	}
	
	/**
	 * Removes the abilities.
	 */
	public void removeAbilities(){
		this.allowedAbilities.clear();
	}
	
	/**
	 * Gets the blocked portal.
	 *
	 * @return the blocked portal
	 */
	public Portal getBlockedPortal(){
		for(int i = 0; i < this.commander.getBlockedPortals().size(); i++){
			if(this.commander.getBlockedPortals().get(i).canUse() &&
			   this.commander.getBlockedPortals().get(i).connectsTo(this.targetLevelBlock)){
				return this.commander.getBlockedPortals().get(i);
			}
		}
		return null;
	}
	
	/**
	 * Gets the open portal.
	 *
	 * @return the open portal
	 */
	public Portal getOpenPortal(){
		for(int i = 0; i < this.commander.getOpenPortals().size(); i++){
			if(!this.commander.getOpenPortals().get(i).canUse() &&
			   this.commander.getOpenPortals().get(i).connectsTo(this.targetLevelBlock)){
				return this.commander.getOpenPortals().get(i);
			}
		}
		return null;
	}
	
	/**
	 * Request door open.
	 *
	 * @param openDoor the open door
	 * @return true, if successful
	 */
	public boolean requestDoorOpen(Portal openDoor){
		return this.commander.requestDoorOpen(openDoor);
	}
	
	/**
	 * Checks if is dead.
	 *
	 * @return true, if is dead
	 */
	public boolean isDead(){
		checkIfAlive();
		return !this.teamAlive;
	}
	
	/**
	 * Can pursue.
	 *
	 * @return true, if successful
	 */
	public boolean canPursue() {
		return this.commander.canPursue(this);
	}
	
	/**
	 * Initialise team abilities.
	 */
	public void initialiseTeamAbilities(){
		// initialise team abilities
		if(this.teamAbilities == null){
			initTeamAbilities();
		}
	}
	
	/**
	 * Report units.
	 *
	 * @param enemyCount the enemy count
	 * @param levelBlock the level block
	 * @return true, if successful
	 */
	public boolean reportUnits(int enemyCount, LevelBlock levelBlock) {
		return this.commander.reportUnits(enemyCount, levelBlock);
	}
	
	// return all levelblocks in the commander danger list that have danger levels higher than this team's combat strength
	/**
	 * Gets the rooms to avoid.
	 *
	 * @return the rooms to avoid
	 */
	public ArrayList<LevelBlock> getRoomsToAvoid() {
		return this.commander.getDangerRooms(this.getCombatScore());
	}
	
	/**
	 * Gets the all rooms to avoid.
	 *
	 * @return the all rooms to avoid
	 */
	public ArrayList<LevelBlock> getAllRoomsToAvoid() {
		return this.commander.getDangerRooms(1);
	}

	/**
	 * New room.
	 */
	public void newRoom() {
		if(this.targetLevelBlock != this.commander.getTargetRoom(this) &&
		   this.getTeamFormation() != null){
			this.getTeamFormation().randomiseElements();
		}
				
		roomChanged = false;
		this.targetLevelBlock = this.commander.getTargetRoom(this);
		// length of stay is relative to the number of portals i.e the predicted traffic through the room
		this.teamTurnCounter = (int)(this.targetLevelBlock.getPortalCount() * 8 + (Math.random() * 30));
		
		resetSmartTerrains();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.TeamObject#purge()
	 */
	@Override
	public void purge(){
		super.purge();
		this.commander = null;
		this.targetLevelBlock = null;
		this.teamAbilities = null;
		this.teamFormation = null;
	}

	/**
	 * Adds the looted ai.
	 *
	 * @param lootAi the loot ai
	 */
	public void addLootedAi(Ai lootAi) {
		this.commander.addLootedAi(lootAi);
	}

	/**
	 * Checks if is ai looted.
	 *
	 * @param ai the ai
	 * @return true, if is ai looted
	 */
	public boolean isAiLooted(Ai ai) {
		return this.commander.isAiLooted(ai);
	}
	
	/**
	 * Checks if is ai hated.
	 *
	 * @param ai the ai
	 * @return true, if is ai hated
	 */
	public boolean isAiHated(Ai ai){
		return this.commander.isAiHated(ai);
	}

	/**
	 * Ai released node.
	 *
	 * @param thinkingAi the thinking ai
	 */
	public void aiReleasedNode(ThinkingAi thinkingAi) {
		this.smartTerrainUsers.remove(thinkingAi);
	}

}
