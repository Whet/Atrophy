package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.workings.displayActivity.ActivePane;

public class Wallpaper implements Displayable {

	private static final int WIDTH = 20;
	private static final int HEIGHT = 20;

	private static final Color SEED_COLOUR = new Color(0, 90, 90);

	private double[] location;

	private int z;

	private boolean visible;
	private int screenWidth, screenHeight;
	private long seed;
	
	private BufferedImage image;
	
	public Wallpaper(long seed) {
		this.location = new double[]{0,0};
		this.z = 0;
		this.visible = true;
		
		this.screenWidth = ActivePane.getInstance().getWidth();
		this.screenHeight = ActivePane.getInstance().getHeight();
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

		if(image == null)
			makeImage();
		
		drawShape.drawImage(image, new AffineTransform(), null);

	}

	private void makeImage() {
		Point2D center = new Point((int) (screenWidth * 0.75), (int) (screenHeight * 0.1));
		float radius = screenWidth;
		float[] dist = {0.0f, 0.4f, 0.9f};
		Color[] colors = {SEED_COLOUR, new Color(20, 20, 20), new Color(0, 0, 0)};
		
		RadialGradientPaint gp = new RadialGradientPaint(center, radius, dist, colors);
		BufferedImage image = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D imageGraphics = image.createGraphics();
		((Graphics2D) imageGraphics).setPaint(gp);
		imageGraphics.fillRect(0, 0, screenWidth, screenHeight);
		
		BufferedImage pixelImage = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB); 
		Graphics2D pixelGraphics = pixelImage.createGraphics();
		
		for(int i = 0; i < image.getHeight(); i+= HEIGHT) {
			for(int j = 0; j < image.getWidth(); j+= WIDTH) {
				
				Color pixelColour = new Color(image.getRGB(j, i));
				
				pixelGraphics.setColor(pixelColour);
				pixelGraphics.fillRect(j, i, WIDTH, HEIGHT);
				
			}
		}
		
		this.image = pixelImage;
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
