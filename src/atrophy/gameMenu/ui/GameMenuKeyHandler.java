/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import watoydoEngine.designObjects.actions.KeyboardRespondable;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.gameMenu.saveFile.MapWar;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.SaveFile;
import atrophy.gameMenu.saveFile.TechTree;

/**
 * The Class GameMenuKeyHandler.
 */
public class GameMenuKeyHandler implements KeyboardRespondable{
		
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#setFocus(boolean)
	 */
	@Override
	public void setFocus(boolean active) {
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kU(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kU(KeyEvent e) {
		System.out.println(e.getKeyCode());
		
		if(!WindowManager.getInstance().isPopupVisible())
		switch(e.getKeyCode()){
			
			// M
			case 77:
				WindowManager.getInstance().addWindow(new SectorsMenu());
			break;
			
			// N
			case 78:
				WindowManager.getInstance().addWindow(new SquadMenu());
			break;
			
			// B
			case 79:
				WindowManager.getInstance().addWindow(new MissionsMenu());
			break;
			
			// L
			case 76:
				WindowManager.getInstance().addWindow(new StashMenu());
			break;
			
			// K
			case 75:
				WindowManager.getInstance().addWindow(new ShopMenu());
			break;
			
			// F5
			case 116:
				ActivePane.getInstance().setVisible(false);
				
				JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "/Atrophy"));
				
				int returnValue = chooser.showSaveDialog(new JFrame());
				
				if(returnValue == JFileChooser.APPROVE_OPTION){
					SaveFile.saveGame(chooser.getSelectedFile(), SquadMenu.getSquad(), MapWar.getInstance().getSectors(), StashManager.getInstance().getItems(), TechTree.getInstance(), Missions.getInstance().getMemCodes());
				}
				
				ActivePane.getInstance().setVisible(true);
			break;
			
			// F9
			case 120:
				ActivePane.getInstance().setVisible(false);
				
				JFileChooser chooser1 = new JFileChooser(new File(System.getProperty("user.home") + "/Atrophy"));
				int returnValue1 = chooser1.showOpenDialog(new JFrame());
				
				if(returnValue1 == JFileChooser.APPROVE_OPTION){
					SaveFile.loadGame(chooser1.getSelectedFile());
				}
				
				ActivePane.getInstance().setVisible(true);
				WindowManager.getInstance().updateWindows();
			break;
		
			// Esc
			case 27:
				ActivePane.getInstance().closeWindow();
			break;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kP(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kP(KeyEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kD(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kD(KeyEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#isFocused()
	 */
	@Override
	public boolean isFocused() {
		return true;
	}
	
}
