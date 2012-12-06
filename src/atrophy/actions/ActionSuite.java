package atrophy.actions;

import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class ActionSuite {

	private CombatKeyboardHandler combatKeyboardHandler;
	private CombatMouseHandler combatMouseHandler;
	private MouseAbilityHandler mouseAbilityHandler;
	
	public ActionSuite(AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, TurnProcess turnProcess, LevelManager levelManager){
		
		this.mouseAbilityHandler = new MouseAbilityHandler(aiManagementSuite, uiUpdaterSuite, levelManager);
		this.combatKeyboardHandler = new CombatKeyboardHandler(mouseAbilityHandler, turnProcess, aiManagementSuite, uiUpdaterSuite);
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
