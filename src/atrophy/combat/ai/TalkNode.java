package atrophy.combat.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import atrophy.combat.ai.conversation.Dialogue;
import atrophy.combat.level.MissionManager;

public class TalkNode {

	private List<String> subscriptions;
	private String name;
	private MissionManager missionManager;
	private Integer x,y;
	
	public TalkNode(String name, List<String> subscriptions, MissionManager missionManager, List<Integer> xList, List<Integer> yList) {
		this.name = name;
		this.subscriptions = subscriptions;
		this.missionManager = missionManager;
		
		if(xList != null && xList.size() > 0)
			this.x = xList.get(new Random().nextInt(xList.size()));
		if(yList != null && yList.size() > 0)
			this.y = yList.get(new Random().nextInt(yList.size()));
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

	public Dialogue getInitiatorDialogue() {
		
		for(String topicTag : this.subscriptions){
			if(this.missionManager.getTalkMap(topicTag).getDialogue().isInitiator())
				return this.missionManager.getTalkMap(topicTag).getDialogue();
		}
		
		return null;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	public boolean hasLocation() {
		return this.x != null;
	}
	
}
