/*
 * 
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.SaveFile;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;

/**
 * The Class MenuBar.
 */
public class MenuBar extends Crowd{
	
	/**
	 * Instantiates a new menu bar.
	 * @param windowManager 
	 * @param mapWar 
	 * @param missions 
	 * @param shopManager 
	 * @param stashManager 
	 */
	public MenuBar() {
		super(true);
		
		this.setLocation(10, 60);
	}

	public void lazyLoad(WindowManager windowManager, MapManager mapWar, Missions missions, Squad squad, ShopManager shopManager, StashManager stashManager, TechTree techTree, ItemMarket itemMarket) {
		addTextButtons(windowManager, mapWar, missions, squad, shopManager, stashManager, techTree, itemMarket);
	}
	
	/**
	 * Adds the text buttons.
	 */
	private void addTextButtons(final WindowManager windowManager, final MapManager mapWar, final Missions missions, final Squad squad, final ShopManager shopManager, final StashManager stashManager, final TechTree techTree, final ItemMarket itemMarket) {
		
		TextButton mapSelection = new TextButton(Color.yellow, Color.red) {
			
			{
				this.setText("Map Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				SectorsMenu menu = new SectorsMenu(mapWar, windowManager, missions, squad, itemMarket, techTree, stashManager);
				windowManager.addWindow(menu);
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		mapSelection.setLocation(this.getLocation()[0] + 4, this.getLocation()[1]);
		this.addMouseActionItem(mapSelection);
		this.addDisplayItem(mapSelection);
		
		TextButton squadMenu = new TextButton(Color.yellow, Color.red) {
			
			{
				this.setText("Squad Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				SquadMenu menu = new SquadMenu(windowManager, shopManager, stashManager, squad, techTree);
				windowManager.addWindow(menu);
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		squadMenu.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 20);
		this.addMouseActionItem(squadMenu);
		this.addDisplayItem(squadMenu);
		
		TextButton missionMenu = new TextButton(Color.yellow, Color.red) {
			
			{
				this.setText("Missions Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				windowManager.addWindow(new MissionsMenu(windowManager, missions, stashManager));
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		missionMenu.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 40);
		this.addMouseActionItem(missionMenu);
		this.addDisplayItem(missionMenu);
		
		TextButton saveGame = new TextButton(Color.yellow, Color.red) {
			
			{
				this.setText("Save & Exit");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				
				ActivePane.getInstance().setVisible(false);
				
				if(!SaveFile.saveLocation.isEmpty()) {
					SaveFile.saveGame(new File(SaveFile.saveLocation), squad, missions, mapWar.getSectors(), stashManager.getItems(), techTree, missions.getMemCodes());
				}
				else {
					JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "/Atrophy"));
					
					int returnValue = chooser.showSaveDialog(new JFrame());
					
					if(returnValue == JFileChooser.APPROVE_OPTION){
						SaveFile.saveGame(chooser.getSelectedFile(), squad, missions, mapWar.getSectors(), stashManager.getItems(), techTree, missions.getMemCodes());
					}
					else{
						ActivePane.getInstance().setVisible(true);
						return true;
					}
				}
				
				System.exit(0);
				
				return true;
			}
		};
		saveGame.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 75);
		this.addMouseActionItem(saveGame);
		this.addDisplayItem(saveGame);
		
//		TextButton loadGame = new TextButton("Load", Color.yellow, Color.red) {
//			
//			{
//				this.setText("Load");
//				this.setVisible(true);
//			}
//			
//			@Override
//			public boolean mU(Point mousePosition, MouseEvent e) {
//				
//				ActivePane.getInstance().setVisible(false);
//				
//				JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "/Atrophy"));
//				int returnValue = chooser.showOpenDialog(new JFrame());
//				
//				if(returnValue == JFileChooser.APPROVE_OPTION){
//					SaveFile.loadGame(chooser.getSelectedFile(), stashManager, mapWar, shopManager, missions, windowManager);
//				}
//				
//				ActivePane.getInstance().setVisible(true);
//				windowManager.updateWindows();
//				return true;
//			}
//		};
//		loadGame.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 100);
//		this.addMouseActionItem(loadGame);
//		this.addDisplayItem(loadGame);
		
		
	}

}
