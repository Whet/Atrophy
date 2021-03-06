/*
 * 
 */
package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.HardPaneDefineable;
import atrophy.gameMenu.ui.Menu;
import atrophy.splash.CharacterCreateMenu;


// TODO: Auto-generated Javadoc
/**
 * The Class CharacterCreatePane.
 */
public class CharacterCreatePane implements HardPaneDefineable{

	/* (non-Javadoc)
	 * @see watoydoEngine.hardPanes.ModdableHardPane#load(java.lang.String, watoydoEngine.designObjects.display.Crowd)
	 */
	public void load(Crowd crowd){
		
		clearOld();
		
		crowd.addCrowd(new CharacterCreateMenu());
		
	}

	/**
	 * Clear old.
	 */
	public static void clearOld() {
		Menu.windowZ = 0;
	}

}
