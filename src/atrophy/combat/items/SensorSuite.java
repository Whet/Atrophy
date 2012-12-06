/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;


/**
 * The Class SensorSuite.
 */
public class SensorSuite extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Sensor Suite";
	
	/**
	 * The instance.
	 */
	private static SensorSuite instance;
	
	/**
	 * Gets the single instance of SensorSuite.
	 *
	 * @return single instance of SensorSuite
	 */
	public static SensorSuite getInstance(){
		
		if(instance == null){
			instance = new SensorSuite();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new sensor suite.
	 */
	private SensorSuite(){
		super(NAME, "- While in use, the user has an extended field of view");
	}
	
}
