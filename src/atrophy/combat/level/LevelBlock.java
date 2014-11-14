package atrophy.combat.level;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import watoydoEngine.utils.Maths;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.PathNotFoundException;
import atrophy.combat.ai.ThinkingAi.AiNode;
import atrophy.combat.display.MapTextures;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.display.ui.loot.LootContainer;

public class LevelBlock {
	
	private List<Portal> portals;
	private Polygon hitbox;
	private List<Polygon> coverPolygons;
	private List<Polygon> stashPolygons;
	private List<Lootable> stashes;
	private List<AiNode> nodes;
	private LevelBlockGrid grid;
	private int code;
	private boolean containsScience;
	private boolean discovered;
	private MapTextures texture;
	
	public LevelBlock(int code, MapTextures texture){
		
		portals = new ArrayList<Portal>(1);
		hitbox = new Polygon();
		
		this.coverPolygons = new ArrayList<Polygon>(1);
		this.stashPolygons = new ArrayList<Polygon>(1);
		this.stashes = new ArrayList<Lootable>(1);
		this.nodes = new ArrayList<AiNode>(1);
		this.code = code;
		this.containsScience = false;
		this.discovered = false;
		this.texture = texture;
		
	}
	
	public void createNavigationGrid(){
	    this.grid = new LevelBlockGrid(this.hitbox);
	}
	
	public void purge(){
		for(Portal portal: this.portals){
			portal.purge();
		}
	}
	
	public double[] getLocation(){
		double[] location = {this.hitbox.getBounds2D().getMinX(), this.hitbox.getBounds2D().getMinY()};
		
		return location;
	}
	
	public double[] getSize(){
		double[] size = {this.hitbox.getBounds2D().getWidth(), this.hitbox.getBounds2D().getHeight()};
		return size;
	}
	
	public Portal getPortal(int i){
		return this.portals.get(i);
	}
	
	public List<Portal> getPortals() {
		return portals;
	}
	
	public Portal getClosestPortalInRoom(double[] targetLocation){
		
		Portal closestPortal = this.portals.get(0);
		
		for(int i = 1; i < this.portals.size(); i++){
			if(Maths.getDistance(closestPortal.getLocation(), targetLocation) > Maths.getDistance(this.getPortal(i).getLocation(), targetLocation)){
				closestPortal = this.getPortal(i);
			}
		}
		
		return closestPortal;
	}

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
	
	public int getPortalCount(){
		return this.portals.size();
	}
	
	public boolean linksToRoom(LevelBlock targetRoom){
		for(int i = 0; i < this.portals.size(); i++){
			if(portals.get(i).connectsTo(targetRoom)){
				return true;
			}
		}
		return false;
	}
	
	public boolean isInBounds(double x, double y){
		return this.hitbox.contains(x, y);
	}
	
	public void addPortal(Portal portal){
		this.portals.add(portal);
	}
	
	public void addVertex(int x, int y){
		this.hitbox.addPoint(x, y);
	}

	public Polygon getHitBox() {
		return this.hitbox;
	}
	
	public double[] getCentre(){
		double[] location = {this.hitbox.getBounds2D().getCenterX(), this.hitbox.getBounds2D().getCenterY()};
		return location;
	}

	public boolean isInCover(double[] location) {
		return isInRegion(this.getCover(), location);
	}

	public List<Polygon> getCover() {
		return coverPolygons;
	}

	public Polygon getCoverObject(double[] location) {
		return this.getCoverObject(location[0], location[1]);
	}
	
	public Polygon getCoverObject(double x, double y) {
		for(Polygon coverUnit : this.coverPolygons){
			if(coverUnit.contains(x - this.getLocation()[0], y - this.getLocation()[1]))
				return coverUnit;
		}
		return null;
	}
	
	public boolean isInStealth(double[] location) {
		return isInRegion(this.getStealthRegion(), location);
	}

	public List<Polygon> getStealthRegion() {
		return stashPolygons;
	}

	public Polygon getStealthRegionObject(double[] location) {
		for(Polygon coverUnit : this.stashPolygons){
			if(coverUnit.contains(location[0] - this.getLocation()[0], location[1] - this.getLocation()[1]))
				return coverUnit;
		}
		return null;
	}
	
	public boolean isInRegion(List<Polygon> region, double[] location){
		for(Polygon area : region){
			if(area.contains(location[0] - this.getLocation()[0], location[1] - this.getLocation()[1]))
				return true;
		}
		return false;
	}

	public void moveTowardsNearestRegion(Ai mover, List<Polygon> regions, boolean ignoreClosedDoors)throws PathNotFoundException{
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
							   centre[1] + this.getLocation()[1],
							   distance, ignoreClosedDoors);
		
		if(!this.isInRegion(regions, mover.getMoveLocation())){
			mover.setMoveLocation(centre[0] + this.getLocation()[0],
								  centre[1] + this.getLocation()[1]);
		}
	}

	public Polygon moveTowardsRandomRegion(Ai mover, List<Polygon> regions, boolean ignoreClosedDoors)throws PathNotFoundException{
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
							   centre[1] + this.getLocation()[1],
							   distance, ignoreClosedDoors);
		
		if(!this.isInRegion(regions, mover.getMoveLocation())){
			mover.setMoveLocation(centre[0] + this.getLocation()[0],
								  centre[1] + this.getLocation()[1],
								  true);
		}
		
		return closestRegion;
	}

	public Lootable getStash(double[] location) {
		Polygon region = this.getStealthRegionObject(location);
		
		return getStash(region);
	}
	
	public Lootable getStash(Polygon region) {
		
		for(int i = 0; i < this.stashPolygons.size(); i++){
			if(region == this.stashPolygons.get(i)) {
				return this.stashes.get(i);
			}
		}
		
		return null;
	}
	
	public int getCode() {
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LevelBlock && ((LevelBlock) obj).getCode() == this.getCode()){
			return true;
		}
		return false;
	}

	public void addStash(Polygon region) {
		this.stashPolygons.add(region);
		this.stashes.add(new LootContainer());
	}

	public void addCover(Polygon region) {
		this.coverPolygons.add(region);
	}

	public void addNode(AiNode node){
		this.nodes.add(node);
	}
	
	public List<AiNode> getNodes() {
		return nodes;
	}

	public ArrayList<AiNode> getNodesFor(String faction) {
		ArrayList<AiNode> factionNodes = new ArrayList<AiNode>();
		
		for(int i = 0; i < nodes.size(); i++){
			if(this.nodes.get(i).canUse(faction))
				factionNodes.add(nodes.get(i));
		}
		
		return factionNodes;
	}

	public List<Lootable> getStashLootAbles() {
		return this.stashes;
	}

	public MapTextures getTexture() {
		return this.texture;
	}
	
	public void setContainsScience(boolean containsScience) {
		this.containsScience = containsScience;
	}

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
	
	public Portal getLOSPortal(Ai ai, LevelBlock room) {
		
		for(Portal portal : this.portals){
			if(portal.isInRadius(ai.getLocation(), this) && CombatVisualManager.spotFovNoRadius(ai, portal.getLocation()) && portal.connectsTo(room))
				return portal;
		}
		
		return null;
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
