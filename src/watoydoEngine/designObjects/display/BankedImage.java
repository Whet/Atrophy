/*
 * 
 */
package watoydoEngine.designObjects.display;

import java.awt.image.BufferedImage;


// TODO: Auto-generated Javadoc
/**
 * The Class BankedImage.
 */
public class BankedImage{

	/**
	 * The image.
	 */
	private BufferedImage image;
	
	/**
	 * The tag.
	 */
	private String tag;
	
	/**
	 * Instantiates a new banked image.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public BankedImage(String tag, BufferedImage image) {
		this.image = image;
		this.tag = tag;
	}
	
	/**
	 * Gets the tag.
	 *
	 * @return the tag
	 */
	public String getTag(){
		return this.tag;
	}
	
	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public BufferedImage getImage(){
		return this.image;
	}

}
