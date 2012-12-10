/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import watoydoEngine.designObjects.actions.MouseRespondable;

/**
 * The Class TextButton.
 */
public abstract class TextButton extends Text implements MouseRespondable{

	/**
	 * The on colour.
	 */
	private Color onColour;
	
	/**
	 * The off colour.
	 */
	private Color offColour;
	
	/**
	 * The active.
	 */
	private boolean active;
	
	/**
	 * The action z.
	 */
	private int actionZ;
	
	/**
	 * The bound box.
	 */
	private Rectangle2D boundBox;
	
	/**
	 * Instantiates a new text button.
	 *
	 * @param onColour the on colour
	 * @param offColour the off colour
	 */
	public TextButton(Color onColour, Color offColour) {
		this.active = true;
		this.setColour(offColour);
		this.onColour = onColour;
		this.offColour = offColour;
		boundBox = null;
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
	@Override
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
	@Override
	public boolean rMC(Point mousePosition, MouseEvent e) {
		return false;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition) {
		this.setColour(onColour);
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition) {
		this.setColour(offColour);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mMC(Point mousePosition, MouseEvent e) {return false;}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isActive()
	 */
	@Override
	public boolean isActive() {
		return this.active;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isInBounds(double, double)
	 */
	@Override
	public boolean isInBounds(double x, double y) {
		if(this.boundBox == null){
			return false;
		}
		return boundBox.contains(x - this.getLocation()[0], y - this.getLocation()[1]);
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
	@Override
	public int getActionZ() {
		return this.actionZ;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActionZ(int)
	 */
	@Override
	public void setActionZ(int actionZ) {
		this.actionZ = actionZ;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#setText(java.lang.String)
	 */
	@Override
	public void setText(String message) {
		super.setText(message);
		this.boundBox = null;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#setFont(java.awt.Font)
	 */
	@Override
	public void setFont(Font font) {
		super.setFont(font);
		this.boundBox = null;
	}
	
	/**
	 * Gets the on colour.
	 *
	 * @return the on colour
	 */
	public Color getOnColour() {
		return onColour;
	}

	/**
	 * Gets the off colour.
	 *
	 * @return the off colour
	 */
	public Color getOffColour() {
		return offColour;
	}

	/**
	 * Sets the on colour.
	 *
	 * @param onColour the new on colour
	 */
	public void setOnColour(Color onColour) {
		this.onColour = onColour;
	}

	/**
	 * Sets the off colour.
	 *
	 * @param offColour the new off colour
	 */
	public void setOffColour(Color offColour) {
		this.offColour = offColour;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		if(this.boundBox == null){
			FontMetrics metric = drawShape.getFontMetrics(this.getFont());
			this.boundBox = metric.getStringBounds(this.getText(), drawShape);
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		this.setActive(visible);
	}

}
