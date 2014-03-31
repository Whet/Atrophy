package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.WindowManager;

public class ShopBuyPopup extends Popup {
	
	public ShopBuyPopup(WindowManager windowManager, ShopManager shopManager, String item, int itemIndex) {
		super(windowManager, new Text(0, 0, "Are you sure you want to buy " + item + " for " + shopManager.buyCost(item) + "?"),getOptions(windowManager, shopManager, itemIndex, shopManager.canAfford(item)));
	}

	private static TextButton[] getOptions(final WindowManager windowManager, final ShopManager shopManager, final int itemIndex, boolean canAfford) {
		TextButton[] options = new TextButton[2];
		
		if(canAfford)
		options[0] = new TextButton(Color.green,Color.green.darker()) {
			
			{
				this.setText("Buy Item");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				shopManager.buyItem(itemIndex);
				windowManager.setPopupOpen(false);
				return true;
			}
			
		};
		else
		options[0] = new TextButton(Color.red,Color.red.darker()) {
			
			{
				this.setText("Cannot Afford Item");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
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

	@Override
	public String[] getMenuInfo() {
		return null;
	}
	

}
