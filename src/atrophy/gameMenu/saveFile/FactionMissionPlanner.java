package atrophy.gameMenu.saveFile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FactionMissionPlanner {

	private String faction;
	// sector, maps
	private Map<String, Set<String>> mapsOwned;
	
	public FactionMissionPlanner(String faction) {
		this.faction = faction;
		this.mapsOwned = new HashMap<>();
	}

	public boolean ownsMap(String mapName, String sectorName) {
		
		if(!this.mapsOwned.containsKey(sectorName))
			return false;
		
		return this.mapsOwned.get(sectorName).contains(mapName);
	}
	
}
	
