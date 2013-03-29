/*
 * 
 */
package atrophy.splash;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.SaveFile;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.MenuBar;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.StashManager;
import atrophy.gameMenu.ui.WindowManager;
import atrophy.hardPanes.CharacterCreatePane;
import atrophy.hardPanes.GameMenuHardPane;

/**
 * The Class SplashMenu.
 */
public class SplashMenu extends Crowd {

	/**
	 * Instantiates a new splash menu.
	 */
	public SplashMenu() {
		super(true);
		addButtons();
	}

	/**
	 * Adds the buttons.
	 */
	private void addButtons() {
		
		TextButton newGame = new TextButton(Color.yellow, Color.red) {
			
			{
				this.setText("New Game");
				this.setVisible(true);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ActivePane.getInstance().changePane(new Crowd(new CharacterCreatePane()));
				return true;
			}
		};
		
		newGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 50);
		this.addMouseActionItem(newGame);
		this.addDisplayItem(newGame);
		
		TextButton loadGame = new TextButton(Color.yellow, Color.red) {
			
			{
				this.setText("Load");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				
				ActivePane.getInstance().setVisible(false);
				
				JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "/Atrophy"));
				int returnValue = chooser.showOpenDialog(new JFrame());
				
				if(returnValue == JFileChooser.APPROVE_OPTION){
					
					MenuBar menuBar = new MenuBar();
					WindowManager windowManager = new WindowManager(menuBar);
					StashManager stashManager = new StashManager(windowManager);
					TechTree techTree = new TechTree();
					ItemMarket itemMarket = new ItemMarket(techTree);
					Missions missions = new Missions();
					MapManager mapWar = new MapManager(missions);
					ShopManager shopManager = new ShopManager(windowManager, stashManager, itemMarket);
					Squad squad = SaveFile.loadGame(chooser.getSelectedFile(), stashManager, mapWar, shopManager, missions, windowManager);
					
					shopManager.lazyLoad(squad);
					menuBar.lazyLoad(windowManager, mapWar, missions, squad, shopManager, stashManager, techTree, itemMarket);
					stashManager.lazyLoad(shopManager);
					missions.lazyLoad(squad, stashManager, itemMarket, techTree);
					
					ActivePane.getInstance().changePane(new Crowd(new GameMenuHardPane(squad, techTree, stashManager, missions)));
				}
				
				ActivePane.getInstance().setVisible(true);
//				windowManager.updateWindows();
				return true;
			}
		};
		loadGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 70);
		this.addMouseActionItem(loadGame);
		this.addDisplayItem(loadGame);
	}
	
	

}
