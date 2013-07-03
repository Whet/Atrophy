/*
 * 
 */
package atrophy.combat.ai;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import watoydoEngine.utils.Maths;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelBlockGrid;
import atrophy.combat.level.LevelBlockGrid.GridBlock;
import atrophy.combat.level.Portal;

public class PathFinder {
	
	public static ArrayList<Portal> findAStarPath(double[] startLocation, double[] targetLocation, LevelBlock startBlock, LevelBlock targetRoom, Portal excludedPortal, boolean ignoreClosedDoors) throws PathNotFoundException{
	    
		PathingPortalSet closedSet = new PathingPortalSet();
	    PathingPortalSet openSet = new PathingPortalSet();
	    
	    Comparator<PathingPortal> fComparator = new Comparator<PathingPortal>() {

			@Override
			public int compare(PathingPortal o1, PathingPortal o2) {
				if(o1.f > o2.f) return 1;
				else if(o1.f < o2.f) return -1;
				return 0;
			}
			
		};
		PriorityQueue<PathingPortal> fQueue = new PriorityQueue<PathingPortal>(20, fComparator );
	    
	    // Populate with portals in this room
	    for(Portal portal : startBlock.getPortals()){
	    	if(portal == excludedPortal || (!ignoreClosedDoors && !portal.canUse()))
	    		continue;
	    	
	    	PathingPortal pathingPortal = new PathingPortal(portal);
	    	pathingPortal.h = Maths.getDistance(portal.getLocation(), targetLocation);
	    	pathingPortal.g = Maths.getDistance(startLocation, portal.getLocation());
	    	pathingPortal.calcF();
	    	openSet.add(pathingPortal);
	    	fQueue.add(pathingPortal);
	    }
	    
	    Map<PathingPortal, PathingPortal> cameFrom = new HashMap<>();
	    
	    while(!openSet.isEmpty()){
	        
	        PathingPortal current = fQueue.poll();
	        
	        if(current.linksTo(targetRoom))
	            return createPortalPath(cameFrom, current, startBlock);
	        
	        openSet.remove(current);
	        closedSet.add(current);
	        
	        double newG;
	        
	        // Just loop through all portals on both sides of portal
	        for(Portal neighbour : current.getAllNeighbours()){
	            if(excludedPortal == neighbour || closedSet.contains(neighbour) || (!ignoreClosedDoors && !neighbour.canUse()))
	                continue;
	            
	            newG = current.g + Maths.getDistance(neighbour.getLocation(), current.portal.getLocation());
	            
	            if(!openSet.contains(neighbour)) {
	            	PathingPortal pathPortal = new PathingPortal(neighbour);
	                cameFrom.put(pathPortal, current);
	                pathPortal.g = newG;
	                pathPortal.h = Maths.getDistance(pathPortal.portal.getLocation(), targetLocation);
	                pathPortal.calcF();
	                
	                openSet.add(pathPortal);
	                fQueue.add(pathPortal);
	            }
	            else if (newG < openSet.get(neighbour).g) {
	            	PathingPortal pathPortal = openSet.get(neighbour);
	            	cameFrom.put(pathPortal, current);
	                pathPortal.g = newG;
	                pathPortal.h = Maths.getDistance(pathPortal.portal.getLocation(), targetLocation);
	                pathPortal.calcF();
	                
	                openSet.add(pathPortal);
	                fQueue.add(pathPortal);
	            }
	        }
	    }
	    
	    throw new PathNotFoundException(startBlock);
	}
	
	private static ArrayList<Portal> createPortalPath(Map<PathingPortal, PathingPortal> cameFrom, PathingPortal last, LevelBlock startBlock) {
		
		PathingPortal current = last;
		
		ArrayList<Portal> path = new ArrayList<>();
		
		while(!current.portal.connectsTo(startBlock)) {
			path.add(current.portal);
			current = cameFrom.get(current);
		}
		
		path.add(current.portal);
		
		return path;
	}

	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom)throws PathNotFoundException{
		return findAStarPath(startLocation, endLocation, startBlock, targetRoom, null, true);
	}
	
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom, Portal excludedPortal)throws PathNotFoundException{
		return findAStarPath(startLocation, endLocation, startBlock, targetRoom, excludedPortal, true);
	}
	
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom, Portal excludedPortal, boolean ignoreClosedDoors)throws PathNotFoundException{
		
		// Check for special case where all doors are blocked to the target room
		if(targetRoom == null || !ignoreClosedDoors && isRoomCompletelyBlocked(targetRoom)){
			throw new PathNotFoundException(targetRoom);
		}
		
		return findAStarPath(startLocation, endLocation, startBlock, targetRoom, excludedPortal, ignoreClosedDoors);
	}
	
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom, boolean ignoreClosedDoors)throws PathNotFoundException{
		return findAStarPath(startLocation, endLocation, startBlock, targetRoom, null, ignoreClosedDoors);
	}
	
	private static boolean isRoomCompletelyBlocked(LevelBlock targetRoom) {
		for(int i = 0; i < targetRoom.getPortalCount(); i++){
			if(targetRoom.getPortal(i).canUse()){
				return false;
			}
		}
		return true;
	}

	// Intra room pathfinding
	
	public static ArrayList<double[]> findIntraPath(Ai mover, double[] moveLocation, double moveDistance) throws PathNotFoundException{
	    return findAStarPath(mover, moveLocation, moveDistance);
	}
	
	public static ArrayList<double[]> findAStarPath(Ai mover, double[] moveLocation, double moveDistance) throws PathNotFoundException{
	    
	    LevelBlockGrid navGrid = mover.getLevelBlock().getLevelBlockGrid();
	    
	    navGrid.resetPicks();
	    
	    Set<GridBlock> closedSet = new HashSet<>();
	    Set<GridBlock> openSet = new HashSet<>();
	    
	    GridBlock startBlock = navGrid.getNearestGridBlock(mover.getLocation());
        openSet.add(startBlock);
	    startBlock.g = 0;
	    startBlock.h = Maths.getDistance(startBlock.getPathLocation(), moveLocation);
	    startBlock.f = startBlock.g + startBlock.h;
        
	    Map<GridBlock, GridBlock> cameFrom = new HashMap<>();
	    
        GridBlock goal = navGrid.getGridBlock(moveLocation);
	    
	    while(!openSet.isEmpty()){
	        
	        GridBlock current = lowestF(openSet);
	        
	        if(current == goal || (goal == null && Maths.getDistance(current.getPathLocation(), moveLocation) <= moveDistance))
	            return createAStarPath(cameFrom, current, startBlock, mover.getLevelBlock().getHitBox());
	        
	        openSet.remove(current);
	        closedSet.add(current);
	        
	        double newG;
	        
	        for(GridBlock neighbour : current.neighbours){
	            if(closedSet.contains(neighbour))
	                continue;
	            
	            if(current.nonDiagNeighbours.contains(neighbour))
	                newG = current.g + 10;
	            else
	                newG = current.g + 18;
	            
	            if(!openSet.contains(neighbour) || newG < neighbour.g ) {
	                cameFrom.put(neighbour, current);
	                neighbour.g = newG;
	                neighbour.h = Maths.getDistance(startBlock.getPathLocation(), moveLocation);
	                neighbour.f = neighbour.g + neighbour.h;
	                
	                openSet.add(neighbour);
	            }
	        }
	    }
	    
	    throw new PathNotFoundException(mover.getLevelBlock());
	}
	
    private static GridBlock lowestF(Set<GridBlock> openSet) {
        
	    GridBlock returnBlock = null;
	    
	    for(GridBlock block : openSet){
            if(returnBlock == null  || block.f < returnBlock.f)
                returnBlock = block;
        }
	    
	    return returnBlock;
    }

    private static ArrayList<double[]> createAStarPath(Map<GridBlock, GridBlock> cameFrom, GridBlock goal, GridBlock start, Polygon room) {
        
        GridBlock current = goal;
        
        ArrayList<double[]> path = new ArrayList<>();
        
        while(current != start) {
            current.picked = true;
            
            if(path.size() == 0 || !CombatVisualManager.isInSight(path.get(path.size() - 1)[0],
            													  path.get(path.size() - 1)[1],
            													  current.getPathLocation()[0],
            													  current.getPathLocation()[1],
            													  room))
            	path.add(current.getPathLocation());
            
            current = cameFrom.get(current);
        }
        
        return path;
	}
    
    private static class PathingPortal {
		public Portal portal;
		public double g, h, f;
		
		public PathingPortal(Portal portal) {
			this.portal = portal;
		}
		
		public void calcF() {
			f = g + h;
		}
		
		@Override
		public boolean equals(Object obj) {
			if((obj instanceof PathingPortal && ((PathingPortal) obj).portal == this.portal) ||
			   (obj instanceof Portal && obj == this.portal))
				return true;
			return false;
		}

		public boolean linksTo(LevelBlock targetRoom) {
			return this.portal.connectsTo(targetRoom);
		}

		public List<Portal> getAllNeighbours() {
			List<Portal> portals = this.portal.getLinkedBlocks()[0].getPortals();
			List<Portal> portals1 = this.portal.getLinkedBlocks()[1].getPortals();
			
			List<Portal> combo = new ArrayList<>();
			
			for(Portal portal : portals){
				combo.add(portal);
			}
			for(Portal portal : portals1){
				combo.add(portal);
			}
			
			return combo;
		}
		
	}
	
	private static class PathingPortalSet extends HashSet<PathingPortal> {
		
		@Override
		public boolean contains(Object o) {
			if(o instanceof Portal ||o instanceof PathingPortal){
				for(PathingPortal pathPortal : this){
					if(pathPortal.equals(o))
						return true;
				}
			}
			return false;
		}

		public PathingPortal get(Portal portal) {
			for(PathingPortal pathPortal : this){
				if(pathPortal.equals(portal))
					return pathPortal;
			}
			return null;
		}
		
	}
	
}
