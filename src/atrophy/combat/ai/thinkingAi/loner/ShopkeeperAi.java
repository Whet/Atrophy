/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.thinkingAi.loner;

import java.util.Random;

import atrophy.combat.CombatUiManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Item;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.StunGrenadeItem;

/**
 * The Class ShopkeeperAi.
 */
public class ShopkeeperAi extends LonerAi {

	/**
	 * The shop type.
	 */
	protected int shopType;
	
	/**
	 * The stock item.
	 */
	private Item stockItem;
	
	/**
	 * Instantiates a new shopkeeper ai.
	 *
	 * @param randomName the random name
	 * @param d the d
	 * @param e the e
	 */
	public ShopkeeperAi(String randomName, double d, double e) {
		super(randomName, d, e);
		
		stockItem = randomItem();
		this.getInventory().addItem(stockItem);
		
		shopType = 0;
	}

	/**
	 * Random item.
	 *
	 * @return the item
	 */
	private Item randomItem() {
		Item item = null;
		switch(new Random().nextInt(4)){
			case 0:
				item = GrenadeItem.getInstance();
			break;
			case 1:
				item = StunGrenadeItem.getInstance();
			break;
			case 2:
				item = MediumStealthField.getInstance();
			break;
			case 3:
				item = LightStealthField.getInstance();
			break;
			default:
				item = LightStealthField.getInstance();
			break;
		}
		return item;
	}

	/**
	 * Checks if is in stock.
	 *
	 * @return true, if is in stock
	 */
	public boolean isInStock(){
		
		if(!this.getInventory().hasItem(stockItem)){
			this.stockItem = null;
		}
		
		return stockItem != null;
	}
	
	/**
	 * Gets the item name.
	 *
	 * @return the item name
	 */
	public String getItemName(){
		return stockItem.getName();
	}
	
	/**
	 * Give item.
	 *
	 * @param target the target
	 */
	public void giveItem(Ai target){
		if(!target.getInventory().isFull()){
			target.getInventory().addItem(stockItem);
			this.getInventory().removeItem(stockItem);
			this.stockItem = null;
			this.assignAbilities();
			target.assignAbilities();
			CombatUiManager.getInstance().updateUi();
		}
	}
	
	/**
	 * Gets the shop type.
	 *
	 * @return the shop type
	 */
	public int getShopType() {
		return shopType;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.loner.LonerAi#willJoinPlayer(atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean willJoinPlayer(Ai player) {
		if(!this.isInStock() && this.getAggression() < 0){
			return true;
		}
		return false;
	}

}
