/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.level;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.ai.PathFinder;
import atrophy.combat.ai.PathNotFoundException;

// TODO: Auto-generated Javadoc
// holds details about the current level
/**
 * The Class LevelManager.
 */
public class LevelManager {
	
	/**
	 * The Constant MAX_RANDOM_ITERATIONS.
	 */
	private static final int MAX_RANDOM_ITERATIONS = 30;
	
	/**
	 * The Constant CORNER_INDENT_RATIO.
	 */
	private static final double CORNER_INDENT_RATIO = 0.4;
	
	/**
	 * The current level.
	 */
	private Level currentLevel;

	/**
	 * Instantiates a new level manager.
	 */
	public LevelManager(){}
	
	/**
	 * Gets the current level.
	 *
	 * @return the current level
	 */
	public Level getCurrentLevel(){
		return this.currentLevel;
	}
	
	/**
	 * Gets the block.
	 *
	 * @param location the location
	 * @return the block
	 */
	public LevelBlock getBlock(double[] location){
		return this.currentLevel.getBlockAt(location[0], location[1]);
	}
	
	/**
	 * Gets the block.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the block
	 */
	public LevelBlock getBlock(double x, double y){
		return this.currentLevel.getBlockAt(x,y);
	}
	
	/**
	 * Gets the block.
	 *
	 * @param i the i
	 * @return the block
	 */
	public LevelBlock getBlock(int i){
		return this.currentLevel.getBlock(i);
	}
	
	/**
	 * Gets the blocks.
	 *
	 * @return the blocks
	 */
	public LevelBlock[] getBlocks(){
		return this.currentLevel.getBlocks();
	}
	
	/**
	 * Random position.
	 *
	 * @return the double[]
	 */
	public double[] randomPosition(){
		return randomPosition(null);
	}
	
	/**
	 * Random position.
	 *
	 * @param exclude the exclude
	 * @return the double[]
	 */
	public double[] randomPosition(LevelBlock exclude){
		
		int index = (int)(this.getCurrentLevel().getBlockCount() * Math.random());
		
		// the the excluded block was picked
		if(this.getBlock(index) == exclude){
			// increase index by 1 or decrease by 1, done just in case this causes looping
			if(this.currentLevel.getBlockCount() - 1 >= index + 1){
				index++;
			}
			else{
				index--;
			}
		}
		
		return randomInPosition(getBlock(index));
	}
	
	/**
	 * Random in position.
	 *
	 * @param room the room
	 * @return the double[]
	 */
	public double[] randomInPosition(LevelBlock room){
		
		Random rand = new Random();
		
		double[] vertex;
		
		// move slightly towards centre from vertex to avoid trying to enter an adjacent room
		double[] centre = {room.getHitBox().getBounds2D().getCenterX(),
				           room.getHitBox().getBounds2D().getCenterY()};
		
		do{
			// draw a line between two verticies and pick a point along them
			
			vertex = new double[]{room.getHitBox().xpoints[rand.nextInt(room.getHitBox().npoints)],
	     		                  room.getHitBox().ypoints[rand.nextInt(room.getHitBox().npoints)]};
			
			double dx = Maths.mod(vertex[0] - centre[0]);
			double dy = Maths.mod(vertex[1] - centre[1]);
			
			double constRatioAddition = Math.random() * (1 - CORNER_INDENT_RATIO); 
			
			if(vertex[0] > centre[0]){
				vertex[0] = vertex[0] - ((CORNER_INDENT_RATIO + constRatioAddition) * dx);
			}
			else{
				vertex[0] = vertex[0] + ((CORNER_INDENT_RATIO + constRatioAddition) * dx);
			}
			
			if(vertex[1] > centre[1]){
				vertex[1] = vertex[1] - ((CORNER_INDENT_RATIO + constRatioAddition) * dy);
			}
			else{
				vertex[1] = vertex[1] + ((CORNER_INDENT_RATIO + constRatioAddition) * dy);
			}
		}while(this.getBlock(vertex) == null);
		
		return vertex;
	}
	
	/**
	 * Random room.
	 *
	 * @return the level block
	 */
	public LevelBlock randomRoom(){
		Random rand = new Random();
		return getBlock(rand.nextInt(this.currentLevel.getBlockCount()));
	}
	
	/**
	 * Random starting room.
	 *
	 * @param avoidRoom the avoid room
	 * @return the level block
	 */
	public LevelBlock randomStartingRoom(LevelBlock avoidRoom){
		for(int i = 0; i < this.currentLevel.getBlockCount(); i++){
			try{
				
				// choose a room that is a certain distance from the enemies
				// limit the number of portals the room can have to avoid ambush from an unseen angle
				if(avoidRoom != this.currentLevel.getBlock(i) &&
				   this.currentLevel.getBlock(i).getPortalCount() < 3 &&
				   PathFinder.createPathway(null,null,this.currentLevel.getBlock(i), avoidRoom, false).size() > 4){
					
					return this.currentLevel.getBlock(i);
				}
			}
			catch(PathNotFoundException pnfe){}
		}
		return randomRoom();
	}
	
	/**
	 * Sets the current level.
	 *
	 * @param currentLevel the new current level
	 */
	public void setCurrentLevel(Level currentLevel) {
		this.currentLevel = currentLevel;
	}

	/**
	 * Gets the height at.
	 *
	 * @param location the location
	 * @return the height at
	 */
	public int getHeightAt(double[] location){
		return 0;
	}
	
	/**
	 * Gets the height at.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the height at
	 */
	public int getHeightAt(double x, double y){
		return 0;
	}

	/**
	 * Random room.
	 *
	 * @param bannedRooms the banned rooms
	 * @return the level block
	 */
	public LevelBlock randomRoom(Set<LevelBlock> bannedRooms) {
		int iterations = 0;
		LevelBlock room = null;
		do{
			room = this.randomRoom();
			iterations++;
		}while(bannedRooms.contains(room));
		
		if(iterations > MAX_RANDOM_ITERATIONS){
			System.err.println("LOTS OF ITERATIONS");
		}
		
		return room;
	}

	/**
	 * Random room.
	 *
	 * @param faction the faction
	 * @param bannedRooms the banned rooms
	 * @return the level block
	 */
	public LevelBlock randomRoom(String faction, ArrayList<LevelBlock> bannedRooms) {
		int iterations = 0;
		LevelBlock room = null;
		do{
			room = this.randomRoom();
			iterations++;
		}while((bannedRooms.contains(room) || currentLevel.isBanned(room, faction)));
		
		if(iterations > MAX_RANDOM_ITERATIONS){
			System.err.println("LOTS OF ITERATIONS");
		} 
		
		return room;
	}

	/**
	 * Gets the faction room.
	 *
	 * @param faction the faction
	 * @return the faction room
	 */
	public LevelBlock getFactionRoom(String faction) {
		return this.currentLevel.getFactionRoom(faction);
	}

	/**
	 * Checks if is room banned.
	 *
	 * @param faction the faction
	 * @param block the block
	 * @return true, if is room banned
	 */
	public boolean isRoomBanned(String faction, LevelBlock block) {
		return this.currentLevel.isBanned(block, faction);
	}

	/**
	 * Gets the target block.
	 *
	 * @param faction the faction
	 * @return the target block
	 */
	public LevelBlock getTargetBlock(String faction) {
		return this.currentLevel.getTargetBlock(faction);
	}

	public boolean isInSaferoom(LevelBlock levelBlock) {
		return this.currentLevel.isInSaferoom(levelBlock);
	}
	
}
