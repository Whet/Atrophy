package atrophy.combat.display;

import atrophy.actions.MouseAbilityHandler;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class AiManagementSuite {
	
	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	public AiManagementSuite(TurnProcess turnProcess, CombatInorganicManager combatInorganicManager, LevelManager levelManager){
		aiCrowd = new AiCrowd();
		combatMembersManager = new CombatMembersManager(aiCrowd, turnProcess, levelManager, combatInorganicManager);
	}

	public AiCrowd getAiCrowd() {
		return aiCrowd;
	}

	public CombatMembersManager getCombatMembersManager() {
		return combatMembersManager;
	}
	
	public void lazyLoad(UiUpdaterSuite uiUpdaterSuite, MouseAbilityHandler mouseAbilityHandler){
		this.combatMembersManager.lazyLoad(uiUpdaterSuite, mouseAbilityHandler);
	}
	
}
