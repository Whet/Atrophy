/*
 * 
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.fonts.FontList;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.gubbinz.Maths;
import watoydoEngine.io.ReadWriter;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.display.LineDrawer;
import atrophy.combat.display.MapPainter;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.levelAssets.LevelAsset;

// TODO: Auto-generated Javadoc
/**
 * The Class FloatingIcons.
 */
public class FloatingIcons extends Crowd{
	
	/**
	 * The stacked icons markers.
	 */
	private ArrayList<double[]> stackedIconsMarkers;
	
	/**
	 * The effects.
	 */
	private ArrayList<VisualEffect> effects;
	
	/**
	 * The pending paint.
	 */
	private ArrayList<PendingPaint> pendingPaint;
	
	/**
	 * The drawing doors.
	 */
	private boolean drawingDoors;
	
	private CombatMembersManager combatMembersManager;
	private PanningManager panningManager;
	private AiCrowd aiCrowd;
	private CombatVisualManager combatVisualManager;
	private LineDrawer lineDrawer;
	private LevelManager levelManager;
	private CombatInorganicManager combatInorganicManager;
	
	private BufferedImage imageBlockedDoor;
	private BufferedImage imageOpenDoor;

	private Map<String, BufferedImage> images;
	
	/**
	 * Instantiates a new floating icons.
	 * @param lineDrawer 
	 * @param combatInorganicManager 
	 * @param levelManager 
	 */
	public FloatingIcons(CombatMembersManager combatMembersManager, PanningManager panningManager, AiCrowd aiCrowd, CombatVisualManager combatVisualManager, CombatInorganicManager combatInorganicManager, LevelManager levelManager) {
		super(true);
		
		this.combatMembersManager = combatMembersManager;
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatVisualManager = combatVisualManager;
		this.combatInorganicManager = combatInorganicManager;
		this.levelManager = levelManager;
		this.images = new HashMap<>();
		
		try{
			imageBlockedDoor = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/lockedDoor.png"));
			imageOpenDoor = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/openDoor.png"));
			
			images.put(GrenadeItem.NAME, ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/items/bomb.png")));
			images.put(StunGrenadeItem.NAME, ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/items/stunBomb.png")));
		}
		catch(IOException ioExcept){
			System.err.println("Could not load FloatingIcons image. Terminating.");
			System.exit(-1);
		}
		
		stackedIconsMarkers = new ArrayList<double[]>();
		effects = new ArrayList<VisualEffect>();
		pendingPaint = new ArrayList<PendingPaint>();
		drawingDoors = true;
		
	}
	

	public void lazyLoad(LineDrawer lineDrawer) {
		this.lineDrawer = lineDrawer;		
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape){
		drawDoors(drawShape);
		drawAssets(drawShape);
		drawStackedmarkers(drawShape);
		drawEffects(drawShape);
	}
	
	/**
	 * Update pending.
	 */
	public void updatePending() {
		ListIterator<PendingPaint> pendingIt = pendingPaint.listIterator();
		
		if(combatVisualManager.isAllRevealed()){
			while(pendingIt.hasNext()){
				PendingPaint pender = pendingIt.next();
				MapPainter.applyImage(pender.getImage(), pender.getLocation(), pender.getAlpha(), lineDrawer);
				pendingIt.remove();
			}
			return;
		}
		
		while(pendingIt.hasNext()){
			PendingPaint pender = pendingIt.next();
			// if player can spot effect then apply it
			if(combatVisualManager.isPointInSight(pender.location, "Player")){
				MapPainter.applyImage(pender.getImage(), pender.getLocation(), pender.getAlpha(), lineDrawer);
				pendingIt.remove();
			}
		}
	}

	/**
	 * Draw effects.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawEffects(Graphics2D drawShape) {
		ListIterator<VisualEffect> effectIt = this.effects.listIterator();
		
		while(effectIt.hasNext()){
			VisualEffect effect = effectIt.next();
			effect.drawMethod(drawShape);
			effect.tick();
			
			if(effect.isDead()){
				effectIt.remove();
			}
		}
	}

	/**
	 * Draw doors.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawDoors(Graphics2D drawShape){
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.5f));
		
//		if(drawingDoors && CombatVisualManager.allRevealed){
//			drawAllDoors(drawShape);
//		}
//		else if(drawingDoors){
		if(combatMembersManager.getAlly(0) != null)
			drawVisibleDoors(drawShape);
//		}
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
	}
	
	/**
	 * Draw visible doors.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawVisibleDoors(Graphics2D drawShape){
		
		ArrayList<LevelBlock> drawnRooms = new ArrayList<LevelBlock>(combatMembersManager.getAllyCount()); 
		
		for(int i = 0; i < combatMembersManager.getAllyCount(); i++){
			if(!drawnRooms.contains(combatMembersManager.getAlly(i).getLevelBlock())){
				for(int j = 0; j < combatMembersManager.getAlly(i).getLevelBlock().getPortalCount(); j++){
					if(!combatMembersManager.getAlly(i).getLevelBlock().getPortal(j).canUse()){
						this.setLocation(combatMembersManager.getAlly(i).getLevelBlock().getPortal(j).getLocation()[0] +
										 panningManager.getOffset()[0] - this.imageBlockedDoor.getWidth() * 0.5, 
		                                 
										 combatMembersManager.getAlly(i).getLevelBlock().getPortal(j).getLocation()[1] +
		                                 panningManager.getOffset()[1] - this.imageBlockedDoor.getHeight() * 0.5);

						drawShape.drawImage(this.imageBlockedDoor,this.getTransformationForDrawing(),null);
					}
					else{
						this.setLocation(combatMembersManager.getAlly(i).getLevelBlock().getPortal(j).getLocation()[0] +
										 panningManager.getOffset()[0] - this.imageOpenDoor.getWidth() * 0.5, 
                                
										 combatMembersManager.getAlly(i).getLevelBlock().getPortal(j).getLocation()[1] +
										 panningManager.getOffset()[1] - this.imageOpenDoor.getHeight() * 0.5);

						drawShape.drawImage(this.imageOpenDoor,this.getTransformationForDrawing(),null);
					}
				}
			}
		}
	}
	
	
	/**
	 * Draw assets.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawAssets(Graphics2D drawShape){
		
		LevelAsset asset = null;
		
		for(int i = 0; i < combatInorganicManager.getLevelAssets().size(); i++){
			
			asset = combatInorganicManager.getLevelAsset(i);
			
			for(int j = 0; j < combatMembersManager.getAllyCount(); j++){
				// only draw if in same room as a player
				if(combatMembersManager.getAlly(j) == null ||
				   levelManager.getBlock(asset.getLocation()) == combatMembersManager.getAlly(j).getLevelBlock()){

					double[] location = {asset.getLocation()[0] +
										 panningManager.getOffset()[0] - asset.getImage().getWidth() * 0.5,
										 asset.getLocation()[1] +
										 panningManager.getOffset()[1] - asset.getImage().getWidth() * 0.5};
					
					this.setLocation(location[0],location[1]);
		
					drawShape.drawImage(asset.getImage(),this.getTransformationForDrawing(),null);
					
					drawShape.setFont(FontList.AUD14);
					drawShape.setColor(Color.yellow);
					drawShape.drawString(Integer.toString(asset.getLife()),(int)location[0],(int)location[1]);
					
					break;
				}
			}
		}
	}
	
	/**
	 * Draw stackedmarkers.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawStackedmarkers(Graphics2D drawShape){
		drawShape.setFont(FontList.AUD14);
		for(int i = 0; i < this.stackedIconsMarkers.size(); i++){
			drawShape.setComposite(GraphicsFunctions.makeComposite(0.26f));
			drawShape.setColor(Color.red);
			drawShape.fillRect((int)(stackedIconsMarkers.get(i)[0] - 12.5 + panningManager.getOffset()[0]),
					           (int)(stackedIconsMarkers.get(i)[1] - 12.5 + panningManager.getOffset()[1]), 25, 25);
			
			drawShape.drawRect((int)(stackedIconsMarkers.get(i)[0] - 12.5 + panningManager.getOffset()[0]),
							   (int)(stackedIconsMarkers.get(i)[1] - 12.5 + panningManager.getOffset()[1]), 25, 25);
			
			drawShape.setColor(Color.white);
			
			
			
			drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
			drawShape.drawString(Integer.toString((int)this.stackedIconsMarkers.get(i)[2]), 
					                            (int)(stackedIconsMarkers.get(i)[0] + panningManager.getOffset()[0] - 7.5), 
					                            (int)(stackedIconsMarkers.get(i)[1] + panningManager.getOffset()[1] + 7.5));
			
		}
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
	}
	
	/**
	 * Adds the stacked icon markers.
	 *
	 * @param stackedIconsMarkers the stacked icons markers
	 */
	public void addStackedIconMarkers(double[] stackedIconsMarkers){
		if(stackedIconsMarkers != null){
			this.stackedIconsMarkers.add(stackedIconsMarkers);
		}
	}

	/**
	 * Update overlapping icons.
	 */
	public void updateOverlappingIcons() {
		
		this.stackedIconsMarkers.clear();
		
		ArrayList<AiImage> overlappingIcons = new ArrayList<AiImage>();
		
		double[] overlapping;
		
		for(AiImage mask : aiCrowd.getMasks()){
			if(mask.isVisible() && !overlappingIcons.contains(mask)){
				overlapping = null;
				
				for(AiImage mask1 : aiCrowd.getMasks()){
					if(mask1.isVisible() && mask != mask1 && Maths.getDistance(mask.getAi().getLocation(), mask1.getAi().getLocation()) <= 35 &&
					   !overlappingIcons.contains(mask1)){
						if(overlapping == null){
							overlapping = new double[3];
							overlapping[0] = mask.getAi().getLocation()[0];
							overlapping[1] = mask.getAi().getLocation()[1];
							overlapping[2] = 1;
							overlappingIcons.add(mask);
						}
						overlapping[2]++;
						overlappingIcons.add(mask1);
					}
				}
				this.addStackedIconMarkers(overlapping);
			}
		}
	}
	
	/**
	 * Adds the effect.
	 *
	 * @param effect the effect
	 */
	public void addEffect(VisualEffect effect){
		this.effects.add(effect);
	}
	
	/**
	 * Adds the pending paint.
	 *
	 * @param image the image
	 * @param location the location
	 * @param alpha the alpha
	 */
	public void addPendingPaint(BufferedImage image, double[] location, double alpha){
		this.pendingPaint.add(new PendingPaint(image, location, alpha));
	}
	
	/**
	 * The Class PendingPaint.
	 */
	private static class PendingPaint{
		
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
		private double alpha;
		/*
		public PendingPaint(BufferedImage image, double[] location){
			this.image = image;
			this.location = location;
			alpha = 1;
		}*/
		
		/**
		 * Instantiates a new pending paint.
		 *
		 * @param image the image
		 * @param location the location
		 * @param alpha the alpha
		 */
		public PendingPaint(BufferedImage image, double[] location, double alpha){
			this.image = image;
			this.location = location;
			this.alpha = alpha;
		}

		/**
		 * Gets the alpha.
		 *
		 * @return the alpha
		 */
		public double getAlpha() {
			return this.alpha;
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
	}
	
	/**
	 * Sets the drawing doors.
	 *
	 * @param b the new drawing doors
	 */
	public void setDrawingDoors(boolean b) {
		drawingDoors = b;
	}

	/**
	 * Checks if is drawing doors.
	 *
	 * @return true, if is drawing doors
	 */
	public boolean isDrawingDoors() {
		return drawingDoors;
	}


	public BufferedImage getImage(String image) {
		return this.images.get(image);
	}
	
}
