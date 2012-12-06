/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
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
import atrophy.gameMenu.saveFile.MapWar;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.SaveFile;
import atrophy.gameMenu.saveFile.TechTree;

/**
 * The Class MenuBar.
 */
public class MenuBar extends Crowd{

	/**
	 * The instance.
	 */
	private static MenuBar instance;
	
	/**
	 * Gets the single instance of MenuBar.
	 *
	 * @return single instance of MenuBar
	 */
	public static MenuBar getInstance(){
		if(instance == null){
			instance = new MenuBar();
		}
		return instance;
	}
	
	/**
	 * Instantiates a new menu bar.
	 */
	private MenuBar() {
		super("MenuBar",true);
		
		this.setLocation(10, 60);
		
		addTextButtons();
	}

	/**
	 * Adds the text buttons.
	 */
	private void addTextButtons() {
		
		TextButton mapSelection = new TextButton("MapSelection", Color.yellow, Color.red) {
			
			{
				this.setText("Map Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				SectorsMenu menu = new SectorsMenu();
				WindowManager.getInstance().addWindow(menu);
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		mapSelection.setLocation(this.getLocation()[0] + 4, this.getLocation()[1]);
		this.addMouseActionItem(mapSelection);
		this.addDisplayItem(mapSelection);
		
		TextButton squadMenu = new TextButton("SquadMenu", Color.yellow, Color.red) {
			
			{
				this.setText("Squad Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				SquadMenu menu = new SquadMenu();
				WindowManager.getInstance().addWindow(menu);
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		squadMenu.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 20);
		this.addMouseActionItem(squadMenu);
		this.addDisplayItem(squadMenu);
		
		TextButton missionMenu = new TextButton("MissionsMenu", Color.yellow, Color.red) {
			
			{
				this.setText("Missions Menu");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
//				SquadLogin popup = new SquadLogin();
//				WindowManager.getInstance().addPopup(null,popup);
				WindowManager.getInstance().addWindow(new MissionsMenu());
				SoundBoard.getInstance().playEffect("tick");
				return true;
			}
		};
		missionMenu.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 40);
		this.addMouseActionItem(missionMenu);
		this.addDisplayItem(missionMenu);
		
		TextButton saveGame = new TextButton("Save", Color.yellow, Color.red) {
			
			{
				this.setText("Save");
				this.setVisible(true);
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				
				ActivePane.getInstance().setVisible(false);
				
				JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "/Atrophy"));
				
				int returnValue = chooser.showSaveDialog(new JFrame());
				
				if(returnValue == JFileChooser.APPROVE_OPTION){
					SaveFile.saveGame(chooser.getSelectedFile(), SquadMenu.getSquad(), MapWar.getInstance().getSectors(), StashManager.getInstance().getItems(), TechTree.getInstance(), Missions.getInstance().getMemCodes());
				}
				
				ActivePane.getInstance().setVisible(true);
				return true;
			}
		};
		saveGame.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 75);
		this.addMouseActionItem(saveGame);
		this.addDisplayItem(saveGame);
		
		TextButton loadGame = new TextButton("Load", Color.yellow, Color.red) {
			
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
					SaveFile.loadGame(chooser.getSelectedFile());
				}
				
				ActivePane.getInstance().setVisible(true);
				WindowManager.getInstance().updateWindows();
				return true;
			}
		};
		loadGame.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 100);
		this.addMouseActionItem(loadGame);
		this.addDisplayItem(loadGame);
		
		
	}

}
