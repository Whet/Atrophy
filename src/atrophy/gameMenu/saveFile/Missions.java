package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
	private ArrayList<MissionGiver> missionGivers;
	private Set<String> memCodes;
	private Set<String> characterCodes;
	private Map<String, String> tempCharacterCodes;
	private Squad squad;
	private FactionMissionPlanner wvResearchAi, banditsResearchAi;

	public Missions(){
		missions = new ArrayList<>();
		missionGivers = new ArrayList<MissionGiver>();
		memCodes = new HashSet<>();
		characterCodes = new HashSet<>();
		tempCharacterCodes = new HashMap<>();
		memCodes.add(DEFAULT_MEM_CODE);
		this.wvResearchAi = new FactionMissionPlanner(AiGenerator.WHITE_VISTA);
		this.banditsResearchAi = new FactionMissionPlanner(AiGenerator.BANDITS);
	}
	
	public void lazyLoad(Squad squad, StashManager stashManager, ItemMarket itemMarket, TechTree techTree) {
		this.squad = squad;
		defaultMissions(stashManager, itemMarket, techTree);
	}
	
	private void defaultMissions(StashManager stashManager, ItemMarket itemMarkert, TechTree techTree) {
		
		if(this.missionGivers.isEmpty()) {
			this.missionGivers.add(new MissionGiver.WVGiver1(squad, this, techTree, stashManager, itemMarkert));
			this.missionGivers.add(new MissionGiver.LonerGiver1(squad, this, techTree, stashManager, itemMarkert));
			this.missionGivers.add(new MissionGiver.BanditGiver1(squad, this, techTree, stashManager, itemMarkert));
			this.missionGivers.add(new MissionGiver.WVGiver2(squad, this, techTree, stashManager, itemMarkert));
			this.missionGivers.add(new MissionGiver.LonerGiver2(squad, this, techTree, stashManager, itemMarkert));
			this.missionGivers.add(new MissionGiver.BanditGiver2(squad, this, techTree, stashManager, itemMarkert));
		}
		
		this.updateMissions();
	}

	public Squaddie getInteractingMember() {
		return interactingMember;
	}

	public void updateMissions(){
		this.missions.clear();
		for(int i = 0; i < missionGivers.size(); i++){
			if(missionGivers.get(i).getMission() != null){
				if(missionGivers.get(i).getMission().isExpired())
					missionGivers.get(i).computeMission();
				this.missions.add(missionGivers.get(i).getMission());
			}
		}
	}
	
	public void setInteractingMember(Squaddie interactingMember) {
		this.interactingMember = interactingMember;
	}
	
	public boolean interactMission(int i) {
		return missions.get(i).interact();
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
	
	public MissionGiver getGiver(Mission mission) {
		for(int i = 0; i < this.missionGivers.size(); i++){
			if(this.missionGivers.get(i).getMission() == mission)
				return this.missionGivers.get(i);
		}
		return null;
	}
	
	public String getGiverShortFaction(Mission mission) {
		if(mission == null)
			return "";
		
		if(this.getGiver(mission) == null)
			return "";
		
		return this.getGiver(mission).getShortFaction();
	}

	public ArrayList<MissionGiver> getMissionGivers() {
		return missionGivers;
	}

	public void setMissionGivers(ArrayList<MissionGiver> missionGivers) {
		this.missionGivers = missionGivers;
		this.updateMissions();
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
		private TechTree techTree;
		private String tech;
		private Object rewardPerItem;
		
		public ShoppingListMission(Missions missions, Squad squad, StashManager stashManager, TechTree techTree, int[] requirements, Object rewardPerItem, String tech, String faction) {
			super(missions, stashManager, faction,
				  "Unlock the Mysteries of: " + tech,
				  "Obj: To unlock the mysteries of " + tech + "@nThe following are required:@nSci. "+ requirements[0] + " Eng. " + requirements[1] + " Wep. " + requirements[2] + " Med. " + requirements[3]
						  + "@nReward per Supply: " + rewardPerItem,
				  false, rewardPerItem, squad);
			this.requirements = requirements;
			this.techTree = techTree;
			this.tech = tech;
			this.rewardPerItem = rewardPerItem;
		}
		
		@Override
		public boolean interact() {
			while(requirements[0] > 0) {
				if(stashHas(ScienceSupply.NAME)){
					stashManager.getItems().remove(ScienceSupply.NAME);
					giveReward();
					requirements[0]--;
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
			
			this.description = "Obj: To unlock the mysteries of " + tech + "@nThe following are required:@nSci. "+ requirements[0] + " Eng. " + requirements[1] + " Wep. " + requirements[2] + " Med. " + requirements[3]
					  + "@nReward per Supply: " + rewardPerItem;
			
			if(requirements[0] == 0 && requirements[1] == 0 && requirements[2] == 0 && requirements[3] == 0) {
				techTree.research(tech, this.faction);
				
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
			return super.isExpired() || techTree.isResearched(this.tech, this.faction);
		}
		
	}
	
	/**
	 * The Class GatherMission.
	 */
	public static class GatherMission extends Mission{
		
		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = 4770545418826076066L;
		
		/**
		 * The target item.
		 */
		private String targetItem;
		
		/**
		 * Instantiates a new gather mission.
		 *
		 * @param targetItem the target item
		 * @param rewardItem the reward item
		 * @param reward the reward
		 */
		public GatherMission(Missions missions, Squad squad, StashManager stashManager, String targetItem, boolean rewardItem, Object reward, String faction){
			super(missions, stashManager, faction,
				  "Req: " + targetItem,
				  "Obj: Hand in a " + targetItem + "@nReward: " + reward,
				  rewardItem, reward, squad);
			
			this.targetItem = targetItem;
		}
		
		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.Missions.Mission#interact()
		 */
		@Override
		public boolean interact() {
			if(stashHas(targetItem)){
				stashManager.getItems().remove(targetItem);
				giveReward();
				return true;
			}
			return false;
		}

		/**
		 * Stash has.
		 *
		 * @param targetItem2 the target item2
		 * @return true, if successful
		 */
		private boolean stashHas(String targetItem2) {
			for(int i = 0; i < stashManager.getItemCount(); i++){
				if(stashManager.getItem(i).equals(targetItem2))
					return true;
			}
			return false;
		}
	}
	
	/**
	 * The Class KillMission.
	 */
//	public static class KillMission extends Mission{
//		
//		/**
//		 * The Constant serialVersionUID.
//		 */
//		private static final long serialVersionUID = -6825128197446409509L;
//		
//		/**
//		 * The target faction.
//		 */
//		private String targetFaction;
//		
//		/**
//		 * The required kills.
//		 */
//		private int requiredKills;
//		
//		/**
//		 * Instantiates a new kill mission.
//		 *
//		 * @param faction the faction
//		 * @param count the count
//		 * @param rewardItem the reward item
//		 * @param reward the reward
//		 */
//		public KillMission(Missions missions, Squad squad, StashManager stashManager, String faction, int count, boolean rewardItem, Object reward){
//			super(missions, stashManager, "Kill: " + faction,
//				  "Obj: Kill " + count + " members of " + faction + "@nReward: " + reward,
//				  rewardItem, reward, squad);
//			
//			this.targetFaction = faction;
//			this.requiredKills = count;
//		}
//		
//		/* (non-Javadoc)
//		 * @see atrophy.gameMenu.saveFile.Missions.Mission#interact()
//		 */
//		@Override
//		public boolean interact() {
//			if(missions.squad.getFactionKills(targetFaction) > this.requiredKills){
//				giveReward();
//				return true;
//			}
//			return false;
//		}
//	}

	public void tickMissions() {
		for(Mission mission: this.missions) {
			mission.tickTimeToLive();
		}
	}

	public Squad getSquad() {
		return this.squad;
	}

	public boolean isCharacterFree(String characterCode) {
		System.out.println("CODE: " + characterCode + "///" + this.characterCodes + "  " + this.tempCharacterCodes);
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

}
