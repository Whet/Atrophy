/*
 * 
 */
package watoydoEngine.designObjects.display;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;

import watoydoEngine.designObjects.actions.MouseRespondable;
import watoydoEngine.display.tweens.TweenDefinable;

// TODO: Auto-generated Javadoc
// Image that can be clicked
/**
 * The Class AbstractButton.
 */
public abstract class AbstractButton implements Displayable, MouseRespondable{
	
	/**
	 * The location.
	 */
	private double[] location;
	
	/**
	 * The visible.
	 */
	private boolean visible;
	
	/**
	 * The scale.
	 */
	private double scale;

	private double rotation;
	
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
	int z;
	
	/**
	 * The active.
	 */
	private boolean active;
	
	/**
	 * The alpha.
	 */
	private float alpha;

	/**
	 * The action z.
	 */
	private int actionZ;
	
	/**
	 * Instantiates a new abstract button.
	 */
	public AbstractButton(){
		this.scale = 1;
		this.rotation = 0;
		this.transformation = new AffineTransform();
		
		this.visible = true;
		this.active = true;
		
		this.location = new double[2];
		this.setLocation(0, 0);
		
		z = 0;
		actionZ = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract button.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public AbstractButton(double x, double y){
		this.scale = 1;
		this.rotation = 0;
		this.transformation = new AffineTransform();
		
		this.visible = true;
		this.active = true;
		
		this.location = new double[2];
		this.setLocation(x, y);
	
		z = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract button.
	 *
	 * @param visible the visible
	 */
	public AbstractButton(boolean visible){
		this.scale = 1;
		this.rotation = 0;
		this.transformation = new AffineTransform();
		
		this.visible = visible;
		this.active = visible;
		
		this.location = new double[2];
		this.setLocation(0, 0);
		
		z = 0;
		actionZ = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract button.
	 *
	 * @param visible the visible
	 * @param active the active
	 */
	public AbstractButton(boolean visible, boolean active){
		this.scale = 1;
		this.rotation = 0;
		this.transformation = new AffineTransform();
		
		this.visible = visible;
		this.active = active;
		
		this.location = new double[2];
		this.setLocation(0, 0);
		
		z = 0;
		actionZ = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract button.
	 *
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 */
	public AbstractButton(double x, double y, boolean visible){
		this.scale = 1;
		this.rotation = 0;
		this.transformation = new AffineTransform();
		
		this.visible = visible;
		this.active = visible;
		
		this.location = new double[2];
		this.setLocation(x, y);
		
		z = 0;
		actionZ = 0;
		
		alpha = 1;
	}
	
	/**
	 * Instantiates a new abstract button.
	 *
	 * @param x the x
	 * @param y the y
	 * @param visible the visible
	 * @param active the active
	 * @param z the z
	 */
	public AbstractButton(double x, double y, boolean visible, boolean active, int z){
		this.scale = 1;
		this.rotation = 0;
		this.transformation = new AffineTransform();
		
		this.visible = visible;
		this.active = active;
		
		this.location = new double[2];
		this.setLocation(x, y);
		
		this.z = z;
		actionZ = 0;
		
		alpha = 1;
	}
	
	// The Void
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mD(Point mousePosition, MouseEvent e){return false;};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mU(Point mousePosition, MouseEvent e){return false;};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mC(Point mousePosition, MouseEvent e){return false;};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mI(java.awt.Point)
	 */
	public void mI(Point mousePosition){};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mO(java.awt.Point)
	 */
	public void mO(Point mousePosition){};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMD(Point mousePosition, MouseEvent e){return false;};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMU(Point mousePosition, MouseEvent e){return false;};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMC(Point mousePosition, MouseEvent e){return false;};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mMC(Point mousePosition, MouseEvent e) {return false;}
	
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
	
	//Getters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#isVisible()
	 */
	public boolean isVisible(){
		return this.visible;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getScale()
	 */
	public double getScale(){
		return this.scale;
	}
	
	/**
	 * Gets the transformation.
	 *
	 * @return the transformation
	 */
	public AffineTransform getTransformation(){
		return this.transformation;
	}
	
	/**
	 * Gets the transformation for drawing.
	 *
	 * @return the transformation for drawing
	 */
	public AffineTransform getTransformationForDrawing(){
		this.transformation.setToTranslation(location[0], location[1]);
		this.transformation.scale(scale,scale);
		this.transformation.rotate(this.getRotation());
		return this.transformation;
	}
	
	/**
	 * Sets the active.
	 *
	 * @param active the new active
	 */
	public void setActive(Boolean active){
		this.active = active;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isActive()
	 */
	public boolean isActive(){
		return this.active;
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
		this.active = visible;
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
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActive(boolean)
	 */
	public void setActive(boolean active){
		this.active = active;
	}
	
	/**
	 * Sets the alpha.
	 *
	 * @param alpha the new alpha
	 */
	public void setAlpha(float alpha){
		this.alpha = alpha;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#getActionZ()
	 */
	@Override
	public int getActionZ() {
		return actionZ;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActionZ(int)
	 */
	public void setActionZ(int actionZ) {
		this.actionZ = actionZ;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
}
