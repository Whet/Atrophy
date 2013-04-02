/*
 * 
 */
package atrophy.combat.items;



/**
 * The Class SpeedBooster.
 */
public class SpeedBooster extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Speed Booster";
	
	/**
	 * The instance.
	 */
	private static SpeedBooster instance;
	
	/**
	 * Gets the single instance of SpeedBooster.
	 *
	 * @return single instance of SpeedBooster
	 */
	public static SpeedBooster getInstance(){
		
		if(instance == null){
			instance = new SpeedBooster();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new speed booster.
	 */
	private SpeedBooster(){
		super(NAME,"- Increases the distance covered per turn.");
	}
	
}
