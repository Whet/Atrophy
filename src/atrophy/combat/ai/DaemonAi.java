package atrophy.combat.ai;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.conversation.DialoguePool;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class DaemonAi extends ThinkingAi {

	private LevelManager levelManager;

	public DaemonAi(PanningManager panningManager,
			CombatVisualManager combatVisualManager, TurnProcess turnProcess,
			FloatingIcons floatingIcons,
			MouseAbilityHandler mouseAbilityHandler, AiCrowd aiCrowd,
			CombatMembersManager combatMembersManager, String name, double x,
			double y, LevelManager levelManager,
			CombatUiManager combatUiManager, LootBox lootBox, DialoguePool dialoguePool) {
		super(dialoguePool, panningManager, combatVisualManager, turnProcess, floatingIcons,
				mouseAbilityHandler, aiCrowd, combatMembersManager, name, x, y,
				levelManager, combatUiManager, lootBox);
		this.levelManager = levelManager;
	}
	
	@Override
	public void setDead(Ai killer, boolean dead) {
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
	
	@Override
	public boolean isTargetHostile(Ai target) {
		return !target.isDead() && target != this;
	}
	
	@Override
	public TeamsCommander getCommander() {
		return combatMembersManager.getCommander(this);
	}

}
