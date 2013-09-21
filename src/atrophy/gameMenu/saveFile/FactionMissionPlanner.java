package atrophy.gameMenu.saveFile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import atrophy.gameMenu.saveFile.MapManager.Sector;

public class FactionMissionPlanner {

	private String faction;
	// sector, maps
	private Map<String, Set<String>> mapsOwned;
	private int weaponSupply, engineeringSupply, scienceSupply, medicalSupply;
	
	public FactionMissionPlanner(String faction) {
		this.faction = faction;
		this.mapsOwned = new HashMap<>();
		this.weaponSupply = 0;
		this.engineeringSupply = 0;
		this.scienceSupply = 0;
		this.medicalSupply = 0;
	}

	public boolean ownsMap(String mapName, String sectorName) {
		
		if(!this.mapsOwned.containsKey(sectorName))
			return false;
		
		return this.mapsOwned.get(sectorName).contains(mapName);
	}
	
	public void updatePlanner(MapManager mapManager) {
		for(Entry<String, Set<String>> entry: mapsOwned.entrySet()) {
			Sector sector = mapManager.getSector(entry.getKey());
			
			Iterator<String> iterator = entry.getValue().iterator();
			
			while(iterator.hasNext()) {
				String mapName = iterator.next();
				
				atrophy.gameMenu.saveFile.MapManager.Map mapObject = sector.getMapObject(mapName);
				
				if(mapObject == null) {
					iterator.remove();
					break;
				}
				
				Random rand = new Random();
				
				if(rand.nextInt(100) < sector.getEngineeringChance()){
					engineeringSupply++;
				}
				if(rand.nextInt(100) < sector.getMedicalChance()){
					medicalSupply++;
				}
				if(rand.nextInt(100) < sector.getWeaponChance()){
					weaponSupply++;
				}
				if(rand.nextInt(100) < sector.getScienceChance()){
					scienceSupply++;
				}
			}
		}
	}
	
}
	
