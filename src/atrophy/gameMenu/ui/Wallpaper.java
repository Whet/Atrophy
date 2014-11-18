package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.utils.Maths;
import watoydoEngine.workings.displayActivity.ActivePane;

public class Wallpaper implements Displayable {

	private static final int WIDTH = 45;
	private static final int HEIGHT = 45;

	private static final Color SEED_COLOUR = new Color(0, 90, 90);

	private double[] location;

	private int z;

	private boolean visible;
	private int screenWidth, screenHeight;
	
	private BufferedImage image;
	
	private static double[] LIGHT_CENTRE;
	
	private double lightSpeed;
	private Point targetLightCentre;
	
	private double[] rowOffsets;
	private double[] rowSpeeds;
	
	public Wallpaper() {
		this.location = new double[]{0,0};
		this.z = 0;
		this.visible = true;
		
		this.screenWidth = ActivePane.getInstance().getWidth();
		this.screenHeight = ActivePane.getInstance().getHeight();
		
		if(LIGHT_CENTRE == null)
			LIGHT_CENTRE = new double[]{(screenWidth * 0.75), (int) (screenHeight * 0.1)};
		
		newLightPoint();
		
		rowOffsets = new double[screenHeight / HEIGHT];
		rowSpeeds = new double[rowOffsets.length];
		
		for(int i = 0; i < rowOffsets.length; i++) {
			rowOffsets[i] = new Random().nextInt(10);
			rowSpeeds[i] = new Random().nextDouble() / 2;
		}
	}
	
	private void newLightPoint() {
		Random random = new Random();
		do {
			targetLightCentre = new Point(random.nextInt(screenWidth), random.nextInt(screenHeight));
		}while(Maths.getDistance(LIGHT_CENTRE[0], LIGHT_CENTRE[1], targetLightCentre.x, targetLightCentre.y) < 100);
		lightSpeed = Math.random() + 0.1;
	}
	
	@Override
	public void move(double x, double y) {
		this.location[0] += x;
		this.location[1] += y;
	}

	@Override
	public void kickTween() {
		
		double rads = Maths.getRads(LIGHT_CENTRE[0], LIGHT_CENTRE[1], targetLightCentre.x, targetLightCentre.y);
		
		LIGHT_CENTRE[0] += Math.cos(rads) * lightSpeed;
		LIGHT_CENTRE[1] += Math.sin(rads) * lightSpeed;
		
		if(Maths.getDistance(LIGHT_CENTRE[0], LIGHT_CENTRE[1], targetLightCentre.x, targetLightCentre.y) < 10)
			newLightPoint();
		
		for(int i = 0; i < rowOffsets.length; i++) {
			rowOffsets[i] += rowSpeeds[i];
			
			if(rowOffsets[i] > WIDTH)
				rowOffsets[i] -= WIDTH;
		}
	}

	@Override
	public void drawMethod(Graphics2D drawShape) {

		makeImage();
		
		drawShape.drawImage(image, new AffineTransform(), null);

	}

	private void makeImage() {
		float radius = screenWidth;
		
		double distanceToCentre =  Maths.getDistance(LIGHT_CENTRE[0], LIGHT_CENTRE[1], screenWidth / 2, screenHeight / 2);
		float ratioToCentre = (float) ((1 -  (distanceToCentre / (screenWidth))) * 0.8);
		
		float[] dist = new float[]{0.0f, 0.2f * ratioToCentre, 1.0f * ratioToCentre};
		Color[] colors = {SEED_COLOUR, new Color(0, 60, 60), new Color(0, 0, 0)};
		
		RadialGradientPaint gp = new RadialGradientPaint(new Point((int)LIGHT_CENTRE[0], (int)LIGHT_CENTRE[1]), radius, dist, colors);
		BufferedImage image = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D imageGraphics = image.createGraphics();
		imageGraphics.setPaint(gp);
		imageGraphics.fillRect(0, 0, screenWidth, screenHeight);
		
		BufferedImage pixelImage = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB); 
		Graphics2D pixelGraphics = pixelImage.createGraphics();
		
		for(int i = 0; i < image.getHeight(); i+= HEIGHT) {
			for(int j = 0; j < image.getWidth(); j+= WIDTH) {
				
				Color pixelColour;
				
				if(j  + (int)rowOffsets[i / HEIGHT] < image.getWidth())
					 pixelColour = new Color(image.getRGB(j  + (int)rowOffsets[i / HEIGHT], i));
				else
					pixelColour = new Color(image.getRGB(image.getWidth() - 1, i));
				
				pixelGraphics.setColor(pixelColour);
				pixelGraphics.fillRect(j + (int)rowOffsets[i / HEIGHT], i, WIDTH, HEIGHT);
				
			}
			
			Color pixelColour = new Color(image.getRGB(0, i));
			pixelGraphics.setColor(pixelColour);
			pixelGraphics.fillRect(0, i, (int)rowOffsets[i / HEIGHT], HEIGHT);
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
