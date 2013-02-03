/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;


/**
 * The Class LightStealthField.
 */
public class HackTool extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Software Hacker";
	
	/**
	 * The instance.
	 */
	private static HackTool instance;
	
	/**
	 * Gets the single instance of LightStealthField.
	 *
	 * @return single instance of LightStealthField
	 */
	public static HackTool getInstance(){
		
		if(instance == null){
			instance = new HackTool();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new light stealth field.
	 */
	private HackTool(){
		super(NAME, "- Allows the user to hack targets such as turrets to change their behaviour");
	}
	
}
