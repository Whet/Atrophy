package atrophy.combat.ai.conversation;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.ui.Cartographer;
import atrophy.combat.level.MissionManager;
import atrophy.gameMenu.saveFile.Missions;

public class DialoguePool {

	private Dialogue murderAccusation;
	
	public DialoguePool(String faction, Missions missions, MissionManager missionManager, Cartographer cartographer) {
		switch(faction) {
			case AiGenerator.WHITE_VISTA:
				murderAccusation = new Dialogue(missions, missionManager, cartographer, "", new String[]{}, true);
			break;
		}
	}

	public Dialogue getMurderAccusation() {
		return murderAccusation;
	}
	
}
