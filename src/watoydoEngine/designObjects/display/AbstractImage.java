/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.geom.AffineTransform;

import watoydoEngine.display.tweens.TweenDefinable;

// TODO: Auto-generated Javadoc
// Plain image, no interactions
/**
 * The Class AbstractImage.
 */
public abstract class AbstractImage implements ImageDisplayable{
	
	/**
	 * The location.
	 */
	private double[] location;
	
	/**
	 * The visible.
	 */
	private boolean visible;
	
	/**
	 * The tag.
	 */
	private String tag;
	
	/**
	 * The scale.
	 */
	private double scale;
	// Used to define position,scale and rotation in active pane paint
	/**
	 * The transformation.
	 */
	private AffineTransform transformation;
	
	/**
	 * The tween.
	 */
	private TweenDefinable tween;
	
	/**
	 * The z.
	 */
	private int z;
	
	/**
	 * The alpha.
	 */
	private float alpha;
	
	/**
	 * Instantiates a new abstract image.
	 *
	 * @param tag the tag
	 */
	public AbstractImage(String tag){
		this.tag = tag;
		this.scale = 1;
		this.transformation = new AffineTransform();
		
		this.visible = true;
		
		this.location = new double[2];
		this.setLocation(0, 0);
		
		z = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract image.
	 *
	 * @param tag the tag
	 * @param x the x
	 * @param y the y
	 */
	public AbstractImage(String tag, double x, double y){
		this.tag = tag;
		this.scale = 1;
		this.transformation = new AffineTransform();
		
		this.visible = true;
		
		this.location = new double[2];
		this.setLocation(x, y);
		
		z = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract image.
	 *
	 * @param tag the tag
	 * @param visible the visible
	 */
	public AbstractImage(String tag, boolean visible){
		this.tag = tag;
		this.scale = 1;
		this.transformation = new AffineTransform();
		
		this.visible = visible;
		
		this.location = new double[2];
		this.setLocation(0, 0);
		
		z = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract image.
	 *
	 * @param tag the tag
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 * @param z the z
	 */
	public AbstractImage(String tag, double x, double y, boolean visible, int z){
		this.tag = tag;
		this.scale = 1;
		this.transformation = new AffineTransform();
		
		this.visible = visible;
		
		this.location = new double[2];
		this.setLocation(x, y);
		
		this.z = z;
		
		alpha = 1;
	}
	
	// The Void
	// Moves tween to next position
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#kickTween()
	 */
	public void kickTween(){
		if(this.tween != null){
			double[] movePos = this.tween.getCord(this.location);
			this.move(movePos[0],movePos[1]);
			if(this.tween.isEnded()){
				this.tween = null;
			}
		}
	}

	// Getters	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#isVisible()
	 */
	public boolean isVisible(){
		if(this.alpha == 0){
			return false;
		}
		return this.visible;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getScale()
	 */
	public double getScale(){
		return this.scale;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#getTransformation()
	 */
	public AffineTransform getTransformation(){
		return this.transformation;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageDisplayable#getTransformationForDrawing()
	 */
	public AffineTransform getTransformationForDrawing(){
		this.transformation.setToTranslation(location[0], location[1]);
		this.transformation.scale(scale,scale);
		this.transformation.rotate(this.getRotation());
		return this.transformation;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getLocation()
	 */
	public double[] getLocation(){
		return this.location;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getZ()
	 */
	public int getZ(){
		return this.z;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#isEqual(java.lang.String)
	 */
	public boolean isEqual(String tag1){
		if(tag1.equals(this.tag)){
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getTag()
	 */
	public String getTag(){
		return this.tag;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#compareTo(watoydoEngine.designObjects.display.Displayable)
	 */
	public int compareTo(Displayable otherDisplay){
		if(otherDisplay.getZ() > this.getZ()){
			 return -1;
		}
		else if(otherDisplay.getZ() < this.getZ()){
			return 1;
		}
		return 0;
	}
	
	/**
	 * Gets the alpha.
	 *
	 * @return the alpha
	 */
	public float getAlpha(){
		return this.alpha;
	}
	
	// Setters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setVisible(boolean)
	 */
	public void setVisible(boolean visible){
		this.visible = visible;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setScale(double)
	 */
	public void setScale(double scale){
		this.scale = scale;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setLocation(double, double)
	 */
	public void setLocation(double x, double y){
		this.location[0] = x;
		this.location[1] = y;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#move(double, double)
	 */
	public void move(double x, double y){
		this.location[0] += x;
		this.location[1] += y;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setTween(watoydoEngine.display.tweens.TweenDefinable)
	 */
	public void setTween(TweenDefinable tween){
		this.tween = tween;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setZ(int)
	 */
	public void setZ(int z){
		this.z = z;
	}
	
	/**
	 * Sets the alpha.
	 *
	 * @param alpha the new alpha
	 */
	public void setAlpha(float alpha){
		this.alpha = alpha;
	}
	
}
