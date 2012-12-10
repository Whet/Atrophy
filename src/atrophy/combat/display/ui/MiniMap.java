/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.Cartographer.Marker;
import atrophy.combat.level.LevelManager;

// TODO: Auto-generated Javadoc
/**
 * The Class MiniMap.
 */
public class MiniMap implements Displayable {
	
	/**
	 * The Constant MAP_BORDER.
	 */
	private static final Color MAP_BORDER = Color.white;
	
	/**
	 * The Constant DOT_SIZE.
	 */
	private static final int DOT_SIZE = 2;

	/**
	 * The Constant HEIGHT.
	 */
	private static final double HEIGHT = 120;

	/**
	 * The Constant WIDTH.
	 */
	private static final double WIDTH = 120;

	/**
	 * The Constant WIDTH_BUFFER.
	 */
	private static final int WIDTH_BUFFER = 40;

	/**
	 * The Constant HEIGHT_BUFFER.
	 */
	private static final double HEIGHT_BUFFER = 40;
	
	/**
	 * The map alpha.
	 */
	private float mapAlpha;
	
	/**
	 * The start location.
	 */
	private double[] startLocation;
	
	/**
	 * The default scale.
	 */
	private double defaultScale;
	
	/**
	 * The location.
	 */
	private double[] location;
	
	/**
	 * The visible.
	 */
	private boolean visible;
	
	/**
	 * The scale.
	 */
	private double scale;
	
	/**
	 * The size.
	 */
	private double[] size;
	
	/**
	 * The z.
	 */
	private int z;
	
	/**
	 * The draw ai.
	 */
	private ArrayList<Ai> drawAi;
	
	/**
	 * The ai colours.
	 */
	private HashMap<Ai,Color> aiColours;
	
	private AiCrowd aiCrowd;
	private PanningManager panningManager;
	private Cartographer cartographer;
	private LevelManager levelManager;
	
	/**
	 * Instantiates a new mini map.
	 */
	public MiniMap(Cartographer cartographer, AiCrowd aiCrowd, PanningManager panningManager, LevelManager levelManager){
		
		this.aiCrowd = aiCrowd;
		this.panningManager = panningManager;
		this.cartographer = cartographer;
		this.levelManager = levelManager;
		
		this.location = new double[2];
		
		this.size = new double[2];
		this.size[0] = WIDTH;
		this.size[1] = HEIGHT;
		
		drawAi = new ArrayList<Ai>();
		aiColours = new HashMap<Ai,Color>();
		
		//levelBlocks = new double[levelManager.getBlocks().length][4];
		
	}
	
	public void init() {
		visible = true;
		z = 0;
		
		this.defaultScale = WIDTH / (float)(levelManager.getCurrentLevel().getSize()[0] -levelManager.getCurrentLevel().getSize()[1]);
		
		mapAlpha = 0.4f;
		
		this.location[0] = DisplayManager.getInstance().getResolution()[0] - WIDTH - WIDTH_BUFFER;
		this.location[1] = HEIGHT_BUFFER;
		this.startLocation = this.location.clone();
		
		setDefaultScale();
	}
	
	/**
	 * Sets the default scale.
	 */
	public void setDefaultScale(){
		this.scale = this.defaultScale;
		this.setLocation(this.startLocation[0], this.startLocation[1]);
	}
	
	/**
	 * Update ai drawing.
	 */
	public void updateAiDrawing(){
		
		this.drawAi.clear();
		this.aiColours.clear();
		
		// draw ai
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActorMask(aiCrowd.getActor(i)).isVisible()){
				
				this.drawAi.add(aiCrowd.getActor(i));
				
				if(!aiCrowd.getActor(i).isDead()){
					switch(aiCrowd.getActor(i).getFaction()){
						case "Player":
							this.aiColours.put(aiCrowd.getActor(i), Color.green);
						break;
						case "Bandits":
							this.aiColours.put(aiCrowd.getActor(i), Color.red);
						break;
						case "White Vista":
							this.aiColours.put(aiCrowd.getActor(i), Color.white);
						break;
						case "Daemon":
							this.aiColours.put(aiCrowd.getActor(i), Color.cyan.darker().darker());
						break;
						case "Loner":
							this.aiColours.put(aiCrowd.getActor(i), Color.gray);
						break;
					}
				}
				else{
					this.aiColours.put(aiCrowd.getActor(i), Color.black);
				}
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#move(double, double)
	 */
	@Override
	public void move(double x, double y) {
		this.location[0] += x;
		this.location[1] += y;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#kickTween()
	 */
	@Override
	public void kickTween() {}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape) {
		
		this.drawLevelBlocks(drawShape);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		
		// draw ai
		for(int i = 0; i < this.drawAi.size(); i++){
			
			drawShape.setColor(this.aiColours.get(this.drawAi.get(i)));
			
			drawShape.fillRect((int)(this.getLocation()[0] - DOT_SIZE + this.drawAi.get(i).getLocation()[0] * this.scale), 
							   (int)(this.getLocation()[1] - DOT_SIZE + this.drawAi.get(i).getLocation()[1] * this.scale),
							         DOT_SIZE * 2, DOT_SIZE * 2);
		}
		
		// draw markers
		for(Marker marker : cartographer.getMarkers()){
			drawShape.setColor(marker.getColour());
			drawShape.fillRect((int)(this.getLocation()[0] - DOT_SIZE + (marker.getLocation()[0] * this.scale)), 
					   		   (int)(this.getLocation()[1] - DOT_SIZE + (marker.getLocation()[1] * this.scale)),
					                 DOT_SIZE * 2, DOT_SIZE * 2);
		}
		
		// draw box to show where player looking
		drawShape.setColor(Color.white);
		drawShape.drawRect((int)(this.getLocation()[0] - panningManager.getOffset()[0] * this.scale), 
				           (int)(this.getLocation()[1] - panningManager.getOffset()[1] * this.scale),
				           (int)(DisplayManager.getInstance().getResolution()[0] * this.scale),
				           (int)(DisplayManager.getInstance().getResolution()[1] * this.scale));
	}
	
	/**
	 * Draw level blocks.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawLevelBlocks(Graphics2D drawShape){
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(this.mapAlpha));
		drawShape.setColor(MAP_BORDER);
		
		for(int i = 0; i < levelManager.getCurrentLevel().getBlockCount(); i++){
			
			for(int j = 1; j < levelManager.getCurrentLevel().getBlock(i).getHitBox().npoints; j++){
				
				drawShape.drawLine((int)(this.getLocation()[0] + levelManager.getCurrentLevel().getBlock(i).getHitBox().xpoints[j - 1] * this.scale), 
								   (int)(this.getLocation()[1] + levelManager.getCurrentLevel().getBlock(i).getHitBox().ypoints[j - 1] * this.scale), 
								   (int)(this.getLocation()[0] + levelManager.getCurrentLevel().getBlock(i).getHitBox().xpoints[j] * this.scale), 
								   (int)(this.getLocation()[1] + levelManager.getCurrentLevel().getBlock(i).getHitBox().ypoints[j] * this.scale));
			}
			
			drawShape.drawLine((int)(this.getLocation()[0] + levelManager.getCurrentLevel().getBlock(i).getHitBox().xpoints[0] * this.scale), 
							   (int)(this.getLocation()[1] + levelManager.getCurrentLevel().getBlock(i).getHitBox().ypoints[0] * this.scale), 
							   (int)(this.getLocation()[0] + levelManager.getCurrentLevel().getBlock(i).getHitBox().xpoints[levelManager.getCurrentLevel().getBlock(i).getHitBox().npoints - 1] * this.scale), 
							   (int)(this.getLocation()[1] + levelManager.getCurrentLevel().getBlock(i).getHitBox().ypoints[levelManager.getCurrentLevel().getBlock(i).getHitBox().npoints - 1] * this.scale));
			
		}
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#isVisible()
	 */
	@Override
	public boolean isVisible() {
		return this.visible;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getScale()
	 */
	@Override
	public double getScale() {
		return scale;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getLocation()
	 */
	@Override
	public double[] getLocation() {
		return this.location;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getZ()
	 */
	@Override
	public int getZ() {
		return this.z;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getSize()
	 */
	@Override
	public double[] getSize() {
		return this.size;
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
	 * @see watoydoEngine.designObjects.display.Displayable#setScale(double)
	 */
	@Override
	public void setScale(double scale) {
		
		this.scale = scale;
		this.location[0] = this.startLocation[0] - (this.getSize()[0] / this.defaultScale) * scale - WIDTH_BUFFER;
		
		updateAiDrawing();
		
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setLocation(double, double)
	 */
	@Override
	public void setLocation(double x, double y) {
		this.location[0] = x;
		this.location[1] = y;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setZ(int)
	 */
	@Override
	public void setZ(int z) {
		this.z = z;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setTween(watoydoEngine.display.tweens.TweenDefinable)
	 */
	@Override
	public void setTween(TweenDefinable tween) {}
	
	/**
	 * Sets the alpha.
	 *
	 * @param alpha the new alpha
	 */
	public void setAlpha(float alpha){
		this.mapAlpha = alpha;
	}

}
