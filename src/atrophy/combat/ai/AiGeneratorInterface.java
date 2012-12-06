/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.Random;

import atrophy.combat.ai.thinkingAi.ThinkingAi.AiNode;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

/**
 * The Class AiGeneratorInterface.
 */
public class AiGeneratorInterface {

	/**
	 * The instance.
	 */
	private static AiGeneratorInterface instance;
	
	/**
	 * Gets the single instance of AiGeneratorInterface.
	 *
	 * @return single instance of AiGeneratorInterface
	 */
	public static AiGeneratorInterface getInstance(){
		if(instance == null){
			instance = new AiGeneratorInterface();
		}
		return instance;
	}	
	
	/**
	 * The commands.
	 */
	private ArrayList<GenerateCommand> commands;

	/**
	 * The DAEMO n_ spaw n_ allowed.
	 */
	public static boolean DAEMON_SPAWN_ALLOWED = false;
	
	/**
	 * The DAEMO n_ spaw n_ amount.
	 */
	public static int DAEMON_SPAWN_AMOUNT = 4;
	
	/**
	 * The LONE r_ spaw n_ amount.
	 */
	public static int LONER_SPAWN_AMOUNT = 4;
	
	/**
	 * Instantiates a new ai generator interface.
	 */
	private AiGeneratorInterface(){
		commands = new ArrayList<GenerateCommand>();
	}
	
	/**
	 * Gets the commands.
	 *
	 * @return the commands
	 */
	public ArrayList<GenerateCommand> getCommands() {
		return commands;
	}
	
	/**
	 * The Class GenerateCommand.
	 */
	public static class GenerateCommand{
		
		protected double x,y;
		
		/**
		 * The faction.
		 */
		private String faction;
		
		/**
		 * The max team size.
		 */
		private int maxTeamSize;
		
		/**
		 * The min team size.
		 */
		private int minTeamSize;
		
		/**
		 * The squad.
		 */
		private ArrayList<Squaddie> squad;

		private ArrayList<String> allowedWeapons;

		private ArrayList<String> allowedItems;
		
		/**
		 * Instantiates a new generate command.
		 *
		 * @param minTeamSize the min team size
		 * @param maxTeamSize the max team size
		 * @param lootTable the loot table
		 * @param weaponTable the weapon table
		 * @param faction the faction
		 */
		public GenerateCommand(int minTeamSize, int maxTeamSize, ArrayList<String> allowedItems, ArrayList<String> allowedWeapons, String faction){
			this.minTeamSize = minTeamSize;
			this.maxTeamSize = maxTeamSize;
			this.faction = faction;
			this.allowedItems = allowedItems;
			this.allowedWeapons = allowedWeapons;
		}

		/**
		 * Instantiates a new generate command.
		 *
		 * @param squad the squad
		 * @param faction the faction
		 */
		public GenerateCommand(ArrayList<Squaddie> squad, String faction) {
			this.squad = squad;
			this.faction = faction;
		}


		/**
		 * Gets the faction.
		 *
		 * @return the faction
		 */
		public String getFaction() {
			return faction;
		}

		/**
		 * Gets the max team size.
		 *
		 * @return the max team size
		 */
		public int getMaxTeamSize() {
			return maxTeamSize;
		}

		/**
		 * Gets the min team size.
		 *
		 * @return the min team size
		 */
		public int getMinTeamSize() {
			return minTeamSize;
		}

		/**
		 * Sets the max team size.
		 *
		 * @param maxTeamSize the new max team size
		 */
		public void setMaxTeamSize(int maxTeamSize) {
			this.maxTeamSize = maxTeamSize;
		}

		/**
		 * Sets the min team size.
		 *
		 * @param minTeamSize the new min team size
		 */
		public void setMinTeamSize(int minTeamSize) {
			this.minTeamSize = minTeamSize;
		}

		/**
		 * Sets the faction.
		 *
		 * @param faction the new faction
		 */
		public void setFaction(String faction) {
			this.faction = faction;
		}

		/**
		 * Gets the team size.
		 *
		 * @return the team size
		 */
		public int getTeamSize() {
			
			if(this.maxTeamSize != this.minTeamSize){
				return this.minTeamSize + new Random().nextInt(this.maxTeamSize - this.minTeamSize);
			}
			return this.minTeamSize;
		}
		
		/**
		 * Gets the squad.
		 *
		 * @return the squad
		 */
		public ArrayList<Squaddie> getSquad(){
			return this.squad;
		}
		
		public double getX(){
			return this.x;
		}
		
		public double getY(){
			return this.y;
		}

		public ArrayList<String> getAllowedWeapons() {
			return allowedWeapons;
		}

		public ArrayList<String> getAllowedItems() {
			return allowedItems;
		}
	}
	
	public static class TurretGenerateCommand extends GenerateCommand{
		
		public TurretGenerateCommand(double x, double y){
			super(1, 1, null, null, AiGenerator.TURRET);
			this.x = x;
			this.y = y;
		}
	}
	
	public static class SoloGenerateCommand extends GenerateCommand{
		
		private String name, weapon;
		private String[] items;
		private AiNode aiNode;
		
		public SoloGenerateCommand(double x, double y, String faction, String name, String weapon, String[] items){
			super(1, 1, null, null, faction);
			this.x = x;
			this.y = y;
			
			this.name = name;
			this.weapon = weapon;
			this.items = items;
		}

		public String getName() {
			return name;
		}

		public String getWeapon() {
			return weapon;
		}

		public String[] getItems() {
			return items;
		}
		
		public void addAiNode(AiNode aiNode){
			this.aiNode = aiNode;
		}

		public AiNode getAiNode() {
			return aiNode;
		}
		
	}

}
