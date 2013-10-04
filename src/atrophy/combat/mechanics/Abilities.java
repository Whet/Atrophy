package atrophy.combat.mechanics;

import atrophy.combat.ai.Ai;

// TODO: Auto-generated Javadoc
/**
 * The Class Abilities.
 */
public class Abilities{

	// Skill levels go 0,1,2,3,4
	
	public static final String XRAY_SCAN = "Scanning";
	public static final String SPEED_BOOSTER = "Scouting";
	public static final String STEALTH1 = "Ambushing";
	public static final String STEALTH2 = "Ghost";
	public static final String INVESTIGATE = "Detective";
	
	// No skill levels
	public static final String SPEECH = "Speech";
	public static final String UNIT_DETECTOR = "UnitDetector";
	public static final String STASH_SEARCH = "StashSearch";
	public static final String SLIT_MELEE = "Backstab";
	public static final String STUN_MELEE = "Weapon Bash";
	public static final String KILL_TAGS = "Cad' Tag";
	
	public static void applyAbility(Ai initiator, String ability, int skillLevel){
		switch(ability){
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

	public static final int TURNS_TO_LOOT = 0;
	
	public static final String WELDING = "Engineering";
	
	public static final int TURNS_TO_WELD[] = {6,5,4,3,2};
	
	public static final String SCAN_SCIENCE = "Science";
	
	public static final int TURNS_TO_SCAN[] = {8,7,6,5,4};

	public static final String HACK = "Hack";
	
	public static final int TURNS_TO_HACK[] = {12,11,10,8,6};

	public static final String PARRY = "Parry";

	public static final String GRAPPLE = "Grapple";
	
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
