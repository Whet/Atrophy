/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.actions;

import java.awt.Point;
import java.awt.event.MouseEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class ActionRegion.
 */
public abstract class ActionRegion implements MouseRespondable{
	
	/**
	 * The active.
	 */
	private boolean active;
	
	/**
	 * The location.
	 */
	private double[] location;
	
	/**
	 * The size.
	 */
	private double[] size;
	
	/**
	 * The action z.
	 */
	private int actionZ;
	
	/**
	 * Instantiates a new action region.
	 *
	 * @param x the x
	 * @param y the y
	 * @param width the width
	 * @param height the height
	 * @param active the active
	 */
	public ActionRegion(double x, double y, double width, double height, boolean active){
		this.active = true;
		
		location = new double[2];
		location[0] = x;
		location[1] = y;
		
		size = new double[2];
		size[0] = width;
		size[1] = height;
		
		actionZ = 0;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mD(Point mousePosition, MouseEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mU(Point mousePosition, MouseEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mC(Point mousePosition, MouseEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean rMD(Point mousePosition, MouseEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean rMU(Point mousePosition, MouseEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMC(Point mousePosition, MouseEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition) {
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition) {
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mMC(Point mousePosition, MouseEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isActive()
	 */
	@Override
	public boolean isActive() {
		return active;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#getLocation()
	 */
	@Override
	public double[] getLocation() {
		return this.location;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public double[] getSize(){
		return this.size;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isInBounds(double, double)
	 */
	public boolean isInBounds(double x, double y) {
		if(x >= location[0] && x <= location[0] + size[0] && y >= location[1] && y <= location[1] + size[1]){
			return true;
		}
		else{
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setLocation(double, double)
	 */
	@Override
	public void setLocation(double x, double y) {
		this.location[0] = x;
		this.location[1] = y;
	}
	
	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(double[] location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActive(boolean)
	 */
	@Override
	public void setActive(boolean active) {
		this.active = active;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#getActionZ()
	 */
	public int getActionZ() {
		return actionZ;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActionZ(int)
	 */
	public void setActionZ(int actionZ) {
		this.actionZ = actionZ;
	}

}
