package atrophy.combat.ai.director;

public class DirectorClassification {

	private DirectorArchetype type;
	private DirectorArchetype originalType;
	//  [turnOfAttack, no. of attackers]
	private int[] attackInfo;
	
	public DirectorClassification(DirectorArchetype type) {
		this.type = type;
		this.originalType = type;
		attackInfo = new int[]{0,0};
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

	public void addAttackRecord(int turn) {
		if(attackInfo[0] < turn) {
			attackInfo[0] = turn;
			attackInfo[1] = 1;
		}
		else {
			attackInfo[1]++;
		}
	}

	public int getAttackedCount(int turn) {
		
		if(attackInfo[0] < turn) {
			attackInfo[0] = turn;
			attackInfo[1] = 0;
		}
		
		return attackInfo[1];
	}
	
}
