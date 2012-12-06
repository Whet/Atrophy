/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.StashManager;
import atrophy.gameMenu.ui.WindowManager;

/**
 * The Class ShopSellPopup.
 */
public class ShopSellPopup extends Popup {
	
	/**
	 * Instantiates a new shop sell popup.
	 *
	 * @param item the item
	 */
	public ShopSellPopup(String item) {
		super(new Text("", 0, 0, "Are you sure you want to sell " + item + " for " + ShopManager.getInstance().sellCost(item) + "?"),getOptions(item));
	}

	/**
	 * Gets the options.
	 *
	 * @param item the item
	 * @return the options
	 */
	private static TextButton[] getOptions(final String item) {
		TextButton[] options = new TextButton[2];
		
		options[0] = new TextButton("",Color.green,Color.green.darker()) {
			
			{
				this.setText("Sell Item");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ShopManager.getInstance().sellItem(item);
				StashManager.getInstance().removeItem(item);
				WindowManager.getInstance().setPopupOpen(false);
				return true;
			}
			
		};
		
		options[1] = new TextButton("",Color.yellow,Color.red) {
			
			{
				this.setText("Cancel");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				WindowManager.getInstance().setPopupOpen(false);
				return true;
			}
			
		};
		
		return options;
	}

}
