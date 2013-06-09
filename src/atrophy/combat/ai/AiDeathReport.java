package atrophy.combat.ai;

import java.util.Random;

import atrophy.combat.items.Harpoon1;
import atrophy.combat.items.Harpoon2;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.MeleeWeapon2;
import atrophy.combat.items.Pistol1;
import atrophy.combat.items.Pistol2;
import atrophy.combat.items.Pistol3;
import atrophy.combat.items.Pistol4;
import atrophy.combat.items.Plasma1;
import atrophy.combat.items.Plasma2;
import atrophy.combat.items.Weapon;
import atrophy.combat.level.LevelBlock;

public class AiDeathReport {

	public final Ai killed;
	public final Ai killer;
	public final Weapon weapon;
	public final LevelBlock room;
	public final int timeOfDeath;
	public final boolean hasID;
	
	public AiDeathReport(Ai killed, Ai killer, Weapon weapon, LevelBlock room, int timeOfDeath) {
		this.killed = killed;
		this.killer = killer;
		this.weapon = weapon;
		this.room = room;
		this.timeOfDeath = timeOfDeath;
		this.hasID = new Random().nextInt(10) < 4;
	}

	public AiDeathReport(Ai killed, LevelBlock room, int timeOfDeath) {
		this.killed = killed;
		this.killer = null;
		this.weapon = null;
		this.room = room;
		this.timeOfDeath = timeOfDeath;
		this.hasID = false;
	}

	public String getKillerInformation(int skillLevel) {
		
		if(killer == null || skillLevel < 3 || !hasID)
			return "You cannot determine anything about who the killer was";
		
		return "On the body you find some evidence identifying " + killer.getName() + " as the killer";
	}

	public String getRoomInformation(int skillLevel) {
		
		if(skillLevel > 2) {
			if(killer instanceof ThinkingAi) {
				if(((ThinkingAi) killer).getCommander().getDangerRooms(0).contains(room)) {
					return "You suspect the killer was sent here to secure the room";
				}
			}
			if(killed instanceof ThinkingAi) {
				if(((ThinkingAi) killed).getCommander().getDangerRooms(0).contains(room)) {
					return "You suspect the victim was sent here to secure the room";
				}
			}
		}
		return "There doesn't seem to be any reason to suspect a territory dispute";
	}

	public String getTODInformation(int skillLevel) {
		switch(skillLevel) {
			case 0:
				if(killed.turnProcess.getTurnCount() - timeOfDeath < 10)
					return "The victim has died very recently";
				return "You cannot determine a time of death";
			case 1:
			case 2:
				if(killed.turnProcess.getTurnCount() - timeOfDeath < 10)
					return "The victim has died very recently";
				else if(killed.turnProcess.getTurnCount() - timeOfDeath < 30)
					return "The victim has died fairly recently";
				return "The victim died quite a while ago";
			case 3:
				if(killed.turnProcess.getTurnCount() - timeOfDeath < 10)
					return "The victim has died very recently";
				else if(killed.turnProcess.getTurnCount() - timeOfDeath < 30)
					return "You estimate the victim died about " + (killed.turnProcess.getTurnCount() - timeOfDeath + new Random().nextInt(20)) + " turns ago";
			case 4:
				return "You estimate the victim died about " + (killed.turnProcess.getTurnCount() - timeOfDeath + new Random().nextInt(10)) + " turns ago";
		}
		return "You determine the victim died at some point in the past";
	}

	public String getWeaponInformation(int skillLevel) {
		
		if(weapon == null)
			return "You cannot determine anything about what killed the victim";
		
		switch(skillLevel) {
			case 0:
			case 1:
				if(weapon.isMelee())
					return "The weapon used was a melee weapon";
				else if(weapon.getName().equals(Harpoon1.NAME) || weapon.getName().equals(Harpoon2.NAME))
					return "The body still has a harpoon stuck in the body";
				else
					return "The weapon used was a powerful ranged weapon";
			case 2:
			case 3:
				if(weapon.getName().equals(MeleeWeapon1.NAME))
					return "The victim shows signs of blunt trauma from a melee weapon";
				else if(weapon.getName().equals(MeleeWeapon2.NAME))
					return "The victim is covered in stab wounds";
				else if(weapon.getName().equals(Harpoon1.NAME) || weapon.getName().equals(Harpoon2.NAME))
					return "The body still has a harpoon stuck in the body";
				else if(weapon.getName().equals(Plasma1.NAME) || weapon.getName().equals(Plasma2.NAME))
					return "The body is covered in plasma burns";
				else if(weapon.getName().equals(Pistol1.NAME) || weapon.getName().equals(Pistol2.NAME) ||
						weapon.getName().equals(Pistol3.NAME) || weapon.getName().equals(Pistol4.NAME))
					return "You identify a bullet wound on the body";
				else
					return "The weapon used was a powerful ranged weapon";
			case 4:
				return "The weapon the killer used was a " + weapon.getName();
		}
		
		return "Well the killer used something, that's for certain";
	}
	
}
