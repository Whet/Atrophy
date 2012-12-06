/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.util.ArrayList;
import java.util.Random;

import atrophy.combat.items.resources.EngineeringSupply;
import atrophy.combat.items.resources.ScienceSupply;
import atrophy.combat.items.resources.WeaponSupply;
import atrophy.gameMenu.saveFile.ItemMarket;
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
	 * The instance.
	 */
	private static ShopManager instance;
	
	/**
	 * Gets the single instance of ShopManager.
	 *
	 * @return single instance of ShopManager
	 */
	public static ShopManager getInstance(){
		if(instance == null){
			instance = new ShopManager();
		}
		return instance;
	}
	
	/**
	 * The items.
	 */
	private ArrayList<String> items;
	
	/**
	 * Instantiates a new shop manager.
	 */
	private ShopManager(){
		items = new ArrayList<String>();
	}

	/**
	 * Sell item.
	 *
	 * @param selectedItem the selected item
	 */
	public void sellItem(String selectedItem) {
		
		levelUpItem(selectedItem);
		
		SquadMenu.getSquad().payAdvance(-sellCost(selectedItem));
		WindowManager.getInstance().updateWindows();
	}
	
	/**
	 * Level up item.
	 *
	 * @param selectedItem the selected item
	 */
	private void levelUpItem(String selectedItem) {
		switch(selectedItem){
			case WeaponSupply.NAME:
				WindowManager.getInstance().updateWindows();
			break;
			case EngineeringSupply.NAME:
				WindowManager.getInstance().updateWindows();
			break;
			case ScienceSupply.NAME:
				WindowManager.getInstance().updateWindows();
			break;
		}
	}

	/**
	 * Sell cost.
	 *
	 * @param selectedItem the selected item
	 * @return the int
	 */
	public int sellCost(String selectedItem){
		return (int)(ItemMarket.getInstance().getItemCost(selectedItem) * SELL_WEAKNESS);
	}
	
	public int buyCost(String selectedItem){
		return ItemMarket.getInstance().getItemCost(selectedItem);
	}

	/**
	 * Buy item.
	 *
	 * @param i the i
	 */
	public void buyItem(int i) {
		if(SquadMenu.getSquad().payAdvance(this.buyCost(this.items.get(i)))){
			StashManager.getInstance().addItem(this.items.get(i));
			this.items.remove(i);
		}
		WindowManager.getInstance().updateWindows();
	}

	/**
	 * Gets the item.
	 *
	 * @param i the i
	 * @return the item
	 */
	public String getItem(int i) {
		if(i >= 0 && i < this.items.size())
			return this.items.get(i) + "  " + SquadMenu.getSquad().getAdvance() + " / " + this.buyCost(this.items.get(i));
		return "Empty";
	}

	/**
	 * Ability cost.
	 *
	 * @param squadMember the squad member
	 * @param skill the skill
	 * @return the int
	 */
	public int abilityCost(Squaddie squadMember, String skill) {
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
			
			if(new Random().nextBoolean())
				this.items.add(getRandomItem());
			else
				this.items.add(getRandomWeapon());
		}
	}

	private String getRandomItem() {
		return ItemMarket.getInstance().getRandomItem();
	}

	private String getRandomWeapon() {
		return ItemMarket.getInstance().getRandomWeapon();
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
