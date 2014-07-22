package atrophy.combat.items;

public class WeaponSupply extends Item {
	
	public static final String NAME = "Weapon Supplies";
	
	private static WeaponSupply instance;
	
	public static WeaponSupply getInstance(){
		
		if(instance == null){
			instance = new WeaponSupply();
		}
		
		return instance;
	}
	
	private WeaponSupply(){
		super(NAME, "- Collection of items that could be used to make weapons.");
	}
	
}
