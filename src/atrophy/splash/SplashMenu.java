/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
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
import atrophy.gameMenu.saveFile.SaveFile;
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
		super("Splash", true);
		addButtons();
	}

	/**
	 * Adds the buttons.
	 */
	private void addButtons() {
		
		TextButton newGame = new TextButton("New Game", Color.yellow, Color.red) {
			
			{
				this.setText("New Game");
				this.setVisible(true);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ActivePane.getInstance().changePane(new Crowd("CurrentPane",false,new CharacterCreatePane()));
				return true;
			}
		};
		
		newGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 50);
		this.addMouseActionItem(newGame);
		this.addDisplayItem(newGame);
		
		TextButton loadGame = new TextButton("Load", Color.yellow, Color.red) {
			
			{
				this.setText("Load");
				this.setVisible(true);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				
				ActivePane.getInstance().setVisible(false);
				
				JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "/Atrophy"));
				int returnValue = chooser.showOpenDialog(new JFrame());
				
				if(returnValue == JFileChooser.APPROVE_OPTION){
					ActivePane.getInstance().changePane(new Crowd("CurrentPane",false,new GameMenuHardPane()));
					SaveFile.loadGame(chooser.getSelectedFile());
				}
				
				ActivePane.getInstance().setVisible(true);
				WindowManager.getInstance().updateWindows();
				return true;
			}
		};
		loadGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 70);
		this.addMouseActionItem(loadGame);
		this.addDisplayItem(loadGame);
	}
	
	

}
