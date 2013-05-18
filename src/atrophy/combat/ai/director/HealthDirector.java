package atrophy.combat.ai.director;

import java.util.HashMap;
import java.util.Map;

import atrophy.combat.ai.Ai;

public class HealthDirector {

	private Map<TriggerKey, Judgement> judgements;
	
	public HealthDirector() {
		this.judgements = new HashMap<>();
	}

	public boolean judge(boolean dead, Ai ai) {
		return dead;
	}
	
}
