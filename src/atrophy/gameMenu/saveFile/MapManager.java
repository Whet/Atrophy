package atrophy.gameMenu.saveFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import watoydoEngine.io.ReadWriter;
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
		
		try {
			String fileLocation = ReadWriter.HOME_LOCATION + LevelIO.SUB_FOLDER + "/Sectors.json";
			JSONTokener tokener = new JSONTokener(new FileInputStream(fileLocation));
			JSONObject root = new JSONObject(tokener);
			
			Iterator<String> sectors = root.keys();

			while(sectors.hasNext()) {
			
				String sectorName = (String) sectors.next();
				
				JSONObject sector = root.getJSONObject(sectorName);
				
				// Create sector
				Sector sectorObject = new Sector(missions, sectorName, 0, 0, 0, 0);
				this.sectors.add(sectorObject);
				
				Iterator<String> sectorChildren = sector.keys();
				
				while(sectorChildren.hasNext()) {
				
					String sectorChildName = sectorChildren.next();
					
					JSONObject sectorChild = sector.getJSONObject(sectorChildName);
					
					if(sectorChildName.equals("spawnChances")) {
						
						Iterator<String> spawnInfo = sectorChild.keys();
						
						while(spawnInfo.hasNext()) {
							
							String spawnChanceTag = spawnInfo.next();
							
							int spawnChance = sectorChild.getInt(spawnChanceTag);
							
							switch(spawnChanceTag) {
								case "eChance":
									sectorObject.engineeringChance = spawnChance;
								break;
								case "wChance":
									sectorObject.weaponChance = spawnChance;
								break;
								case "sChance":
									sectorObject.scienceChance = spawnChance;
								break;
								case "mChance":
									sectorObject.medicalChance = spawnChance;
								break;
							}
							
						}
						
					}
					else if(sectorChildName.equals("maps")) {
						
						Iterator<String> mapNames = sectorChild.keys();
						
						while(mapNames.hasNext()) {
							
							String mapName = mapNames.next();
							
							JSONObject map = sectorChild.getJSONObject(mapName);
							
							sectorObject.addMap(mapName);
							
							Map mapObject = sectorObject.getMapObject(mapName);
							
							Iterator<String> mapProperties = map.keys();
							
							while(mapProperties.hasNext()) {
								
								String propertyName = mapProperties.next();
								
								if(propertyName.equals("req")) {
									
									JSONArray property = map.getJSONArray(propertyName);
									
									for(int i = 0; i < property.length(); i++) {
										String requirement = property.getString(i);
										mapObject.requirements.add(requirement);
									}
								}
								else if(propertyName.equals("cap")) {
									
									boolean property = map.getBoolean(propertyName);
									
									mapObject.cap = property;
								}
							}
						}
					}
				}
			}
		}
		catch(JSONException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		Iterator<Sector> sectorIt = sectors.iterator();
		
		while(sectorIt.hasNext()){
			
			Sector next = sectorIt.next();
			
			if(next.getMaps().size() == 0)
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
			sectors.get(i).updateUnlockedMaps(missions);
		}
	}
	
	public static class Sector implements Serializable{
		
		private static final long serialVersionUID = -995475499404526582L;
		private String name;
		private List<Map> maps;
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
			this.maps = new ArrayList<>();
		}
		
		public Map getMapObject(String name) {

			for(Map map: maps) {
				if(map.name.equals(name))
					return map;
			}
			
			return null;
			
		}

		public void addMap(String name) {
			this.maps.add(new Map(name));
		}

		public String getName(){
			return this.name;
		}

		public List<String> getMaps() {
			
			List<String> mapNames = new ArrayList<>();
			
			for(Map map: this.maps) {
				mapNames.add(map.name);
			}
			
			return mapNames;
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
			unlockedMaps.clear();
			
			for(Map map: this.maps) {
				if(map.isUnlocked(missions))
					this.unlockedMaps.add(map.name);
			}
		}
		
		public String getOwner(int mapIndex){
			
			if(this.getMap(mapIndex).isEmpty())
				return "";
			
			return this.missions.getMapOwner(this.getMap(mapIndex), this.name);
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
	
	private static class Map {
		
		public boolean cap;
		public String name;
		public List<String> requirements;
		
		public Map(String name) {
			this.name = name;
			this.cap = false;
			this.requirements = new ArrayList<>();
		}

		public boolean isUnlocked(Missions missions) {
			boolean allCodesUnlocked = true;
				
			for(String mapCode : this.requirements) {
				if((!mapCode.startsWith("!") && !missions.hasMemCode(mapCode)) ||
				   (mapCode.startsWith("!") && missions.hasMemCode(mapCode.substring(1)))) {
					allCodesUnlocked = false;
					break;
				}
			}
			
			return allCodesUnlocked;
			
		}
		
		public boolean canBeCaptured() {
			return cap;
		}
	}

	public void setSectors(ArrayList<Sector> sectors) {
		this.sectors = sectors;
	}

	public ArrayList<Sector> getSectors() {
		return this.sectors;
	}
	
	
	
}
