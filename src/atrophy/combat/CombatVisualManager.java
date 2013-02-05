/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat;

import java.awt.Polygon;
import java.util.ArrayList;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.Abilities;

// TODO: Auto-generated Javadoc
/**
 * The Class CombatVisualManager.
 */
public class CombatVisualManager {
	
	/**
	 * The Constant RING_SIZE.
	 */
	public static final double RING_SIZE = 0.3;
	
	/**
	 * The Constant RING_GAP.
	 */
	private static final int RING_GAP = 60;
	
	/**
	 * The tabled.
	 */
	public boolean tabled = false;
	
	/**
	 * The draw fov.
	 */
	public boolean drawFov = true;
	
	/**
	 * The draw obj lines.
	 */
	public boolean drawObjLines = false;
	
	/**
	 * The ai to drag.
	 */
	public Ai aiToDrag = null;
	
	/**
	 * The ai last dragged.
	 */
	public Ai aiLastDragged = null;
	
	/**
	 * The all revealed.
	 */
	private boolean allRevealed = false;
	
	private AiCrowd aiCrowd;
	private CombatUiManager combatUiManager;
	private CombatMembersManager combatMembersManager;
	private LevelManager levelManager;
	
	public CombatVisualManager(AiCrowd aiCrowd, CombatUiManager combatUiManager, CombatMembersManager combatMembersManager, LevelManager levelManager){
		this.aiCrowd = aiCrowd;
		this.combatUiManager = combatUiManager;
		this.combatMembersManager = combatMembersManager;
		this.levelManager = levelManager;
	}
	
	// If this unit becomes the current ai then only units its team can see should be visible
	// Radio silence means only units this ai can see are visible
	/**
	 * Update visible ai.
	 */
	public void updateVisibleAi(){
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			// radio silence on
			if(combatMembersManager.getTeamObject("1Player").isDrawingIndividualSight()){
				if(aiCrowd.getActor(i) == combatMembersManager.getCurrentAi() || allRevealed ||
				   aiCrowd.getActor(i).isBroadcastingLocation() ||
				   isAiInSight(combatMembersManager.getCurrentAi(),aiCrowd.getActor(i))){
					aiCrowd.getActorMask(aiCrowd.getActor(i)).setVisible(true);
				}
				else{
					// set true to always have ai vis
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
		
	// true if ai is within fov
	/**
	 * Checks if is ai in sight.
	 *
	 * @param looker the looker
	 * @param aiLookedAt the ai looked at
	 * @return true, if is ai in sight
	 */
	public static boolean isAiInSight(Ai looker, Ai aiLookedAt){
		// in fov && in same room as target
		// in a radius && in same room
		// or dead and kill counted
		if(( (aiLookedAt.isDead() && aiLookedAt.isKillCounted()) || 
		  
		  (!looker.isDead() && looker.getStunnedTurns() == 0 &&  
		  (looker.getLevelBlock() == aiLookedAt.getLevelBlock() && spotStealth(looker,aiLookedAt) && spotFov(looker,aiLookedAt,looker.isIgnoringLOS())) ) )){
			
			// if the corpse is in sight but not counted then count it
			if(aiLookedAt.isDead() && looker.getFaction().equals("Player")){
				aiLookedAt.bodyFound(true);
			}
			
			return true;
		}
		return false;
	}
	
	/**
	 * Spot stealth.
	 *
	 * @param looker the looker
	 * @param aiLookedAt the ai looked at
	 * @return true, if successful
	 */
	public static boolean spotStealth(Ai looker, Ai aiLookedAt){
		if(!aiLookedAt.isStealthed() || looker.getAction().equals(Abilities.XRAY_SCAN) || (looker.getTargetAi() == aiLookedAt && looker.getWeapon().ignoresLOS()) 
				                     || Maths.getDistance(looker.getLocation(), aiLookedAt.getLocation()) <= looker.getFov() * RING_SIZE){
			return true;
		}
		return false;
	}
	
	/**
	 * Spot fov.
	 *
	 * @param looker the looker
	 * @param aiLookedAt the ai looked at
	 * @param ignoreLos the ignore los
	 * @return true, if successful
	 */
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
	
	/**
	 * Spot fov.
	 *
	 * @param looker the looker
	 * @param lookedAt the looked at
	 * @return true, if successful
	 */
	public static boolean spotFov(Ai looker, double[] lookedAt){
		 // fov * RING_SIZE is the radius of sight, to smooth gameplay rather than represent anything
		if(Maths.angleDifference(Maths.getDegrees(looker.getLocation(), lookedAt), looker.getLookAngle()) <= looker.getFov() * 0.5 ||
		   Maths.getDistance(looker.getLocation(), lookedAt) <= looker.getFov() * RING_SIZE){
			return true;
		}
		return false;
	}
	
	/**
	 * Spot fov no radius.
	 *
	 * @param looker the looker
	 * @param lookedAt the looked at
	 * @return true, if successful
	 */
	public static boolean spotFovNoRadius(Ai looker, double[] lookedAt){
		 // fov * RING_SIZE is the radius of sight, to smooth gameplay rather than represent anything
		if(Maths.angleDifference(Maths.getDegrees(looker.getLocation(), lookedAt), looker.getLookAngle()) <= looker.getFov() * 0.5){
			return true;
		}
		return false;
	}
	
	/**
	 * Spot no radius fov.
	 *
	 * @param looker the looker
	 * @param editLookAngle the edit look angle
	 * @param lookedAt the looked at
	 * @return true, if successful
	 */
	public static boolean spotNoRadiusFov(Ai looker, double editLookAngle, double[] lookedAt) {
		// fov * RING_SIZE is the radius of sight, to smooth gameplay rather than represent anything
		if(Maths.angleDifference(Maths.getDegrees(looker.getLocation(), lookedAt), editLookAngle) <= looker.getFov() * 0.5){
			return true;
		}
		return false;
	}
	
	// checks if any member of a faction can see the ai
	/**
	 * Checks if is ai in sight.
	 *
	 * @param aiLookedAt the ai looked at
	 * @param faction the faction
	 * @return true, if is ai in sight
	 */
	public  boolean isAiInSight(Ai aiLookedAt, String faction){
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(!aiCrowd.getActor(i).isDead() &&
			   aiCrowd.getActor(i).getFaction().equals(faction) &&
			   isAiInSight(aiCrowd.getActor(i), aiLookedAt)){
				
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Sets the table masks.
	 *
	 * @param table the new table masks
	 */
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
	
	/**
	 * Aiming circle.
	 *
	 * @param ais the ais
	 */
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
	
	/**
	 * Toggle table masks.
	 */
	public void toggleTableMasks(){
		setTableMasks(!tabled);
	}
	
	/**
	 * Checks if is tabled.
	 *
	 * @return true, if is tabled
	 */
	public boolean isTabled(){
		return tabled;
	}
	
	/**
	 * Sets the draggable ai.
	 *
	 * @param draggableAi the new draggable ai
	 */
	public void setDraggableAi(Ai draggableAi){
		aiToDrag = draggableAi;
		
		if(draggableAi != null)
			aiLastDragged = draggableAi;
	}
	
	/**
	 * Gets the draggable ai.
	 *
	 * @return the draggable ai
	 */
	public Ai getDraggableAi(){
		return aiToDrag;
	}
	
	/**
	 * Checks if is drawing fov.
	 *
	 * @return true, if is drawing fov
	 */
	public boolean isDrawingFov(){
		return drawFov;
	}
	
	/**
	 * Sets the drawing fov.
	 *
	 * @param draw the new drawing fov
	 */
	public void setDrawingFov(boolean draw){
		drawFov = draw;
	}
	
	/**
	 * Reveal all.
	 */
	public void revealAll(){
		allRevealed = true;
	}
	
	/**
	 * Checks if is drawing obj lines.
	 *
	 * @return true, if is drawing obj lines
	 */
	public boolean isDrawingObjLines(){
		return drawObjLines;
	}
	
	/**
	 * Checks if is all revealed.
	 *
	 * @return true, if is all revealed
	 */
	public boolean isAllRevealed(){
		return allRevealed;
	}
	
	/**
	 * Sets the drawing obj lines.
	 *
	 * @param drawLines the new drawing obj lines
	 */
	public void setDrawingObjLines(boolean drawLines){
		drawObjLines = drawLines;
	}

	/**
	 * Checks if is point in sight.
	 *
	 * @param location the location
	 * @return true, if is point in sight
	 */
	public boolean isPointInSight(double[] location) {
		// if any ai can spot the point return true
		for(Ai ai : aiCrowd.getActors()){
			if(!ai.isDead() && ai.getLevelBlock() == levelManager.getBlock(location) && spotFov(ai, location)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if is point in sight.
	 *
	 * @param location the location
	 * @param faction the faction
	 * @return true, if is point in sight
	 */
	public boolean isPointInSight(double[] location, String faction) {
		// if any ai can spot the point return true
		for(Ai ai : aiCrowd.getActors()){
			if(!ai.isDead() && ai.getLevelBlock() == levelManager.getBlock(location) && ai.getFaction().equals(faction) && spotFov(ai, location)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the last draggable ai.
	 *
	 * @return the last draggable ai
	 */
	public Ai getLastDraggableAi() {
		return aiLastDragged;
	}

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
	
}
