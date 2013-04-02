/*
 * 
 */
package atrophy.combat.items;



/**
 * The Class ArmourPlates1.
 */
public class ArmourPlates1 extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Armour Plates";
	
	/**
	 * The Constant ARMOUR_VALUE.
	 */
	public static final int ARMOUR_VALUE = 30;
	
	/**
	 * The instance.
	 */
	private static ArmourPlates1 instance;
	
	/**
	 * Gets the single instance of ArmourPlates1.
	 *
	 * @return single instance of ArmourPlates1
	 */
	public static ArmourPlates1 getInstance(){
		
		if(instance == null){
			instance = new ArmourPlates1();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new armour plates1.
	 */
	private ArmourPlates1(){
		super(NAME,"- Reduces chance of a hit being fatal by " + ARMOUR_VALUE + "%");
	}
	
}
