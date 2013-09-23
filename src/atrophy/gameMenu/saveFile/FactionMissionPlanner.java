package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;
import atrophy.gameMenu.saveFile.MapManager.Sector;
import atrophy.gameMenu.saveFile.Missions.AttackMission;
import atrophy.gameMenu.saveFile.Missions.Mission;
import atrophy.gameMenu.ui.StashManager;

public class FactionMissionPlanner implements Serializable{

	private static final Integer SUPPLY_BASE_COST = 100;
	private static final Integer ATTACK_REWARD = 20;
	private static final double FAILED_MISSION_REP = -2;
	
	private String faction;
	// sector, maps
	private Map<String, Set<String>> mapsOwned;
	private int weaponSupply, engineeringSupply, scienceSupply, medicalSupply;
	private transient List<Mission> activeMissions;
	
	private String targetTech;
	private StringBuffer news;
	private int researchCount;
	private int territoryAttacks;
	
	public FactionMissionPlanner(String faction) {
		this.faction = faction;
		this.mapsOwned = new HashMap<>();
		this.weaponSupply = 0;
		this.engineeringSupply = 0;
		this.scienceSupply = 0;
		this.medicalSupply = 0;
		this.researchCount = 0;
		this.activeMissions = new ArrayList<>();
		this.news = new StringBuffer();
	}

	public boolean ownsMap(String mapName, String sectorName) {
		
		if(!this.mapsOwned.containsKey(sectorName))
			return false;
		
		return this.mapsOwned.get(sectorName).contains(mapName);
	}
	
	public void updatePlanner(MapManager mapManager, TechTree techTree, Missions missions, Squad squad, StashManager stashManager, FactionMissionPlanner enemyPlanner, ItemMarket itemMarket) {
		news.delete(0, news.length());
		updatePlannerKeepNews(mapManager, techTree, missions, squad, stashManager, enemyPlanner, itemMarket);
	}
	
	public void updatePlannerKeepNews(MapManager mapManager, TechTree techTree, Missions missions, Squad squad, StashManager stashManager, FactionMissionPlanner enemyPlanner, ItemMarket itemMarket) {
		
		territoryAttacks = getResearchDifference(enemyPlanner) + new Random().nextInt(3);
		
		addResources(mapManager);
		updateMissions(missions, squad);
		spendResources(techTree, missions, squad, stashManager);
		setAttackTargets(mapManager, missions, stashManager, squad, itemMarket, techTree);
	}

	private void setAttackTargets(MapManager mapManager, Missions missions, StashManager stashManager, Squad squad, ItemMarket itemMarket, TechTree techTree) {
		ArrayList<Sector> sectors = mapManager.getSectors();
		
		PriorityQueue<AttackLocation> possibleAttackLocations = new PriorityQueue<AttackLocation>(20, new Comparator<AttackLocation>() {

			@Override
			public int compare(AttackLocation o1, AttackLocation o2) {
				
				if(o1.getValue() < o2.getValue())
					return -1;
				else if(o1.getValue() > o2.getValue())
					return 1;
				
				return 0;
			}
		});
		
		for(Sector sector: sectors) {
			for(MapManager.Map map:sector.getUnlockedMaps()) {
				if(map.canBeCaptured() && (this.mapsOwned.get(sector.getName()) == null || !this.mapsOwned.get(sector.getName()).contains(map.name)))
					possibleAttackLocations.add(new AttackLocation(sector.getName(), map.name, sector.getEngineeringChance(), sector.getMedicalChance(), sector.getWeaponChance(), sector.getScienceChance()));
			}
		}
		
		// Create attack missions
		for(int i = 0; i < territoryAttacks; i++) {
			
			if(possibleAttackLocations.size() == 0)
				break;
			
			AttackLocation attackLocation = possibleAttackLocations.poll();
			
			this.activeMissions.add(new Missions.AttackMission(missions, stashManager, faction, squad, ATTACK_REWARD * attackLocation.getValue(),
									attackLocation.mapName, mapManager.getSector(attackLocation.sector).getOwner(missions, attackLocation.mapName),
									attackLocation.eChance, attackLocation.mChance, attackLocation.wChance, attackLocation.sChance,
									itemMarket, techTree, attackLocation.sector));
		}
	}
	
	private static class AttackLocation {
		public final int eChance, mChance, wChance, sChance;
		public final String sector, mapName;
		
		public AttackLocation(String sector, String mapName, int eChance, int mChance, int wChance, int sChance) {
			this.eChance = eChance;
			this.mChance = mChance;
			this.wChance = wChance;
			this.sChance = sChance;
			
			this.sector = sector;
			this.mapName = mapName;
		}

		public int getValue() {
			return eChance + mChance + wChance + sChance;
		}
	}

	private void updateMissions(Missions missions, Squad squad) {
		Iterator<Mission> iterator = activeMissions.iterator();
		while(iterator.hasNext()) {
			Mission next = iterator.next();
			next.tickTimeToLive();
			
			// See if faction took location
			if(next instanceof AttackMission && ((AttackMission) next).isChecked) {
				
				AttackMission atkMission = (AttackMission) next;
				
				if(this.faction.equals(AiGenerator.WHITE_VISTA) && missions.getPlayerBanditKillCount() == 0 ||
				   this.faction.equals(AiGenerator.BANDITS) && missions.getPlayerWhiteVistaKillCount() == 0) {
					// Penalise player
					missions.getSquad().incrementFactionRelation(this.faction, FAILED_MISSION_REP);
				}
				if(missions.getPlayerKillCount(this.faction) > 0) {
					missions.getSquad().incrementFactionRelation(this.faction, -4);
				}
				if((this.faction.equals(AiGenerator.WHITE_VISTA) && missions.getLivingBandits() == 0 && missions.getLivingWV() > 0) ||
				   (this.faction.equals(AiGenerator.BANDITS) && missions.getLivingWV() == 0 && missions.getLivingBandits() > 0)) {
					// take territory
					this.addTerritory(atkMission.sectorName, atkMission.mapName);
					
					squad.setAdvance(squad.getAdvance() + ((Integer) next.reward));
				}
			}
			
			// If attack mission taken wait to see results next call of updateMissions
			if(next instanceof AttackMission && ((AttackMission) next).isTaken() && !((AttackMission) next).isChecked) {
				((AttackMission) next).isChecked = true;
				continue;
			}

			if(next.isExpired())
				iterator.remove();
		}
	}

	private void addTerritory(String sectorName, String mapName) {
		if(!this.mapsOwned.containsKey(sectorName))
			this.mapsOwned.put(sectorName, new HashSet<String>());
		
		this.mapsOwned.get(sectorName).add(mapName);
		
		news.append("Captured territory " + mapName + " in sector: " + sectorName + "@n");
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
			this.activeMissions.add(new Missions.ShoppingListMission(missions, squad, stashManager, maxRequirement, SUPPLY_BASE_COST, faction));
		
	}
	
	private void research(TechTree techTree, String tech) {
		techTree.research(tech, this.faction);
		researchCount++;
		
		if(tech.equals(targetTech))
			targetTech = null;
		
		int[] requirements = techTree.getRequirements(tech);
		
		this.scienceSupply -= requirements[0];
		this.engineeringSupply -= requirements[1];
		this.weaponSupply -= requirements[2];
		this.medicalSupply -= requirements[3];
		
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
	
	public int getResearchDifference(FactionMissionPlanner enemyPlanner) {
		return this.researchCount - enemyPlanner.getResearchCount();
	}

	public int getResearchCount() {
		return researchCount;
	}
	
}
	
