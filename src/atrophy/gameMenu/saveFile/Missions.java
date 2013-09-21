package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
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
	
	public static class ShoppingListMission extends Mission{

		// science, engineering, weapon, medical
		private int[] requirements;
		private Object rewardPerItem;
		
		public ShoppingListMission(Missions missions, Squad squad, StashManager stashManager, int[] requirements, Object rewardPerItem, String faction) {
			super(missions, stashManager, faction,
				  "Gather Supplies",
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
					missions.getResearchAi(faction).give(ScienceSupply.NAME, 1);
				}
				else
					break;
			}
			while(requirements[1] > 0) {
				if(stashHas(EngineeringSupply.NAME)){
					stashManager.getItems().remove(EngineeringSupply.NAME);
					giveReward();
					requirements[1]--;
				}
				else
					break;
			}
			while(requirements[2] > 0) {
				if(stashHas(WeaponSupply.NAME)){
					stashManager.getItems().remove(WeaponSupply.NAME);
					giveReward();
					requirements[2]--;
				}
				else
					break;
			}
			while(requirements[3] > 0) {
				if(stashHas(MedicalSupply.NAME)){
					stashManager.getItems().remove(MedicalSupply.NAME);
					giveReward();
					requirements[3]--;
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
			return super.isExpired();
		}
		
	}
	
	public void update() {
		this.wvResearchAi.updatePlanner(mapWar, techTree, this, squad, stashManager);
		this.banditsResearchAi.updatePlanner(mapWar, techTree, this, squad, stashManager);
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

	public FactionMissionPlanner getResearchAi(String faction) {
		
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

}
