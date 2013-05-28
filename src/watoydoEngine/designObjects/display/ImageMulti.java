/*
 * 
 */
package watoydoEngine.designObjects.display;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import watoydoEngine.utils.GraphicsFunctions;


// TODO: Auto-generated Javadoc
// Basic display class, shows an image that can be moved and transformed
// Can be animated and has a play bool to define that
/**
 * The Class ImageMulti.
 */
public class ImageMulti extends AbstractImage{
	
	/**
	 * The frame.
	 */
	private int frame;
	
	/**
	 * The playing.
	 */
	private boolean playing;
	
	/**
	 * The image.
	 */
	private BufferedImage[] image;
	
	private double rotation;
	
	// Essential constructor
	/**
	 * Instantiates a new image multi.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public ImageMulti(String tag, BufferedImage[] image){
		super(tag);
		
		this.image = image;
		
		this.frame = 0;
		this.playing = true;
		
		this.rotation = 0;
	}
	// Allow position settings
	/**
	 * Instantiates a new image multi.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 */
	public ImageMulti(String tag, BufferedImage image[], double x, double y){
		super(tag,x,y);
		
		this.image = image;
		
		this.frame = 0;
		this.playing = true;
		
		this.rotation = 0;
	}
	// Allow visibility settings
	/**
	 * Instantiates a new image multi.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param visible the visible
	 */
	public ImageMulti(String tag, BufferedImage image[], boolean visible){
		super(tag,visible);
		
		this.image = image;
		
		this.frame = 0;
		this.playing = true;
		
		this.rotation = 0;
	}
	// Allow full set-up
	/**
	 * Instantiates a new image multi.
	 *
	 * @param tag the tag
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 * @param z the z
	 */
	public ImageMulti(String tag, BufferedImage image[], double x, double y, boolean visible,int z){
		super(tag,x,y,visible,z);
		
		this.image = image;
		
		this.frame = 0;
		this.playing = true;
		
		this.rotation = 0;
	}
	
	// The Void
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#drawMethod(java.awt.Graphics2D)
	 */
	public void drawMethod(Graphics2D drawShape){
		nextFrame();
		drawShape.setComposite(GraphicsFunctions.makeComposite(this.getAlpha()));
		drawShape.drawImage(this.image[frame],this.getTransformationForDrawing(),null);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1));
	}
	
	/**
	 * Next frame.
	 */
	public void nextFrame(){
		if(playing){
			this.frame++;
			if(frame > image.length - 1){
				frame = 0;
			}
		}
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
			size[0] = this.image[frame].getWidth();
			size[1] = this.image[frame].getHeight();
		}
		else{
			size[0] = 0;
			size[1] = 0;
		}
		return size;
	}
	
	/**
	 * Checks if is playing.
	 *
	 * @return true, if is playing
	 */
	public boolean isPlaying(){
		return playing;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#getImage()
	 */
	public BufferedImage getImage(){
		return this.image[frame];
	}
	
	/**
	 * Gets the frame.
	 *
	 * @return the frame
	 */
	public int getFrame(){
		return this.frame;
	}
	
	// setters
	/**
	 * Sets the frame.
	 *
	 * @param frame the new frame
	 */
	public void setFrame(int frame){
		if(frame < image.length - 1){
			this.frame = frame;
		}
	}
	
	/**
	 * Sets the playing.
	 *
	 * @param playing the new playing
	 */
	public void setPlaying(boolean playing){
		this.playing = playing;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#setImage(java.awt.image.BufferedImage)
	 */
	public void setImage(BufferedImage image){
		this.image[frame] = image;
	}
	
	public double getRotation() {
		return rotation;
	}
	
	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
}
