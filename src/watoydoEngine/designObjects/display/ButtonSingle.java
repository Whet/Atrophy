/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import watoydoEngine.gubbinz.GraphicsFunctions;

// TODO: Auto-generated Javadoc
// Button with only one image
/**
 * The Class ButtonSingle.
 */
public abstract class ButtonSingle extends AbstractButton implements ImageDisplayable{
	
	/**
	 * The image.
	 */
	private BufferedImage image;
	
	/*
	 * Because visibility and activity are both boolean, for simplicity's sake you cannot define activity in the constructor without also
	 * However if an item is not visible it is therefore not active, so you can set an item to not be active but it must also not be visible
	 */
	
	/**
	 * Instantiates a new button single.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public ButtonSingle(BufferedImage image){
		this.image = image;
	}
	
	/**
	 * Instantiates a new button single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 */
	public ButtonSingle(BufferedImage image, double x, double y){
		super(x,y);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param visible the visible
	 */
	public ButtonSingle(BufferedImage image, boolean visible){
		super(visible);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param visible the visible
	 * @param active the active
	 */
	public ButtonSingle(BufferedImage image, boolean visible, boolean active){
		super(visible,active);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 */
	public ButtonSingle(BufferedImage image, double x, double y, boolean visible){
		super(x,y,visible);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button single.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 * @param active the active
	 * @param z the z
	 */
	public ButtonSingle(BufferedImage image, double x, double y, boolean visible, boolean active, int z){
		super(x,y,visible,active,z);
		this.image = image;
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
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isInBounds(double, double)
	 */
	public boolean isInBounds(double x, double y){
		if(x >= (this.getLocation()[0]) && x <= (this.getLocation()[0] + (image.getWidth() * this.getScale())) &&
		   y >= (this.getLocation()[1]) && y <= (this.getLocation()[1] + (image.getHeight() * this.getScale()))){
			return true;
		}
		else{
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#getLocationCentre()
	 */
	public double[] getLocationCentre(){
		double editedLocation[] = {this.getLocation()[0] + this.getSize()[0] * 0.5, this.getLocation()[1] + this.getSize()[1] * 0.5};
		return editedLocation;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getSize()
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
	
}
