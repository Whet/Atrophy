package atrophy.combat.display.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.thinkingAi.ThinkingAi;
import atrophy.combat.display.ui.MessageBox.ChatterBox;
import atrophy.combat.display.ui.MessageBox.Dialogue;
import atrophy.combat.display.ui.MessageBox.SpeechOption;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.mechanics.ScoringMechanics;

public class MessageManager{

	/**
	 * The Constant CONVO_TOPICS.
	 */
	private static final String[] CONVO_TOPICS = {"EXIT","HELLO","BYE"};
	
	/**
	 * The Constant EMOTION_TOPICS.
	 */
	private static final String[] EMOTION_TOPICS = {"INTIMIDATE","PLEA", "INCAP"};
	
	/**
	 * The Constant HELP_TOPICS.
	 */
	private static final String[] HELP_TOPICS = {"SHOW_ENEMIES","STEAL","JOIN"};
	
	/**
	 * The Constant SHOP_TOPICS.
	 */
//	private static final String[] SHOP_TOPICS = {"LIST_ITEM","BUY_ITEM"};
	
	/**
	 * The Constant HITMAN_TOPIC.
	 */
//	private static final String[] HITMAN_TOPIC = {"WHAT_TARGET","CLAIM_BOUNTY"};
	
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
	}

	/**
	 * Trigger topic.
	 *
	 * @param topicNumber the topic number
	 */
	public void triggerTopic(int topicNumber) {
		this.topicAction(topics.get(topicNumber));
	}

	/**
	 * Load topics.
	 *
	 * @param ai1 the ai1
	 * @param ai2 the ai2
	 */
	public void loadTopics(Ai ai1, Ai ai2) {
		resetTopics();
		
		greetingTopic();
		
		intimidated = false;
		
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
		else if(ai2.getFaction().equals("Loner") && ((ThinkingAi) ai2).getAggression() <= ThinkingAi.AGGRESSIVE_FIGHTER){
			tone = 0;
		}
		else{
			tone = 1;
		}
		
		setTopicButtons();
		thinkingAiInitiated = false;
	}
	
	/**
	 * Load dialogue.
	 *
	 * @param dialogue the dialogue
	 * @param currentAi 
	 */
	public void loadDialogue(Dialogue dialogue, Ai currentAi) {
		resetTopics();
		
		intimidated = false;
		this.tone = dialogue.tone;
		
		messageBox.addMessage(messageBox.getConversers()[1].getName() + ": " +dialogue.openingLine);

		// Add long speech setters
		Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();
		while(speechIt.hasNext()){
			String next = speechIt.next();
			
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
		this.topics.add(CONVO_TOPICS[1]);
		this.topics.add(CONVO_TOPICS[0]);
	}
	
	/**
	 * Reload dialogue.
	 */
	private void reloadDialogue(Ai currentAi){
		Dialogue dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getDialogue();
		
		// Add long speech setters
		Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();
		while(speechIt.hasNext()){
			
			String next = speechIt.next();
			
			this.topics.add(next);
		}
		
		for(int i = 0; i < dialogue.options.length; i++){
			this.topics.add(dialogue.options[i]);
		}
		
		setTopicButtons();
	}
	
	/**
	 * Topic action.
	 *
	 * @param topic the topic
	 */
	private void topicAction(String topic) {
		resetTopics();
		
		if(thinkingAiInitiated && dialogueSpeechTopic(topic)){
			reloadDialogue(messageBox.getConversers()[0]);
			return;
		}
		
		if(topicsSpeechTopic(topic)){
			baseTopics();
			return;
		}
		
		messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[0].getName(), topic, tone));
		
		if(!topicReaction(topic)){
			
			if(messageBox.getConversers()[1] != null && ((ThinkingAi) messageBox.getConversers()[1]).getAiNode() != null && ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getDialogue() != null)
				((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getDialogue().longSpeechPoint = 0;
			
			// If ai started the convo then state their turn is ended
			if(thinkingAiInitiated && messageBox.getConversers()[1] != null){
				((ThinkingAi) messageBox.getConversers()[1]).getAiNode().finish(((ThinkingAi) messageBox.getConversers()[1]));
			}
			
			return;
		}
		
		switch(topic){
		
			case "SHOW_ENEMIES":
			case "HELLO":
			case "STEAL":
			case "BUY_ITEM":
			case "LIST_ITEM":
			case "WHAT_TARGET":
			case "CLAIM_BOUNTY":
			case "INTIMIDATE":
			case "INCAP":
			case "JOIN":
				if(thinkingAiInitiated){
					reloadDialogue(messageBox.getConversers()[0]);
					return;
				}
				baseTopics();
			break;
			case "BYE":
			case "EXIT":
				messageBox.setVisible(false);
			return;
		}
		// if no new topics have been set then close
		if(topics.size() == 0){
			messageBox.setVisible(false);
		}
	}

	/**
	 * Dialogue speech topic.
	 *
	 * @param topic the topic
	 * @return true, if successful
	 */
	private boolean dialogueSpeechTopic(String topic) {
		
		if(((ThinkingAi) messageBox.getConversers()[1]).getAiNode() == null ||
		   !((ThinkingAi) messageBox.getConversers()[1]).getAiNode().hasDialogue())
			return false;
		
		Dialogue dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getDialogue();
		
		String speech;
		
		Iterator<String> speechIt = dialogue.longSpeeches.keySet().iterator();
		
		while(speechIt.hasNext()){
			String next = speechIt.next();
			
			if(next.equals(topic)){
				dialogue.setLongSpeech(next);
				speech = dialogue.nextSpeechDialogue();
				messageBox.addMessage(messageBox.getConversers()[1].getName() + ": " + speech);
				return true;
			}
		}
		
		
		return false;
	}
	
	/**
	 * Topics speech topic.
	 *
	 * @param topic the topic
	 * @return true, if successful
	 */
	private boolean topicsSpeechTopic(String topic){
		if(((ThinkingAi) messageBox.getConversers()[1]).getAiNode() == null ||
		   !((ThinkingAi) messageBox.getConversers()[1]).getAiNode().hasTopics())
			return false;
		
		Dialogue dialogue = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getTopics();
		
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
				
				messageBox.addMessage(messageBox.getConversers()[1].getName() + ": " + speech);
				
				return true;
			}
		}
		
		
		return false;
	}

	/**
	 * Topic reaction.
	 *
	 * @param topic the topic
	 * @return true, if successful
	 */
	private boolean topicReaction(String topic) {
		switch(topic){
			case "SHOW_ENEMIES":
				if(tone <= 0 || ((ThinkingAi) messageBox.getConversers()[1]).willJoinPlayer(messageBox.getConversers()[0])){
					ArrayList<LevelBlock> rooms = ((ThinkingAi) messageBox.getConversers()[1]).getTeamObject().getAllRoomsToAvoid();
					
					if(rooms.size() > 0){
						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "ACKNOWLEDGE", tone));
						cartographer.markRooms("People Spotted",Color.red, rooms);
					}
					else{
						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "NO", tone));
					}
				}
				else{
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "NO_TRUST", tone));
				}
				return true;
			
			case "STEAL":
				if(intimidated || messageBox.getConversers()[1].getIncapTurns() > 0){
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "YES", tone));
					messageBox.getConversers()[0].tradeWithAlly(messageBox.getConversers()[1]);
					if(messageBox.getConversers()[1] instanceof ThinkingAi){
						((ThinkingAi) messageBox.getConversers()[1]).waitForTurns(4);
					}
				}
				else{
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "INTIMIDATE_REACTION", 1));
					((ThinkingAi)messageBox.getConversers()[1]).setBlockPlayerConvo(true);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAi.FAILED_INTIMIDATION);
				}
				return true;
				
			case "PURCHASE":
				messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "YES", tone));
				messageBox.getConversers()[0].tradeWithAlly(messageBox.getConversers()[0]);
				return false;
				
			case "INTIMIDATE":
				// works if ai isn't mindless
				// if the initiator isn't visible and a minor check
				// if visible and a big check
				if(((ThinkingAi) messageBox.getConversers()[1]).getAggression() < ThinkingAi.MINDLESS_TERROR && (
				   (!combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) && 
				   ScoringMechanics.weakIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager)) ||
				   (combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) &&
				   ScoringMechanics.strongIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager) ))){
					
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "INTIMIDATE_REACTION", -1));
					tone  = -1;
					intimidated = true;
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAi.SUCCESSFUL_INTIMIDATION);
					
					return true;
				}
				else{
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "INTIMIDATE_REACTION", 1));
					((ThinkingAi)messageBox.getConversers()[1]).setBlockPlayerConvo(true);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAi.FAILED_INTIMIDATION);
					
					return false;
				}

			case "INCAP":
				// works if ai isn't mindless
				// if already intimidated
				// if the initiator isn't visible and a minor check
				// if visible and a big check
				if(((ThinkingAi) messageBox.getConversers()[1]).getAggression() < ThinkingAi.MINDLESS_TERROR &&
				    (intimidated || messageBox.getConversers()[1].getIncapTurns() > 0 ||
				    (!combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) && 
				    ScoringMechanics.weakIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager)) ||
				    (combatVisualManager.isAiInSight(messageBox.getConversers()[0], messageBox.getConversers()[1].getFaction()) &&
				    ScoringMechanics.strongIntimidateCheck(messageBox.getConversers()[0], messageBox.getConversers()[1], combatMembersManager) ))){
					
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "INCAP_REACTION", -1));
					tone  = -1;
					intimidated = true;
					messageBox.getConversers()[1].setIncapTurns(10);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAi.SUCCESSFUL_INTIMIDATION);
					
					return true;
				}
				else{
					resetTopics();
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "INCAP_REACTION", 1));
					((ThinkingAi)messageBox.getConversers()[1]).setBlockPlayerConvo(true);
					((ThinkingAi)messageBox.getConversers()[1]).modifyAggression(ThinkingAi.FAILED_INTIMIDATION);
					
					return false;
				}
			
			case "HELLO":
//				if(messageBox.getConversers()[1] instanceof ShopkeeperAi){
//					if(((ShopkeeperAi) messageBox.getConversers()[1]).getShopType() == 0 && ((ShopkeeperAi) messageBox.getConversers()[1]).isInStock()){
//						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "HELLO_SHOPKEEP", tone));
//					}
//					else if(((ShopkeeperAi) messageBox.getConversers()[1]).getShopType() == 1 && !((HitmanAi) messageBox.getConversers()[1]).isMissionGiven() 
//						     && !(((HitmanAi) messageBox.getConversers()[1]).getHitmanTargetAi() == messageBox.getConversers()[0])){
//						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "HELLO_HITMAN_OFFER_MISSION", tone));
//					}
//					else if(((ShopkeeperAi) messageBox.getConversers()[1]).getShopType() == 1 && ((HitmanAi) messageBox.getConversers()[1]).isMissionGiven() && ((ShopkeeperAi) messageBox.getConversers()[1]).isInStock()){
//						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "HELLO_HITMAN_GIVEN", tone));
//					}
//				}
//				else{
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), topic, tone));
//				}
				
				return true;

			case "BYE":
				messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), topic, tone));
				
				return false;
				
			case "EXIT":
				return false;
				
			case "BUY_ITEM":
//				if(!messageBox.getConversers()[0].getInventory().isFull()){
//					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "BUY_ITEM_REACTION", 1));
//					((ShopkeeperAi) messageBox.getConversers()[1]).giveItem(messageBox.getConversers()[0]);
//				}
//				else if(messageBox.getConversers()[0].getInventory().isFull()){
//					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "BUY_ITEM_REACTION", 0));
//				}
//				else{
//					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "BUY_ITEM_REACTION", -1));
//				}
				return true;
				
			case "LIST_ITEM":
//				if(((ShopkeeperAi) messageBox.getConversers()[1]).isInStock()){
//					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "LIST_ITEM_REACTION", ((ShopkeeperAi) messageBox.getConversers()[1]).getItemName(), 1));
//				}
//				else{
//					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "LIST_ITEM_REACTION", -1));
//				}
				return true;
				
			case "WHAT_TARGET":
//				messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "WHAT_TARGET_REACTION",
//								   ((HitmanAi) messageBox.getConversers()[1]).getHitmanTargetAi().getName() + " they're with the " + ((HitmanAi) messageBox.getConversers()[1]).getHitmanTargetAi().getFaction(), 1));
//				((HitmanAi) messageBox.getConversers()[1]).giveMission();
				return true;
				
			case "CLAIM_BOUNTY":
//				if(((HitmanAi) messageBox.getConversers()[1]).getHitmanTargetAi().isDead()){
//					if(!messageBox.getConversers()[0].getInventory().isFull()){
//						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "CLAIM_BOUNTY_REACTION", 1));
//						((HitmanAi) messageBox.getConversers()[1]).giveItem(messageBox.getConversers()[0]);
//					}
//					else{
//						messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "CLAIM_BOUNTY_REACTION", 0));
//					}
//				}
//				else{
//					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "CLAIM_BOUNTY_REACTION", -1));
//				}
				return true;
				
			case "JOIN":
				if(messageBox.getConversers()[0].getTargetAi() != messageBox.getConversers()[1] &&
				   messageBox.getConversers()[1].getTargetAi() != messageBox.getConversers()[0] &&
				   ((ThinkingAi) messageBox.getConversers()[1]).willJoinPlayer(messageBox.getConversers()[0])){
					
					messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "JOIN_REACTION", -1));
					combatMembersManager.changeThinkingAiToPlayerAi((ThinkingAi) messageBox.getConversers()[1]);
					return false;
				}

				messageBox.addMessage(ChatterBox.message(messageBox.getConversers()[1].getName(), "JOIN_REACTION", 1));
				return true;
				
			case "GIVE_ITEMS":
				((ThinkingAi) messageBox.getConversers()[1]).respondToMessage("GIVE_ITEMS",messageBox.getConversers()[0]);
			return false;
			
			case "ATTACK":
				((ThinkingAi) messageBox.getConversers()[1]).respondToMessage("ATTACK",messageBox.getConversers()[0]);
			return false;

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
			
			Dialogue topics = ((ThinkingAi) messageBox.getConversers()[1]).getAiNode().getTopics();
			
			// Add long speech setters
			Iterator<String> speechIt = topics.longSpeeches.keySet().iterator();
			while(speechIt.hasNext()){
				String next = speechIt.next();
				
				if(topics.requirementsMet(topics.longSpeeches.get(next)[1], messageBox.getConversers()[0]))
					this.topics.add(next);
			}
		}
		
		// team members
		if(tone == -2){
			this.topics.add(CONVO_TOPICS[2]);
			setTopicButtons();
		}
		// neutral
		else if(tone <= 0){
			this.topics.add(HELP_TOPICS[0]);
			this.topics.add(HELP_TOPICS[1]);
			if(!intimidated){
				this.topics.add(EMOTION_TOPICS[0]);
				this.topics.add(HELP_TOPICS[2]);
			}
			if((!messageBox.getConversers()[0].getWeapon().isMelee() ||
              (messageBox.getConversers()[0].getWeapon().isMelee() &&
               messageBox.getConversers()[0].getWeapon().isInRange(messageBox.getConversers()[0], messageBox.getConversers()[1])) ) ){
			this.topics.add(EMOTION_TOPICS[2]);
			}
//			if(messageBox.getConversers()[1] instanceof ShopkeeperAi && ((ShopkeeperAi) messageBox.getConversers()[1]).getShopType() == 0 && ((ShopkeeperAi) messageBox.getConversers()[1]).isInStock()){
//				this.topics.add(SHOP_TOPICS[0]);
//				this.topics.add(SHOP_TOPICS[1]);
//			}
//			if(messageBox.getConversers()[1] instanceof ShopkeeperAi && ((ShopkeeperAi) messageBox.getConversers()[1]).getShopType() == 1 &&
//			  ((HitmanAi) messageBox.getConversers()[1]).getHitmanTargetAi() != messageBox.getConversers()[0] && ((ShopkeeperAi) messageBox.getConversers()[1]).isInStock() &&
//			  (((HitmanAi) messageBox.getConversers()[1]).isMissionGiven() || !((HitmanAi) messageBox.getConversers()[1]).getHitmanTargetAi().isDead())){
//				
//				if(((HitmanAi) messageBox.getConversers()[1]).isMissionGiven()){
//					this.topics.add(HITMAN_TOPIC[1]);
//				}
//				else{
//					this.topics.add(HITMAN_TOPIC[0]);
//				}
//			}
			this.topics.add(CONVO_TOPICS[2]);
			setTopicButtons();
		}
		// enemy
		else if(tone > 0){
			this.topics.add(HELP_TOPICS[0]);
			this.topics.add(HELP_TOPICS[1]);
			if(!intimidated){
				this.topics.add(EMOTION_TOPICS[0]);
			}
			if((!messageBox.getConversers()[0].getWeapon().isMelee() ||
	                  (messageBox.getConversers()[0].getWeapon().isMelee() &&
	                   messageBox.getConversers()[0].getWeapon().isInRange(messageBox.getConversers()[0], messageBox.getConversers()[1])) ) ){
				this.topics.add(EMOTION_TOPICS[2]);
			}
			this.topics.add(CONVO_TOPICS[2]);
			setTopicButtons();
		}
		
	}
}
