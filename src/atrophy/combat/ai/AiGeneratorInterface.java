package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import atrophy.combat.ai.ThinkingAi.AiNode;
import atrophy.combat.ai.director.DirectorArchetype;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

public class AiGeneratorInterface {
	
	private ArrayList<GenerateCommand> commands;
	
	private AiGeneratorInterface(){
		commands = new ArrayList<GenerateCommand>();
	}
	
	public ArrayList<GenerateCommand> getCommands() {
		return commands;
	}
	
	public static class GenerateCommand{
		
		protected DirectorArchetype directorClass;
		
		protected Double x,y;
		
		private Faction faction;
		
		private int maxTeamSize;
		
		private int minTeamSize;
		
		private ArrayList<Squaddie> squad;

		private List<String> allowedWeapons;

		private List<String> allowedItems;
		
		public GenerateCommand(int minTeamSize, int maxTeamSize, List<String> allowedItems, List<String> allowedWeapons, Faction faction){
			this.minTeamSize = minTeamSize;
			this.maxTeamSize = maxTeamSize;
			this.faction = faction;
			this.allowedItems = allowedItems;
			this.allowedWeapons = allowedWeapons;
			this.directorClass = DirectorArchetype.UNDECIDED;
		}

		public GenerateCommand(ArrayList<Squaddie> squad, Faction faction) {
			this.squad = squad;
			this.faction = faction;
		}


		public Faction getFaction() {
			return faction;
		}

		public int getMaxTeamSize() {
			return maxTeamSize;
		}

		public int getMinTeamSize() {
			return minTeamSize;
		}

		public void setMaxTeamSize(int maxTeamSize) {
			this.maxTeamSize = maxTeamSize;
		}

		public void setMinTeamSize(int minTeamSize) {
			this.minTeamSize = minTeamSize;
		}

		public void setFaction(Faction faction) {
			this.faction = faction;
		}

		public int getTeamSize() {
			
			if(this.maxTeamSize != this.minTeamSize){
				return this.minTeamSize + new Random().nextInt(this.maxTeamSize - this.minTeamSize);
			}
			return this.minTeamSize;
		}
		
		public ArrayList<Squaddie> getSquad(){
			return this.squad;
		}
		
		public double getX(){
			return this.x;
		}
		
		public double getY(){
			return this.y;
		}

		public List<String> getAllowedWeapons() {
			return allowedWeapons;
		}

		public List<String> getAllowedItems() {
			return allowedItems;
		}
	}
	
	public static class TurretGenerateCommand extends GenerateCommand{
		
		public TurretGenerateCommand(double x, double y){
			super(1, 1, null, null, Faction.TURRET);
			this.x = x;
			this.y = y;
		}
	}
	
	public static class SoloGenerateCommand extends GenerateCommand{
		
		private String name, weapon;
		private String[] items;
		private Faction[] alliances;
		private AiNode aiNode;
		private boolean isDaemon;
		
		public SoloGenerateCommand(double x, double y, Faction faction, boolean isDaemon, String name, String weapon, String[] items){
			super(1, 1, null, null, faction);
			this.x = x;
			this.y = y;
			
			this.isDaemon = isDaemon;
			this.name = name;
			this.weapon = weapon;
			this.items = items;
		}
		
		public SoloGenerateCommand(Faction faction, boolean isDaemon, String name, String weapon, String[] items){
			super(1, 1, null, null, faction);
			
			this.isDaemon = isDaemon;
			this.name = name;
			this.weapon = weapon;
			this.items = items;
		}
		
		public SoloGenerateCommand(Faction faction, DirectorArchetype directorClass, boolean isDaemon, String name, String weapon, String[] items){
			super(1, 1, null, null, faction);
			
			this.isDaemon = isDaemon;
			this.name = name;
			this.weapon = weapon;
			this.items = items;
			this.directorClass = directorClass;
		}
		
		public boolean isDaemon() {
			return isDaemon;
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

		public void setAlliances(Faction[] alliances) {
			this.alliances = alliances;
		}

		public Faction[] getAlliances() {
			return alliances;
		}
		
	}
	
	public static class DaemonRandomSpawn extends GenerateCommand {

		public static final String AXE = "Axe";
		
		public DaemonRandomSpawn(@SuppressWarnings("unused") String daemonType) {
			super(1, 1, null, null, Faction.DAEMON);
		}
		
	}

}
