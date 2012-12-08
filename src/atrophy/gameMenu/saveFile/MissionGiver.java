/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.Random;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;
import atrophy.gameMenu.saveFile.Missions.GatherMission;
import atrophy.gameMenu.saveFile.Missions.KillMission;
import atrophy.gameMenu.saveFile.Missions.Mission;

/**
 * The Class MissionGiver.
 */
public abstract class MissionGiver implements Serializable{

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = -1513720208713723216L;

	/**
	 * The mission.
	 */
	private Mission mission;
	
	/**
	 * The name.
	 */
	private String name;
	
	/**
	 * The faction.
	 */
	private String faction;
	
	/**
	 * The reputation.
	 */
	private int reputation;

	/**
	 * Instantiates a new mission giver.
	 *
	 * @param name the name
	 * @param faction the faction
	 */
	protected MissionGiver(String name, String faction){
		this.name = name;
		this.faction = faction;
		this.reputation = 0;
		computeMission();
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the faction.
	 *
	 * @return the faction
	 */
	public String getFaction() {
		return faction;
	}
	
	/**
	 * Gets the short faction.
	 *
	 * @return the short faction
	 */
	public String getShortFaction() {
		
		switch(this.faction){
			case AiGenerator.WHITE_VISTA:
				return "WV";
			case AiGenerator.BANDITS:
				return "BA";
			default:
				return "LO";
		}
	}


	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the faction.
	 *
	 * @param faction the new faction
	 */
	public void setFaction(String faction) {
		this.faction = faction;
	}
	
	/**
	 * Gets the mission.
	 *
	 * @return the mission
	 */
	public Mission getMission() {
		return this.mission;
	}
	
	/**
	 * Computes the mission.
	 */
	public abstract void computeMission();
	
	/**
	 * Gather mission.
	 *
	 * @param item the item
	 */
	protected void gatherMission(String item){
		Object reward = randomReward();
		
		this.mission = new GatherMission(item, reward instanceof String, reward);
	}
	
	/**
	 * Kill mission.
	 *
	 * @param faction the faction
	 */
	protected void killMission(String faction){
		Object reward = randomReward();
		
		this.mission = new KillMission(faction, new Random().nextInt(4) + 1, reward instanceof String, reward);
	}

	/**
	 * Random supply.
	 *
	 * @return the string
	 */
	protected String randomSupply() {
		switch(new Random().nextInt(3)){
			case 0:
				return WeaponSupply.NAME;
			case 1:
				return MedicalSupply.NAME;
			case 2:
				return EngineeringSupply.NAME;
			default:
				return MedicalSupply.NAME;
		}
	}

	/**
	 * Gets the reputation.
	 *
	 * @return the reputation
	 */
	public int getReputation() {
		return reputation;
	}

	/**
	 * Sets the reputation.
	 *
	 * @param reputation the new reputation
	 */
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	/**
	 * Random reward.
	 *
	 * @return the object
	 */
	private Object randomReward() {
		return ItemMarket.getInstance().getRandomMarketItem();
	}
	
	/**
	 * The Class WVGiver1.
	 */
	public static class WVGiver1 extends MissionGiver{

		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = 4357745876672366906L;

		/**
		 * Instantiates a new wV giver1.
		 */
		protected WVGiver1() {
			super("Commander Deaton",AiGenerator.WHITE_VISTA);
		}

		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.MissionGiver#computeMission()
		 */
		@Override
		public void computeMission() {
			killMission(AiGenerator.BANDITS);
		}
		
	}
	
	/**
	 * The Class WVGiver2.
	 */
	public static class WVGiver2 extends MissionGiver {

		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = -8475116406725729886L;

		/**
		 * Instantiates a new wV giver2.
		 */
		protected WVGiver2() {
			super("Johan",AiGenerator.WHITE_VISTA);
		}

		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.MissionGiver#computeMission()
		 */
		@Override
		public void computeMission() {
			gatherMission(ScienceSupply.NAME);
		}

	}
	
	/**
	 * The Class BanditGiver1.
	 */
	public static class BanditGiver1 extends MissionGiver {

		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = -4207695828365615162L;

		/**
		 * Instantiates a new bandit giver1.
		 */
		protected BanditGiver1() {
			super("Queen",AiGenerator.BANDITS);
		}

		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.MissionGiver#computeMission()
		 */
		@Override
		public void computeMission() {
			gatherMission(MedicalSupply.NAME);
		}

	}
	
	/**
	 * The Class BanditGiver2.
	 */
	public static class BanditGiver2 extends MissionGiver {

		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = 7623653413369393075L;

		/**
		 * Instantiates a new bandit giver2.
		 */
		protected BanditGiver2() {
			super("Omar",AiGenerator.BANDITS);
		}

		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.MissionGiver#computeMission()
		 */
		@Override
		public void computeMission() {
			gatherMission(MedicalSupply.NAME);
		}

	}

	/**
	 * The Class LonerGiver1.
	 */
	public static class LonerGiver1 extends MissionGiver {

		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = 1791595896950780820L;

		/**
		 * Instantiates a new loner giver1.
		 */
		protected LonerGiver1() {
			super("Jacob and Dave",AiGenerator.LONER);
		}

		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.MissionGiver#computeMission()
		 */
		@Override
		public void computeMission() {
			gatherMission(randomSupply());
		}

	}
	
	/**
	 * The Class LonerGiver2.
	 */
	public static class LonerGiver2 extends MissionGiver {

		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = 7587324077357033483L;

		/**
		 * Instantiates a new loner giver2.
		 */
		protected LonerGiver2() {
			super("Hannah", AiGenerator.LONER);
		}

		/* (non-Javadoc)
		 * @see atrophy.gameMenu.saveFile.MissionGiver#computeMission()
		 */
		@Override
		public void computeMission() {
			gatherMission(randomSupply());
		}

	}
	
}
