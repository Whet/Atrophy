/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;


/**
 * The Class KillTags.
 */
public class KillTags extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Cad' Tags";
	
	/**
	 * The instance.
	 */
	private static KillTags instance;
	
	/**
	 * Gets the single instance of KillTags.
	 *
	 * @return single instance of KillTags
	 */
	public static KillTags getInstance(){
		
		if(instance == null){
			instance = new KillTags();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new kill tags.
	 */
	private KillTags(){
		super(NAME, "- Used to log the death of a person.");
	}
	
}
