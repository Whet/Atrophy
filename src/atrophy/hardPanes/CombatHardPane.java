package atrophy.hardPanes;

import java.util.List;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.HardPaneDefineable;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.actions.CombatMouseHandler;
import atrophy.combat.actions.MousePanner;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.combatEffects.PowerManager;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.MapPainter;
import atrophy.combat.display.ui.Cartographer;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.MissionManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.Missions;


public class CombatHardPane implements HardPaneDefineable {
	
	private TurnProcess turnProcess;
	private AiManagementSuite aiManagementSuite;
	private UiUpdaterSuite uiUpdaterSuite;
	private ActionSuite actionSuite;
	private LevelManager levelManager;
	private AiCrowd aiCrowd;
	private CombatNCEManager combatInorganicManager;
	private List<AiGeneratorInterface.GenerateCommand> generationCommands;
	private MissionManager missionManager;
	private Missions missions;
	private Cartographer cartographer;
	private MessageBox messageBox;
	
	public CombatHardPane(TurnProcess turnProcess, AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, ActionSuite actionSuite, LevelManager levelManager, AiCrowd aiCrowd, CombatNCEManager combatInorganicManager, List<GenerateCommand> generationCommands, MissionManager missionManager, Missions missions, Cartographer cartographer, MessageBox messageBox) {
		this.turnProcess = turnProcess;
		this.aiManagementSuite = aiManagementSuite;
		this.uiUpdaterSuite = uiUpdaterSuite;
		this.actionSuite = actionSuite;
		this.levelManager = levelManager;
		this.aiCrowd = aiCrowd;
		this.combatInorganicManager = combatInorganicManager;
		this.generationCommands = generationCommands;
		this.missionManager = missionManager;
		this.missions = missions;
		this.cartographer = cartographer;
		this.messageBox = messageBox;
	}
	
	public void load(Crowd crowd){
		
		//Load images
		MapPainter.loadTextures();
		
		AiGenerator aiGenerator = new AiGenerator(aiManagementSuite.getAiCrowd(), aiManagementSuite.getCombatMembersManager(), uiUpdaterSuite.getCombatUiManager(), uiUpdaterSuite.getCombatVisualManager(), levelManager, uiUpdaterSuite.getPanningManager(), actionSuite.getMouseAbilityHandler(), turnProcess, uiUpdaterSuite.getFloatingIcons(), combatInorganicManager, uiUpdaterSuite.getLootBox(), missions, missionManager, cartographer, messageBox, uiUpdaterSuite.getMapDrawer());
		aiGenerator.generateAi(generationCommands);
		aiCrowd.getShuffledStack();
		
		missionManager.lazyLoad(aiGenerator, uiUpdaterSuite.getCombatUiManager());
		
		crowd.addCrowd(aiCrowd);
		aiCrowd.setVisible(true);
		
		PowerManager powerManager = new PowerManager(aiCrowd.getSquad(), aiCrowd.getDirector(), aiGenerator);
		
		turnProcess.setPowerManager(powerManager);
		actionSuite.getMouseAbilityHandler().setPowerManager(powerManager);
		uiUpdaterSuite.getFloatingIcons().setPowerManager(powerManager);
		uiUpdaterSuite.getCombatUiManager().getActionsBar().setPowerManager(powerManager);
		actionSuite.getCombatKeyboardHandler().setPowerManager(powerManager);
		
		// Add ui elements
		crowd.addButton(uiUpdaterSuite.getCombatUiManager().getMoveFlag());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getLineSurface());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getMapDrawer());
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getTorchDrawer());
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
		
		crowd.addDisplayItem(uiUpdaterSuite.getCombatUiManager().getLargeEventText());
		
		crowd.addMouseActionItem(actionSuite.getCombatMouseHandler());
		MousePanner mousePanner = new MousePanner(uiUpdaterSuite.getPanningManager(), uiUpdaterSuite.getCombatUiManager());
		crowd.addMouseActionItem(mousePanner);
		// Order Z, higher numbers on top
		// ai images at 2, dead ones at 1
		
		uiUpdaterSuite.getCombatUiManager().getMapDrawer().setZ(-1);
		uiUpdaterSuite.getCombatUiManager().getLineSurface().setZ(0);
		uiUpdaterSuite.getCombatUiManager().getTorchDrawer().setZ(3);
		
		aiCrowd.setZ(2);
		
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
		
		actionSuite.getCombatMouseHandler().setActionZ(-2);
		
		mousePanner.setActionZ(8);
		
		uiUpdaterSuite.getCombatUiManager().getLargeEventText().setZ(10);
		
		uiUpdaterSuite.getCombatUiManager().updateUi();
		
		crowd.addKeyListener(actionSuite.getCombatKeyboardHandler());
		
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
		
		uiUpdaterSuite.getCombatUiManager().getMapDrawer().updateAlphas();
		
	}
	
}
