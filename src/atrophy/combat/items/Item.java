package atrophy.combat.items;

public abstract class Item {
	
	private String name;
	private String description;
	
	protected Item(String name, String description){
		this.name= name;
		this.description = description;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}

	public static Item stringToItem(String itemName){
		switch(itemName){
			case ArmourPlates1.NAME:
				return ArmourPlates1.getInstance();
			case ArmourPlates2.NAME:
				return ArmourPlates2.getInstance();
			case GrenadeItem.NAME:
				return GrenadeItem.getInstance();
			case LightStealthField.NAME:
				return LightStealthField.getInstance();
			case MediumStealthField.NAME:
				return MediumStealthField.getInstance();
			case ScienceScanner.NAME:
				return ScienceScanner.getInstance();
			case SensorSuite.NAME:
				return SensorSuite.getInstance();
			case SpeedBooster.NAME:
				return SpeedBooster.getInstance();
			case StunGrenadeItem.NAME:
				return StunGrenadeItem.getInstance();
			case UnitDetector.NAME:
				return UnitDetector.getInstance();
			case WeldingTorch.NAME:
				return WeldingTorch.getInstance();
			case WeaponSupply.NAME:
				return WeaponSupply.getInstance();
			case EngineeringSupply.NAME:
				return EngineeringSupply.getInstance();
			case MedicalSupply.NAME:
				return MedicalSupply.getInstance();
			case ScienceSupply.NAME:
				return ScienceSupply.getInstance();
		}
		return null;
	}

	public static boolean isItem(String item){
		if(item.equals(ArmourPlates1.NAME) ||
			item.equals(ArmourPlates2.NAME) ||
			item.equals(GrenadeItem.NAME) ||
			item.equals(LightStealthField.NAME) ||
			item.equals(MediumStealthField.NAME) ||
			item.equals(ScienceScanner.NAME) ||
			item.equals(SensorSuite.NAME) ||
			item.equals(SpeedBooster.NAME) ||
			item.equals(StunGrenadeItem.NAME) ||
			item.equals(UnitDetector.NAME) ||
			item.equals(WeldingTorch.NAME) ||
			item.equals(WeaponSupply.NAME) ||
			item.equals(EngineeringSupply.NAME) ||
			item.equals(MedicalSupply.NAME) ||
			item.equals(ScienceSupply.NAME)) {
			return true;
		}
		return false;
	}
	
}
