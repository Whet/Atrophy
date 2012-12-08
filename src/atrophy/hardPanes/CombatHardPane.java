/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.ModdableHardPane;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.MapPainter;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;


// TODO: Auto-generated Javadoc
/**
 * The Class CombatHardPane.
 */
public class CombatHardPane extends ModdableHardPane{
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "CombatHardPane";
	private TurnProcess turnProcess;
	private AiManagementSuite aiManagementSuite;
	private UiUpdaterSuite uiUpdaterSuite;
	private ActionSuite actionSuite;
	private LevelManager levelManager;
	private AiCrowd aiCrowd;
	private CombatInorganicManager combatInorganicManager;
	
	public CombatHardPane(TurnProcess turnProcess, AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, ActionSuite actionSuite, LevelManager levelManager, AiCrowd aiCrowd, CombatInorganicManager combatInorganicManager) {
		this.turnProcess = turnProcess;
		this.aiManagementSuite = aiManagementSuite;
		this.uiUpdaterSuite = uiUpdaterSuite;
		this.actionSuite = actionSuite;
		this.levelManager = levelManager;
		this.aiCrowd = aiCrowd;
		this.combatInorganicManager = combatInorganicManager;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.hardPanes.ModdableHardPane#load(java.lang.String, watoydoEngine.designObjects.display.Crowd)
	 */
	public void load(String tag, Crowd crowd){
		
		crowd.setTemplate(NAME);
		
		//Load images
		MapPainter.loadTextures();
		
		AiGenerator aiGenerator = new AiGenerator(aiManagementSuite.getAiCrowd(), aiManagementSuite.getCombatMembersManager(), uiUpdaterSuite.getCombatUiManager(), uiUpdaterSuite.getCombatVisualManager(), levelManager, uiUpdaterSuite.getPanningManager(), actionSuite.getMouseAbilityHandler(), turnProcess, uiUpdaterSuite.getFloatingIcons(), combatInorganicManager, uiUpdaterSuite.getLootBox());
		aiGenerator.generateAi(crowd);
		aiCrowd.getShuffledStack();
		
		crowd.addCrowd(aiManagementSuite.getAiCrowd());
		
		// Add ui elements
		crowd.addButton(uiUpdaterSuite.getCombatUiManager().getMoveFlag());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getLineSurface());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getUnitMarker());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getAllyRoster());
		crowd.addMouseActionItem(uiUpdaterSuite.getCombatUiManager().getAllyRoster());
		crowd.addCrowd(uiUpdaterSuite.getCombatUiManager().getCombatInfo());
		crowd.addCrowd(uiUpdaterSuite.getCombatUiManager().getActionsBar());
		crowd.addCrowd(uiUpdaterSuite.getCombatUiManager().getFloatingIcons());
		
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getActionText());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getInfoText());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getMiniMap());
		
		crowd.addCrowd(uiUpdaterSuite.getLootBox());
		
		crowd.addCrowd(uiUpdaterSuite.getMessageBox());
		
		crowd.addCrowd(uiUpdaterSuite.getCartographerBox());
		
//		crowd.addCrowd(uiUpdaterSuite.getan);
		
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getLargeEventText());
		
		crowd.addMouseActionItem(actionSuite.getCombatMouseHandler());
		
		// Order Z, higher numbers on top
		// ai images at 2, dead ones at 1
		
		uiUpdaterSuite.getCombatUiManager().getLineSurface().setZ(-1);
		
		uiUpdaterSuite.getCombatUiManager().getUnitMarker().setZ(5);
		uiUpdaterSuite.getCombatUiManager().getMoveFlag().setZ(5);
		uiUpdaterSuite.getCombatUiManager().getFloatingIcons().setZ(5);
		uiUpdaterSuite.getCombatUiManager().getActionText().setZ(5);
		
		uiUpdaterSuite.getCombatUiManager().getAllyRoster().setZ(6);
		uiUpdaterSuite.getCombatUiManager().getAllyRoster().setActionZ(-1);
		uiUpdaterSuite.getCombatUiManager().getCombatInfo().setZ(6);
		uiUpdaterSuite.getCombatUiManager().getActionsBar().setZ(6);
		uiUpdaterSuite.getCombatUiManager().getActionsBar().setActionZ(-1);
		uiUpdaterSuite.getCombatUiManager().getInfoText().setZ(6);
		uiUpdaterSuite.getCombatUiManager().getMiniMap().setZ(6);
		
		uiUpdaterSuite.getLootBox().setZ(7);
		uiUpdaterSuite.getMessageBox().setZ(7);
		uiUpdaterSuite.getMessageBox().setActionZ(-2);
		uiUpdaterSuite.getCartographerBox().setZ(7);
		uiUpdaterSuite.getCartographerBox().setActionZ(-2);
		uiUpdaterSuite.getLootBox().setActionZ(-2);
//		antebar.setZ(7);
//		antebar.setActionZ(-1);
		
		actionSuite.getCombatMouseHandler().setActionZ(-2);
		
		uiUpdaterSuite.getCombatUiManager().getLargeEventText().setZ(10);
		
		uiUpdaterSuite.getCombatUiManager().updateUi();
		
		crowd.computeZOrder();
		
		// Hide ai if not in sight
		uiUpdaterSuite.getCombatVisualManager().updateVisibleAi();
		
		// minimap put here to avoid showing ai that shouldn't be visible
		uiUpdaterSuite.getCombatUiManager().getMiniMap().updateAiDrawing();
		uiUpdaterSuite.getCombatUiManager().getFloatingIcons().updateOverlappingIcons();
//		uiUpdaterSuite.getCombatUiManager().getLineSurface().MapDrawBlock.updateAlphas();
		
		// pan to centre on player
		uiUpdaterSuite.getPanningManager().panToPlayer();
		
		//crowd.addDisplayItem(DebugText.getInstance());
		
		crowd.addKeyListener(actionSuite.getCombatKeyboardHandler());
		
		uiUpdaterSuite.getCombatUiManager().getLineSurface().updateAlphas();
		
		loadSoftPane(tag,crowd);
	}

	/**
	 * Clear old.
	 */
	public static void clearOld() {
//		SoundBoard.getInstance().stopMusic();
	}
	
}
