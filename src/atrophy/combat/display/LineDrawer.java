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
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

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
import atrophy.combat.ai.PathFinder;
import atrophy.combat.level.LevelBlock;
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
	
	/**
	 * The tag.
	 */
	private String tag;

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
		tag = "LineSurface";
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
			
			BufferedImage[] FLOOR = new BufferedImage[4];
			try{
				FLOOR[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor1.jpg"));
				FLOOR[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor2.jpg"));
				FLOOR[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor3.jpg"));
				FLOOR[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor4.jpg"));
			}
			catch(IOException e){
				System.err.println("No Floor textures");
				System.exit(-1);
			}
			
			int mapNumber = 0;
			map = new MapDrawBlock[levelManager.getCurrentLevel().getBlockCount()];
			
			for(LevelBlock levelBlock : levelManager.getCurrentLevel().getBlocks()){
			
				map[mapNumber] = new MapDrawBlock(panningManager, new BufferedImage((int)levelBlock.getSize()[0],(int)levelBlock.getSize()[1], BufferedImage.TYPE_INT_ARGB),
												  levelBlock);
				
				BufferedImage texture = FLOOR[levelBlock.getFloorTextureCode()];
				MapPainter.applyMapTexture(texture, levelBlock, map[mapNumber].getImage());
				
				// apply texture regions
				Iterator<Polygon> texturePolyIt = levelBlock.getTexturePolygons().iterator();
				
				while(texturePolyIt.hasNext()){
					
					Polygon textureRegion = texturePolyIt.next();
					texture =  FLOOR[levelBlock.getTextures().peek()];
					
					MapPainter.applyImage(texture, map[mapNumber].getImage(), textureRegion, levelBlock.getLocation());
					
					texturePolyIt.remove();
					levelBlock.getTextures().pop();
				}
				
				map[mapNumber].drawRegions(levelBlock);
				
				Lighting.applyLight(map[mapNumber].getImage(), levelBlock);
				
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
		drawObjectiveMarkers(drawShape);
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
		ArrayList<LevelBlock> occupiedRooms = new ArrayList<LevelBlock>();
		for(Ai ai : aiCrowd.getActors()){
			if(aiCrowd.getActorMask(ai).isVisible() && !ai.isDead() &&
			  (ai.getFaction().equals("Player") || ai.getFaction().equals("Daemon") || (combatVisualManager.isAllRevealed())))
			occupiedRooms.add(ai.getLevelBlock());
		}
		for(int i = 0; i < map.length; i++){
			if(occupiedRooms.contains(levelManager.getBlock(map[i].levelBlockCode))){
				map[i].setAlpha(OCCUPIED_ALPHA);
			}
			else{
				map[i].setAlpha(UNOCCUPIED_ALPHA);
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
			
			if(mapDraw.isInFrame()){
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
		ArrayList<int[]> points = new ArrayList<>();
		
		// add two points for the start location for max left and max right angle
		points.add(new int[]{(int)ai.getLocation()[0], (int) ai.getLocation()[1]});
		points.add(new int[]{(int)ai.getLocation()[0], (int) ai.getLocation()[1]});
		
		// Cover Vetex
		for(int i = 0; i < ai.getLevelBlock().getCover().size(); i++){
			Polygon cover = ai.getLevelBlock().getCover().get(i);
			for(int j = 0; j < cover.npoints; j++){
				if(cover != ai.getCoverObject() &&
						CombatVisualManager.spotNoRadiusFov(ai, angle, new double[]{cover.xpoints[j] + ai.getLevelBlock().getLocation()[0], cover.ypoints[j] + ai.getLevelBlock().getLocation()[1]})){
					
					points.add(new int[]{cover.xpoints[j] + (int)ai.getLevelBlock().getLocation()[0],
							             cover.ypoints[j] + (int)ai.getLevelBlock().getLocation()[1]});
				}
			}
		}
		
		// Room Vertex
		for(int i = 0; i < ai.getLevelBlock().getHitBox().npoints; i++){
			Polygon cover = ai.getLevelBlock().getHitBox();
			if(cover != ai.getLevelBlock().getCoverObject(ai.getLocation()) && 
					CombatVisualManager.spotNoRadiusFov(ai, ai.getEditLookAngle(), new double[]{cover.xpoints[i], cover.ypoints[i]})){

			points.add(new int[]{cover.xpoints[i],
								 cover.ypoints[i]});
			}
		}
		
		// points are all ones in fov arc
		
		Iterator<int[]> pointsIt = points.iterator();
		
		ArrayList<Polygon> cover = new ArrayList<Polygon>();
		
		cover.addAll(ai.getLevelBlock().getCover());
		
		cover.remove(ai.getCoverObject());
		
		while(pointsIt.hasNext()){
			int[] point = pointsIt.next();
			if(!PathFinder.isVertexSight(cover, ai.getLocation()[0], ai.getLocation()[1], point[0], point[1], ai.getLevelBlock())){
				pointsIt.remove();
			}
		}
		
		// points now ones that are in line of sight
		
		// second arraylist to store where the los is lost for each point
		Map<int[], int[]> points2 = new HashMap<int[], int[]>(points.size());
		
		// add points for max left/right
		points2.put(points.get(0), 
					PathFinder.getLastPointInCover(points.get(0),
												   Math.toRadians(ai.getEditLookAngle()) + Math.toRadians(ai.getFov()) * 0.5,
												   ai.getLevelBlock(),2));
		
		points2.put(points.get(1), 
					PathFinder.getLastPointInCover(points.get(1),
												   Math.toRadians(ai.getEditLookAngle()) - Math.toRadians(ai.getFov()) * 0.5,
												   ai.getLevelBlock(),2));
		
		for(int i = 2; i < points.size(); i++){
			int[] lastPoint = PathFinder.getLastPoint(points.get(i), Maths.getRads(ai.getLocation(), points.get(i)), ai.getLevelBlock(),5);
			
			if(Maths.getDistance(lastPoint, points.get(i)) > 1)
				points2.put( points.get(i), lastPoint);
		}
		
		drawShape.setColor(colour);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.8f));
		
		for(int[] startLoc : points2.keySet()){
			drawShape.drawLine(startLoc[0] + (int)panningManager.getOffset()[0],
							   startLoc[1] + (int)panningManager.getOffset()[1],
							   points2.get(startLoc)[0] + (int)panningManager.getOffset()[0],
							   points2.get(startLoc)[1] + (int)panningManager.getOffset()[1]);
		}
		
		drawShape.setColor(Color.red);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.6f));
		//TODO Shadow/Light effect
		// Debug draw points
//		for(int i = 0; i < points.size(); i++){
//			drawShape.fillOval(points.get(i)[0] - 3 + (int)panningManager.getOffset()[0],
//							   points.get(i)[1] - 3 + (int)panningManager.getOffset()[1],
//							   6,
//							   6);
//		}
//		
//		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
//		drawShape.setColor(Color.yellow);
//		for(int[] point : points2.values()){
//			drawShape.fillOval(point[0] - 3 + (int)panningManager.getOffset()[0],
//							   point[1] - 3 + (int)panningManager.getOffset()[1],
//							   6,
//							   6);
//		}
//		
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
	}
	
	/*
	private static class Shadow{
		public int[] location, location1, location2;
	}*/
	/*
	@SuppressWarnings("serial")
	private void drawFovArcs(Graphics2D drawShape, final Ai ai){
		
		ArrayList<Shadow> shadows = new ArrayList<Shadow>();
		
		ArrayList<int[]> points = new ArrayList<>();
		
		// add two points for the start location for max left and max right angle
		points.add(new int[]{(int)ai.getLocation()[0], (int) ai.getLocation()[1]});
		points.add(new int[]{(int)ai.getLocation()[0], (int) ai.getLocation()[1]});
		
		// Cover Vetex
		for(int i = 0; i < ai.getLevelBlock().getCover().size(); i++){
			Polygon cover = ai.getLevelBlock().getCover().get(i);
			for(int j = 0; j < cover.npoints; j++){
				if(combatVisualManager.spotNoRadiusFov(ai, ai.getEditLookAngle(),
											           new double[]{cover.xpoints[j] + ai.getLevelBlock().getLocation()[0], cover.ypoints[j] + ai.getLevelBlock().getLocation()[1]})){
					
					points.add(new int[]{cover.xpoints[j] + (int)ai.getLevelBlock().getLocation()[0],
							             cover.ypoints[j] + (int)ai.getLevelBlock().getLocation()[1]});
				}
			}
		}
		
		// Room Vertex
		for(int i = 0; i < ai.getLevelBlock().getHitBox().npoints; i++){
			Polygon cover = ai.getLevelBlock().getHitBox();
			if(combatVisualManager.spotNoRadiusFov(ai, ai.getEditLookAngle(),
		            new double[]{cover.xpoints[i], cover.ypoints[i]})){

			points.add(new int[]{cover.xpoints[i],
								 cover.ypoints[i]});
			}
		}
		
		// points are all ones in fov arc
		
		Iterator<int[]> pointsIt = points.iterator();
		
		while(pointsIt.hasNext()){
			int[] point = pointsIt.next();
			if(!PathFinder.isVertexSight(ai.getLocation()[0], ai.getLocation()[1], point[0], point[1], ai.getLevelBlock())){
				pointsIt.remove();
			}
			// move point slightly towards ai
			else{
				int[] pointShift = {(int) (1 * Math.cos(Maths.getRads(point, ai.getLocation()))),
									(int) (1 * Math.sin(Maths.getRads(point, ai.getLocation())))};
				point[0] += pointShift[0];
				point[1] += pointShift[1];
			}
		}
		
		// points now ones that are in line of sight
		
		// second arraylist to store where the los is lost for each point
		ArrayList<int[]> points2 = new ArrayList<>(points.size());
		
		// add points for max left/right
		points2.add(PathFinder.getLastPoint(points.get(0),
					Math.toRadians(ai.getEditLookAngle()) + Math.toRadians(ai.getFov()) * 0.5,
					ai.getLevelBlock(),2));
		
		points2.add(PathFinder.getLastPoint(points.get(1),
					Math.toRadians(ai.getEditLookAngle()) - Math.toRadians(ai.getFov()) * 0.5,
					ai.getLevelBlock(),2));
		
		
		// order points from left to right
		final double rightAngle = ai.getEditLookAngle() - ai.getFov() * 0.5;
		
		Comparator<int[]> rightToLeft = new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// sorts out very close angles
				if(Math.abs(Maths.angleDifference(rightAngle, Maths.getDegrees(ai.getLocation(), o1)) -
						Maths.angleDifference(rightAngle, Maths.getDegrees(ai.getLocation(), o2))) < 1){
					
					if(Maths.getDistance(o1, ai.getLocation()) < Maths.getDistance(o2, ai.getLocation())){
						return 1;
					}
					return -1;
				}
				else if(Maths.angleDifference(rightAngle, Maths.getDegrees(ai.getLocation(), o1)) <
				   Maths.angleDifference(rightAngle, Maths.getDegrees(ai.getLocation(), o2))){
					return 1;
				}
				else{
					return -1;
				}
				
			}
		};
		
		PriorityQueue<int[]> pointPriority = new PriorityQueue<>(points.size(), rightToLeft);
		
		for(int i = 2; i < points.size(); i++){
			pointPriority.offer(points.get(i));
		}
		
		Polygon viewPoly = new Polygon();
		viewPoly.addPoint(points.get(0)[0], points.get(0)[1]);
		viewPoly.addPoint(points2.get(0)[0], points2.get(0)[1]);
		
		drawShape.setTransform(new AffineTransform(){
			{
				this.setToTranslation(panningManager.getOffset()[0], panningManager.getOffset()[1]);
			}
		});
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		
		Color[] colours = {Color.red,Color.yellow,Color.green};
		int cI = 0;
		
		while(pointPriority.size() > 0){
			
			int[] point = pointPriority.poll();
			
			viewPoly.addPoint(point[0], point[1]);
			
			
			drawShape.setColor(colours[cI]);
			
			drawShape.fillOval(point[0] - 3,
							   point[1] - 3, 6, 6);
			
			
			cI++;
			if(cI > 2)
				cI = 0;
		}
		
		viewPoly.addPoint(points2.get(1)[0], points2.get(1)[1]);
		
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.16f));
		drawShape.setColor(Color.white);
		
		drawShape.fillPolygon(viewPoly);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		
		drawShape.setTransform(new AffineTransform());
	}
		/*
		// remove start points
		points.remove(0);
		points.remove(0);
		
		// draw shadow polygons
		
		Collections.sort(points, rightToLeft);
		
		cI = 0;
		
		boolean lastAction = false;
		
		for(int i = 0; i < points.size(); i++){
			
			int[] lastPoint = PathFinder.getLastPoint(points.get(i), Maths.getRads(ai.getLocation(), points.get(i)), ai.getLevelBlock(),5);
			
			if(Maths.getDistance(points.get(i), ai.getLocation()) > 1 && Maths.getDistance(lastPoint, points.get(i)) > 4){
				points2.add(lastPoint);
				
				drawShape.setColor(colours[cI]);
				
				drawShape.fillOval(lastPoint[0] - 3,
								   lastPoint[1] - 3, 6, 6);
				
				
				cI++;
				if(cI > 2)
					cI = 0;
				
				Shadow shadow = new Shadow();
				shadow.location = lastPoint;
				shadow.location1 = points.get(i);
				
				if(lastAction && PathFinder.isVertexSight(shadows.get(shadows.size() - 1).location[0], shadows.get(shadows.size() - 1).location[1], points.get(i)[0], points.get(i)[1], ai.getLevelBlock()) ){
					shadows.get(shadows.size() - 1).location2 = shadow.location.clone();
					lastAction = false;
				}
				
				
				if(i == points.size() - 1 && PathFinder.isVertexSight(shadow.location[0], shadow.location[1], points2.get(1)[0], points2.get(1)[1], ai.getLevelBlock())){
					shadow.location2 = points2.get(1);
					lastAction = false;
				}
				else if(i == 0 && PathFinder.isVertexSight(shadow.location[0], shadow.location[1], points2.get(0)[0], points2.get(0)[1], ai.getLevelBlock())){
					shadow.location2 = points2.get(0);
					lastAction = false;
				}
				else if(i + 1 < points.size() && PathFinder.isVertexSight(shadow.location[0], shadow.location[1], points.get(i + 1)[0], points.get(i + 1)[1], ai.getLevelBlock())){
					shadow.location2 = points.get(i + 1);
					lastAction = !lastAction;
				}
				else if(i > 0 && PathFinder.isVertexSight(shadow.location[0], shadow.location[1], points.get(i - 1)[0], points.get(i - 1)[1], ai.getLevelBlock())){
					shadow.location2 = points.get(i - 1);
					lastAction = !lastAction;
				}
				else{
					shadow.location2 = shadow.location;
				}
				
				shadows.add(shadow);
			}
			else{
				lastAction = false;
			}
		}
		
		if(shadows.size() > 1  && Maths.getDistance(shadows.get(shadows.size() - 1).location,shadows.get(shadows.size() - 1).location2) == 0){
			shadows.get(shadows.size() - 1).location2 = shadows.get(shadows.size() - 2).location;
		}
		
		drawShape.setColor(Color.red);
		for(int i = 0; i < shadows.size(); i++){
			Polygon shadowPoly = new Polygon();
			shadowPoly.addPoint(shadows.get(i).location[0], shadows.get(i).location[1]);
			shadowPoly.addPoint(shadows.get(i).location1[0], shadows.get(i).location1[1]);
			shadowPoly.addPoint(shadows.get(i).location2[0], shadows.get(i).location2[1]);
			drawShape.fillPolygon(shadowPoly);
		}
		
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		
		drawShape.setTransform(new AffineTransform());
		
		drawFov(drawShape, ai);
	}
	
	private boolean notIntersectingRegions(Shadow shadow, int[] testLocation, ArrayList<Shadow> shadows){
		
		Polygon testpoly = new Polygon();
		testpoly.addPoint(testLocation[0], testLocation[1]);
		testpoly.addPoint(shadow.location[0],shadow.location[1]);
		testpoly.addPoint(shadow.location1[0],shadow.location1[1]);
		
		for(int i = 0; i < shadows.size(); i++){
			Polygon shadow2 = new Polygon();
			shadow2.addPoint(shadows.get(i).location[0],shadows.get(i).location[1]);
			shadow2.addPoint(shadows.get(i).location1[0],shadows.get(i).location1[1]);
			shadow2.addPoint(shadows.get(i).location2[0], shadows.get(i).location2[1]);
			
			if(testpoly.contains(shadow2.getBounds2D().getCenterX(),shadow2.getBounds2D().getCenterY()) ||
			   shadow2.contains(testpoly.getBounds2D().getCenterX(),testpoly.getBounds2D().getCenterY())){
				return false;
			}
		}
		return true;
	}*/
	
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
	 * Draw objective markers.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawObjectiveMarkers(Graphics2D drawShape){/*
		double[][] markers = MissionManager.getInstance().getObjectiveLocations();
		
		if(markers != null && combatVisualManager.isDrawingObjLines()){
			drawShape.setColor(Color.yellow);
			
			for(int i = 0; i < markers.length; i++){
				drawShape.drawOval((int)(markers[i][0] + panningManager.getOffset()[0] - MARKER_RADIUS), 
								   (int)(markers[i][1] + panningManager.getOffset()[1] - MARKER_RADIUS),
								   MARKER_RADIUS * 2, MARKER_RADIUS * 2);
				drawShape.drawString(Integer.toString(i), 
									(int)(markers[i][0] + panningManager.getOffset()[0] - MARKER_RADIUS), 
									(int)(markers[i][1] + panningManager.getOffset()[1] - MARKER_RADIUS));
				
				drawObjectiveLines(drawShape,markers[i]);
			}
		}*/
	}
	/*
	private void drawDangerScores(Graphics2D drawShape){
		
		if(combatVisualManager.isDrawingObjLines()){
			drawShape.setColor(Color.white);
			
			for(int i = 0; i < levelManager.getCurrentLevel().getBlockCount(); i++){
				drawShape.drawOval((int)(levelManager.getBlock(i).getCentre()[0] + panningManager.getOffset()[0] - MARKER_RADIUS), 
								   (int)(levelManager.getBlock(i).getCentre()[1] + panningManager.getOffset()[1] - MARKER_RADIUS),
								   MARKER_RADIUS * 2, MARKER_RADIUS * 2);
				drawShape.drawString(Integer.toString(WhiteVistaCommander.getCombatScoreDEV(levelManager.getBlock(i))), 
								   (int)(levelManager.getBlock(i).getCentre()[0] + panningManager.getOffset()[0] - MARKER_RADIUS), 
								   (int)(levelManager.getBlock(i).getCentre()[1] + panningManager.getOffset()[1] - MARKER_RADIUS));

			}
		}
	}*/
	
	/**
	 * Draw selected ai icons.
	 *
	 * @param drawShape the draw shape
	 * @param location the location
	 *//*
	private void drawObjectiveLines(Graphics2D drawShape, double[] marker){
		if( combatMembersManager.getCurrentAi() != null){
			drawShape.setComposite(GraphicsFunctions.makeComposite(0.5f));
			
			GraphicsFunctions.drawArrowLine(drawShape, 
					                        combatMembersManager.getCurrentAi().getLocation()[0] + panningManager.getOffset()[0],
					                        combatMembersManager.getCurrentAi().getLocation()[1] + panningManager.getOffset()[1],
											marker[0] + panningManager.getOffset()[0],
											marker[1] + panningManager.getOffset()[1],
											Color.yellow,
									        0.4f);
			
			drawShape.setComposite(GraphicsFunctions.makeComposite(1f));
		}
	}*/
	
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
	 * @see watoydoEngine.designObjects.display.Displayable#isEqual(java.lang.String)
	 */
	@Override
	public boolean isEqual(String tag1) {
		return tag1.equals(this.tag);
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getTag()
	 */
	@Override
	public String getTag() {
		return this.tag;
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
		private final ArrayList<Polygon> cover;
		
		/**
		 * The stealth regions.
		 */
		private final ArrayList<Polygon> stealthRegions;
		
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
		public boolean isInFrame() {
			if((this.location[0] + panningManager.getOffset()[0] > DisplayManager.getInstance().getResolution()[0] ||
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
		public ArrayList<Polygon> getCover() {
			return cover;
		}
		
		/**
		 * Gets the stealth regions.
		 *
		 * @return the stealth regions
		 */
		public ArrayList<Polygon> getStealthRegions() {
			return stealthRegions;
		}
		
	}
	
}
