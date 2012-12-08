/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;



/**
 * The Class ScienceSupply.
 */
public class ScienceSupply extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Scientific Supplies";
	
	/**
	 * The instance.
	 */
	private static ScienceSupply instance;
	
	/**
	 * Gets the single instance of ScienceSupply.
	 *
	 * @return single instance of ScienceSupply
	 */
	public static ScienceSupply getInstance(){
		
		if(instance == null){
			instance = new ScienceSupply();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new science supply.
	 */
	private ScienceSupply(){
		super(NAME, "- Collection of items that would be useful for an scientist.");
	}
	
}
