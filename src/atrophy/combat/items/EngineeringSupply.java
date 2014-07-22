package atrophy.combat.items;

public class EngineeringSupply extends Item {
	
	public static final String NAME = "Engineering Supplies";
	
	private static EngineeringSupply instance;
	
	public static EngineeringSupply getInstance(){
		
		if(instance == null){
			instance = new EngineeringSupply();
		}
		
		return instance;
	}
	
	private EngineeringSupply(){
		super(NAME, "- Collection of items that would be useful for an engineer.");
	}
	
}
