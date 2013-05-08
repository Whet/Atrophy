/*
 * 
 */
package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import atrophy.combat.ai.MuleAi;
import atrophy.combat.mechanics.Abilities;

public class Squad implements Serializable {

	private static final long serialVersionUID = 1922138873692593530L;

	public static final int MAX_STABILITY = 100;
	
	private int advance;
	private int stability;
	
	private ArrayList<Squaddie> squadMembers;
	
	private Map<String, Integer> kills;
	
	public Squad(){
		this.squadMembers = new ArrayList<Squaddie>(5);
		this.kills = new HashMap<>();
		this.stability = 1;
	}
	
	public ArrayList<Squaddie> getSquad(){
		return this.squadMembers;
	}
	
	public void addSquaddie(Squaddie squaddie){
		this.squadMembers.add(squaddie);
	}
	
	public Squaddie getSquadMember(int index) {
		if(index >= 0 && index < squadMembers.size()){
			return squadMembers.get(index);
		}
		return squadMembers.get(squadMembers.size() - 1);
	}
	
	public int getAdvance(){
		return this.advance;
	}
	
	public boolean payAdvance(int payment){
		if(advance >= payment){
			advance -= payment;
			return true;
		}
		return false;
	}
	
	public int getStability() {
		return stability;
	}

	public void setStability(int stability) {
		this.stability = stability;
	}
	
	public void setAdvance(int advance) {
		this.advance = advance;
	}

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

	public static class Squaddie implements Serializable {
		
		private static final long serialVersionUID = 1495637406141508899L;

		private String name;
		private String image;
		private String vehicleType;
		private String weapon;
		private ArrayList<String> items;
		private HashMap<String, Integer> skills;
		
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

		public String getName() {
			return name;
		}

		public String getWeapon() {
			return weapon;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setWeapon(String weapon) {
			this.weapon = weapon;
		}
		
		public void addItem(String item){
			this.items.add(item);
		}
		
		public boolean hasItem(String item){
			return this.items.contains(item);
		}
		
		public void removeItem(String item){
			this.items.remove(item);
		}
		
		public void setSkillLevel(String skill, int level){
			this.skills.put(skill, level);
		}

		public Iterator<String> getItems() {
			return this.items.iterator();
		}

		public String getImage() {
			return this.image;
		}

		public boolean hasSpace() {
			return this.items.size() < 5;
		}

		public String getItem(int index) {
			if(index >= 0 && index < this.items.size())
				return this.items.get(index);
			return "Empty";
		}

		public void removeItem(int ind) {
			this.items.remove(ind);
		}

		public Iterator<String> getSkills() {
			return this.skills.keySet().iterator();
		}

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

}
