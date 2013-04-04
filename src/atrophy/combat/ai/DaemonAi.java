package atrophy.combat.ai;

import atrophy.combat.CombatNCEManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class DaemonAi extends Ai {

	private LevelManager levelManager;

	public DaemonAi(FloatingIcons floatingIcons,
			MouseAbilityHandler mouseAbilityHandler, String name, double x,
			double y, CombatNCEManager combatInorganicManager,
			LevelManager levelManager, LootBox lootBox,
			CombatMembersManager combatMembersManager,
			CombatUiManager combatUiManager,
			CombatVisualManager combatVisualManager, AiCrowd aiCrowd,
			PanningManager panningManager, TurnProcess turnProcess) {
		super(floatingIcons, mouseAbilityHandler, name, x, y, combatInorganicManager,
				levelManager, lootBox, combatMembersManager, combatUiManager,
				combatVisualManager, aiCrowd, panningManager, turnProcess);
		this.levelManager = levelManager;
	}
	
	@Override
	public void setDead(boolean dead) {
		if(dead) {
			LevelBlock randomRoom;
			do {
				randomRoom = levelManager.randomRoom();
			}
			while(randomRoom == this.getLevelBlock());
				
			this.setLocation(levelManager.randomInPosition(randomRoom));
			this.setLevelBlock(randomRoom);
			this.setMoveLocationToSelf();
		}
	}

}
