package atrophy.gameMenu.saveFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.level.LevelIO;

public class MapManager {
	private ArrayList<Sector> sectors;
	
	private Missions missions;
	
	public MapManager(Missions missions){
		
		sectors = new ArrayList<Sector>();
		this.missions = missions;
		
		createSectors();
		
		try {
			loadMaps();
		}
		catch (IOException e) {
			e.printStackTrace();
			System.err.println("Problem making or loading maps");
			System.exit(-1);
		}
	}
	
	public void loadMaps() throws FileNotFoundException, IOException{
		LevelIO.createLevelFolders();
		
		for(int j = 0; j < sectors.size(); j++){
			String maps = ReadWriter.readFromFile(ReadWriter.getRootFile("Sectors.txt"), j);
			int arraySize = ReadWriter.getArraySize(maps);
			List<String> mapNames = new ArrayList<String>();
			List<List<String>> mapCodes = new ArrayList<List<String>>();
			List<String> mapMemCodes;
			
			for(int i = 0; i < arraySize; i++){
				
				mapMemCodes = new ArrayList<>();
				mapCodes.add(mapMemCodes);
				
				String[] mapNameCode = ReadWriter.readFromArray(maps, i).split("#");
				
				if(mapNameCode.length <= 1)
					continue;
				
				mapNames.add(mapNameCode[0]);
				
				for(int k = 1; k < mapNameCode.length; k++) {
					mapMemCodes.add(mapNameCode[k]);
				}
				
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

	private void createSectors() {
		
		//Engineering, Medical, Weapon supplies, Science
		
		sectors.add(new Sector(missions, "Bridge",			5,5,10,0));
		sectors.add(new Sector(missions, "Energy",			10,5,5,5));
		sectors.add(new Sector(missions, "Engineering Beta",10,5,0,10));
		sectors.add(new Sector(missions, "Mixed Sciences",	10,5,0,10));
		sectors.add(new Sector(missions, "Production",		20,5,10,5));
		sectors.add(new Sector(missions, "Residence One",	5,10,0,0));
		sectors.add(new Sector(missions, "Robotics",		10,5,0,10));
		sectors.add(new Sector(missions, "Shrapnel",		6,6,6,0));
		sectors.add(new Sector(missions, "Stores",			10,10,5,5));
		sectors.add(new Sector(missions, "Underbelly",		5,5,5,2));
		
	}
	
	public int getSectorCount(){
		return this.sectors.size();
	}
	
	public Sector getSector(int sectorInt){
		int button  = 0;
		
		for(int i = 0; i < sectors.size(); i++){
			
			Sector sector = sectors.get(i);

			if(sectorInt == button && sector.getUnlockedMapCount() > 0)
				return sector;
			
			if(sector.getUnlockedMapCount() > 0) {
				button++;
			}
		}
		return null;
	}
	
	public Sector getSector(String name){
		for(int i = 0; i < this.sectors.size(); i++){
			if(this.sectors.get(i).name.equals(name))
				return sectors.get(i);
		}
		return null;
	}
	
	public void updateSectors(){
		for(int i = 0 ; i < this.sectors.size(); i++){
			sectors.get(i).updateOwnership();
			sectors.get(i).updateUnlockedMaps(missions);
		}
	}
	
	public static class Sector implements Serializable{
		
		private static final long serialVersionUID = -995475499404526582L;
		private String name;
		private String[] maps;
		private List<List<String>> mapMemCodes;
		private String[] owner;
		private int engineeringChance,medicalChance,weaponChance,scienceChance;
		private Missions missions;

		private Set<String> unlockedMaps;

		public Sector(Missions missions, String name,int e, int m, int w, int s){
			this.name = name;
			this.engineeringChance = e;
			this.medicalChance = m;
			this.weaponChance = w;
			this.scienceChance = s;
			this.unlockedMaps = new HashSet<>();
			this.missions = missions;
		}
		
		public String getName(){
			return this.name;
		}

		public String[] getMaps() {
			return maps;
		}
		
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
			boolean allCodesUnlocked;
			
			for(int i = 0; i < maps.length; i++) {
				
				allCodesUnlocked = true;
				
				for(String mapCode : mapMemCodes.get(i)) {
					if((!mapCode.startsWith("!") && !missions.hasMemCode(mapCode)) ||
					   (mapCode.startsWith("!") && missions.hasMemCode(mapCode.substring(1)))) {
						allCodesUnlocked = false;
						break;
					}
				}
				
				if(allCodesUnlocked)
					unlockedMaps.add(this.maps[i]);
			}
		}
		
		public String getOwner(int mapIndex){
			
			int i = 0;
			
			for(@SuppressWarnings("unused") String mapName : unlockedMaps) {
				if(i == mapIndex)
					return this.owner[i];
					
				i++;
			}
			
			return "";
		}

		public void setMaps(List<String> mapNames, List<List<String>> mapCodes) {
			
			this.maps = new String[mapNames.size()];
			
			for(int i = 0; i < mapNames.size(); i++){
				this.maps[i] = mapNames.get(i);
			}
			
			this.mapMemCodes = mapCodes;
			this.owner = new String[mapNames.size()];
			
			updateOwnership();
		}

		public void updateOwnership() {
			for(int i = 0; i < this.owner.length; i++) {
				this.owner[i] = this.missions.getMapOwner(this.maps[i], this.name);
			}
		}

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

		public int getEngineeringChance() {
			return engineeringChance;
		}

		public int getMedicalChance() {
			return medicalChance;
		}

		public int getWeaponChance() {
			return weaponChance;
		}
		
		public int getScienceChance() {
			return scienceChance;
		}

		public void setEngineeringChance(int engineeringChance) {
			this.engineeringChance = engineeringChance;
		}

		public void setMedicalChance(int medicalChance) {
			this.medicalChance = medicalChance;
		}

		public void setWeaponChance(int weaponChance) {
			this.weaponChance = weaponChance;
		}
		
		public void setScienceChance(int scienceChance) {
			this.scienceChance = scienceChance;
		}

		public int getUnlockedMapCount() {
			return this.unlockedMaps.size();
		}

	}

	public void setSectors(ArrayList<Sector> sectors) {
		this.sectors = sectors;
	}

	public ArrayList<Sector> getSectors() {
		return this.sectors;
	}
	
	
	
}
