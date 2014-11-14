package atrophy.splash;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.io.ReadWriter;
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
import atrophy.gameMenu.ui.Wallpaper;
import atrophy.gameMenu.ui.WindowManager;
import atrophy.hardPanes.CharacterCreatePane;
import atrophy.hardPanes.GameMenuHardPane;

public class SplashMenu extends Crowd {

	public SplashMenu() {
		super(true);
		this.addDisplayItem(new Wallpaper());
		addButtons();
	}

	private void addButtons() {
		
		TextButton newGame = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("New Game");
				this.setVisible(true);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ActivePane.getInstance().changeRootCrowd(new Crowd(new CharacterCreatePane()));
				return true;
			}
		};
		
		newGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 50);
		this.addMouseActionItem(newGame);
		this.addDisplayItem(newGame);
		
		TextButton loadGame = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("Load Game");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				
				ActivePane.getInstance().setVisible(false);
				
				JFileChooser chooser = new JFileChooser(new File(ReadWriter.HOME_LOCATION + "/GameData/Saves"));
				FileFilter filter = new FileNameExtensionFilter("Atrophy save files", SaveFile.FILE_EXT);
				chooser.setFileFilter(filter);
				
				int returnValue = chooser.showOpenDialog(new JFrame());
				
				if(returnValue == JFileChooser.APPROVE_OPTION){
					
					MenuBar menuBar = new MenuBar();
					WindowManager windowManager = new WindowManager(menuBar);
					StashManager stashManager = new StashManager(windowManager);
					Missions missions = new Missions();
					MapManager mapManager = new MapManager(missions);
					ItemMarket itemMarket = new ItemMarket();
					ShopManager shopManager = new ShopManager(windowManager, stashManager, itemMarket);
					Squad squad = SaveFile.loadGame(chooser.getSelectedFile(), stashManager, mapManager, missions, windowManager, itemMarket);
					
					TechTree techTree = squad.getTechTree();
					
					shopManager.lazyLoad(squad);
					menuBar.lazyLoad(windowManager, mapManager, missions, squad, shopManager, stashManager, techTree, itemMarket);
					stashManager.lazyLoad(shopManager);
					missions.lazyLoad(squad, stashManager, itemMarket, techTree, mapManager);
					
					ActivePane.getInstance().changeRootCrowd(new Crowd(new GameMenuHardPane(squad, techTree, stashManager, missions)));
				}
				
				ActivePane.getInstance().setVisible(true);
				return true;
			}
		};
		loadGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 70);
		this.addMouseActionItem(loadGame);
		this.addDisplayItem(loadGame);
		
		TextButton exitGame = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("Exit");
				this.setVisible(true);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				System.exit(0);
				return true;
			}
		};
		
		exitGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 90);
		this.addMouseActionItem(exitGame);
		this.addDisplayItem(exitGame);
		
	}
	
	

}
