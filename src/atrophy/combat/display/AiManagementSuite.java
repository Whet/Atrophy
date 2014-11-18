package atrophy.combat.display;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Faction;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnOrderer;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Squad;

public class AiManagementSuite {
	
	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	public AiManagementSuite(TurnOrderer turnOrderer, TurnProcess turnProcess, LevelManager levelManager, Squad squad){
		aiCrowd = new AiCrowd(squad, turnOrderer);
		combatMembersManager = new CombatMembersManager(aiCrowd, turnProcess, levelManager);
		combatMembersManager.createCommanders(squad.getFactionRelation(Faction.BANDITS), squad.getFactionRelation(Faction.WHITE_VISTA));
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
