package atrophy.combat.ai.director;

import java.util.HashMap;
import java.util.Map;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;

public class HealthDirector {

	
	private AiCrowd aiCrowd;
	private Map<TriggerKey, Judgement> judgements;
	private Map<Ai, DirectorClassification> classifications;
	
	public HealthDirector(AiCrowd aiCrowd) {
		this.judgements = new HashMap<>();
		this.classifications = new HashMap<>();
		this.aiCrowd = aiCrowd;
	}

	public boolean judge(boolean dead, Ai ai) {
		return dead;
	}

	public void addAi(Ai ai, DirectorClassification aiClass) {
		this.classifications.put(ai, aiClass);
	}
	
}
