/*
 * 
 */
package atrophy.gameMenu.ui;

import java.util.ArrayList;

import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.Weapon;
import atrophy.combat.items.WeaponSupply;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.popups.ShopSellPopup;

/**
 * The Class StashManager.
 */
public class StashManager {

	/**
	 * The items.
	 */
	protected ArrayList<String> items = new ArrayList<String>();
	
	/**
	 * The selected item.
	 */
	protected String selectedItem;
	
	private ShopManager shopManager;
	private WindowManager windowManager;
	
	public StashManager(WindowManager windowManager){
		this.items = new ArrayList<>();
		this.windowManager = windowManager;
		
		for(int i = 0; i < 100; i++){
			this.items.add(WeaponSupply.NAME);
			this.items.add(EngineeringSupply.NAME);
			this.items.add(ScienceSupply.NAME);
			this.items.add(MedicalSupply.NAME);
			this.items.add(WeaponSupply.NAME);
		}
	}
	
	public void lazyLoad(ShopManager shopManager) {
		this.shopManager = shopManager;
	}
	
	/**
	 * Adds the item.
	 *
	 * @param item the item
	 */
	public void addItem(String item){
		this.items.add(item);
	}
	
	/**
	 * Transfer item.
	 *
	 * @param squadMember the squad member
	 * @return true, if successful
	 */
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
	
	/**
	 * Transfer item.
	 *
	 * @return true, if successful
	 */
	public boolean transferItem(Menu invoker) {
		if(selectedItem != null && !selectedItem.isEmpty()){
			ShopSellPopup popup = new ShopSellPopup(windowManager, shopManager, this, this.selectedItem);
			windowManager.addPopup(invoker,popup);
			this.selectedItem = "";
			return true;
		}
		return false;
	}
	
	/**
	 * Sell item.
	 */
	public void sellItem(){
		if(selectedItem != null && !selectedItem.isEmpty()){
			shopManager.sellItem(selectedItem);
			this.selectedItem = "";
		}
	}
	
	/**
	 * Sets the selected item.
	 *
	 * @param i the new selected item
	 */
	public void setSelectedItem(int i){
		if(i >= 0 && i < items.size())
		this.selectedItem = items.get(i);
	}

	/**
	 * Gets the item.
	 *
	 * @param i the i
	 * @return the item
	 */
	public String getItem(int i) {
		if(i >= 0 && i < items.size()){
			return items.get(i);
		}
		return "Empty";
	}

	/**
	 * Gets the item count.
	 *
	 * @return the item count
	 */
	public int getItemCount() {
		return this.items.size();
	}
	
	/**
	 * Removes the item.
	 *
	 * @param item the item
	 */
	public void removeItem(String item) {
		this.items.remove(item);
	}

	/**
	 * Sets the items.
	 *
	 * @param stash the new items
	 */
	public void setItems(ArrayList<String> stash) {
		this.items = stash;
	}

	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public ArrayList<String> getItems() {
		return this.items;
	}

	/**
	 * Default stash.
	 */
	public void defaultStash() {
		this.items.clear();
	}

	/**
	 * Removes the selected item.
	 */
	public void removeSelectedItem() {
		this.selectedItem = "";
	}

	public void setWindowManager(WindowManager windowManager) {
		this.windowManager = windowManager;
	}
	
}
