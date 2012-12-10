/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.fonts.FontList;


// TODO: Auto-generated Javadoc
// When a Text object is reached in the paint loop it gives instructions on how to .drawString() but is not directly drawn
/**
 * The Class Text.
 */
public class Text implements Displayable{
	
	/**
	 * The font.
	 */
	private Font font;
	
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
	
	/**
	 * The message.
	 */
	private String message;
	// Colour of the text
	/**
	 * The colour.
	 */
	private Color colour;
	
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
	
	//vars used to draw multilined textboxes, find where \n's are
	/**
	 * The point in text.
	 */
	protected int pointInText;
	
	/**
	 * The line y.
	 */
	protected double lineY;

	/**
	 * Instantiates a new text.
	 */
	public Text(){
		location = new double[2];
		location[0] = 0;
		location[1] = 0;
		this.visible = true;
		this.scale = 1;
		this.message = "";
		this.colour = Color.white;
		font = FontList.AUD14;
	}
	
	/**
	 * Instantiates a new text.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Text(double x, double y){
		location = new double[2];
		location[0] = x;
		location[1] = y;
		this.visible = true;
		this.scale = 1;
		this.message = "";
		this.colour = Color.white;
		font = FontList.AUD14;
	}
	
	/**
	 * Instantiates a new text.
	 *
	 * @param x the x
	 * @param y the y
	 * @param message the message
	 */
	public Text(double x, double y, String message){
		location = new double[2];
		location[0] = x;
		location[1] = y;
		this.visible = true;
		this.scale = 1;
		this.message = message;
		this.colour = Color.white;
		font = FontList.AUD14;
	}
	
	/**
	 * Instantiates a new text.
	 *
	 * @param x the x
	 * @param y the y
	 * @param message the message
	 * @param colour the colour
	 */
	public Text(double x, double y, String message, Color colour){
		location = new double[2];
		location[0] = x;
		location[1] = y;
		this.visible = true;
		this.scale = 1;
		this.message = message;
		this.colour = colour;
		font = FontList.AUD14;
	}
	
	// The Void
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#drawMethod(java.awt.Graphics2D)
	 */
	public void drawMethod(Graphics2D drawShape){
		pointInText = 0;
		lineY = location[1];
		drawShape.setColor(colour);
		drawShape.setFont(font);
		while(pointInText < this.getText().length()){
			drawShape.drawString(computeLines(),(int) location[0],(int) lineY);
		}
	}
	// protected since subclasses can override drawMethod
	/**
	 * Computes the lines.
	 *
	 * @return the string
	 */
	protected final String computeLines(){
		StringBuilder sb = new StringBuilder();
		
		// newline has been reached, update position
		if(pointInText != 0){
			lineY += 18;
		}
		for(int i = pointInText; i < this.getText().length(); i++){
			if(this.getText().charAt(i) == '@' && i+1 < this.getText().length() && this.getText().charAt(i+1) == 'n'){
				pointInText = i + 2;
				return sb.toString();
			}
			sb.append(this.getText().charAt(i));
		}
		pointInText += sb.length();
		return sb.toString();
	}
	// Getters
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
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getSize()
	 */
	public double[] getSize(){
		double [] size = new double[2];
		size[0] = this.getText().length() * 8;
		if(size[0] == 0){
			size[0] = 6;
		}
		size[1] = 16;
		return size;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getLocation()
	 */
	public double[] getLocation(){
		return this.location;
	}
	
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
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getZ()
	 */
	public int getZ(){
		return this.z;
	}
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText(){
		return this.message;
	}
	
	/**
	 * Gets the colour.
	 *
	 * @return the colour
	 */
	public Color getColour(){
		return this.colour;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#compareTo(watoydoEngine.designObjects.display.Displayable)
	 */
	public int compareTo(Displayable otherDisplayable){
		if(otherDisplayable.getZ() > this.getZ()){
			 return -1;
		}
		else if(otherDisplayable.getZ() < this.getZ()){
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
	
	/**
	 * Gets the font.
	 *
	 * @return the font
	 */
	public Font getFont(){
		return this.font;
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
	
	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(double[] location){
		this.location[0] = location[0];
		this.location[1] = location[1];
	}
	
	/**
	 * Sets the text.
	 *
	 * @param message the new text
	 */
	public void setText(String message){
		this.message = message;
	}
	
	/**
	 * Append text.
	 *
	 * @param message the message
	 */
	public void appendText(String message){
		this.message = this.message + message;
	}
	
	/**
	 * Append text.
	 *
	 * @param message the message
	 */
	public void appendText(char message){
		this.message = this.message + message;
	}
	
	/**
	 * Sets the colour.
	 *
	 * @param colour the new colour
	 */
	public void setColour(Color colour){
		this.colour = colour;
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
	
	/**
	 * Sets the font.
	 *
	 * @param font the new font
	 */
	public void setFont(Font font){
		this.font = font;
	}
	
}
