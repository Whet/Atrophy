/*
 * 
 */
package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.HardPaneDefineable;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.GameMenuKeyHandler;
import atrophy.gameMenu.ui.MenuBar;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.StashManager;
import atrophy.gameMenu.ui.WindowManager;


// TODO: Auto-generated Javadoc
/**
 * The Class GameMenuHardPane.
 */
public class GameMenuHardPane implements HardPaneDefineable{
	
	private Squad squad;
	private TechTree techTree;
	private StashManager stashManager;
	private Missions missions;
	
	public GameMenuHardPane(Squad squad, TechTree techTree, StashManager stashManager, Missions missions) {
		this.squad = squad;
		this.techTree = techTree;
		this.stashManager = stashManager;
		this.missions = missions;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.hardPanes.ModdableHardPane#load(java.lang.String, watoydoEngine.designObjects.display.Crowd)
	 */
	public void load(Crowd crowd){
	
		MenuBar menuBar = new MenuBar();
		WindowManager windowManager = new WindowManager(menuBar);
		stashManager.setWindowManager(windowManager);
		ItemMarket itemMarket = new ItemMarket(techTree);
		MapManager mapWar = new MapManager(missions);
		ShopManager shopManager = new ShopManager(windowManager, stashManager, itemMarket);
		
		shopManager.lazyLoad(squad);
		menuBar.lazyLoad(windowManager, mapWar, missions, squad, shopManager, stashManager, techTree, itemMarket);
		stashManager.lazyLoad(shopManager);
		missions.lazyLoad(squad, stashManager, itemMarket, techTree);
		
		crowd.addKeyListener(new GameMenuKeyHandler(windowManager));
		crowd.addCrowd(menuBar);
		crowd.addCrowd(windowManager);
		
		mapWar.updateSectors();
		shopManager.randomItems();
		missions.updateMissions();
		
		windowManager.updateWindows();
		
		windowManager.releaseWindowKey();
		
	}

}
