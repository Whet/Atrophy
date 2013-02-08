package atrophy.combat.ai;

public class DefenceHeuristic {

	public int missionH, dangerH, defenceH, assignmentModifier;
	
	public DefenceHeuristic(){
		this.missionH = 0;
		this.dangerH = 0;
		this.defenceH = 0;
	}
	
	public int getF() {
		return this.missionH + dangerH + defenceH;
	}
	
	public int getFAfterAssignments() {
		return getF() - assignmentModifier;
	}
	
}
