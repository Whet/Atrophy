/*
 * 
 */
package atrophy.combat.items;


/**
 * The Class UnitDetector.
 */
public class UnitDetector extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Unit Detector";
	
	/**
	 * The instance.
	 */
	private static UnitDetector instance;
	
	/**
	 * Gets the single instance of UnitDetector.
	 *
	 * @return single instance of UnitDetector
	 */
	public static UnitDetector getInstance(){
		
		if(instance == null){
			instance = new UnitDetector();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new unit detector.
	 */
	private UnitDetector(){
		super(NAME, "- Displays suits in use in the area. Can track individuals if they are tagged.");
	}
	
}
