/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat;

import java.util.ArrayList;
import java.util.ListIterator;

import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.BanditCommander;
import atrophy.combat.ai.LonerCommander;
import atrophy.combat.ai.TeamObject;
import atrophy.combat.ai.TeamsCommander;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.ai.ThinkingTeamObject;
import atrophy.combat.ai.WhiteVistaCommander;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

// TODO: Auto-generated Javadoc
/**
 * The Class CombatMembersManager.
 */
public class CombatMembersManager {

	/**
	 * The current ai.
	 */
	private ArrayList<Ai> currentAi;
	
	/**
	 * The team properties.
	 */
	private ArrayList<TeamObject> teamProperties;
	
	/**
	 * The commanders.
	 */
	private ArrayList<TeamsCommander> commanders;
	
	private AiCrowd aiCrowd;
	private TurnProcess turnProcess;
	private UiUpdaterSuite uiUpdaterSuite;
	private MouseAbilityHandler mouseAbilityHandler;
	private CombatInorganicManager combatInorganicManager;
	private LevelManager levelManager;
	
	/**
	 * Instantiates a new combat members manager.
	 * @param levelManager 
	 * @param combatInorganicManager 
	 */
	public CombatMembersManager(AiCrowd aiCrowd, TurnProcess turnProcess, LevelManager levelManager, CombatInorganicManager combatInorganicManager){
		teamProperties = new ArrayList<TeamObject>(4);
		commanders = new ArrayList<TeamsCommander>(2);
		currentAi = new ArrayList<Ai>(1);
		
		this.aiCrowd = aiCrowd;
		this.turnProcess = turnProcess;
		this.combatInorganicManager = combatInorganicManager;
		this.levelManager = levelManager;
	}
	
	public void lazyLoad(UiUpdaterSuite uiUpdaterSuite, MouseAbilityHandler mouseAbilityHandler){
		this.uiUpdaterSuite = uiUpdaterSuite;
		this.mouseAbilityHandler = mouseAbilityHandler;
	}
	
	// getters
	/**
	 * Gets the current ai.
	 *
	 * @return the current ai
	 */
	public Ai getCurrentAi(){
		if(this.currentAi.size() > 0){
			return this.currentAi.get(0);
		}
		return null;
	}
	
	// get ally at position in arraylist or return current if there is not an ally there
	/**
	 * Gets the ally.
	 *
	 * @param i the i
	 * @return the ally
	 */
	public Ai getAlly(int i){
		if(i < this.getTeamObject("1Player").getTeamSize() && this.getTeamObject("1Player").getTeamMember(i) != null && !this.getTeamObject("1Player").getTeamMember(i).isDead()){
			return this.getTeamObject("1Player").getTeamMember(i);
		}
		else if(this.currentAi.size() > 0){
			return this.currentAi.get(0);
		}
		return null;
	}
	
	/**
	 * Gets the ally count.
	 *
	 * @return the ally count
	 */
	public int getAllyCount(){
		return this.getTeamObject("1Player").getTeamSize();
	}
	
	/**
	 * Checks if is team.
	 *
	 * @param team the team
	 * @return true, if is team
	 */
	public boolean isTeam(String team){
		for(TeamObject teams : this.teamProperties){
			if(team.equals(teams.getTeam())){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets the team object.
	 *
	 * @param ai the ai
	 * @return the team object
	 */
	public TeamObject getTeamObject(Ai ai){
		for(TeamObject team : this.teamProperties){
			if(team.getTeamMembers().contains(ai)){
				return team;
			}
		}
		return null;
	}
	
	/**
	 * Gets the team object.
	 *
	 * @param index the index
	 * @return the team object
	 */
	public TeamObject getTeamObject(int index){
		return this.teamProperties.get(index);
	}
	
	/**
	 * Gets the team object.
	 *
	 * @param faction the faction
	 * @return the team object
	 */
	public TeamObject getTeamObject(String faction){
		for(TeamObject team : this.teamProperties){
			if(team.getTeam().equals(faction)){
				return team;
			}
		}
		return null;
	}
	
	/**
	 * Gets the number of teams.
	 *
	 * @return the number of teams
	 */
	public int getNumberOfTeams(){
		return this.teamProperties.size();
	}
	
	/**
	 * Gets the teams.
	 *
	 * @return the teams
	 */
	public ArrayList<TeamObject> getTeams(){
		return this.teamProperties;
	}
	
	/**
	 * Gets the commander.
	 *
	 * @param faction the faction
	 * @return the commander
	 */
	public TeamsCommander getCommander(String faction) {
		for(TeamsCommander commander : this.commanders){
			if(commander.getFaction().equals(faction)){
				return commander;
			}
		}
		return null;
	}
	
	/**
	 * Gets the commanders.
	 *
	 * @return the commanders
	 */
	public ArrayList<TeamsCommander> getCommanders(){
		return this.commanders;
	}
	
	/**
	 * Gets the current ais.
	 *
	 * @return the current ais
	 */
	public ArrayList<Ai> getCurrentAis(){
		return this.currentAi;
	}
	
	/**
	 * Gets the current ai.
	 *
	 * @param index the index
	 * @return the current ai
	 */
	public Ai getCurrentAi(int index){
		return this.currentAi.get(index);
	}
	
	// setters
	/**
	 * Sets the current ai.
	 *
	 * @param currentAi the new current ai
	 */
	public void setCurrentAi(Ai currentAi){
		this.currentAi.clear();
		this.currentAi.add(currentAi);
	}

	/**
	 * Change current ai.
	 *
	 * @param currentAi the current ai
	 */
	public void changeCurrentAi(Ai currentAi){
		this.currentAi.clear();
		this.currentAi.add(currentAi);
		uiUpdaterSuite.getCombatUiManager().updateUi();
		uiUpdaterSuite.getCombatVisualManager().updateVisibleAi();
		// cancel setting ability since ai changed
		mouseAbilityHandler.cancelAbilitySetting();
		
		if(this.currentAi.get(0).getAction().equals("Looting")){
			uiUpdaterSuite.getLootBox().loadLootDisplay(this.currentAi.get(0), this.currentAi.get(0).getTargetAi());
		}
		else{
			uiUpdaterSuite.getLootBox().closeLootUi(false);
		}
		
	}


	/**
	 * Change current ai.
	 *
	 * @param i the i
	 */
	public void changeCurrentAi(int i){
		if(this.getAlly(i) != null){
			
			this.changeCurrentAi(this.getAlly(i));
			
			if(this.currentAi.get(0).getAction().equals("Looting")){
				uiUpdaterSuite.getLootBox().loadLootDisplay(this.currentAi.get(0), this.currentAi.get(0).getTargetAi());
			}
			else{
				uiUpdaterSuite.getLootBox().closeLootUi(false);
			}
			
		}
	}
	
	/**
	 * Change current ais.
	 *
	 * @param selectedAi the selected ai
	 */
	public void changeCurrentAis(ArrayList<Ai> selectedAi){
		this.currentAi = selectedAi;
		mouseAbilityHandler.cancelAbilitySetting();
		uiUpdaterSuite.getCombatUiManager().updateUi();
		if(this.currentAi.get(0).getAction().equals("Looting")){
			uiUpdaterSuite.getLootBox().loadLootDisplay(this.currentAi.get(0), this.currentAi.get(0).getTargetAi());
		}
		else{
			uiUpdaterSuite.getLootBox().closeLootUi(false);
		}
	}
	
	/**
	 * Adds the commander.
	 *
	 * @param faction the faction
	 */
	private void addCommander(String faction){
		switch(faction){
			case AiGenerator.WHITE_VISTA:
				commanders.add(new WhiteVistaCommander(turnProcess, levelManager));
			break;
			
			case AiGenerator.BANDITS:
				commanders.add(new BanditCommander(turnProcess, levelManager));
			break;
			
			case AiGenerator.DAEMON:
			//	commanders.add(new DaemonCommander());
			break;
			
			case AiGenerator.LONER:
				commanders.add(new LonerCommander(turnProcess, levelManager));
			break;
		}
	}
	
	/**
	 * Adds the team.
	 *
	 * @param team the team
	 */
	public void addTeam(ThinkingTeamObject team){
		this.teamProperties.add(team);
		addTeamToCommander(team);
	}
	
	/**
	 * Inits the teams.
	 */
	public void initTeams(){
		for(int i = 0; i < this.teamProperties.size(); i++){
			if(this.teamProperties.get(i) instanceof ThinkingTeamObject){
				((ThinkingTeamObject) this.teamProperties.get(i)).initialiseTeamAbilities();
			}
		}
	}
	
	/**
	 * Adds the team to commander.
	 *
	 * @param team the team
	 */
	private void addTeamToCommander(ThinkingTeamObject team){
		for(int i = 0; i < this.commanders.size(); i++){
			if(commanders.get(i).getFaction().equals(team.getFaction())){
				commanders.get(i).addTeam(team);
				team.setCommander(commanders.get(i));
				return;
			}
		}
		
		// only reached if the team was not found
		addCommander(team.getFaction());
		
		commanders.get(commanders.size() - 1).addTeam(team);
		team.setCommander(commanders.get(commanders.size() - 1));
	}
	
	/**
	 * Update commanders.
	 */
	public void updateCommanders(){
		
		for(int i = 0; i < this.commanders.size(); i++){
			this.commanders.get(i).updateInformation();
		}
	}
	
	/**
	 * Update teams.
	 */
	public void updateTeams(){
		
		for(int i = 0; i < this.getNumberOfTeams(); i++){
			if(this.teamProperties.get(i) instanceof ThinkingTeamObject){
				// tick the timer to keep count of when to change orders
				((ThinkingTeamObject)(this.getTeamObject(i))).tickTurnTimer();
				// update formation to remove invalid members
				if(((ThinkingTeamObject)(this.getTeamObject(i))).getTeamFormation() != null){
					((ThinkingTeamObject)(this.getTeamObject(i))).getTeamFormation().updateFormation();
				}
			}
			this.getTeamObject(i).updateTeam();
		}
	}
	
	/**
	 * Checks if is selected.
	 *
	 * @param ai the ai
	 * @return true, if is selected
	 */
	public boolean isSelected(Ai ai){
		return this.currentAi.contains(ai);
	}
	
	/**
	 * Removes the dead selected ai.
	 */
	public void removeDeadSelectedAi(){
		ListIterator<Ai> litr = currentAi.listIterator(); 
		while(litr.hasNext()) {

		    Ai element = litr.next(); 
		    
		    if(element.isDead()){
		    	litr.remove();
		    }
		}
		
		// selects a living current ai if the ai died during the turn
		if(this.currentAi.size() == 0 || this.currentAi.get(0) == null || this.currentAi.get(0).isDead()){
			for(Ai ai: aiCrowd.getActors()){
				if(ai.getFaction().equals(AiGenerator.PLAYER) && !ai.isDead()){
					this.setCurrentAi(ai);
				}
			}
		}
	}
	
	/**
	 * Pick starting ai.
	 */
	public void pickStartingAi(){
		for(Ai ai : aiCrowd.getActors()){
			if(ai.getFaction().equals(AiGenerator.PLAYER)){
				this.setCurrentAi(ai);
				return;
			}
		}
	}
	
	/**
	 * Empty unused commanders.
	 */
	public void emptyUnusedCommanders(){

		// remove all living enemies
		ListIterator<TeamsCommander> litr = this.commanders.listIterator(); 
		
		while(litr.hasNext()) {
			litr.next();
			litr.remove();
		} 
		
		ListIterator<TeamObject> litr1 = this.teamProperties.listIterator(); 
		
		TeamObject team;
		
		while(litr1.hasNext()) {
			team = litr1.next();
			
			if(team instanceof ThinkingTeamObject){
				((ThinkingTeamObject) team).purge();
				litr1.remove();
			}
		} 
		
	}

	/**
	 * Gets the faction strength.
	 *
	 * @param faction the faction
	 * @param levelBlock the level block
	 * @return the faction strength
	 */
	public int getFactionStrength(String faction, LevelBlock levelBlock) {
		int strength = 0;
		for(TeamObject team : this.teamProperties){
			if((team.getFaction().equals(faction) || (team instanceof ThinkingTeamObject &&  ((ThinkingTeamObject) team).isAlliedWith(faction))) && team.teamInBlock(levelBlock)){
				strength += team.getCombatScore(levelBlock);
			}
		}
		return strength;
	}
	
	/**
	 * Factions allied.
	 *
	 * @param faction the faction
	 * @param faction2 the faction2
	 * @return true, if successful
	 */
	public boolean factionsAllied(String faction, String faction2) {
		for(TeamsCommander commander : this.commanders){
			if(commander.getFaction().equals(faction)){
				return commander.isAlliedWith(faction2);
			}
			else if(commander.getFaction().equals(faction2)){
				return commander.isAlliedWith(faction);
			}
		}
		return false;
	}
	
	/**
	 * Change thinking ai to player ai.
	 *
	 * @param thinkingAi the thinking ai
	 * @param lootbox 
	 */
	public void changeThinkingAiToPlayerAi(ThinkingAi thinkingAi){
		Ai playerAi = new Ai(thinkingAi, levelManager, combatInorganicManager);
		
		aiCrowd.getActorMask(thinkingAi).setAi(playerAi);
		aiCrowd.getActors().remove(thinkingAi);
		aiCrowd.getActors().add(playerAi);
		
		this.getTeamObject("1Player").addTeamMember(playerAi);
		
		
		for(TeamObject team : this.teamProperties){
			if(team.getTeamMembers().contains(thinkingAi)){
				this.teamProperties.remove(team);
				break;
			}
		}
		
		// create roster images
		uiUpdaterSuite.getCombatUiManager().getAllyRoster().generatePortraits();
		
		// if the thinking ai is in the turn stack it needs to be replaced by this ai
		turnProcess.replaceAi(thinkingAi,playerAi);
		aiCrowd.replaceAi(thinkingAi,playerAi);
	}
	
	/**
	 * Gets the unit count.
	 *
	 * @param string the string
	 * @return the unit count
	 */
	public int getUnitCount(String string){
		return getUnitCount(string, false);
	}
	
	/**
	 * Gets the unit count.
	 *
	 * @param string the string
	 * @param onlyAlive the only alive
	 * @return the unit count
	 */
	public int getUnitCount(String string, boolean onlyAlive) {
		int count = 0;
		ArrayList<String> targetFactions = new ArrayList<String>(2);
		
		switch(string){
			case AiGenerator.BANDITS:
				targetFactions.add(AiGenerator.BANDITS);
			break;
			case AiGenerator.WHITE_VISTA:
				targetFactions.add(AiGenerator.WHITE_VISTA);
			break;
			case AiGenerator.PLAYER:
				targetFactions.add(AiGenerator.PLAYER);
			break;
			case AiGenerator.LONER:
				targetFactions.add(AiGenerator.LONER);
			break;
			case "PlayerLoner":
				targetFactions.add(AiGenerator.PLAYER);
				targetFactions.add(AiGenerator.LONER);
			break;
		}
		
		for(Ai ai : aiCrowd.getActors()){
			if((!onlyAlive || !ai.isDead()) && targetFactions.contains(ai.getFaction())){
				count++;
			}
		}
		return count;
	}
	
}
