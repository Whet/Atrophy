package atrophy.combat.ai;

import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.conversation.DialoguePool;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.DaemonWeapon;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class DaemonZombieMaker extends DaemonAi {

	private static final int CONVERSION_RANGE = 100;

	public DaemonZombieMaker(PanningManager panningManager,
			CombatVisualManager combatVisualManager, TurnProcess turnProcess,
			FloatingIcons floatingIcons,
			MouseAbilityHandler mouseAbilityHandler, AiCrowd aiCrowd,
			CombatMembersManager combatMembersManager, String name, double x,
			double y, LevelManager levelManager,
			CombatUiManager combatUiManager, LootBox lootBox,
			DialoguePool dialoguePool) {
		super(panningManager, combatVisualManager, turnProcess, floatingIcons,
				mouseAbilityHandler, aiCrowd, combatMembersManager, name, x, y,
				levelManager, combatUiManager, lootBox, dialoguePool);
		
		this.setWeapon(new DaemonWeapon());
		this.addItem(ArmourPlates2.getInstance());
	}
	
	@Override
	protected void shoot() {
		super.shoot();
	}
	
	@Override
	protected void interactWithDeadAi() {
		Ai targetAi = null;
		for(Ai ai:aiCrowd.getActors()) {
			if(ai.isDead() && !ai.getFaction().equals(Faction.DAEMON) && ai.getLevelBlock() == this.getLevelBlock() && (targetAi == null || Maths.getDistance(this.getLocation(), ai.getLocation()) < Maths.getDistance(this.getLocation(), targetAi.getLocation()))) {
				targetAi = ai;
			}
		}
		
		if(targetAi != null && Maths.getDistance(this.getLocation(), targetAi.getLocation()) < CONVERSION_RANGE)
			combatMembersManager.changeAiToAi(targetAi, new DaemonZombie(targetAi, levelManager, dialoguePool, this.getCommander()));
	}

}
