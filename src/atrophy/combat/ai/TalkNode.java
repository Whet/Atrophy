package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.List;

import atrophy.combat.ai.conversation.Dialogue;
import atrophy.combat.level.MissionManager;

public class TalkNode {

	private List<String> subscriptions;
	private String name;
	private MissionManager missionManager;
	
	public TalkNode(String name, List<String> subscriptions, MissionManager missionManager) {
		this.name = name;
		this.subscriptions = subscriptions;
		this.missionManager = missionManager;
	}

	public String getName() {
		return this.name;
	}

	public List<Dialogue> getDialogues() {
		List<Dialogue> topics = new ArrayList<>();
		
		for(String topicTag : this.subscriptions){
			topics.add(this.missionManager.getTalkMap(topicTag).getDialogue());
		}
		
		return topics;
	}
	
}
