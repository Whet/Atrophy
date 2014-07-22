package atrophy.combat.items;

public class ScienceSupply extends Item {
	
	public static final String NAME = "Scientific Supplies";

	private static ScienceSupply instance;
	
	public static ScienceSupply getInstance(){
		
		if(instance == null){
			instance = new ScienceSupply();
		}
		
		return instance;
	}
	
	private ScienceSupply(){
		super(NAME, "- Collection of items that would be useful for an scientist.");
	}
	
}
