package atrophy.combat.display;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.ai.PathFinder;
import atrophy.combat.level.LevelBlock;

public class MapPainter {
	
	public static BufferedImage[] EFFECT_SCARS;
	
	public static void loadTextures(){
		
		EFFECT_SCARS = new BufferedImage[1];
		
		try {
			EFFECT_SCARS[0] = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/effects/explosion.png"));
			
		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
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
						Color roomColour = new Color(drawBlock.getColourImage().getRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()),
																				 (int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY())));
						
						Color moddedColour = new Color((int)((textureColour.getRed() * alpha) + (roomColour.getRed() * (1 - alpha))),
												       (int)((textureColour.getGreen() * alpha) + (roomColour.getGreen() * (1 - alpha))),
													   (int)((textureColour.getBlue() * alpha) + (roomColour.getBlue() * (1 - alpha))));
						
						drawBlock.getColourImage().setRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()), 
													(int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY()),
													moddedColour.getRGB());
					
					}
				}
			}
		}
	}
	
	public static void applyImage(BufferedImage texture, MapDrawer.MapDrawBlock drawBlock, double[] location){
		// only draw pixels where there are already pixels and in the same room
		if(texture != null){
			
			for(int i = 0; i < texture.getWidth(); i++){
				for(int j = 0; j < texture.getHeight(); j++){
				
					if(drawBlock.getHitbox().contains(i + location[0] - (texture.getWidth() * 0.5),
					                                  j + location[1] - (texture.getHeight() * 0.5)) && 
					                                  texture.getRGB(i, j) != 0x00000000){
					
						Color textureColour = new Color(texture.getRGB(i, j));
						Color roomColour = new Color(drawBlock.getColourImage().getRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()),
																				 (int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY())));
						
						Color pixel = new Color(texture.getRGB(i, j), true);
						
						Color moddedColour = alphaColours(textureColour, roomColour, pixel.getAlpha() / (double)255);
						
						drawBlock.getColourImage().setRGB((int)(i + location[0] - (texture.getWidth() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinX()), 
													(int)(j + location[1] - (texture.getHeight() * 0.5) - drawBlock.getHitbox().getBounds2D().getMinY()),
													moddedColour.getRGB());
						
					}
				}
			}
		}
	}
	
	public static Color alphaColours(Color textureColour, Color roomColour, double alpha) {
		int red = (int)(textureColour.getRed() * alpha + roomColour.getRed() * (1 - alpha));
		int green = (int)(textureColour.getGreen() * alpha + roomColour.getGreen() * (1 - alpha));
		int blue = (int)(textureColour.getBlue() * alpha + roomColour.getBlue() * (1 - alpha));
		
		return new Color(red,green,blue);
	}

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
					
						mapBlock.setRGB((i + xOffset),
									    (j + yOffset),
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
	
	public static void applyMapTexture(BufferedImage[] textures, int[] floorInfo, LevelBlock levelBlock, BufferedImage mapBlock) {
		// only draw pixels where there are already pixels and in the same room and loop texture to fill
		
		int[] loops = new int[2];
		loops[0] = (int)Math.ceil(levelBlock.getHitBox().getBounds2D().getWidth() / textures[0].getWidth());
		loops[1] = (int)Math.ceil(levelBlock.getHitBox().getBounds2D().getHeight() / textures[0].getHeight());
		
		int[] loopsCount = {0,0};
		
		int xOffset = 0;
		int yOffset = 0;
		
		int[][] texturePath = PathFinder.findTexturePath(levelBlock, textures[0].getHeight());
		
		int x = 0;
		int y = 0;
		
		int textureCode = chooseTexture(floorInfo, x, y, texturePath);
		
		BufferedImage texture = textures[textureCode];
		
		do{
			
			for(int i = 0; i < texture.getWidth(); i++){
				for(int j = 0; j < texture.getHeight(); j++){
					
					int rgb = texture.getRGB(i, j);
					
					if(i + xOffset < mapBlock.getWidth() &&
					   j + yOffset < mapBlock.getHeight() &&
					   levelBlock.getHitBox().contains(i + levelBlock.getHitBox().getBounds2D().getMinX() + xOffset,
							                             j + levelBlock.getHitBox().getBounds2D().getMinY() + yOffset) &&
					   rgb != 0x00000000){
						
						mapBlock.setRGB((i + xOffset),
									    (j + yOffset),
										rgb);
						
					}
					
				}
			}
			
			if(loopsCount[0] < loops[0]){
				xOffset += texture.getWidth();
				
				x++;
				
				loopsCount[0]++;
			}
			else if(loopsCount[1] < loops[1]){
				xOffset = 0;
				
				x = 0;
				
				loopsCount[0] = 0;
				loopsCount[1]++;
				
				yOffset += texture.getHeight();
				
				y++;
			}
			
			// Choose new textures
			textureCode = chooseTexture(floorInfo, x, y, texturePath);
			 
			texture = textures[textureCode];
		}
		while(loopsCount[0] != loops[0] || loopsCount[1] != loops[1]);
	}

	private static int chooseTexture(int[] floorInfo, int x, int y, int[][] texturePath) {
		int desiredType = texturePath[x][y];
		
		for(int i = 0; i < floorInfo.length; i++) {
			if(floorInfo[i] == desiredType)
				return i;
		}
		
		return 0;
	}

	public static void applyImage(BufferedImage texture, BufferedImage drawShape, Polygon drawPoly, int[] offset) {

		for(int i = 0; i < drawShape.getWidth(); i++){
			for(int j = 0; j < drawShape.getHeight(); j++){
				
				if(drawPoly.contains(i, j)){
					
					int[] location = {i + offset[0], j + offset[1]};
					
					while(location[0] >= texture.getWidth()){
						location[0] -= texture.getWidth();
					}
					while(location[1] >= texture.getHeight()){
						location[1] -= texture.getHeight();
					}
					
					Color pixel = new Color(texture.getRGB(location[0], location[1]), true);
					
					Color moddedColour = alphaColours(pixel, new Color(drawShape.getRGB(i, j)), pixel.getAlpha() / (double)255);
					
					drawShape.setRGB(i,j, moddedColour.getRGB());
				}
				
			}
		}

	}
	
	public static void applyImage(BufferedImage[] textures, BufferedImage drawShape, Polygon drawPoly, double[] offset) {

		for(int i = 0; i < drawShape.getWidth(); i++){
			for(int j = 0; j < drawShape.getHeight(); j++){
				
				if(drawPoly.contains(i + offset[0], j + offset[1])){
					
					BufferedImage texture = textures[new Random().nextInt(textures.length)];
					
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
