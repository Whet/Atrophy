package atrophy.gameMenu.saveFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.RecognitionException;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.MenuMapInterface;
import atrophy.gameMenu.ui.StashManager;

public class Missions{

	public static final String DEFAULT_MEM_CODE = "OPEN";
	
	private Squaddie interactingMember;
	private ArrayList<Mission> missions;
	private Set<String> memCodes;
	private Set<String> characterCodes;
	private Map<String, String> tempCharacterCodes;
	private Squad squad;
	private FactionMissionPlanner wvResearchAi, banditsResearchAi;
	private MapManager mapWar;
	private TechTree techTree;
	private StashManager stashManager;
	private ItemMarket itemMarket;

	private int playerBanditKillCount = 0;
	private int playerLonerKillCount = 0;
	private int playerWhiteVistaKillCount = 0;
	private int banditDeaths = 0;
	private int lonerDeaths = 0;
	private int wvDeaths = 0;
	private int livingBandits = 0;
	private int livingLoners = 0;
	private int livingWV = 0;
	
	public Missions(){
		missions = new ArrayList<>();
		memCodes = new HashSet<>();
		characterCodes = new HashSet<>();
		tempCharacterCodes = new HashMap<>();
		memCodes.add(DEFAULT_MEM_CODE);
		this.wvResearchAi = new FactionMissionPlanner(AiGenerator.WHITE_VISTA);
		this.banditsResearchAi = new FactionMissionPlanner(AiGenerator.BANDITS);
	}
	
	public void lazyLoad(Squad squad, StashManager stashManager, ItemMarket itemMarket, TechTree techTree, MapManager mapWar) {
		this.squad = squad;
		this.mapWar = mapWar;
		this.techTree = techTree;
		this.stashManager = stashManager;
		this.itemMarket = itemMarket;
	}
	
	public Squaddie getInteractingMember() {
		return interactingMember;
	}

	public void updateMissions(){
		this.missions.clear();
		for(Mission mission: wvResearchAi.getMissions()) {
			this.missions.add(mission);
		}
		for(Mission mission: banditsResearchAi.getMissions()) {
			this.missions.add(mission);
		}
	}
	
	public void setInteractingMember(Squaddie interactingMember) {
		this.interactingMember = interactingMember;
	}
	
	public int getMissionCount() {
		return this.missions.size();
	}
	
	public Mission getMission(int index) {
		
		if(index >= this.missions.size())
			return null;
		
		return this.missions.get(index);
	}

	public String getMissionName(int i) {
		
		if(i >= this.missions.size())
			return "";
		
		return this.missions.get(i).name;
	}
	
	public boolean addMemCode(String memCode){
		return this.memCodes.add(memCode);
	}
	
	public void removeMemCode(String memCode) {
		this.memCodes.remove(memCode);
	}
	
	public boolean hasMemCode(String memCode){
		return this.memCodes.contains(memCode);
	}
	
	public void setMemCodes(Set<String> memCodes) {
		this.memCodes = memCodes;
		memCodes.add(DEFAULT_MEM_CODE);
	}
	
	public Set<String> getMemCodes() {
		return memCodes;
	}
	
	public static abstract class Mission implements Serializable{
		
		private static final long serialVersionUID = 5776226028366470409L;
		protected String name;
		protected String description;
		protected Object reward;
		
		// Whether the reward is an item (String) or Advance (int)
		protected boolean rewardItem;

		protected Missions missions;
		protected Squad squad;
		protected StashManager stashManager;
		protected Integer timeToLive;
		protected String faction;
		
		public Mission(Missions missions, StashManager stashManager, String faction, String name, String description, boolean isRewardItem, Object reward, Squad squad){
			this.rewardItem = isRewardItem;
			this.reward = reward;
			this.name = name;
			this.description = description;
			this.missions = missions;
			this.squad = squad;
			this.stashManager = stashManager;
			this.timeToLive = 10;
			this.faction = faction;
		}
		
		protected void giveReward() {
			if(rewardItem){
				stashManager.addItem((String) reward);
			}
			else{
				missions.squad.setAdvance(missions.squad.getAdvance() + (Integer)reward);
			}
			
			if(missions.squad.getFactionRelation(faction) >= 0)
				missions.squad.incrementFactionRelation(this.faction, 0.1);
			else
				missions.squad.incrementFactionRelation(this.faction, 0.05);
			
			missions.missions.remove(this);
		}
		
		public abstract boolean interact();


		public String getName() {
			return this.name;
		}

		public String getReward(){
			if(this.rewardItem){
				return (String) reward;
			}
			return Integer.toString((Integer) this.reward);
		}

		public String getDescription() {
			return this.description;
		}
		
		public boolean isExpired() {
			return this.timeToLive <= 0;
		}

		public void tickTimeToLive() {
			this.timeToLive--;
		}
		
		public int getTimeToLive() {
			return this.timeToLive;
		}

	}
	
	public static class AttackMission extends Mission {

		public String mapName;
		public String mapOwner;
		private Integer eChance;
		private Integer mChance;
		private Integer wChance;
		private Integer sChance;
		private ItemMarket itemMarket;
		private TechTree techTree;
		public String sectorName;
		private boolean missionTaken;
		public boolean isChecked;

		public AttackMission(Missions missions, StashManager stashManager, String faction, Squad squad, Object rewardForAttack, String mapName, String mapOwner, Integer eChance, Integer mChance, Integer wChance, Integer sChance, ItemMarket itemMarket, TechTree techTree, String sectorName) {
			super(missions, stashManager, faction, "Secure " + mapName.substring(0, mapName.length() - 4) + " for "+faction, "Kill all enemies in the area for a reward of " + rewardForAttack, false, rewardForAttack, squad);
			this.mapName = mapName;
			this.mapOwner = mapOwner;
			this.eChance = eChance;
			this.mChance = mChance;
			this.wChance = wChance;
			this.sChance = sChance;
			this.itemMarket = itemMarket;
			this.techTree = techTree;
			this.sectorName = sectorName;
			this.missionTaken = false;
			this.isChecked = false;
		}

		@Override
		public boolean interact() {
			
			missions.squad.incrementFactionRelation(this.faction, 2);
			if(this.faction.equals(AiGenerator.WHITE_VISTA))
				missions.squad.incrementFactionRelation(AiGenerator.BANDITS, -2);
			else
				missions.squad.incrementFactionRelation(AiGenerator.WHITE_VISTA, -2);
			
			this.missionTaken = true;
			
			try {
				MenuMapInterface.loadLevel(ReadWriter.getRootFile("Maps/" + mapName), mapOwner, squad, eChance, mChance, wChance, sChance, missions, itemMarket, techTree, stashManager, sectorName);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (RecognitionException e) {
				e.printStackTrace();
			}
			
			return true;
		}
		
		@Override
		public boolean isExpired() {
			return (super.isExpired() && !missionTaken) || isChecked;
		}
		
		public boolean isTaken() {
			return this.missionTaken;
		}
		
	}
	
	public static class ShoppingListMission extends Mission {

		// science, engineering, weapon, medical
		private int[] requirements;
		private Object rewardPerItem;
		
		public ShoppingListMission(Missions missions, Squad squad, StashManager stashManager, int[] requirements, Object rewardPerItem, String faction) {
			super(missions, stashManager, faction,
				  "Gather Supplies for "+faction,
				  "Obj: The following are required:@nSci. "+ requirements[0] + " Eng. " + requirements[1] + " Wep. " + requirements[2] + " Med. " + requirements[3]
			    + "@nReward per Supply: " + rewardPerItem,
				  false, rewardPerItem, squad);
			this.requirements = requirements;
			this.rewardPerItem = rewardPerItem;
		}
		
		@Override
		public boolean interact() {
			while(requirements[0] > 0) {
				if(stashHas(ScienceSupply.NAME)){
					stashManager.getItems().remove(ScienceSupply.NAME);
					giveReward();
					requirements[0]--;
					missions.getPlanner(faction).give(ScienceSupply.NAME, 1);
				}
				else
					break;
			}
			while(requirements[1] > 0) {
				if(stashHas(EngineeringSupply.NAME)){
					stashManager.getItems().remove(EngineeringSupply.NAME);
					giveReward();
					requirements[1]--;
					missions.getPlanner(faction).give(EngineeringSupply.NAME, 1);
				}
				else
					break;
			}
			while(requirements[2] > 0) {
				if(stashHas(WeaponSupply.NAME)){
					stashManager.getItems().remove(WeaponSupply.NAME);
					giveReward();
					requirements[2]--;
					missions.getPlanner(faction).give(WeaponSupply.NAME, 1);
				}
				else
					break;
			}
			while(requirements[3] > 0) {
				if(stashHas(MedicalSupply.NAME)){
					stashManager.getItems().remove(MedicalSupply.NAME);
					giveReward();
					requirements[3]--;
					missions.getPlanner(faction).give(MedicalSupply.NAME, 1);
				}
				else
					break;
			}
			
			this.description = "Obj: The following are required:@nSci. "+ requirements[0] + " Eng. " + requirements[1] + " Wep. " + requirements[2] + " Med. " + requirements[3]
					         + "@nReward per Supply: " + rewardPerItem;
			
			if(requirements[0] == 0 && requirements[1] == 0 && requirements[2] == 0 && requirements[3] == 0) {
				if(missions.squad.getFactionRelation(faction) >= 0)
					missions.squad.incrementFactionRelation(this.faction, 0.1);
				else
					missions.squad.incrementFactionRelation(this.faction, 0.05);
				
				return true;
			}
			
			return false;
		}
		
		@Override
		protected void giveReward() {

			missions.squad.setAdvance(missions.squad.getAdvance() + (Integer)reward);
			
			if(requirements[0] == 0 && requirements[1] == 0 && requirements[2] == 0 && requirements[3] == 0)
				missions.missions.remove(this);
		}
		
		private boolean stashHas(String targetItem2) {
			for(int i = 0; i < stashManager.getItemCount(); i++){
				if(stashManager.getItem(i).equals(targetItem2))
					return true;
			}
			return false;
		}
		
		@Override
		public boolean isExpired() {
			return super.isExpired() || (this.requirements[0] == 0 && this.requirements[1] == 0 && this.requirements[2] == 0 && this.requirements[3] == 0);
		}
		
	}
	
	public void updatePlanners() {
		this.wvResearchAi.updatePlanner(mapWar, techTree, this, squad, stashManager, banditsResearchAi, itemMarket);
		this.banditsResearchAi.updatePlanner(mapWar, techTree, this, squad, stashManager, wvResearchAi, itemMarket);
	}
	
	public void updatePlannersKeepNews() {
		this.wvResearchAi.updatePlannerKeepNews(mapWar, techTree, this, squad, stashManager, banditsResearchAi, itemMarket);
		this.banditsResearchAi.updatePlannerKeepNews(mapWar, techTree, this, squad, stashManager, wvResearchAi, itemMarket);
	}

	public Squad getSquad() {
		return this.squad;
	}

	public boolean isCharacterFree(String characterCode) {
		return !this.characterCodes.contains(characterCode) && !this.tempCharacterCodes.values().contains(characterCode);
	}

	public void addCharacterCode(String key, String name) {
		this.tempCharacterCodes.put(name, key);
	}

	public void checkDeadSpecialCharacters(AiCrowd aiCrowd) {
		
		for(Ai actor: aiCrowd.getActors()) {
			if(this.tempCharacterCodes.containsKey(actor.getName()) && actor.isDead()) {
				this.characterCodes.add(this.tempCharacterCodes.get(actor.getName()));
			}
		}
		
		this.tempCharacterCodes.clear();
		
	}

	public void setResearchAi(FactionMissionPlanner banditsResearchAi, FactionMissionPlanner wvResearchAi) {
		this.wvResearchAi = wvResearchAi;
		this.banditsResearchAi = banditsResearchAi;
	}

	public FactionMissionPlanner getPlanner(String faction) {
		
		switch(faction) {
			case AiGenerator.WHITE_VISTA:
				return this.wvResearchAi;
			case AiGenerator.BANDITS:
				return this.banditsResearchAi;
		}
		
		return null;
	}

	public String getMapOwner(String mapName, String sectorName) {
		
		if(this.wvResearchAi.ownsMap(mapName, sectorName))
			return AiGenerator.WHITE_VISTA;
		
		if(this.banditsResearchAi.ownsMap(mapName, sectorName))
			return AiGenerator.BANDITS;
		
		return "Unclaimed";
	}

	public void setPlayerMissionKills(int banditKillCount, int lonerKillCount, int whiteVistaKillCount) {
		this.playerBanditKillCount = banditKillCount;
		this.playerLonerKillCount = lonerKillCount;
		this.playerWhiteVistaKillCount = whiteVistaKillCount;
	}

	public void setTotalMissionDeaths(int totalBanditDeaths, int totalLonerDeaths, int totalWVDeaths) {
		this.banditDeaths = totalBanditDeaths;
		this.lonerDeaths = totalLonerDeaths;
		this.wvDeaths = totalWVDeaths;
	}

	public void setLivingMembers(int livingBandits, int livingLoners, int livingWV) {
		this.livingBandits = livingBandits;
		this.livingLoners = livingLoners;
		this.livingWV = livingWV;
	}

	public int getPlayerBanditKillCount() {
		return playerBanditKillCount;
	}

	public int getPlayerLonerKillCount() {
		return playerLonerKillCount;
	}

	public int getPlayerWhiteVistaKillCount() {
		return playerWhiteVistaKillCount;
	}

	public int getBanditDeaths() {
		return banditDeaths;
	}

	public int getWVDeaths() {
		return wvDeaths;
	}
	
	public int getLonerDeaths() {
		return lonerDeaths;
	}

	public int getLivingBandits() {
		return livingBandits;
	}

	public int getLivingLoners() {
		return livingLoners;
	}

	public int getLivingWV() {
		return livingWV;
	}

	public int getPlayerKillCount(String faction) {
		
		switch(faction) {
			case AiGenerator.LONER:
			return this.playerLonerKillCount;
			case AiGenerator.WHITE_VISTA:
			return this.playerWhiteVistaKillCount;
			case AiGenerator.BANDITS:
			return this.playerBanditKillCount;
		}
		
		return 0;
	}

}
