package atrophy.gameMenu.saveFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;
import atrophy.gameMenu.saveFile.MapManager.Sector;
import atrophy.gameMenu.saveFile.Missions.Mission;
import atrophy.gameMenu.ui.StashManager;

public class FactionMissionPlanner {

	private String faction;
	// sector, maps
	private Map<String, Set<String>> mapsOwned;
	private int weaponSupply, engineeringSupply, scienceSupply, medicalSupply;
	private List<Mission> activeMissions;
	
	private String targetTech;
	
	private StringBuffer news;
	
	public FactionMissionPlanner(String faction) {
		this.faction = faction;
		this.mapsOwned = new HashMap<>();
		this.weaponSupply = 0;
		this.engineeringSupply = 0;
		this.scienceSupply = 0;
		this.medicalSupply = 0;
		this.activeMissions = new ArrayList<>();
		this.news = new StringBuffer();
	}

	public boolean ownsMap(String mapName, String sectorName) {
		
		if(!this.mapsOwned.containsKey(sectorName))
			return false;
		
		return this.mapsOwned.get(sectorName).contains(mapName);
	}
	
	public void updatePlanner(MapManager mapManager, TechTree techTree, Missions missions, Squad squad, StashManager stashManager) {
		news.delete(0, news.length());
		addResources(mapManager);
		updateMissions();
		spendResources(techTree, missions, squad, stashManager);
	}

	private void updateMissions() {
		Iterator<Mission> iterator = activeMissions.iterator();
		while(iterator.hasNext()) {
			Mission next = iterator.next();
			next.tickTimeToLive();
			
			if(next.isExpired())
				iterator.remove();
		}
	}

	private void addResources(MapManager mapManager) {
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
	
	private void spendResources(TechTree techTree, Missions missions, Squad squad, StashManager stashManager) {
		
		if(targetTech != null && canBuyTech(techTree.getRequirements(targetTech)))
			this.research(techTree, targetTech);
		
		int[] maxRequirement = new int[]{0,0,0,0};
		
		List<String> nextTechs = new ArrayList<>(techTree.getNextTechs());
		Collections.shuffle(nextTechs);
		
		for(String tech: nextTechs) {
			// Science, Engineering, Weapon, Medical
			int[] requirements = techTree.getRequirements(tech);
		
			
			if(canBuyTech(requirements)) {
				this.research(techTree, tech);
			}
			else if(requirementDistance(requirements) > requirementDistance(maxRequirement)) {
				maxRequirement[0] = requirements[0];
				maxRequirement[1] = requirements[1];
				maxRequirement[2] = requirements[2];
				maxRequirement[3] = requirements[3];
				targetTech = tech;
			}
				
		}
		
		if(this.activeMissions.isEmpty() && targetTech != null)
			this.activeMissions.add(new Missions.ShoppingListMission(missions, squad, stashManager, maxRequirement, 200, faction));
		
	}
	
	private void research(TechTree techTree, String tech) {
		techTree.research(tech, this.faction);
		news.append("Researched " + tech + "@n");
		
		if(tech.equals(targetTech))
			targetTech = null;
		
		System.out.println(faction + " preresearch " + tech);
		System.out.println(faction + "   e:" + engineeringSupply + " w:" + weaponSupply + " m:" + medicalSupply + " s:" + scienceSupply);
		int[] requirements = techTree.getRequirements(tech);
		
		this.scienceSupply -= requirements[0];
		this.engineeringSupply -= requirements[1];
		this.weaponSupply -= requirements[2];
		this.medicalSupply -= requirements[3];
		
		System.out.println(faction + " researched " + tech);
		System.out.println(faction + "   e:" + engineeringSupply + " w:" + weaponSupply + " m:" + medicalSupply + " s:" + scienceSupply);
	}

	private int requirementDistance(int[] requirements) {
		return (requirements[0] - this.scienceSupply) +  (requirements[1] - this.engineeringSupply) + (requirements[2] - this.weaponSupply) + (requirements[3] - this.medicalSupply);
	}

	private boolean canBuyTech(int[] requirements) {
		return this.scienceSupply >= requirements[0] && this.engineeringSupply >= requirements[1] && this.weaponSupply >= requirements[2] && this.medicalSupply >= requirements[3];
	}

	public List<Mission> getMissions() {
		return this.activeMissions;
	}

	public void give(String name, int quantity) {
		switch(name) {
			case ScienceSupply.NAME:
				this.scienceSupply += quantity;
			break;
			case EngineeringSupply.NAME:
				this.engineeringSupply += quantity;
			break;
			case WeaponSupply.NAME:
				this.weaponSupply += quantity;
			break;
			case MedicalSupply.NAME:
				this.medicalSupply += quantity;
			break;
		}
	}

	public String getNews() {
		return news.toString();
	}
	
}
	
