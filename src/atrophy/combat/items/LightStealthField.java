package atrophy.combat.items;

public class LightStealthField extends Item {
	
	public static final String NAME = "Light Stealth Field";
	
	private static LightStealthField instance;
	
	public static LightStealthField getInstance(){
		
		if(instance == null){
			instance = new LightStealthField();
		}
		
		return instance;
	}
	
	private LightStealthField(){
		super(NAME, "- Allows a user to become invisible while stationary. The field is not effective at extremely close range.");
	}
	
}
