/*
 * 
 */
package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.MuleAi;
import atrophy.combat.mechanics.Abilities;

public class Squad implements Serializable {

	private static final long serialVersionUID = 1922138873692593530L;

	public static final int MAX_STABILITY = 30;
	
	private int advance;
	private int stability;
	
	private ArrayList<Squaddie> squadMembers;
	private TechTree techTree;

	private Double whiteVistaRelation;
	private Double banditRelation;
	
	public Squad(){
		this.squadMembers = new ArrayList<Squaddie>(5);
		this.stability = 0;
		this.whiteVistaRelation = 1.0;
		this.banditRelation = -1.0;
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
		
		if(this.stability > MAX_STABILITY)
			this.stability = MAX_STABILITY;
		
		if(this.stability < 0)
			this.stability = 0;
	}
	
	public void setAdvance(int advance) {
		this.advance = advance;
	}

	public int getSquadCount() {
		return this.squadMembers.size();
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
					this.setSkillLevel(Abilities.INVESTIGATE, 0);
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

	public void setTechTree(TechTree techTree) {
		this.techTree = techTree;
	}

	public TechTree getTechTree() {
		return this.techTree;
	}

	public void setFactionRelations(Double whiteVistaRelation, Double banditRelation) {
		this.whiteVistaRelation = whiteVistaRelation;
		this.banditRelation = banditRelation;
	}

	public void incrementFactionRelation(String faction, double increment) {
		switch(faction) {
			case AiGenerator.WHITE_VISTA:
				this.whiteVistaRelation += increment;
				if(whiteVistaRelation > 2)
					whiteVistaRelation = 2.0;
				else if(whiteVistaRelation < -2)
					whiteVistaRelation = -2.0;
			break;
			case AiGenerator.BANDITS:
				this.banditRelation += increment;
				if(banditRelation > 2)
					banditRelation = 2.0;
				else if(banditRelation < -2)
					banditRelation = -2.0;
			break;
		}
	}

	public Double getFactionRelation(String faction) {
		switch(faction) {
			case AiGenerator.WHITE_VISTA:
			return this.whiteVistaRelation;
			case AiGenerator.BANDITS:
			return this.banditRelation;
		}
		return 0.0;
	}

}
