package atrophy.combat.items;

public class ScienceScanner extends Item {

	public static final String NAME = "Scientific Scanner";
	
	private static ScienceScanner instance;
	
	public static ScienceScanner getInstance(){
		
		if(instance == null){
			instance = new ScienceScanner();
		}
		
		return instance;
	}
	
	private ScienceScanner(){
		super(NAME, "- Allows user to take scientific readings for the room they're in.");
	}
	
}
