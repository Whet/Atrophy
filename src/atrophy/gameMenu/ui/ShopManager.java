/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.util.ArrayList;
import java.util.Random;

import watoydoEngine.fonts.FontList;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;



/**
 * The Class ShopManager.
 */
public class ShopManager{

	/**
	 * The Constant SELL_WEAKNESS.
	 */
	private static final double SELL_WEAKNESS = 0.25;
	
	/**
	 * The items.
	 */
	private ArrayList<String> items;
	
	private Squad squad;
	private WindowManager windowManager;
	private StashManager stashManager;
	private ItemMarket itemMarket;
	
	/**
	 * Instantiates a new shop manager.
	 * @param itemMarket 
	 */
	public ShopManager(WindowManager windowManager, StashManager stashManager, ItemMarket itemMarket){
		items = new ArrayList<String>();
		
		this.windowManager = windowManager;
		this.stashManager = stashManager;
		this.itemMarket = itemMarket;
	}
	
	public void lazyLoad(Squad squad) {
		this.squad = squad;
	}

	/**
	 * Sell item.
	 *
	 * @param selectedItem the selected item
	 */
	public void sellItem(String selectedItem) {
		squad.payAdvance(-sellCost(selectedItem));
		windowManager.updateWindows();
	}
	

	/**
	 * Sell cost.
	 *
	 * @param selectedItem the selected item
	 * @return the int
	 */
	public int sellCost(String selectedItem){
		return (int)(itemMarket.getItemCost(selectedItem) * SELL_WEAKNESS);
	}
	
	public int buyCost(String selectedItem){
		return itemMarket.getItemCost(selectedItem);
	}

	/**
	 * Buy item.
	 *
	 * @param i the i
	 */
	public void buyItem(int i) {
		if(squad.payAdvance(this.buyCost(this.items.get(i)))){
			stashManager.addItem(this.items.get(i));
			this.items.remove(i);
		}
		windowManager.updateWindows();
	}

	/**
	 * Gets the item.
	 *
	 * @param i the i
	 * @return the item
	 */
	public String getItem(int i) {
		if(i >= 0 && i < this.items.size())
			return FontList.digitString(5, squad.getAdvance()) + " *" + FontList.digitString(5, this.buyCost(this.items.get(i))) + "   " + this.items.get(i);
		
		return "Empty";
	}

	/**
	 * Ability cost.
	 *
	 * @param squadMember the squad member
	 * @param skill the skill
	 * @return the int
	 */
	public static int abilityCost(Squaddie squadMember, String skill) {
		switch(squadMember.getSkillLevel(skill) + 1){
			case 1:
				return 500;
			case 2:
				return 750;
			case 3:
				return 1200;
			case 4:
				return 2000;
		}
		return 99999;
	}

	/**
	 * Random items.
	 */
	public void randomItems() {
		this.items.clear();
		
		int count = new Random().nextInt(20);
		for(int i = 0; i < count; i++){
			
			this.items.add((String) itemMarket.getRandomMarketItem());
		}
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
	 * Default shop levels.
	 */
	public void randomShopItems() {
		this.randomItems();
	}

	
}
