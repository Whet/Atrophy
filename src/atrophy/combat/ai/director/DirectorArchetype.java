package atrophy.combat.ai.director;

public enum DirectorArchetype {

	PLAYER, SWARM, ELITE, SPEAKER, UNDECIDED, COD;

	public static DirectorArchetype getEnum(String classification) {
		switch(classification.toLowerCase()) {
			case "player":
				return PLAYER;
			case "swarm":
				return SWARM;
			case "elite":
				return ELITE;
			case "speaker":
				return SPEAKER;
			case "cod":
				return COD;
		}
		return UNDECIDED;
	}
	
}
