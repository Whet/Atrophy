/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;


/**
 * The Class ObjectiveScanner.
 */
public class ScienceScanner extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Scientific Scanner";
	
	/**
	 * The instance.
	 */
	private static ScienceScanner instance;
	
	/**
	 * Gets the single instance of ObjectiveScanner.
	 *
	 * @return single instance of ObjectiveScanner
	 */
	public static ScienceScanner getInstance(){
		
		if(instance == null){
			instance = new ScienceScanner();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new objective scanner.
	 */
	private ScienceScanner(){
		super(NAME, "- Allows user to take scientific readings for the room they're in.");
	}
	
}
