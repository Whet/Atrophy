package atrophy.combat.actions;

import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.StashManager;

public class ActionSuite {
	
	private CombatKeyboardHandler combatKeyboardHandler;
	private CombatMouseHandler combatMouseHandler;
	private MouseAbilityHandler mouseAbilityHandler;
	
	public ActionSuite(AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, TurnProcess turnProcess, LevelManager levelManager, Squad squad, TechTree techTree, StashManager stashManager, Missions missions){
		
		this.mouseAbilityHandler = new MouseAbilityHandler(squad,aiManagementSuite, uiUpdaterSuite, levelManager);
		this.combatKeyboardHandler = new CombatKeyboardHandler(levelManager, mouseAbilityHandler, turnProcess, aiManagementSuite, uiUpdaterSuite, techTree, stashManager, missions);
		this.combatMouseHandler = new CombatMouseHandler(levelManager, mouseAbilityHandler, aiManagementSuite, uiUpdaterSuite);
	}

	public CombatKeyboardHandler getCombatKeyboardHandler() {
		return combatKeyboardHandler;
	}

	public CombatMouseHandler getCombatMouseHandler() {
		return combatMouseHandler;
	}

	public MouseAbilityHandler getMouseAbilityHandler() {
		return mouseAbilityHandler;
	}
	
}
