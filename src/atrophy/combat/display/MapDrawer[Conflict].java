package atrophy.combat.display;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.utils.GraphicsFunctions;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelBlockGrid;
import atrophy.combat.level.LevelBlockGrid.GridBlock;
import atrophy.combat.level.LevelManager;


public class MapDrawer implements Displayable {

	private static final Color[] RADIATION_COLOURS = new Color[]{Color.white, Color.gray, Color.black, Color.yellow, new Color(139,60,19)};
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
	private CombatUiManager combatUiManager;
	
	public MapDrawer(LevelManager levelManager, PanningManager panningManager, AiCrowd aiCrowd, CombatVisualManager combatVisualManager, CombatUiManager combatUiManager) {
		this.levelManager = levelManager;
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatVisualManager = combatVisualManager;
		this.combatUiManager = combatUiManager;
		this.visible = true;
		this.z = 0;
		
		this.makeMap();
	}
	
	private void makeMap() {
			
		BufferedImage[] floorTextures = new BufferedImage[4];
		BufferedImage[] floorTextures1 = new BufferedImage[4];
		// 1 - Not a complete block / Is a clipped block
		// 2 - Complete block
		// 3 - Door block
		// 4 - PathBlock
		// 5 - OutOfSight
		int[] floorTextInfo = new int[4];
		int[] floorTextInfo1 = new int[4];
		try{
			floorTextures[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor1.png"));
			floorTextInfo[0] = 1;
			
			floorTextures[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor2.png"));
			floorTextInfo[1] = 2;
			
			floorTextures[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor3.png"));
			floorTextInfo[2] = 3;
			
			floorTextures[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor4.png"));
			floorTextInfo[3] = 4;
			
			floorTextures1[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor5.png"));
			floorTextInfo1[0] = 1;
			
			floorTextures1[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor6.png"));
			floorTextInfo1[1] = 2;
			
			floorTextures1[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor7.png"));
			floorTextInfo1[2] = 3;
			
			floorTextures1[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/floors/floor8.png"));
			floorTextInfo1[3] = 4;
		}
		catch(IOException e){
			System.err.println("No Floor textures");
			System.exit(-1);
		}
		
		BufferedImage[] debrisImages = new BufferedImage[4];
		
		try{
			debrisImages[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/debris1.png"));
			debrisImages[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/debris2.png"));
			debrisImages[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/debris3.png"));
			debrisImages[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/debris4.png"));
		}
		catch(IOException e){
			System.err.println("No debris textures");
			System.exit(-1);
		}
		
		int mapNumber = 0;
		map = new MapDrawBlock[levelManager.getCurrentLevel().getBlockCount()];
		
		for(LevelBlock levelBlock : levelManager.getCurrentLevel().getBlocks()){
		
			map[mapNumber] = new MapDrawBlock(panningManager, new BufferedImage((int)levelBlock.getSize()[0],(int)levelBlock.getSize()[1], BufferedImage.TYPE_INT_ARGB),levelBlock, levelBlock.getTexture());
			
			if(!levelBlock.getTexture().equals(MapTextures.SPACE)) {
			
				MapPainter.applyMapTexture(floorTextures, floorTextInfo, levelBlock, map[mapNumber].getColourImage());
				MapPainter.applyMapTexture(floorTextures1, floorTextInfo1, levelBlock, map[mapNumber].getGreyImage());
				
	//			// Draw random debris
				double debrisArea = levelBlock.getHitBox().getBounds2D().getWidth() * levelBlock.getHitBox().getBounds2D().getHeight();
				for(int i = 0; i < Math.floor(debrisArea / 200000); i++) {
					
					
					int debris = new Random().nextInt(debrisImages.length);
					
					MapPainter.applyImage(debrisImages[debris], map[mapNumber], levelManager.randomInPosition(levelBlock));
				}
				
				map[mapNumber].drawRegions(levelBlock);
				
				// Draw random glowsticks
				double glowstickArea = levelBlock.getHitBox().getBounds2D().getWidth() * levelBlock.getHitBox().getBounds2D().getHeight();
				for(int i = 0; i < Math.floor(glowstickArea / 100000); i++) {
					try {
						MapPainter.applyImage(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/texture/glowSticks1.png")), map[mapNumber], levelManager.randomInPosition(levelBlock));
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
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
		private BufferedImage colourImage;
		private BufferedImage greyImage;
		private double[] location;
		private float alpha;
		private final List<Polygon> cover;
		private final List<Polygon> stealthRegions;
		private final int levelBlockCode;
		private PanningManager panningManager;
		private MapTextures texture;

		public MapDrawBlock(PanningManager panningManager, BufferedImage bufferedImage, LevelBlock levelBlock, MapTextures texture) {
			this.colourImage = bufferedImage;
			this.greyImage = new BufferedImage(colourImage.getWidth(), colourImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
			
			this.hitbox = levelBlock.getHitBox();
			this.location = levelBlock.getLocation().clone();
			this.alpha = 1.0f;
			this.texture = texture;
			
			this.cover = levelBlock.getCover();
			this.stealthRegions = levelBlock.getStealthRegion();
			
			levelBlockCode = levelBlock.getCode();
			
			this.panningManager = panningManager;
		}
		
		public boolean isVisible() {
			if(alpha == 0 ||
			   (this.location[0] + panningManager.getOffset()[0] > DisplayManager.getInstance().getResolution()[0] ||
			    this.location[1] + panningManager.getOffset()[1] > DisplayManager.getInstance().getResolution()[1]) ||
			   (this.location[0] + colourImage.getWidth() + panningManager.getOffset()[0] < 0 ||
			    this.location[1] + colourImage.getHeight()+  panningManager.getOffset()[1] < 0)){
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
			
			Random rand = new Random(Long.valueOf(block.getCode()));
			
			for(int i = 0; i < block.getCover().size(); i++){
				int[] coverRegions = new int[10];
				
				for(int j = 0; j < coverRegions.length; j++) {
					coverRegions[j] = rand.nextInt(COVER.length);
				}
				
				for(int k = 0; k < coverRegions.length; k++) {
					MapPainter.applyImage(COVER[coverRegions[k]],
										  this.getColourImage(), block.getCover().get(i),
										  new int[] {COVER[coverRegions[k]].getWidth() / (k + 1), k});
				}
			}
			
			// Make sure stash holes are drawn on top of the cover!
			for(int i = 0; i < block.getStealthRegion().size(); i++){
				MapPainter.applyImage(STASH_HOLES[new Random().nextInt(STASH_HOLES.length)],
									  this,
									  new double[] {block.getStealthRegion().get(i).getBounds2D().getCenterX() + block.getLocation()[0],
									                block.getStealthRegion().get(i).getBounds2D().getCenterY() + block.getLocation()[1]});

				
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

		public BufferedImage getColourImage() {
			return colourImage;
		}
		
		public BufferedImage getGreyImage() {
			return greyImage;
		}

		public double[] getLocation() {
			return location;
		}
		
		public double[] getLocationCentre() {
			double[] centre = {hitbox.getBounds2D().getCenterX(), hitbox.getBounds2D().getCenterY()};
			return centre;
		}

		public void setImage(BufferedImage image) {
			this.colourImage = image;
		}

		public void setLocation(double[] location) {
			this.location = location;
		}
		
		public void flush(){
			this.colourImage.flush();
		}
		
		public List<Polygon> getCover() {
			return cover;
		}
		
		public List<Polygon> getStealthRegions() {
			return stealthRegions;
		}

		public MapTextures getTexture() {
			return this.texture;
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
				
				if(!mapDraw.getTexture().equals(MapTextures.SPACE)) {
					drawShape.drawImage(mapDraw.getGreyImage(), null, null);
				}
				
				drawShape.setColor(COVER_COLOUR);
				drawShape.setComposite(GraphicsFunctions.makeComposite(0.4f));
				
				for(int i = 0; i < mapDraw.getCover().size(); i++){
					drawShape.drawPolygon(mapDraw.getCover().get(i));
				}
				
				drawShape.setColor(STEALTH_COLOUR);
				for(int i = 0; i < mapDraw.getStealthRegions().size(); i++){
					drawShape.drawPolygon(mapDraw.getStealthRegions().get(i));
				}
			}
		}
		
		panTransform.setToTranslation(0, 0);
		drawShape.setTransform(panTransform);
		
		Polygon lightPolygon = combatUiManager.getTorchDrawer().getLightPolygon();
		Polygon trueSightPolygon = new Polygon(lightPolygon.xpoints, lightPolygon.ypoints, lightPolygon.npoints);
		trueSightPolygon.translate((int)panningManager.getOffset()[0], (int)panningManager.getOffset()[1]);
		drawShape.setClip(trueSightPolygon);
		
		for(MapDrawBlock mapDraw : map){
			if(mapDraw.isVisible()){
				
				drawShape.setComposite(GraphicsFunctions.makeComposite(mapDraw.getAlpha()));
				
				panTransform.setToTranslation((int)panningManager.getOffset()[0] + mapDraw.getLocation()[0], 
						                      (int)panningManager.getOffset()[1] + mapDraw.getLocation()[1]);
				
				drawShape.setTransform(panTransform);
				
				if(mapDraw.getTexture().equals(MapTextures.SPACE)) {
					
					radiationEffect(drawShape, mapDraw);
				}
				else {
					drawShape.drawImage(mapDraw.getColourImage(), null, null);
				}
				
				if(mapDraw.getTexture().equals(MapTextures.RAD_METAL)) {
					radiationEffect(drawShape, mapDraw);
				}
				
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
			// Debug
//			else {
//				panTransform.setToTranslation((int)panningManager.getOffset()[0] + mapDraw.getLocation()[0], 
//	                      (int)panningManager.getOffset()[1] + mapDraw.getLocation()[1]);
//
//				drawShape.setTransform(panTransform);
//
//				drawPathGrid(drawShape, levelManager.getBlock(mapDraw.levelBlockCode).getLevelBlockGrid(), mapDraw.getLocation()[0], mapDraw.getLocation()[1]);
//			}
		}
		
		drawShape.setTransform(new AffineTransform());
		drawShape.setClip(null);
	}
	
	private void radiationEffect(Graphics2D drawShape, MapDrawBlock mapDraw) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.2f));
		
		for(int i = 0; i < mapDraw.getHitbox().getBounds2D().getWidth() * mapDraw.getHitbox().getBounds2D().getHeight() / 100; i++) {
				
			int[] location = new int[]{0,0};
			
			location[0] += new Random().nextInt((int) mapDraw.getHitbox().getBounds2D().getWidth());
			location[1] += new Random().nextInt((int) mapDraw.getHitbox().getBounds2D().getHeight());
			
			if(!mapDraw.getHitbox().contains(location[0] + mapDraw.getLocation()[0], location[1] + mapDraw.getLocation()[1]))
				continue;
				
			drawShape.setColor(RADIATION_COLOURS[new Random().nextInt(RADIATION_COLOURS.length)]);
			
			int size = new Random().nextInt(3);
			
			drawShape.fillOval(location[0], location[1], size, size);
		}
	}

	private void drawPathGrid(Graphics2D drawShape, LevelBlockGrid levelBlockGrid, double x, double y) {
		drawShape.setColor(Color.white);
	    for(int i = 0; i < levelBlockGrid.getBlocks().size(); i++){
	        for(int j = 0; j < levelBlockGrid.getBlocks().get(i).size(); j++){
	            
	            GridBlock gridBlock = levelBlockGrid.getBlocks().get(i).get(j);
	            
                drawShape.drawRect((int)(gridBlock.x - x), (int)(gridBlock.y - y), (int)gridBlock.width, (int)gridBlock.height);
	            
	        }
	    }
	    
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
