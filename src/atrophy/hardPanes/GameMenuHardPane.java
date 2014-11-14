package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.HardPaneDefineable;
import atrophy.combat.ai.Faction;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.GameMenuKeyHandler;
import atrophy.gameMenu.ui.MenuBar;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.StashManager;
import atrophy.gameMenu.ui.Wallpaper;
import atrophy.gameMenu.ui.WindowManager;


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
	
	@Override
	public void load(Crowd crowd){
	
		crowd.addDisplayItem(new Wallpaper());
		MenuBar menuBar = new MenuBar();
		WindowManager windowManager = new WindowManager(menuBar);
		
		missions.getPlanner(Faction.WHITE_VISTA).setWindowManager(windowManager);
		missions.getPlanner(Faction.BANDITS).setWindowManager(windowManager);
		stashManager.setWindowManager(windowManager);
		
		ItemMarket itemMarket = new ItemMarket();
		MapManager mapManager = new MapManager(missions);
		ShopManager shopManager = new ShopManager(windowManager, stashManager, itemMarket);
		
		itemMarket.lazyLoad(techTree);
		shopManager.lazyLoad(squad);
		menuBar.lazyLoad(windowManager, mapManager, missions, squad, shopManager, stashManager, techTree, itemMarket);
		stashManager.lazyLoad(shopManager);
		missions.lazyLoad(squad, stashManager, itemMarket, techTree, mapManager);
		
		crowd.addKeyListener(new GameMenuKeyHandler(windowManager));
		crowd.addCrowd(menuBar);
		crowd.addCrowd(windowManager);
		
		mapManager.updateSectors();
		shopManager.randomItems();
		missions.updatePlanners();
		missions.updateMissions();
		windowManager.createWindowsFromLayout(squad.windowLayout, missions, squad, itemMarket, techTree, stashManager, mapManager, shopManager);
		squad.windowLayout.clear();
		windowManager.updateWindows();
		
		windowManager.releaseWindowKey();
		
	}

}
