package atrophy.combat.items;

public class MediumStealthField extends Item {
	
	public static final String NAME = "Medium Stealth Field";
	
	private static MediumStealthField instance;
	
	public static MediumStealthField getInstance(){
		
		if(instance == null){
			instance = new MediumStealthField();
		}
		
		return instance;
	}
	
	private MediumStealthField(){
		super(NAME, "- Allows a user to become invisible while moving.\nThe field is not effective at extremely close range.");
	}
	
}
