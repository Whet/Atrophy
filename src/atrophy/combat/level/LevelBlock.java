/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.level;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.PathNotFoundException;
import atrophy.combat.ai.ThinkingAi.AiNode;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.display.ui.loot.LootContainer;

/**
 * The Class LevelBlock.
 */
public class LevelBlock {
	
	/**
	 * The portals.
	 */
	private List<Portal> portals;
	
	/**
	 * The hitbox.
	 */
	private Polygon hitbox;
	
	/**
	 * The texture polygons.
	 */
	private Stack<Polygon> texturePolygons;
	
	/**
	 * The textures.
	 */
	private Stack<Integer> textures;
	
	/**
	 * The cover polygons.
	 */
	private List<Polygon> coverPolygons;
	
	/**
	 * The stash polygons.
	 */
	private List<Polygon> stashPolygons;
	
	/**
	 * The stashes.
	 */
	private List<Lootable> stashes;
	
	/**
	 * The nodes.
	 */
	private List<AiNode> nodes;
	
	private LevelBlockGrid grid;
	
	/**
	 * The code.
	 */
	private int code;
	
	/**
	 * The texture code.
	 */
	private int textureCode;

	/**
	 * The contains science.
	 */
	private boolean containsScience;

	private MissionManager missionManager;

	private boolean discovered;
	
	/**
	 * Instantiates a new level block.
	 *
	 * @param code the code
	 * @param missionManager 
	 */
	public LevelBlock(int code, MissionManager missionManager){
		
		portals = new ArrayList<Portal>(1);
		
		hitbox = new Polygon();
		
		this.texturePolygons = new Stack<Polygon>();
		this.textures = new Stack<Integer>();
		
		this.coverPolygons = new ArrayList<Polygon>(1);
		this.stashPolygons = new ArrayList<Polygon>(1);
		this.stashes = new ArrayList<Lootable>(1);
		this.nodes = new ArrayList<AiNode>(1);
		
		this.code = code;
		
		this.textureCode = 0;
		
		this.containsScience = false;
		
		this.missionManager = missionManager;
		
		this.discovered = false;
		
	}
	
	public void createNavigationGrid(){
	    this.grid = new LevelBlockGrid(this.hitbox);
	}
	
	// The Void
	// destroys references so gc can clean up
	/**
	 * Purge.
	 */
	public void purge(){
		for(Portal portal: this.portals){
			portal.purge();
		}
	}
	
	// Getters
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public double[] getLocation(){
		double[] location = {this.hitbox.getBounds2D().getMinX(), this.hitbox.getBounds2D().getMinY()};
		
		return location;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public double[] getSize(){
		double[] size = {this.hitbox.getBounds2D().getWidth(), this.hitbox.getBounds2D().getHeight()};
		return size;
	}
	
	/**
	 * Gets the portal.
	 *
	 * @param i the i
	 * @return the portal
	 */
	public Portal getPortal(int i){
		return this.portals.get(i);
	}
	
	/**
	 * Gets the portals.
	 *
	 * @return the portals
	 */
	public List<Portal> getPortals() {
		return portals;
	}
	
	// gets closest portal in a levelBlock to a location
	/**
	 * Gets the closest portal in room.
	 *
	 * @param targetLocation the target location
	 * @return the closest portal in room
	 */
	public Portal getClosestPortalInRoom(double[] targetLocation){
		
		Portal closestPortal = this.portals.get(0);
		
		for(int i = 1; i < this.portals.size(); i++){
			if(Maths.getDistance(closestPortal.getLocation(), targetLocation) > Maths.getDistance(this.getPortal(i).getLocation(), targetLocation)){
				closestPortal = this.getPortal(i);
			}
		}
		
		return closestPortal;
	}
	// gets the closest portal in a levelblock disregarding a portal
	/**
	 * Gets the closest portal in room.
	 *
	 * @param targetLocation the target location
	 * @param disregardPortal the disregard portal
	 * @return the closest portal in room
	 */
	public Portal getClosestPortalInRoom(double[] targetLocation, Portal disregardPortal){
		
		Portal closestPortal = null;
		
		for(int i = 0; i < this.portals.size(); i++){
			if(this.portals.get(i) != disregardPortal){
				closestPortal = this.portals.get(i);
				break;
			}
		}
		for(int i = 0; i < this.portals.size(); i++){
			if(Maths.getDistance(closestPortal.getLocation(), targetLocation) > Maths.getDistance(this.getPortal(i).getLocation(), targetLocation) &&
			  this.portals.get(i) != disregardPortal){
				closestPortal = this.getPortal(i);
			}
		}
		
		return closestPortal;
	}
	
	// gets the closest portal in a levelblock disregarding a portal
		/**
	 * Gets the closest portal in room.
	 *
	 * @param x the x
	 * @param y the y
	 * @param disregardPortal the disregard portal
	 * @return the closest portal in room
	 */
	public Portal getClosestPortalInRoom(double x, double y, Portal disregardPortal){
			
			Portal closestPortal = null;
			
			for(int i = 0; i < this.getPortalCount(); i++){
				if(this.portals.get(i) != disregardPortal){
					closestPortal = this.getPortal(i);
					break;
				}
			}
			for(int i = 0; i < this.getPortalCount(); i++){
				if(Maths.getDistance(closestPortal.getLocation()[0], closestPortal.getLocation()[1], x,y) > 
				   Maths.getDistance(this.getPortal(i).getLocation()[0],this.getPortal(i).getLocation()[1], x,y) &&
				   this.portals.get(i) != disregardPortal){
					closestPortal = this.getPortal(i);
				}
			}
			
			return closestPortal;
		}
	
	/**
	 * Rank closest portals in room.
	 *
	 * @param targetLocation the target location
	 * @return the portal[]
	 */
	public Portal[] rankClosestPortalsInRoom(double[] targetLocation){
		
		Portal[] rankedPortal = new Portal[this.portals.size()];
		
		Portal closestPortal = null;
		
		int j = 0;
		
		// sort portals in order of distance to target [0] closest, [n - 1] furthest 
		do{	
			// choose a portal that has not been placed to compare to
			for(int i = 0; i < this.portals.size(); i++){
				if(!Maths.contains(this.portals.get(i), rankedPortal)){
					closestPortal = this.portals.get(i);
					break;
				}
			}
			// choose the portal that links to a room with an even closer portal that isn't the current portal being compared
			for(int i = 0; i < this.portals.size(); i++){
				if(Maths.getDistance(closestPortal.getLocation(), targetLocation) > 
				   Maths.getDistance(this.getPortal(i).getLocation(), targetLocation) &&
				   !Maths.contains(this.getPortal(i),rankedPortal)){
					closestPortal = this.getPortal(i);
				}
			}
			
			rankedPortal[j] = closestPortal;
			
			j++;
		}while(rankedPortal[rankedPortal.length - 1] == null);
		
		return rankedPortal;
	}
	
	/**
	 * Gets the portal count.
	 *
	 * @return the portal count
	 */
	public int getPortalCount(){
		return this.portals.size();
	}
	
	/**
	 * Links to room.
	 *
	 * @param targetRoom the target room
	 * @return true, if successful
	 */
	public boolean linksToRoom(LevelBlock targetRoom){
		for(int i = 0; i < this.portals.size(); i++){
			if(portals.get(i).connectsTo(targetRoom)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if is in bounds.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if is in bounds
	 */
	public boolean isInBounds(double x, double y){
		return this.hitbox.contains(x, y);
	}
	
	// Setters
	/**
	 * Adds the portal.
	 *
	 * @param portal the portal
	 */
	public void addPortal(Portal portal){
		this.portals.add(portal);
	}
	
	/**
	 * Adds the vertex.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void addVertex(int x, int y){
		this.hitbox.addPoint(x, y);
	}

	/**
	 * Gets the hit box.
	 *
	 * @return the hit box
	 */
	public Polygon getHitBox() {
		return this.hitbox;
	}
	
	/**
	 * Gets the centre.
	 *
	 * @return the centre
	 */
	public double[] getCentre(){
		double[] location = {this.hitbox.getBounds2D().getCenterX(), this.hitbox.getBounds2D().getCenterY()};
		return location;
	}

	/**
	 * Checks if is in cover.
	 *
	 * @param location the location
	 * @return true, if is in cover
	 */
	public boolean isInCover(double[] location) {
		return isInRegion(this.getCover(), location);
	}

	/**
	 * Gets the cover.
	 *
	 * @return the cover
	 */
	public List<Polygon> getCover() {
		return coverPolygons;
	}

	/**
	 * Gets the cover object.
	 *
	 * @param location the location
	 * @return the cover object
	 */
	public Polygon getCoverObject(double[] location) {
		return this.getCoverObject(location[0], location[1]);
	}
	
	/**
	 * Gets the cover object.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the cover object
	 */
	public Polygon getCoverObject(double x, double y) {
		for(Polygon coverUnit : this.coverPolygons){
			if(coverUnit.contains(x - this.getLocation()[0], y - this.getLocation()[1]))
				return coverUnit;
		}
		return null;
	}
	
	/**
	 * Checks if is in stealth.
	 *
	 * @param location the location
	 * @return true, if is in stealth
	 */
	public boolean isInStealth(double[] location) {
		return isInRegion(this.getStealthRegion(), location);
	}

	/**
	 * Gets the stealth region.
	 *
	 * @return the stealth region
	 */
	public List<Polygon> getStealthRegion() {
		return stashPolygons;
	}

	/**
	 * Gets the stealth region object.
	 *
	 * @param location the location
	 * @return the stealth region object
	 */
	public Polygon getStealthRegionObject(double[] location) {
		for(Polygon coverUnit : this.stashPolygons){
			if(coverUnit.contains(location[0] - this.getLocation()[0], location[1] - this.getLocation()[1]))
				return coverUnit;
		}
		return null;
	}
	
	/**
	 * Checks if is in region.
	 *
	 * @param region the region
	 * @param location the location
	 * @return true, if is in region
	 */
	public boolean isInRegion(List<Polygon> region, double[] location){
		for(Polygon area : region){
			if(area.contains(location[0] - this.getLocation()[0], location[1] - this.getLocation()[1]))
				return true;
		}
		return false;
	}

	/**
	 * Move towards nearest region.
	 *
	 * @param mover the mover
	 * @param regions the regions
	 * @throws PathNotFoundException the path not found exception
	 */
	public void moveTowardsNearestRegion(Ai mover, List<Polygon> regions)throws PathNotFoundException{
		// room has no regions
		if(regions.size() == 0){
			 return;
		}
		
		Polygon closestRegion = null;
		double distance = 0;
		for(Polygon region : regions){
			if(closestRegion == null || Maths.getDistance(this.getLocation()[0], this.getLocation()[1], region.getBounds2D().getCenterX(), region.getBounds2D().getCenterY()) < distance){
				distance = Maths.getDistance(this.getLocation()[0], this.getLocation()[1], region.getBounds2D().getCenterX(), region.getBounds2D().getCenterY());
				closestRegion = region;
			}
		}
		
		double[] centre = {closestRegion.getBounds2D().getCenterX(),closestRegion.getBounds2D().getCenterY()};
		
		// find the closest point to the centre of the region
		// move within that distance of the centre to try and get inside the shape
		for(int i = 0; i < closestRegion.npoints; i++){
			if(i == 0 || Maths.getDistance(centre[0],centre[1],closestRegion.xpoints[i],closestRegion.ypoints[i]) < distance){
				distance = Maths.getDistance(centre[0],centre[1],closestRegion.xpoints[i],closestRegion.ypoints[i]);
			}
		}
		
		mover.moveWithinRadius(centre[0] + this.getLocation()[0],
							  centre[1] + this.getLocation()[1], distance);
		
		if(!this.isInRegion(regions, mover.getMoveLocation())){
			mover.setMoveLocation(centre[0] + this.getLocation()[0],
								  centre[1] + this.getLocation()[1]);
		}
	}

	/**
	 * Move towards random region.
	 *
	 * @param mover the mover
	 * @param regions the regions
	 * @return the polygon
	 * @throws PathNotFoundException the path not found exception
	 */
	public Polygon moveTowardsRandomRegion(Ai mover, List<Polygon> regions)throws PathNotFoundException{
		// room has no regions
		if(regions.size() == 0){
			 return null;
		}
		
		Polygon closestRegion = regions.get(new Random().nextInt(regions.size()));
		
		double distance = 0;
		
		double[] centre = {closestRegion.getBounds2D().getCenterX(),closestRegion.getBounds2D().getCenterY()};
		
		// find the closest point to the centre of the region
		// move within that distance of the centre to try and get inside the shape
		for(int i = 0; i < closestRegion.npoints; i++){
			if(i == 0 || Maths.getDistance(centre[0],centre[1],closestRegion.xpoints[i],closestRegion.ypoints[i]) < distance){
				distance = Maths.getDistance(centre[0],centre[1],closestRegion.xpoints[i],closestRegion.ypoints[i]);
			}
		}
		
		mover.moveWithinRadius(centre[0] + this.getLocation()[0],
							  centre[1] + this.getLocation()[1], distance);
		
		if(!this.isInRegion(regions, mover.getMoveLocation())){
			mover.setMoveLocation(centre[0] + this.getLocation()[0],
								  centre[1] + this.getLocation()[1]);
		}
		
		return closestRegion;
	}

	/**
	 * Gets the stash.
	 *
	 * @param location the location
	 * @return the stash
	 */
	public Lootable getStash(double[] location) {
		Polygon region = this.getStealthRegionObject(location);
		
		for(int i = 0; i < this.stashPolygons.size(); i++){
			if(region == this.stashPolygons.get(i)) {
				missionManager.triggerLootEvent(this.stashes.get(i));
				return this.stashes.get(i);
			}
		}
		
		return null;
	}
	
	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LevelBlock && ((LevelBlock) obj).getCode() == this.getCode()){
			return true;
		}
		return false;
	}

	/**
	 * Adds the stash.
	 *
	 * @param region the region
	 */
	public void addStash(Polygon region) {
		this.stashPolygons.add(region);
		this.stashes.add(new LootContainer());
	}

	/**
	 * Adds the cover.
	 *
	 * @param region the region
	 */
	public void addCover(Polygon region) {
		this.coverPolygons.add(region);
	}

	/**
	 * Sets the texture code.
	 *
	 * @param textureCode the new texture code
	 */
	public void setTextureCode(int textureCode){
		this.textureCode = textureCode;
	}
	
	/**
	 * Gets the floor texture code.
	 *
	 * @return the floor texture code
	 */
	public int getFloorTextureCode() {
		return this.textureCode;
	}
	
	/**
	 * Gets the texture polygons.
	 *
	 * @return the texture polygons
	 */
	public Stack<Polygon> getTexturePolygons() {
		return texturePolygons;
	}

	/**
	 * Adds the texture polygon.
	 *
	 * @param texturePolygon the texture polygon
	 */
	public void addTexturePolygon(Polygon texturePolygon) {
		this.texturePolygons.add(texturePolygon);
	}

	/**
	 * Adds the node.
	 *
	 * @param node the node
	 */
	public void addNode(AiNode node){
		this.nodes.add(node);
	}
	
	/**
	 * Gets the nodes.
	 *
	 * @return the nodes
	 */
	public List<AiNode> getNodes() {
		return nodes;
	}

	// Return all nodes targeting a given faction
	/**
	 * Gets the nodes for.
	 *
	 * @param faction the faction
	 * @return the nodes for
	 */
	public ArrayList<AiNode> getNodesFor(String faction) {
		ArrayList<AiNode> factionNodes = new ArrayList<AiNode>();
		
		for(int i = 0; i < nodes.size(); i++){
			if(this.nodes.get(i).canUse(faction))
				factionNodes.add(nodes.get(i));
		}
		
		return factionNodes;
	}

	/**
	 * Gets the stash loot ables.
	 *
	 * @return the stash loot ables
	 */
	public List<Lootable> getStashLootAbles() {
		return this.stashes;
	}

	/**
	 * Gets the textures.
	 *
	 * @return the textures
	 */
	public Stack<Integer> getTextures() {
		return this.textures;
	}

	/**
	 * Sets the contains science.
	 *
	 * @param containsScience the new contains science
	 */
	public void setContainsScience(boolean containsScience) {
		this.containsScience = containsScience;
	}

	/**
	 * Checks for science.
	 *
	 * @return true, if successful
	 */
	public boolean hasScience(){
		return this.containsScience;
	}

	public Set<LevelBlock> getConnectedRooms() {
		Set<LevelBlock> connectedRooms = new HashSet<>();
		
		for(Portal portal : this.portals){
			connectedRooms.add(portal.linksTo(this));
		}
		
		return connectedRooms;
	}

	public Set<LevelBlock> getCloseConnectedRooms(Ai ai) {
		Set<LevelBlock> connectedRooms = new HashSet<>();
		
		for(Portal portal : this.portals){
			if(portal.isInRadius(ai.getLocation(), this) && CombatVisualManager.spotFovNoRadius(ai, portal.getLocation()))
				connectedRooms.add(portal.linksTo(this));
		}
		
		return connectedRooms;
	}

    public LevelBlockGrid getLevelBlockGrid() {
        return this.grid;
    }

	public boolean isDiscovered() {
		return this.discovered;
	}

	public void setDiscovered(boolean discovered) {
		this.discovered = discovered;
	}

	public Portal getPeekingPortal(Ai peeker, LevelBlock levelBlock) {
		
		for(Portal portal : this.portals){
			if(portal.isInRadius(peeker.getLocation(), this) && CombatVisualManager.spotFovNoRadius(peeker, portal.getLocation()) && portal.connectsTo(levelBlock))
				return portal;
		}
		
		return null;
	}
	
}
