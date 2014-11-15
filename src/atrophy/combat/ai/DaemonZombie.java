package atrophy.combat.ai;

import atrophy.combat.ai.conversation.DialoguePool;
import atrophy.combat.level.LevelManager;

public class DaemonZombie extends DaemonAi {

	public DaemonZombie(Ai hostAi, LevelManager levelManager, DialoguePool dialoguePool, TeamsCommander commander) {
		
		super(hostAi.panningManager, hostAi.combatVisualManager, hostAi.turnProcess,
			  hostAi.floatingIcons, hostAi.mouseAbilityHandler, hostAi.aiCrowd, hostAi.combatMembersManager,
			  hostAi.image, hostAi.getLocation()[0], hostAi.getLocation()[1], levelManager, hostAi.combatUiManager, hostAi.lootBox, dialoguePool);
		
		this.image = hostAi.image;
		commander.addAi(this);
		this.setName("Zombie");
		this.setBaseAggression(ThinkingAiEmotion.MINDLESS_TERROR);
		
		for(int i = 0; i < hostAi.getInventory().getItemCount(); i++) {
			this.addItem(hostAi.getInventory().getItemAt(i));
		}
		
		this.setWeapon(hostAi.getWeapon());
	}

}
