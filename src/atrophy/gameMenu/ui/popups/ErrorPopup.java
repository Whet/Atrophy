package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import atrophy.gameMenu.ui.WindowManager;

public class ErrorPopup extends Popup {

	public ErrorPopup(final WindowManager windowManager, String message) {
		super(windowManager, new Text(0,0,message), new TextButton[]{
				new TextButton(Color.green,Color.green.darker()) {
					{
						this.setText("Close");
					}
					
					@Override
					public boolean mD(Point mousePosition, MouseEvent e) {
						windowManager.setPopupOpen(false);
						return true;
					}
				}
		});
	}

	@Override
	public String[] getMenuInfo() {
		return null;
	}
	
}
