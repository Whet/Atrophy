package atrophy.gameMenu.saveFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import atrophy.combat.items.ArmourPlates1;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.KillTags;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.SpeedBooster;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.items.WeldingTorch;
import atrophy.combat.items.resources.EngineeringSupply;
import atrophy.combat.items.resources.MedicalSupply;
import atrophy.combat.items.resources.ScienceSupply;
import atrophy.combat.items.resources.WeaponSupply;
import atrophy.combat.items.weapons.Harpoon1;
import atrophy.combat.items.weapons.Harpoon2;
import atrophy.combat.items.weapons.MeleeWeapon1;
import atrophy.combat.items.weapons.MeleeWeapon2;
import atrophy.combat.items.weapons.Pistol1;
import atrophy.combat.items.weapons.Pistol2;
import atrophy.combat.items.weapons.Pistol3;
import atrophy.combat.items.weapons.Pistol4;
import atrophy.combat.items.weapons.Plasma1;
import atrophy.combat.items.weapons.Plasma2;
import atrophy.combat.items.weapons.Railgun;
import atrophy.combat.items.weapons.Shotgun1;

public class ItemMarket {

	private static ItemMarket instance;
	
	public static ItemMarket getInstance(){
		if(instance == null)
			instance = new ItemMarket();
		return instance;
	}
	
	private static final Map<String, ItemData> itemData = new HashMap<String, ItemData>();

	{
		itemData.put(MeleeWeapon1.NAME, 			new ItemData(20,TechTree.SPACE_WALKING,true));
		itemData.put(MeleeWeapon2.NAME, 			new ItemData(40,TechTree.SPACE_WALKING,true));
		itemData.put(Harpoon1.NAME, 				new ItemData(400,TechTree.MECHANICAL_WEAPONS,true));
		itemData.put(Harpoon2.NAME, 				new ItemData(600,TechTree.CALIBRATION,true));
		itemData.put(Pistol1.NAME, 					new ItemData(800,TechTree.FIREARMS,true));
		itemData.put(Pistol2.NAME, 					new ItemData(1000,TechTree.IMPROVED_FIREARMS,true));
		itemData.put(Pistol3.NAME,					new ItemData(1200,TechTree.AP_FIREARMS,true));
		itemData.put(Pistol4.NAME, 					new ItemData(1400,TechTree.IMPROVED_AP_FIREARMS,true));
		itemData.put(Plasma1.NAME, 					new ItemData(1400,TechTree.ADVANCED_WEAPONRY,true));
		itemData.put(Plasma2.NAME, 					new ItemData(1800,TechTree.PLASMA_CONTAINMENT,true));
		itemData.put(Railgun.NAME, 					new ItemData(8000,TechTree.SUPER_PROJECTILES,true));
		itemData.put(Shotgun1.NAME, 				new ItemData(3000,TechTree.CONFLICT_WEAPONRY,true));
		
		itemData.put(ArmourPlates1.NAME, 			new ItemData(300,TechTree.SPACE_WALKING,false));
		itemData.put(ArmourPlates2.NAME, 			new ItemData(800,TechTree.HEAVY_ARMOUR,false));
		itemData.put(GrenadeItem.NAME, 				new ItemData(300,TechTree.BASIC_EXPLOSIVES,false));
		itemData.put(StunGrenadeItem.NAME, 			new ItemData(240,TechTree.BASIC_INCAPACITATION,false));
		itemData.put(LightStealthField.NAME, 		new ItemData(5000,TechTree.STATIONARY_CLOAKING,false));
		itemData.put(MediumStealthField.NAME, 		new ItemData(5000,TechTree.MOBILE_CLOAKING,false));
		itemData.put(ScienceScanner.NAME, 			new ItemData(3200,TechTree.SCIENTIFIC_OBSERVATIONS,false));
		itemData.put(SensorSuite.NAME, 				new ItemData(5000,TechTree.OPTICS,false));
		itemData.put(SpeedBooster.NAME, 			new ItemData(3200,TechTree.ADVANCED_SUIT_THRUSTERS,false));
		itemData.put(UnitDetector.NAME, 			new ItemData(1200,TechTree.SUIT_COMMUNICATION,false));
		itemData.put(KillTags.NAME, 				new ItemData(600,TechTree.BOUNTY_HUNTING,false));
		itemData.put(WeldingTorch.NAME, 			new ItemData(1000,TechTree.BASIC_TOOLS,false));
	}
	
	private Set<String> weaponsInMarket;
	private Set<String> itemsInMarket;
	
	public ItemMarket(){
		this.weaponsInMarket = new HashSet<String>();
		this.itemsInMarket = new HashSet<String>();
		
		updateMarket();
	}
	
	
	private void updateMarket() {
		Iterator<String> itemIt = itemData.keySet().iterator();
		
		while(itemIt.hasNext()){
			String next = itemIt.next();
			
			if(itemData.get(next).isUnlocked())
				if(itemData.get(next).isWeapon)
					weaponsInMarket.add(next);
				else
					itemsInMarket.add(next);
				
		}
	}


	public int getItemCost(String selectedItem){
		return itemCost(selectedItem);
	}

	public int itemCost(String selectedItem) {
		switch(selectedItem){
			case MedicalSupply.NAME:
				return 160;
			case WeaponSupply.NAME:
				return 100;
			case EngineeringSupply.NAME:
				return 80;
			case ScienceSupply.NAME:
				return 400;
		}
		return itemData.get(selectedItem).cost;
	}
	
	
	private static class ItemData{
		public final int cost;
		public final String requiredTechnology;
		public final boolean isWeapon;
		
		public ItemData(int cost, String requiredTechnology, boolean isWeapon){
			this.cost = cost;
			this.requiredTechnology = requiredTechnology;
			this.isWeapon = isWeapon;
		}
		
		public boolean isUnlocked(){
			return TechTree.getInstance().isResearched(requiredTechnology);
		}
	}


	public ArrayList<String> getLonerAllowedItems() {
		return new ArrayList<>(instance.itemsInMarket);
	}


	public ArrayList<String> getLonerAllowedWeapons() {
		return new ArrayList<>(instance.weaponsInMarket);
	}
	
	public ArrayList<String> getBanditsAllowedItems() {
		return new ArrayList<>(instance.itemsInMarket);
	}
	
	public ArrayList<String> getBanditsAllowedWeapons() {
		return new ArrayList<>(instance.weaponsInMarket);
	}
	
	public ArrayList<String> getWhiteVistaAllowedItems() {
		return new ArrayList<>(instance.itemsInMarket);
	}
	
	public ArrayList<String> getWhiteVistaAllowedWeapons() {
		return new ArrayList<>(instance.weaponsInMarket);
	}


	public Object getRandomMarketItem() {
		
		if(new Random().nextBoolean())
			return getRandomItem();
		
		return getRandomWeapon();
		
	}

	public String getRandomItem() {
		return new ArrayList<>(instance.itemsInMarket).get(new Random().nextInt(instance.itemsInMarket.size()));
	}

	public String getRandomWeapon() {
		return new ArrayList<>(instance.weaponsInMarket).get(new Random().nextInt(instance.weaponsInMarket.size()));
	}
	
}
