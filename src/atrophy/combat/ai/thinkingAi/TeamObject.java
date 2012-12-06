/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.thinkingAi;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.level.LevelBlock;

// TODO: Auto-generated Javadoc
// contains information about each team/faction 
/**
 * The Class TeamObject.
 */
public class TeamObject {
	
	/**
	 * The team.
	 */
	private String team;
	
	/**
	 * The team members.
	 */
	private ArrayList<Ai> teamMembers;
	
	// makes your units less easy to detect
	/**
	 * The radio silence.
	 */
	private boolean radioSilence;
	
	/**
	 * The team size.
	 */
	private int teamSize;
	
	/**
	 * The faction colour.
	 */
	private Color factionColour;

	protected CombatVisualManager combatVisualManager;
	
	/**
	 * Instantiates a new team object.
	 *
	 * @param faction the faction
	 * @param colour the colour
	 */
	public TeamObject(CombatVisualManager combatVisualManager, String faction, Color colour){
		this.team = faction;
		radioSilence = false;
		teamSize = 0;
		factionColour = colour;
		
		teamMembers = new ArrayList<Ai>(2);
		
		this.combatVisualManager = combatVisualManager;
	}
	
	/**
	 * Adds the team member.
	 *
	 * @param ai the ai
	 */
	public void addTeamMember(Ai ai){
		this.teamMembers.add(ai);
	}
	
	// getters
	/**
	 * Gets the team.
	 *
	 * @return the team
	 */
	public String getTeam(){
		return this.team;
	}
	
	/**
	 * Gets the faction.
	 *
	 * @return the faction
	 */
	public String getFaction(){
		Pattern numberPattern = Pattern.compile("[0-9]+");
		Matcher numberMatcher;
		numberMatcher = numberPattern.matcher(this.team);
		numberMatcher.find();
		String faction = this.team.substring(numberMatcher.group().length());
		return faction;
	}
	
	/**
	 * Gets the team members.
	 *
	 * @return the team members
	 */
	public ArrayList<Ai> getTeamMembers(){
		return this.teamMembers;
	}
	
	/**
	 * Checks if is radio silence.
	 *
	 * @return true, if is radio silence
	 */
	public boolean isDrawingIndividualSight(){
		// if only 1 member radioSilence by default
		if(teamSize == 1){
			return true;
		}
		
		return this.radioSilence;
	}
	
	/**
	 * Gets the faction colour.
	 *
	 * @return the faction colour
	 */
	public Color getFactionColour(){
		return this.factionColour;
	}
	
	/**
	 * Gets the team size.
	 *
	 * @return the team size
	 */
	public int getTeamSize(){
		return teamMembers.size();
	}
	
	public int getLivingTeamSize(){
		int aliveCount = 0;
		
		for(Ai ai : teamMembers){
			if(!ai.isDead())
				aliveCount++;
		}
		
		return aliveCount;
	}
	
	/**
	 * Gets the team member.
	 *
	 * @param i the i
	 * @return the team member
	 */
	public Ai getTeamMember(int i){
		return this.teamMembers.get(i);
	}
	
	/**
	 * Team in block.
	 *
	 * @param block the block
	 * @return true, if successful
	 */
	public boolean teamInBlock(LevelBlock block){
		for(Ai ai : this.getTeamMembers()){
			if(ai.getLevelBlock() == block){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets the team combat score.
	 *
	 * @param levelBlock the level block
	 * @return the team combat score
	 */
	public int getTeamCombatScore(LevelBlock levelBlock) {
		int combatScore = 0;
		for(Ai ai : this.getTeamMembers()){
			if(!ai.isDead() && ai.getLevelBlock() == levelBlock){
				combatScore += ai.getCombatScore();
			}
		}
		return combatScore;
	}
	
	/**
	 * Gets the combat score.
	 *
	 * @return the combat score
	 */
	public int getCombatScore() {
		int totalCombatScore = 0;
		for(Ai ai : this.getTeamMembers()){
			totalCombatScore += ai.getCombatScore();
		}
		return totalCombatScore;
	}
	
	/**
	 * Gets the combat score.
	 *
	 * @param levelBlock the level block
	 * @return the combat score
	 */
	public int getCombatScore(LevelBlock levelBlock) {
		int totalCombatScore = 0;
		for(Ai ai : this.getTeamMembers()){
			// only count ai in the room or connected rooms
			if(ai.getLevelBlock() == levelBlock || ai.getLevelBlock().linksToRoom(levelBlock)){
				totalCombatScore += ai.getCombatScore();
			}
		}
		return totalCombatScore;
	}
	
	// setters
	
	/**
	 * Update team.
	 */
	public void updateTeam(){
	}
	
	/**
	 * Sets the radio silence.
	 *
	 * @param radioSilence the new radio silence
	 */
	public void setRadioSilence(boolean radioSilence){
		this.radioSilence = radioSilence;
		combatVisualManager.updateVisibleAi();
	}

	/**
	 * Purge.
	 */
	public void purge() {
		this.teamMembers = null;
	}

}
