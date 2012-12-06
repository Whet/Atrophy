/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.level;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import atrophy.combat.PanningManager;

import watoydoEngine.designObjects.display.ImageSingle;

// TODO: Auto-generated Javadoc
/**
 * The Class LevelBackground.
 */
public class LevelBackground extends ImageSingle{
	
	/**
	 * The instance.
	 */
	private static LevelBackground instance;
	
	/**
	 * Gets the single instance of LevelBackground.
	 *
	 * @return single instance of LevelBackground
	 */
	public static LevelBackground getInstance(){
		if(instance == null){
			instance = new LevelBackground();
		}
		return instance;
	}
	
	/**
	 * Instantiates a new level background.
	 */
	private LevelBackground(){
		super("LevelBackground",null);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractImage#getTransformationForDrawing()
	 */
	@Override
	public AffineTransform getTransformationForDrawing(){
		super.getTransformation().setToTranslation(this.getLocation()[0] + PanningManager.getInstance().getOffset()[0],
												   this.getLocation()[1] + PanningManager.getInstance().getOffset()[1]);
		super.getTransformation().scale(this.getScale(),this.getScale());
		return super.getTransformation();
	}
	
	/**
	 * Load map image.
	 *
	 * @param image the image
	 */
	public void loadMapImage(BufferedImage image){
		this.setImage(image);
	}
	
}
