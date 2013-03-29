/*
 * 
 */
package atrophy.combat.items;


/**
 * The Class GrenadeItem.
 */
public class GrenadeItem extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Grenade";
	
	/**
	 * The instance.
	 */
	private static GrenadeItem instance;
	
	/**
	 * Gets the single instance of GrenadeItem.
	 *
	 * @return single instance of GrenadeItem
	 */
	public static GrenadeItem getInstance(){
		
		if(instance == null){
			instance = new GrenadeItem();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new grenade item.
	 */
	private GrenadeItem(){
		super(NAME, "- Explodes once timer counts down. Can be used to clear entire rooms.");
	}
	
}
