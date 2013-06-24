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
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.utils.GraphicsFunctions;
import watoydoEngine.utils.Maths;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.level.LevelBlock;
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
	private static final Color COVER_COLOUR = Color.white;
	private static final Color STEALTH_COLOUR = Color.gray;
	private static final float OCCUPIED_ALPHA = 1.0f;
	private static final float PEEKING_ALPHA = 0.3f;
	private static final double ANGLE_TOLERANCE = 0.1;
	
	private MapDrawBlock map[];
	
	private boolean visible;
	private int z;
	
	private AiCrowd aiCrowd;
	private PanningManager panningManager;
	private CombatVisualManager combatVisualManager;
	private CombatMembersManager combatMembersManager;
	private LevelManager levelManager;
	
	private Polygon shadowPolygon;
	private Polygon lightPolygon;
	private double oldLookAngle;
	private double[] oldLookLocation;
	
	public LineDrawer(AiCrowd aiCrowd, PanningManager panningManager, CombatVisualManager combatVisualManager, CombatMembersManager combatMembersManager, LevelManager levelManager){
		visible = true;
		this.aiCrowd = aiCrowd;
		this.panningManager = panningManager;
		this.combatVisualManager = combatVisualManager;
		this.combatMembersManager = combatMembersManager;
		this.levelManager = levelManager;
		
		shadowPolygon = new Polygon();
		lightPolygon = new Polygon();
		
		oldLookLocation = null;
		
	}

	public void makeMap() {
		if(map == null){
			
			BufferedImage[] floorTextures = new BufferedImage[4];
			try{
				floorTextures[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor1.png"));
				floorTextures[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor2.png"));
				floorTextures[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor3.png"));
				floorTextures[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor4.png"));
			}
			catch(IOException e){
				System.err.println("No Floor textures");
				System.exit(-1);
			}
			
			int mapNumber = 0;
			map = new MapDrawBlock[levelManager.getCurrentLevel().getBlockCount()];
			
			for(LevelBlock levelBlock : levelManager.getCurrentLevel().getBlocks()){
			
				map[mapNumber] = new MapDrawBlock(panningManager, new BufferedImage((int)levelBlock.getSize()[0],(int)levelBlock.getSize()[1], BufferedImage.TYPE_INT_ARGB),levelBlock);
				
				BufferedImage texture = floorTextures[levelBlock.getFloorTextureCode()];
				MapPainter.applyMapTexture(texture, levelBlock, map[mapNumber].getImage());
				
				// apply texture regions
				Iterator<Polygon> texturePolyIt = levelBlock.getTexturePolygons().iterator();
				
				while(texturePolyIt.hasNext()){
					
					Polygon textureRegion = texturePolyIt.next();
					texture =  floorTextures[levelBlock.getTextures().peek()];
					
					MapPainter.applyImage(texture, map[mapNumber].getImage(), textureRegion, levelBlock.getLocation());
					
					texturePolyIt.remove();
					levelBlock.getTextures().pop();
				}
				
				map[mapNumber].drawRegions(levelBlock);
				
				mapNumber++;
			}
		}
	}

	@Override
	public void drawMethod(Graphics2D drawShape) {
		
		drawMap(drawShape);
		
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
							drawFovLight(drawShape, aiCrowd.getMask(i).getAi());
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

	public void updateAlphas(){
		Set<LevelBlock> occupiedRooms = new HashSet<LevelBlock>();
		Set<LevelBlock> connectedRooms = new HashSet<>();
		
		for(Ai ai : aiCrowd.getActors()){
			if(combatVisualManager.isAllRevealed() ||
			   (aiCrowd.getActorMask(ai).isVisible() && !ai.isDead() &&
			   ai.getFaction().equals(AiGenerator.PLAYER))){
				
				occupiedRooms.add(ai.getLevelBlock());
				
				for(LevelBlock block : ai.getLevelBlock().getCloseConnectedRooms(ai)) {
					connectedRooms.add(block);
				}
				
			}
		}
		
		for(int i = 0; i < map.length; i++){
			LevelBlock block = levelManager.getBlock(map[i].levelBlockCode);
			
			if(occupiedRooms.contains(block)){
				map[i].setAlpha(OCCUPIED_ALPHA);
				block.setDiscovered(true);
			}
			else if(connectedRooms.contains(block)){
				map[i].setAlpha(PEEKING_ALPHA);
				block.setDiscovered(true);
			}
			else{
				map[i].setAlpha(0.f);
			}
		}
	}
	
	private void drawMap(Graphics2D drawShape) {
		
		AffineTransform panTransform = new AffineTransform();
		
		for(MapDrawBlock mapDraw : map){
			
			if(mapDraw.isVisible()){
				drawShape.setComposite(GraphicsFunctions.makeComposite(mapDraw.getAlpha()));
				
				panTransform.setToTranslation((int)panningManager.getOffset()[0] + mapDraw.getLocation()[0], 
						                      (int)panningManager.getOffset()[1] + mapDraw.getLocation()[1]);
				
				drawShape.setTransform(panTransform);
				
				drawShape.drawImage(mapDraw.getImage(), null, null);
				
				drawShape.setColor(COVER_COLOUR);
				drawShape.setComposite(GraphicsFunctions.makeComposite(0.4f));
				
				for(int i = 0; i < mapDraw.getCover().size(); i++){
					drawShape.drawPolygon(mapDraw.getCover().get(i));
				}
				
				drawShape.setColor(STEALTH_COLOUR);
				for(int i = 0; i < mapDraw.getStealthRegions().size(); i++){
					drawShape.drawPolygon(mapDraw.getStealthRegions().get(i));
				}
				
				// Debug
				drawPathGrid(drawShape, levelManager.getBlock(mapDraw.levelBlockCode).getLevelBlockGrid(), mapDraw.getLocation()[0], mapDraw.getLocation()[1]);
				
				if(combatVisualManager.isTabled() && levelManager.getBlock(mapDraw.levelBlockCode) == combatVisualManager.getLastDraggableAi().getLevelBlock()){
					
					drawShape.setColor(Color.gray);
					drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
					
					panTransform.translate(-mapDraw.getLocation()[0], -mapDraw.getLocation()[1]);
					drawShape.setTransform(panTransform);
					
					drawShape.drawPolygon(levelManager.getBlock(mapDraw.levelBlockCode).getHitBox());
				}
			}
		}
		
		drawShape.setTransform(new AffineTransform());
	}

	@SuppressWarnings("unused")
    private void drawPathGrid(Graphics2D drawShape, LevelBlockGrid levelBlockGrid, double x, double y) {
	    
	    for(int i = 0; i < levelBlockGrid.getBlocks().size(); i++){
	        for(int j = 0; j < levelBlockGrid.getBlocks().get(i).size(); j++){
	            
	            GridBlock gridBlock = levelBlockGrid.getBlocks().get(i).get(j);
	            
	            if(gridBlock.picked) {
	                drawShape.setColor(Color.red);
	                drawShape.fillRect((int)(gridBlock.x - x), (int)(gridBlock.y - y), (int)gridBlock.width, (int)gridBlock.height);
	            }
	            else {
	                drawShape.setColor(Color.white);
	                drawShape.drawRect((int)(gridBlock.x - x), (int)(gridBlock.y - y), (int)gridBlock.width, (int)gridBlock.height);
	            }
	            
	            
	        }
	    }
	    
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
		drawFov(drawShape, ai, ai.getLookAngle(), Color.orange);
	}
	
	private void drawFov(Graphics2D drawShape, Ai ai, double angle, Color lineColour){
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.4f));
		
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
	
	public void updateFovLight(Ai ai) {
		
		if(oldLookLocation != null && ai.getLookAngle() == oldLookAngle && ai.getLocation()[0] == oldLookLocation[0] && ai.getLocation()[1] == oldLookLocation[1])
			return;
					
		oldLookAngle = ai.getLookAngle();
		oldLookLocation = new double[2];
		oldLookLocation[0] = ai.getLocation()[0];
		oldLookLocation[1] = ai.getLocation()[1];
		
		shadowPolygon.reset();
		lightPolygon.reset();
		
		int[] playerLoc = new int[]{(int) ai.getLocation()[0], (int) ai.getLocation()[1]};
		boolean placedAtPlayer = false;
		
		int[] lastPlacedPoint = null;
		int[] previousPoint = null;
		
		if(ai.isIgnoringLOS()) {
			for(double i = 0; i < 360; i += 0.5) {
				int[] lastPointNoCover = CombatVisualManager.getLastPointNoCover(playerLoc, Math.toRadians(i), ai.getLevelBlock());
				
				if(CombatVisualManager.spotFovNoRadius(ai, new double[]{lastPointNoCover[0], lastPointNoCover[1]})) {
					
					double oldAngle = 0;
					double newAngle = 0;
					
					if(previousPoint != null && lastPlacedPoint != null) {
						oldAngle = Maths.getDegrees(lastPlacedPoint, previousPoint);
						newAngle = Maths.getDegrees(lastPlacedPoint, lastPointNoCover);
					}
					
					if(lastPlacedPoint == null || Maths.angleDifference(oldAngle, newAngle) > ANGLE_TOLERANCE) {
						
						placedAtPlayer = false;
						
						if(previousPoint == null) {
							previousPoint = lastPointNoCover;
							continue;
						}
						else
							lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
						
						lightPolygon.addPoint(lastPointNoCover[0], lastPointNoCover[1]);
						lastPlacedPoint = lastPointNoCover;
					}
					
					if(lastPlacedPoint == lastPointNoCover)
						previousPoint = null;
					else
						previousPoint = lastPointNoCover;
				}
				else if(!placedAtPlayer){

					if(previousPoint != null)
						lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
					
					lightPolygon.addPoint(playerLoc[0], playerLoc[1]);
					placedAtPlayer = true;
					
					previousPoint = playerLoc;
					lastPlacedPoint = playerLoc;
				}
			}
		}
		else {
			for(double i = 0; i < 360; i += 0.5) {
				int[] lastPointOverCover = CombatVisualManager.getLastPointOverCover(playerLoc, Math.toRadians(i), ai.getLevelBlock());
				
				if(CombatVisualManager.spotFovNoRadius(ai, new double[]{lastPointOverCover[0], lastPointOverCover[1]})) {
					
					double oldAngle = 0;
					double newAngle = 0;
					
					if(previousPoint != null && lastPlacedPoint != null) {
						oldAngle = Maths.getDegrees(lastPlacedPoint, previousPoint);
						newAngle = Maths.getDegrees(lastPlacedPoint, lastPointOverCover);
//						System.out.println("O: " + oldAngle + "  N: " + newAngle + "  Diff: " + Maths.angleDifference(oldAngle, newAngle));
					}
					
					if(lastPlacedPoint == null || Maths.angleDifference(oldAngle, newAngle) > ANGLE_TOLERANCE) {
						
						placedAtPlayer = false;
						
						if(previousPoint == null) {
							previousPoint = lastPointOverCover;
							continue;
						}
						else
							lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
						
						lightPolygon.addPoint(lastPointOverCover[0], lastPointOverCover[1]);
						lastPlacedPoint = lastPointOverCover;
					}
					
					if(lastPlacedPoint == lastPointOverCover)
						previousPoint = null;
					else
						previousPoint = lastPointOverCover;
				}
				else if(!placedAtPlayer){
					
					if(previousPoint != null)
						lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
					
					lightPolygon.addPoint(playerLoc[0], playerLoc[1]);
					placedAtPlayer = true;
					
					previousPoint = playerLoc;
					lastPlacedPoint = playerLoc;
				}
			}
			if(previousPoint != null)
				lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
		}
		
		for(int i = 0; i < ai.getLevelBlock().getHitBox().npoints; i++) {
			int x = ai.getLevelBlock().getHitBox().xpoints[i];
			int y = ai.getLevelBlock().getHitBox().ypoints[i];
			shadowPolygon.addPoint(x, y);
		}
		
//		System.out.println("Lightpoly points: " + lightPolygon.npoints);
		
	}
	
	private void drawFovLight(Graphics2D drawShape, final Ai ai){

		AffineTransform transform = drawShape.getTransform();
		
		transform.setToTranslation(panningManager.getOffset()[0], panningManager.getOffset()[1]);
		drawShape.setTransform(transform);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.45f));
		
		Point2D center = new Point2D.Float((int)(ai.getLocation()[0]), (int)(ai.getLocation()[1]));
		float radius = 50;
		float[] dist = {0.0f, 0.5f, 0.8f};
		Color[] colors = {new Color(80, 80, 80), new Color(50, 50, 50), new Color(0, 0, 0)};
		
		RadialGradientPaint gp = new RadialGradientPaint(center, radius, dist, colors);
		
		drawShape.setPaint(gp);
		
		drawShape.fillPolygon(shadowPolygon);
		
		
	    radius = 420;
	    dist = new float[]{0.0f, 0.9f};
	    colors = new Color[]{Color.WHITE, new Color(20,20,90)};
		
		gp = new RadialGradientPaint(center, radius, dist, colors);
		
		drawShape.setPaint(gp);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.18f));
		drawShape.fillPolygon(lightPolygon);
		drawShape.setPaint(null);
		
		
//		radius = 500;
//	    dist = new float[]{0.0f, 0.9f};
//	    colors = new Color[]{new Color(20,20,90), new Color(90,90,160)};
//		
//		gp = new RadialGradientPaint(center, radius, dist, colors);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.2f));
//		drawShape.setPaint(gp);
		drawShape.setColor(Color.cyan);
		drawShape.drawPolygon(lightPolygon);
		
		transform.setToTranslation(0, 0);
		drawShape.setTransform(transform);
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

	public MapDrawBlock[] getMapImage() {
		return map;
	}
	
	public MapDrawBlock getMapDrawBlock(double[] location){
		for(MapDrawBlock drawBlock : map){
			if(drawBlock.getHitbox().contains(location[0],location[1])){
				return drawBlock;
			}
		}
		return null;
	}
	
	public class MapDrawBlock{

		public void drawOccupied(Graphics2D drawShape) {
			drawShape.setColor(Color.green);
			drawShape.drawPolygon(levelManager.getBlock(this.levelBlockCode).getHitBox());
		}

		private Polygon hitbox;
		private BufferedImage image;
		private double[] location;
		private float alpha;
		private final List<Polygon> cover;
		private final List<Polygon> stealthRegions;
		private final int levelBlockCode;
		private PanningManager panningManager;

		public MapDrawBlock(PanningManager panningManager, BufferedImage bufferedImage, LevelBlock levelBlock) {
			this.image = bufferedImage;
			this.hitbox = levelBlock.getHitBox();
			this.location = levelBlock.getLocation().clone();
			this.alpha = 1.0f;
			
			this.cover = levelBlock.getCover();
			this.stealthRegions = levelBlock.getStealthRegion();
			
			levelBlockCode = levelBlock.getCode();
			
			this.panningManager = panningManager;
		}
		
		public boolean isVisible() {
			if(alpha == 0 ||
			   (this.location[0] + panningManager.getOffset()[0] > DisplayManager.getInstance().getResolution()[0] ||
			    this.location[1] + panningManager.getOffset()[1] > DisplayManager.getInstance().getResolution()[1]) ||
			   (this.location[0] + image.getWidth() + panningManager.getOffset()[0] < 0 ||
			    this.location[1] + image.getHeight()+  panningManager.getOffset()[1] < 0)){
				return false;
			}
			return true;
		}

		protected void drawRegions(LevelBlock block) {
			
			BufferedImage[] STASH_HOLES = new BufferedImage[3];
			BufferedImage[] COVER = new BufferedImage[3];
			
			try{
				STASH_HOLES[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/stashHole1.png"));
				STASH_HOLES[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/stashHole2.png"));
				STASH_HOLES[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/stashHole3.png"));
				
				COVER[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/cover1.png"));
				COVER[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/cover2.png"));
				COVER[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/cover3.png"));
			}
			catch(IOException e){
				System.err.println("No region textures");
				System.exit(-1);
			}
			
			for(int i = 0; i < block.getCover().size(); i++){
				MapPainter.applyImage(COVER[new Random().nextInt(COVER.length)],
									  this,
									  new double[] {block.getCover().get(i).getBounds2D().getCenterX() + block.getLocation()[0],
													block.getCover().get(i).getBounds2D().getCenterY() + block.getLocation()[1]},
						                            1.0);
			}
			
			// Make sure stash holes are drawn on top of the cover!
			for(int i = 0; i < block.getStealthRegion().size(); i++){
				MapPainter.applyImage(STASH_HOLES[new Random().nextInt(STASH_HOLES.length)],
									  this,
									  new double[] {block.getStealthRegion().get(i).getBounds2D().getCenterX() + block.getLocation()[0],
						                            block.getStealthRegion().get(i).getBounds2D().getCenterY() + block.getLocation()[1]},
						                            1.0);
				
			}
			
			// Clear memory
			for(int i = 0; i < STASH_HOLES.length; i++){
				STASH_HOLES[i].flush();
				STASH_HOLES[i] = null;
			}
			for(int i = 0; i < COVER.length; i++){
				COVER[i].flush();
				COVER[i] = null;
			}
		}
		

		public float getAlpha() {
			return alpha;
		}

		public void setAlpha(float alpha) {
			this.alpha = alpha;
		}

		public Polygon getHitbox() {
			return hitbox;
		}

		public void setHitbox(Polygon hitbox) {
			this.hitbox = hitbox;
		}

		public BufferedImage getImage() {
			return image;
		}

		public double[] getLocation() {
			return location;
		}
		
		public double[] getLocationCentre() {
			double[] centre = {hitbox.getBounds2D().getCenterX(), hitbox.getBounds2D().getCenterY()};
			return centre;
		}

		public void setImage(BufferedImage image) {
			this.image = image;
		}

		public void setLocation(double[] location) {
			this.location = location;
		}
		
		public void flush(){
			this.image.flush();
		}
		
		public List<Polygon> getCover() {
			return cover;
		}
		
		public List<Polygon> getStealthRegions() {
			return stealthRegions;
		}

	}
	
}
