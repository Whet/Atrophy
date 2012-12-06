/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;

/**
 * The Class Item.
 */
public abstract class Item {
	
	/**
	 * The name.
	 */
	private String name;
	
	/**
	 * The description.
	 */
	private String description;
	
	/**
	 * Instantiates a new item.
	 *
	 * @param name the name
	 * @param description the description
	 */
	protected Item(String name, String description){
		this.name= name;
		this.description = description;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
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
			case KillTags.NAME:
				return KillTags.getInstance();
		}
		return null;
	}
	
}
