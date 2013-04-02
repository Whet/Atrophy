package atrophy.combat.ai;

public class DefenceHeuristic {

	public int missionH, dangerH, defenceH, assignmentModifier;
	
	public DefenceHeuristic(){
		this.missionH = 0;
		this.dangerH = 0;
		this.defenceH = 0;
	}
	
	public int getDefence() {
		return this.missionH + defenceH;
	}
	
	public int getDefenceAfterAssignment() {
		return getDefence() - assignmentModifier;
	}
	
	public int getDanger() {
		return this.dangerH + this.defenceH;
	}
	
	public int getDangerAfterAssignment() {
		return this.getDanger() - assignmentModifier;
	}
	
}
