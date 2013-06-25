package atrophy.combat.level;

import java.awt.Color;
import java.awt.Polygon;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.conversation.TalkMap;
import atrophy.combat.display.ui.LargeEventText;
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
import atrophy.combat.level.AtrophyScriptReader.StoredCommand;
import atrophy.combat.level.AtrophyScriptReader.TriggerCommand;
import atrophy.gameMenu.saveFile.Missions;

public class MissionManager {

	private Map<String, Lootable> stashContents;
	private Map<String, Polygon> stashObjects;
	private Map<String, Polygon> coverObjects;
	private Map<String, TalkMap> talkMaps;
	private Map<String, StoredCommand> commands;
	private Map<String, TriggerCommand> triggers;
	private Map<LevelBlock, String> storyRooms;
	
	private Missions missions;
	private AiGenerator aiGenerator;
	private LargeEventText largeEventText;
	
	
	public MissionManager(Missions missions, LargeEventText largeEventText){
		
		stashContents = new HashMap<>();
		stashObjects = new HashMap<>();
		coverObjects = new HashMap<>();
		talkMaps = new HashMap<>();
		commands = new HashMap<>();
		triggers = new HashMap<>();
		storyRooms = new HashMap<>();
		
		this.missions = missions;
		this.largeEventText = largeEventText;
	}
	
	public void lazyLoad(AiGenerator aiGenerator) {
		this.aiGenerator = aiGenerator;
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
	
	public void addStoryMessage(LevelBlock block, String message) {
		this.storyRooms.put(block, message);
	}
	
	public void triggerStoryMessage(LevelBlock room) {
		String message = this.storyRooms.get(room);
		
		if(message != null) {
			this.storyRooms.remove(room);
			largeEventText.flashText(message, Color.white, 10000);
		}
	}
	
	
	public void updateTimers() {
	}
	
	public void addCommands(Stack<StoredCommand> commandStack) {
		while(!commandStack.isEmpty()) {
			StoredCommand command = commandStack.pop();
			this.commands.put(command.name, command);
		}
	}
	
	
	private class SpawnInfo{
		
		public String memCode;
		public String tag;
		public boolean spawnOnLoot;
		public Lootable stash;
		public Item item;
		public double[] location;
		public boolean doOnce;
		
		public SpawnInfo(String tag, Lootable stash, double[] location, String memCode, boolean doOnce, boolean spawnOnLoot){
			this.tag = tag;
			this.stash = stash;
			this.location = location;
			this.doOnce = doOnce;
			this.spawnOnLoot = spawnOnLoot;
			// Remove # at start
			this.memCode = memCode.substring(1);
		}

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
		
	}


	public void runCommand(String commandTag) {
		StoredCommand storedCommand = this.commands.get(commandTag);
		
		if(storedCommand != null)
			storedCommand.run();
	}

}
