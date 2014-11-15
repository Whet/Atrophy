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
			item.equals(LightStealthField.NAME) ||
			item.equals(MediumStealthField.NAME) ||
			item.equals(ScienceScanner.NAME) ||
			item.equals(SensorSuite.NAME) ||
			item.equals(SpeedBooster.NAME) ||
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

	public static String correctBlankSpaces(String itemName) {
		String returnName = itemName;
		switch(itemName) {
			case "HarpoonCannon":
				returnName = "Harpoon Cannon";
			break;
			case "HarpoonCannon+":
				returnName = "Harpoon Cannon+";
			break;
			case "HeavyPistol":
				returnName = "Heavy Pistol";
			break;
			case "HeavyPistol+":
				returnName = "Heavy Pistol+";
			break;
			case "HeavyShotgun":
				returnName = "Heavy Shotgun";
			break;
			case "LightPistol":
				returnName = "Light Pistol";
			break;
			case "LightPistol+":
				returnName = "Light Pistol+";
			break;
			case "PlasmaRifle":
				returnName = "Plasma Rifle";
			break;
			case "PlasmaRifle+":
				returnName = "Plasma Rifle+";
			break;
			case "Railgun":
				returnName = "Railgun";
			break;
			case "ScrapWeapon":
				returnName = "Scrap Weapon";
			break;
			case "ArmourPlates":
				returnName = "Armour Plates";
			break;
			case "ForgedArmourPlates":
				returnName = "Forged Armour Plates";
			break;
			case "StunGrenade":
				returnName = "Stun Grenade";
			break;
			case "LightStealthField":
				returnName = "Light Stealth Field";
			break;
			case "MediumStealthField":
				returnName = "Medium Stealth Field";
			break;
			case "ScientificScanner":
				returnName = "Scientific Scanner";
			break;
			case "SensorSuite":
				returnName = "Sensor Suite";
			break;
			case "SpeedBooster":
				returnName = "Speed Booster";
			break;
			case "WeldingTorch":
				returnName = "Welding Torch";
			break;
			case "UnitDetector":
				returnName = "Unit Detector";
			break;
			case "EngineeringSupplies":
				returnName = "Engineering Supplies";
			break;
			case "MedicalSupplies":
				returnName = "Medical Supplies";
			break;
			case "ScientificSupplies":
				returnName = "Scientific Supplies";
			break;
			case "WeaponSupplies":
				returnName = "Weapon Supplies";
			break;
		}
		
		return returnName;
	}
	
}
