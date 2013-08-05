package atrophy.combat.display;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
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
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;


public class MapDrawer implements Displayable {

	private static final Color COVER_COLOUR = Color.white;
	private static final Color STEALTH_COLOUR = Color.gray;
	private static final float OCCUPIED_ALPHA = 1.0f;
	private static final float PEEKING_ALPHA = 0.3f;
	
	private MapDrawBlock map[];
	
	private boolean visible;
	private int z;

	private AiCrowd aiCrowd;
	private CombatVisualManager combatVisualManager;
	private LevelManager levelManager;
	private PanningManager panningManager;
	
	public MapDrawer(LevelManager levelManager, PanningManager panningManager, AiCrowd aiCrowd, CombatVisualManager combatVisualManager) {
		this.levelManager = levelManager;
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatVisualManager = combatVisualManager;
		this.visible = true;
		this.z = 0;
		
		this.makeMap();
	}
	
	private void makeMap() {
			
		BufferedImage[] floorTextures = new BufferedImage[4];
		// 0 - Not a complete block / Is a clipped block
		// 1 - Complete block
		// 2 - Door block
		// 3 - PathBlock
		int[] floorTextInfo = new int[4];
		try{
			floorTextures[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor1.png"));
			floorTextInfo[0] = 1;
			
			floorTextures[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor2.png"));
			floorTextInfo[1] = 2;
			
			floorTextures[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor3.png"));
			floorTextInfo[2] = 3;
			
			floorTextures[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor4.png"));
			floorTextInfo[3] = 4;
		}
		catch(IOException e){
			System.err.println("No Floor textures");
			System.exit(-1);
		}
		
		int mapNumber = 0;
		map = new MapDrawBlock[levelManager.getCurrentLevel().getBlockCount()];
		
		for(LevelBlock levelBlock : levelManager.getCurrentLevel().getBlocks()){
		
			map[mapNumber] = new MapDrawBlock(panningManager, new BufferedImage((int)levelBlock.getSize()[0],(int)levelBlock.getSize()[1], BufferedImage.TYPE_INT_ARGB),levelBlock);
			
			MapPainter.applyMapTexture(floorTextures, floorTextInfo, levelBlock, map[mapNumber].getImage());
			
			map[mapNumber].drawRegions(levelBlock);
			
			mapNumber++;
		}
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

	public void updateAlphas(){
		Set<LevelBlock> occupiedRooms = new HashSet<LevelBlock>();
		Set<LevelBlock> connectedRooms = new HashSet<LevelBlock>();
		
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
			LevelBlock block = levelManager.getBlock(i);
			
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
	
	public void drawMethod(Graphics2D drawShape) {
		
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
