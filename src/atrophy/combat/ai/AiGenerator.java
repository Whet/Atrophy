package atrophy.combat.ai;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.AiGeneratorInterface.DaemonRandomSpawn;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.conversation.DialoguePool;
import atrophy.combat.ai.director.DirectorArchetype;
import atrophy.combat.ai.director.DirectorClassification;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.display.DaemonImage;
import atrophy.combat.display.MapDrawer;
import atrophy.combat.display.MapPainter;
import atrophy.combat.display.VehicleImage;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.items.ArmourPlates1;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.DaemonWeapon;
import atrophy.combat.items.Item;
import atrophy.combat.items.Weapon;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.MissionManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

public class AiGenerator{
	
	private static final HashMap<Integer,String> nameHashMap = new HashMap<Integer,String>(), surnameHashMap = new HashMap<Integer,String>(); 

	private CombatMembersManager combatMembersManager;
	private AiCrowd aiCrowd;
	private CombatUiManager combatUiManager;
	private PanningManager panningManager;
	private CombatVisualManager combatVisualManager;
	private TurnProcess turnProcess;
	private FloatingIcons floatingIcons;
	private MouseAbilityHandler mouseAbilityHandler;
	private LevelManager levelManager;
	private LootBox lootbox;
	private MissionManager missionManager;
	private MessageBox messageBox;
	private MapDrawer mapDrawer;
	
	private int squadCount;
	static {

		nameHashMap.put(0,"Mighty");			nameHashMap.put(11,"Wardog");			nameHashMap.put(22, "Young");		nameHashMap.put(33, "Inglorious");
		nameHashMap.put(1,"Adamant");			nameHashMap.put(12,"Hunter");			nameHashMap.put(23, "Old");			nameHashMap.put(34, "Silencer");
		nameHashMap.put(2,"Sly");				nameHashMap.put(13,"Artist");			nameHashMap.put(24, "Hungry");
		nameHashMap.put(3,"Cunning");			nameHashMap.put(14,"Teller");			nameHashMap.put(25, "Big");
		nameHashMap.put(4,"Ruthless");			nameHashMap.put(15,"Tinker");			nameHashMap.put(26, "Small");
		nameHashMap.put(5,"Oblique");			nameHashMap.put(16,"Tech");				nameHashMap.put(27, "Unrelenting");
		nameHashMap.put(6,"Silent");			nameHashMap.put(17,"Artisan");			nameHashMap.put(28, "Cautious");
		nameHashMap.put(7,"Raging");			nameHashMap.put(18,"Brave");			nameHashMap.put(29, "Loose");
		nameHashMap.put(8,"Pariah");			nameHashMap.put(19,"Sorrowful");		nameHashMap.put(30, "Scrub");
		nameHashMap.put(9,"Unruly");			nameHashMap.put(20,"Fearful");			nameHashMap.put(31, "Master");
		nameHashMap.put(10,"Professional");		nameHashMap.put(21,"Arbiter");			nameHashMap.put(32, "Seer");

		surnameHashMap.put(0,"Strelok");		surnameHashMap.put(11,"Fresh");			surnameHashMap.put(22, "Zia");		surnameHashMap.put(33, "Gorlami");
		surnameHashMap.put(1,"Artyom");			surnameHashMap.put(12,"Red");			surnameHashMap.put(23, "Zulf");     surnameHashMap.put(34, "Terexin");
		surnameHashMap.put(2,"Dimitri");		surnameHashMap.put(13,"Lydia");			surnameHashMap.put(24, "Percy");	surnameHashMap.put(34, "Trolodon");
		surnameHashMap.put(3,"Vadim");			surnameHashMap.put(14,"Shark");			surnameHashMap.put(25, "Adrian");   surnameHashMap.put(34, "Popopa");
		surnameHashMap.put(4,"Bourbon");		surnameHashMap.put(15,"Splinter");		surnameHashMap.put(26, "Caesar");
		surnameHashMap.put(5,"Aubrey");			surnameHashMap.put(16,"Tony");			surnameHashMap.put(27, "Maria");
		surnameHashMap.put(6,"Url");			surnameHashMap.put(17,"David");			surnameHashMap.put(28, "Geralt");
		surnameHashMap.put(7,"Robert");			surnameHashMap.put(18,"Prokofiev");		surnameHashMap.put(29, "Johan");
		surnameHashMap.put(8,"Machete");		surnameHashMap.put(19,"Sultan");		surnameHashMap.put(30, "Joe");
		surnameHashMap.put(9,"Grieg");			surnameHashMap.put(20,"Solovich");		surnameHashMap.put(31, "Paul");
		surnameHashMap.put(10,"Mussorgsky");	surnameHashMap.put(21,"Kingsly");		surnameHashMap.put(32, "Simon");
    }
	
	public AiGenerator(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, LevelManager levelManager, PanningManager panningManager, MouseAbilityHandler mouseAbilityHandler, TurnProcess turnProcess, FloatingIcons floatingIcons, LootBox lootbox, MissionManager missionManager, MessageBox messageBox, MapDrawer mapDrawer) {
		this.combatMembersManager = combatMembersManager; 
		this.aiCrowd = aiCrowd;
		this.combatUiManager = combatUiManager;
		this.combatVisualManager = combatVisualManager;
		this.panningManager = panningManager;
		this.floatingIcons = floatingIcons;
		this.turnProcess = turnProcess;
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.levelManager = levelManager;
		this.lootbox = lootbox;
		this.missionManager = missionManager;
		this.messageBox = messageBox;
		this.mapDrawer = mapDrawer;
	}
	
	public void generateAi(List<AiGeneratorInterface.GenerateCommand> generationCommands){
		
		squadCount = 0;
		
		for(AiGeneratorInterface.GenerateCommand command : generationCommands){
			
			if(command instanceof DaemonRandomSpawn) {
				generateDaemonAi((DaemonRandomSpawn)command, squadCount);
				squadCount++;
				continue;
			}
			
			if(command instanceof SoloGenerateCommand){
				generateSoloAi((SoloGenerateCommand)command, squadCount);
				squadCount++;
				continue;
			}
			
			switch(command.getFaction()){
				case WHITE_VISTA:
					generateTeam(Integer.toString(squadCount)+Faction.WHITE_VISTA.toString(),
								 command.getTeamSize(),
								 command.getAllowedItems(),
								 command.getAllowedWeapons(),
								 combatMembersManager.getCommander(Faction.WHITE_VISTA).getSpawnRoom());
				break;
				case BANDITS:
					generateTeam(Integer.toString(squadCount)+Faction.BANDITS.toString(),
								 command.getTeamSize(),
								 command.getAllowedItems(),
								 command.getAllowedWeapons(),
								 combatMembersManager.getCommander(Faction.BANDITS).getSpawnRoom());
				break;
				case PLAYER:
					generatePlayerTeam(command.getSquad(),
									   levelManager.getCurrentLevel().getPlayerSpawn());
				break;
				case LONER:
					generateLoner(Integer.toString(squadCount)+Faction.LONER.toString(),
								  command.getAllowedItems(),
								  command.getAllowedWeapons(),
							      levelManager.randomRoom());
				break;
			}
			squadCount++;
		}
		
		combatMembersManager.pickStartingAi();
		generateRosters();
		combatUiManager.getAllyRoster().generatePortraits();
		aiCrowd.shuffleAi();
	}
	
	public void spawnAi(GenerateCommand command) {
		// Create ai while game is in progress
		
		if(command instanceof SoloGenerateCommand){
			generateSoloAi((SoloGenerateCommand)command, squadCount);
			squadCount++;
			combatVisualManager.updateVisibleAi();
			return;
		}
		
		switch(command.getFaction()){
			case WHITE_VISTA:
				generateTeam(Integer.toString(squadCount)+Faction.WHITE_VISTA.toString(),
							 command.getTeamSize(),
							 command.getAllowedItems(),
							 command.getAllowedWeapons(),
							 combatMembersManager.getCommander(Faction.WHITE_VISTA).getSpawnRoom());
			break;
			case BANDITS:
				generateTeam(Integer.toString(squadCount)+Faction.BANDITS.toString(),
							 command.getTeamSize(),
							 command.getAllowedItems(),
							 command.getAllowedWeapons(),
							 combatMembersManager.getCommander(Faction.BANDITS).getSpawnRoom());
			break;
			case LONER:
			break;
		}
		squadCount++;
		combatVisualManager.updateVisibleAi();
	}
	
	public void spawnTalkNode(TalkNode talkNode) {
		aiCrowd.addTalkNode(talkNode);
		
		BufferedImage computerImage = null;
		try {
			computerImage = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/icons/computer.png"));
		} catch (IOException e1) {
			System.err.println("No computer textures");
			System.exit(-1);
		}
		
		// Draw pc's to show talknode locations
		if(talkNode.hasLocation())
			MapPainter.applyImage(computerImage, new double[]{talkNode.getX(), talkNode.getY()}, 1.0f, mapDrawer);
	}
	
	private void generateSoloAi(SoloGenerateCommand command, int team) {
		
		double[] location = null;
		
		if(command.x == null && !command.getFaction().equals(Faction.LONER))
			location = levelManager.randomInPosition(combatMembersManager.getCommander(command.getFaction()).getSpawnRoom());
		else if(command.x == null && command.getFaction().equals(Faction.LONER))
			location = levelManager.randomPosition();
		else
			location = new double[]{command.x, command.y};
		
		AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, 0,0, mouseAbilityHandler, floatingIcons);
		ThinkingAi ai = null;
		
		DialoguePool dialoguePool = new DialoguePool(missionManager, messageBox);
		
		switch(command.getFaction()){
			case LONER:
				ai = new LonerAi(panningManager, aiCrowd, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, combatMembersManager, command.getName(),location[0],location[1], levelManager, combatUiManager, lootbox, dialoguePool);
				ai.setBaseAggression(ThinkingAiEmotion.PASSIVE_RESPOND);
				ai.setImage(randomImage());
				ai.setTeam(team+Faction.LONER.toString());
			break;
			case WHITE_VISTA:
				ai = new ThinkingAi(dialoguePool, panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, command.getName(),location[0],location[1], levelManager, combatUiManager, lootbox);
				ai.setBaseAggression(ThinkingAiEmotion.PASSIVE_RESPOND);
				ai.setImage("Armour");
				ai.setTeam(team+Faction.WHITE_VISTA.toString());
			break;
			case BANDITS:
				ai = new ThinkingAi(dialoguePool, panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, command.getName(),location[0],location[1], levelManager, combatUiManager, lootbox);
				ai.setBaseAggression(ThinkingAiEmotion.AGGRESSIVE_FIGHTER);
				ai.setImage("Bandit");
				ai.setTeam(team+Faction.BANDITS.toString());
			break;
		}
		
		if(command.isDaemon()) {
			ai.setWeapon(new DaemonWeapon());
		}
		else {
			ai.setWeapon(Weapon.stringToWeapon(command.getWeapon()));
			
			if(command.getItems() != null)
				for(int i = 0; i < command.getItems().length; i++){
					ai.addItem(Item.stringToItem(command.getItems()[i]));
				}
		}
		
		ai.assignAbilities();
		aiImg.setAi(ai);
		
		aiCrowd.addDisplayItem(aiImg);
		aiCrowd.addMouseActionItem(aiImg);
		
		aiCrowd.addActor(ai, new DirectorClassification(command.directorClass));
		aiCrowd.addMask(aiImg);
		
		if(command.getAiNode() != null){
			List<String> priority = new ArrayList<String>(1);
			priority.add(ai.getName());
			command.getAiNode().addPriorities(priority);
			ai.setAiNode(command.getAiNode());
		}
		
		combatMembersManager.addAi(ai);
		
		Faction[] alliances = command.getAlliances();
		if(alliances != null)
			for(int i = 0; i < alliances.length; i++){
				ai.getCommander().addAlliance(alliances[i]);
			}
	}
	
	private void generateDaemonAi(DaemonRandomSpawn command, int squadCount) {
//		double[] location = levelManager.randomPosition();
//		
//		AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, 0,0, mouseAbilityHandler, floatingIcons);
//		ThinkingAi ai = null;
//		
//		DialoguePool dialoguePool = new DialoguePool(missionManager, messageBox);
//		
//		ai = new DaemonAi(panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, randomDaemonName(),location[0],location[1], levelManager, combatUiManager, lootbox, dialoguePool);
//		ai.setBaseAggression(ThinkingAiEmotion.MINDLESS_TERROR);
//		aiImg = new DaemonImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager,location[0],location[1], mouseAbilityHandler, floatingIcons);
//		ai.setTeam(squadCount+Faction.DAEMON.toString());
//		
//		ai.setWeapon(new DaemonWeapon());
//		
//		ai.assignAbilities();
//		aiImg.setAi(ai);
//		
//		aiCrowd.addDisplayItem(aiImg);
//		aiCrowd.addMouseActionItem(aiImg);
//		
//		aiCrowd.addActor(ai, new DirectorClassification(DirectorArchetype.UNDECIDED));
//		aiCrowd.addMask(aiImg);
//		
//		combatMembersManager.addAi(ai);
	}

	private void generatePlayerTeam(ArrayList<Squaddie> squad, LevelBlock levelBlock) {
		double[] randomLocation = levelManager.randomInPosition(levelBlock);
		
		for(int i = 0; i < squad.size(); i++){

			Ai ai = null;
			AiImage aiImg = null;
			
			if(squad.get(i).isVehicle()){
				aiImg = new VehicleImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, 100,100, mouseAbilityHandler, floatingIcons);
				
				switch(squad.get(i).getVehicleType()){
					case MuleAi.MULE:
						ai = new MuleAi(panningManager, floatingIcons, mouseAbilityHandler, squad.get(i).getName(),randomLocation[0],randomLocation[1], levelManager, lootbox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd, turnProcess);
					break;
				}
				
				ai.setImage(squad.get(i).getImage());
				ai.setTeam("1Player");
			}
			else{
				aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, 100,100, mouseAbilityHandler, floatingIcons);
				
				ai = new Ai(floatingIcons, mouseAbilityHandler, squad.get(i).getName(),randomLocation[0],randomLocation[1], levelManager, lootbox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd, panningManager, turnProcess);
				ai.setImage(squad.get(i).getImage());
				ai.setTeam("1Player");
			}
			
			Iterator<String> skillIt = squad.get(i).getSkills();
			while(skillIt.hasNext()){
				String next = skillIt.next();
				ai.setSkill(next, squad.get(i).getSkillLevel(next));
			}
			
			ai.setWeapon(Weapon.stringToWeapon(squad.get(i).getWeapon()));
			
			Iterator<String> itemIt = squad.get(i).getItems();
			
			while(itemIt.hasNext()){
				ai.addItem(Item.stringToItem(itemIt.next()));
			}
			
			ai.assignAbilities();
			aiImg.setAi(ai);
			aiCrowd.addDisplayItem(aiImg);
			aiCrowd.addMouseActionItem(aiImg);
			
			
			aiCrowd.addActor(ai, new DirectorClassification(DirectorArchetype.PLAYER));
			aiCrowd.addMask(aiImg);
			
			randomLocation = levelManager.randomInPosition(levelBlock);
			
			combatMembersManager.addAi(ai);
		}
	}
	
	private void generateRosters(){
		combatMembersManager.updateCommanders();
	}
	
	private void generateLoner(String team, List<String> allowedItems, List<String> allowedWeapons, LevelBlock room){
		
		double[] randomLocation = levelManager.randomInPosition(room);
		
		AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, 0,0, mouseAbilityHandler, floatingIcons);
		ThinkingAi ai;
		
		DialoguePool dialoguePool = new DialoguePool(missionManager, messageBox);
		
		ai = new LonerAi(panningManager, aiCrowd, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, combatMembersManager, randomName(),randomLocation[0],randomLocation[1], levelManager, combatUiManager, lootbox, dialoguePool);
		ai.setBaseAggression(ThinkingAiEmotion.PASSIVE_RESPOND);
		ai.setImage(randomImage());
		ai.setTeam(team);
		
		applyLootList(allowedItems, allowedWeapons, ai);
		
		ai.assignAbilities();
		aiImg.setAi(ai);
		
		aiCrowd.addDisplayItem(aiImg);
		aiCrowd.addMouseActionItem(aiImg);
		
		aiCrowd.addActor(ai, new DirectorClassification(DirectorArchetype.UNDECIDED));
		aiCrowd.addMask(aiImg);
		
		combatMembersManager.addAi(ai);
		
	}
	
	private void generateTeam(String team, int members, List<String> allowedItems, List<String> allowedWeapons, LevelBlock spawnRoom){
		
		double[] randomLocation = levelManager.randomInPosition(spawnRoom);
		
		Pattern numberPattern = Pattern.compile("[0-9]+");
		Matcher numberMatcher;
		numberMatcher = numberPattern.matcher(team);
		numberMatcher.find();
		
		for(int i = 0; i < members; i++){
			AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, 0,0, mouseAbilityHandler, floatingIcons);
			
			DialoguePool dialoguePool = new DialoguePool(missionManager, messageBox);
			
			ThinkingAi ai = new ThinkingAi(dialoguePool, panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, randomName(),randomLocation[0],randomLocation[1], levelManager, combatUiManager, lootbox);
			
			ai.setImage(randomImage());
			
			ai.setTeam(team);
			
			applyLootList(allowedItems, allowedWeapons, ai);
			
			switch(ai.getFaction()){
				case BANDITS:
					ai.setBaseAggression(ThinkingAiEmotion.AGGRESSIVE_FIGHTER);
					ai.setImage("Bandit");
				break;
				case WHITE_VISTA:
					ai.setBaseAggression(ThinkingAiEmotion.PASSIVE_RESPOND);
					ai.setImage("Armour");
				break;
			}
			
			ai.assignAbilities();
			aiImg.setAi(ai);
			aiCrowd.addDisplayItem(aiImg);
			aiCrowd.addMouseActionItem(aiImg);
			
			aiCrowd.addActor(ai, new DirectorClassification(DirectorArchetype.UNDECIDED));
			aiCrowd.addMask(aiImg);
			
			randomLocation = levelManager.randomInPosition(spawnRoom);
			
			combatMembersManager.addAi(ai);
		}
	}
	
	private void applyLootList(List<String> allowedItems, List<String> allowedWeapons, Ai ai) {
		Weapon weapon = Weapon.stringToWeapon(allowedWeapons.get(new Random().nextInt(allowedWeapons.size())));
		
		// Re-roll is weapon is melee to prefer ranged weapons
		if(weapon.isMelee())
			weapon = Weapon.stringToWeapon(allowedWeapons.get(new Random().nextInt(allowedWeapons.size())));
		
		ai.setWeapon(weapon);
		
		int randomItemCount = new Random().nextInt(5);
		if(allowedItems.size() > 0) {
			
			boolean hasArmour = false;
			
			for(int i = 0; i < randomItemCount; i++){
				String item = allowedItems.get(new Random().nextInt(allowedItems.size()));
				
				if(item != null && (!(item.equals(ArmourPlates1.NAME) || item.equals(ArmourPlates2.NAME)) || !hasArmour) &&
						           (!ai.getInventory().hasItem(Item.stringToItem(item)))) {
					ai.addItem(Item.stringToItem(item));
					
					if(item.equals(ArmourPlates1.NAME) || item.equals(ArmourPlates2.NAME))
						hasArmour = true;
				}
			}
		}
	}
	
	public static Faction randomFaction(){
		switch(new Random().nextInt(3)){
			case 0:
				return Faction.WHITE_VISTA;
			case 1:
				return Faction.BANDITS;
			default:
				return Faction.LONER;
		}
	}

	public static String randomName(){
		Random rand = new Random();
		
		String name;
		String surname;
		
		name = nameHashMap.get(rand.nextInt(nameHashMap.size()));
		surname = surnameHashMap.get(rand.nextInt(surnameHashMap.size()));
		
		return name+" "+surname;
	}
	
	private String randomDaemonName() {
		return nameHashMap.get(new Random().nextInt(nameHashMap.size()));
	}
	
	public static String randomImage(){
	
		String returnImage;
		
		Random rand = new Random();
		
		switch(rand.nextInt(6)){
			
			case 0:
				returnImage = "BeardHead";
			break;
			
			case 1:
				returnImage = "MessyHead";
			break;
			
			case 2:
				returnImage = "NazcaHead";
			break;
			
			case 3:
				returnImage = "PlainHead";
			break;
			
			case 4:
				returnImage = "Raziel";
			break;
			
			case 5:
				returnImage = "StripeHead";
			break;
			
			default:
				returnImage = "BeardHead";
			break;
		}
		
		return returnImage;
	}
	
}
