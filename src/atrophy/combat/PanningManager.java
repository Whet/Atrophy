package atrophy.combat;

import java.awt.Point;

import watoydoEngine.workings.DisplayManager;
import atrophy.combat.display.AiCrowd;


public class PanningManager {
	
	private int maxOffsets[];
	private double panningOffset[];
	private int xDirection;
	private int yDirection;

	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	public PanningManager(AiCrowd aiCrowd, CombatMembersManager combatMembersManager){
		panningOffset = new double[2];
		
		panningOffset[0] = 0;
		panningOffset[1] = 0;
		
		xDirection = 0;
		yDirection = 0;
		
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
	}
	
	public void panX(double offset){
		
		panningOffset[0] += offset;
		if(panningOffset[0] < maxOffsets[1]){
			panningOffset[0] = maxOffsets[1];
		}
		else if(panningOffset[0] > maxOffsets[0]){
			panningOffset[0] = maxOffsets[0];
		}
		
	}
	
	public void panY(double offset){
		
		panningOffset[1] += offset;
		if(panningOffset[1] < maxOffsets[3]){
			panningOffset[1] = maxOffsets[3];
		}
		else if(panningOffset[1] > maxOffsets[2]){
			panningOffset[1] = maxOffsets[2];
		}
		
	}
	
	public void panX(int offset){
		
		xDirection = offset;
		
	}
	
	public void panY(int offset){
		
		yDirection = offset;
		
	}
	
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
	
	public void resetPanning(){
		panningOffset[1] = 0;
		panningOffset[0] = 0;
	}
	
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
	
	public void panToPoint(double x, double y){
		this.resetPanning();
		this.panX(-(x - DisplayManager.getInstance().getResolution()[0] * 0.5));
		this.panY(-(y - DisplayManager.getInstance().getResolution()[1] * 0.5));
	}
	
	public void panToPoint(double[] location){
		this.resetPanning();
		this.panX(-(location[0] - DisplayManager.getInstance().getResolution()[0] * 0.5));
		this.panY(-(location[1] - DisplayManager.getInstance().getResolution()[1] * 0.5));
	}
	
	public double[] getLocationAtCentreOfScreen(){
		double[] location = new double[2];
		location[0] = DisplayManager.getInstance().getResolution()[0] * 0.5 - this.getOffset()[0];
		location[1] = DisplayManager.getInstance().getResolution()[1] * 0.5 - this.getOffset()[1];
		return location;
	}
	
	public double[] getOffset(){
		return this.panningOffset;
	}
	
	public int getPanX(){
		return this.xDirection;
	}
	
	public int getPanY(){
		return this.yDirection;
	}
	
	public void setMaxOffsets(int[] maxOffsets){
		this.maxOffsets = maxOffsets;
	}

	public void updatePan(Point oldPoint, Point newPoint, double[] panAtClick) {
		
		if(oldPoint == null || newPoint == null || panAtClick == null)
			return;
		
		this.panningOffset[0] = panAtClick[0];
		this.panningOffset[1] = panAtClick[1];
		
		this.panningOffset[0] += newPoint.x - oldPoint.x;
		this.panningOffset[1] += newPoint.y - oldPoint.y;
	}
	
}
