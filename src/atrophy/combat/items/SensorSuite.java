package atrophy.combat.items;

public class SensorSuite extends Item {
	
	public static final String NAME = "Sensor Suite";
	
	private static SensorSuite instance;

	public static SensorSuite getInstance(){
		
		if(instance == null){
			instance = new SensorSuite();
		}
		
		return instance;
	}
	
	private SensorSuite(){
		super(NAME, "- While in use, the user has an extended field of view");
	}
	
}
