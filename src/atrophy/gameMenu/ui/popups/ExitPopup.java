package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import atrophy.gameMenu.ui.WindowManager;

public class ExitPopup extends Popup {
	
	public ExitPopup(WindowManager windowManager) {
		super(windowManager, new Text(0, 0, "Are you sure you want to exit the game?"), getOptions(windowManager));
	}

	private static TextButton[] getOptions(final WindowManager windowManager) {
		TextButton[] options = new TextButton[2];
		
		options[0] = new TextButton(Color.green,Color.green.darker()) {
			
			{
				this.setText("Confirm Exit");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				System.exit(0);
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
