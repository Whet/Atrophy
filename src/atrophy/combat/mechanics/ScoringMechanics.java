/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.mechanics;

import java.util.Random;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.combatEffects.Parrying;
import atrophy.combat.items.Weapon;

/**
 * The Class ScoringMechanics.
 */
public class ScoringMechanics {

	/**
	 * Killed target.
	 *
	 * @param ai the ai
	 * @param targetAi the target ai
	 * @return true, if successful
	 */
	public static boolean killedTarget(Ai ai, Ai targetAi) {
		// if the target misses, they can re-roll if in range and not melee
		if((hitTarget(ai, targetAi) || (!ai.getWeapon().isMelee() && ai.getWeapon().isInRange(ai, targetAi) && hitTarget(ai, targetAi)))){
			
			// Check for target defences
			if(targetAi.hasActiveEffect(Parrying.NAME)) {
				ai.setStunnedTurns(Parrying.STUN_TURNS);
				return false;
			}
			
			if(damagedtarget(ai,targetAi)){
				return true;
			}
			
			return false;
	    }
			   
		return false;
	}
	
	/**
	 * Damagedtarget.
	 *
	 * @param ai the ai
	 * @param targetAi the target ai
	 * @return true, if successful
	 */
	private static boolean damagedtarget(Ai ai, Ai targetAi) {
		return damagedtarget(ai.getWeapon().getDamage(), targetAi.getArmour());
	}
	
	/**
	 * Damagedtarget.
	 *
	 * @param damage the damage
	 * @param targetAi the target ai
	 * @return true, if successful
	 */
	private static boolean damagedtarget(int damage, Ai targetAi) {
		return damagedtarget(damage, targetAi.getArmour());
	}
	
	private static boolean damagedtarget(int damage, int armour) {
		return damage > armour * Math.random();
	}

	/**
	 * Hit target.
	 *
	 * @param ai the ai
	 * @param targetAi the target ai
	 * @return true, if successful
	 */
	private static boolean hitTarget(Ai ai, Ai targetAi){
		// ignore cover if weapon allows it, target isn't in cover or ai are in the same block of cover
		if(ai.getWeapon().ignoresCover() || targetAi.getCoverObject() == null || ai.getCoverObject() == targetAi.getCoverObject()){
			
			// If the ai has a melee weapon and is not visible to the targetAi then it autohits
			if(ai.getWeapon().isMelee() && !CombatVisualManager.spotFovNoRadius(targetAi, ai.getLocation()))
				return true;
			
			// Uncovered roll
			return new Random().nextInt(100) <= (ai.getWeapon().getAccuracy() + ai.getAccuracyBoost()) + ai.getSwing() * Weapon.SWING_BONUS;
		}
		
		// Cover roll
		return new Random().nextInt(200) <= (ai.getWeapon().getAccuracy() + ai.getAccuracyBoost()) + ai.getSwing() * Weapon.SWING_BONUS;
	}
	
	
	
	/**
	 * Weak intimidate check.
	 *
	 * @param intimidator the intimidator
	 * @param intimidated the intimidated
	 * @param combatMembersManager 
	 * @return true, if successful
	 */
	public static boolean weakIntimidateCheck(Ai intimidator, Ai intimidated, CombatMembersManager combatMembersManager){
		return combatMembersManager.getFactionStrength(intimidator.getFaction(), intimidator.getLevelBlock()) * (Math.random() + 0.5) > 
		       combatMembersManager.getFactionStrength(intimidated.getFaction(), intimidated.getLevelBlock()) * Math.random();
	}
	
	/**
	 * Strong intimidate check.
	 *
	 * @param intimidator the intimidator
	 * @param intimidated the intimidated
	 * @param combatMembersManager 
	 * @return true, if successful
	 */
	public static boolean strongIntimidateCheck(Ai intimidator, Ai intimidated, CombatMembersManager combatMembersManager){
		return combatMembersManager.getFactionStrength(intimidator.getFaction(), intimidator.getLevelBlock()) * Math.random() > 
			   combatMembersManager.getFactionStrength(intimidated.getFaction(), intimidated.getLevelBlock()) * Math.random();
	}

	/**
	 * Grenade damage.
	 *
	 * @param ai the ai
	 * @param skillLevel the skill level
	 * @return true, if successful
	 */
	public static boolean grenadeDamage(Ai ai, int skillLevel) {
		if(ai.isInCover() && skillLevel < 4){
			
			if(new Random().nextInt(100) < 60 &&
			   damagedtarget(30, ai)){
				
				return true;
			}
			return false;
			
		}
		else{
			if(new Random().nextInt(100) < 90 &&
			   damagedtarget(50 + 10 * skillLevel, ai)){
				
				return true;
			}
			return false;
		}
	}

}
