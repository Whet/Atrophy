package atrophy.combat;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import watoydoEngine.utils.Maths;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.Abilities;
import atrophy.combat.mechanics.TurnProcess;

public class CombatVisualManager {
	
	public static final double RING_SIZE = 0.3;
	private static final int RING_GAP = 60;
	private static final double MAX_TRACE_RESOLUTION = 0.01;
	private static final double MIN_TRACE_RESOLUTION = 10;
	
	public boolean tabled = false;
	public boolean drawFov = true;
	public boolean drawObjLines = false;
	public Ai aiToDrag = null;
	public Ai aiLastDragged = null;
	private boolean allRevealed = false;
	
	private AiCrowd aiCrowd;
	private CombatUiManager combatUiManager;
	private CombatMembersManager combatMembersManager;
	private LevelManager levelManager;
	private TurnProcess turnProcess;

	private boolean drawingIndividualSight;
	
	private Map<String, Map<Ai, Integer>> factionVisibleAi;
	private Map<Ai, Map<Ai, double[]>> aiVisibilityCache;
	
	public CombatVisualManager(AiCrowd aiCrowd, CombatUiManager combatUiManager, CombatMembersManager combatMembersManager, LevelManager levelManager, TurnProcess turnProcess){
		this.aiCrowd = aiCrowd;
		this.combatUiManager = combatUiManager;
		this.combatMembersManager = combatMembersManager;
		this.levelManager = levelManager;
		
		drawingIndividualSight = true;
		factionVisibleAi = new HashMap<>();
		
		factionVisibleAi.put(AiGenerator.WHITE_VISTA, new HashMap<Ai, Integer>());
		factionVisibleAi.put(AiGenerator.BANDITS, new HashMap<Ai, Integer>());
		factionVisibleAi.put(AiGenerator.PLAYER, new HashMap<Ai, Integer>());
		
		aiVisibilityCache = new HashMap<>();
		
		this.turnProcess = turnProcess;
	}
	
	// If this unit becomes the current ai then only units its team can see should be visible
	// Radio silence means only units this ai can see are visible
	public void updateVisibleAi(){
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(drawingIndividualSight){
				if(aiCrowd.getActor(i) == combatMembersManager.getCurrentAi() || allRevealed ||
				   aiCrowd.getActor(i).isBroadcastingLocation() ||
				   isAiInSight(combatMembersManager.getCurrentAi(),aiCrowd.getActor(i))){
					aiCrowd.getActorMask(aiCrowd.getActor(i)).setVisible(true);
				}
				else{
					aiCrowd.getActorMask(aiCrowd.getActor(i)).setVisible(false);
				}
			}
			else{
				// if a member of the team can see it, all the team can see it
				if(aiCrowd.getActor(i).isBroadcastingLocation() || allRevealed || ((aiCrowd.getActor(i).getFaction().equals("Player") && !aiCrowd.getActor(i).isDead())||
				   isAiInSight(aiCrowd.getActor(i), "Player"))){
					
					aiCrowd.getActorMask(aiCrowd.getActor(i)).setVisible(true);
				}
				else{
					// set true to always have ai vis
					aiCrowd.getActorMask(aiCrowd.getActor(i)).setVisible(false);
				}
			}
		}
	}
	
	public boolean isAiInSight(Ai looker, Ai lookedAt){
		
		if(this.aiVisibilityCache.get(looker) == null) {
			this.aiVisibilityCache.put(looker, new HashMap<Ai, double[]>());
		}
		
		if(this.aiVisibilityCache.get(looker).containsKey(lookedAt)) {
			double[] ds = this.aiVisibilityCache.get(looker).get(lookedAt);
			
			if(ds[0] == ds[2] && ds[1] == ds[3] && spotStealth(looker, lookedAt))
				return true;
		}
		
		// in fov && in same room as target
		// in a radius && in same room
		// or dead and kill counted
		if(( (lookedAt.isDead() && lookedAt.isKillCounted()) || 
		  
		  (!looker.isDead() && looker.getStunnedTurns() == 0 &&
		  (
		  (looker.getLevelBlock() == lookedAt.getLevelBlock() && spotStealth(looker,lookedAt) && spotFov(looker,lookedAt,looker.isIgnoringLOS())) ||
		  // Peeking through door
		  (isInDoorSight(looker, lookedAt) && spotStealth(looker,lookedAt) && spotFov(looker, lookedAt.getLocation()) && 
		   ((looker.getTargetAi() == lookedAt && looker.getWeapon().ignoresLOS()) || 
		   CombatVisualManager.isInFiringSight(looker.getLevelBlock().getPeekingPortal(looker, lookedAt.getLevelBlock()).getLocation()[0],
				   							   looker.getLevelBlock().getPeekingPortal(looker, lookedAt.getLevelBlock()).getLocation()[1],
				   							   lookedAt.getLocation()[0],
				   							   lookedAt.getLocation()[1],
				   							   lookedAt.getLevelBlock()) ))
		  )
		  ))){
			
			// if the corpse is in sight but not counted then count it
			if(lookedAt.isDead() && looker.getFaction().equals("Player")){
				lookedAt.bodyFound(true);
			}
			
			// Update cache
			this.aiVisibilityCache.get(looker).put(lookedAt, new double[]{looker.getLocation()[0], looker.getLocation()[1], lookedAt.getLocation()[0], lookedAt.getLocation()[1]});
			
			return true;
		}
		return false;
	}
	
	public static boolean spotStealth(Ai looker, Ai aiLookedAt){
		if(!aiLookedAt.isStealthed() || looker.getAction().equals(Abilities.XRAY_SCAN) || (looker.getTargetAi() == aiLookedAt && looker.getWeapon().ignoresLOS()) 
				                     || Maths.getDistance(looker.getLocation(), aiLookedAt.getLocation()) <= looker.getFov() * RING_SIZE){
			return true;
		}
		return false;
	}
	
	public static boolean spotFov(Ai looker, Ai aiLookedAt, boolean ignoreLos){
		
		 // fov * RING_SIZE is the radius of sight, to smooth gameplay rather than represent anything
		if( (Maths.angleDifference(Maths.getDegrees(looker.getLocation(), aiLookedAt.getLocation()), looker.getLookAngle()) <= looker.getFov() * 0.5 ||
		     Maths.getDistance(looker.getLocation(), aiLookedAt.getLocation()) <= looker.getFov() * RING_SIZE) &&
		     (ignoreLos || (looker.getTargetAi() == aiLookedAt && looker.getWeapon().ignoresLOS())
		    		    || CombatVisualManager.isInFiringSight(looker.getLocation()[0], looker.getLocation()[1], aiLookedAt.getLocation()[0], aiLookedAt.getLocation()[1], aiLookedAt.getLevelBlock()))){
			return true;
		}
		return false;
	}
	
	public static boolean spotFov(Ai looker, double[] lookedAt){
		 // fov * RING_SIZE is the radius of sight, to smooth gameplay rather than represent anything
		if(Maths.angleDifference(Maths.getDegrees(looker.getLocation(), lookedAt), looker.getLookAngle()) <= looker.getFov() * 0.5 ||
		   Maths.getDistance(looker.getLocation(), lookedAt) <= looker.getFov() * RING_SIZE){
			return true;
		}
		return false;
	}
	
	public static boolean spotFovNoRadius(Ai looker, double[] lookedAt){
		if(Maths.angleDifference(Maths.getDegrees(looker.getLocation(), lookedAt), looker.getLookAngle()) <= looker.getFov() * 0.5){
			return true;
		}
		return false;
	}
	
	public static boolean spotNoRadiusFov(Ai looker, double editLookAngle, double[] lookedAt) {
		// fov * RING_SIZE is the radius of sight, to smooth gameplay rather than represent anything
		if(Maths.angleDifference(Maths.getDegrees(looker.getLocation(), lookedAt), editLookAngle) <= looker.getFov() * 0.5){
			return true;
		}
		return false;
	}
	
	public boolean isAiInSight(Ai aiLookedAt, String faction){

		Integer integer = this.factionVisibleAi.get(faction).get(aiLookedAt);
		
		if(integer != null && integer == turnProcess.getTurnCount())
			return true;
		
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(!aiCrowd.getActor(i).isDead() &&
			   aiCrowd.getActor(i).getFaction().equals(faction) &&
			   (isAiInSight(aiCrowd.getActor(i), aiLookedAt))){
				
				this.factionVisibleAi.get(faction).put(aiLookedAt, turnProcess.getTurnCount());
				
				return true;
			}
		}
		return false;
	}
	
	private static boolean isInDoorSight(Ai looker, Ai aiLookedAt) {
		if(looker.getLevelBlock().getCloseConnectedRooms(looker).contains(aiLookedAt.getLevelBlock()) &&
		   spotFovNoRadius(looker, aiLookedAt.getLocation()) &&
		   spotStealth(looker,aiLookedAt)){
			return true;
		}
		return false;
	}

	public void setTableMasks(boolean table){
		tabled = table;
		if(table){
			
			aiLastDragged = combatMembersManager.getCurrentAi();
			
			for(Ai ai : aiCrowd.getActors()){
				aiCrowd.getActorMask(ai).setTween(null);
				aiCrowd.getActorMask(ai).updateImage();
			}
			
		}
		else{
//			LevelBackground.getInstance().setAlpha(1.0f);
			for(int i = 0; i < aiCrowd.getActorCount(); i++){
				aiCrowd.getMask(i).updateImage();
			}
		}
		combatUiManager.updateUi();
	}
	
	public void aimingCircle(ArrayList<AiImage> ais){
		setTableMasks(true);
		double angleStep = (Math.PI * 2) / (float)ais.size();
		double angle = -Math.PI / 2f;
		double[] startLocation = ais.get(0).getLocationCentre();

		for(int i = 0; i < ais.size(); i++){
			ais.get(i).setLocation(startLocation[0] + Math.cos(angle) * (RING_GAP), 
					               startLocation[1] + Math.sin(angle) * (RING_GAP));
			angle += angleStep;
		}
		combatUiManager.getActionText().updateMode();
	}
	
	public void toggleTableMasks(){
		setTableMasks(!tabled);
	}
	
	public boolean isTabled(){
		return tabled;
	}
	
	public void setDraggableAi(Ai draggableAi){
		aiToDrag = draggableAi;
		
		if(draggableAi != null)
			aiLastDragged = draggableAi;
	}

	public Ai getDraggableAi(){
		return aiToDrag;
	}
	
	public boolean isDrawingFov(){
		return drawFov;
	}
	
	public void setDrawingFov(boolean draw){
		drawFov = draw;
	}
	
	public void revealAll(){
		allRevealed = true;
//		allRevealed = !allRevealed;
	}
	
	public boolean isDrawingObjLines(){
		return drawObjLines;
	}
	
	public boolean isAllRevealed(){
		return allRevealed;
	}
	
	public void setDrawingObjLines(boolean drawLines){
		drawObjLines = drawLines;
	}

	public boolean isPointInSight(double[] location, String faction) {
		// if any ai can spot the point return true
		for(Ai ai : aiCrowd.getActors()){
			if(!ai.isDead() && ai.getLevelBlock() == levelManager.getBlock(location) && ai.getFaction().equals(faction) && spotFov(ai, location)){
				return true;
			}
		}
		return false;
	}

	public Ai getLastDraggableAi() {
		return aiLastDragged;
	}

	public static int[] getLastPointOverCover(int[] is, double rads, LevelBlock room) {
		
		double spaceStep = MIN_TRACE_RESOLUTION;
		
		double x,y;
		
		x = is[0];
		y = is[1];
		
		double vector[] = {Math.cos(rads) * spaceStep,
						   Math.sin(rads) * spaceStep};
		
		boolean inCover = false;
		
		while(true){
			x += vector[0];
			y += vector[1];
			
			if(!inCover && room.getCoverObject(x,y) != null && room.getCoverObject(x,y) != room.getCoverObject(is[0], is[1])) {
				inCover = true;
			}
			else if(inCover && room.getCoverObject(x,y) == null) {
				
				if(spaceStep > MAX_TRACE_RESOLUTION) {
					x -= vector[0];
					y -= vector[1];
					spaceStep = spaceStep / 10;
					vector = new double[]{Math.cos(rads) * spaceStep, Math.sin(rads) * spaceStep};
					continue;
				}
				
				return new int[]{(int)(x - vector[0]),(int)(y - vector[1])};
			}
			
			if(!room.getHitBox().contains(x,y)){
				
				if(spaceStep > MAX_TRACE_RESOLUTION) {
					x -= vector[0];
					y -= vector[1];
					spaceStep = spaceStep / 10;
					vector = new double[]{Math.cos(rads) * spaceStep, Math.sin(rads) * spaceStep};
					continue;
				}
				
				return new int[]{(int)(x - vector[0]),(int)(y - vector[1])};
			}
		}
	}
	
	public static int[] getLastPointNoCover(int[] is, double rads, LevelBlock room) {
		
		double spaceStep = MIN_TRACE_RESOLUTION;
		
		double x,y;
		
		x = is[0];
		y = is[1];
		
		double vector[] = {Math.cos(rads) * spaceStep,
						   Math.sin(rads) * spaceStep};
		
		while(true){
			x += vector[0];
			y += vector[1];
			
			if(!room.getHitBox().contains(x,y)){
				
				if(spaceStep > MAX_TRACE_RESOLUTION) {
					x -= vector[0];
					y -= vector[1];
					spaceStep = spaceStep / 10;
					vector = new double[]{Math.cos(rads) * spaceStep, Math.sin(rads) * spaceStep};
					continue;
				}
				
				return new int[]{(int)(x - vector[0]),(int)(y - vector[1])};
			}
		}
	}

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
	
	public void toggleDrawingIndividualSight() {
		this.drawingIndividualSight = !drawingIndividualSight;
	}

	public boolean isDrawingIndividualSight() {
		return this.drawingIndividualSight;
	}

}
