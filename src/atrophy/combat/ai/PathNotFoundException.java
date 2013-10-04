package atrophy.combat.ai;

import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;


@SuppressWarnings("serial")
public class PathNotFoundException extends Exception {
	
	private LevelBlock room;
	
	public PathNotFoundException(LevelBlock room){
		this.room = room;
	}
	
	public double[] getMoveLocation(LevelManager levelManager){
		return levelManager.randomInPosition(this.room);
	}
	
	public LevelBlock getLevelBlock(){
		return this.room;
	}
	 
	
}
