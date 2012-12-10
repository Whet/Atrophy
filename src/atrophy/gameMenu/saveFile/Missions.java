/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.StashManager;

/**
 * The Class Missions.
 */
public class Missions{

	public static final String DEFAULT_MEM_CODE = "OPEN";
	
	/**
	 * The interacting member.
	 */
	private Squaddie interactingMember;
	
	/**
	 * The missions.
	 */
	private ArrayList<Mission> missions;
	
	/**
	 * The mission givers.
	 */
	private ArrayList<MissionGiver> missionGivers;
	
	/**
	 * The economy effects.
	 */
	private ArrayList<String> economyEffects;
	
	private Set<String> memCodes;
	
	private Squad squad;
	
	/**
	 * Instantiates a new missions.
	 * @param stashManager 
	 * @param itemMarket 
	 * @param squadMenu 
	 * @param squadMenu 
	 */
	public Missions(){
		missions = new ArrayList<>();
		missionGivers = new ArrayList<MissionGiver>();
		economyEffects = new ArrayList<String>();
		memCodes = new HashSet<>();
		memCodes.add(DEFAULT_MEM_CODE);
	}
	
	public void lazyLoad(Squad squad, StashManager stashManager, ItemMarket itemMarket) {
		this.squad = squad;
		defaultMissions(stashManager, itemMarket);
	}

	/**
	 * Default missions.
	 * @param itemMarkert 
	 */
	private void defaultMissions(StashManager stashManager, ItemMarket itemMarkert) {
		this.missionGivers.add(new MissionGiver.WVGiver1(squad, this, stashManager, itemMarkert));
		this.missionGivers.add(new MissionGiver.LonerGiver1(squad, this, stashManager, itemMarkert));
		this.missionGivers.add(new MissionGiver.BanditGiver1(squad, this, stashManager, itemMarkert));
		this.missionGivers.add(new MissionGiver.WVGiver2(squad, this, stashManager, itemMarkert));
		this.missionGivers.add(new MissionGiver.LonerGiver2(squad, this, stashManager, itemMarkert));
		this.missionGivers.add(new MissionGiver.BanditGiver2(squad, this, stashManager, itemMarkert));
		this.updateMissions();
	}

	/**
	 * Gets the interacting member.
	 *
	 * @return the interacting member
	 */
	public Squaddie getInteractingMember() {
		return interactingMember;
	}

	/**
	 * Update missions.
	 */
	public void updateMissions(){
		this.missions.clear();
		for(int i = 0; i < missionGivers.size(); i++){
			if(missionGivers.get(i).getMission() != null){
				missionGivers.get(i).computeMission();
				this.missions.add(missionGivers.get(i).getMission());
			}
		}
	}
	
	/**
	 * Sets the interacting member.
	 *
	 * @param interactingMember the new interacting member
	 */
	public void setInteractingMember(Squaddie interactingMember) {
		this.interactingMember = interactingMember;
	}
	
	/**
	 * Interact mission.
	 *
	 * @param i the i
	 * @return true, if successful
	 */
	public boolean interactMission(int i) {
		return missions.get(i).interact();
	}

	/**
	 * Gets the mission count.
	 *
	 * @return the mission count
	 */
	public int getMissionCount() {
		return this.missions.size();
	}
	
	/**
	 * Gets the mission.
	 *
	 * @param index the index
	 * @return the mission
	 */
	public Mission getMission(int index) {
		
		if(index >= this.missions.size())
			return null;
		
		return this.missions.get(index);
	}

	/**
	 * Gets the mission name.
	 *
	 * @param i the i
	 * @return the mission name
	 */
	public String getMissionName(int i) {
		
		if(i >= this.missions.size())
			return "";
		
		return this.missions.get(i).name;
	}
	
	/**
	 * Gets the giver.
	 *
	 * @param mission the mission
	 * @return the giver
	 */
	public MissionGiver getGiver(Mission mission) {
		for(int i = 0; i < this.missionGivers.size(); i++){
			if(this.missionGivers.get(i).getMission() == mission)
				return this.missionGivers.get(i);
		}
		return null;
	}
	
	/**
	 * Gets the giver short faction.
	 *
	 * @param mission the mission
	 * @return the giver short faction
	 */
	public String getGiverShortFaction(Mission mission) {
		if(mission == null)
			return "";
		
		if(this.getGiver(mission) == null)
			return "";
		
		return this.getGiver(mission).getShortFaction();
	}

	/**
	 * Gets the mission givers.
	 *
	 * @return the mission givers
	 */
	public ArrayList<MissionGiver> getMissionGivers() {
		return missionGivers;
	}

	/**
	 * Sets the mission givers.
	 *
	 * @param missionGivers the new mission givers
	 */
	public void setMissionGivers(ArrayList<MissionGiver> missionGivers) {
		this.missionGivers = missionGivers;
		this.updateMissions();
	}
	
	/**
	 * Gets the economy effects.
	 *
	 * @return the economy effects
	 */
	public ArrayList<String> getEconomyEffects() {
		return economyEffects;
	}

	/**
	 * Sets the economy effects.
	 *
	 * @param economyEffects the new economy effects
	 */
	public void setEconomyEffects(ArrayList<String> economyEffects) {
		this.economyEffects = economyEffects;
	}
	
	public boolean addMemCode(String memCodes){
		return this.memCodes.add(memCodes);
	}
	
	public boolean hasMemCode(String memCodes){
		return this.memCodes.contains(memCodes);
	}
	
	public void setMemCodes(Set<String> memCodes) {
		this.memCodes = memCodes;
		memCodes.add(DEFAULT_MEM_CODE);
	}
	
	public Set<String> getMemCodes() {
		return memCodes;
	}

	/**
	 * The Class Mission.
	 */
	public static abstract class Mission implements Serializable{
		
		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = 5776226028366470409L;

		/**
		 * The name.
		 */
		protected String name;
		
		/**
		 * The description.
		 */
		protected String description;
		
		/**
		 * The reward.
		 */
		protected Object reward;
		
		// Whether the reward is an item (String) or Advance (int)
		/**
		 * The reward item.
		 */
		protected boolean rewardItem;

		protected Missions missions;
		protected Squad squad;
		protected StashManager stashManager;
		
		/**
		 * Instantiates a new mission.
		 *
		 * @param name the name
		 * @param description the description
		 * @param rewardItem the reward item
		 * @param reward the reward
		 * @param squadMenu 
		 */
		public Mission(Missions missions, StashManager stashManager, String name, String description, boolean rewardItem, Object reward, Squad squad){
			this.rewardItem = rewardItem;
			this.reward = reward;
			this.name = name;
			this.description = description;
			this.missions = missions;
			this.squad = squad;
			this.stashManager = stashManager;
		}
		
		/**
		 * Give reward.
		 */
		protected void giveReward() {
			if(rewardItem){
				stashManager.addItem((String) reward);
			}
			else{
				missions.squad.setAdvance(missions.squad.getAdvance() + (Integer)reward);
			}
			
			missions.missions.remove(this);
		}
		
		/**
		 * Interact.
		 *
		 * @return true, if successful
		 */
		public abstract boolean interact();

		/**
		 * Gets the name.
		 *
		 * @return the name
		 */
		public String getName() {
			return this.name;
		}
		
		/**
		 * Gets the reward.
		 *
		 * @return the reward
		 */
		public String getReward(){
			if(this.rewardItem){
				return (String) reward;
			}
			return Integer.toString((Integer) this.reward);
		}

		/**
		 * Gets the description.
		 *
		 * @return the description
		 */
		public String getDescription() {
			return this.description;
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
		public GatherMission(Missions missions, Squad squad, StashManager stashManager, String targetItem, boolean rewardItem, Object reward){
			super(missions, stashManager, "Req: " + targetItem,
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
	public static class KillMission extends Mission{
		
		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = -6825128197446409509L;
		
		/**
		 * The target faction.
		 */
		private String targetFaction;
		
		/**
		 * The required kills.
		 */
		private int requiredKills;
		
		/**
		 * Instantiates a new kill mission.
		 *
		 * @param faction the faction
		 * @param count the count
		 * @param rewardItem the reward item
		 * @param reward the reward
		 */
		public KillMission(Missions missions, Squad squad, StashManager stashManager, String faction, int count, boolean rewardItem, Object reward){
			super(missions, stashManager, "Kill: " + faction,
				  "Obj: Kill " + count + " members of " + faction + "@nReward: " + reward,
				  rewardItem, reward, squad);
			
			this.targetFaction = faction;
			this.requiredKills = count;
		}
		
		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.Missions.Mission#interact()
		 */
		@Override
		public boolean interact() {
			if(missions.squad.getFactionKills(targetFaction) > this.requiredKills){
				giveReward();
				return true;
			}
			return false;
		}
	}

}
