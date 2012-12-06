/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items.resources;

import atrophy.combat.items.Item;


/**
 * The Class WeaponSupply.
 */
public class WeaponSupply extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Weapon Supplies";
	
	/**
	 * The instance.
	 */
	private static WeaponSupply instance;
	
	/**
	 * Gets the single instance of WeaponSupply.
	 *
	 * @return single instance of WeaponSupply
	 */
	public static WeaponSupply getInstance(){
		
		if(instance == null){
			instance = new WeaponSupply();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new weapon supply.
	 */
	private WeaponSupply(){
		super(NAME, "- Collection of items that could be used to make weapons.");
	}
	
}
