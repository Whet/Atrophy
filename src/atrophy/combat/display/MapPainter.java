/*
 * 
 */
package atrophy.combat.display;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.level.LevelBlock;

/**
 * The Class MapPainter.
 */
public class MapPainter {
	
	/**
	 * The BLOO d_ textures.
	 */
//	public static BufferedImage[] BLOOD_TEXTURES;
	
	/**
	 * The EFFEC t_ scars.
	 */
	public static BufferedImage[] EFFECT_SCARS;
	
	/**
	 * Load textures.
	 */
	public static void loadTextures(){
		
//		BLOOD_TEXTURES = new BufferedImage[4];
		EFFECT_SCARS = new BufferedImage[1];
		
		try {
//			BLOOD_TEXTURES[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/effects/blood0.png"));
//			BLOOD_TEXTURES[1] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/effects/blood1.png"));
//			BLOOD_TEXTURES[2] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/effects/blood2.png"));
//			BLOOD_TEXTURES[3] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/effects/blood3.png"));
			
			EFFECT_SCARS[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/effects/explosion.png"));
			
		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	/**
	 * Removes the textures.
	 */
//	public static void removeTextures(){
//		for(int i = 0; i < BLOOD_TEXTURES.length; i++){
//			BLOOD_TEXTURES[i].flush();
//		}
//		BLOOD_TEXTURES = null;
//		for(int i = 0; i < EFFECT_SCARS.length; i++){
//			EFFECT_SCARS[i].flush();
//		}
//		EFFECT_SCARS = null;
//	}

	/**
	 * Apply image.
	 *
	 * @param texture the texture
	 * @param location the location
	 * @param alpha the alpha
	 * @param lineDrawer 
	 */
	public static void applyImage(BufferedImage texture, double[] location, double alpha, MapDrawer lineDrawer){
		// only draw pixels where there are already pixels and in the same room
		if(texture != null){
			MapDrawer.MapDrawBlock drawBlock = lineDrawer.getMapDrawBlock(location);
			
			for(int i = 0; i < texture.getWidth(); i++){
				for(int j = 0; j < texture.getHeight(); j++){
				
					if(drawBlock.getHitbox().contains(i + location[0] - (texture.getWidth() * 0.5),
                            						  j + location[1] - (texture.getHeight() * 0.5)) && 
                            						  texture.getRGB(i, j) != 0x00000000){

						Color textureColour = new Color(texture.getRGB(i, j));
						Color roomColour = new Color(drawBlock.getImage().getRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()),
																				 (int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY())));
						
						Color moddedColour = new Color((int)((textureColour.getRed() * alpha) + (roomColour.getRed() * (1 - alpha))),
												       (int)((textureColour.getGreen() * alpha) + (roomColour.getGreen() * (1 - alpha))),
													   (int)((textureColour.getBlue() * alpha) + (roomColour.getBlue() * (1 - alpha))));
						
						drawBlock.getImage().setRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()), 
													(int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY()),
													moddedColour.getRGB());
					
					}

				}
			}
		}
	}
	
	/**
	 * Apply image.
	 *
	 * @param texture the texture
	 * @param drawBlock the draw block
	 * @param location the location
	 * @param alpha the alpha
	 */
	public static void applyImage(BufferedImage texture, MapDrawer.MapDrawBlock drawBlock, double[] location, double alpha){
		// only draw pixels where there are already pixels and in the same room
		if(texture != null){
			
			for(int i = 0; i < texture.getWidth(); i++){
				for(int j = 0; j < texture.getHeight(); j++){
				
					if(drawBlock.getHitbox().contains(i + location[0] - (texture.getWidth() * 0.5),
					                                  j + location[1] - (texture.getHeight() * 0.5)) && 
					                                  texture.getRGB(i, j) != 0x00000000){
					
						Color textureColour = new Color(texture.getRGB(i, j));
						Color roomColour = new Color(drawBlock.getImage().getRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()),
																				 (int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY())));
						
						Color moddedColour = alphaColours(textureColour, roomColour, alpha);
						
						drawBlock.getImage().setRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()), 
													(int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY()),
													moddedColour.getRGB());
						
					}
				}
			}
		}
	}
	
	/**
	 * Alpha colours.
	 *
	 * @param textureColour the texture colour
	 * @param roomColour the room colour
	 * @param alpha the alpha
	 * @return the color
	 */
	public static Color alphaColours(Color textureColour, Color roomColour, double alpha) {
		return new Color((int)(textureColour.getRed() * alpha + roomColour.getRed() * (1 - alpha)),
				         (int)(textureColour.getGreen() * alpha + roomColour.getGreen() * (1 - alpha)),
					     (int)(textureColour.getBlue() * alpha + roomColour.getBlue() * (1 - alpha)));
	}

	/**
	 * Apply map texture.
	 *
	 * @param texture the texture
	 * @param textureBlock the texture block
	 * @param mapBlock the map block
	 */
	public static void applyMapTexture(BufferedImage texture, LevelBlock textureBlock, BufferedImage mapBlock) {
		// only draw pixels where there are already pixels and in the same room and loop texture to fill
		
		int[] loops = new int[2];
		loops[0] = (int)Math.ceil(textureBlock.getHitBox().getBounds2D().getWidth() / texture.getWidth());
		loops[1] = (int)Math.ceil(textureBlock.getHitBox().getBounds2D().getHeight() / texture.getHeight());
		
		int[] loopsCount = {0,0};
		
		int xOffset = 0;
		int yOffset = 0;
		
		do{
			
			for(int i = 0; i < texture.getWidth(); i++){
				for(int j = 0; j < texture.getHeight(); j++){
					
					if(i + xOffset < mapBlock.getWidth() &&
					   j + yOffset < mapBlock.getHeight() &&
					   textureBlock.getHitBox().contains(i + textureBlock.getHitBox().getBounds2D().getMinX() + xOffset,
							                             j + textureBlock.getHitBox().getBounds2D().getMinY() + yOffset) &&
					   texture.getRGB(i, j) != 0x00000000){
					
						mapBlock.setRGB((int)(i + xOffset),
									    (int)(j + yOffset),
										texture.getRGB(i, j));
						
					}
					
				}
			}
			
			if(loopsCount[0] < loops[0]){
				xOffset += texture.getWidth(); 
				loopsCount[0]++;
			}
			else if(loopsCount[1] < loops[1]){
				xOffset = 0;
				loopsCount[0] = 0;
				loopsCount[1]++;
				yOffset += texture.getHeight(); 
			}
		}
		while(loopsCount[0] != loops[0] || loopsCount[1] != loops[1]);
	}

	/**
	 * Apply image.
	 *
	 * @param texture the texture
	 * @param drawShape the draw shape
	 * @param drawPoly the draw poly
	 * @param offset the offset
	 */
	public static void applyImage(BufferedImage texture, BufferedImage drawShape, Polygon drawPoly, double[] offset) {

		for(int i = 0; i < drawShape.getWidth(); i++){
			for(int j = 0; j < drawShape.getHeight(); j++){
				
				if(drawPoly.contains(i + offset[0], j + offset[1])){
					
					int[] location = {i,j};
					
					while(location[0] >= texture.getWidth()){
						location[0] -= texture.getWidth();
					}
					while(location[1] >= texture.getHeight()){
						location[1] -= texture.getHeight();
					}
					
					drawShape.setRGB(i,j, texture.getRGB(location[0],location[1]));
				}
				
			}
		}

	}
	
}
