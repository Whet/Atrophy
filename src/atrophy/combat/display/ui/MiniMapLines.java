package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.level.Level;

public class MiniMapLines implements Displayable {

	private static final Color MAP_BORDER = new Color(60,60,40);
	private float mapAlpha;
	private int z;
	private double[] location;
	private boolean visible;
	private double[] size;
	private float scale;
	private Level currentLevel;

	public MiniMapLines(float scale, Level currentLevel) {
		this.scale = scale;
		this.currentLevel = currentLevel;
		this.location = new double[2];
		this.size = new double[2];
		this.mapAlpha = 0.8f;
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
		drawLevelBlocks(drawShape);
	}
	
	private void drawLevelBlocks(Graphics2D drawShape){
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(this.mapAlpha));
		drawShape.setColor(MAP_BORDER);
		
		for(int i = 0; i < currentLevel.getBlockCount(); i++){
			
			if(currentLevel.getBlock(i).isDiscovered()) {
			
				for(int j = 1; j < currentLevel.getBlock(i).getHitBox().npoints; j++){
					
					drawShape.drawLine((int)(this.getLocation()[0] + currentLevel.getBlock(i).getHitBox().xpoints[j - 1] * this.scale), 
									   (int)(this.getLocation()[1] + currentLevel.getBlock(i).getHitBox().ypoints[j - 1] * this.scale), 
									   (int)(this.getLocation()[0] + currentLevel.getBlock(i).getHitBox().xpoints[j] * this.scale), 
									   (int)(this.getLocation()[1] + currentLevel.getBlock(i).getHitBox().ypoints[j] * this.scale));
				}
				
				drawShape.drawLine((int)(this.getLocation()[0] + currentLevel.getBlock(i).getHitBox().xpoints[0] * this.scale), 
								   (int)(this.getLocation()[1] + currentLevel.getBlock(i).getHitBox().ypoints[0] * this.scale), 
								   (int)(this.getLocation()[0] + currentLevel.getBlock(i).getHitBox().xpoints[currentLevel.getBlock(i).getHitBox().npoints - 1] * this.scale), 
								   (int)(this.getLocation()[1] + currentLevel.getBlock(i).getHitBox().ypoints[currentLevel.getBlock(i).getHitBox().npoints - 1] * this.scale));
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
		return 1;
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
	public void setScale(double scale) {}

	
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
