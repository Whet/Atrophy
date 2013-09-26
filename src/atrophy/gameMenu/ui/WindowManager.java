package atrophy.gameMenu.ui;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.workings.DisplayManager;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.WindowInfo;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.popups.Popup;

public class WindowManager extends Crowd{

	private boolean popupOpen;
	private Menu popup;
	private Menu selectedMenu;
	private MenuBar menuBar;
	
	public WindowManager(MenuBar menuBar){
		super(true);
		popupOpen = false;
		this.menuBar = menuBar;
	}
	
	public void updateWindows(){
		for(int i = 0; i < this.getDisplayList().size(); i++){
			if(this.getDisplayList().get(i) instanceof Menu){
				((Menu) this.getDisplayList().get(i)).updateInformation();
			}
		}
	}
	
	public void addWindow(Displayable parent, Menu menu){
		this.addDisplayItem(menu);
		this.addMouseActionItem(menu);
		menu.setVisible(true);
		
		if(parent != null)
			menu.moveAll(parent.getLocation()[0] + 20, parent.getLocation()[1] + 5);
		
		this.releaseWindowKey();
		this.requestWindowKey(menu);
		this.computeZOrder();
	}
	
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

	public boolean isPopupVisible() {
		return popupOpen;
	}
	
	public void openPopup(Menu popup){
		this.addDisplayItem(popup);
		this.addMouseActionItem(popup);
		this.popup = popup;
	}
	
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

	public List<Menu> getWindows() {
		List<Menu> menus = new ArrayList<>();
		
		for(Displayable m: this.getDisplayList()) {
			menus.add((Menu) m);
		}
		
		return menus;
	}
	
	public void createWindowsFromLayout(List<WindowInfo> windows, Missions missions, Squad squad, ItemMarket itemMarket, TechTree techTree, StashManager stashManager, MapManager mapManager, ShopManager shopManager) {
		for(WindowInfo window:windows) {
			
			switch(window.info[0]) {
				case "MapsMenu":
				MapsMenu menu = new MapsMenu(this, missions, squad, mapManager.getSector(window.info[1]), itemMarket, techTree, stashManager);
				menu.moveAll(window.location[0], window.location[1]);
				addWindow(null, menu);
				break;
				case "MissionsMenu":
				MissionsMenu menu2 = new MissionsMenu(this, missions, stashManager);
				menu2.moveAll(window.location[0], window.location[1]);
				addWindow(null,	menu2);
				break;
				case "SectorsMenu":
				SectorsMenu menu3 = new SectorsMenu(mapManager, this, missions, squad, itemMarket, techTree, stashManager);
				menu3.moveAll(window.location[0], window.location[1]);
				addWindow(null, menu3);
				break;
				case "ShopMenu":
				ShopMenu menu4 = new ShopMenu(this, shopManager, stashManager);
				menu4.moveAll(window.location[0], window.location[1]);
				addWindow(null, menu4);
				break;
				case "SquadMemberMenu":
				SquadMemberMenu menu5 = new SquadMemberMenu(this, squad, stashManager, Integer.parseInt(window.info[1]));
				menu5.moveAll(window.location[0], window.location[1]);
				addWindow(null, menu5);
				break;
				case "SquadMenu":
				SquadMenu menu6 = new SquadMenu(this, shopManager, stashManager, squad, techTree);
				menu6.moveAll(window.location[0], window.location[1]);
				addWindow(null, menu6);
				break;
				case "StashMenu":
				StashMenu menu7 = new StashMenu(this, stashManager);
				menu7.moveAll(window.location[0], window.location[1]);
				addWindow(null, menu7);
				break;
				case "NewsMenu":
				NewsMenu menu8 = new NewsMenu(this, missions);
				menu8.moveAll(window.location[0], window.location[1]);
				addWindow(null, menu8);
				break;
			}
			
		}
	}
	
}
