package atrophy.combat.items;

public class ArmourPlates2 extends Item {
	
	public static final String NAME = "Forged Armour Plates";
	
	public static final int ARMOUR_VALUE = 50;
	
	private static ArmourPlates2 instance;
	
	public static ArmourPlates2 getInstance(){
		
		if(instance == null){
			instance = new ArmourPlates2();
		}
		
		return instance;
	}
	
	private ArmourPlates2(){
		super(NAME,"- Dramatically reduce chance of a hit being fatal");
	}
	
}
