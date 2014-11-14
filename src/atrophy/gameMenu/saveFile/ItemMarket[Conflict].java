package atrophy.gameMenu.saveFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.items.ArmourPlates1;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.Harpoon1;
import atrophy.combat.items.Harpoon2;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.MeleeWeapon2;
import atrophy.combat.items.Pistol1;
import atrophy.combat.items.Pistol2;
import atrophy.combat.items.Pistol3;
import atrophy.combat.items.Pistol4;
import atrophy.combat.items.Plasma1;
import atrophy.combat.items.Plasma2;
import atrophy.combat.items.Railgun;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.Shotgun1;
import atrophy.combat.items.SpeedBooster;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.items.WeaponSupply;
import atrophy.combat.items.WeldingTorch;

public class ItemMarket {

	private Map<String, ItemData> itemData = new HashMap<String, ItemData>();
	private Set<String> weaponsInMarket;
	private Set<String> itemsInMarket;
	private Set<String> banditItems;
	private Set<String> banditWeapons;
	private Set<String> wvItems;
	private Set<String> wvWeapons;
	
	public ItemMarket(){
		
		this.weaponsInMarket = new HashSet<String>();
		this.itemsInMarket = new HashSet<String>();
		this.banditItems = new HashSet<String>();
		this.banditWeapons = new HashSet<String>();
		this.wvItems = new HashSet<String>();
		this.wvWeapons = new HashSet<String>();
	}
	
	public void lazyLoad(TechTree techTree) {
		loadItemData(techTree);
		updateMarket();
	}
	
	private void loadItemData(TechTree techTree) {
		itemData.put(MeleeWeapon1.NAME, 			new ItemData(techTree, 20,TechTree.SPACE_WALKING,true));
		itemData.put(MeleeWeapon2.NAME, 			new ItemData(techTree, 40,TechTree.SPACE_WALKING,true));
		itemData.put(Harpoon1.NAME, 				new ItemData(techTree, 400,TechTree.MECHANICAL_WEAPONS,true));
		itemData.put(Harpoon2.NAME, 				new ItemData(techTree, 600,TechTree.CALIBRATION,true));
		itemData.put(Pistol1.NAME, 					new ItemData(techTree, 800,TechTree.FIREARMS,true));
		itemData.put(Pistol2.NAME, 					new ItemData(techTree, 1000,TechTree.IMPROVED_FIREARMS,true));
		itemData.put(Pistol3.NAME,					new ItemData(techTree, 1200,TechTree.AP_FIREARMS,true));
		itemData.put(Pistol4.NAME, 					new ItemData(techTree, 1400,TechTree.IMPROVED_AP_FIREARMS,true));
		itemData.put(Plasma1.NAME, 					new ItemData(techTree, 1400,TechTree.ADVANCED_WEAPONRY,true));
		itemData.put(Plasma2.NAME, 					new ItemData(techTree, 1800,TechTree.PLASMA_CONTAINMENT,true));
		itemData.put(Railgun.NAME, 					new ItemData(techTree, 8000,TechTree.SUPER_PROJECTILES,true));
		itemData.put(Shotgun1.NAME, 				new ItemData(techTree, 3000,TechTree.CONFLICT_WEAPONRY,true));
		
		itemData.put(ArmourPlates1.NAME, 			new ItemData(techTree, 300,TechTree.BASIC_ARMOUR,false));
		itemData.put(ArmourPlates2.NAME, 			new ItemData(techTree, 800,TechTree.HEAVY_ARMOUR,false));
		itemData.put(LightStealthField.NAME, 		new ItemData(techTree, 5000,TechTree.STATIONARY_CLOAKING,false));
		itemData.put(MediumStealthField.NAME, 		new ItemData(techTree, 5000,TechTree.MOBILE_CLOAKING,false));
		itemData.put(ScienceScanner.NAME, 			new ItemData(techTree, 3200,TechTree.SCIENTIFIC_OBSERVATIONS,false));
		itemData.put(SensorSuite.NAME, 				new ItemData(techTree, 5000,TechTree.OPTICS,false));
		itemData.put(SpeedBooster.NAME, 			new ItemData(techTree, 3200,TechTree.ADVANCED_SUIT_THRUSTERS,false));
		itemData.put(UnitDetector.NAME, 			new ItemData(techTree, 1200,TechTree.SUIT_COMMUNICATION,false));
		itemData.put(WeldingTorch.NAME, 			new ItemData(techTree, 1000,TechTree.BASIC_TOOLS,false));
	}
	
	
	private void updateMarket() {
		Iterator<String> itemIt = itemData.keySet().iterator();
		
		while(itemIt.hasNext()){
			String next = itemIt.next();
			
			if(itemData.get(next).isUnlocked(AiGenerator.LONER))
				if(itemData.get(next).isWeapon)
					weaponsInMarket.add(next);
				else
					itemsInMarket.add(next);
			
			if(itemData.get(next).isUnlocked(AiGenerator.BANDITS))
				if(itemData.get(next).isWeapon)
					banditWeapons.add(next);
				else
					banditItems.add(next);
			
			if(itemData.get(next).isUnlocked(AiGenerator.WHITE_VISTA))
				if(itemData.get(next).isWeapon)
					wvWeapons.add(next);
				else
					wvItems.add(next);
				
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
		private TechTree techTree;
		
		public ItemData(TechTree techTree, int cost, String requiredTechnology, boolean isWeapon){
			this.techTree = techTree;
			this.cost = cost;
			this.requiredTechnology = requiredTechnology;
			this.isWeapon = isWeapon;
		}
		
		public boolean isUnlocked(String faction){
			return techTree.isResearched(requiredTechnology, faction);
		}
	}


	public ArrayList<String> getLonerAllowedItems() {
		return new ArrayList<>(this.itemsInMarket);
	}

	public ArrayList<String> getLonerAllowedWeapons() {
		return new ArrayList<>(this.weaponsInMarket);
	}
	
	public ArrayList<String> getBanditsAllowedItems() {
		return new ArrayList<>(this.banditItems);
	}
	
	public ArrayList<String> getBanditsAllowedWeapons() {
		return new ArrayList<>(this.banditWeapons);
	}
	
	public ArrayList<String> getWhiteVistaAllowedItems() {
		return new ArrayList<>(this.wvItems);
	}
	
	public ArrayList<String> getWhiteVistaAllowedWeapons() {
		return new ArrayList<>(this.wvWeapons);
	}
	
	public String getRandomMarketItem(Double wvRelation, Double banditRelation) {
		
		Set<Set<String>> itemSets = new HashSet<Set<String>>(3);
		
		itemSets.add(this.itemsInMarket);
		
		if(wvRelation >= 1.5)
			itemSets.add(wvItems);
		
		if(banditRelation >= 1.5)
			itemSets.add(banditItems);
		
		Set<Set<String>> weaponSets = new HashSet<Set<String>>(3);
		
		weaponSets.add(this.weaponsInMarket);
		
		if(wvRelation >= 1.5)
			weaponSets.add(wvWeapons);
		
		if(banditRelation >= 1.5)
			weaponSets.add(banditWeapons);
		
		if(this.itemsInMarket.size() > 1 && new Random().nextBoolean())
			return getRandomItem(itemSets);
		
		return getRandomWeapon(weaponSets);
		
	}

	private String getRandomWeapon(Set<Set<String>> weaponSets) {
		
		ArrayList<String> weapons = new ArrayList<>();
		
		for(Set<String> set:weaponSets) {
			for(String weapon:set) {
				weapons.add(weapon);
			}
		}
		
		return weapons.get(new Random().nextInt(weapons.size()));
	}

	private String getRandomItem(Set<Set<String>> itemSets) {
		
		ArrayList<String> items = new ArrayList<>();
		
		for(Set<String> set:itemSets) {
			for(String item:set) {
				items.add(item);
			}
		}
		
		return items.get(new Random().nextInt(items.size()));
	}

	public String getRandomItem() {
		return new ArrayList<>(this.itemsInMarket).get(new Random().nextInt(this.itemsInMarket.size()));
	}

	public String getRandomWeapon() {
		return new ArrayList<>(this.weaponsInMarket).get(new Random().nextInt(this.weaponsInMarket.size()));
	}
	
}
