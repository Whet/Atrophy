package atrophy.combat.ai.conversation;

import atrophy.combat.display.ui.Cartographer;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.level.MissionManager;
import atrophy.gameMenu.saveFile.Missions;

public class DialoguePool {

	private MessageBox messageBox;
	private Missions missions;
	private MissionManager missionManager;
	private Cartographer cartographer;
	private String faction;
	
	public DialoguePool(String faction, Missions missions, MissionManager missionManager, Cartographer cartographer, MessageBox messageBox) {
		this.missions = missions;
		this.missionManager = missionManager;
		this.cartographer = cartographer;
		this.messageBox = messageBox;
		this.faction = faction;
	}

	public Dialogue getMurderAccusation() {
		return createMurderAccusation();
	}

	private Dialogue createMurderAccusation() {
		return new Dialogue(missions, missionManager, cartographer, "Wait a second, you're that murderer! Time to face justice", new String[]{"Attack", "Give Items"}, true);
	}

	public MessageBox getMessageBox() {
		return this.messageBox;
	}
	
}
