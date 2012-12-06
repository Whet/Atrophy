/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;

import atrophy.combat.level.LevelBlock;

/**
 * The Class Lighting.
 */
public class Lighting {

	
	/**
	 * The Class LightSource.
	 */
	public static class LightSource{
		
		/**
		 * The light location.
		 */
		protected final Point lightLocation;
		
		/**
		 * The light colour.
		 */
		protected final Color lightColour;
		
		/**
		 * The light intensity.
		 */
		protected final int lightIntensity;
		
		/**
		 * Instantiates a new light source.
		 *
		 * @param location the location
		 * @param colour the colour
		 * @param intensity the intensity
		 */
		public LightSource(Point location, Color colour, int intensity){
			this.lightLocation = location;
			this.lightColour = colour;
			this.lightIntensity = intensity;
		}
	}

	/**
	 * Apply light.
	 *
	 * @param image the image
	 * @param levelBlock the level block
	 */
	public static void applyLight(BufferedImage image, LevelBlock levelBlock) {
		/*
		LightSource light = new LightSource(new Point(10,10), new Color(165,90,20), 200);
		
		Point lightDrawPoint = light.lightLocation;
		
		double intensity = 1;
		
		int size = light.lightIntensity;
		
		for(int i = 0; i < size; i++){
			
			for(int j = 0; j < size; j++){
			
				intensity = 1 / (float)(Maths.getDistance(i,j, lightDrawPoint.x, lightDrawPoint.y) - light.lightIntensity);
				
				if(intensity > 0.4)
					intensity = 0.4;
				
				if(lightDrawPoint.x + i - (size / 2) >= image.getWidth() ||
				   lightDrawPoint.x + i - (size / 2) < 0 ||
				   lightDrawPoint.y + j - (size / 2) >= image.getHeight() ||
				   lightDrawPoint.y + j - (size / 2) < 0 ||
				   !levelBlock.getHitBox().contains(levelBlock.getLocation()[0] + i - (size /2),
						                            levelBlock.getLocation()[1] + j - (size /2))){
					
					continue;
				}
					
				image.setRGB(lightDrawPoint.x + i - (size / 2),
						     lightDrawPoint.y + j - (size / 2),
						     MapPainter.alphaColours(light.lightColour,
											         new Color(image.getRGB(lightDrawPoint.x + i - (size / 2), lightDrawPoint.y + j - (size / 2))),
											         intensity)
											         .getRGB());
			}
				
		}*/
	}
	
}
