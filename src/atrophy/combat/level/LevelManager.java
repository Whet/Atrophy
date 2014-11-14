/*
 * 
 */
package atrophy.combat.level;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import watoydoEngine.utils.Maths;
import atrophy.combat.ai.Faction;
import atrophy.combat.ai.PathFinder;
import atrophy.combat.ai.PathNotFoundException;

public class LevelManager {
	
	private static final int MAX_RANDOM_ITERATIONS = 30;
	
	private static final double CORNER_INDENT_RATIO = 0.4;
	
	private Level currentLevel;

	public LevelManager(){}
	
	public Level getCurrentLevel(){
		return this.currentLevel;
	}
	
	public LevelBlock getBlock(double[] location){
		return this.currentLevel.getBlockAt(location[0], location[1]);
	}
	
	public LevelBlock getBlock(double x, double y){
		return this.currentLevel.getBlockAt(x,y);
	}
	
	public LevelBlock getBlock(int i){
		return this.currentLevel.getBlock(i);
	}
	
	public LevelBlock[] getBlocks(){
		return this.currentLevel.getBlocks();
	}
	
	public double[] randomPosition(){
		return randomPosition(null);
	}
	
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
	
	public double[] randomInPosition(LevelBlock room){
		return randomInPosition(room, new Random());
	}
	
	public double[] randomInPosition(LevelBlock room, Random rand){
		
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
		}while(this.getBlock(vertex) != room || (this.getBlock(vertex).getLevelBlockGrid() != null && this.getBlock(vertex).getLevelBlockGrid().getNearestGridBlock(vertex) == null));
		
		return vertex;
	}
	
	public LevelBlock randomRoom(){
		return getBlock(new Random().nextInt(this.currentLevel.getBlockCount()));
	}
	
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
	
	public void setCurrentLevel(Level currentLevel) {
		this.currentLevel = currentLevel;
	}
	
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

	public LevelBlock randomRoom(Faction faction, ArrayList<LevelBlock> bannedRooms) {
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

	public boolean isRoomBanned(Faction faction, LevelBlock block) {
		return this.currentLevel.isBanned(block, faction);
	}

}
