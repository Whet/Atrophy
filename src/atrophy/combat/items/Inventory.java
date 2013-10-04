package atrophy.combat.items;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
	
	private ArrayList<Item> items;
	
	public static final int MAX_SIZE = 5;
	
	public Inventory(){
		items = new ArrayList<Item>(MAX_SIZE);
	}
	
	public boolean addItem(Item newItem){
		if(this.items.size() < MAX_SIZE){
			this.items.add(newItem);
			return true;
		}
		return false;
	}
	
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
	
	public int getItemCount(){
		return this.items.size();
	}
	
	public Item getItemAt(int i){
		return this.items.get(i);
	}
	
	public void removeItemAt(int i){
		this.items.remove(i);
	}
	
	public boolean isFull() {
		return this.items.size() == MAX_SIZE;
	}

	public boolean isEmpty() {
		return this.items.size() == 0;
	}

	public Iterator<Item> getIterator() {
		return this.items.iterator();
	}

	public void removeItem(Item stockItem) {
		this.items.remove(stockItem);
	}

}
