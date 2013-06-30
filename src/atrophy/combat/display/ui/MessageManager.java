package atrophy.combat.display.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.ai.ThinkingAiEmotion;
import atrophy.combat.ai.conversation.ChatterBox;
import atrophy.combat.ai.conversation.Dialogue;
import atrophy.combat.ai.conversation.Topic;
import atrophy.combat.display.ui.MessageBox.SpeechOption;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.mechanics.Abilities;
import atrophy.combat.mechanics.ScoringMechanics;

public class MessageManager{

	public static final String TOPIC_EXIT = "Close";
	public static final String TOPIC_HELLO = "Hello";
	public static final String TOPIC_BYE = "Bye";
	public static final String TOPIC_INTIMIDATE = "Intimidate";
	public static final String TOPIC_INCAP = "Incapacitate";
	public static final String TOPIC_SHOW_ENEMIES = "Enemy Locations";
	public static final String TOPIC_STEAL = "Steal";
	public static final String TOPIC_JOIN = "Recruit";
	
	public static final String INV_KILLER = "Identify Killer";
	public static final String INV_WEAPON = "Cause of Death";
	public static final String INV_ROOM = "Identify Location";
	public static final String INV_TOD = "Time of Death";
	
	private Map<String, Topic> nameToTopic = new HashMap<>();;
	
	/**
	 * The topics.
	 */
	private ArrayList<String> topics;
	
	/**
	 * The tone.
	 */
	private int tone;
	
	/**
	 * The intimidated.
	 */
	private boolean intimidated;
	
	/**
	 * The thinking ai initiated.
	 */
	private boolean thinkingAiInitiated;

	private MessageBox messageBox;
	private CombatMembersManager combatMembersManager;
	private Cartographer cartographer;
	private CombatVisualManager combatVisualManager;
	
	/**
	 * Instantiates a new message manager.
	 */
	public MessageManager(MessageBox messageBox, CombatMembersManager combatMembersManager, CombatVisualManager combatVisualManager, Cartographer cartographer){
		this.messageBox = messageBox;
		this.combatMembersManager = combatMembersManager;
		this.cartographer = cartographer;
		this.combatVisualManager = combatVisualManager;
		topics = new ArrayList<String>(9);
		intimidated = false;
		
		initMap();
	}
	
	private void initMap(){
		nameToTopic.put(TOPIC_INTIMIDATE, Topic.INTIMIDATE);
		nameToTopic.put(TOPIC_INCAP, Topic.INCAP);
		nameToTopic.put(TOPIC_JOIN, Topic.JOIN);
		nameToTopic.put(TOPIC_STEAL, Topic.STEAL);
		nameToTopic.put(TOPIC_SHOW_ENEMIES, Topic.SHOW_ENEMIES);
		nameToTopic.put(TOPIC_HELLO, Topic.HELLO);
		nameToTopic.put(TOPIC_BYE, Topic.BYE);
		nameToTopic.put(TOPIC_EXIT, Topic.EXIT);
		nameToTopic.put("Attack", Topic.ATTACK);
		nameToTopic.put("Pay", Topic.PAY);
		nameToTopic.put("Trade", Topic.TRADE);
		nameToTopic.put("Give Items", Topic.GIVE_ITEMS);
	}

	/**
	 * Trigger topic.
	 *
	 * @param topicNumber the topic number
	 */
	public void triggerTopic(int topicNumber) {
		String topicString = topics.get(topicNumber);
		Topic topic = nameToTopic.get(topicString);
		
		if(topic == null)
			this.topicAction(topicString);
		else	
			this.topicAction(topic);
	}

	/**
	 * Load topics.
	 *
	 * @param ai1 the ai1
	 * @param ai2 the ai2
	 */
	public void loadTopics(Ai ai1, Ai ai2) {
		resetTopics();
		
		if(ai2.isDead()) {
			setInvestigationButtons();
			thinkingAiInitiated = false;
			return;
		}
		
		greetingTopic();
		
		intimidated = ai2.getStunnedTurns() > 0;
		
		if(ai1.getFaction().equals(ai2.getFaction())){
			tone = -2;
		}
		else if(combatMembersManager.factionsAllied(ai1.getFaction(),ai2.getFaction())){
			tone = -1;
		}
		else if(messageBox.getConversers()[1].getIncapTurns() > 0){
			intimidated = true;
			tone = -1;
		}
		else if(ai2.getFaction().equals("Loner") && ((ThinkingAi) ai2).getAggression() <= ThinkingAiEmotion.AGGRESSIVE_FIGHTER){
			tone = 0;
		}
		else{
			tone = 1;
		}
		
		setTopicButtons();
		thinkingAiInitiated = false;
	}
	
	private void setInvestigationButtons() {
		this.topics.add(INV_KILLER);
		this.topics.add(INV_ROOM);
		this.topics.add(INV_TOD);
		this.topics.add(INV_WEAPON);
		this.topics.add(TOPIC_EXIT);
		setTopicButtons();
	}
	
	private void investigationReply(String topic) {
		switch(topic) {
			case INV_KILLER:
				messageBox.addMessage(messageBox.getConversers()[1].getDeathReport().getKillerInformation(messageBox.getConversers()[0].getSkillLevel(Abilities.INVESTIGATE)));
			break;
			case INV_ROOM:
				messageBox.addMessage(messageBox.getConversers()[1].getDeathReport().getRoomInformation(messageBox.getConversers()[0].getSkillLevel(Abilities.INVESTIGATE)));
			break;
			case INV_TOD:
				messageBox.addMessage(messageBox.getConversers()[1].getDeathReport().getTODInformation(messageBox.getConversers()[0].getSkillLevel(Abilities.INVESTIGATE)));
			break;
			case INV_WEAPON:
				messageBox.addMessage(messageBox.getConversers()[1].getDeathReport().getWeaponInformation(messageBox.getConversers()[0].getSkillLevel(Abilities.INVESTIGATE)));
			break;
		}
	}

	/**
	 * Load dialogue.
	 *
	 * @param dialogue the dialogue
	 */
	public void loadDialogue(Dialogue dialogue) {
		resetTopics();
		
		intimidated = false;
		this.tone = 0;
		
		messageBox.addMessage(messageBox.getConversers()[1].getName() + ": " +dialogue.openingLine);

		// Add long speech setters
		Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();
		while(speechIt.hasNext()){
			String next = speechIt.next();
			
			if(dialogue.requirementsMet(dialogue.longSpeeches.get(next)[1], messageBox.getConversers()[0]))
				this.topics.add(next);
		}
		
		for(int i = 0; i < dialogue.options.length; i++){
			this.topics.add(dialogue.options[i]);
		}
		
		setTopicButtons();
		thinkingAiInitiated = true;
	}

	/**
	 * Sets the topic buttons.
	 */
	private void setTopicButtons() {
		for(String topic : this.topics){
			messageBox.addTextOption(topic);
		}
	}
	
	/**
	 * Reset topics.
	 */
	public void resetTopics(){
		this.topics.clear();
		for(SpeechOption text : messageBox.textOptions){
			text.setText("");
			text.setActive(false);
		}
	}

	/**
	 * Greeting topic.
	 */
	private void greetingTopic() {
		this.topics.add(TOPIC_HELLO);
		this.topics.add(TOPIC_EXIT);
	}

	private void topicAction(String topic){
		if(thinkingAiInitiated){
			playerResponseAction(topic);
		}
		else if(messageBox.getConversers()[1].isDead()) {
			investigationReply(topic);
//			setInvestigationButtons();
		}
		else{	
			longSpeechAction(topic);
			baseTopics();
		}
	}
	
	private void playerResponseAction(String topic){
		resetTopics();
		
		String speech;

		Dialogue dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getInitiatorDialogue();
		
		Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();

		while(speechIt.hasNext()){
			String next = speechIt.next();

			if(next.equals(topic)){
				dialogue.setLongSpeech(next);
				speech = dialogue.nextSpeechDialogue();

				// if the next speech text is a trigger then skip to next speech segment until text is reached
				while(dialogue.checkTriggers(speech, messageBox)){
					speech = dialogue.nextSpeechDialogue();
				}

				messageBox.addMessage(messageBox.getConversers()[1].getName() + ": " + speech);

				break;
			}
		}
		
		// Update dialogue in case stage changes
		if(dialogue != ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getInitiatorDialogue()) {
			// Reset longspeechpoints if dialogue changes
			dialogue.longSpeechPoint = 0;
			((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getInitiatorDialogue().longSpeechPoint = 0;
		}
		
		dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getInitiatorDialogue();
		
		// Add long speech setters and dialogue topics
		speechIt = dialogue.longSpeeches.keySet().iterator();
		while(speechIt.hasNext()){
			String next = speechIt.next();
			
			if(dialogue.requirementsMet(dialogue.longSpeeches.get(next)[1], messageBox.getConversers()[0]))
				this.topics.add(next);
		}
		
		for(String textOption : dialogue.options){
			this.topics.add(textOption);
		}
		
		setTopicButtons();
	}
	
	private void longSpeechAction(String topic){

		resetTopics();
		
		Dialogue dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getTopic();

		String speech;

		Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();

		while(speechIt.hasNext()){
			String next = speechIt.next();

			if(next.equals(topic)){
				dialogue.setLongSpeech(next);
				speech = dialogue.nextSpeechDialogue();

				// if the next speech text is a trigger then skip to next speech segment until text is reached
				while(dialogue.checkTriggers(speech, messageBox)){
					speech = dialogue.nextSpeechDialogue();
				}
				
				// Update dialogue in case stage changes
				if(dialogue != ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getTopic()) {
					// Reset longspeechpoints if dialogue changes
					dialogue.longSpeechPoint = 0;
					((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getTopic().longSpeechPoint = 0;
				}
				
				dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getTopic();

				messageBox.addMessage(messageBox.getConversers()[1].getName() + ": " + speech);

				return;
			}
		}
	}
	
	/**
	 * Topic action.
	 *
	 * @param topic the topic
	 */
	private void topicAction(Topic topic) {
		resetTopics();
		
		messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[0].getName(), topic, tone));
		
		if(!topicReaction(topic)){
			
//			if(messageBox.getConversers()[1] != null && ((ThinkingAi) messageBox.getConversers()[1]).getAiNode() != null &&
//			  ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().hasDialogue())
//				((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getDialogue().longSpeechPoint = 0;
			
			// If ai started the convo then state their turn is ended
			if(thinkingAiInitiated && messageBox.getConversers()[1] != null){
				((ThinkingAi) messageBox.getConversers()[1]).finish();
//				messageBox.setVisible(false);
			}
			
			return;
		}
		
		switch(topic){
		
			case BYE:
			case EXIT:
				messageBox.setVisible(false);
			return;
			default:
				if(thinkingAiInitiated){
					reloadDialogue();
					return;
				}
				baseTopics();
		}
		// if no new topics have been set then close
		if(topics.size() == 0){
			messageBox.setVisible(false);
		}
	}
	
	private void reloadDialogue(){
		Dialogue dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getInitiatorDialogue();

		// Add long speech setters
		Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();
		while(speechIt.hasNext()){

			String next = speechIt.next();

			// TODO
			if(dialogue.requirementsMet(dialogue.longSpeeches.get(next)[1], messageBox.getConversers()[0]))
				this.topics.add(next);
		}

		for(int i = 0; i < dialogue.options.length; i++){
			this.topics.add(dialogue.options[i]);
		}

		setTopicButtons();
	}
	
	/**
	 * Topic reaction.
	 *
	 * @param topic the topic
	 * @return true, if successful
	 */
	private boolean topicReaction(Topic topic) {
		switch(topic){
			case SHOW_ENEMIES:
				if(tone <= 0 || ((ThinkingAi) messageBox.getConversers()[1]).willJoinPlayer(messageBox.getConversers()[0])){
					List<LevelBlock> rooms = ((ThinkingAi) messageBox.getConversers()[1]).getCommander().getDangerRooms(1);
					
					if(rooms.size() > 0){
						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.ACKNOWLEDGE, tone));
						cartographer.markRooms("People Spotted",Color.red, rooms);
					}
					else{
						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.NO, tone));
					}
				}
				else{
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.NO_TRUST, tone));
				}
				return true;
			
			case STEAL:
				if(intimidated || messageBox.getConversers()[1].getIncapTurns() > 0){
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.YES, tone));
					messageBox.getConversers()[0].tradeWithAlly(messageBox.getConversers()[1]);
					if(messageBox.getConversers()[1] instanceof ThinkingAi){
						((ThinkingAi) messageBox.getConversers()[1]).waitForTurns(4);
					}
				}
				else{
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.INCAP_REACTION, 1));
					((ThinkingAi)messageBox.getConversers()[1]).setBlockPlayerConvo(true);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAiEmotion.FAILED_INTIMIDATION);
				}
				return true;
				
			case INTIMIDATE:
				// works if ai isn't mindless
				// if the initiator isn't visible and a minor check
				// if visible and a big check
				if(((ThinkingAi) messageBox.getConversers()[1]).getAggression() < ThinkingAiEmotion.MINDLESS_TERROR && (
				   (!combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) && 
				   ScoringMechanics.weakIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager)) ||
				   (combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) &&
				   ScoringMechanics.strongIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager) ))){
					
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.INCAP_REACTION, -1));
					tone  = -1;
					intimidated = true;
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAiEmotion.SUCCESSFUL_INTIMIDATION);
					
					return true;
				}
				else{
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.INTIMIDATE_REACTION, 1));
					((ThinkingAi)messageBox.getConversers()[1]).setBlockPlayerConvo(true);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAiEmotion.FAILED_INTIMIDATION);
					
					return false;
				}

			case INCAP:
				// works if ai isn't mindless
				// if already intimidated
				// if the initiator isn't visible and a minor check
				// if visible and a big check
				if(((ThinkingAi) messageBox.getConversers()[1]).getAggression() < ThinkingAiEmotion.MINDLESS_TERROR &&
				    (intimidated || messageBox.getConversers()[1].getIncapTurns() > 0 ||
				    (!combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) && 
				    ScoringMechanics.weakIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager)) ||
				    (combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) &&
				    ScoringMechanics.strongIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager) ))){
					
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.INCAP_REACTION, -1));
					tone  = -1;
					intimidated = true;
					messageBox.getConversers()[1].setIncapTurns(10);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAiEmotion.SUCCESSFUL_INTIMIDATION);
					
					return true;
				}
				else{
					resetTopics();
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.INCAP_REACTION, 1));
					((ThinkingAi)messageBox.getConversers()[1]).setBlockPlayerConvo(true);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAiEmotion.FAILED_INTIMIDATION);
					
					return false;
				}
			
			case HELLO:
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), topic, tone));
				
				return true;

			case BYE:
				messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), topic, tone));
				
				return false;
				
			case EXIT:
				return false;
				
			case JOIN:
				if(messageBox.getConversers()[0].getTargetAi() != messageBox.getConversers()[1] &&
				   messageBox.getConversers()[1].getTargetAi() != messageBox.getConversers()[0] &&
				   ((ThinkingAi) messageBox.getConversers()[1]).willJoinPlayer(messageBox.getConversers()[0])){
					
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.JOIN_REACTION, -1));
					combatMembersManager.changeThinkingAiToPlayerAi((ThinkingAi) messageBox.getConversers()[1]);
					return false;
				}

				messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), Topic.JOIN_REACTION, 1));
				return true;
				
			case GIVE_ITEMS:
				((ThinkingAi) messageBox.getConversers()[1]).respondToMessage(Topic.GIVE_ITEMS,messageBox.getConversers()[0]);
			return false;
			
			case ATTACK:
				((ThinkingAi) messageBox.getConversers()[1]).respondToMessage(Topic.ATTACK,messageBox.getConversers()[0]);
			return false;
			case ACKNOWLEDGE:
			break;
			case INCAP_REACTION:
			break;
			case INTIMIDATE_REACTION:
			break;
			case JOIN_REACTION:
			break;
			case NO:
			break;
			case NO_TRUST:
			break;
			case PAY:
			break;
			case TRADE:
			break;
			case YES:
			break;
			default:
			break;

		}
		
		return true;
	}

	/**
	 * Base topics.
	 */
	private void baseTopics() {
		// node topics
		if(((ThinkingAi) messageBox.getConversers()[1]).getAiNode() != null &&
		   ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().hasTopics()){
			
			Dialogue dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getTopic();
			
			if(dialogue != null){
				// Add long speech setters
				Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();
				while(speechIt.hasNext()){
					String next = speechIt.next();
					
					if(dialogue.requirementsMet(dialogue.longSpeeches.get(next)[1], messageBox.getConversers()[0]))
						this.topics.add(next);
				}
			}
		}
		
		if(tone <= 0){
			this.topics.add(TOPIC_SHOW_ENEMIES);
			if(!intimidated){
				this.topics.add(TOPIC_INTIMIDATE);
				this.topics.add(TOPIC_JOIN);
			}
			this.topics.add(TOPIC_STEAL);
			if((!messageBox.getConversers()[0].getWeapon().isMelee() ||
              (messageBox.getConversers()[0].getWeapon().isMelee() &&
               messageBox.getConversers()[0].getWeapon().isInRange(messageBox.getConversers()[0], messageBox.getConversers()[1])) ) ){
			this.topics.add(TOPIC_INCAP);
			}
			this.topics.add(TOPIC_BYE);
			setTopicButtons();
		}
		// enemy
		else if(tone > 0){
			this.topics.add(TOPIC_SHOW_ENEMIES);
			if(!intimidated){
				this.topics.add(TOPIC_INTIMIDATE);
				this.topics.add(TOPIC_JOIN);
			}
			this.topics.add(TOPIC_STEAL);
			if((!messageBox.getConversers()[0].getWeapon().isMelee() ||
	                  (messageBox.getConversers()[0].getWeapon().isMelee() &&
	                   messageBox.getConversers()[0].getWeapon().isInRange(messageBox.getConversers()[0], messageBox.getConversers()[1])) ) ){
				this.topics.add(TOPIC_INCAP);
			}
			this.topics.add(TOPIC_BYE);
			setTopicButtons();
		}
		
	}
}
