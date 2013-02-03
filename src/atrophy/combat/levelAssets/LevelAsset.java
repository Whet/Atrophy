/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.levelAssets;

import java.awt.image.BufferedImage;

import atrophy.combat.ai.Ai;

// TODO: Auto-generated Javadoc
/**
 * The Interface LevelAsset.
 */
public interface LevelAsset {
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public double[] getLocation();
	
	/**
	 * Act.
	 */
	public void act();
	
	/**
	 * Checks if is expired.
	 *
	 * @return true, if is expired
	 */
	public boolean isExpired();
	
	/**
	 * Gets the image name.
	 *
	 * @return the image name
	 */
	public BufferedImage getImage();
	
	/**
	 * Gets the originator.
	 *
	 * @return the originator
	 */
	public Ai getOriginator();

	/**
	 * Gets the life.
	 *
	 * @return the life
	 */
	public int getLife();
	
}
