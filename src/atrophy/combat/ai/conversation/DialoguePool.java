package atrophy.combat.ai.conversation;

import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.level.MissionManager;

public class DialoguePool {

	private MessageBox messageBox;
	private MissionManager missionManager;
	
	public DialoguePool(MissionManager missionManager, MessageBox messageBox) {
		this.missionManager = missionManager;
		this.messageBox = messageBox;
	}

	public Dialogue getMurderAccusation() {
		return createMurderAccusation();
	}

	private Dialogue createMurderAccusation() {
		return new Dialogue(missionManager, "Wait a second, you're that murderer! Time to face justice", new String[]{"Attack", "Give Items", "Intimidate"}, true);
	}

	public MessageBox getMessageBox() {
		return this.messageBox;
	}
	
}
