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
import watoydoEngine.io.ReadWriter;
import watoydoEngine.utils.GraphicsFunctions;
import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.Faction;
import atrophy.combat.combatEffects.ProtectPowerEffect;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.display.MapDrawer;
import atrophy.combat.display.MapPainter;
import atrophy.combat.level.LevelBlock;

public class FloatingIcons extends Crowd{
	
	private ArrayList<double[]> stackedIconsMarkers;
	private ArrayList<VisualEffect> effects;
	private ArrayList<PendingPaint> pendingPaint;
	private boolean drawingDoors;
	
	private CombatMembersManager combatMembersManager;
	private PanningManager panningManager;
	private AiCrowd aiCrowd;
	private CombatVisualManager combatVisualManager;
	private MapDrawer mapDrawer;
	
	private BufferedImage imageBlockedDoor;
	private BufferedImage imageOpenDoor;

	private Map<String, BufferedImage> images;
	
	public FloatingIcons(CombatMembersManager combatMembersManager, PanningManager panningManager, AiCrowd aiCrowd, CombatVisualManager combatVisualManager) {
		super(true);
		
		this.combatMembersManager = combatMembersManager;
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatVisualManager = combatVisualManager;
		this.images = new HashMap<>();
		
		try{
			imageBlockedDoor = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/lockedDoor.png"));
			imageOpenDoor = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/openDoor.png"));
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
	

	public void lazyLoad(MapDrawer mapDrawer) {
		this.mapDrawer = mapDrawer;		
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape){
		drawDoors(drawShape);
		drawStackedmarkers(drawShape);
		drawEffects(drawShape);
		drawAiEffects(drawShape);
	}
	
	public void updatePending() {
		ListIterator<PendingPaint> pendingIt = pendingPaint.listIterator();
		
		if(combatVisualManager.isAllRevealed()){
			while(pendingIt.hasNext()){
				PendingPaint pender = pendingIt.next();
				MapPainter.applyImage(pender.getImage(), pender.getLocation(), pender.getAlpha(), mapDrawer);
				pendingIt.remove();
			}
			return;
		}
		
		while(pendingIt.hasNext()){
			PendingPaint pender = pendingIt.next();
			// if player can spot effect then apply it
			if(combatVisualManager.isPointInSight(pender.location, Faction.PLAYER)){
				MapPainter.applyImage(pender.getImage(), pender.getLocation(), pender.getAlpha(), mapDrawer);
				pendingIt.remove();
			}
		}
	}

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

	private void drawDoors(Graphics2D drawShape){
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.4f));
		
//		if(drawingDoors && CombatVisualManager.allRevealed){
//			drawAllDoors(drawShape);
//		}
//		else if(drawingDoors){
		if(combatMembersManager.getAlly(0) != null)
			drawVisibleDoors(drawShape);
//		}
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
	}
	
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
	
	private void drawAiEffects(Graphics2D drawShape) {

		for(Ai ai : aiCrowd.getActors()) {
			
			if(ai.hasActiveEffect(ProtectPowerEffect.NAME)) {
				drawShape.setComposite(GraphicsFunctions.makeComposite(0.5f));
				drawShape.setColor(Color.green);
				drawShape.fillOval((int)(ai.getLocation()[0] + panningManager.getOffset()[0]) + 5, (int)(ai.getLocation()[1] + panningManager.getOffset()[1]) + 5, 8, 8);
			}
				
		}
		
	}
	
	public void addStackedIconMarkers(double[] stackedIconsMarkers){
		if(stackedIconsMarkers != null){
			this.stackedIconsMarkers.add(stackedIconsMarkers);
		}
	}

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
	
	public void addEffect(VisualEffect effect){
		this.effects.add(effect);
	}
	
	public void addPendingPaint(BufferedImage image, double[] location, double alpha){
		this.pendingPaint.add(new PendingPaint(image, location, alpha));
	}
	
	private static class PendingPaint{
		
		private BufferedImage image;
		private double[] location;
		private double alpha;

		public PendingPaint(BufferedImage image, double[] location, double alpha){
			this.image = image;
			this.location = location;
			this.alpha = alpha;
		}

		public double getAlpha() {
			return this.alpha;
		}

		public BufferedImage getImage() {
			return image;
		}

		public double[] getLocation() {
			return location;
		}
	}
	
	public void setDrawingDoors(boolean b) {
		drawingDoors = b;
	}

	public boolean isDrawingDoors() {
		return drawingDoors;
	}

	public BufferedImage getImage(String image) {
		return this.images.get(image);
	}
	
}
