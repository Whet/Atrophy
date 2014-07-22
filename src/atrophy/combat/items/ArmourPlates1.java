package atrophy.combat.items;

public class ArmourPlates1 extends Item {
	
	public static final String NAME = "Armour Plates";
	
	public static final int ARMOUR_VALUE = 30;
	
	private static ArmourPlates1 instance;
	
	public static ArmourPlates1 getInstance(){
		
		if(instance == null){
			instance = new ArmourPlates1();
		}
		
		return instance;
	}
	
	private ArmourPlates1(){
		super(NAME,"- Reduces chance of a hit being fatal by " + ARMOUR_VALUE + "%");
	}
	
}
