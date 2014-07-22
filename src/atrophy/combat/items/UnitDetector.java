package atrophy.combat.items;

public class UnitDetector extends Item {
	
	public static final String NAME = "Unit Detector";
	
	private static UnitDetector instance;
	
	public static UnitDetector getInstance(){
		
		if(instance == null){
			instance = new UnitDetector();
		}
		
		return instance;
	}
	
	private UnitDetector(){
		super(NAME, "- Displays suits in use in the area. Can track individuals if they are tagged.");
	}
	
}
