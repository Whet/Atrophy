/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import watoydoEngine.gubbinz.GraphicsFunctions;

// TODO: Auto-generated Javadoc
// Button that has multiple images
/**
 * The Class ButtonMulti.
 */
public abstract class ButtonMulti extends AbstractButton implements ImageDisplayable {
	
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
	
	/*
	 * Because visibility and activity are both boolean, for simplicity's sake you cannot define activity in the constructor without also
	 * However if an item is not visible it is therefore not active, so you can set an item to not be active but it must also not be visible
	 */
	
	/**
	 * Instantiates a new button multi.
	 *
	 * @param image the image
	 */
	public ButtonMulti(BufferedImage image[]){
		this.image = image;
	}
	
	/**
	 * Instantiates a new button multi.
	 *
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 */
	public ButtonMulti(BufferedImage image[], double x, double y){
		super(x,y);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button multi.
	 *
	 * @param image the image
	 * @param visible the visible
	 */
	public ButtonMulti(BufferedImage image[], boolean visible){
		super(visible);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button multi.
	 *
	 * @param image the image
	 * @param visible the visible
	 * @param active the active
	 */
	public ButtonMulti(BufferedImage image[], boolean visible, boolean active){
		super(visible,active);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button multi.
	 *
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 */
	public ButtonMulti(BufferedImage image[], double x, double y, boolean visible){
		super(x,y,visible);
		this.image = image;
	}
	
	/**
	 * Instantiates a new button multi.
	 *
	 * @param image the image
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 * @param active the active
	 * @param z the z
	 */
	public ButtonMulti(BufferedImage image[], double x, double y, boolean visible, boolean active, int z){
		super(x,y,visible,active,z);
		this.image = image;
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
	
	/**
	 * Next frame.
	 *
	 * @param ignorePlaying the ignore playing
	 */
	public void nextFrame(boolean ignorePlaying){
		if(playing || ignorePlaying){
			this.frame++;
			if(frame > image.length - 1){
				frame = 0;
			}
		}
	}
	
	/**
	 * Previous frame.
	 *
	 * @param ignorePlaying the ignore playing
	 */
	public void previousFrame(boolean ignorePlaying){
		if(playing || ignorePlaying){
			this.frame--;
			if(frame < 0){
				frame = image.length - 1;
			}
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
	// Getters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isInBounds(double, double)
	 */
	public boolean isInBounds(double x, double y){
		if(x >= (this.getLocation()[0]) && x <= (this.getLocation()[0] + (image[frame].getWidth() * this.getScale())) && y >= (this.getLocation()[1]) && y <= (this.getLocation()[1] + (image[frame].getHeight() * this.getScale()))){
			return true;
		}
		return false;
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
	 * Sets the image.
	 *
	 * @param image the new image
	 */
	public void setImage(BufferedImage[] image){
		this.image = image;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#setImage(java.awt.image.BufferedImage)
	 */
	public void setImage(BufferedImage image){
		this.image[0] = image;
	}

}
