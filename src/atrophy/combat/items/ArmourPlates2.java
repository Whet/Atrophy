/*
 * 
 */
package atrophy.combat.items;



/**
 * The Class ArmourPlates2.
 */
public class ArmourPlates2 extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Forged Armour Plates";
	
	/**
	 * The Constant ARMOUR_VALUE.
	 */
	public static final int ARMOUR_VALUE = 50;
	
	/**
	 * The instance.
	 */
	private static ArmourPlates2 instance;
	
	/**
	 * Gets the single instance of ArmourPlates2.
	 *
	 * @return single instance of ArmourPlates2
	 */
	public static ArmourPlates2 getInstance(){
		
		if(instance == null){
			instance = new ArmourPlates2();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new armour plates2.
	 */
	private ArmourPlates2(){
		super(NAME,"- Reduces chance of a hit being fatal by " + ARMOUR_VALUE + "%");
	}
	
}
