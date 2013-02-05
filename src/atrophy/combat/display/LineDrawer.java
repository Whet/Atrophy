/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.gubbinz.Maths;
import watoydoEngine.io.ReadWriter;
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
	
	/**
	 * The Constant FOV_ARC_LENGTH.
	 */
	private static final int FOV_ARC_LENGTH = 100;

	/**
	 * The Constant MAP_LINE_COLOUR.
	 */
	public static final Color MAP_LINE_COLOUR = Color.black;

	/**
	 * The Constant COVER_COLOUR.
	 */
	private static final Color COVER_COLOUR = Color.white;

	/**
	 * The Constant STEALTH_COLOUR.
	 */
	private static final Color STEALTH_COLOUR = Color.gray;
	
	/**
	 * The map.
	 */
	private MapDrawBlock map[];
	
	/**
	 * The visible.
	 */
	private boolean visible;
	
	/**
	 * The z.
	 */
	private int z;
	
	private AiCrowd aiCrowd;
	private PanningManager panningManager;
	private CombatVisualManager combatVisualManager;
	private CombatMembersManager combatMembersManager;
	private LevelManager levelManager;
	
	/**
	 * Instantiates a new line drawer.
	 * @param levelManager 
	 */
	public LineDrawer(AiCrowd aiCrowd, PanningManager panningManager, CombatVisualManager combatVisualManager, CombatMembersManager combatMembersManager, LevelManager levelManager){
		visible = true;
		this.aiCrowd = aiCrowd;
		this.panningManager = panningManager;
		this.combatVisualManager = combatVisualManager;
		this.combatMembersManager = combatMembersManager;
		this.levelManager = levelManager;
	}

	/**
	 * Make map.
	 */
	public void makeMap() {
		if(map == null){
			
			BufferedImage[] floorTextures = new BufferedImage[4];
			try{
				floorTextures[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor1.jpg"));
				floorTextures[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor2.jpg"));
				floorTextures[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor3.jpg"));
				floorTextures[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor4.jpg"));
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

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#drawMethod(java.awt.Graphics2D)
	 */
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
					
					if(combatVisualManager.isTabled() &&
					   aiCrowd.getMask(i).getAi() == combatVisualManager.getLastDraggableAi()){
						drawFov(drawShape, aiCrowd.getMask(i).getAi());
						drawFovArcLines(drawShape, aiCrowd.getMask(i).getAi(), aiCrowd.getMask(i).getAi().getEditLookAngle(), Color.green.darker());
					}
					else{
						
						if(combatVisualManager.isDrawingFov() && 
						   aiCrowd.getMask(i).getAi() == combatMembersManager.getCurrentAi()){
							drawFovArcLines(drawShape, aiCrowd.getMask(i).getAi(), aiCrowd.getMask(i).getAi().getEditLookAngle(), Color.white.darker());
							drawOldFov(drawShape, aiCrowd.getMask(i).getAi());
						}
						
						drawFov(drawShape, aiCrowd.getMask(i).getAi());
					}
				}
				
				if(combatMembersManager.isSelected(aiCrowd.getMask(i).getAi())){
					drawSelectedAiIcons(drawShape, aiCrowd.getMask(i).getAi().getLocation());
				}
			}
		}
		drawKillRadius(drawShape);
	}
	

	/**
	 * The Constant OCCUPIED_ALPHA.
	 */
	private static final float OCCUPIED_ALPHA = 1.0f;
	
	/**
	 * The Constant UNOCCUPIED_ALPHA.
	 */
	private static final float UNOCCUPIED_ALPHA = 0.3f;

	/**
	 * Update alphas.
	 */
	public void updateAlphas(){
		Set<LevelBlock> occupiedRooms = new HashSet<LevelBlock>();
		Set<LevelBlock> connectedRooms = new HashSet<>();
		
		for(Ai ai : aiCrowd.getActors()){
			if(aiCrowd.getActorMask(ai).isVisible() && !ai.isDead() &&
			  (ai.getFaction().equals(AiGenerator.PLAYER) || (combatVisualManager.isAllRevealed()))){
				
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
			}
			else if(connectedRooms.contains(block)){
				map[i].setAlpha(UNOCCUPIED_ALPHA);
			}
			else{
				map[i].setAlpha(0.f);
			}
		}
	}
	
	/**
	 * Draw map.
	 *
	 * @param drawShape the draw shape
	 */
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
//				drawPathGrid(drawShape, levelManager.getBlock(mapDraw.levelBlockCode).getLevelBlockGrid(), mapDraw.getLocation()[0], mapDraw.getLocation()[1]);
				
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
	                drawShape.fillRect((int)(gridBlock.x - x), (int)(gridBlock.y - y), gridBlock.width, gridBlock.height);
	            }
	            else {
	                drawShape.setColor(Color.white);
	                drawShape.drawRect((int)(gridBlock.x - x), (int)(gridBlock.y - y), gridBlock.width, gridBlock.height);
	            }
	            
	            
	        }
	    }
	    
    }

    /**
	 * Draw kill radius.
	 *
	 * @param drawShape the draw shape
	 */
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
	
	/**
	 * Draw lines mask to ai.
	 *
	 * @param drawShape the draw shape
	 * @param ai the ai
	 */
	private void drawLinesMaskToAi(Graphics2D drawShape, Ai ai){
		GraphicsFunctions.drawArrowLine(drawShape,
										aiCrowd.getActorMask(ai).getLocationCentre()[0] + panningManager.getOffset()[0],
										aiCrowd.getActorMask(ai).getLocationCentre()[1] + panningManager.getOffset()[1],
										ai.getLocation()[0] + panningManager.getOffset()[0],
										ai.getLocation()[1] + panningManager.getOffset()[1],
										combatMembersManager.getTeamObject(ai.getTeam()).getFactionColour(),
										0.4f);
	}
	
	/**
	 * Draw shooting lines.
	 *
	 * @param drawShape the draw shape
	 * @param ai the ai
	 */
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
	
	/**
	 * Draw fov.
	 *
	 * @param drawShape the draw shape
	 * @param ai the ai
	 */
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
	
	/**
	 * Draw fov arc lines.
	 *
	 * @param drawShape the draw shape
	 * @param ai the ai
	 * @param angle the angle
	 * @param colour the colour
	 */
	private void drawFovArcLines(Graphics2D drawShape, Ai ai, double angle, Color colour){
		
		// All points in the fov arc
		List<int[]> realPoints = new ArrayList<>();
		// All room verticies not in fov arc
		List<int[]> outOfFOVRoomPoints = new ArrayList<>();
		
		populateRealPoints(realPoints, outOfFOVRoomPoints, angle, ai);
		
		Iterator<int[]> pointsIt = realPoints.iterator();
		
		ArrayList<Polygon> cover = new ArrayList<Polygon>();
		
		cover.addAll(ai.getLevelBlock().getCover());
		
		cover.remove(ai.getCoverObject());
		
		List<int[]> outOfLOSRoomPoints = new ArrayList<>();
		
		while(pointsIt.hasNext()){
			int[] point = pointsIt.next();
			if(!CombatVisualManager.isVertexSight(cover, ai.getLocation()[0], ai.getLocation()[1], point[0], point[1], ai.getLevelBlock())){
				outOfLOSRoomPoints.add(point);
				pointsIt.remove();
			}
		}
		
		// points now ones that are in line of sight
		
		// second arraylist to store where the los is lost for each point
		Map<int[], int[]> shadowPoints = new HashMap<int[], int[]>(realPoints.size());
		
		// add points for max left/right
		shadowPoints.put(realPoints.get(0), 
					CombatVisualManager.getLastPointInCover(realPoints.get(0),
												   Math.toRadians(ai.getEditLookAngle()) + Math.toRadians(ai.getFov()) * 0.5,
												   ai.getLevelBlock(),2));
		
		shadowPoints.put(realPoints.get(1), 
					CombatVisualManager.getLastPointInCover(realPoints.get(1),
												   Math.toRadians(ai.getEditLookAngle()) - Math.toRadians(ai.getFov()) * 0.5,
												   ai.getLevelBlock(),2));
		
		for(int i = 2; i < realPoints.size(); i++){
			int[] lastPoint = CombatVisualManager.getLastPoint(realPoints.get(i), Maths.getRads(ai.getLocation(), realPoints.get(i)), ai.getLevelBlock(),5);
			
			if(Maths.getDistance(lastPoint, realPoints.get(i)) > 1)
				shadowPoints.put(realPoints.get(i), lastPoint);
		}
		
		drawShape.setColor(colour);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.8f));
		
		for(int[] startLoc : shadowPoints.keySet()){
			drawShape.drawLine(startLoc[0] + (int)panningManager.getOffset()[0],
							   startLoc[1] + (int)panningManager.getOffset()[1],
							   shadowPoints.get(startLoc)[0] + (int)panningManager.getOffset()[0],
							   shadowPoints.get(startLoc)[1] + (int)panningManager.getOffset()[1]);
		}
		
//		Polygon behindShadowPoly = new Polygon();
//		
//		behindShadowPoly.addPoint((int)ai.getLocation()[0] + (int)panningManager.getOffset()[0], (int)ai.getLocation()[1] + (int)panningManager.getOffset()[1]);
//		
//		behindShadowPoly.addPoint(shadowPoints.get(realPoints.get(0))[0] + (int)panningManager.getOffset()[0], shadowPoints.get(realPoints.get(0))[1] + (int)panningManager.getOffset()[1]);
//		
//		for(int[] nonVisPoint : outOfFOVRoomPoints){
//			behindShadowPoly.addPoint(nonVisPoint[0] + (int)panningManager.getOffset()[0], nonVisPoint[1] + (int)panningManager.getOffset()[1]);
//		}
//		
//		behindShadowPoly.addPoint(shadowPoints.get(realPoints.get(1))[0] + (int)panningManager.getOffset()[0], shadowPoints.get(realPoints.get(1))[1] + (int)panningManager.getOffset()[1]);
//		
//		
//		drawShape.setColor(Color.black);
//		drawShape.setComposite(GraphicsFunctions.makeComposite(0.9f));
//		drawShape.fillPolygon(behindShadowPoly);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		
	}
	
	
	private void populateRealPoints(List<int[]> realPoints, List<int[]> nonVisRealPoints, double angle, Ai ai) {
		
		// add two points for the start location for max left and max right angle
		realPoints.add(new int[]{(int)ai.getLocation()[0], (int) ai.getLocation()[1]});
		realPoints.add(new int[]{(int)ai.getLocation()[0], (int) ai.getLocation()[1]});
		
		// Cover Vetex
		for(int i = 0; i < ai.getLevelBlock().getCover().size(); i++){
			Polygon cover = ai.getLevelBlock().getCover().get(i);
			for(int j = 0; j < cover.npoints; j++){
				if(cover != ai.getCoverObject() &&
						CombatVisualManager.spotNoRadiusFov(ai, angle, new double[]{cover.xpoints[j] + ai.getLevelBlock().getLocation()[0], cover.ypoints[j] + ai.getLevelBlock().getLocation()[1]})){
					
					realPoints.add(new int[]{cover.xpoints[j] + (int)ai.getLevelBlock().getLocation()[0],
							             cover.ypoints[j] + (int)ai.getLevelBlock().getLocation()[1]});
				}
			}
		}
		
		// Room Vertex
		for(int i = 0; i < ai.getLevelBlock().getHitBox().npoints; i++){
			
			Polygon roomPoly = ai.getLevelBlock().getHitBox();
			
			int[] roomPoint = new int[]{roomPoly.xpoints[i], roomPoly.ypoints[i]};
			
			if(roomPoly != ai.getLevelBlock().getCoverObject(ai.getLocation()) && 
					CombatVisualManager.spotNoRadiusFov(ai, ai.getEditLookAngle(), new double[]{roomPoly.xpoints[i], roomPoly.ypoints[i]})){

				realPoints.add(roomPoint);
			
			}
			else{
				nonVisRealPoints.add(roomPoint);
			}
		}
	}

	/**
	 * Draw ai path.
	 *
	 * @param drawShape the draw shape
	 * @param ai the ai
	 */
	private void drawAiPath(Graphics2D drawShape, Ai ai){
		
		if(ai.getPortalPathway() != null){
			GraphicsFunctions.drawArrowLine(drawShape,
											ai.getLocation()[0] + panningManager.getOffset()[0], 
											ai.getLocation()[1] + panningManager.getOffset()[1],
									        ai.getPortalPathway().get(ai.getPortalPathway().size() - 1).getLocation()[0]
									        + panningManager.getOffset()[0],  
									        ai.getPortalPathway().get(ai.getPortalPathway().size() - 1).getLocation()[1]
									        + panningManager.getOffset()[1],
									        combatMembersManager.getTeamObject(ai.getTeam()).getFactionColour(),
									        1.0f);
			
			// draw lines between portals
			for(int i = 1; i < ai.getPortalPathway().size(); i++){
				GraphicsFunctions.drawArrowLine(drawShape,
											    ai.getPortalPathway().get(i).getLocation()[0] + panningManager.getOffset()[0],  
									            ai.getPortalPathway().get(i).getLocation()[1] + panningManager.getOffset()[1],
									            ai.getPortalPathway().get(i - 1).getLocation()[0] + panningManager.getOffset()[0],  
									            ai.getPortalPathway().get(i - 1).getLocation()[1] + panningManager.getOffset()[1],
									            combatMembersManager.getTeamObject(ai.getTeam()).getFactionColour(),
									            1.0f);
			}
			
			// draw line from last portal to move location
			GraphicsFunctions.drawArrowLine(drawShape,
											ai.getPortalPathway().get(0).getLocation()[0] + panningManager.getOffset()[0],  
								            ai.getPortalPathway().get(0).getLocation()[1] + panningManager.getOffset()[1],
								            ai.getMoveLocation()[0] + panningManager.getOffset()[0],  
								            ai.getMoveLocation()[1] + panningManager.getOffset()[1],
								            combatMembersManager.getTeamObject(ai.getTeam()).getFactionColour(),
									        1.0f);
		}
			
	}

	/**
	 * Draw selected ai icons.
	 *
	 * @param drawShape the draw shape
	 * @param location the location
	 */
	private void drawSelectedAiIcons(Graphics2D drawShape, double[] location){
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.5f));
		drawShape.setColor(Color.green.darker());
		drawShape.drawOval((int)(location[0] + panningManager.getOffset()[0] - 20), 
				           (int)(location[1] + panningManager.getOffset()[1] - 20),
				           40,
				           40);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getZ()
	 */
	@Override
	public int getZ() {
		return this.z;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#isVisible()
	 */
	@Override
	public boolean isVisible() {
		return this.visible;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#compareTo(watoydoEngine.designObjects.display.Displayable)
	 */
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

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setZ(int)
	 */
	@Override
	public void setZ(int z) {
		this.z = z;
	}
	
	// Unused Methods
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getScale()
	 */
	@Override
	public double getScale() {
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#move(double, double)
	 */
	@Override
	public void move(double x, double y) {
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#kickTween()
	 */
	@Override
	public void kickTween() {
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getLocation()
	 */
	@Override
	public double[] getLocation() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getSize()
	 */
	@Override
	public double[] getSize() {
		return null;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setScale(double)
	 */
	@Override
	public void setScale(double scale) {
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setLocation(double, double)
	 */
	@Override
	public void setLocation(double x, double y) {
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setTween(watoydoEngine.display.tweens.TweenDefinable)
	 */
	@Override
	public void setTween(TweenDefinable tween) {
	}

	/**
	 * Gets the map image.
	 *
	 * @return the map image
	 */
	public MapDrawBlock[] getMapImage() {
		return map;
	}
	
	/**
	 * Gets the map draw block.
	 *
	 * @param location the location
	 * @return the map draw block
	 */
	public MapDrawBlock getMapDrawBlock(double[] location){
		for(MapDrawBlock drawBlock : map){
			if(drawBlock.getHitbox().contains(location[0],location[1])){
				return drawBlock;
			}
		}
		return null;
	}
	
	/**
	 * The Class MapDrawBlock.
	 */
	public class MapDrawBlock{

		/**
		 * Draw occupied.
		 *
		 * @param drawShape the draw shape
		 */
		public void drawOccupied(Graphics2D drawShape) {
			drawShape.setColor(Color.green);
			drawShape.drawPolygon(levelManager.getBlock(this.levelBlockCode).getHitBox());
		}

		/**
		 * The hitbox.
		 */
		private Polygon hitbox;
		
		/**
		 * The image.
		 */
		private BufferedImage image;
		
		/**
		 * The location.
		 */
		private double[] location;
		
		/**
		 * The alpha.
		 */
		private float alpha;
		
		/**
		 * The cover.
		 */
		private final List<Polygon> cover;
		
		/**
		 * The stealth regions.
		 */
		private final List<Polygon> stealthRegions;
		
		/**
		 * The level block code.
		 */
		private final int levelBlockCode;

		private PanningManager panningManager;

		/**
		 * Instantiates a new map draw block.
		 *
		 * @param bufferedImage the buffered image
		 * @param levelBlock the level block
		 */
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
		
		/**
		 * Checks if is in frame.
		 *
		 * @return true, if is in frame
		 */
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

		/**
		 * Draw regions.
		 *
		 * @param block the block
		 */
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
		

		/**
		 * Gets the alpha.
		 *
		 * @return the alpha
		 */
		public float getAlpha() {
			return alpha;
		}

		/**
		 * Sets the alpha.
		 *
		 * @param alpha the new alpha
		 */
		public void setAlpha(float alpha) {
			this.alpha = alpha;
		}

		/**
		 * Gets the hitbox.
		 *
		 * @return the hitbox
		 */
		public Polygon getHitbox() {
			return hitbox;
		}

		/**
		 * Sets the hitbox.
		 *
		 * @param hitbox the new hitbox
		 */
		public void setHitbox(Polygon hitbox) {
			this.hitbox = hitbox;
		}

		/**
		 * Gets the image.
		 *
		 * @return the image
		 */
		public BufferedImage getImage() {
			return image;
		}

		/**
		 * Gets the location.
		 *
		 * @return the location
		 */
		public double[] getLocation() {
			return location;
		}
		
		/**
		 * Gets the location centre.
		 *
		 * @return the location centre
		 */
		public double[] getLocationCentre() {
			double[] centre = {hitbox.getBounds2D().getCenterX(), hitbox.getBounds2D().getCenterY()};
			return centre;
		}

		/**
		 * Sets the image.
		 *
		 * @param image the new image
		 */
		public void setImage(BufferedImage image) {
			this.image = image;
		}

		/**
		 * Sets the location.
		 *
		 * @param location the new location
		 */
		public void setLocation(double[] location) {
			this.location = location;
		}
		
		/**
		 * Flush.
		 */
		public void flush(){
			this.image.flush();
		}
		
		/**
		 * Gets the cover.
		 *
		 * @return the cover
		 */
		public List<Polygon> getCover() {
			return cover;
		}
		
		/**
		 * Gets the stealth regions.
		 *
		 * @return the stealth regions
		 */
		public List<Polygon> getStealthRegions() {
			return stealthRegions;
		}
		
	}
	
}
