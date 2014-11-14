package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.HardPaneDefineable;
import atrophy.gameMenu.ui.Menu;
import atrophy.splash.CharacterCreateMenu;


public class CharacterCreatePane implements HardPaneDefineable{

	@Override
	public void load(Crowd crowd){
		
		clearOld();
		
		crowd.addCrowd(new CharacterCreateMenu());
		
	}

	public static void clearOld() {
		Menu.windowZ = 0;
	}

}
