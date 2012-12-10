/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.Graphics2D;

import watoydoEngine.display.tweens.TweenDefinable;

// TODO: Auto-generated Javadoc
// All purpose display interface, holds very basic properties
/**
 * The Interface Displayable.
 */
public interface Displayable extends Comparable<Displayable>{
	
	// The Void
	/**
	 * Move.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void move(double x, double y);
	// Moves the tween to the next position
	/**
	 * Kick tween.
	 */
	public void kickTween();
	// How the item is drawn
	/**
	 * Draw method.
	 *
	 * @param drawShape the draw shape
	 */
	public void drawMethod(Graphics2D drawShape);
	
	// Getters
	/**
	 * Checks if is visible.
	 *
	 * @return true, if is visible
	 */
	public boolean isVisible();
	// Scale of 1 is normal size
	/**
	 * Gets the scale.
	 *
	 * @return the scale
	 */
	public double getScale();
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public double[] getLocation();
	// .z defines the order items are drawn, a lower z is drawn first so appears at the back
	/**
	 * Gets the z.
	 *
	 * @return the z
	 */
	public int getZ();
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public double[] getSize();
	
	// Used to order displaylist by .z
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Displayable otherDisplay);
	
	// Setters
	/**
	 * Sets the visible.
	 *
	 * @param visible the new visible
	 */
	public void setVisible(boolean visible);
	
	/**
	 * Sets the scale.
	 *
	 * @param scale the new scale
	 */
	public void setScale(double scale);
	
	/**
	 * Sets the location.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void setLocation(double x, double y);
	
	/**
	 * Sets the z.
	 *
	 * @param z the new z
	 */
	public void setZ(int z);
	// Add/remove a tween from the object
	/**
	 * Sets the tween.
	 *
	 * @param tween the new tween
	 */
	public void setTween(TweenDefinable tween);
	
}
