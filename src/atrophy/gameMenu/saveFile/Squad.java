/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import atrophy.combat.ai.MuleAi;
import atrophy.combat.mechanics.Abilities;

/**
 * The Class Squad.
 */
public class Squad implements Serializable{

	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1922138873692593530L;
	
	// currency used to buy things and skill up
	/**
	 * The advance.
	 */
	private int advance;
	
	/**
	 * The squad members.
	 */
	private ArrayList<Squaddie> squadMembers;
	
	private Map<String, Integer> kills;
	
	/**
	 * Instantiates a new squad.
	 */
	public Squad(){
		this.squadMembers = new ArrayList<Squaddie>(5);
		this.kills = new HashMap<>();
	}
	
	/**
	 * Gets the squad.
	 *
	 * @return the squad
	 */
	public ArrayList<Squaddie> getSquad(){
		return this.squadMembers;
	}
	
	/**
	 * Adds the squaddie.
	 *
	 * @param squaddie the squaddie
	 */
	public void addSquaddie(Squaddie squaddie){
		this.squadMembers.add(squaddie);
	}
	
	/**
	 * Gets the squad member.
	 *
	 * @param index the index
	 * @return the squad member
	 */
	public Squaddie getSquadMember(int index) {
		if(index >= 0 && index < squadMembers.size()){
			return squadMembers.get(index);
		}
		return squadMembers.get(squadMembers.size() - 1);
	}
	
	/**
	 * Gets the advance.
	 *
	 * @return the advance
	 */
	public int getAdvance(){
		return this.advance;
	}
	
	/**
	 * Pay advance.
	 *
	 * @param payment the payment
	 * @return true, if successful
	 */
	public boolean payAdvance(int payment){
		if(advance >= payment){
			advance -= payment;
			return true;
		}
		return false;
	}
	
	/**
	 * The Class Squaddie.
	 */
	public static class Squaddie implements Serializable{
		
		/**
		 * The Constant serialVersionUID.
		 */
		private static final long serialVersionUID = 1495637406141508899L;

		/**
		 * The name.
		 */
		private String name;
		
		/**
		 * The image.
		 */
		private String image;
		
		private String vehicleType;
		
		/**
		 * The weapon.
		 */
		private String weapon;
		
		/**
		 * The items.
		 */
		private ArrayList<String> items;
		
		/**
		 * The skills.
		 */
		private HashMap<String, Integer> skills;
		
		/**
		 * Instantiates a new squaddie.
		 *
		 * @param name the name
		 * @param image the image
		 * @param weapon the weapon
		 */
		public Squaddie(String name, String image, String weapon, String vehicleType){
			this.name = name;
			this.image = image;
			this.weapon = weapon;
			this.items = new ArrayList<String>(5);
			this.skills = new HashMap<String, Integer>();
			this.vehicleType = vehicleType;
			
			
			switch(vehicleType){
				case MuleAi.MULE:
					this.setSkillLevel(Abilities.SCAN_SCIENCE, 0);
					this.setSkillLevel(Abilities.XRAY_SCAN, 0);
					this.setSkillLevel(Abilities.SPEED_BOOSTER, 0);
					this.setSkillLevel(Abilities.STEALTH1, 0);
					this.setSkillLevel(Abilities.STEALTH2, 0);
				break;
				case "":
					this.setSkillLevel(Abilities.GRENADETHROWER, 0);
					this.setSkillLevel(Abilities.SCAN_SCIENCE, 0);
					this.setSkillLevel(Abilities.XRAY_SCAN, 0);
					this.setSkillLevel(Abilities.SPEED_BOOSTER, 0);
					this.setSkillLevel(Abilities.STEALTH1, 0);
					this.setSkillLevel(Abilities.STEALTH2, 0);
					this.setSkillLevel(Abilities.STUNGRENADETHROWER, 0);
					this.setSkillLevel(Abilities.WELDING, 0);
				break;
			}
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
		 * Gets the weapon.
		 *
		 * @return the weapon
		 */
		public String getWeapon() {
			return weapon;
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
		 * Sets the weapon.
		 *
		 * @param weapon the new weapon
		 */
		public void setWeapon(String weapon) {
			this.weapon = weapon;
		}
		
		/**
		 * Adds the item.
		 *
		 * @param item the item
		 */
		public void addItem(String item){
			this.items.add(item);
		}
		
		/**
		 * Checks for item.
		 *
		 * @param item the item
		 * @return true, if successful
		 */
		public boolean hasItem(String item){
			return this.items.contains(item);
		}
		
		/**
		 * Removes the item.
		 *
		 * @param item the item
		 */
		public void removeItem(String item){
			this.items.remove(item);
		}
		
		/**
		 * Sets the skill level.
		 *
		 * @param skill the skill
		 * @param level the level
		 */
		public void setSkillLevel(String skill, int level){
			this.skills.put(skill, level);
		}

		/**
		 * Gets the items.
		 *
		 * @return the items
		 */
		public Iterator<String> getItems() {
			return this.items.iterator();
		}

		/**
		 * Gets the image.
		 *
		 * @return the image
		 */
		public String getImage() {
			return this.image;
		}

		/**
		 * Checks for space.
		 *
		 * @return true, if successful
		 */
		public boolean hasSpace() {
			return this.items.size() < 5;
		}

		/**
		 * Gets the item.
		 *
		 * @param index the index
		 * @return the item
		 */
		public String getItem(int index) {
			if(index >= 0 && index < this.items.size())
				return this.items.get(index);
			return "Empty";
		}

		/**
		 * Removes the item.
		 *
		 * @param ind the ind
		 */
		public void removeItem(int ind) {
			this.items.remove(ind);
		}

		/**
		 * Gets the skills.
		 *
		 * @return the skills
		 */
		public Iterator<String> getSkills() {
			return this.skills.keySet().iterator();
		}

		/**
		 * Gets the skill level.
		 *
		 * @param skill the skill
		 * @return the skill level
		 */
		public int getSkillLevel(String skill) {
			return this.skills.get(skill);
		}

		public boolean isVehicle() {
			return !this.vehicleType.isEmpty();
		}

		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}

		public String getVehicleType() {
			return this.vehicleType;
		}
	}

	/**
	 * Sets the advance.
	 *
	 * @param advance the new advance
	 */
	public void setAdvance(int advance) {
		this.advance = advance;
	}

	/**
	 * Gets the squad count.
	 *
	 * @return the squad count
	 */
	public int getSquadCount() {
		return this.squadMembers.size();
	}

	public void addKill(String faction) {
		if(this.kills.get(faction) != null)
			this.kills.put(faction, this.kills.get(faction) + 1);
		else
			this.kills.put(faction, 1);
	}

	public Map<String, Integer> getSquadKills() {
		return this.kills;
	}

	public void setKills(Map<String, Integer> kills) {
		this.kills = kills;
	}

	public int getFactionKills(String faction) {
		return this.kills.get(faction);
	}

	public void resetKills() {
		this.kills.clear();
	}

}
