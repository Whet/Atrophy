/*
 * 
 */
package atrophy.gameMenu.ui;

import java.awt.AWTException;
import java.awt.Robot;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.workings.DisplayManager;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.gameMenu.ui.popups.Popup;

/**
 * The Class WindowManager.
 */
public class WindowManager extends Crowd{

	/**
	 * The popup open.
	 */
	private boolean popupOpen;
	
	/**
	 * The popup.
	 */
	private Menu popup;
	private Menu selectedMenu;
	private MenuBar menuBar;
	
	/**
	 * Instantiates a new window manager.
	 */
	public WindowManager(MenuBar menuBar){
		super(true);
		popupOpen = false;
		this.menuBar = menuBar;
	}
	
	/**
	 * Update windows.
	 */
	public void updateWindows(){
		for(int i = 0; i < this.getDisplayList().size(); i++){
			if(this.getDisplayList().get(i) instanceof Menu){
				((Menu) this.getDisplayList().get(i)).updateInformation();
			}
		}
	}
	
	/**
	 * Adds the window.
	 *
	 * @param menu the menu
	 */
	public void addWindow(Displayable parent, Menu menu){
		this.addDisplayItem(menu);
		this.addMouseActionItem(menu);
		menu.setVisible(true);
		menu.moveAll(parent.getLocation()[0] + 20, parent.getLocation()[1] + 5);
		
		this.releaseWindowKey();
		this.requestWindowKey(menu);
		this.computeZOrder();
	}
	
	/**
	 * Adds the popup.
	 *
	 * @param popup the popup
	 */
	public void addPopup(Menu invoker, Menu popup){
		
		if(invoker != null){
			invoker.setPriorityMode(false);
		}
		
		this.setPopupOpen(true);
		this.addDisplayItem(popup);
		this.addMouseActionItem(popup);
		popup.setVisible(true);
		popup.moveAll(DisplayManager.getInstance().getResolution()[0] / 2 - popup.getSize()[0] / 2,
					  DisplayManager.getInstance().getResolution()[1] / 2 - popup.getSize()[1] / 2);
		menuBar.setVisible(false);
		this.popup = popup;
		
		// move mouse to popup
		try {
			Robot robut = new Robot();
			robut.mouseMove(ActivePane.getInstance().getLocationOnScreen().x + (int)(popup.getLocation()[0] + 24),
							ActivePane.getInstance().getLocationOnScreen().y + (int)(popup.getLocation()[1] + Popup.VERTICAL_SPACE * 4 - 6));
		} 
		catch (AWTException e) {}
	}

	/**
	 * Checks if is popup visible.
	 *
	 * @return true, if is popup visible
	 */
	public boolean isPopupVisible() {
		return popupOpen;
	}
	
	/**
	 * Open popup.
	 *
	 * @param popup the popup
	 */
	public void openPopup(Menu popup){
		this.addDisplayItem(popup);
		this.addMouseActionItem(popup);
		this.popup = popup;
	}
	
	/**
	 * Sets the popup open.
	 *
	 * @param open the new popup open
	 */
	public void setPopupOpen(boolean open){
		this.popupOpen = open;
		
		if(open){
			for(int i = 0; i < this.getDisplayList().size(); i++){
				if(this.getDisplayList().get(i) instanceof Menu){
					((Menu) this.getDisplayList().get(i)).setVisible(false);
				}
			}
		}
		else{
			
			if(popup != null){
				this.getDisplayList().remove(popup);
				this.getMouseActionList().remove(popup);
				popup = null;
			}
			
			for(int i = 0; i < this.getDisplayList().size(); i++){
				if(this.getDisplayList().get(i) instanceof Menu){
					((Menu) this.getDisplayList().get(i)).setVisible(true);
					((Menu) this.getDisplayList().get(i)).updateInformation();
				}
			}
			
			menuBar.setVisible(true);
		}
	}

	// Sets all window.z values to their minimum (nearest to 0) without changing order
	// done so that windowz will not overflow when menus are constantly opened and closed
	/**
	 * Defrag window z.
	 */
	public void defragWindowZ() {
		int i;
		
		for(i = 0; i < this.getDisplayList().size(); i++){
			if(this.getDisplayList().get(i) instanceof Menu){
				this.getDisplayList().get(i).setZ(i);
				this.getMouseActionList().get(i).setActionZ(i);
			}
		}
		
		Menu.windowZ = i + 1;
	}
	
	public boolean requestWindowKey(Menu menu){
		if(selectedMenu == null || menu == selectedMenu){
			selectedMenu = menu;
			return true;
		}
		return false;
	}
	
	public boolean releaseWindowKey(Menu menu){
		if(menu == selectedMenu){
			selectedMenu = null;
			return true;
		}
		return false;
	}
	
	public void releaseWindowKey(){
		selectedMenu = null;
	}
	
}
