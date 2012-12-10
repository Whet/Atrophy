/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.actions.ActionRegion;
import watoydoEngine.designObjects.display.BankedImage;
import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.fonts.FontList;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.io.ReadWriter;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.items.Item;
import atrophy.combat.items.Weapon;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.combat.missions.MissionManager;
import atrophy.gameMenu.saveFile.Missions;

/**
 * The Class MessageBox.
 */
public class MessageBox extends Crowd{
	
	/**
	 * The Constant MAX_DISPLAYED_MESSAGES.
	 */
	private static final int MAX_DISPLAYED_MESSAGES = 16;

	/**
	 * The Constant MAX_STORED_MESSAGES.
	 */
	private static final int MAX_STORED_MESSAGES = 100;
	
	/**
	 * The Constant MAX_OPTIONS.
	 */
	private static final int MAX_OPTIONS = 18;
	
	
	/**
	 * The selected turn.
	 */
	private int selectedTurn;
	
	/**
	 * The message board.
	 */
	private Text messageBoard;
	
	/**
	 * The conversers text.
	 */
	private Text conversersText;
	
	/**
	 * The conversers.
	 */
	private Ai[] conversers;
	
	/**
	 * The text options.
	 */
	public SpeechOption[] textOptions;
	
	/**
	 * The drag location.
	 */
	private int[] dragLocation;
	
	/**
	 * The size.
	 */
	private double[] size;
	
	/**
	 * The messages.
	 */
	private Queue<Message> messages;
	
	/**
	 * The message manager.
	 */
	private MessageManager messageManager;

	/**
	 * The least message.
	 */
	private int leastMessage;
	
	/**
	 * The navigation buttons.
	 */
	private ButtonSingle[] navigationButtons;
	
	/**
	 * The mouse drag region.
	 */
	private ActionRegion mouseDragRegion;
	private CombatUiManager combatUiManager;
	private TurnProcess turnProcess;
	private Cartographer cartographer;
	
	/**
	 * Instantiates a new message box.
	 */
	public MessageBox(CombatUiManager combatUiManager, TurnProcess turnProcess, CombatMembersManager combatMembersManager, CombatVisualManager combatVisualManager, Cartographer cartographer){
		
		super(false);
		
		this.combatUiManager = combatUiManager;
		this.turnProcess = turnProcess;
		this.cartographer = cartographer;
		
		messages = new LinkedList<Message>();
		
		this.setLocation(30, 120);
		
		messageBoard = new Text();
		messageBoard.setFont(FontList.AUD14);
		messageBoard.setLocation(this.getLocation().clone());
		messageBoard.move(30, 48);
		this.addDisplayItem(messageBoard);
		
		selectedTurn = 0;
		this.size = new double[2];
		this.size[0] = 780;
		this.size[1] = 340;
		
		loadButtons();
		
		conversers = new Ai[2];
		
		conversersText = new Text();
		conversersText.setFont(FontList.AUD14);
		conversersText.setLocation(this.getLocation().clone());
		conversersText.setColour(Color.yellow.darker());
		conversersText.move(30, 28);
		this.addDisplayItem(conversersText);
		
		leastMessage = 0;
		
		textOptions = new SpeechOption[MAX_OPTIONS];
		
		for(int i = 0; i < MAX_OPTIONS; i++){
			textOptions[i] = new SpeechOption(this,i);
			textOptions[i].setLocation(this.getLocation().clone());
			textOptions[i].move(640, 48 + i * 18);
			this.addDisplayItem(textOptions[i]);
			this.addMouseActionItem(textOptions[i]);
		}
		
		mouseDragRegion = new ActionRegion(this.getLocation()[0], this.getLocation()[1], size[0], size[1]) {
			
			private boolean mouseDown = false;
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				mouseDown = true;
				dragLocation = new int[]{e.getPoint().x - (int)this.getLocation()[0], e.getPoint().y - (int)this.getLocation()[1]};
				for(int i = 0; i < textOptions.length; i++){
					textOptions[i].setVisible(false);
				}
				for(int i = 0; i < navigationButtons.length; i++){
					navigationButtons[i].setVisible(false);
				}
				MessageBox.this.messageBoard.setVisible(false);
				MessageBox.this.conversersText.setVisible(false);
				return true;
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				mouseDown = false;
				updateLocations();
				return true;
			}
			
			@Override
			public void mI(Point mousePosition) {
				if(mouseDown){
					MessageBox.this.setLocation(mousePosition.x - dragLocation[0], mousePosition.y - dragLocation[1]);
					this.setLocation(mousePosition.x - dragLocation[0], mousePosition.y - dragLocation[1]);
				}
			}
			
			@Override
			public void mO(Point mousePosition) {
				if(mouseDown){
					mouseDown = false;
					updateLocations();
				}
			}
		};
		this.addMouseActionItem(mouseDragRegion);
		mouseDragRegion.setActive(false);
		
		messageManager = new MessageManager(this, combatMembersManager, combatVisualManager, cartographer);
		computeZOrder();
	}

	/**
	 * Load buttons.
	 */
	private void loadButtons() {
		
		try{
			// load banked images
			String[] files = {"images/atrophy/combat/ui/uiTop.png",
						      "images/atrophy/combat/ui/uiUp.png",
							  "images/atrophy/combat/ui/uiDown.png",
							  "images/atrophy/combat/ui/uiBottom.png",
							  };
			BufferedImage img;
			
			String[] names = {"TOP","UP","DOWN","BOTTOM",};
		
			// Add all items to the image bank
			for(int i = 0; i < files.length; i++){
				img = ImageIO.read(ReadWriter.getResourceAsInputStream(files[i]));
				this.addBankedImage(new BankedImage(names[i],img));
			}
		}
		catch(IOException ioexcept){
			System.err.println("Couldn't load ui icons");
			System.exit(-1);
		}
		
		navigationButtons = new ButtonSingle[4];
		
		navigationButtons[0] =  new ButtonSingle(this.getBankedImage("TOP")) {
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				MessageBox.this.oldestMessage();
				return true;
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				return true;
			}
		};
		navigationButtons[1] = new ButtonSingle(this.getBankedImage("UP")) {
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				MessageBox.this.decrementLeastMessage();
				return true;
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				return true;
			}
		};
		navigationButtons[2] = new ButtonSingle(this.getBankedImage("DOWN")) {
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				MessageBox.this.incrementLeastMessage();
				return true;
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				return true;
			}
		};
		navigationButtons[3] = new ButtonSingle(this.getBankedImage("BOTTOM")) {
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				MessageBox.this.latestMessage();
				return true;
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				return true;
			}
		};
		
		for(int i = 0; i < navigationButtons.length; i++){
			this.addButton(navigationButtons[i]);
			navigationButtons[i].setLocation(this.getLocation()[0] + this.getSize()[0]  - 40, this.getLocation()[1] + 140 + i * 40);
			navigationButtons[i].setActionZ(-1);
		}
	}

	/**
	 * Adds the text option.
	 *
	 * @param topic the topic
	 */
	public void addTextOption(String topic) {
		for(SpeechOption option : this.textOptions){
			if(option.getText().equals("")){
				option.setText(topic);
				option.setActive(true);
				option.setActionZ(-1);
				return;
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape) {
		drawBackdrop(drawShape);
		super.drawMethod(drawShape);
	}

	/**
	 * Draw backdrop.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawBackdrop(Graphics2D drawShape) {
		drawShape.setColor(Color.black);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.8f));
		drawShape.fillRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    (int)this.size[0], 
							    (int)this.size[1],
							    14,14);
		drawShape.setColor(Color.gray);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.drawRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    (int)this.size[0], 
							    (int)this.size[1],
							    14,14);
		drawShape.drawRect((int)this.getLocation()[0] + 6,
						   (int)this.getLocation()[1] + 6, 
						   (int)this.size[0] - 12, 
						   (int)this.size[1] - 12);
	}

	/**
	 * Update locations.
	 */
	private void updateLocations(){
		
		for(int i = 0; i < textOptions.length; i++){
			textOptions[i].setLocation(this.getLocation()[0] + 570, this.getLocation()[1] + 48 + i * 18);
			textOptions[i].setVisible(true);
		}
		
		MessageBox.this.messageBoard.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 48);
		MessageBox.this.conversersText.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 28);
		
		for(int i = 0; i < navigationButtons.length; i++){
			navigationButtons[i].setLocation(this.getLocation()[0] + MessageBox.this.getSize()[0]  - 40, this.getLocation()[1] + 140 + i * 40);
			navigationButtons[i].setVisible(true);
		}
		
		MessageBox.this.messageBoard.setVisible(true);
		MessageBox.this.conversersText.setVisible(true);
	}
	
	/**
	 * Toggle lock.
	 */
	public void toggleLock(){
		this.mouseDragRegion.setActive(!this.mouseDragRegion.isActive());
		this.updateLocations();
		
		if(this.mouseDragRegion.isActive()){
			combatUiManager.getLargeEventText().flashText("Ui Unlocked", Color.yellow.darker());
		}
		else{
			combatUiManager.getLargeEventText().flashText("Ui Locked", Color.yellow.darker());
		}
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if(!visible){
			this.conversersText.setText("");
			this.conversers[0] = null;
			this.conversers[1] = null;
			this.messageManager.resetTopics();
		}
	}

	/**
	 * Adds the message.
	 *
	 * @param message the message
	 */
	public void addMessage(String message){
		
		if(!message.equals("")){
			messages.add(new Message(turnProcess.getTurnCount(), message));
			
			if(this.messages.size() > MAX_STORED_MESSAGES){
				this.messages.remove();
			}
			
			topMessage();
			
			updateMessages();
		}
	}
	
	/**
	 * Update messages.
	 */
	public void updateMessages(){
		this.messageBoard.setText("");
		
		Iterator<Message> messageIt =  this.messages.iterator();
		
		for(int i = 0; i < leastMessage; i++){
			if(messageIt.hasNext()){
				messageIt.next();
			}
			else{
				return;
			}
		}
		
		for(int i = 0; i < MAX_DISPLAYED_MESSAGES; i++){
			if(messageIt.hasNext()){
				Message message =  messageIt.next();
				this.messageBoard.appendText(message.timeDifference() + ": " + message.getMessage() + "@n");
			}
			else{
				return;
			}
		}
	}
	
	/**
	 * Increment least message.
	 */
	public void incrementLeastMessage(){
		if(this.messages.size() > MAX_DISPLAYED_MESSAGES + leastMessage){
			leastMessage++;
			this.updateMessages();
			
			if(this.leastMessage < this.messages.size() - MAX_DISPLAYED_MESSAGES){
				this.messageBoard.setColour(Color.yellow);
			}
			else{
				this.messageBoard.setColour(Color.white);
			}
		}
	}
	
	/**
	 * Decrement least message.
	 */
	public void decrementLeastMessage(){
		if(leastMessage > 0){
			leastMessage--;
			this.updateMessages();
			
			this.messageBoard.setColour(Color.yellow);
		}
	}
	
	/**
	 * Top message.
	 */
	private void topMessage(){
		this.leastMessage = this.messages.size() - MAX_DISPLAYED_MESSAGES;
		this.messageBoard.setColour(Color.white);
	}
	
	/**
	 * Bottom message.
	 */
	private void bottomMessage(){
		this.leastMessage = 0;
		this.messageBoard.setColour(Color.yellow);
	}
	
	/**
	 * Latest message.
	 */
	public void latestMessage(){
		topMessage();
		this.updateMessages();
	}
	
	/**
	 * Oldest message.
	 */
	public void oldestMessage(){
		bottomMessage();
		this.updateMessages();
	}
	
	/**
	 * Gets the selected turn.
	 *
	 * @return the selected turn
	 */
	public int getSelectedTurn() {
		return selectedTurn;
	}

	/**
	 * Sets the selected turn.
	 *
	 * @param selectedTurn the new selected turn
	 */
	public void setSelectedTurn(int selectedTurn) {
		this.selectedTurn = selectedTurn;
	}
	
	/**
	 * The Class Message.
	 */
	private class Message{
		
		/**
		 * The turn.
		 */
		private int turn;
		
		/**
		 * The message.
		 */
		private String message;
		
		/**
		 * Instantiates a new message.
		 *
		 * @param turn the turn
		 * @param message the message
		 */
		public Message(int turn, String message){
			this.turn = turn;
			this.message = message;
		}

		/**
		 * Time difference.
		 *
		 * @return the string
		 */
		public String timeDifference() {
			return Integer.toString(turnProcess.getTurnCount() - this.turn);
		}

		/**
		 * Gets the message.
		 *
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}
	}
	
	/**
	 * Sets the conversation.
	 *
	 * @param currentAi the current ai
	 * @param speechAi the speech ai
	 */
	public void setConversation(Ai currentAi, Ai speechAi) {
		conversers[0] = currentAi;
		conversers[1] = speechAi;
		this.conversersText.setText(currentAi.getName() + " speaking to " + conversers[1].getName());
		messageManager.loadTopics(currentAi, speechAi);
	}
	
	/**
	 * Sets the conversation.
	 *
	 * @param currentAi the current ai
	 * @param speechAi the speech ai
	 * @param dialogue the dialogue
	 */
	public void setConversation(Ai currentAi, Ai speechAi, Dialogue dialogue) {
		conversers[0] = currentAi;
		conversers[1] = speechAi;
		this.conversersText.setText(currentAi.getName() + " speaking to " + conversers[1].getName());
		messageManager.loadDialogue(dialogue);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#getSize()
	 */
	@Override
	public double[] getSize() {
		return this.size;
	}
	
	public Ai[] getConversers() {
		return this.conversers;
	}
	
	/**
	 * The Class SpeechOption.
	 */
	protected static class SpeechOption extends TextButton{

		/**
		 * The topic number.
		 */
		private int topicNumber;
		
		private MessageBox messageBox;
		
		/**
		 * Instantiates a new speech option.
		 *
		 * @param topicNumber the topic number
		 */
		public SpeechOption(MessageBox messageBox, int topicNumber) {
			super(Color.yellow.darker(), Color.red.darker());
			this.messageBox = messageBox;
			this.topicNumber = topicNumber;
			this.setActive(false);
		}
		
		/* (non-Javadoc)
		 * @see watoydoEngine.designObjects.display.TextButton#mD(java.awt.Point, java.awt.event.MouseEvent)
		 */
		@Override
		public boolean mD(Point mousePosition, MouseEvent e) {
			return true;
		}
		
		/* (non-Javadoc)
		 * @see watoydoEngine.designObjects.display.TextButton#mU(java.awt.Point, java.awt.event.MouseEvent)
		 */
		@Override
		public boolean mU(Point mousePosition, MouseEvent e) {
			messageBox.messageManager.triggerTopic(topicNumber);
			return true;
		}
		
	}
	
	/**
	 * The Class MessageManager.
	 */
	
	
	/**
	 * The Class ChatterBox.
	 */
	protected static class ChatterBox{

		/**
		 * Message.
		 *
		 * @param name the name
		 * @param topic the topic
		 * @param tone the tone
		 * @return the string
		 */
		public static String message(String name, String topic, int tone){
			String message = "I dunno";
			switch(topic){
				case "INTIMIDATE":
					message = pickAString(INTIMIDATE);
				break;
				case "INTIMIDATE_REACTION":
					if(tone < 0){
						message = pickAString(INTIMIDATE_SUCCESS);
					}
					else{
						message = pickAString(INTIMIDATE_FAIL);
					}
				break;
				case "INCAP":
					message = pickAString(INCAP);
				break;
				case "INCAP_REACTION":
					if(tone < 0){
						message = pickAString(INCAP_SUCCESS);
					}
					else{
						message = pickAString(INCAP_FAIL);
					}
				break;
				case "JOIN":
					message = pickAString(JOIN);
				break;
				case "JOIN_REACTION":
					if(tone < 0){
						message = pickAString(JOIN_SUCCESS);
					}
					else{
						message = pickAString(JOIN_FAIL);
					}
				break;
				case "LIST_ITEM":
					message = pickAString(LIST_ITEM);
				break;
				case "BUY_ITEM":
					message = pickAString(BUY_ITEM);
				break;
				case "LIST_ITEM_REACTION":
					if(tone > 0){
						message = pickAString(LIST_ITEM_REACTION_HAS_ITEM);
					}
					else{
						message = pickAString(LIST_ITEM_REACTION_OUT_OF_STOCK);
					}
				break;
				case "BUY_ITEM_REACTION":
					if(tone > 0){
						message = pickAString(BUY_ITEM_REACTION_SUCCESS);
					}
					else if(tone == 0){
						message = pickAString(YOUR_INVENTORY_IS_FULL);
					}
					else{
						message = pickAString(BUY_ITEM_REACTION_FAIL);
					}
				break;
				case "WHAT_TARGET":
					message = pickAString(WHAT_TARGET);
				break;
				case "CLAIM_BOUNTY":
					message = pickAString(CLAIM_BOUNTY);
				break;
				case "CLAIM_BOUNTY_REACTION":
					if(tone > 0){
						message = pickAString(CLAIM_BOUNTY_REACTION_SUCCESS);
					}
					else if(tone == 0){
						message = pickAString(YOUR_INVENTORY_IS_FULL);
					}
					else{
						message = pickAString(CLAIM_BOUNTY_REACTION_FAIL);
					}
				break;
				case "STEAL":
					message = pickAString(STEAL);
				break;
				case "GIVE_ITEMS":
					message = pickAString(GIVE_ITEMS);
				break;
				case "SHOW_ENEMIES":
					message = pickAString(SHOW_ENEMIES);
				break;
				case "HELLO":
					message = pickAString(HELLO);
				break;
				case "HELLO_SHOPKEEP":
					message = pickAString(HELLO_SHOPKEEP);
				break;
				case "HELLO_HITMAN_OFFER_MISSION":
					message = pickAString(HELLO_HITMAN_OFFER_MISSION);
				break;
				case "HELLO_HITMAN_GIVEN":
					message = pickAString(HELLO_HITMAN_GIVEN);
				break;
				case "NO_TRUST":
					message = pickAString(NO_TRUST);
				break;
				case "ACKNOWLEDGE":
					message = pickAString(ACKNOWLEDGE);
				break;
				case "YES":
					message = pickAString(YES);
				break;
				case "NO":
					message = pickAString(NO);
				break;
				case "BYE":
					message = pickAString(BYE);
				break;
				case "EXIT":
					message = "";
				break;
			}
			if(!message.equals("")){
				message = name + ": " + message;
			}
			return message;
		}
		
		/**
		 * Message.
		 *
		 * @param name the name
		 * @param topic the topic
		 * @param messageAddition the message addition
		 * @param tone the tone
		 * @return the string
		 */
		public static String message(String name, String topic, String messageAddition,int tone) {
			String message = "I dunno";
			switch(topic){
				case "LIST_ITEM_REACTION":
					if(tone > 0){
						message = pickAString(LIST_ITEM_REACTION_HAS_ITEM);
					}
					else{
						message = pickAString(LIST_ITEM_REACTION_OUT_OF_STOCK);
					}
				break;
				case "WHAT_TARGET_REACTION":
					message = pickAString(WHAT_TARGET_REACTION);
				break;
			}
			if(!message.equals("")){
				message = name + ": " + message + " " + messageAddition;
			}
			return message;
		}

		/**
		 * Pick a string.
		 *
		 * @param messages the messages
		 * @return the string
		 */
		private static String pickAString(String[] messages) {
			return messages[new Random().nextInt(messages.length)];
		}
		
		/**
		 * The Constant HELLO.
		 */
		private static final String[] HELLO = {"Hello","Hey"};
		
		/**
		 * The Constant HELLO_SHOPKEEP.
		 */
		private static final String[] HELLO_SHOPKEEP = {"Hello, you want to buy something?"};
		
		/**
		 * The Constant BYE.
		 */
		private static final String[] BYE = {"Bye","See ya","Talk to you later","Goodbye"};
		
		/**
		 * The Constant YES.
		 */
		private static final String[] YES = {"Yeah sure","Ok","Yep sure","Alright then"};
		
		/**
		 * The Constant ACKNOWLEDGE.
		 */
		private static final String[] ACKNOWLEDGE = {"Yes I have","Yes","Yeah"};
		
		/**
		 * The Constant NO.
		 */
		private static final String[] NO = {"No"};
		
		/**
		 * The Constant NO_TRUST.
		 */
		private static final String[] NO_TRUST = {"I don't trust you","I'm not doing that"};
		
		/**
		 * The Constant SHOW_ENEMIES.
		 */
		private static final String[] SHOW_ENEMIES = {"Have you seen any dangerous people around?","Have you spotted any hostiles?"};
		
		/**
		 * The Constant STEAL.
		 */
		private static final String[] STEAL = {"Hand over your equipment!","Hand over your stuff!","Give me your shit!"};
		
		/**
		 * The Constant GIVE_ITEMS.
		 */
		private static final String[] GIVE_ITEMS = {"Ok here's my stuff, don't kill me!"};
		
		/**
		 * The Constant INTIMIDATE.
		 */
		private static final String[] INTIMIDATE = {"You don't seem very co-operative, I can change that","That oxygen pipe looks like its coming a bit loose...",
													"I find its best to aim for the power supply, stops the radio broadcasting the screams"};
		
		/**
		 * The Constant INTIMIDATE_SUCCESS.
		 */
		private static final String[] INTIMIDATE_SUCCESS = {"Look, I'll do what you want don't hurt me!","Okay it's cool, what do you want?","Shit, calm down I'm co-operating"};

		/**
		 * The Constant INTIMIDATE_FAIL.
		 */
		private static final String[] INTIMIDATE_FAIL = {"Yeah, how about you fuck off?","Fuck you","Perhaps you can't see my big brass balls in this suit? Piss off!","Real funny pal"};
		
		/**
		 * The Constant INCAP.
		 */
		private static final String[] INCAP = {"Keep your hands where I can see them","Don't try any funny moves","Don't move a muscle"};

		/**
		 * The Constant INCAP_SUCCESS.
		 */
		private static final String[] INCAP_SUCCESS = {"Ok my hands are up!","Ok, don't kill me!"};

		/**
		 * The Constant INCAP_FAIL.
		 */
		private static final String[] INCAP_FAIL = {"Yeah can you see this? *Flicks V's*","Yeah good luck pal"};
		
		
		/**
		 * The Constant LIST_ITEM.
		 */
		private static final String[] LIST_ITEM = {"What are you selling?","What've you got?","What you got?","What's for sale?"};

		/**
		 * The Constant BUY_ITEM.
		 */
		private static final String[] BUY_ITEM = {"Ok I'll buy","Sure I'll buy"};

		/**
		 * The Constant LIST_ITEM_REACTION_HAS_ITEM.
		 */
		private static final String[] LIST_ITEM_REACTION_HAS_ITEM = {"I am selling a premium, top of the line","A fantastic","A"};

		/**
		 * The Constant LIST_ITEM_REACTION_OUT_OF_STOCK.
		 */
		private static final String[] LIST_ITEM_REACTION_OUT_OF_STOCK = {"I'm out of stock, sorry","Out of stock, sorry"};
		
		/**
		 * The Constant BUY_ITEM_REACTION_SUCCESS.
		 */
		private static final String[] BUY_ITEM_REACTION_SUCCESS = {"Hope you enjoy it","Hope it keeps you alive","Enjoy it, stay safe"};
		
		/**
		 * The Constant YOUR_INVENTORY_IS_FULL.
		 */
		private static final String[] YOUR_INVENTORY_IS_FULL = {"I don't think you can carry it","You need to get rid of something you're carrying"};
		
		/**
		 * The Constant BUY_ITEM_REACTION_FAIL.
		 */
		private static final String[] BUY_ITEM_REACTION_FAIL = {"You don't have enough cash pal"};
		
		
		/**
		 * The Constant HELLO_HITMAN_GIVEN.
		 */
		private static final String[] HELLO_HITMAN_GIVEN = {"Done the job yet?","How's the job going?","You killed them yet?"};

		/**
		 * The Constant HELLO_HITMAN_OFFER_MISSION.
		 */
		private static final String[] HELLO_HITMAN_OFFER_MISSION = {"Hey man, you need a job?","Hey, I've got a job you can do"};
		
		/**
		 * The Constant WHAT_TARGET_REACTION.
		 */
		private static final String[] WHAT_TARGET_REACTION = {"The target is ","You need to kill"};

		/**
		 * The Constant WHAT_TARGET.
		 */
		private static final String[] WHAT_TARGET = {"Who do you want dead?","Yeah I don't mind getting dirty"};
		
		/**
		 * The Constant CLAIM_BOUNTY.
		 */
		private static final String[] CLAIM_BOUNTY = {"I've killed the target","They're dead","Job's done"};

		/**
		 * The Constant CLAIM_BOUNTY_REACTION_FAIL.
		 */
		private static final String[] CLAIM_BOUNTY_REACTION_FAIL = {"No, they're still alive","My scanner says they're alive","They're still breathing according to this"};

		/**
		 * The Constant CLAIM_BOUNTY_REACTION_SUCCESS.
		 */
		private static final String[] CLAIM_BOUNTY_REACTION_SUCCESS = {"Well done, here's your reward","Good riddance"};
		
		
		/**
		 * The Constant JOIN.
		 */
		private static final String[] JOIN = {"You want to stick together?","We'll be safer in a group"};
		
		/**
		 * The Constant JOIN_SUCCESS.
		 */
		private static final String[] JOIN_SUCCESS = {"Yes, I'll go with you","I've got your back", "Try not to die"};

		/**
		 * The Constant JOIN_FAIL.
		 */
		private static final String[] JOIN_FAIL = {"No, I think I'll manage without you"};

		
	}
	
	/**
	 * The Class Dialogue.
	 */
	public static class Dialogue{
		
		/**
		 * The opening line.
		 */
		public String openingLine;
		
		/**
		 * The options.
		 */
		public String[] options;
		
		// string which is cycled through when continue is pressed
		/**
		 * The long speeches.
		 */
		public HashMap<String, String[][]> longSpeeches;
		
		/**
		 * The long speech.
		 */
		public String[] longSpeech;
		
		/**
		 * The target faction.
		 */
		public String targetFaction;
		
		/**
		 * The tone.
		 */
		public int tone;
		
		/**
		 * The long speech point.
		 */
		public int longSpeechPoint;
		
		/**
		 * The talked to.
		 */
		public Set<Ai> talkedTo;
		
		private Missions missions;
		private MissionManager missionManager;
		
		/**
		 * Instantiates a new dialogue.
		 * @param i 
		 *
		 * @param openingLine the opening line
		 * @param options the options
		 */
		public Dialogue(Missions missions, MissionManager missionManager, int tone, String openingLine, String[] options){
			this.missions = missions;
			this.tone = tone;
			this.openingLine = openingLine;
			this.options = options;
			this.missionManager = missionManager;
			longSpeechPoint = 0;
			this.longSpeeches = new HashMap<String,String[][]>(2);
			talkedTo = new HashSet<Ai>();
		}
		
		public boolean requirementsMet(String[] requirements, Ai currentAi) {
			
			for(int i = 0; i < requirements.length; i++){
				if(!currentAi.getInventory().hasItemByName(requirements[i]) && !missions.hasMemCode(requirements[i]))
					return false;
			}
			
			return true;
		}

		/**
		 * Check triggers.
		 *
		 * @param speech the speech
		 * @param messageBox 
		 * @return true, if successful
		 */
		public boolean checkTriggers(String speech, MessageBox messageBox) {
			if(speech.startsWith("#")){
				
				// remove the #
				String itemName = speech.substring(1);
				
				// check if the spawn also has an id
				// id ex. ##ABCDItemName
				if(itemName.startsWith("#")){
					
					// id already included so exit
					if(missions.hasMemCode(itemName.substring(1, 5)))
						return true;
					
					missions.addMemCode(itemName.substring(1, 5));
					
					itemName = itemName.substring(5);
				}
				// Event code
				else if(itemName.startsWith("$")){
					missions.addMemCode(itemName.substring(1, 5));
					return true;
				}
				
				// Check if the spawn is a swap
				String[] swapItems = itemName.split("#");
				
				if(swapItems.length == 1){
					double[] location = missionManager.spawnItem(itemName); 
					
					// mark the location as a stash
					messageBox.cartographer.addNewMarker(location, Color.white, messageBox.getConversers()[1].getName() + "'s Stash");
				}
				else{
					if(Weapon.isWeapon(swapItems[0])){
						messageBox.getConversers()[0].setWeapon(Weapon.stringToWeapon(swapItems[1]));
					}
					else{
						messageBox.getConversers()[0].getInventory().removeItem(Item.stringToItem(swapItems[0]));
						messageBox.getConversers()[0].getInventory().addItem(Item.stringToItem(swapItems[1]));
					}
					messageBox.getConversers()[0].assignAbilities();
				}
				
				return true;
			}
			return false;
		}

		/**
		 * Adds the long speech.
		 *
		 * @param speechName the speech name
		 * @param speech the speech
		 */
		public void addLongSpeech(String speechName, String[] speech, String[] requiredItems){
			this.longSpeeches.put(speechName, new String[][]{speech,requiredItems});
		}

		/**
		 * Sets the long speech.
		 *
		 * @param speechName the new long speech
		 */
		public void setLongSpeech(String speechName){
			
			if(longSpeeches.get(speechName)[0] != longSpeech)
				longSpeechPoint = 0;
			
			this.longSpeech = this.longSpeeches.get(speechName)[0];
		}
		
		/**
		 * Next speech dialogue.
		 *
		 * @return the string
		 */
		public String nextSpeechDialogue() {
			if(longSpeechPoint < longSpeech.length){
				longSpeechPoint++;		
			}
			return longSpeech[longSpeechPoint - 1];
		}

		/**
		 * Sets the target faction.
		 *
		 * @param targetFaction the new target faction
		 */
		public void setTargetFaction(String targetFaction) {
			this.targetFaction = targetFaction;
		}

		/**
		 * Gets the target faction.
		 *
		 * @return the target faction
		 */
		public String getTargetFaction() {
			return targetFaction;
		}

		/**
		 * Can talk to.
		 *
		 * @param actor the actor
		 * @return true, if successful
		 */
		public boolean canTalkTo(Ai actor) {
			return !this.talkedTo.contains(actor);
		}
		
		/**
		 * Talked to.
		 *
		 * @param actor the actor
		 */
		public void talkedTo(Ai actor){
			this.talkedTo.add(actor);
		}

	}

}
