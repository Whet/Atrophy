/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import watoydoEngine.designObjects.actions.KeyboardRespondable;
import watoydoEngine.designObjects.actions.MouseRespondable;

// TODO: Auto-generated Javadoc
// Text box that can be written to, mainly contains action functions as it extends the display method of Text
/**
 * The Class TextInput.
 */
public class TextInput extends Text implements MouseRespondable,KeyboardRespondable{
	
	/**
	 * The active.
	 */
	private boolean active;
	
	/**
	 * The action z.
	 */
	private int actionZ;
	
	/**
	 * The focus.
	 */
	private boolean focus;
	
	/**
	 * The max letters.
	 */
	private int maxLetters;
	
	/**
	 * The min letters.
	 */
	private int minLetters;
	
	/**
	 * The bound box.
	 */
	private Rectangle2D boundBox;
	
	/**
	 * Instantiates a new text input.
	 */
	public TextInput(){
		active = true;
		focus = false;
	}
	
	/**
	 * Instantiates a new text input.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public TextInput(double x, double y){
		super(x,y,"");
		
		active = true;
		focus = false;
	}
	
	/**
	 * Instantiates a new text input.
	 *
	 * @param x the x
	 * @param y the y
	 * @param message the message
	 */
	public TextInput(double x, double y, String message) {
		super(x,y,message);
		
		active = true;
		focus = false;
	}

	// The Void
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#drawMethod(java.awt.Graphics2D)
	 */
	public final void drawMethod(Graphics2D drawShape){
		
		updateText();
		
		
		if(this.boundBox == null){
			FontMetrics metric = drawShape.getFontMetrics(this.getFont());
			this.boundBox = metric.getStringBounds(this.getText(), drawShape);
		}
		
		super.drawMethod(drawShape);
	}
	
	// If a sublass wants to define it's text with a string variable, this method gets called before drawing
	// so a user doesn't have to call setText every time they update the variable
	/**
	 * Update text.
	 */
	protected void updateText(){};
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kD(java.awt.event.KeyEvent)
	 */
	public boolean kD(KeyEvent e){
		// if backspace, delete last letter
		// doesn't work with getKeyCode
		if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE && this.getText().length() > minLetters){
			this.setText(this.getText().substring(0, this.getText().length() - 1));
		}
		// always return true to stop other things running
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kU(java.awt.event.KeyEvent)
	 */
	public boolean kU(KeyEvent e){
		if((e.getKeyCode() == 32 || Character.isAlphabetic(e.getKeyChar()) || Character.isDigit(e.getKeyChar())) && (maxLetters == 0 || maxLetters > this.getText().length())){
			this.appendText(e.getKeyChar());
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kP(java.awt.event.KeyEvent)
	 */
	public boolean kP(KeyEvent e){
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mD(Point mousePosition, MouseEvent e){
		this.setFocus(true);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mU(Point mousePosition, MouseEvent e){
		this.setFocus(true);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMD(Point mousePosition, MouseEvent e){
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMU(Point mousePosition, MouseEvent e){
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mI(java.awt.Point)
	 */
	public void mI(Point mousePosition){
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mO(java.awt.Point)
	 */
	public void mO(Point mousePosition) {
		this.setFocus(false);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mMC(Point mousePosition, MouseEvent e) {return false;}
	
	// Getters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isActive()
	 */
	public boolean isActive(){
		return active;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#isFocused()
	 */
	public boolean isFocused(){
		return focus;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isInBounds(double, double)
	 */
	public boolean isInBounds(double x, double y){
		if(this.boundBox == null){
			return false;
		}
		return boundBox.contains(x - this.getLocation()[0], y - this.getLocation()[1]);
	}
	
	/**
	 * Gets the max letters.
	 *
	 * @return the max letters
	 */
	public int getMaxLetters(){
		return this.maxLetters;
	}
	
	// Setters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActive(boolean)
	 */
	public void setActive(boolean active){
		this.active = active;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#setFocus(boolean)
	 */
	public void setFocus(boolean focus){
		this.focus = focus;
	}
	
	/**
	 * Sets the max letters.
	 *
	 * @param maxLetters the new max letters
	 */
	public void setMaxLetters(int maxLetters){
		this.maxLetters = maxLetters;
	}

	/**
	 * Gets the min letters.
	 *
	 * @return the min letters
	 */
	public int getMinLetters() {
		return minLetters;
	}

	/**
	 * Sets the min letters.
	 *
	 * @param minLetters the new min letters
	 */
	public void setMinLetters(int minLetters) {
		this.minLetters = minLetters;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mC(Point mousePosition, MouseEvent e) {
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
	 * @see watoydoEngine.designObjects.display.Text#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		this.setActive(visible);
	}
	
}
