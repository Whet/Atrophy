/*
 * 
 */
package atrophy.combat.items;


/**
 * The Class LightStealthField.
 */
public class LightStealthField extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Light Stealth Field";
	
	/**
	 * The instance.
	 */
	private static LightStealthField instance;
	
	/**
	 * Gets the single instance of LightStealthField.
	 *
	 * @return single instance of LightStealthField
	 */
	public static LightStealthField getInstance(){
		
		if(instance == null){
			instance = new LightStealthField();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new light stealth field.
	 */
	private LightStealthField(){
		super(NAME, "- Allows a user to become invisible while stationary. The field is not effective at extremely close range.");
	}
	
}
