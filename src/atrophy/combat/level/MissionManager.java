package atrophy.combat.level;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
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
import atrophy.gameMenu.saveFile.Missions;

public class MissionManager {
	
	// stashes where mission items can spawn
	private Map<String, SpawnInfo> spawnStashes;
	private Map<String, TalkMap> talkMaps;
	private Map<String, Command> commands;
	private Map<LevelBlock, String> storyRooms;
	private Map<LevelBlock, String> triggers;
	private List<Timer> timers;
	
	private Missions missions;
	private AiGenerator aiGenerator;
	private LargeEventText largeEventText;
	
	
	public MissionManager(Missions missions, LargeEventText largeEventText){
		spawnStashes = new HashMap<String, SpawnInfo>();
		talkMaps = new HashMap<>();
		commands = new HashMap<>();
		storyRooms = new HashMap<>();
		triggers = new HashMap<>();
		timers = new ArrayList<>();
		this.missions = missions;
		this.largeEventText = largeEventText;
	}
	
	public void lazyLoad(AiGenerator aiGenerator) {
		this.aiGenerator = aiGenerator;
	}
	
	public void triggerLootEvent(Lootable lootable) {
		for(SpawnInfo info : spawnStashes.values()) {
			if(info.stash == lootable && info.spawnOnLoot) {
				info.spawnitem(info.tag);
				missions.addMemCode(info.memCode);
			}
		}
	}

	public void addSpawnStash(String tag, Lootable stash, double[] location, String item, boolean spawnOnce) {
		SpawnInfo info = new SpawnInfo(tag, stash, location, "#"+Missions.DEFAULT_MEM_CODE, spawnOnce, false);
		
		info.item = info.workOutItem(item);
		
		// incorrect item code
		if(info.item == null){
			System.err.println("Incorrect spawn item code: " + item);
			return;
		}
		
		this.spawnStashes.put(tag, info);
	}
	
	public void addSpawnStash(String tag, Lootable stash, double[] location, String item, String spawnTag) {
		
		// Remove #
		if(missions.hasMemCode(spawnTag.substring(1)))
			return;
		
		SpawnInfo info = new SpawnInfo(tag, stash, location, spawnTag, true, true);
		
		info.item = info.workOutItem(item);
		
		// incorrect item code
		if(info.item == null){
			System.err.println("Incorrect spawn item code: " + item);
			return;
		}
		
		this.spawnStashes.put(tag, info);		
	}
	
	// spawns an item in the given stash and returns where the stash is so a marker can be made
	public double[] spawnItem(String tag){
		
		SpawnInfo info = this.spawnStashes.get(tag);
		
		// remove item if inventory full
		if(info.stash.getInventory().isFull()){
			info.stash.getInventory().removeItemAt(0);
		}
		
		info.spawnitem(tag);
		
		return info.location;
	}
	
	public SpawnInfo getSpawnCommand(String tag) {
		return this.spawnStashes.get(tag);
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
	
	public void addCommand(String tag, GenerateCommand command) {
		this.commands.put(tag, new Command(command));
	}
	
	public void addCommand(String tag, SpawnInfo spawnCommand, boolean removeSpawnCommand) {
		this.commands.put(tag, new Command(spawnCommand, tag));
		
		if(removeSpawnCommand)
			this.spawnStashes.remove(tag);
	}
	
	protected Command getCommand(String tag) {
		return this.commands.get(tag);
	}
	
	public void runCommand(String tag) {
		Command command = this.commands.get(tag);
		if(command != null)
			command.run();
	}
	
	public void addTimer(int delay, int repetitions, String tag) {
		this.timers.add(new Timer(delay, repetitions, tag));
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
	
	public void addTrigger(LevelBlock block, String tag) {
		this.triggers.put(block, tag);
	}
	
	public void triggerTag(LevelBlock room) {
		missions.addMemCode(this.triggers.get(room));
	}
	
	public void updateTimers() {
		for (Timer timer : timers) {
			timer.run();
		}
	}
	
	protected class Timer {
		private int delay, repeats, timer, repetitions;
		private String tag;
		
		public Timer(int delay, int repetitions, String tag) {
			this.delay = delay;
			this.repetitions = repetitions;
			this.tag = tag;
			
			this.repeats = 0;
			this.timer = 0;
		}
		
		public void run() {
			if(this.timer == delay) {
				this.timer = 0;
				
				if(repetitions > 0)
					this.repeats++;
				
				runCommand(tag);
				
				if(repetitions == repeats && repetitions > 0)
					timers.remove(this);
			}
			this.timer++;
		}
	}
	
	protected class Command {
		
		private GenerateCommand command;
		private SpawnInfo spawnCommand;
		private String tag;
		private int chance;
		
		public Command(GenerateCommand command) {
			this.command = command;
			this.chance = 100;
		}
		
		public Command(SpawnInfo spawnCommand, String tag) {
			this.spawnCommand = spawnCommand;
			this.tag = tag;
			this.chance = 100;
		}

		public void run() {
			
			if(new Random().nextInt(100) < chance) {
				if(command != null)
					aiGenerator.spawnAi(command);
				else
					spawnCommand.spawnitem(tag);
			}
				
		}

		public void setRandomChance(int chance) {
			this.chance = chance;
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
		
		public void spawnitem(String tag){
			this.stash.addItem(item);
			
			if(doOnce)
				spawnStashes.remove(tag);
		}
	}

}
