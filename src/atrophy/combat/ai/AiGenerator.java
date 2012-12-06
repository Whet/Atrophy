/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import watoydoEngine.designObjects.display.Crowd;
import atrophy.actions.MouseAbilityHandler;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.thinkingAi.BanditTeamObject;
import atrophy.combat.ai.thinkingAi.TeamObject;
import atrophy.combat.ai.thinkingAi.ThinkingAi;
import atrophy.combat.ai.thinkingAi.ThinkingTeamObject;
import atrophy.combat.ai.thinkingAi.WhiteVistaTeamObject;
import atrophy.combat.ai.thinkingAi.loner.LonerAi;
import atrophy.combat.ai.thinkingAi.loner.LonerTeamObject;
import atrophy.combat.ai.thinkingAi.loner.TurretAi;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.display.VehicleImage;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Item;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.weapons.Weapon;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

// TODO: Auto-generated Javadoc
/**
 * The Class AiGenerator.
 */
public class AiGenerator{
	
	/**
	 * The Constant WHITE_VISTA.
	 */
	public static final String WHITE_VISTA = "White Vista";
	
	/**
	 * The Constant PLAYER.
	 */
	public static final String PLAYER = "Player";
	
	/**
	 * The Constant BANDITS.
	 */
	public static final String BANDITS = "Bandits";
	
	/**
	 * The Constant LONER.
	 */
	public static final String LONER = "Loner";
	
	/**
	 * The Constant DAEMON.
	 */
	public static final String DAEMON = "Daemon";
	
	public static final String TURRET = "Turret";
	
	/**
	 * The Constant nameHashMap.
	 */
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
	private CombatInorganicManager combatInorganicManager;
	private LootBox lootbox;
	
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
	
	public AiGenerator(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, LevelManager levelManager, PanningManager panningManager, MouseAbilityHandler mouseAbilityHandler, TurnProcess turnProcess, FloatingIcons floatingIcons, CombatInorganicManager combatInorganicManager, LootBox lootbox) {
		this.combatMembersManager = combatMembersManager; 
		this.aiCrowd = aiCrowd;
		this.combatUiManager = combatUiManager;
		this.combatVisualManager = combatVisualManager;
		this.panningManager = panningManager;
		this.floatingIcons = floatingIcons;
		this.turnProcess = turnProcess;
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.levelManager = levelManager;
		this.combatInorganicManager = combatInorganicManager;
		this.lootbox = lootbox;
	}
	
	/**
	 * Generate ai.
	 *
	 * @param crowd the crowd
	 */
	public void generateAi(Crowd crowd){
		
		int squadCount = 0;
		
		for(AiGeneratorInterface.GenerateCommand command : AiGeneratorInterface.getInstance().getCommands()){
			
			if(command instanceof SoloGenerateCommand){
				generateSoloAi(crowd, (SoloGenerateCommand)command, squadCount);
				squadCount++;
				continue;
			}
			
			switch(command.getFaction()){
				case WHITE_VISTA:
					generateTeam(Integer.toString(squadCount)+WHITE_VISTA,
								 command.getTeamSize(),
								 command.getAllowedItems(),
								 command.getAllowedWeapons(),
								 crowd,
								 levelManager.getFactionRoom(WHITE_VISTA));
				break;
				case BANDITS:
					generateTeam(Integer.toString(squadCount)+BANDITS,
								 command.getTeamSize(),
								 command.getAllowedItems(),
								 command.getAllowedWeapons(),
								 crowd,
								 levelManager.getFactionRoom(BANDITS));
				break;
				case PLAYER:
					generatePlayerTeam(crowd,
									   command.getSquad(),
									   levelManager.getFactionRoom(PLAYER));
				break;
				case LONER:
//					generateLoner(Integer.toString(squadCount)+"Loner", command.getLootTable(), crowd, levelManager.getFactionRoom(LONER));
				break;
				case TURRET:
					generateTurrets(squadCount+LONER,
									crowd,
									command.getX(),
									command.getY());
				break;
			}
			squadCount++;
		}
		
		for(int i = 0; i < AiGeneratorInterface.LONER_SPAWN_AMOUNT; i++){
			generateLoner(Integer.toString(squadCount)+LONER,
						  ItemMarket.getInstance().getLonerAllowedItems(),
						  ItemMarket.getInstance().getLonerAllowedWeapons(), 
					      crowd,
					      levelManager.getFactionRoom(LONER));
			squadCount++;
		}
		
		AiGeneratorInterface.getInstance().getCommands().clear();
		
		// choose 1st ai to control
		combatMembersManager.pickStartingAi();
		
		// create arraylist containing allies of player
		generateRosters();
		
		// create roster images
		combatUiManager.getAllyRoster().generatePortraits();
	}
	
	private void generateSoloAi(Crowd crowd, SoloGenerateCommand command, int team) {
		
		double[] location = new double[]{command.x, command.y};
		
		// Test Ai image
			
		AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, "Thinker"+"Loner",0,0);
		ThinkingAi ai = null;
		
		switch(command.getFaction()){
			case AiGenerator.LONER:
				ai = new LonerAi(panningManager, aiCrowd, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, combatMembersManager, command.getName(),location[0],location[1], levelManager, combatInorganicManager, combatUiManager, lootbox);
				ai.setBaseAggression(ThinkingAi.PASSIVE_RESPOND);
				ai.setImage(randomImage());
				ai.setTeam(team+LONER);
			break;
			case AiGenerator.WHITE_VISTA:
				ai = new ThinkingAi(panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, command.getName(),location[0],location[1], levelManager, combatInorganicManager, combatUiManager, lootbox);
				ai.setBaseAggression(ThinkingAi.PASSIVE_RESPOND);
				ai.setImage("Armour");
				ai.setTeam(team+WHITE_VISTA);
			break;
			case AiGenerator.BANDITS:
				ai = new ThinkingAi(panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, command.getName(),location[0],location[1], levelManager, combatInorganicManager, combatUiManager, lootbox);
				ai.setBaseAggression(ThinkingAi.AGGRESSIVE_FIGHTER);
				ai.setImage(randomImage());
				ai.setTeam(team+BANDITS);
			break;
		}
		
		ai.setWeapon(Weapon.stringToWeapon(command.getWeapon()));
		
		for(int i = 0; i < command.getItems().length; i++){
			ai.addItem(Item.stringToItem(command.getItems()[i]));
		}
		
		ai.assignAbilities();
		aiImg.setAi(ai);
		
		crowd.addDisplayItem(aiImg);
		aiCrowd.addMouseActionItem(aiImg);
		
		aiCrowd.addActor(ai);
		aiCrowd.addMask(aiImg);
		
		if(command != null){
			List<String> priority = new ArrayList<String>(1);
			priority.add(ai.getName());
			command.getAiNode().addPriorities(priority);
			ai.setAiNode(command.getAiNode());
		}
		
	}

	/**
	 * Generate player team.
	 *
	 * @param crowd the crowd
	 * @param squad the squad
	 * @param levelBlock the level block
	 * @param lootbox 
	 */
	private void generatePlayerTeam(Crowd crowd, ArrayList<Squaddie> squad, LevelBlock levelBlock) {
		double[] randomLocation = levelManager.randomInPosition(levelBlock);
		
		for(int i = 0; i < squad.size(); i++){

			Ai ai = null;
			AiImage aiImg = null;
			
			if(squad.get(i).isVehicle()){
				aiImg = new VehicleImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, "AiImg"+i,100,100);
				
				switch(squad.get(i).getVehicleType()){
					case MuleAi.MULE:
						ai = new MuleAi(panningManager, floatingIcons, mouseAbilityHandler, squad.get(i).getName(),randomLocation[0],randomLocation[1], combatInorganicManager, levelManager, lootbox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd);
					break;
				}
				
				ai.setImage(squad.get(i).getImage());
				ai.setTeam("1Player");
			}
			else{
				aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, "AiImg"+i,100,100);
				
				ai = new Ai(floatingIcons, mouseAbilityHandler, squad.get(i).getName(),randomLocation[0],randomLocation[1], combatInorganicManager, levelManager, lootbox, combatMembersManager, combatUiManager, combatVisualManager, aiCrowd, panningManager);
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
			crowd.addDisplayItem(aiImg);
			aiCrowd.addMouseActionItem(aiImg);
			
			
			aiCrowd.addActor(ai);
			aiCrowd.addMask(aiImg);
			
			randomLocation = levelManager.randomInPosition(levelBlock);
		}
	}
	
	/**
	 * Generate rosters.
	 */
	private void generateRosters(){
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			// make team object if ai is alive
			if(!aiCrowd.getActor(i).isDead()){
				addNewTeam(aiCrowd.getActor(i).getTeam());
				combatMembersManager.getTeamObject(aiCrowd.getActor(i).getTeam()).addTeamMember(aiCrowd.getActor(i));
			}
		}
		
		// update commanders and teams now they have been populated
		combatMembersManager.updateCommanders();
		combatMembersManager.initTeams();
		combatMembersManager.updateTeams();
	}
	
	/**
	 * Generate loner.
	 *
	 * @param team the team
	 * @param lootList the loot list
	 * @param weaponList the weapon list
	 * @param crowd the crowd
	 * @param room the room
	 */
	private void generateLoner(String team, ArrayList<String> allowedItems, ArrayList<String> allowedWeapons, Crowd crowd, LevelBlock room){
		
		double[] randomLocation = levelManager.randomInPosition(room);
		
		// Test Ai image
			
		AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, "Thinker"+"Loner",0,0);
		ThinkingAi ai;
		
//		switch(new Random().nextInt(5)){
//			case 1:
//				ai = new LonerAi(randomName(),randomLocation[0],randomLocation[1]);
//				ai.setBaseAggression(ThinkingAi.AGGRESSIVE_FIGHTER);
//			break;
//			default:
				ai = new LonerAi(panningManager, aiCrowd, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, combatMembersManager, randomName(),randomLocation[0],randomLocation[1], levelManager, combatInorganicManager, combatUiManager, lootbox);
				ai.setBaseAggression(ThinkingAi.PASSIVE_RESPOND);
//			break;
//		}
		
		ai.setImage(randomImage());
		
		ai.setTeam(team);
		
		applyLootList(allowedItems, allowedWeapons, ai);
		
		ai.assignAbilities();
		aiImg.setAi(ai);
		
		crowd.addDisplayItem(aiImg);
		aiCrowd.addMouseActionItem(aiImg);
		
		aiCrowd.addActor(ai);
		aiCrowd.addMask(aiImg);
		
	}
	
	private void generateTurrets(String team, Crowd crowd, double x, double y){
		
		AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, "Thinker"+"Loner",0,0);
		ThinkingAi ai;
		
		ai = new TurretAi(panningManager, aiCrowd, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, combatMembersManager, x,y, levelManager, combatInorganicManager, combatUiManager, lootbox);
		
		ai.setImage("Turret");
		
		ai.setTeam(team);
		
		ai.assignAbilities();
		aiImg.setAi(ai);
		
		crowd.addDisplayItem(aiImg);
		aiCrowd.addMouseActionItem(aiImg);
		
		aiCrowd.addActor(ai);
		aiCrowd.addMask(aiImg);
	}
	
	
	/**
	 * Generate team.
	 *
	 * @param team the team
	 * @param members the members
	 * @param lootList the loot list
	 * @param weaponList the weapon list
	 * @param crowd the crowd
	 * @param spawnRoom the spawn room
	 */
	private void generateTeam(String team, int members, ArrayList<String> allowedItems, ArrayList<String> allowedWeapons, Crowd crowd, LevelBlock spawnRoom){
		
		double[] randomLocation = levelManager.randomInPosition(spawnRoom);
		
		Pattern numberPattern = Pattern.compile("[0-9]+");
		Matcher numberMatcher;
		numberMatcher = numberPattern.matcher(team);
		numberMatcher.find();
		String faction = team.substring(numberMatcher.group().length());
		
		for(int i = 0; i < members; i++){
			// Test Ai image
			
			AiImage aiImg = new AiImage(aiCrowd, combatMembersManager, combatUiManager, combatVisualManager, panningManager, "Thinker"+faction+i,0,0);
			
			ThinkingAi ai = new ThinkingAi(panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, randomName(),randomLocation[0],randomLocation[1], levelManager, combatInorganicManager, combatUiManager, lootbox);
			
			ai.setImage(randomImage());
			
			ai.setTeam(team);
			
			applyLootList(allowedItems, allowedWeapons, ai);
			
			switch(ai.getFaction()){
				case BANDITS:
					ai.setBaseAggression(ThinkingAi.AGGRESSIVE_FIGHTER);
				break;
				case WHITE_VISTA:
					ai.setBaseAggression(ThinkingAi.PASSIVE_RESPOND);
					ai.setImage("Armour");
				break;
			}
			
			ai.assignAbilities();
			aiImg.setAi(ai);
			//crowd.addButton(aiImg);
			crowd.addDisplayItem(aiImg);
			aiCrowd.addMouseActionItem(aiImg);
			
			aiCrowd.addActor(ai);
			aiCrowd.addMask(aiImg);
			
			randomLocation = levelManager.randomInPosition(spawnRoom);
		}
	}
	
	/**
	 * Apply loot list.
	 *
	 * @param lootList the loot list
	 * @param weaponList the weapon list
	 * @param ai the ai
	 */
	private void applyLootList(ArrayList<String> allowedItems, ArrayList<String> allowedWeapons, Ai ai) {
		ai.setWeapon(Weapon.stringToWeapon(allowedWeapons.get(new Random().nextInt(allowedWeapons.size()))));
		
		int randomItemCount = new Random().nextInt(5);
		
		for(int i = 0; i < randomItemCount; i++){
			String item = allowedItems.get(new Random().nextInt(allowedItems.size()));
			
			Set<String> allowedDuplicateItems = new HashSet<String>();
			
			allowedDuplicateItems.add(GrenadeItem.NAME);
			allowedDuplicateItems.add(StunGrenadeItem.NAME);
			
			if(item != null && (!ai.getInventory().hasItem(Item.stringToItem(item)) || allowedDuplicateItems.contains(item)))
				ai.addItem(Item.stringToItem(item));
		}
	}
	
	
	/**
	 * Adds the new team.
	 *
	 * @param team the team
	 */
	private void addNewTeam(String team){
		
		Pattern numberPattern = Pattern.compile("[0-9]+");
		Matcher numberMatcher;
		
		// if team object doesn't exist
		if(combatMembersManager.getTeamObject(team) == null){
			if(team.equals("1Player")){
				combatMembersManager.getTeams().add(new TeamObject(combatVisualManager, team,Color.gray));
			}
			else{
				// switch on the faction of the team
				ThinkingTeamObject teamObject = null;
				numberMatcher = numberPattern.matcher(team);
				numberMatcher.find();
				String faction = team.substring(numberMatcher.group().length());
				
				switch(faction){
					case BANDITS:
						teamObject = new BanditTeamObject(combatVisualManager, team, levelManager);
						combatMembersManager.addTeam(teamObject);
						((BanditTeamObject) combatMembersManager.getTeamObject(team)).addAlliance(DAEMON);
					break;
					case WHITE_VISTA:
						teamObject = new WhiteVistaTeamObject(combatVisualManager, team, levelManager);
						combatMembersManager.addTeam(teamObject);
						((WhiteVistaTeamObject) combatMembersManager.getTeamObject(team)).addAlliance(PLAYER);
						((WhiteVistaTeamObject) combatMembersManager.getTeamObject(team)).addAlliance(DAEMON);
					break;/*
					case DAEMON:
						teamObject = new DaemonTeamObject(team);
						combatMembersManager.addTeam(teamObject);
						((DaemonTeamObject) combatMembersManager.getTeamObject(team)).addAlliance(WHITE_VISTA);
						((DaemonTeamObject) combatMembersManager.getTeamObject(team)).addAlliance(BANDITS);
					break;*/
					case LONER:
						teamObject = new LonerTeamObject(combatVisualManager, team, levelManager);
						combatMembersManager.addTeam(teamObject);
						((LonerTeamObject) combatMembersManager.getTeamObject(team)).addAlliance(DAEMON);
					break;
				}
				
				combatMembersManager.addTeam(teamObject);
			}
		}
	}
	
	/**
	 * Random faction.
	 *
	 * @return the string
	 */
	public static String randomFaction(){
		switch(new Random().nextInt(3)){
			case 0:
				return AiGenerator.WHITE_VISTA;
			case 1:
				return AiGenerator.BANDITS;
			default:
				return AiGenerator.LONER;
		}
	}
	
	/**
	 * Random name.
	 *
	 * @return the string
	 */
	public static String randomName(){
		Random rand = new Random();
		
		String name;
		String surname;
		
		name = nameHashMap.get(rand.nextInt(nameHashMap.size()));
		surname = surnameHashMap.get(rand.nextInt(surnameHashMap.size()));
		
		return name+" "+surname;
	}
	
	/**
	 * Random image.
	 *
	 * @return the string
	 */
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
