/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.ModdableHardPane;
import atrophy.gameMenu.saveFile.MapWar;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.ui.GameMenuKeyHandler;
import atrophy.gameMenu.ui.MenuBar;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.WindowManager;


// TODO: Auto-generated Javadoc
/**
 * The Class GameMenuHardPane.
 */
public class GameMenuHardPane extends ModdableHardPane{
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "GameMenuHardPane";

	/* (non-Javadoc)
	 * @see watoydoEngine.hardPanes.ModdableHardPane#load(java.lang.String, watoydoEngine.designObjects.display.Crowd)
	 */
	public void load(String tag, Crowd crowd){
		
		clearOld();
		
		crowd.setTemplate(NAME);
		
		crowd.addKeyListener(new GameMenuKeyHandler());
		
		crowd.addCrowd(MenuBar.getInstance());
		crowd.addCrowd(WindowManager.getInstance());
		
		MapWar.getInstance().updateOwnership();
		ShopManager.getInstance().randomItems();
		Missions.getInstance().updateMissions();
		
		WindowManager.getInstance().updateWindows();
		
		WindowManager.getInstance().releaseWindowKey();
		
		loadSoftPane(tag,crowd);
	}

	/**
	 * Clear old.
	 */
	public static void clearOld() {
		WindowManager.getInstance().defragWindowZ();
	}
	
}
