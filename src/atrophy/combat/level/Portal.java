/*
 * 
 */
package atrophy.combat.level;

import java.util.HashMap;

import watoydoEngine.utils.Maths;
import atrophy.combat.ai.Ai;

// TODO: Auto-generated Javadoc
/**
 * The Class Portal.
 */
public class Portal {
	
	/**
	 * The Constant RADIUS.
	 */
	public static final int RADIUS = 40;

	// A faction may wish to keep others from using this door
	/**
	 * The faction watch.
	 */
	private String factionWatch;
	
	/**
	 * The welded.
	 */
	private boolean welded;
	
	/**
	 * The location.
	 */
	private double[] location;
	
	// Stores the portal's location in the key levelblock
	/**
	 * The link locations.
	 */
	private HashMap<LevelBlock, double[]> linkLocations;
	
	/**
	 * The linked blocks.
	 */
	private LevelBlock[] linkedBlocks;
	
	/**
	 * Instantiates a new portal.
	 *
	 * @param x the x
	 * @param y the y
	 * @param link1 the link1
	 * @param link1Locx the link1 locx
	 * @param link1Locy the link1 locy
	 * @param link2 the link2
	 * @param link2Locx the link2 locx
	 * @param link2Locy the link2 locy
	 */
	public Portal(int x, int y, LevelBlock link1, int link1Locx, int link1Locy, LevelBlock link2, int link2Locx, int link2Locy){
		
		this.linkedBlocks = new LevelBlock[2];
		this.linkedBlocks[0] = link1;
		this.linkedBlocks[1] = link2;
		
		this.linkLocations = new HashMap<LevelBlock,double[]>(2);
		this.linkLocations.put(link1, new double[]{link1Locx, link1Locy});
		this.linkLocations.put(link2, new double[]{link2Locx, link2Locy});
		
		this.factionWatch = "";
		welded = false;
		
		this.location = new double[2];
		this.location[0] = x;
		this.location[1] = y;
		
	}
	
	// the void
	// destroys references so gc can clean up
	/**
	 * Purge.
	 */
	public void purge(){
		this.linkedBlocks = null;
	}
	
	// getters
	
	/**
	 * Gets the location.
	 *
	 * @param room the room
	 * @return the location
	 */
	public double[] getLocation(LevelBlock room){
		return this.linkLocations.get(room);
	}
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public double[] getLocation(){
		return this.location;
	}
	
	/**
	 * Gets the linked blocks.
	 *
	 * @return the linked blocks
	 */
	public LevelBlock[] getLinkedBlocks(){
		return this.linkedBlocks;
	}
	
	/**
	 * Connects to.
	 *
	 * @param room the room
	 * @return true, if successful
	 */
	public boolean connectsTo(LevelBlock room){
		if(this.linkedBlocks[0] == room || this.linkedBlocks[1] == room){
			return true;
		}
		return false;
	}
	
	// for a portal return the LevelBlock that isn't the current room
	/**
	 * Links to.
	 *
	 * @param currentRoom the current room
	 * @return the level block
	 */
	public LevelBlock linksTo(LevelBlock currentRoom){
		if(this.linkedBlocks[0] == currentRoom){
			return this.linkedBlocks[1];
		}
		return this.linkedBlocks[0];
	}
	
	// returns true if the portal managed to swap the room the ai was in
	/**
	 * Enter.
	 *
	 * @param entryAi the entry ai
	 * @return the int
	 */
	public int enter(Ai entryAi){
		if(isInRadius(entryAi.getLocation(), entryAi.getLevelBlock())){
			
			if(this.canUse()){
				
				// Check on both sides of the door if someone sees the ai has gone through the door
//				if(!hasSecurityLevel(entryAi) && CombatVisualManager.isAiInSight(entryAi, factionWatch)){
//					CombatMembersManager.getInstance().getCommander(factionWatch).removeAlliance(entryAi.getFaction());
//					CombatMembersManager.getInstance().getCommander(factionWatch).addHatedAi(entryAi);
//				}
				
				// room swap successful
				entryAi.setLevelBlock(linksTo(entryAi.getLevelBlock()));
				// move ai into other room		
				entryAi.setLocation(this.getLocation(entryAi.getLevelBlock()).clone());
				
//				if(!hasSecurityLevel(entryAi) && CombatVisualManager.isAiInSight(entryAi, factionWatch)){
//				//	CombatMembersManager.getInstance().getCommander(factionWatch).removeAlliance(entryAi.getFaction());
//					CombatMembersManager.getInstance().getCommander(factionWatch).addHatedAi(entryAi);
//				}
				
				return 0;
			}
			
			// throw the exception when the ai would be able to enter but no longer can
			return 1;
		}
		return 2;
	}
	
	/**
	 * Checks if is in radius.
	 *
	 * @param location the location
	 * @param block the block
	 * @return true, if is in radius
	 */
	public boolean isInRadius(double[] location, LevelBlock block){
		if(Maths.getDistance(this.getLocation(block), location) <= RADIUS){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks for security level.
	 *
	 * @param ai the ai
	 * @return true, if successful
	 */
	public boolean hasSecurityLevel(Ai ai){

		if(factionWatch.equals("") || ai.getFaction().equals(factionWatch)){
			return true;
		}		
		
		return false;
	}
	
	/**
	 * Sets the faction watch.
	 *
	 * @param factionWatch the new faction watch
	 */
	public void setFactionWatch(String factionWatch){
		this.factionWatch = factionWatch;
	}
	
	/**
	 * Can use.
	 *
	 * @return true, if successful
	 */
	public boolean canUse() {
		return !this.welded;
	}

	/**
	 * Sets the welded.
	 *
	 * @param welded the new welded
	 */
	public void setWelded(boolean welded) {
		this.welded = welded;
	}
}
