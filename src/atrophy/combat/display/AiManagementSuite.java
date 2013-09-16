package atrophy.combat.display;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Squad;

public class AiManagementSuite {
	
	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	public AiManagementSuite(TurnProcess turnProcess, CombatNCEManager combatInorganicManager, LevelManager levelManager, Squad squad){
		aiCrowd = new AiCrowd(squad);
		combatMembersManager = new CombatMembersManager(aiCrowd, turnProcess, levelManager, combatInorganicManager);
		combatMembersManager.createCommanders(squad.getFactionRelation(AiGenerator.BANDITS), squad.getFactionRelation(AiGenerator.WHITE_VISTA));
	}

	public AiCrowd getAiCrowd() {
		return aiCrowd;
	}

	public CombatMembersManager getCombatMembersManager() {
		return combatMembersManager;
	}
	
	public void lazyLoad(UiUpdaterSuite uiUpdaterSuite, MouseAbilityHandler mouseAbilityHandler){
		this.combatMembersManager.lazyLoad(uiUpdaterSuite, mouseAbilityHandler);
		this.aiCrowd.lazyLoad(uiUpdaterSuite.getCombatVisualManager());
	}
	
}
