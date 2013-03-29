/*
 * 
 */
package atrophy.combat.display.ui.loot;

import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.Inventory;
import atrophy.combat.items.Item;
import atrophy.combat.items.Weapon;

/**
 * The Class LootContainer.
 */
public class LootContainer implements Lootable{

	/**
	 * The weapon.
	 */
	private Weapon weapon;
	
	/**
	 * The inventory.
	 */
	private Inventory inventory;
	
	/**
	 * Instantiates a new loot container.
	 */
	public LootContainer(){
		weapon = null;
		inventory = new Inventory();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.loot.LootBox.Lootable#getWeapon()
	 */
	@Override
	public Weapon getWeapon() {
		return this.weapon;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.loot.LootBox.Lootable#setWeapon(atrophy.combat.items.weapons.Weapon)
	 */
	@Override
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.loot.LootBox.Lootable#getInventory()
	 */
	@Override
	public Inventory getInventory() {
		return this.inventory;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.loot.LootBox.Lootable#assignAbilities()
	 */
	@Override
	public void assignAbilities() {}

	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.loot.LootBox.Lootable#addItem(atrophy.combat.items.Item)
	 */
	@Override
	public void addItem(Item item) {
		this.inventory.addItem(item);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.loot.LootBox.Lootable#getName()
	 */
	@Override
	public String getName() {
		return "Equipment Stash";
	}
	
}
