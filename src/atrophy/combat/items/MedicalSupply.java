package atrophy.combat.items;

public class MedicalSupply extends Item {
	
	public static final String NAME = "Medical Supplies";
	
	private static MedicalSupply instance;
	
	public static MedicalSupply getInstance(){
		
		if(instance == null){
			instance = new MedicalSupply();
		}
		
		return instance;
	}
	
	private MedicalSupply(){
		super(NAME, "- Collection of items that would be useful for an medic.");
	}
	
}
