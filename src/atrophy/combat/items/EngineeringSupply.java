/*
 * 
 */
package atrophy.combat.items;



/**
 * The Class EngineeringSupply.
 */
public class EngineeringSupply extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Engineering Supplies";
	
	/**
	 * The instance.
	 */
	private static EngineeringSupply instance;
	
	/**
	 * Gets the single instance of EngineeringSupply.
	 *
	 * @return single instance of EngineeringSupply
	 */
	public static EngineeringSupply getInstance(){
		
		if(instance == null){
			instance = new EngineeringSupply();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new engineering supply.
	 */
	private EngineeringSupply(){
		super(NAME, "- Collection of items that would be useful for an engineer.");
	}
	
}
