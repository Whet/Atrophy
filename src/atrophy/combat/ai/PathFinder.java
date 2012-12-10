/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Stack;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.Portal;

// TODO: Auto-generated Javadoc
/**
 * The Class PathFinder.
 */
public class PathFinder {
	
	/**
	 * The Constant MAX_ITERATIONS.
	 */
	private static final int MAX_ITERATIONS = 12;
	
	/**
	 * Creates the pathway.
	 *
	 * @param startLocation the start location
	 * @param endLocation the end location
	 * @param startBlock the start block
	 * @param targetRoom the target room
	 * @return the array list
	 * @throws PathNotFoundException the path not found exception
	 */
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom)throws PathNotFoundException{
		return createPathway(startLocation,endLocation,startBlock,targetRoom,false);
	}
	
	/**
	 * Creates the pathway.
	 *
	 * @param startLocation the start location
	 * @param endLocation the end location
	 * @param startBlock the start block
	 * @param targetRoom the target room
	 * @param excludedPortal the excluded portal
	 * @return the array list
	 * @throws PathNotFoundException the path not found exception
	 */
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom, Portal excludedPortal)throws PathNotFoundException{
		return createPathway(startLocation,endLocation,startBlock,targetRoom,excludedPortal,false);
	}
	
	/**
	 * Creates the pathway.
	 *
	 * @param startLocation the start location
	 * @param endLocation the end location
	 * @param startBlock the start block
	 * @param targetRoom the target room
	 * @param excludedPortal the excluded portal
	 * @param ignoreClosedDoors the ignore closed doors
	 * @return the array list
	 * @throws PathNotFoundException the path not found exception
	 */
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom, Portal excludedPortal, boolean ignoreClosedDoors)throws PathNotFoundException{
		
		// Check for special case where all doors are blocked to the target room
		if(targetRoom == null || !ignoreClosedDoors && isRoomCompletelyBlocked(targetRoom)){
			throw new PathNotFoundException(targetRoom);
		}
		
		ArrayList<Portal> finalPath;
		
		Stack<ArrayList<PathfindingNode>> nodeLayers = new Stack<ArrayList<PathfindingNode>>();
		
		ArrayList<PathfindingNode> nextLayer;
		
		// create the first layer to hold the starting room
		nextLayer = new ArrayList<PathfindingNode>(1);
		
		// create a vast network of nodes to all rooms until the final one is reached
		// the lowest level of the network contains the room started at
		// the highest level contains the final room
		// intermediate levels contain all rooms along the way, even ones not useful to the path
		createPathNodes(startBlock,nextLayer,nodeLayers,targetRoom,excludedPortal,ignoreClosedDoors);
		
		finalPath = new ArrayList<Portal>(nodeLayers.size());
		
		// work back through nodes and generate path
		
		PathfindingNode currentNode = nodeLayers.peek().get(0);
		
		// while the current node is not the target room, work back through the nodes
		while(currentNode.getLevelBlock() != startBlock){
			finalPath.add(currentNode.getPortalBack());
			currentNode = currentNode.getPreviousBlock();
		}
		
		if(startLocation != null && endLocation != null){
			return optimalPortalsForPath(startLocation, endLocation, targetRoom, finalPath, ignoreClosedDoors);
		}
		
		return finalPath;
	}
	
	/**
	 * Creates the pathway.
	 *
	 * @param startLocation the start location
	 * @param endLocation the end location
	 * @param startBlock the start block
	 * @param targetRoom the target room
	 * @param ignoreClosedDoors the ignore closed doors
	 * @return the array list
	 * @throws PathNotFoundException the path not found exception
	 */
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom, boolean ignoreClosedDoors)throws PathNotFoundException{
		
		// Check for special case where all doors are blocked to the target room
		if(targetRoom == null || !ignoreClosedDoors && isRoomCompletelyBlocked(targetRoom)){
			throw new PathNotFoundException(targetRoom);
		}
		
		ArrayList<Portal> finalPath;
		
		Stack<ArrayList<PathfindingNode>> nodeLayers = new Stack<ArrayList<PathfindingNode>>();
		
		ArrayList<PathfindingNode> nextLayer;
		
		// create the first layer to hold the starting room
		nextLayer = new ArrayList<PathfindingNode>(1);
		
		// create a vast network of nodes to all rooms until the final one is reached
		// the lowest level of the network contains the room started at
		// the highest level contains the final room
		// intermediate levels contain all rooms along the way, even ones not useful to the path
		createPathNodes(startBlock,nextLayer,nodeLayers,targetRoom,ignoreClosedDoors);
		
		finalPath = new ArrayList<Portal>(nodeLayers.size());
		
		// work back through nodes and generate path
		
		PathfindingNode currentNode = nodeLayers.peek().get(0);
		
		// while the current node is not the target room, work back through the nodes
		while(currentNode.getLevelBlock() != startBlock){
			finalPath.add(currentNode.getPortalBack());
			currentNode = currentNode.getPreviousBlock();
		}
		
		if(startLocation != null && endLocation != null){
			return optimalPortalsForPath(startLocation, endLocation, targetRoom, finalPath, ignoreClosedDoors);
		}
		
		return finalPath;
	}
	
	/**
	 * Creates the pathway.
	 *
	 * @param startLocation the start location
	 * @param endLocation the end location
	 * @param startBlock the start block
	 * @param targetRoom the target room
	 * @param excludedRooms the excluded rooms
	 * @param ignoreClosedDoors the ignore closed doors
	 * @return the array list
	 * @throws PathNotFoundException the path not found exception
	 */
	public static ArrayList<Portal> createPathway(double[] startLocation, double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom, ArrayList<LevelBlock> excludedRooms, boolean ignoreClosedDoors)throws PathNotFoundException{
		
		// Check for special case where all doors are blocked to the target room
		if(targetRoom == null || !ignoreClosedDoors && isRoomCompletelyBlocked(targetRoom)){
			throw new PathNotFoundException(targetRoom);
		}
		
		ArrayList<Portal> finalPath;
		
		Stack<ArrayList<PathfindingNode>> nodeLayers = new Stack<ArrayList<PathfindingNode>>();
		
		ArrayList<PathfindingNode> nextLayer;
		
		// create the first layer to hold the starting room
		nextLayer = new ArrayList<PathfindingNode>(1);
		
		// create a vast network of nodes to all rooms until the final one is reached
		// the lowest level of the network contains the room started at
		// the highest level contains the final room
		// intermediate levels contain all rooms along the way, even ones not useful to the path
		createPathNodes(startBlock,nextLayer,nodeLayers,targetRoom,excludedRooms,ignoreClosedDoors);
		
		finalPath = new ArrayList<Portal>(nodeLayers.size());
		
		// work back through nodes and generate path
		
		PathfindingNode currentNode = nodeLayers.peek().get(0);
		
		// while the current node is not the target room, work back through the nodes
		while(currentNode.getLevelBlock() != startBlock){
			finalPath.add(currentNode.getPortalBack());
			currentNode = currentNode.getPreviousBlock();
		}
		
		if(startLocation != null && endLocation != null){
			return optimalPortalsForPath(startLocation, endLocation, targetRoom, finalPath, ignoreClosedDoors);
		}
		
		return finalPath;
	}
	
	/**
	 * Checks if is room completely blocked.
	 *
	 * @param targetRoom the target room
	 * @return true, if is room completely blocked
	 */
	private static boolean isRoomCompletelyBlocked(LevelBlock targetRoom) {
		for(int i = 0; i < targetRoom.getPortalCount(); i++){
			if(targetRoom.getPortal(i).canUse()){
				return false;
			}
		}
		return true;
	}

	/**
	 * Creates the path nodes.
	 *
	 * @param startBlock the start block
	 * @param nextLayer the next layer
	 * @param nodeLayers the node layers
	 * @param targetRoom the target room
	 * @param excludedRooms the excluded rooms
	 * @param ignoreClosedDoors the ignore closed doors
	 * @throws PathNotFoundException the path not found exception
	 */
	private static void createPathNodes(LevelBlock startBlock,
										ArrayList<PathfindingNode> nextLayer,
										Stack<ArrayList<PathfindingNode>> nodeLayers,
										LevelBlock targetRoom, ArrayList<LevelBlock> excludedRooms,
										boolean ignoreClosedDoors) throws PathNotFoundException {

		nextLayer.add(new PathfindingNode(startBlock, null, null));
		nodeLayers.add(nextLayer);
		
		// 100 is an arbitrary amount
		// if the path is not found in this many loops throw an exception
		for(int p = 0; p < MAX_ITERATIONS; p++){
			
			nextLayer = new ArrayList<PathfindingNode>(8);
			
			// for every node on the top layer
			for(int i = 0; i < nodeLayers.peek().size(); i++){
				// for every portal in the room that the node represents
				for(int j = 0; j < nodeLayers.peek().get(i).getLevelBlock().getPortalCount(); j++){
					// create a new node for every connecting room so long as it doesn't already exist
					if(!roomLayersContains(nodeLayers, nextLayer,
					                       nodeLayers.peek().get(i).getLevelBlock().
					                       getPortal(j).linksTo(nodeLayers.peek().
					                       get(i).getLevelBlock()))
					                       &&
					                       (nodeLayers.peek().get(i).getLevelBlock().
					                       getPortal(j).canUse() || ignoreClosedDoors) &&(
					                       !excludedRooms.contains(nodeLayers.peek().get(i).getLevelBlock().
					                    		   				   getPortal(j).linksTo(nodeLayers.peek().
					    					                       get(i).getLevelBlock())))){
						
						// if this room is the target room then clear the top layer so it only contains this room
						if(nodeLayers.peek().get(i).getLevelBlock().
			               getPortal(j).linksTo(nodeLayers.peek().
			               get(i).getLevelBlock()).equals(targetRoom)){
							
							nextLayer.clear();
							
							// create a new node with this room, the node that created it and the portal that links the two
							nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
										                     getPortal(j).linksTo(nodeLayers.peek().
										                     get(i).getLevelBlock()),
										                     
										                     nodeLayers.peek().get(i),
										                     
										                     nodeLayers.peek().get(i).getLevelBlock().
										                     getPortal(j)));
							
							nodeLayers.add(nextLayer);
							
							return;
						}
						
						// create a new node with this room, the node that created it and the portal that links the two
						nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
									                     getPortal(j).linksTo(nodeLayers.peek().
									                     get(i).getLevelBlock()),
									                     
									                     nodeLayers.peek().get(i),
									                     
									                     nodeLayers.peek().get(i).getLevelBlock().
									                     getPortal(j)));
						
					}
				}
			}
			nodeLayers.add(nextLayer);
		}
		
		throw new PathNotFoundException(targetRoom);
	}


	/**
	 * Gets the complexity of path.
	 *
	 * @param startBlock the start block
	 * @param targetRoom the target room
	 * @param excludedPortal the excluded portal
	 * @return the complexity of path
	 */
	public static int getComplexityOfPath(LevelBlock startBlock, LevelBlock targetRoom, Portal excludedPortal){
		
		Stack<ArrayList<PathfindingNode>> nodeLayers = new Stack<ArrayList<PathfindingNode>>();
		
		ArrayList<PathfindingNode> nextLayer;
		
		// create the first layer to hold the starting room
		nextLayer = new ArrayList<PathfindingNode>(1);
		
		// create a vast network of nodes to all rooms until the final one is reached
		// the lowest level of the network contains the room started at
		// the highest level contains the final room
		// intermediate levels contain all rooms along the way, even ones not useful to the path
		return createPathNodesForComplexity(startBlock,nextLayer,nodeLayers,targetRoom, excludedPortal);
	}
	
	/**
	 * Creates the path nodes for complexity.
	 *
	 * @param startBlock the start block
	 * @param nextLayer the next layer
	 * @param nodeLayers the node layers
	 * @param targetRoom the target room
	 * @param excludedPortal the excluded portal
	 * @return the int
	 */
	private static int createPathNodesForComplexity(LevelBlock startBlock,
											 	    ArrayList<PathfindingNode> nextLayer, 
											 	    Stack<ArrayList<PathfindingNode>> nodeLayers, 
											        LevelBlock targetRoom, 
												    Portal excludedPortal){

		nextLayer.add(new PathfindingNode(startBlock, null, null));
		nodeLayers.add(nextLayer);
		
		// 100 is an arbitrary amount
		// if the path is not found in this many loops throw an exception
		for(int p = 0; p < MAX_ITERATIONS; p++){
		
		nextLayer = new ArrayList<PathfindingNode>(8);
		
			// for every node on the top layer
			for(int i = 0; i < nodeLayers.peek().size(); i++){
				// for every portal in the room that the node represents
					for(int j = 0; j < nodeLayers.peek().get(i).getLevelBlock().getPortalCount(); j++){
						// create a new node for every connecting room so long as it doesn't already exist
						if(nodeLayers.peek().get(i).getLevelBlock().
			                getPortal(j).canUse()
			                &&
			                nodeLayers.peek().get(i).getLevelBlock().
			                getPortal(j)
			                != excludedPortal &&
			                !roomLayersContains(nodeLayers, nextLayer,
								                nodeLayers.peek().get(i).getLevelBlock().
								                getPortal(j).linksTo(nodeLayers.peek().
								                get(i).getLevelBlock()))){
						
							// if this room is the target room then clear the top layer so it only contains this room
							if(nodeLayers.peek().get(i).getLevelBlock().
								getPortal(j).linksTo(nodeLayers.peek().
								get(i).getLevelBlock()) 
								== targetRoom){
								
								nextLayer.clear();
								
								// create a new node with this room, the node that created it and the portal that links the two
								nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
											                     getPortal(j).linksTo(nodeLayers.peek().
											                     get(i).getLevelBlock()),
											                     
											                     nodeLayers.peek().get(i),
											                     
											                     nodeLayers.peek().get(i).getLevelBlock().
											                     getPortal(j)));
								
								nodeLayers.add(nextLayer);
								
								// break out of loop
								return calculateLayerContentSize(nodeLayers);
							}
						
						// create a new node with this room, the node that created it and the portal that links the two
						nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
									                     getPortal(j).linksTo(nodeLayers.peek().
									                     get(i).getLevelBlock()),
									                     
									                     nodeLayers.peek().get(i),
									                     
									                     nodeLayers.peek().get(i).getLevelBlock().
									                     getPortal(j)));
						
						}
					}
				}
				nodeLayers.add(nextLayer);
			}
			
		// we aren't using this to build a path so the exception can be missed
		return calculateLayerContentSize(nodeLayers);
	}
	
	/**
	 * Creates the path nodes.
	 *
	 * @param startBlock the start block
	 * @param nextLayer the next layer
	 * @param nodeLayers the node layers
	 * @param targetRoom the target room
	 * @param excludedPortal the excluded portal
	 * @param ignoreClosedDoors the ignore closed doors
	 * @throws PathNotFoundException the path not found exception
	 */
	private static void createPathNodes(LevelBlock startBlock,
									    ArrayList<PathfindingNode> nextLayer, 
									    Stack<ArrayList<PathfindingNode>> nodeLayers, 
									    LevelBlock targetRoom,
									    Portal excludedPortal,
									    boolean ignoreClosedDoors) throws PathNotFoundException{
		
		nextLayer.add(new PathfindingNode(startBlock, null, null));
		nodeLayers.add(nextLayer);
		
		// 100 is an arbitrary amount
		// if the path is not found in this many loops throw an exception
		for(int p = 0; p < MAX_ITERATIONS; p++){
			
			nextLayer = new ArrayList<PathfindingNode>(8);
			
			// for every node on the top layer
			for(int i = 0; i < nodeLayers.peek().size(); i++){
				// for every portal in the room that the node represents
				for(int j = 0; j < nodeLayers.peek().get(i).getLevelBlock().getPortalCount(); j++){
					
					// create a new node for every connecting room so long as it doesn't already exist
					if(!roomLayersContains(nodeLayers, nextLayer,
					                       nodeLayers.peek().get(i).getLevelBlock().
					                       getPortal(j).linksTo(nodeLayers.peek().
					                       get(i).getLevelBlock()))
					                       
					                       &&
					                       
					                       (nodeLayers.peek().get(i).getLevelBlock().
					                       getPortal(j).canUse() || ignoreClosedDoors) 
					                       
					                       &&
					                       
					                       nodeLayers.peek().get(i).getLevelBlock().
					                       getPortal(j) != excludedPortal){
						
						// if this room is the target room then clear the top layer so it only contains this room
						if(nodeLayers.peek().get(i).getLevelBlock().
			               getPortal(j).linksTo(nodeLayers.peek().
			               get(i).getLevelBlock()) 
						   == targetRoom){
							
							nextLayer.clear();
							
							// create a new node with this room, the node that created it and the portal that links the two
							nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
										                     getPortal(j).linksTo(nodeLayers.peek().
										                     get(i).getLevelBlock()),
										                     
										                     nodeLayers.peek().get(i),
										                     
										                     nodeLayers.peek().get(i).getLevelBlock().
										                     getPortal(j)));
							
							nodeLayers.add(nextLayer);
							
							return;
						}
						
						// create a new node with this room, the node that created it and the portal that links the two
						nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
									                     getPortal(j).linksTo(nodeLayers.peek().
									                     get(i).getLevelBlock()),
									                     
									                     nodeLayers.peek().get(i),
									                     
									                     nodeLayers.peek().get(i).getLevelBlock().
									                     getPortal(j)));
						
					}
				}
			}
			nodeLayers.add(nextLayer);
		}
		
		throw new PathNotFoundException(targetRoom);
	}
	
	/**
	 * Creates the path nodes.
	 *
	 * @param startBlock the start block
	 * @param nextLayer the next layer
	 * @param nodeLayers the node layers
	 * @param targetRoom the target room
	 * @param ignoreClosedDoors the ignore closed doors
	 * @throws PathNotFoundException the path not found exception
	 */
	private static void createPathNodes(LevelBlock startBlock,
									    ArrayList<PathfindingNode> nextLayer, 
									    Stack<ArrayList<PathfindingNode>> nodeLayers, 
									    LevelBlock targetRoom,
									    boolean ignoreClosedDoors) throws PathNotFoundException{
	
		nextLayer.add(new PathfindingNode(startBlock, null, null));
		nodeLayers.add(nextLayer);
		
		// 100 is an arbitrary amount
		// if the path is not found in this many loops throw an exception
		for(int p = 0; p < 100; p++){
		
		nextLayer = new ArrayList<PathfindingNode>(8);
		
		// for every node on the top layer
		for(int i = 0; i < nodeLayers.peek().size(); i++){
		// for every portal in the room that the node represents
		for(int j = 0; j < nodeLayers.peek().get(i).getLevelBlock().getPortalCount(); j++){
		// create a new node for every connecting room so long as it doesn't already exist
		if(!roomLayersContains(nodeLayers, nextLayer,
				                nodeLayers.peek().get(i).getLevelBlock().
				                getPortal(j).linksTo(nodeLayers.peek().
				                get(i).getLevelBlock()))
				                &&
				                (nodeLayers.peek().get(i).getLevelBlock().
				                getPortal(j).canUse() || ignoreClosedDoors)){
		
		// if this room is the target room then clear the top layer so it only contains this room
		if(nodeLayers.peek().get(i).getLevelBlock().
		getPortal(j).linksTo(nodeLayers.peek().
		get(i).getLevelBlock()) 
		== targetRoom){
			
			nextLayer.clear();
			
			// create a new node with this room, the node that created it and the portal that links the two
			nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
						                     getPortal(j).linksTo(nodeLayers.peek().
						                     get(i).getLevelBlock()),
						                     
						                     nodeLayers.peek().get(i),
						                     
						                     nodeLayers.peek().get(i).getLevelBlock().
						                     getPortal(j)));
			
			nodeLayers.add(nextLayer);
			
			return;
		}
		
		// create a new node with this room, the node that created it and the portal that links the two
		nextLayer.add(new PathfindingNode(nodeLayers.peek().get(i).getLevelBlock().
					                     getPortal(j).linksTo(nodeLayers.peek().
					                     get(i).getLevelBlock()),
					                     
					                     nodeLayers.peek().get(i),
					                     
					                     nodeLayers.peek().get(i).getLevelBlock().
					                     getPortal(j)));
		
		}
		}
		}
		nodeLayers.add(nextLayer);
	}
	
	throw new PathNotFoundException(targetRoom);
	}
		
	/**
	 * Room layers contains.
	 *
	 * @param array the array
	 * @param currentLayer the current layer
	 * @param item the item
	 * @return true, if successful
	 */
	private static boolean roomLayersContains(Stack<ArrayList<PathfindingNode>> array, ArrayList<PathfindingNode> currentLayer, LevelBlock item){
		
		for(int i = 0; i < currentLayer.size(); i++){
			if(currentLayer.get(i).getLevelBlock().equals(item)){
				return true;
			}
		}
		
		for(int i = 0; i < array.size(); i++){
			for(int j = 0; j < array.get(i).size(); j++){
				if(array.get(i).get(j).getLevelBlock().equals(item)){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Calculate layer content size.
	 *
	 * @param array the array
	 * @return the int
	 */
	private static int calculateLayerContentSize(Stack<ArrayList<PathfindingNode>> array){
		int count = 0;
		for(int i = 0; i < array.size(); i++){
			for(int j = 0; j < array.get(i).size(); j++){
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * Can create path.
	 *
	 * @param startBlock the start block
	 * @param targetRoom the target room
	 * @param excludedPortal the excluded portal
	 * @return true, if successful
	 */
	public static boolean canCreatePath(LevelBlock startBlock, LevelBlock targetRoom, Portal excludedPortal){
		try{
			createPathway(null,null,startBlock,targetRoom,excludedPortal,false);
			return true;
		}
		catch(PathNotFoundException pnfe){
			return false;
		}
	}
	
	/**
	 * Optimal portals for path.
	 *
	 * @param startLocation the start location
	 * @param targetLocation the target location
	 * @param endBlock the end block
	 * @param nonOptimalPath the non optimal path
	 * @param ignoreBlockedDoors the ignore blocked doors
	 * @return the array list
	 */
	private static ArrayList<Portal> optimalPortalsForPath(double[] startLocation, double[] targetLocation, LevelBlock endBlock, ArrayList<Portal> nonOptimalPath, boolean ignoreBlockedDoors) {

		ArrayList<Portal> optimalPath = new ArrayList<Portal>(nonOptimalPath.size());
		
		double shortestDistance = 0;
		
		LevelBlock currentBlock = endBlock;
		
		double[] previousLocation = startLocation.clone();
		
		Portal closestPortal = null;
		
		for(int j = 0; j < currentBlock.getPortalCount(); j++){
			
			if(currentBlock.getPortal(j).connectsTo(nonOptimalPath.get(0).linksTo(currentBlock)) && 
					
			  (currentBlock.getPortal(j).canUse() || ignoreBlockedDoors) &&
			  
			  (closestPortal == null || Maths.getDistance(targetLocation, currentBlock.getPortal(j).getLocation()) < shortestDistance)){
				
				shortestDistance = Maths.getDistance(targetLocation, currentBlock.getPortal(j).getLocation());
				closestPortal = currentBlock.getPortal(j);
				
			}
			
		}
		
		if(closestPortal == null){
			return nonOptimalPath;
		}
		
		optimalPath.add(closestPortal);
		previousLocation = closestPortal.getLocation().clone();
		currentBlock = closestPortal.linksTo(currentBlock);
		
		
		for(int i = 1; i < nonOptimalPath.size(); i++){
			
			closestPortal = null;
			
			for(int j = 0; j < currentBlock.getPortalCount(); j++){
				
				if(currentBlock.getPortal(j).connectsTo(nonOptimalPath.get(i).linksTo(currentBlock)) &&
					
				  (currentBlock.getPortal(j).canUse() || ignoreBlockedDoors) &&
				  
				  (closestPortal == null || Maths.getDistance(previousLocation, currentBlock.getPortal(j).getLocation()) < shortestDistance)){
					
					shortestDistance = Maths.getDistance(previousLocation, currentBlock.getPortal(j).getLocation());
					closestPortal = currentBlock.getPortal(j);
				}
				
			}
			
			if(closestPortal == null){
				return nonOptimalPath;
			}
			
			optimalPath.add(closestPortal);
			previousLocation = closestPortal.getLocation().clone();
			currentBlock = closestPortal.linksTo(currentBlock);
		}
		
		return optimalPath;
	}
	
	/**
	 * The Class PathfindingNode.
	 */
	private static class PathfindingNode {
		
		/**
		 * The represented block.
		 */
		private LevelBlock representedBlock;
		
		/**
		 * The portal back.
		 */
		private Portal portalBack;
		
		/**
		 * The previous block.
		 */
		private PathfindingNode previousBlock;
		
		/**
		 * Instantiates a new pathfinding node.
		 *
		 * @param representedBlock the represented block
		 * @param previousBlock the previous block
		 * @param portalBack the portal back
		 */
		public PathfindingNode(LevelBlock representedBlock, PathfindingNode previousBlock, Portal portalBack){
			this.representedBlock = representedBlock;
			this.previousBlock = previousBlock;
			this.portalBack = portalBack;
		}
		
		/**
		 * Gets the level block.
		 *
		 * @return the level block
		 */
		public LevelBlock getLevelBlock(){
			return this.representedBlock;
		}
		
		/**
		 * Gets the previous block.
		 *
		 * @return the previous block
		 */
		public PathfindingNode getPreviousBlock(){
			return this.previousBlock;
		}
		
		/**
		 * Gets the portal back.
		 *
		 * @return the portal back
		 */
		public Portal getPortalBack(){
			return this.portalBack;
		}
		
	}
	
	/**
	 * Find intra path.
	 *
	 * @param mover the mover
	 * @param moveLocation the move location
	 * @return the array list
	 * @throws PathNotFoundException the path not found exception
	 */
	public static ArrayList<double[]> findIntraPath(Ai mover, double[] moveLocation) throws PathNotFoundException{
		return findIntraPath(mover, moveLocation, 15);
	}
	 
	/**
	 * Find intra path.
	 *
	 * @param mover the mover
	 * @param moveLocation the move location
	 * @param radius the radius
	 * @return the array list
	 * @throws PathNotFoundException the path not found exception
	 */
	public static ArrayList<double[]> findIntraPath(Ai mover, double[] moveLocation, int radius) throws PathNotFoundException{
		Polygon room = mover.getLevelBlock().getHitBox();
		
		ArrayList<double[]> points;
		
		// Trivial, the point is in direct los, can move straight for it
		if(isInSight(mover.getLocation()[0], mover.getLocation()[1], moveLocation[0], moveLocation[1], room)){
			points = new ArrayList<double[]>(1);
			points.add(moveLocation);
			return points;
		}
		
		int closestPointIndex = findClosestPoint(moveLocation, room);
		
		// work backwards and forwards and try to find shortest path through the points
		ArrayList<double[]> path1Points = computeRoughPoints(closestPointIndex, 1, mover.getLocation(), room, radius);
		ArrayList<double[]> path2Points = computeRoughPoints(closestPointIndex, -1, mover.getLocation(), room, radius);
		
		// the final double[] in the arraylist of pathPoints contains the distance for the route, pick the shortest one
		if(path1Points.get(path1Points.size() - 1)[0] < path2Points.get(path2Points.size() - 1)[0]){
			points = trimPathway(path1Points, mover.getLocation());
		}
		else{
			points = trimPathway(path2Points, mover.getLocation());
		}
		
		return points;
	}
	
	/**
	 * Trim pathway.
	 *
	 * @param pathPoints the path points
	 * @param room the room
	 * @param moverLocation the mover location
	 * @param moveLocation the move location
	 * @return the array list
	 */
	private static ArrayList<double[]> trimPathway(ArrayList<double[]> pathPoints, double[] moveLocation) {
		
		// the optimal path *
		ArrayList<double[]> optPathPoints = new ArrayList<double[]>(pathPoints.size());
		
		// catch for where the mover is already at the location it is told to move to
		if(pathPoints.size() == 2 && pathPoints.get(pathPoints.size() - 1)[0] == 0){
			optPathPoints.add(moveLocation);
			return optPathPoints;
		}
		
		// remove the last point which contains a fake point with the total distance of the route
		pathPoints.remove(pathPoints.get(pathPoints.size() - 1));
		
		return pathPoints;
	}

	/**
	 * Computes the rough points.
	 *
	 * @param startIndex the start index
	 * @param modifier the modifier
	 * @param moverLocation the mover location
	 * @param room the room
	 * @param radius the radius
	 * @return the array list
	 */
	private static ArrayList<double[]> computeRoughPoints(int startIndex, int modifier, double[] moverLocation, Polygon room, int radius) {
		
		ArrayList<double[]> points = new ArrayList<double[]>(4);
		
		double[] point = new double[2];
		
		int currentIndex = startIndex;
		
		// add first point
		point = slightlyCentalVertex(room, currentIndex);
		points.add(point);
		
		while(!isInSight(moverLocation[0], moverLocation[1], point[0], point[1], room, radius)){
			
			if(currentIndex + modifier > 0 && currentIndex + modifier < room.npoints){
				point = slightlyCentalVertex(room, currentIndex + modifier);
				
				currentIndex += modifier;
			}
			else if(currentIndex + modifier <= 0){
				point = slightlyCentalVertex(room, room.npoints - 1);
				
				currentIndex = room.npoints - 1;
			}
			else{
				point = slightlyCentalVertex(room, 0);
				currentIndex = 0;
			}
			
			points.add(point);
			
			if(points.size() > room.npoints){
			//	System.out.println("no point in room can see location");
				break;
			}
		}
		
		double sumDistance = 0;
		
		for(int i = 1; i < points.size(); i++){
			sumDistance += Maths.getDistance(points.get(i), points.get(i - 1));
		}
		
		sumDistance += Maths.getDistance(points.get(points.size() - 1), moverLocation);
		
		double[] fakeLocation = {sumDistance, 0};
		points.add(fakeLocation);
		
		return points;
		
	}
	
	/**
	 * Slightly cental vertex.
	 *
	 * @param room the room
	 * @param index the index
	 * @return the double[]
	 */
	private static double[] slightlyCentalVertex(Polygon room, int index){
		double[] newVertex = {room.xpoints[index],room.ypoints[index]};
		/*
		double angle = Maths.getRads(newVertex[0], newVertex[1], room.getBounds2D().getCenterX(), room.getBounds2D().getCenterY());
		
		newVertex[0] += Math.cos(angle) * 1;
		newVertex[1] += Math.sin(angle) * 1;
		*/
		return newVertex;
	}

	/**
	 * Find closest point.
	 *
	 * @param moveLocation the move location
	 * @param room the room
	 * @return the int
	 */
	private static int findClosestPoint(double[] moveLocation, Polygon room) {
		
		double distance = 0;
		int index = 0;
		
		for(int i = 0; i < room.npoints; i++){
			if(i == 0 || Maths.getDistance(moveLocation[0], moveLocation[1], room.xpoints[i], room.ypoints[i]) < distance){
				distance = Maths.getDistance(moveLocation[0], moveLocation[1], room.xpoints[i], room.ypoints[i]);
				index = i;
			}
		}
		
		return index;
	}
	
	/**
	 * Checks if is in sight.
	 *
	 * @param x the x
	 * @param y the y
	 * @param x1 the x1
	 * @param y1 the y1
	 * @param room the room
	 * @return true, if is in sight
	 */
	public static boolean isInSight(double x, double y, double x1, double y1, Polygon room){
		
		double vector[] = {Math.cos(Maths.getRads(x, y, x1, y1)) * 14,
						   Math.sin(Maths.getRads(x, y, x1, y1)) * 14};
		
		while(Maths.getDistance(x,y,x1,y1) > 15){
			x += vector[0];
			y += vector[1];
			
			if(!room.contains(x,y)){
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Checks if is in sight.
	 *
	 * @param x the x
	 * @param y the y
	 * @param x1 the x1
	 * @param y1 the y1
	 * @param room the room
	 * @param radiusOfSight the radius of sight
	 * @return true, if is in sight
	 */
	public static boolean isInSight(double x, double y, double x1, double y1, Polygon room, int radiusOfSight){
		
		double vector[] = {Math.cos(Maths.getRads(x, y, x1, y1)) * 1,
						   Math.sin(Maths.getRads(x, y, x1, y1)) * 1};
		
		while(Maths.getDistance(x,y,x1,y1) > radiusOfSight){
			x += vector[0];
			y += vector[1];
			
			if(!room.contains(x,y)){
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Checks if is in firing sight.
	 *
	 * @param x the x
	 * @param y the y
	 * @param x1 the x1
	 * @param y1 the y1
	 * @param room the room
	 * @return true, if is in firing sight
	 */
	public static boolean isInFiringSight(double x, double y, double x1, double y1, LevelBlock room){
		
		double[] startLoc = {x,y};
		
		double vector[] = {Math.cos(Maths.getRads(x, y, x1, y1)),
						   Math.sin(Maths.getRads(x, y, x1, y1))};
		
		while(Maths.getDistance(x,y,x1,y1) > 15){
			x += vector[0];
			y += vector[1];
			
			Polygon coverAtPoint = room.getCoverObject(x,y);
			Polygon coverStart = room.getCoverObject(x1,y1);
			Polygon coverEnd = room.getCoverObject(startLoc[0],startLoc[1]);
			
			if(!room.getHitBox().contains(x,y) || (coverAtPoint != null && coverAtPoint != coverEnd && room.getCoverObject(x,y) != coverStart) ){
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Checks if is vertex sight.
	 *
	 * @param x the x
	 * @param y the y
	 * @param x1 the x1
	 * @param y1 the y1
	 * @param room the room
	 * @return true, if is vertex sight
	 */
	public static boolean isVertexSight(double x, double y, double x1, double y1, LevelBlock room) {
		
		double[] startLoc = {x,y};
		
		double vector[] = {Math.cos(Maths.getRads(x, y, x1, y1)),
						   Math.sin(Maths.getRads(x, y, x1, y1))};
		
		while(Maths.getDistance(x,y,x1,y1) > 15){
			x += vector[0];
			y += vector[1];
			
			
			if(!room.getHitBox().contains(x,y) || room.getCoverObject(x,y) != room.getCoverObject(startLoc[0],startLoc[1])){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isVertexSight(ArrayList<Polygon> cover, double x, double y, double x1, double y1, LevelBlock room) {
		
		double[] startLoc = {x,y};
		
		double vector[] = {Math.cos(Maths.getRads(x, y, x1, y1)),
						   Math.sin(Maths.getRads(x, y, x1, y1))};
		
		while(Maths.getDistance(x,y,x1,y1) > 15){
			x += vector[0];
			y += vector[1];
			
			
			if(!room.getHitBox().contains(x,y) || (room.getCoverObject(x,y) != room.getCoverObject(startLoc[0],startLoc[1]) && cover.contains(room.getCoverObject(x,y)))){
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Gets the last point.
	 *
	 * @param startLocation the is
	 * @param rads the rads
	 * @param room the room
	 * @param space the space
	 * @return the last point
	 */
	public static int[] getLastPoint(int[] startLocation, double rads, LevelBlock room, int space) {
		double x,y;
		
		x = startLocation[0];
		y = startLocation[1];
		
		double vector[] = {Math.cos(rads) * space,
						   Math.sin(rads) * space};
		
		while(true){
			x += vector[0];
			y += vector[1];
			
			if(!room.getHitBox().contains(x,y) || room.getCoverObject(x,y) != null){
				return new int[]{(int)(x - vector[0]),(int)(y - vector[1])};
			}
		}
	}
	
	public static int[] getLastPointInCover(int[] startLocation, double rads, LevelBlock room, int space) {
		double x,y;
		
		x = startLocation[0];
		y = startLocation[1];
		
		double vector[] = {Math.cos(rads) * space,
						   Math.sin(rads) * space};
		
		while(true){
			x += vector[0];
			y += vector[1];
			
			if(!room.getHitBox().contains(x,y) || (room.getCoverObject(x,y) != null && room.getCoverObject(x,y) != room.getCoverObject(startLocation[0], startLocation[1])))
				return new int[]{(int)(x - vector[0]),(int)(y - vector[1])};
		}
	}
	
	
	public static int[] getLastPoint(Polygon ignoreCoverObject, int[] is, double rads, LevelBlock room, int space) {
		double x,y;
		
		x = is[0];
		y = is[1];
		
		double vector[] = {Math.cos(rads) * space,
						   Math.sin(rads) * space};
		
		while(true){
			x += vector[0];
			y += vector[1];
			
			if(!room.getHitBox().contains(x,y) || (room.getCoverObject(x,y) != null && room.getCoverObject(x,y) != ignoreCoverObject)){
				return new int[]{(int)(x - vector[0]),(int)(y - vector[1])};
			}
		}
	}

	/**
	 * Gets the last point.
	 *
	 * @param is the is
	 * @param rads the rads
	 * @param room the room
	 * @return the last point
	 */
	public static int[] getLastPoint(int[] is, double rads, LevelBlock room) {
		double x,y;
		
		x = is[0];
		y = is[1];
		
		double vector[] = {Math.cos(rads),
						   Math.sin(rads)};
		
		while(true){
			x += vector[0];
			y += vector[1];
			
			if(!room.getHitBox().contains(x,y) || room.getCoverObject(x,y) != null){
				return new int[]{(int)(x - vector[0]),(int)(y - vector[1])};
			}
		}
	}
}
