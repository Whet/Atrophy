/*
 * 
 */
package atrophy.combat;

import java.awt.Point;

import watoydoEngine.workings.DisplayManager;
import atrophy.combat.display.AiCrowd;


// TODO: Auto-generated Javadoc
/**
 * The Class PanningManager.
 */
public class PanningManager {
	
	/**
	 * The max offsets.
	 */
	private int maxOffsets[];
	
	/**
	 * The panning offset.
	 */
	private double panningOffset[];
	
	/**
	 * The x direction.
	 */
	private int xDirection;
	
	/**
	 * The y direction.
	 */
	private int yDirection;

	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	/**
	 * Instantiates a new panning manager.
	 */
	public PanningManager(AiCrowd aiCrowd, CombatMembersManager combatMembersManager){
		panningOffset = new double[2];
		
		panningOffset[0] = 0;
		panningOffset[1] = 0;
		
		xDirection = 0;
		yDirection = 0;
		
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
	}
	
	// The Void
	/**
	 * Pan x.
	 *
	 * @param offset the offset
	 */
	public void panX(double offset){
		
		panningOffset[0] += offset;
		if(panningOffset[0] < maxOffsets[1]){
			panningOffset[0] = maxOffsets[1];
		}
		else if(panningOffset[0] > maxOffsets[0]){
			panningOffset[0] = maxOffsets[0];
		}
		
	}
	
	/**
	 * Pan y.
	 *
	 * @param offset the offset
	 */
	public void panY(double offset){
		
		panningOffset[1] += offset;
		if(panningOffset[1] < maxOffsets[3]){
			panningOffset[1] = maxOffsets[3];
		}
		else if(panningOffset[1] > maxOffsets[2]){
			panningOffset[1] = maxOffsets[2];
		}
		
	}
	
	/**
	 * Pan x.
	 *
	 * @param offset the offset
	 */
	public void panX(int offset){
		
		xDirection = offset;
		
	}
	
	/**
	 * Pan y.
	 *
	 * @param offset the offset
	 */
	public void panY(int offset){
		
		yDirection = offset;
		
	}
	
	/**
	 * Update pan.
	 */
	public void updatePan(){
		panningOffset[0] += xDirection;
		if(panningOffset[0] < maxOffsets[1]){
			panningOffset[0] = maxOffsets[1];
		}
		else if(panningOffset[0] > maxOffsets[0]){
			panningOffset[0] = maxOffsets[0];
		}
		
		panningOffset[1] += yDirection;
		if(panningOffset[1] < maxOffsets[3]){
			panningOffset[1] = maxOffsets[3];
		}
		else if(panningOffset[1] > maxOffsets[2]){
			panningOffset[1] = maxOffsets[2];
		}
	}
	
	/**
	 * Reset panning.
	 */
	public void resetPanning(){
		panningOffset[1] = 0;
		panningOffset[0] = 0;
	}
	
	/**
	 * Pan to player.
	 */
	public void panToPlayer(){
		if(combatMembersManager.getCurrentAi() != null){
			// centre on current ai
			this.resetPanning();
			this.panX(-(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocationCentre()[0] -
														   DisplayManager.getInstance().getResolution()[0] * 0.5));
			this.panY(-(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocationCentre()[1] -
														   DisplayManager.getInstance().getResolution()[1] * 0.5));
		}
	}
	
	/**
	 * Pan to point.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void panToPoint(double x, double y){
		this.resetPanning();
		this.panX(-(x - DisplayManager.getInstance().getResolution()[0] * 0.5));
		this.panY(-(y - DisplayManager.getInstance().getResolution()[1] * 0.5));
	}
	
	/**
	 * Pan to point.
	 *
	 * @param location the location
	 */
	public void panToPoint(double[] location){
		this.resetPanning();
		this.panX(-(location[0] - DisplayManager.getInstance().getResolution()[0] * 0.5));
		this.panY(-(location[1] - DisplayManager.getInstance().getResolution()[1] * 0.5));
	}
	
	/**
	 * Gets the location at centre of screen.
	 *
	 * @return the location at centre of screen
	 */
	public double[] getLocationAtCentreOfScreen(){
		double[] location = new double[2];
		location[0] = DisplayManager.getInstance().getResolution()[0] * 0.5 - this.getOffset()[0];
		location[1] = DisplayManager.getInstance().getResolution()[1] * 0.5 - this.getOffset()[1];
		return location;
	}
	
	// Getters
	/**
	 * Gets the offset.
	 *
	 * @return the offset
	 */
	public double[] getOffset(){
		return this.panningOffset;
	}
	
	/**
	 * Gets the pan x.
	 *
	 * @return the pan x
	 */
	public int getPanX(){
		return this.xDirection;
	}
	
	/**
	 * Gets the pan y.
	 *
	 * @return the pan y
	 */
	public int getPanY(){
		return this.yDirection;
	}
	
	// Setters
	/**
	 * Sets the max offsets.
	 *
	 * @param maxOffsets the new max offsets
	 */
	public void setMaxOffsets(int[] maxOffsets){
		this.maxOffsets = maxOffsets;
	}

	public void updatePan(Point oldPoint, Point newPoint, double[] panAtClick) {
		this.panningOffset[0] = panAtClick[0];
		this.panningOffset[1] = panAtClick[1];
		
		this.panningOffset[0] += newPoint.x - oldPoint.x;
		this.panningOffset[1] += newPoint.y - oldPoint.y;
	}
	
}
