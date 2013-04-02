/*
 * 
 */
package atrophy.combat.items;

import java.util.ArrayList;
import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class Inventory.
 */
public class Inventory {
	
	/**
	 * The items.
	 */
	private ArrayList<Item> items;
	
	/**
	 * The Constant MAX_SIZE.
	 */
	public static final int MAX_SIZE = 5;
	
	/**
	 * Instantiates a new inventory.
	 */
	public Inventory(){
		items = new ArrayList<Item>(MAX_SIZE);
	}
	
	/**
	 * Adds the item.
	 *
	 * @param newItem the new item
	 * @return true, if successful
	 *//*
	public void loot(Inventory targetInventory){
		if(targetInventory != this){
			for(int i = 0; i < targetInventory.getItemCount(); i++){
				if(addItem(targetInventory.getItemAt(i))){
					targetInventory.removeItemAt(i);
				}
			}
			targetInventory.setGrenades(0);
		}
	}*/
	
	/**
	 * Adds the item.
	 *
	 * @param newItem the new item
	 * @return true, if successful
	 */
	public boolean addItem(Item newItem){
		if(this.items.size() < MAX_SIZE){
			this.items.add(newItem);
			return true;
		}
		return false;
	}
	
	/**
	 * Checks for item.
	 *
	 * @param item the item
	 * @return true, if successful
	 */
	public boolean hasItem(Item item){
		return this.items.contains(item);
	}
	
	public boolean hasItemByName(String name) {
		for(Item item : this.items){
			if(item.getName().equals(name))
				return true;
		}
		return false;
	}
	
	/**
	 * Gets the item count.
	 *
	 * @return the item count
	 */
	public int getItemCount(){
		return this.items.size();
	}
	
	/**
	 * Gets the item at.
	 *
	 * @param i the i
	 * @return the item at
	 */
	public Item getItemAt(int i){
		return this.items.get(i);
	}
	
	/**
	 * Removes the item at.
	 *
	 * @param i the i
	 */
	public void removeItemAt(int i){
		this.items.remove(i);
	}
	
	/**
	 * Removes the grenade.
	 */
	public void removeGrenade(){
		this.items.remove(GrenadeItem.getInstance());
	}

	/**
	 * Removes the stun grenade.
	 */
	public void removeStunGrenade() {
		this.items.remove(StunGrenadeItem.getInstance());
	}

	/**
	 * Checks if is full.
	 *
	 * @return true, if is full
	 */
	public boolean isFull() {
		return this.items.size() == MAX_SIZE;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return this.items.size() == 0;
	}

	/**
	 * Gets the iterator.
	 *
	 * @return the iterator
	 */
	public Iterator<Item> getIterator() {
		return this.items.iterator();
	}

	/**
	 * Removes the item.
	 *
	 * @param stockItem the stock item
	 */
	public void removeItem(Item stockItem) {
		this.items.remove(stockItem);
	}

}
