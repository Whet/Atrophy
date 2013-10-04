/*
 * 
 */
package watoydoEngine.designObjects.actions;

import java.awt.event.KeyEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class KeyboardHandler.
 */
public abstract class KeyboardHandler implements KeyboardRespondable{
	
	/**
	 * The focused.
	 */
	private boolean focused;
	
	private int actionZ;
	
	/**
	 * Instantiates a new keyboard handler.
	 */
	public KeyboardHandler(){
		focused = true;
		this.actionZ = 0;
	}
	
	public int getActionZ() {
		return actionZ;
	}

	public void setActionZ(int actionZ) {
		this.actionZ = actionZ;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kD(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kD(KeyEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kU(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kU(KeyEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kP(java.awt.event.KeyEvent)
	 */
	@Override
	public boolean kP(KeyEvent e) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#isFocused()
	 */
	@Override
	public boolean isFocused() {
		return this.focused;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#setFocus(boolean)
	 */
	@Override
	public void setFocus(boolean active) {
		this.focused = active;
	}

}
