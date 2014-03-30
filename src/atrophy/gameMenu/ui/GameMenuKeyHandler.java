/*
 * 
 */
package atrophy.gameMenu.ui;

import java.awt.event.KeyEvent;

import watoydoEngine.designObjects.actions.KeyboardRespondable;
import watoydoEngine.workings.displayActivity.ActivePane;

/**
 * The Class GameMenuKeyHandler.
 */
public class GameMenuKeyHandler implements KeyboardRespondable{
		
	private WindowManager windowManager;
	private int actionZ;
	
	public GameMenuKeyHandler(WindowManager windowManager) {
		this.windowManager = windowManager;
		this.actionZ = 0;
	}
	
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
//		System.out.println(e.getKeyCode());
		
		if(!windowManager.isPopupVisible())
		switch(e.getKeyCode()){
			// Esc
			case 27:
//				ActivePane.getInstance().closeWindow();
			break;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kP(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kP(KeyEvent e) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kD(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kD(KeyEvent e) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#isFocused()
	 */
	@Override
	public boolean isFocused() {
		return true;
	}

	@Override
	public int getActionZ() {
		return this.actionZ;
	}
	
}
