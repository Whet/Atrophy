package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.ai.AiGenerator;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.SaveFile;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;

public class MenuBar extends Crowd{
	
	public MenuBar() {
		super(true);
		
		this.setLocation(10, 60);
	}

	public void lazyLoad(WindowManager windowManager, MapManager mapWar, Missions missions, Squad squad, ShopManager shopManager, StashManager stashManager, TechTree techTree, ItemMarket itemMarket) {
		addTextButtons(windowManager, mapWar, missions, squad, shopManager, stashManager, techTree, itemMarket);
	}
	
	private void addTextButtons(final WindowManager windowManager, final MapManager mapWar, final Missions missions, final Squad squad, final ShopManager shopManager, final StashManager stashManager, final TechTree techTree, final ItemMarket itemMarket) {
		
		TextButton mapSelection = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("Map Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				SectorsMenu menu = new SectorsMenu(mapWar, windowManager, missions, squad, itemMarket, techTree, stashManager);
				windowManager.addWindow(MenuBar.this, menu);
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		mapSelection.setLocation(this.getLocation()[0] + 4, this.getLocation()[1]);
		this.addMouseActionItem(mapSelection);
		this.addDisplayItem(mapSelection);
		
		TextButton squadMenu = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("Squad Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				SquadMenu menu = new SquadMenu(windowManager, shopManager, stashManager, squad, techTree);
				windowManager.addWindow(MenuBar.this, menu);
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		squadMenu.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 20);
		this.addMouseActionItem(squadMenu);
		this.addDisplayItem(squadMenu);
		
		TextButton missionMenu = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("Missions Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				windowManager.addWindow(MenuBar.this, new MissionsMenu(windowManager, missions, stashManager));
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		missionMenu.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 40);
		this.addMouseActionItem(missionMenu);
		this.addDisplayItem(missionMenu);
		
		TextButton saveGame = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("Save");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				
				if(!SaveFile.saveLocation.isEmpty()) {
					SaveFile.saveGame(new File(SaveFile.saveLocation), squad, missions, mapWar.getSectors(), stashManager.getItems(), techTree, missions.getMemCodes(), windowManager);
					ActivePane.getInstance().setVisible(true);
				}
				else {
					ActivePane.getInstance().setVisible(false);
					
					JFileChooser chooser = new JFileChooser(new File(ReadWriter.HOME_LOCATION + "/GameData/Saves"));
					
					int returnValue = chooser.showSaveDialog(new JFrame());
					
					if(returnValue == JFileChooser.APPROVE_OPTION){
						SaveFile.saveGame(chooser.getSelectedFile(), squad, missions, mapWar.getSectors(), stashManager.getItems(), techTree, missions.getMemCodes(), windowManager);
						ActivePane.getInstance().setVisible(true);
					}
					else{
						ActivePane.getInstance().setVisible(true);
						return true;
					}
				}
				
				return true;
			}
		};
		saveGame.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 75);
		this.addMouseActionItem(saveGame);
		this.addDisplayItem(saveGame);
		
		Text newsTicker = new Text();
		this.addDisplayItem(newsTicker);
		
		newsTicker.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 115);
		
		newsTicker.setColour(Color.orange);
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("NEWS@nWHITE VISTA@n");

		sb.append(missions.getPlanner(AiGenerator.WHITE_VISTA).getNews() + "@n@nBANDITS@n");
		
		sb.append(missions.getPlanner(AiGenerator.BANDITS).getNews());
		
		newsTicker.setText(sb.toString());
		
	}

}
