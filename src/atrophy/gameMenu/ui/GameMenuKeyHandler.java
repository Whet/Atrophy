/*
 * 
 */
package atrophy.gameMenu.ui;

import java.awt.event.KeyEvent;

import watoydoEngine.designObjects.actions.KeyboardRespondable;

public class GameMenuKeyHandler implements KeyboardRespondable{
		
	private WindowManager windowManager;
	private int actionZ;
	
	public GameMenuKeyHandler(WindowManager windowManager) {
		this.windowManager = windowManager;
		this.actionZ = 0;
	}
	
	@Override
	public void setFocus(boolean active) {
	}
	
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
	
	@Override
	public boolean kP(KeyEvent e) {
		return true;
	}
	
	@Override
	public boolean kD(KeyEvent e) {
		return true;
	}
	
	@Override
	public boolean isFocused() {
		return true;
	}

	@Override
	public int getActionZ() {
		return this.actionZ;
	}
	
}
