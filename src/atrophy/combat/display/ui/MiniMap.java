/*
 * 
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
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.Cartographer.Marker;
import atrophy.combat.level.LevelManager;


public class MiniMap implements Displayable {
	
	
	private static final Color MAP_BORDER = Color.white;
	
	
	private static final int DOT_SIZE = 2;
	private static final double HEIGHT = 120;
	private static final double WIDTH = 120;
	private static final int WIDTH_BUFFER = 40;
	private static final double HEIGHT_BUFFER = 40;
	
	private float mapAlpha;
	private double[] startLocation;
	private double defaultScale;
	private double[] location;
	private boolean visible;
	private double scale;
	private double[] size;
	private int z;
	private ArrayList<Ai> drawAi;
	private HashMap<Ai,Color> aiColours;
	
	private AiCrowd aiCrowd;
	private PanningManager panningManager;
	private Cartographer cartographer;
	private LevelManager levelManager;
	
	
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
	
	
	public void setDefaultScale(){
		this.scale = this.defaultScale;
		this.setLocation(this.startLocation[0], this.startLocation[1]);
	}
	
	
	public void updateAiDrawing(){
		
		this.drawAi.clear();
		this.aiColours.clear();
		
		// draw ai
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActor(i).getFaction().equals(AiGenerator.PLAYER) || aiCrowd.getActorMask(aiCrowd.getActor(i)).isVisible()){
				
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
	
	
	@Override
	public void move(double x, double y) {
		this.location[0] += x;
		this.location[1] += y;
	}

	
	@Override
	public void kickTween() {}

	
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
	
	
	private void drawLevelBlocks(Graphics2D drawShape){
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(this.mapAlpha));
		drawShape.setColor(MAP_BORDER);
		
		for(int i = 0; i < levelManager.getCurrentLevel().getBlockCount(); i++){
			
			if(levelManager.getBlock(i).isDiscovered()) {
			
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
			
		}
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		
	}

	
	@Override
	public boolean isVisible() {
		return this.visible;
	}

	
	@Override
	public double getScale() {
		return scale;
	}

	
	@Override
	public double[] getLocation() {
		return this.location;
	}

	
	@Override
	public int getZ() {
		return this.z;
	}

	
	@Override
	public double[] getSize() {
		return this.size;
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
	public void setScale(double scale) {
		
		this.scale = scale;
		this.location[0] = this.startLocation[0] - (this.getSize()[0] / this.defaultScale) * scale - WIDTH_BUFFER;
		
		updateAiDrawing();
		
	}

	
	@Override
	public void setLocation(double x, double y) {
		this.location[0] = x;
		this.location[1] = y;
	}

	
	@Override
	public void setZ(int z) {
		this.z = z;
	}

	
	@Override
	public void setTween(TweenDefinable tween) {}
	
	
	public void setAlpha(float alpha){
		this.mapAlpha = alpha;
	}

}
