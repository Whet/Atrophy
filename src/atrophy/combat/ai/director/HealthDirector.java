package atrophy.combat.ai.director;

import java.util.HashMap;
import java.util.Map;

import atrophy.combat.ai.Ai;

public class HealthDirector {

	private Map<TriggerKey, Judgement> judgements;
	private Map<Ai, DirectorClassification> classifications;
	
	public HealthDirector() {
		this.judgements = new HashMap<>();
		this.classifications = new HashMap<>();
	}

	public boolean judge(boolean dead, Ai ai) {
		return dead;
	}

	public void addAi(Ai ai, DirectorClassification aiClass) {
		this.classifications.put(ai, aiClass);
	}
	
}
