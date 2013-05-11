package atrophy.combat.display.ui;

import atrophy.combat.CombatNCEManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.CombatMouseHandler;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.LineDrawer;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class UiUpdaterSuite {

	private CombatUiManager combatUiManager;
	private LootBox lootBox;
	private MessageBox messageBox;
	private CartographerBox cartographerBox;
	private PanningManager panningManager;
	private CombatVisualManager combatVisualManager;
	private Cartographer cartographer;
	private FloatingIcons floatingIcons;
	
	public UiUpdaterSuite(AiManagementSuite aiManagementSuite, TurnProcess turnProcess, LevelManager levelManager, CombatNCEManager combatInorganicManager){
		
		this.panningManager = new PanningManager(aiManagementSuite.getAiCrowd(), aiManagementSuite.getCombatMembersManager());
		this.cartographer = new Cartographer();
		this.combatUiManager = new CombatUiManager(cartographer, aiManagementSuite.getCombatMembersManager(), panningManager, aiManagementSuite.getAiCrowd(), turnProcess, levelManager);
		this.combatVisualManager = new CombatVisualManager(aiManagementSuite.getAiCrowd(), combatUiManager, aiManagementSuite.getCombatMembersManager(), levelManager);
		this.cartographerBox = new CartographerBox(panningManager, cartographer);
		this.messageBox = new MessageBox(combatUiManager, turnProcess, aiManagementSuite.getCombatMembersManager(), combatVisualManager, cartographer, cartographerBox, aiManagementSuite.getAiCrowd());
		this.lootBox = new LootBox(combatUiManager, messageBox, cartographerBox);
		this.floatingIcons = new FloatingIcons(aiManagementSuite.getCombatMembersManager(), panningManager, aiManagementSuite.getAiCrowd(), combatVisualManager, combatInorganicManager, levelManager);
		
	}

	public CombatUiManager getCombatUiManager() {
		return combatUiManager;
	}

	public LootBox getLootBox() {
		return lootBox;
	}

	public MessageBox getMessageBox() {
		return messageBox;
	}

	public CartographerBox getCartographerBox() {
		return cartographerBox;
	}

	public PanningManager getPanningManager() {
		return panningManager;
	}

	public CombatVisualManager getCombatVisualManager() {
		return combatVisualManager;
	}

	public Cartographer getCartographer() {
		return cartographer;
	}

	public FloatingIcons getFloatingIcons() {
		return floatingIcons;
	}

	public void lazyLoad(MouseAbilityHandler mouseAbilityHandler, AiCrowd aiCrowd, LevelManager levelManager, CombatMouseHandler combatMouseHandler, TurnProcess turnProcess) {
		combatUiManager.lazyLoad(mouseAbilityHandler, combatUiManager, floatingIcons, combatVisualManager, lootBox, levelManager, aiCrowd, panningManager, turnProcess);
		floatingIcons.lazyLoad(combatUiManager.getLineSurface());
		messageBox.lazyLoad(combatMouseHandler);
	}

	public LineDrawer getLineDrawer() {
		return combatUiManager.getLineSurface();
	}
	
}
