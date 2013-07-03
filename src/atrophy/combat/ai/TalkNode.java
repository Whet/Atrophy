package atrophy.combat.ai;

import java.util.List;

import atrophy.combat.ai.conversation.Dialogue;

public class TalkNode {

	private List<String> subscriptions;
	private String name;
	
	public TalkNode(String name, List<String> subscriptions) {
		this.name = name;
		this.subscriptions = subscriptions;
	}

	public String getName() {
		return this.name;
	}

	public List<Dialogue> getDialogues() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
