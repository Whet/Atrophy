/*
 * 
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
	public ShopSellPopup(WindowManager windowManager, ShopManager shopManager, StashManager stashManager, String item) {
		super(windowManager, new Text(0, 0, "Are you sure you want to sell " + item + " for " + shopManager.sellCost(item) + "?"),getOptions(windowManager, shopManager, stashManager, item));
	}

	/**
	 * Gets the options.
	 *
	 * @param item the item
	 * @return the options
	 */
	private static TextButton[] getOptions(final WindowManager windowManager, final ShopManager shopManager, final StashManager stashManager, final String item) {
		TextButton[] options = new TextButton[2];
		
		options[0] = new TextButton(Color.green,Color.green.darker()) {
			
			{
				this.setText("Sell Item");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				shopManager.sellItem(item);
				stashManager.removeItem(item);
				windowManager.setPopupOpen(false);
				return true;
			}
			
		};
		
		options[1] = new TextButton(Color.yellow,Color.red) {
			
			{
				this.setText("Cancel");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				windowManager.setPopupOpen(false);
				return true;
			}
			
		};
		
		return options;
	}

}
