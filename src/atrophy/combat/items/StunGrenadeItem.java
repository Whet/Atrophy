/*
 * 
 */
package atrophy.combat.items;


/**
 * The Class StunGrenadeItem.
 */
public class StunGrenadeItem extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Stun Grenade";
	
	/**
	 * The instance.
	 */
	private static StunGrenadeItem instance;
	
	/**
	 * Gets the single instance of StunGrenadeItem.
	 *
	 * @return single instance of StunGrenadeItem
	 */
	public static StunGrenadeItem getInstance(){
		
		if(instance == null){
			instance = new StunGrenadeItem();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new stun grenade item.
	 */
	private StunGrenadeItem(){
		super(NAME, "- Explodes once timer counts down. Stuns everyone in a room.");
	}
	
}
