/*
 * 
 */
package atrophy.combat.level;

import java.util.HashMap;

import atrophy.combat.ai.conversation.TalkMap;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.ArmourPlates1;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Item;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.SpeedBooster;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.items.WeaponSupply;
import atrophy.combat.items.WeldingTorch;
import atrophy.gameMenu.saveFile.Missions;

// TODO: Auto-generated Javadoc
/**
 * The Class MissionManager.
 */
public class MissionManager {
	
	// stashes where mission items can spawn
	/**
	 * The spawn stashes.
	 */
	private HashMap<String, SpawnInfo> spawnStashes;
	
	private HashMap<String, TalkMap> talkMaps;
	
	private Missions missions;
	
	/**
	 * Instantiates a new mission manager.
	 * @param missions 
	 */
	public MissionManager(Missions missions){
		spawnStashes = new HashMap<String, SpawnInfo>();
		talkMaps = new HashMap<>();
		this.missions = missions;
	}
	
	public void triggerLootEvent(Lootable lootable) {
		for(SpawnInfo info : spawnStashes.values()) {
			if(info.stash == lootable && info.spawnOnLoot) {
				info.spawnitem(info.tag);
				missions.addMemCode(info.memCode);
			}
		}
	}

	/**
	 * Adds the spawn stash.
	 *
	 * @param tag the tag
	 * @param stash the stash
	 * @param location the location
	 * @param item the item
	 * @param spawnOnce the spawn once
	 */
	public void addSpawnStash(String tag, Lootable stash, double[] location, String item, boolean spawnOnce) {
		SpawnInfo info = new SpawnInfo(tag, stash, location, item, spawnOnce, false);
		
		info.item = info.workOutItem(item);
		
		// incorrect item code
		if(info.item == null){
			System.err.println("Incorrect spawn item code: " + item);
			return;
		}
		
		this.spawnStashes.put(tag, info);
	}
	
	public void addSpawnStash(String tag, Lootable stash, double[] location, String item, String spawnTag) {
		
		if(missions.hasMemCode(spawnTag))
			return;
		
		SpawnInfo info = new SpawnInfo(tag, stash, location, item, true, true);
		
		info.item = info.workOutItem(item);
		
		// incorrect item code
		if(info.item == null){
			System.err.println("Incorrect spawn item code: " + item);
			return;
		}
		
		this.spawnStashes.put(tag, info);		
	}
	
	// spawns an item in the given stash and returns where the stash is so a marker can be made
	/**
	 * Spawn item.
	 *
	 * @param tag the tag
	 * @return the double[]
	 */
	public double[] spawnItem(String tag){
		
		SpawnInfo info = this.spawnStashes.get(tag);
		
		// remove item if inventory full
		if(info.stash.getInventory().isFull()){
			info.stash.getInventory().removeItemAt(0);
		}
		
		info.spawnitem(tag);
		
		return info.location;
	}
	
	public TalkMap getTalkMap(String tag){
		return this.talkMaps.get(tag);
	}
	
	public void setTalkMapToStage(String tag, int stage){
		this.talkMaps.get(tag).setToStage(stage);
	}
	
	public void addTalkMap(String tag, TalkMap lastTalkMap) {
		this.talkMaps.put(tag, lastTalkMap);
	}
	
	/**
	 * The Class SpawnInfo.
	 */
	private class SpawnInfo{
		
		public String memCode;

		public String tag;

		public boolean spawnOnLoot;

		/**
		 * The stash.
		 */
		public Lootable stash;
		
		/**
		 * The item.
		 */
		public Item item;
		
		/**
		 * The location.
		 */
		public double[] location;
		
		/**
		 * The do once.
		 */
		public boolean doOnce;
		
		/**
		 * Instantiates a new spawn info.
		 *
		 * @param stash the stash
		 * @param location the location
		 * @param doOnce the do once
		 */
		public SpawnInfo(String tag, Lootable stash, double[] location, String memCode, boolean doOnce, boolean spawnOnLoot){
			this.tag = tag;
			this.stash = stash;
			this.location = location;
			this.doOnce = doOnce;
			this.spawnOnLoot = spawnOnLoot;
			this.memCode = memCode;
		}

		/**
		 * Work out item.
		 *
		 * @param item the item
		 * @return the item
		 */
		public Item workOutItem(String item) {
			switch(item){
				case "ARMOUR1":
				case "Armour Plates":
					return ArmourPlates1.getInstance();
				case "ARMOUR2":
				case "Forged Armour Plates":
					return ArmourPlates2.getInstance();
				case "GRENADE":
				case "Grenade":
					return GrenadeItem.getInstance();
				case "LSTEALTH":
				case "Light Stealth Field":
					return LightStealthField.getInstance();
				case "MSTEALTH":
				case "Medium Stealth Field":
					return MediumStealthField.getInstance();
				case "SCISCANNER":
				case "Scientific Scanner":
					return ScienceScanner.getInstance();
				case "SENSOR":
				case "Sensor Suite":
					return SensorSuite.getInstance();
				case "SPEEDBOOST":
				case "Speed Booster":
					return SpeedBooster.getInstance();
				case "STUNNADE":
				case "Stun Grenade":
					return StunGrenadeItem.getInstance();
				case "UNITSENSOR":
				case  "Unit Detector":
					return UnitDetector.getInstance();
				case "WELDER":
				case "Welding Torch":
					return WeldingTorch.getInstance();
				case "ESUPPLY":
				case "Engineering Supplies":
					return EngineeringSupply.getInstance();
				case "MSUPPLY":
				case "Medical Supplies":
					return MedicalSupply.getInstance();
				case "WSUPPLY":
				case "Weapon Supplies":
					return WeaponSupply.getInstance();
					
			}
			
			return null;
		}
		
		/**
		 * Spawnitem.
		 *
		 * @param tag the tag
		 */
		public void spawnitem(String tag){
			this.stash.addItem(item);
			
			if(doOnce)
				spawnStashes.remove(tag);
		}
	}

}
