package atrophy.combat.ai.director;

import java.util.HashMap;
import java.util.Map;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;

public class HealthDirector {

	private CombatVisualManager combatVisualManager;
	private AiCrowd aiCrowd;
	private Map<TriggerKey, Judgement> judgements;
	private Map<Ai, DirectorClassification> classifications;
	
	public HealthDirector(AiCrowd aiCrowd) {
		this.judgements = new HashMap<>();
		this.classifications = new HashMap<>();
		this.aiCrowd = aiCrowd;
	}

	public boolean judge(boolean dead, Ai killedAi, Ai killer) {
		
		
		if(dead || (!classifications.get(killedAi).getType().equals(DirectorArchetype.ELITE) &&
				    !classifications.get(killedAi).getType().equals(DirectorArchetype.SPEAKER) &&
				    stealthKillChecks(killedAi, killer))) {
			return true;
		}
		
		return false;
	}

	private boolean stealthKillChecks(Ai killedAi, Ai killer) {
		
		if(killer.getWeapon().isMelee() && !combatVisualManager.isAiInSight(killer, killedAi.getFaction())) {
			return true;
		}
		
		return false;
	}

	public void addAi(Ai ai, DirectorClassification aiClass) {
		this.classifications.put(ai, aiClass);
	}

	public void lazyLoad(CombatVisualManager combatVisualManager) {
		this.combatVisualManager = combatVisualManager;
	}
	
}
