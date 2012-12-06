/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;


/**
 * The Class MediumStealthField.
 */
public class MediumStealthField extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Medium Stealth Field";
	
	/**
	 * The instance.
	 */
	private static MediumStealthField instance;
	
	/**
	 * Gets the single instance of MediumStealthField.
	 *
	 * @return single instance of MediumStealthField
	 */
	public static MediumStealthField getInstance(){
		
		if(instance == null){
			instance = new MediumStealthField();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new medium stealth field.
	 */
	private MediumStealthField(){
		super(NAME, "- Allows a user to become invisible while moving.\nThe field is not effective at extremely close range.");
	}
	
}
