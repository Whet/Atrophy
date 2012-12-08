/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.util.ArrayList;


// TODO: Auto-generated Javadoc
/**
 * The Class Formation.
 */
public abstract class Formation {
	
	/**
	 * The formation type.
	 */
	protected String formationType;
	
	/**
	 * The participants.
	 */
	protected ArrayList<ThinkingAi> participants;
	
	/**
	 * Instantiates a new formation.
	 */
	public Formation(){
		participants = new ArrayList<ThinkingAi>(2);
	}
	
	/**
	 * Join formation.
	 *
	 * @param participant the participant
	 */
	public void joinFormation(ThinkingAi participant){
		
		// joins if the arraylist doesn't contain the ai
		// and if the arraylist is empty or if there are others, this ai is in the same room
		if(!participants.contains(participant) &&(
		  (this.participants.size() == 0) || 
		  (this.participants.get(0).getLevelBlock() == participant.getLevelBlock()))){
			participants.add(participant);
		}
	}
	
	/**
	 * Checks if is in formation.
	 *
	 * @param ai the ai
	 * @return true, if is in formation
	 */
	public boolean isInFormation(ThinkingAi ai){
		if(this.participants.contains(ai)){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if is leader.
	 *
	 * @param ai the ai
	 * @return true, if is leader
	 */
	public boolean isLeader(ThinkingAi ai){
		if(this.participants.size() > 0 &&
		   this.participants.get(0) == ai){
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the heading.
	 *
	 * @param ai the ai
	 * @return the heading
	 */
	public double getHeading(ThinkingAi ai){
		return 0;
	}
	
	/**
	 * Gets the location.
	 *
	 * @param ai the ai
	 * @return the location
	 */
	public double[] getLocation(ThinkingAi ai){
		return null;
	}
	
	/**
	 * Update formation.
	 */
	public void updateFormation(){
		for(int i = 0; i < this.participants.size(); i++){
			if(this.participants.get(i).isDead() || 
			   !this.participants.get(i).isListeningToCommand()){
				this.participants.remove(this.participants.get(i));
			}
		}
		
		if(this.participants.size() > 0){
			
			this.prioritiseUnits();
			
			// loop again to see if the new leader, .get(0), is in the same room as the other members and remove members who are not
			for(int i = 1; i < this.participants.size(); i++){
				if(this.participants.get(i).getLevelBlock() != this.participants.get(0).getLevelBlock()){
					this.participants.remove(this.participants.get(i));
				}
			}
		}
		//fromTheFrontNumber();
	}
	
	/**
	 * Prioritise units.
	 */
	protected void prioritiseUnits(){
		ThinkingAi swapAi = this.participants.get(0);
		
		// loop to assign the highest armoured ai to be the leader
		for(int i = 1; i < this.participants.size(); i++){
			if(this.participants.get(i).getArmour() > swapAi.getArmour()){
				swapAi = this.participants.get(i);
			}
		}
		
		// insert highest armoured at start
		participants.remove(swapAi);
		participants.add(0, swapAi);
	}
	
	/**
	 * From the front number.
	 */
	public void fromTheFrontNumber(){
		if(this.participants.size() > 1){
			for(int i = 0; i < this.participants.size() - 1; i++){
				System.out.println(this.participants.get(i).getName() + ": "+ (i + 1));
			}
			System.out.println(this.participants.get(this.participants.size() - 1).getName() + ": "+ (this.participants.size()) + " sir!");
		}
	}
	
	/**
	 * Gets the formation type.
	 *
	 * @return the formation type
	 */
	public String getFormationType(){
		return this.formationType;
	}
	
	/**
	 * Randomise elements.
	 */
	public void randomiseElements(){
	}
	
}
