/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

// TODO: Auto-generated Javadoc
// Special case interface for classes that use an image to display
/**
 * The Interface ImageDisplayable.
 */
public interface ImageDisplayable extends Displayable{
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getSize()
	 */
	public double[] getSize();
	
	public double getRotation();
	
	/**
	 * Gets the transformation.
	 *
	 * @return the transformation
	 */
	public AffineTransform getTransformation();
	
	/**
	 * Gets the transformation for drawing.
	 *
	 * @return the transformation for drawing
	 */
	public AffineTransform getTransformationForDrawing();
	
	/**
	 * Sets the image.
	 *
	 * @param newImage the new image
	 */
	public void setImage(BufferedImage newImage);
	
	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public BufferedImage getImage();
	
	/**
	 * Gets the location centre.
	 *
	 * @return the location centre
	 */
	public double[] getLocationCentre();
}
