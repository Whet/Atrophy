/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.mechanics;

import atrophy.combat.ai.Ai;

// TODO: Auto-generated Javadoc
/**
 * The Class Abilities.
 */
public class Abilities{

	// Skill levels go 0,1,2,3,4
	
	/**
	 * The Constant GRENADETHROWER.
	 */
	public static final String GRENADETHROWER = "Grenadier";
	
	/**
	 * The Constant STUNGRENADETHROWER.
	 */
	public static final String STUNGRENADETHROWER = "Blitzer";

	/**
	 * The Constant SENSOR.
	 */
	public static final String XRAY_SCAN = "Scanning";
	
	/**
	 * The Constant SPEED_BOOSTER.
	 */
	public static final String SPEED_BOOSTER = "Scouting";

	/**
	 * The Constant STEALTH1.
	 */
	public static final String STEALTH1 = "Ambushing";
	
	/**
	 * The Constant STEALTH2.
	 */
	public static final String STEALTH2 = "Ghost";
	
	// No skill levels
	/**
	 * The Constant SPEECH.
	 */
	public static final String SPEECH = "Speech";
	
	/**
	 * The Constant UNIT_DETECTOR.
	 */
	public static final String UNIT_DETECTOR = "UnitDetector";
	
	/**
	 * The Constant STASH_SEARCH.
	 */
	public static final String STASH_SEARCH = "StashSearch";
	
	/**
	 * The Constant SLIT_MELEE.
	 */
	public static final String SLIT_MELEE = "Backstab";
	
	/**
	 * The Constant STUN_MELEE.
	 */
	public static final String STUN_MELEE = "Weapon Bash";
	
	/**
	 * The Constant KILL_TAGS.
	 */
	public static final String KILL_TAGS = "Cad' Tag";
	
	/**
	 * Apply ability.
	 *
	 * @param initiator the initiator
	 * @param ability the ability
	 * @param skillLevel the skill level
	 */
	public static void applyAbility(Ai initiator, String ability, int skillLevel){
		switch(ability){
			case GRENADETHROWER:
				initiator.throwGrenadeAction(skillLevel);
			break;
			case STUNGRENADETHROWER:
				initiator.throwStunGrenadeTurnAction(skillLevel);
			break;
			case XRAY_SCAN:
				if(skillLevel == 0){
					initiator.setFov(150);
				}
				else if(skillLevel == 1){
					initiator.setFov(180);
				}
				else if(skillLevel == 2){
					initiator.setFov(240);
				}
				else if(skillLevel == 3){
					initiator.setFov(290);
				}
				else{
					initiator.setFov(360);
				}
				initiator.ignoreLOS(true);
			break;
		}
	}
	
	
	// Constants to do with the abilities
	// abilities start at 0, and are done with a > check
	// so abilities will take 2 more turns that stated

	/**
	 * The Constant TURNS_TO_LOOT.
	 */
	public static final int TURNS_TO_LOOT = 0;
	
	/**
	 * The Constant WELDING.
	 */
	public static final String WELDING = "Engineering";
	
	/**
	 * The Constant TURNS_TO_WELD.
	 */
	public static final int TURNS_TO_WELD[] = {6,5,4,3,2};
	
	/**
	 * The Constant SCAN_ROOM.
	 */
	public static final String SCAN_SCIENCE = "Science";
	
	/**
	 * The Constant TURNS_TO_SCAN.
	 */
	public static final int TURNS_TO_SCAN[] = {8,7,6,5,4};

	public static final String HACK = "Hack";
	
	public static final int TURNS_TO_HACK[] = {12,11,10,8,6};

	public static final String PARRY = "Parry";
	
	/**
	 * Turns to do.
	 *
	 * @param ability the ability
	 * @param skillLevel the skill level
	 * @return the int
	 */
	public static int turnsToDo(String ability, int skillLevel){
		int turns = 0;
		
		switch(ability){
			case WELDING:
				turns = TURNS_TO_WELD[skillLevel];
			break;
			case SCAN_SCIENCE:
				turns = TURNS_TO_SCAN[skillLevel];
			break;
			case HACK:
				turns = TURNS_TO_HACK[skillLevel];
			break;
		}
		
		return turns;
	}

}
