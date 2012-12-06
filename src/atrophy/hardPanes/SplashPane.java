/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.ModdableHardPane;
import watoydoEngine.sounds.SoundBoard;
import atrophy.gameMenu.ui.Menu;
import atrophy.splash.SplashMenu;


// TODO: Auto-generated Javadoc
/**
 * The Class SplashPane.
 */
public class SplashPane extends ModdableHardPane{
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "SplashPane";

	/* (non-Javadoc)
	 * @see watoydoEngine.hardPanes.ModdableHardPane#load(java.lang.String, watoydoEngine.designObjects.display.Crowd)
	 */
	public void load(String tag, Crowd crowd){
		
		SoundBoard.getInstance().startMusic();
		
		clearOld();
		crowd.setTemplate(NAME);
		
		crowd.addCrowd(new SplashMenu());
		
		loadSoftPane(tag,crowd);
	}

	/**
	 * Clear old.
	 */
	public static void clearOld() {
		Menu.windowZ = 0;
	}
	
}
