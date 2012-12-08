/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;


// TODO: Auto-generated Javadoc
/**
 * The Class PathNotFoundException.
 */
@SuppressWarnings("serial")
public class PathNotFoundException extends Exception {
	
	/**
	 * The room.
	 */
	private LevelBlock room;
	
	/**
	 * Instantiates a new path not found exception.
	 *
	 * @param room the room
	 */
	public PathNotFoundException(LevelBlock room){
		this.room = room;
	}
	
	/**
	 * Gets the move location.
	 * @param levelManager 
	 *
	 * @return the move location
	 */
	public double[] getMoveLocation(LevelManager levelManager){
		return levelManager.randomInPosition(this.room);
	}
	
	/**
	 * Gets the level block.
	 *
	 * @return the level block
	 */
	public LevelBlock getLevelBlock(){
		return this.room;
	}
	 
	
}
