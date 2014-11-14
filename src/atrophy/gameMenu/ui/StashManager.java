package atrophy.gameMenu.ui;

import java.util.ArrayList;

import atrophy.combat.items.Weapon;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.popups.ShopSellPopup;

public class StashManager {

	protected ArrayList<String> items = new ArrayList<String>();
	protected String selectedItem;
	
	private ShopManager shopManager;
	private WindowManager windowManager;
	
	public StashManager(WindowManager windowManager){
		this.items = new ArrayList<>();
		this.windowManager = windowManager;
	}
	
	public void lazyLoad(ShopManager shopManager) {
		this.shopManager = shopManager;
	}
	
	public void addItem(String item){
		this.items.add(item);
	}
	
	public boolean transferItem(Squaddie squadMember){
		if(selectedItem != null && !selectedItem.isEmpty() && Weapon.isWeapon(selectedItem) && !squadMember.isVehicle()){
			this.addItem(squadMember.getWeapon());
			squadMember.setWeapon(selectedItem);
			items.remove(selectedItem);
			this.selectedItem = "";
			return true;
		}
		else if(squadMember.hasSpace() && selectedItem != null && !selectedItem.isEmpty() && !Weapon.isWeapon(selectedItem)){
			squadMember.addItem(selectedItem);
			items.remove(selectedItem);
			this.selectedItem = "";
			return true;
		}
		this.selectedItem = "";
		return false;
	}
	
	public boolean transferItem(Menu invoker) {
		if(selectedItem != null && !selectedItem.isEmpty()){
			ShopSellPopup popup = new ShopSellPopup(windowManager, shopManager, this, this.selectedItem);
			windowManager.addPopup(invoker,popup);
			this.selectedItem = "";
			return true;
		}
		return false;
	}
	
	public void sellItem(){
		if(selectedItem != null && !selectedItem.isEmpty()){
			shopManager.sellItem(selectedItem);
			this.selectedItem = "";
		}
	}
	
	public void setSelectedItem(int i){
		if(i >= 0 && i < items.size())
		this.selectedItem = items.get(i);
	}

	public String getItem(int i) {
		if(i >= 0 && i < items.size()){
			return items.get(i);
		}
		return "Empty";
	}

	public int getItemCount() {
		return this.items.size();
	}
	
	public void removeItem(String item) {
		this.items.remove(item);
	}

	public void setItems(ArrayList<String> stash) {
		this.items = stash;
	}

	public ArrayList<String> getItems() {
		return this.items;
	}

	public void defaultStash() {
		this.items.clear();
	}

	public void removeSelectedItem() {
		this.selectedItem = "";
	}

	public void setWindowManager(WindowManager windowManager) {
		this.windowManager = windowManager;
	}
	
}
