package atrophy.combat.actions;

import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.MissionManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.StashManager;

public class ActionSuite {
	
	private CombatKeyboardHandler combatKeyboardHandler;
	private CombatMouseHandler combatMouseHandler;
	private MouseAbilityHandler mouseAbilityHandler;
	
	public ActionSuite(AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, TurnProcess turnProcess, LevelManager levelManager, TechTree techTree, StashManager stashManager, Missions missions, MissionManager missionManager){
		
		this.mouseAbilityHandler = new MouseAbilityHandler(aiManagementSuite, uiUpdaterSuite, levelManager);
		this.combatKeyboardHandler = new CombatKeyboardHandler(mouseAbilityHandler, turnProcess, aiManagementSuite, uiUpdaterSuite, techTree, stashManager, missions, missionManager);
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
