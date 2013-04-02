/*
 * 
 */
package atrophy.combat.items;



/**
 * The Class MedicalSupply.
 */
public class MedicalSupply extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Medical Supplies";
	
	/**
	 * The instance.
	 */
	private static MedicalSupply instance;
	
	/**
	 * Gets the single instance of MedicalSupply.
	 *
	 * @return single instance of MedicalSupply
	 */
	public static MedicalSupply getInstance(){
		
		if(instance == null){
			instance = new MedicalSupply();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new medical supply.
	 */
	private MedicalSupply(){
		super(NAME, "- Collection of items that would be useful for an medic.");
	}
	
}
