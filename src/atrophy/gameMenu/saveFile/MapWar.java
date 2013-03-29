/*
 * 
 */
package atrophy.gameMenu.saveFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.level.LevelIO;

/**
 * The Class MapWar.
 */
public class MapWar {

	/**
	 * The sectors.
	 */
	private ArrayList<Sector> sectors;
	
	private Missions missions;
	
	/**
	 * Instantiates a new map war.
	 */
	public MapWar(Missions missions){
		
		sectors = new ArrayList<Sector>();
		this.missions = missions;
		
		createSectors();
		
		try {
			loadMaps();
		}
		catch (IOException e) {
			System.err.println("Problem making or loading maps");
			System.exit(-1);
		}
	}
	
	/**
	 * Load maps.
	 *
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void loadMaps() throws FileNotFoundException, IOException{
		LevelIO.createLevelFolders();
		
		for(int j = 0; j < sectors.size(); j++){
			String maps = ReadWriter.readFromFile(ReadWriter.getRootFile("Sectors.txt"), j);
			int arraySize = ReadWriter.getArraySize(maps);
			ArrayList<String> mapNames = new ArrayList<String>();
			ArrayList<String> mapCodes = new ArrayList<String>();
			
			for(int i = 0; i < arraySize; i++){
				String[] mapNameCode = ReadWriter.readFromArray(maps, i).split("#");
				
				if(mapNameCode.length <= 1)
					continue;
				
				mapNames.add(mapNameCode[0]);
				mapCodes.add(mapNameCode[1]);
				
				if(!ReadWriter.getRootFile("Maps/" + mapNames.get(mapNames.size() - 1)).exists())
					continue;
			}
			
			sectors.get(j).setMaps(mapNames, mapCodes);
		}
		
		Iterator<Sector> sectorIt = sectors.iterator();
		
		while(sectorIt.hasNext()){
			
			Sector next = sectorIt.next();
			
			if(next.getMaps().length == 0)
				sectorIt.remove();
			
		}
		
	}

	/**
	 * Creates the sectors.
	 */
	private void createSectors() {
		
		//Engineering, Medical, Weapon supplies, Science
		
		sectors.add(new Sector("Underbelly",		5,5,2,2));
		sectors.add(new Sector("Engineering Beta",	10,5,0,5));
		sectors.add(new Sector("Residence One",		5,10,0,0));
		sectors.add(new Sector("Stores",			10,10,5,5));
		sectors.add(new Sector("Production",		20,5,10,5));
		sectors.add(new Sector("Robotics",			10,5,0,10));
		sectors.add(new Sector("Mixed Sciences",	10,5,0,10));
		sectors.add(new Sector("Energy",			10,5,5,5));
		sectors.add(new Sector("Bridge",			5,5,10,0));
		sectors.add(new Sector("Shrapnel",			6,6,6,0));
	}
	
	/**
	 * Gets the sector count.
	 *
	 * @return the sector count
	 */
	public int getSectorCount(){
		return this.sectors.size();
	}
	
	/**
	 * Gets the sector.
	 *
	 * @param i the i
	 * @return the sector
	 */
	public Sector getSector(int i){
		return this.sectors.get(i);
	}
	
	/**
	 * Gets the sector.
	 *
	 * @param name the name
	 * @return the sector
	 */
	public Sector getSector(String name){
		for(int i = 0; i < this.sectors.size(); i++){
			if(this.sectors.get(i).name.equals(name))
				return sectors.get(i);
		}
		return null;
	}
	
	/**
	 * Update ownership.
	 */
	public void updateSectors(){
		for(int i = 0 ; i < this.sectors.size(); i++){
			sectors.get(i).updateOwnership();
			sectors.get(i).updateUnlockedMaps(missions);
		}
	}
	
	/**
	 * The Class Sector.
	 */
	public static class Sector implements Serializable{
		
		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = -995475499404526582L;
		
		/**
		 * The name.
		 */
		private String name;
		
		/**
		 * The maps.
		 */
		private String[][] maps;
		
		/**
		 * The owner.
		 */
		private String[] owner;
		
		/**
		 * The science chance.
		 */
		private int engineeringChance,medicalChance,weaponChance,scienceChance;

		private Set<String> unlockedMaps;

		/**
		 * Instantiates a new sector.
		 *
		 * @param name the name
		 * @param e the e
		 * @param m the m
		 * @param w the w
		 * @param s the s
		 * @param missions 
		 */
		public Sector(String name,int e, int m, int w, int s){
			this.name = name;
			this.engineeringChance = e;
			this.medicalChance = m;
			this.weaponChance = w;
			this.scienceChance = s;
			this.unlockedMaps = new HashSet<>();
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
		 * Gets the maps.
		 *
		 * @return the maps
		 */
		public String[] getMaps() {
			return maps[0];
		}
		
		/**
		 * Gets the map.
		 *
		 * @param mapIndex the i
		 * @return the map
		 */
		public String getMap(int mapIndex){
			
			int i = 0;
			
			for(String mapName : unlockedMaps) {
				if(i == mapIndex)
					return mapName;
					
				i++;
			}
			
			return "";
		}

		public void updateUnlockedMaps(Missions missions) {
			for(int i = 0; i < maps.length; i++) {
				if(missions.hasMemCode(this.maps[1][i]))
					unlockedMaps.add(this.maps[0][i]);
			}
		}
		
		/**
		 * Gets the owner.
		 *
		 * @param i the i
		 * @return the owner
		 */
		public String getOwner(int mapIndex){
			
			int i = 0;
			
			for(@SuppressWarnings("unused") String mapName : unlockedMaps) {
				if(i == mapIndex)
					return this.owner[i];
					
				i++;
			}
			
			return "";
		}

		/**
		 * Sets the maps.
		 *
		 * @param maps the new maps
		 */
		public void setMaps(ArrayList<String> maps, ArrayList<String> mapCodes) {
			if(maps.size() == 0){
				this.maps = new String[2][0];
				this.owner = new String[0];
				return;
			}
			this.maps = new String[maps.size()][maps.size()];
			
			for(int i = 0; i < maps.size(); i++){
				this.maps[0][i] = maps.get(i);
				this.maps[1][i] = mapCodes.get(i);
			}
			
			this.owner = new String[maps.size()];
			
			updateOwnership();
		}

		/**
		 * Update ownership.
		 */
		public void updateOwnership() {
			for(int i = 0; i < this.owner.length; i++){
				owner[i] = randomFaction(owner[i]);
			}
		}

		/**
		 * Random faction.
		 *
		 * @return the string
		 */
		private String randomFaction(String currentFaction) {
			switch(new Random().nextInt(5)){
				case 0:
					return AiGenerator.LONER;
				case 1:
					return AiGenerator.WHITE_VISTA;
				case 2:
					return AiGenerator.BANDITS;
			}
			
			if(currentFaction == null)
				return AiGenerator.LONER;
			
			return currentFaction;
		}

		/**
		 * Gets the engineering chance.
		 *
		 * @return the engineering chance
		 */
		public int getEngineeringChance() {
			return engineeringChance;
		}

		/**
		 * Gets the medical chance.
		 *
		 * @return the medical chance
		 */
		public int getMedicalChance() {
			return medicalChance;
		}

		/**
		 * Gets the weapon chance.
		 *
		 * @return the weapon chance
		 */
		public int getWeaponChance() {
			return weaponChance;
		}
		
		/**
		 * Gets the science chance.
		 *
		 * @return the science chance
		 */
		public int getScienceChance() {
			return scienceChance;
		}

		/**
		 * Sets the engineering chance.
		 *
		 * @param engineeringChance the new engineering chance
		 */
		public void setEngineeringChance(int engineeringChance) {
			this.engineeringChance = engineeringChance;
		}

		/**
		 * Sets the medical chance.
		 *
		 * @param medicalChance the new medical chance
		 */
		public void setMedicalChance(int medicalChance) {
			this.medicalChance = medicalChance;
		}

		/**
		 * Sets the weapon chance.
		 *
		 * @param weaponChance the new weapon chance
		 */
		public void setWeaponChance(int weaponChance) {
			this.weaponChance = weaponChance;
		}
		
		/**
		 * Sets the science chance.
		 *
		 * @param scienceChance the new science chance
		 */
		public void setScienceChance(int scienceChance) {
			this.scienceChance = scienceChance;
		}

		public int getUnlockedMapCount() {
			return this.unlockedMaps.size();
		}

	}

	/**
	 * Sets the sectors.
	 *
	 * @param sectors the new sectors
	 */
	public void setSectors(ArrayList<Sector> sectors) {
		this.sectors = sectors;
	}

	/**
	 * Gets the sectors.
	 *
	 * @return the sectors
	 */
	public ArrayList<Sector> getSectors() {
		return this.sectors;
	}
	
	
	
}
