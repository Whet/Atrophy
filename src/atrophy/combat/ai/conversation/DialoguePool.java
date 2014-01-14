package atrophy.combat.ai.conversation;

import atrophy.combat.display.ui.Cartographer;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.level.MissionManager;

public class DialoguePool {

	private MessageBox messageBox;
	private MissionManager missionManager;
	private Cartographer cartographer;
	private String faction;
	
	public DialoguePool(String faction, MissionManager missionManager, Cartographer cartographer, MessageBox messageBox) {
		this.missionManager = missionManager;
		this.cartographer = cartographer;
		this.messageBox = messageBox;
		this.faction = faction;
	}

	public Dialogue getMurderAccusation() {
		return createMurderAccusation();
	}

	private Dialogue createMurderAccusation() {
		return new Dialogue(missionManager, cartographer, "Wait a second, you're that murderer! Time to face justice", new String[]{"Attack", "Give Items", "Intimidate"}, true);
	}

	public MessageBox getMessageBox() {
		return this.messageBox;
	}
	
}
