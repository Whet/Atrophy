package atrophy.combat.ai.director;

import java.util.HashMap;
import java.util.Map;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;

public class HealthDirector {

	private CombatVisualManager combatVisualManager;
	private AiCrowd aiCrowd;
//	private Map<TriggerKey, Judgement> judgements;
	
	private Map<JudgementType, Integer> judgements;
	
	private Map<Ai, DirectorClassification> clf;
	
	public HealthDirector(AiCrowd aiCrowd) {
//		this.judgements = new HashMap<>();
		this.clf = new HashMap<>();
		this.aiCrowd = aiCrowd;
	}

	public boolean judge(boolean dead, Ai killedAi, Ai killer) {
		
		if(clf.get(killer).getType().equals(DirectorArchetype.COD)) {
			appealArchetypeChange(dead, killer, clf.get(killer).getOriginalType());
			return false;
		}
		
		if((clf.get(killedAi).getType().equals(DirectorArchetype.COD) || clf.get(killedAi).getType().equals(DirectorArchetype.SWARM)) &&
			clf.get(killer).getType().equals(DirectorArchetype.PLAYER)) {
			return true;
		}
		
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
		
		if(judgements.get(JudgementType.STEALTH_KILL) < 3 && killer.getWeapon().isMelee() && !combatVisualManager.isAiInSight(killer, killedAi.getFaction())) {
			
			judgements.put(JudgementType.STEALTH_KILL, judgements.get(JudgementType.STEALTH_KILL) + 1);
			
			return true;
		}
		else if(killer.getWeapon().isMelee() && !combatVisualManager.isAiInSight(killer, killedAi.getFaction())) {
			
			changeClassification(killedAi, DirectorArchetype.COD);
			
			return false;
		}
		
		return false;
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
