/*
 * 
 */
package atrophy.combat.display;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RadialGradientPaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.utils.GraphicsFunctions;
import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.level.LevelBlockGrid;
import atrophy.combat.level.LevelBlockGrid.GridBlock;
import atrophy.combat.level.LevelManager;

// TODO: Auto-generated Javadoc
// Draws lines between aiming ai
/**
 * The Class LineDrawer.
 */
public class LineDrawer implements Displayable{
	
	private static final int FOV_ARC_LENGTH = 100;
	
	private boolean visible;
	private int z;
	
	private AiCrowd aiCrowd;
	private PanningManager panningManager;
	private CombatVisualManager combatVisualManager;
	private CombatMembersManager combatMembersManager;
	private LevelManager levelManager;
	
	public LineDrawer(AiCrowd aiCrowd, PanningManager panningManager, CombatVisualManager combatVisualManager, CombatMembersManager combatMembersManager, LevelManager levelManager){
		visible = true;
		this.aiCrowd = aiCrowd;
		this.panningManager = panningManager;
		this.combatVisualManager = combatVisualManager;
		this.combatMembersManager = combatMembersManager;
		this.levelManager = levelManager;
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			// only draw if ai in sight
			if(aiCrowd.getMask(i).isVisible()  || combatVisualManager.isAllRevealed()){
				
				// only draw fov and paths if the actor is alive and masks aren't being put into a table
				if(!aiCrowd.getMask(i).getAi().isDead() &&
				   !combatVisualManager.isTabled()){
					
					drawShootingLines(drawShape, aiCrowd.getMask(i).getAi());
					
					// draw friendly ai pathways if in sight
					if(aiCrowd.getMask(i).getAi().getFaction().equals("Player")){
					// let us see all ai paths
				//	if(aiCrowd.getMask(i).getAi().getPortalPathway() != null){
						drawAiPath(drawShape,aiCrowd.getMask(i).getAi());
					}
				}
				else if(combatVisualManager.isTabled()){
					// if tabled then draw lines from masks to the ai
					drawLinesMaskToAi(drawShape,aiCrowd.getMask(i).getAi());
					
					drawShootingLines(drawShape, aiCrowd.getMask(i).getAi());
				}
				
				if(aiCrowd.getMask(i).getAi().getFov() > 0 && !aiCrowd.getMask(i).getAi().isDead()){
					
//					if(combatVisualManager.isTabled() &&
//					   aiCrowd.getMask(i).getAi() == combatVisualManager.getLastDraggableAi()){
//						drawFov(drawShape, aiCrowd.getMask(i).getAi());
//						drawFovLight(drawShape, aiCrowd.getMask(i).getAi());
//					}
//					else{
						
						if(combatVisualManager.isDrawingFov() && 
						   aiCrowd.getMask(i).getAi() == combatMembersManager.getCurrentAi()){
							//drawFovLight(drawShape, aiCrowd.getMask(i).getAi());
							drawOldFov(drawShape, aiCrowd.getMask(i).getAi());
						}
						
						drawFov(drawShape, aiCrowd.getMask(i).getAi());
//					}
				}
				
				if(combatMembersManager.isSelected(aiCrowd.getMask(i).getAi())){
					drawSelectedAiIcons(drawShape, aiCrowd.getMask(i).getAi().getLocation());
				}
			}
		}
		
		drawKillRadius(drawShape);
	}

	private void drawKillRadius(Graphics2D drawShape){
		if(combatMembersManager.getCurrentAi() != null){
			drawShape.setComposite(GraphicsFunctions.makeComposite(0.2f));
			drawShape.setColor(Color.red.darker());
			drawShape.drawOval((int)(combatMembersManager.getCurrentAi().getLocation()[0] + panningManager.getOffset()[0]
									 - (combatMembersManager.getCurrentAi().getWeapon().getRange())), 
							   (int)(combatMembersManager.getCurrentAi().getLocation()[1] + panningManager.getOffset()[1]
									 - (combatMembersManager.getCurrentAi().getWeapon().getRange())), 
							   (int)(combatMembersManager.getCurrentAi().getWeapon().getRange() * 2), 
							   (int)(combatMembersManager.getCurrentAi().getWeapon().getRange() * 2));
			drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		}
	}
	
	private void drawLinesMaskToAi(Graphics2D drawShape, Ai ai){
		GraphicsFunctions.drawArrowLine(drawShape,
										aiCrowd.getActorMask(ai).getLocationCentre()[0] + panningManager.getOffset()[0],
										aiCrowd.getActorMask(ai).getLocationCentre()[1] + panningManager.getOffset()[1],
										ai.getLocation()[0] + panningManager.getOffset()[0],
										ai.getLocation()[1] + panningManager.getOffset()[1],
										ai.getTeamColour(),
										1.0f);
	}
	
	private void drawShootingLines(Graphics2D drawShape, Ai ai){
		// if aiObject is targeting an ai draw line between them
		if(ai.getTargetAi() != null && !ai.getAction().equals("Loot")){
				GraphicsFunctions.drawArrowLine(drawShape,
												aiCrowd.getActorMask(ai).getLocationCentre()[0] + 
												(panningManager.getOffset()[0]),
												aiCrowd.getActorMask(ai).getLocationCentre()[1] +
												(panningManager.getOffset()[1]),
												aiCrowd.getActorMask(ai.getTargetAi()).getLocationCentre()[0] + 
												(panningManager.getOffset()[0]),
												aiCrowd.getActorMask(ai.getTargetAi()).getLocationCentre()[1] + 
												(panningManager.getOffset()[1]), 
												Color.yellow,
												0.4f);
		}
	}
	
	private void drawFov(Graphics2D drawShape, Ai ai){
		drawFov(drawShape, ai, ai.getEditLookAngle(), Color.white);
	}
	
	private void drawOldFov(Graphics2D drawShape, Ai ai){
//		drawFov(drawShape, ai, ai.getLookAngle(), Color.orange);
	}
	
	private void drawFov(Graphics2D drawShape, Ai ai, double angle, Color lineColour){
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.8f));
		
		// don't draw 360 since it doesn't look good
		if(ai.getFov() < 360){
			// draw look arc from ai (not mask to avoid confusion when tweening) accounting for panning 
			
			// make red if stunned
			if(ai.getStunnedTurns() > 0){
				drawShape.setColor(Color.red.darker());
			}
			else if(ai.getIncapTurns() > 0){
				drawShape.setColor(Color.blue.darker());
			}
			else if(ai.getFov() > 180){
				drawShape.setColor(lineColour);
			}
			else{
				drawShape.setColor(lineColour.darker());
			}
			
			
			// draw line for first side of angle + 1/2 of fov
			// angles stored in degrees convert to radians
			
			drawShape.drawLine((int)(ai.getLocation()[0] + panningManager.getOffset()[0]),
							   (int)(ai.getLocation()[1] + panningManager.getOffset()[1]),
							   //position plus a constant along the line made by the target angle + fov * combatVisualManager.RING_SIZE
							   (int)(ai.getLocation()[0] + panningManager.getOffset()[0] +
									 FOV_ARC_LENGTH * Math.cos(Math.toRadians(angle) +
											 	               Math.toRadians(ai.getFov()) * 0.5)),
											 	   
							   (int)(ai.getLocation()[1] + panningManager.getOffset()[1] +
									 FOV_ARC_LENGTH * Math.sin(Math.toRadians(angle) + 
											                   Math.toRadians(ai.getFov()) * 0.5)));
			// draw line for second side of angle - 1/2 of fov
			// angles stored in degrees convert to radians
			drawShape.drawLine((int)(ai.getLocation()[0] + panningManager.getOffset()[0]),
							   (int)(ai.getLocation()[1] + panningManager.getOffset()[1]),
							   //position plus a constant along the line made by the target angle + fov * 0.5
							   (int)(ai.getLocation()[0] + panningManager.getOffset()[0] +
									 FOV_ARC_LENGTH * Math.cos(Math.toRadians(angle) -
											                   Math.toRadians(ai.getFov()) * 0.5)),
											       
							   (int)(ai.getLocation()[1] + panningManager.getOffset()[1] +
									 FOV_ARC_LENGTH * Math.sin(Math.toRadians(angle) -
											 	               Math.toRadians(ai.getFov()) * 0.5)));
		
			drawShape.drawOval((int)(ai.getLocation()[0] - ((ai.getFov() * CombatVisualManager.RING_SIZE)) + panningManager.getOffset()[0]), 
							   (int)(ai.getLocation()[1] - ((ai.getFov() * CombatVisualManager.RING_SIZE)) + panningManager.getOffset()[1]), 
							   (int)(ai.getFov() * CombatVisualManager.RING_SIZE * 2), 
							   (int)(ai.getFov() * CombatVisualManager.RING_SIZE * 2));
		}
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1f));
	}
	
	private void drawAiPath(Graphics2D drawShape, Ai ai){
		
		if(ai.getPortalPathway() != null){
			GraphicsFunctions.drawArrowLine(drawShape,
											ai.getLocation()[0] + panningManager.getOffset()[0], 
											ai.getLocation()[1] + panningManager.getOffset()[1],
									        ai.getPortalPathway().get(ai.getPortalPathway().size() - 1).getLocation()[0]
									        + panningManager.getOffset()[0],  
									        ai.getPortalPathway().get(ai.getPortalPathway().size() - 1).getLocation()[1]
									        + panningManager.getOffset()[1],
									        Color.white,
									        1.0f);
			
			// draw lines between portals
			for(int i = 1; i < ai.getPortalPathway().size(); i++){
				GraphicsFunctions.drawArrowLine(drawShape,
											    ai.getPortalPathway().get(i).getLocation()[0] + panningManager.getOffset()[0],  
									            ai.getPortalPathway().get(i).getLocation()[1] + panningManager.getOffset()[1],
									            ai.getPortalPathway().get(i - 1).getLocation()[0] + panningManager.getOffset()[0],  
									            ai.getPortalPathway().get(i - 1).getLocation()[1] + panningManager.getOffset()[1],
									            Color.white,
									            1.0f);
			}
			
			// draw line from last portal to move location
			GraphicsFunctions.drawArrowLine(drawShape,
											ai.getPortalPathway().get(0).getLocation()[0] + panningManager.getOffset()[0],  
								            ai.getPortalPathway().get(0).getLocation()[1] + panningManager.getOffset()[1],
								            ai.getMoveLocation()[0] + panningManager.getOffset()[0],  
								            ai.getMoveLocation()[1] + panningManager.getOffset()[1],
								            Color.white,
									        1.0f);
		}
//		if(ai.getRoomPathway() != null){
//			drawShape.setColor(Color.red);
//			// draw lines between portals
//			for(int i = 0; i < ai.getRoomPathway().size(); i++){
///*				GraphicsFunctions.drawArrowLine(drawShape,
//											    ai.getRoomPathway().get(i)[0] + panningManager.getOffset()[0],  
//									            ai.getRoomPathway().get(i)[1] + panningManager.getOffset()[1],
//									            ai.getRoomPathway().get(i - 1)[0] + panningManager.getOffset()[0],  
//									            ai.getRoomPathway().get(i - 1)[1] + panningManager.getOffset()[1],
//									            Color.white,
//									            1.0f);*/
//				
//				drawShape.fillOval((int)(ai.getRoomPathway().get(i)[0] + panningManager.getOffset()[0] - 3),
//								   (int)(ai.getRoomPathway().get(i)[1] + panningManager.getOffset()[1] - 3), 6, 6);
//			}
//		}
			
	}

	private void drawSelectedAiIcons(Graphics2D drawShape, double[] location){
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.5f));
		drawShape.setColor(Color.green.darker());
		drawShape.drawOval((int)(location[0] + panningManager.getOffset()[0] - 20), 
				           (int)(location[1] + panningManager.getOffset()[1] - 20),
				           40,
				           40);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
	}
	
	@Override
	public int getZ() {
		return this.z;
	}

	@Override
	public boolean isVisible() {
		return this.visible;
	}
	
	@Override
	public int compareTo(Displayable otherDisplay) {
		if(otherDisplay.getZ() > this.getZ()){
			 return -1;
		}
		else if(otherDisplay.getZ() < this.getZ()){
			return 1;
		}
		return 0;
	}

	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	@Override
	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public double getScale() {
		return 0;
	}
	
	@Override
	public void move(double x, double y) {
	}

	@Override
	public void kickTween() {
	}

	@Override
	public double[] getLocation() {
		return null;
	}
	
	@Override
	public double[] getSize() {
		return null;
	}

	@Override
	public void setScale(double scale) {
	}

	@Override
	public void setLocation(double x, double y) {
	}

	@Override
	public void setTween(TweenDefinable tween) {
	}

}
