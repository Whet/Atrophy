/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.formations;

import atrophy.combat.ai.thinkingAi.ThinkingAi;

// TODO: Auto-generated Javadoc
/**
 * The Class HerringBone.
 */
public class HerringBone extends Formation{
	
	// front faces towards objective
	// sides are right angles
	// final faces the rear
	/**
	 * The Constant angles.
	 */
	private static final double[] angles = {0.0,90.0,180.0};
	
	// first is the spacing
	// second is the angle modifier for where to stand, e.g 180 means that you stand behind the person in front, 90 means you stand to the side
	/**
	 * The Constant positioning.
	 */
	private static final double[] positioning = {60.0,90.0};
	
	/**
	 * Instantiates a new herring bone.
	 */
	public HerringBone(){
		super();
		formationType = "Patrolling";
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.formations.Formation#getHeading(atrophy.combat.ai.thinkingAi.ThinkingAi)
	 */
	public double getHeading(ThinkingAi ai){
		// starts at 1, the leader and non participants do not call this function.
		for(int i = 1; i < this.participants.size(); i++){
			if(this.participants.get(i) == ai){
				
				// second position and not at end
				// look at right angle to leader
				if(i == 1 && 
				   this.participants.size() > 2){
					return this.participants.get(0).getLookAngle() + angles[1];
				}
				// middle position and not the end of the line
				// look alternating right and left of leader
				else if(i != this.participants.size() - 1 && 
						this.participants.size() > 2){
					
					return this.participants.get(i - 1).getLookAngle() + angles[2];
				}
				// act as end of the line, look at opposite way to leader
				else{
					return angles[2] + this.participants.get(0).getLookAngle();
				}
				
			}
		}
		
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.formations.Formation#getLocation(atrophy.combat.ai.thinkingAi.ThinkingAi)
	 */
	public double[] getLocation(ThinkingAi ai){
		
		for(int i = 0; i < this.participants.size(); i++){
		
			if(this.participants.get(i) == ai){
				double[] location = {Math.sin(Math.toRadians(this.participants.get(0).getLookAngle() + positioning[1])) * (i * positioning[0]) + this.participants.get(0).getLocation()[0],
									 Math.cos(Math.toRadians(this.participants.get(0).getLookAngle() + positioning[1])) * (i * positioning[0]) + this.participants.get(0).getLocation()[1]};
				
				return location;
			}
		}
		
		// not reached
		return null;
	}
	
}
