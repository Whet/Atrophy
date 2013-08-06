package atrophy.combat.ai.director;

import java.util.HashMap;
import java.util.Map;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;

public class HealthDirector {

	private CombatVisualManager combatVisualManager;
	private AiCrowd aiCrowd;
	
	private Map<JudgementType, Integer> jdg;
	private Map<Ai, DirectorClassification> clf;
	
	public HealthDirector(AiCrowd aiCrowd) {
		this.clf = new HashMap<>();
		this.jdg = new HashMap<>();
		
		this.jdg.put(JudgementType.STEALTH_KILL, 0);
		
		this.aiCrowd = aiCrowd;
	}

	public boolean judge(boolean dead, Ai killedAi, Ai killer, int turn) {
		
		// Handle attackers that shouldn't be able to attack
		if(killer.getStunnedTurns() > 0 || killer.getIncapTurns() > 0) {
			return false;
		}
		
		// Don't handle ai on ai conflict beyond pure dice rolling]
		if(!this.clf.get(killedAi).getType().equals(DirectorArchetype.PLAYER) && !this.clf.get(killer).getType().equals(DirectorArchetype.PLAYER)) {
			return dead;
		}
		
		// Handle cod attacking
		if(clf.get(killer).getType().equals(DirectorArchetype.COD)) {
			
			appealArchetypeChange(dead, killer, clf.get(killer).getOriginalType());
			return false;
		}
		
		clf.get(killedAi).addAttackRecord(turn);
		
		// Handle attacking swam/cod
		if((clf.get(killedAi).getType().equals(DirectorArchetype.COD) ||
		   (clf.get(killedAi).getType().equals(DirectorArchetype.SWARM) &&
		   (getFactionInRoom(killedAi) > 3) || getFactionInRoom(killedAi) == 1)) &&
			clf.get(killer).getType().equals(DirectorArchetype.PLAYER)) {
			
			if(Math.random() > 0.8) {
				changeClassification(killedAi, DirectorArchetype.COD);
			}
			
			return true;
		}
		
		// Handle swarm attacking
		if(clf.get(killedAi).getType().equals(DirectorArchetype.PLAYER) && clf.get(killer).getType().equals(DirectorArchetype.SWARM)) {
			
			// Complete swarming will kill careless player
			if(clf.get(killedAi).getAttackedCount() == getFactionInRoom(killer) && getFactionInRoom(killer) > 3)
				return true;
			
			// Some swarming, give the swarm a chance
			if(getFactionInRoom(killer) > 2)
				return dead;
			
			// A lone swarmer cannot kill
			return false;
		}
		
		// Handle stealth kills
		if(dead || (!clf.get(killedAi).getType().equals(DirectorArchetype.ELITE) &&
				    !clf.get(killedAi).getType().equals(DirectorArchetype.SPEAKER) &&
				    stealthKillChecks(killedAi, killer))) {
			
			return true;
		}
		
		return false;
	}

	private void appealArchetypeChange(boolean dead, Ai killer, DirectorArchetype desiredArchetype) {
		
		if(clf.get(killer).getType().equals(DirectorArchetype.COD) && dead)
			changeClassification(killer, desiredArchetype);
		
	}

	private boolean stealthKillChecks(Ai killedAi, Ai killer) {
		
		if(jdg.get(JudgementType.STEALTH_KILL) < 3 && killer.getWeapon().isMelee() && !combatVisualManager.isAiInSight(killedAi, killer, killedAi.getFaction())) {
			
			jdg.put(JudgementType.STEALTH_KILL, jdg.get(JudgementType.STEALTH_KILL) + 1);
			
			return true;
		}
		else if(killer.getWeapon().isMelee() && !combatVisualManager.isAiInSight(killedAi, killer, killedAi.getFaction()) && getFactionInRoom(killedAi) == 1) {
			
			changeClassification(killedAi, DirectorArchetype.COD);
			
			return false;
		}
		
		return false;
	}

	private int getFactionInRoom(Ai queriedAi) {
		
		int count = 0;
		
		for(Ai ai: aiCrowd.getActors()) {
			if(ai.getFaction().equals(queriedAi.getFaction()) && ai.getLevelBlock() == queriedAi.getLevelBlock())
				count++;
		}
		
		return count;
	}

	public void addAi(Ai ai, DirectorClassification aiClass) {
		this.clf.put(ai, aiClass);
	}

	private void changeClassification(Ai ai, DirectorArchetype desiredArchetype) {
		this.clf.get(ai).setType(desiredArchetype);
		System.out.println(ai.getName() + "  is type " + desiredArchetype.toString());
	}
	
	public void lazyLoad(CombatVisualManager combatVisualManager) {
		this.combatVisualManager = combatVisualManager;
	}
	
}
