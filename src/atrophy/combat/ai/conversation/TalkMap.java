package atrophy.combat.ai.conversation;

import java.util.LinkedHashMap;
import java.util.Map;

public class TalkMap {

	private int stage;
	
	private String tag;
	
	private Map<Integer,Dialogue> talkStages;
	
	public TalkMap(String tag){
		this.talkStages = new LinkedHashMap<>();
		this.stage = 0;
		this.tag = tag;
	}
	
	public void addDialogue(int stage, Dialogue dialogue){
		this.talkStages.put(new Integer(stage), dialogue);
	}
	
	public void setToStage(int stage) {
		this.stage = stage;
	}

	public Dialogue getDialogue() {
		return this.talkStages.get(stage);
	}
	
	public Dialogue getDialogue(int stage) {
		return this.talkStages.get(stage);
	}

	public String getTag() {
		return this.tag;
	}
	
}
