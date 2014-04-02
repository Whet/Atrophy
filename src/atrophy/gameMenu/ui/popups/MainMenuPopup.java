package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.gameMenu.ui.WindowManager;
import atrophy.hardPanes.SplashPane;

public class MainMenuPopup extends Popup {
	
	public MainMenuPopup(WindowManager windowManager) {
		super(windowManager, new Text(0, 0, "Are you sure you want to go to the main menu?"), getOptions(windowManager));
	}

	private static TextButton[] getOptions(final WindowManager windowManager) {
		TextButton[] options = new TextButton[2];
		
		options[0] = new TextButton(Color.green,Color.green.darker()) {
			
			{
				this.setText("Confirm Main Menu");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ActivePane.getInstance().changeRootCrowd(new Crowd(new SplashPane()));
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
