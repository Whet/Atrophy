package atrophy.combat.ai;

public class DefenceHeuristic {

	public int missionH, dangerH;
	
	public DefenceHeuristic(){
		this.missionH = 0;
		this.dangerH = 0;
	}
	
	public int getF() {
		return this.missionH + dangerH;
	}
	
}
