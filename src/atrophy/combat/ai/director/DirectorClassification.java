package atrophy.combat.ai.director;

public class DirectorClassification {

	private DirectorArchetype type;
	private DirectorArchetype originalType;
	
	public DirectorClassification(DirectorArchetype type) {
		this.type = type;
		this.originalType = type;
	}

	public DirectorArchetype getType() {
		return type;
	}

	public DirectorArchetype getOriginalType() {
		return originalType;
	}

	public void setType(DirectorArchetype type) {
		this.type = type;
	}
	
}
