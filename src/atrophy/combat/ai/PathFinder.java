package atrophy.combat.ai;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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

	public static int[][] findTexturePath(LevelBlock levelBlock, int textureSize) {

		// 1 - Not a complete block / Is a clipped block
		// 2 - Complete block
		// 3 - Door block
		// 4 - PathBlock
		int[][] texturePath = new int[1 + (int) Math.ceil(levelBlock
				.getHitBox().getBounds2D().getWidth()
				/ textureSize)][1 + (int) Math.ceil(levelBlock.getHitBox()
				.getBounds2D().getHeight()
				/ textureSize)];

		double startX, startY;

		Polygon roomPoly = levelBlock.getHitBox();

		startX = roomPoly.getBounds2D().getMinX();
		startY = roomPoly.getBounds2D().getMinY();

		Set<Portal> doorsWithLocations = new HashSet<>();
		Set<int[]> doorLocations = new HashSet<>();
		Set<int[]> possiblePathLocations = new HashSet<>();
		Set<int[]> pathLocations = new HashSet<>();
		Set<int[]> connectedDoors = new HashSet<>();

		for (int i = 0; i < texturePath.length; i++) {
			for (int j = 0; j < texturePath[i].length; j++) {
				// Check that all corners are in the block to make it a possible
				// path block

				if (roomPoly.contains(startX + i * textureSize + 1, startY + j
						* textureSize + 1)
						&& roomPoly.contains(
								startX + (i + 1) * textureSize - 1, startY + j
										* textureSize + 1)
						&& roomPoly.contains(startX + i * textureSize + 1,
								startY + (j + 1) * textureSize - 1)
						&& roomPoly.contains(
								startX + (i + 1) * textureSize - 1, startY
										+ (j + 1) * textureSize - 1)) {
					texturePath[i][j] = 2;

					possiblePathLocations.add(new int[] { i, j });

					// Check if portal lies in texturePath
					for (Portal portal : levelBlock.getPortals()) {
						double[] portLoc = (portal.getLocation(levelBlock));

						if (!doorsWithLocations.contains(portal) &&
								startX + i * textureSize <= portLoc[0]
								&& startX + (i + 1) * textureSize >= portLoc[0]
								&& startY + j * textureSize <= portLoc[1]
								&& startY + (j + 1) * textureSize >= portLoc[1]) {
							texturePath[i][j] = 3;

							doorLocations.add(new int[] { i, j });
							doorsWithLocations.add(portal);
							break;
						}
					}
				} else {
					texturePath[i][j] = 1;
				}
			}
		}

		Comparator<PathingBlock> fComparator = new Comparator<PathingBlock>() {

			@Override
			public int compare(PathingBlock o1, PathingBlock o2) {
				if (o1.f > o2.f)
					return 1;
				else if (o1.f < o2.f)
					return -1;
				return 0;
			}

		};
		
		// For each door try to connect to another door
		Iterator<int[]> iterator = doorLocations.iterator();

		if(doorLocations.size() > 1)
			while (iterator.hasNext()) {
				int[] doorLoc = (int[]) iterator.next();
	
				// A* until a door is reached or ran out of blocks
				Set<PathingBlock> closedSet = new HashSet<>();
				Set<PathingBlock> openSet = new HashSet<>();
				PriorityQueue<PathingBlock> fQueue = new PriorityQueue<PathingBlock>(20, fComparator);
	
				// Init with door location
				PathingBlock startingPathBlock = new PathingBlock(doorLoc);
				openSet.add(startingPathBlock);
				fQueue.add(startingPathBlock);
	
				Map<PathingBlock, PathingBlock> cameFrom = new HashMap<>();
	
				while (!openSet.isEmpty()) {
	
					PathingBlock current = fQueue.poll();
	
					// Check for contact with door
					for(int[] loc: doorLocations) {
						if(isArrayEqual(loc, current.loc) && !isArrayEqual(loc, doorLoc)) {
							createTexturePath(cameFrom, current, doorLoc, pathLocations);
							connectedDoors.add(doorLoc);
							break;
						}
					}
					
					// Check for contact with a path
					for(int[] loc: pathLocations) {
						if(isArrayEqual(loc, current.loc)) {
							createTexturePath(cameFrom, current, doorLoc, pathLocations);
							connectedDoors.add(doorLoc);
							break;
						}
					}
	
					openSet.remove(current);
					closedSet.add(current);
	
					int newG;
					
					// Check neighbours
					List<int[]> neightbours = new ArrayList<>();
					
					neightbours.add(new int[]{current.loc[0] - 1, current.loc[1]});
					neightbours.add(new int[]{current.loc[0], current.loc[1] - 1});
					neightbours.add(new int[]{current.loc[0] + 1, current.loc[1]});
					neightbours.add(new int[]{current.loc[0], current.loc[1] + 1});
					
			NLOOP:for (int[] neighbour : neightbours) {
						
						// Check if location is outside polygon
						boolean allowed = false;
						
						for(int[] possLoc: possiblePathLocations) {
							if(neighbour[0] == possLoc[0] && neighbour[1] == possLoc[1]) {
								allowed = true;
								break;
							}
						}
						
						if(!allowed)
							continue;
				
						for(PathingBlock block: closedSet) {
							if(block.locEquals(neighbour))
								continue NLOOP;
						}
	
						newG = current.g + 1;
	
						boolean openSetContains = false;
						PathingBlock definedBlock = null;
						
						for(PathingBlock pBlock: openSet) {
							if(pBlock.locEquals(neighbour)) {
								openSetContains = true;
								definedBlock = pBlock;
								break;
							}
						}
						
						if (!openSetContains || newG < definedBlock.g) {
							PathingBlock pathingBlock = new PathingBlock(neighbour);
							cameFrom.put(pathingBlock, current);
							pathingBlock.g = newG;
							pathingBlock.h = 0;
							pathingBlock.calcF();
	
							openSet.add(pathingBlock);
							fQueue.add(pathingBlock);
						}
					}
				}
	
			}
		
		for(int[] pathLoc: pathLocations) {
			texturePath[pathLoc[0]][pathLoc[1]] = 4;
		}

		return texturePath;

	}

	private static void createTexturePath(Map<PathingBlock, PathingBlock> cameFrom, PathingBlock last, int[] startLocation, Set<int[]> pathLocations) {
		
		// Don't include portal location
		PathingBlock current = cameFrom.get(last);

		while (current != null && !current.locEquals(startLocation)) {
			pathLocations.add(current.loc);
			current = cameFrom.get(current);
		}

	}

	protected static class PathingBlock {
		public int[] loc;
		public int f, g, h;

		public PathingBlock(int[] loc) {
			this.loc = loc;
		}

		public boolean locEquals(int[] neighbour) {
			return this.loc[0] == neighbour[0] && this.loc[1] == neighbour[1];
		}

		public void calcF() {
			f = g + h;
		}
	}
	
	private static boolean isArrayEqual(int[] arr1, int[] arr2) {
		return arr1[0] == arr2[0] && arr1[1] == arr2[1];
	}

	public static ArrayList<Portal> findAStarPath(double[] startLocation,
			double[] targetLocation, LevelBlock startBlock,
			LevelBlock targetRoom, Portal excludedPortal,
			boolean ignoreClosedDoors) throws PathNotFoundException {

		PathingPortalSet closedSet = new PathingPortalSet();
		PathingPortalSet openSet = new PathingPortalSet();

		Comparator<PathingPortal> fComparator = new Comparator<PathingPortal>() {

			@Override
			public int compare(PathingPortal o1, PathingPortal o2) {
				if (o1.f > o2.f)
					return 1;
				else if (o1.f < o2.f)
					return -1;
				return 0;
			}

		};
		PriorityQueue<PathingPortal> fQueue = new PriorityQueue<PathingPortal>(
				20, fComparator);

		// Populate with portals in this room
		for (Portal portal : startBlock.getPortals()) {
			if (portal == excludedPortal
					|| (!ignoreClosedDoors && !portal.canUse()))
				continue;

			PathingPortal pathingPortal = new PathingPortal(portal);
			pathingPortal.h = Maths.getDistance(portal.getLocation(),
					targetLocation);
			pathingPortal.g = Maths.getDistance(startLocation,
					portal.getLocation());
			pathingPortal.calcF();
			openSet.add(pathingPortal);
			fQueue.add(pathingPortal);
		}

		Map<PathingPortal, PathingPortal> cameFrom = new HashMap<>();

		while (!openSet.isEmpty()) {

			PathingPortal current = fQueue.poll();

			if (current.linksTo(targetRoom))
				return createPortalPath(cameFrom, current, startBlock);

			openSet.remove(current);
			closedSet.add(current);

			double newG;

			// Just loop through all portals on both sides of portal
			for (Portal neighbour : current.getAllNeighbours()) {
				if (excludedPortal == neighbour
						|| closedSet.contains(neighbour)
						|| (!ignoreClosedDoors && !neighbour.canUse()))
					continue;

				newG = current.g
						+ Maths.getDistance(neighbour.getLocation(),
								current.portal.getLocation());

				if (!openSet.contains(neighbour)) {
					PathingPortal pathPortal = new PathingPortal(neighbour);
					cameFrom.put(pathPortal, current);
					pathPortal.g = newG;
					pathPortal.h = Maths.getDistance(
							pathPortal.portal.getLocation(), targetLocation);
					pathPortal.calcF();

					openSet.add(pathPortal);
					fQueue.add(pathPortal);
				} else if (newG < openSet.get(neighbour).g) {
					PathingPortal pathPortal = openSet.get(neighbour);
					cameFrom.put(pathPortal, current);
					pathPortal.g = newG;
					pathPortal.h = Maths.getDistance(
							pathPortal.portal.getLocation(), targetLocation);
					pathPortal.calcF();

					openSet.add(pathPortal);
					fQueue.add(pathPortal);
				}
			}
		}

		throw new PathNotFoundException(startBlock);
	}

	private static ArrayList<Portal> createPortalPath(Map<PathingPortal, PathingPortal> cameFrom, PathingPortal last,LevelBlock startBlock) {

		PathingPortal current = last;

		ArrayList<Portal> path = new ArrayList<>();

		while (!current.portal.connectsTo(startBlock)) {
			path.add(current.portal);
			current = cameFrom.get(current);
		}

		path.add(current.portal);

		return path;
	}

	public static ArrayList<Portal> createPathway(double[] startLocation,
			double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom)
			throws PathNotFoundException {
		return findAStarPath(startLocation, endLocation, startBlock,
				targetRoom, null, true);
	}

	public static ArrayList<Portal> createPathway(double[] startLocation,
			double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom,
			Portal excludedPortal) throws PathNotFoundException {
		return findAStarPath(startLocation, endLocation, startBlock,
				targetRoom, excludedPortal, true);
	}

	public static ArrayList<Portal> createPathway(double[] startLocation,
			double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom,
			Portal excludedPortal, boolean ignoreClosedDoors)
			throws PathNotFoundException {

		// Check for special case where all doors are blocked to the target room
		if (targetRoom == null || !ignoreClosedDoors
				&& isRoomCompletelyBlocked(targetRoom)) {
			throw new PathNotFoundException(targetRoom);
		}

		return findAStarPath(startLocation, endLocation, startBlock,
				targetRoom, excludedPortal, ignoreClosedDoors);
	}

	public static ArrayList<Portal> createPathway(double[] startLocation,
			double[] endLocation, LevelBlock startBlock, LevelBlock targetRoom,
			boolean ignoreClosedDoors) throws PathNotFoundException {
		return findAStarPath(startLocation, endLocation, startBlock,
				targetRoom, null, ignoreClosedDoors);
	}

	private static boolean isRoomCompletelyBlocked(LevelBlock targetRoom) {
		for (int i = 0; i < targetRoom.getPortalCount(); i++) {
			if (targetRoom.getPortal(i).canUse()) {
				return false;
			}
		}
		return true;
	}

	// Intra room pathfinding

	public static ArrayList<double[]> findIntraPath(Ai mover,
			double[] moveLocation, double moveDistance)
			throws PathNotFoundException {
		return findAStarPath(mover, moveLocation, moveDistance);
	}

	public static ArrayList<double[]> findAStarPath(Ai mover, double[] moveLocation, double moveDistance) throws PathNotFoundException {

		LevelBlockGrid navGrid = mover.getLevelBlock().getLevelBlockGrid();

		navGrid.resetPicks();

		Set<GridBlock> closedSet = new HashSet<>();
		Set<GridBlock> openSet = new HashSet<>();

		GridBlock startBlock = navGrid.getNearestGridBlock(mover.getLocation());
		if(startBlock == null) {
			System.err.println("AAGHGSHGSHG  " + mover.getName());
			throw new PathNotFoundException(null);
		}
		openSet.add(startBlock);
		startBlock.g = 0;
		startBlock.h = Maths.getDistance(startBlock.getPathLocation(), moveLocation);
		startBlock.f = startBlock.g + startBlock.h;

		Map<GridBlock, GridBlock> cameFrom = new HashMap<>();

		GridBlock goal = navGrid.getGridBlock(moveLocation);

		while (!openSet.isEmpty()) {

			GridBlock current = lowestF(openSet);

			if (current == goal || (goal == null && Maths.getDistance(current.getPathLocation(), moveLocation) <= moveDistance))
				return createAStarPath(cameFrom, current, startBlock, mover.getLevelBlock().getHitBox());

			openSet.remove(current);
			closedSet.add(current);

			double newG;

			for (GridBlock neighbour : current.neighbours) {
				if (closedSet.contains(neighbour))
					continue;

				if (current.nonDiagNeighbours.contains(neighbour))
					newG = current.g + 10;
				else
					newG = current.g + 15;

				if (!openSet.contains(neighbour) || newG < neighbour.g) {
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

		for (GridBlock block : openSet) {
			if (returnBlock == null || block.f < returnBlock.f)
				returnBlock = block;
		}

		return returnBlock;
	}

	private static ArrayList<double[]> createAStarPath(Map<GridBlock, GridBlock> cameFrom, GridBlock goal, GridBlock start, Polygon room) {

		GridBlock current = goal;

		ArrayList<double[]> path = new ArrayList<>();

		while (current != start) {
			current.picked = true;

			if (path.size() == 0 || !CombatVisualManager.isInSight( path.get(path.size() - 1)[0], path.get(path.size() - 1)[1], current.getPathLocation()[0], current.getPathLocation()[1], room))
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
			if ((obj instanceof PathingPortal && ((PathingPortal) obj).portal == this.portal)
					|| (obj instanceof Portal && obj == this.portal))
				return true;
			return false;
		}

		public boolean linksTo(LevelBlock targetRoom) {
			return this.portal.connectsTo(targetRoom);
		}

		public List<Portal> getAllNeighbours() {
			List<Portal> portals = this.portal.getLinkedBlocks()[0]
					.getPortals();
			List<Portal> portals1 = this.portal.getLinkedBlocks()[1]
					.getPortals();

			List<Portal> combo = new ArrayList<>();

			for (Portal portal : portals) {
				combo.add(portal);
			}
			for (Portal portal : portals1) {
				combo.add(portal);
			}

			return combo;
		}

	}

	private static class PathingPortalSet extends HashSet<PathingPortal> {

		@Override
		public boolean contains(Object o) {
			if (o instanceof Portal || o instanceof PathingPortal) {
				for (PathingPortal pathPortal : this) {
					if (pathPortal.equals(o))
						return true;
				}
			}
			return false;
		}

		public PathingPortal get(Portal portal) {
			for (PathingPortal pathPortal : this) {
				if (pathPortal.equals(portal))
					return pathPortal;
			}
			return null;
		}

	}

}
