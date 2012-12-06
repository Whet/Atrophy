/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import atrophy.gameMenu.ui.WindowManager;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;

/**
 * The Class ErrorPopup.
 */
public class ErrorPopup extends Popup {

	/**
	 * Instantiates a new error popup.
	 *
	 * @param message the message
	 */
	public ErrorPopup(String message) {
		super(new Text("",0,0,message), new TextButton[]{
				new TextButton("",Color.yellow,Color.red) {
					{
						this.setText("Close");
					}
					
					@Override
					public boolean mD(Point mousePosition, MouseEvent e) {
						WindowManager.getInstance().setPopupOpen(false);
						return true;
					}
				}
		});
	}

}
