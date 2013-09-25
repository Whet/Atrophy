package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.workings.DisplayManager;

public class Wallpaper implements Displayable {

	private static final int WIDTH = 30;
	private static final int HEIGHT = 10;

	private static final Color SEED_COLOUR = new Color(10,10,10);

	private double[] location;

	private int z;

	private boolean visible;
	private int screenWidth, screenHeight;
	private long seed;
	
	public Wallpaper(long seed) {
		this.location = new double[]{0,0};
		this.z = 0;
		this.visible = true;
		
		this.screenWidth = DisplayManager.getInstance().getResolution()[0];
		this.screenHeight = DisplayManager.getInstance().getResolution()[1];
		this.seed = seed;
	}
	
	@Override
	public void move(double x, double y) {
		this.location[0] += x;
		this.location[1] += y;
	}

	@Override
	public void kickTween() {
		
	}

	@Override
	public void drawMethod(Graphics2D drawShape) {
		Color dynamicColour = SEED_COLOUR;
		Random random = new Random(seed);
		
		for(int i = 0; i < screenHeight; i+= HEIGHT) {
			for(int j = 0; j < screenWidth; j+= WIDTH * 2) {
				double mod = random.nextDouble();
				Color color = new Color((int)(dynamicColour.getRed() - (5 * mod)), (int)(dynamicColour.getGreen() - (5 * mod)), (int)(dynamicColour.getBlue() - (5 * mod)));
				drawShape.setColor(color);
				drawShape.fillRect(j, i, WIDTH, HEIGHT);
				drawShape.setColor(color.darker());
				drawShape.fillRect(j + WIDTH, i, WIDTH, HEIGHT);
			}
		}
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
		return location;
	}

	@Override
	public int getZ() {
		return this.z;
	}

	@Override
	public double[] getSize() {
		return null;
	}

	@Override
	public int compareTo(Displayable otherDisplayable) {
		if(otherDisplayable.getZ() > this.getZ()){
			 return -1;
		}
		else if(otherDisplayable.getZ() < this.getZ()){
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
	public void setTween(TweenDefinable tween) {
		
	}
	
}
