/*
 * 
 */
package watoydoEngine.designObjects.display;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import watoydoEngine.utils.GraphicsFunctions;


// TODO: Auto-generated Javadoc
// Basic display class, shows an image that can be moved and transformed
/**
 * The Class ImageSingle.
 */
public class ImageSingle extends AbstractImage implements ImageDisplayable{
	
	/**
	 * The image.
	 */
	private BufferedImage image;
	
	private double rotation;
	
	/**
	 * Instantiates a new image single.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public ImageSingle(String tag, BufferedImage image){
		super(tag);
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	/**
	 * Instantiates a new image single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 */
	public ImageSingle(String tag, BufferedImage image, double x, double y){
		super(tag,x,y);
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	/**
	 * Instantiates a new image single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param visible the visible
	 */
	public ImageSingle(String tag, BufferedImage image, boolean visible){
		super(tag,visible);
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	/**
	 * Instantiates a new image single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 * @param z the z
	 */
	public ImageSingle(String tag, BufferedImage image, double x, double y, boolean visible, int z){
		super(tag,x,y,visible,z);
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	// The Void
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#drawMethod(java.awt.Graphics2D)
	 */
	public void drawMethod(Graphics2D drawShape){
		drawShape.setComposite(GraphicsFunctions.makeComposite(this.getAlpha()));
		drawShape.drawImage(this.image,this.getTransformationForDrawing(),null);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1));
	}
	
	// Getters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#getLocationCentre()
	 */
	public double[] getLocationCentre(){
		double editedLocation[] = {this.getLocation()[0] + this.getSize()[0] * 0.5, this.getLocation()[1] + this.getSize()[1] * 0.5};
		return editedLocation;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#getSize()
	 */
	public double[] getSize(){
		double[] size = new double[2];
		if(image != null){
			size[0] = this.image.getWidth();
			size[1] = this.image.getHeight();
		}
		else{
			size[0] = 0;
			size[1] = 0;
		}
		return size;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#getImage()
	 */
	public BufferedImage getImage(){
		return this.image;
	}
	
	// Setters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#setImage(java.awt.image.BufferedImage)
	 */
	public void setImage(BufferedImage newImage){
		this.image = newImage;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
	
	
}
