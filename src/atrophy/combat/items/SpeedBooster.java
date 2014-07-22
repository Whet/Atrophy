package atrophy.combat.items;

public class SpeedBooster extends Item {
	
	public static final String NAME = "Speed Booster";
	
	private static SpeedBooster instance;
	
	public static SpeedBooster getInstance(){
		
		if(instance == null){
			instance = new SpeedBooster();
		}
		
		return instance;
	}
	
	private SpeedBooster(){
		super(NAME,"- Increases the distance covered per turn.");
	}
	
}
