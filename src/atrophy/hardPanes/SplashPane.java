/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.HardPaneDefineable;
import watoydoEngine.sounds.SoundBoard;
import atrophy.gameMenu.ui.Menu;
import atrophy.splash.SplashMenu;


// TODO: Auto-generated Javadoc
/**
 * The Class SplashPane.
 */
public class SplashPane implements HardPaneDefineable{
	
	/* (non-Javadoc)
	 * @see watoydoEngine.hardPanes.ModdableHardPane#load(java.lang.String, watoydoEngine.designObjects.display.Crowd)
	 */
	public void load(Crowd crowd){
		
		SoundBoard.getInstance().startMusic();
		
		clearOld();
		
		crowd.addCrowd(new SplashMenu());
		
	}

	/**
	 * Clear old.
	 */
	public static void clearOld() {
		Menu.windowZ = 0;
	}
	
}
