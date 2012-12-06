/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui.popups;

import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import atrophy.gameMenu.ui.Menu;

/**
 * The Class Popup.
 */
public abstract class Popup extends Menu{

	/**
	 * The Constant OPTION_SPACE.
	 */
	private static final int OPTION_SPACE = 20;
	
	/**
	 * The Constant VERTICAL_SPACE.
	 */
	public static final int VERTICAL_SPACE = 14;
	
	/**
	 * The Constant ROUGH_FONT_SIZE.
	 */
	private static final int ROUGH_FONT_SIZE = 8;
	
	/**
	 * Instantiates a new popup.
	 *
	 * @param message the message
	 * @param options the options
	 */
	public Popup(Text message, TextButton[] options) {
		super(calculateSize(message,options));
		constructPopup(message,options);
	}

	/**
	 * Construct popup.
	 *
	 * @param message the message
	 * @param options the options
	 */
	private void constructPopup(Text message, TextButton[] options) {
		this.addDisplayItem(message);
		message.setLocation(this.getLocation()[0] + OPTION_SPACE, this.getLocation()[1] + VERTICAL_SPACE * 2);
		
		int xShift = OPTION_SPACE;
		
		for(int i = 0; i < options.length; i++){
			this.addDisplayItem(options[i]);
			this.addMouseActionItem(options[i]);
			options[i].setLocation(this.getLocation()[0] + xShift, this.getLocation()[1] + VERTICAL_SPACE * 4);
			
			xShift += options[i].getText().length() * ROUGH_FONT_SIZE + OPTION_SPACE;
		}
	}

	/**
	 * Calculate size.
	 *
	 * @param message the message
	 * @param options the options
	 * @return the double[]
	 */
	private static double[] calculateSize(Text message, TextButton[] options) {
		int messageSize = message.getText().length() * ROUGH_FONT_SIZE;
		int optionsSize = 0;
		
		for(int i = 0; i < options.length; i++){
			optionsSize = (message.getText().length() * ROUGH_FONT_SIZE) + OPTION_SPACE;
		}
		
		if(messageSize > optionsSize)
			return new double[]{messageSize,VERTICAL_SPACE * 6};
		
		return new double[]{optionsSize,VERTICAL_SPACE * 6};
	}

	// Don't allow dragging
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mD(Point mousePosition, MouseEvent e) {
		if(this.isActive()){
			for(int i = 0; i < getMouseActionList().size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(getMouseActionList().get(i).isActive() && getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(getMouseActionList().get(i).mD(mousePosition, e))
						return true;
				}
			}
		}
		return false;
	}
	
	// Don't allow closing
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#rMU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean rMU(Point mousePosition, MouseEvent e) {
		return true;
	}

	
	/*
	 * Don't go to a stub if mouseout
	 */
	
	@Override
	public void mI(Point mousePosition) {
	}
	
	@Override
	public void mO(Point mousePosition) {
	}
	
}
