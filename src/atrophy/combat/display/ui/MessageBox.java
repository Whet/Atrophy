package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.actions.ActionRegion;
import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.fonts.FontList;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.actions.CombatMouseHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.TalkNode;
import atrophy.combat.ai.conversation.Dialogue;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.level.MissionManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Missions;

public class MessageBox extends Crowd{
	
	private static final int MAX_DISPLAYED_MESSAGES = 16;
	private static final int MAX_STORED_MESSAGES = 100;
	private static final int MAX_OPTIONS = 18;
	
	private int selectedTurn;
	private Text messageBoard;
	private Text conversersText;
	private Ai[] conversers;
	private TalkNode talkNode;
	public SpeechOption[] textOptions;
	private int[] dragLocation;
	private double[] size;

	private Queue<Message> messages;
	private MessageManager messageManager;
	private int leastMessage;
	
	private ButtonSingle[] navigationButtons;
	
	private BufferedImage topButton;
	private BufferedImage upButton;
	private BufferedImage downButton;
	private BufferedImage bottomButton;
	
	private ActionRegion mouseDragRegion;
	private CombatUiManager combatUiManager;
	private TurnProcess turnProcess;
	private Cartographer cartographer;

	private CartographerBox cartographerBox;

	private AiCrowd aiCrowd;
	private CombatMouseHandler combatMouseHandler;
	
	public MessageBox(CombatUiManager combatUiManager, TurnProcess turnProcess, CombatMembersManager combatMembersManager, CombatVisualManager combatVisualManager, Cartographer cartographer, CartographerBox cartographerBox, AiCrowd aiCrowd){
		
		super(false);
		
		this.combatUiManager = combatUiManager;
		this.turnProcess = turnProcess;
		this.cartographer = cartographer;
		this.cartographerBox = cartographerBox;
		this.aiCrowd = aiCrowd;
		
		messages = new LinkedList<Message>();
		
		this.setLocation(30, 120);
		
		messageBoard = new Text();
		messageBoard.setFont(FontList.AUD14);
		messageBoard.setLocation(this.getLocation().clone());
		messageBoard.move(30, 48);
		this.addDisplayItem(messageBoard);
		
		selectedTurn = 0;
		this.size = new double[2];
		this.size[0] = 1120;
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
			textOptions[i].move(900, 48 + i * 18);
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

	public void lazyLoad(CombatMouseHandler combatMouseHandler) {
		this.combatMouseHandler = combatMouseHandler;
	}
	
	private void loadButtons() {
		
		try{
			this.topButton = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/uiTop.png"));
			this.upButton = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/uiUp.png"));
			this.downButton = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/uiDown.png"));
			this.bottomButton = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/uiBottom.png"));
		}
		catch(IOException ioexcept){
			System.err.println("Couldn't load ui icons");
			System.exit(-1);
		}
		
		navigationButtons = new ButtonSingle[4];
		
		navigationButtons[0] =  new ButtonSingle(topButton) {
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
		navigationButtons[1] = new ButtonSingle(upButton) {
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
		navigationButtons[2] = new ButtonSingle(downButton) {
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
		navigationButtons[3] = new ButtonSingle(bottomButton) {
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
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		drawBackdrop(drawShape);
		super.drawMethod(drawShape);
	}

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

	private void updateLocations(){
		
		for(int i = 0; i < textOptions.length; i++){
			textOptions[i].setLocation(this.getLocation()[0] + 900, this.getLocation()[1] + 48 + i * 18);
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

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if(!visible){
			this.conversersText.setText("");
			this.conversers[0] = null;
			this.conversers[1] = null;
			this.talkNode = null;
			this.messageManager.resetTopics();
			combatUiManager.getAllyRoster().setVisible(true);
			aiCrowd.setActive(true);
			combatMouseHandler.setActive(true);
			combatUiManager.getCombatInfo().getTurnButton().setVisible(true);
		}
		else {
			combatUiManager.getActionsBar().setVisible(false);
			combatUiManager.getAllyRoster().setVisible(false);
			cartographerBox.setVisible(false);
			aiCrowd.setActive(false);
			combatMouseHandler.setActive(false);
			combatUiManager.getCombatInfo().getTurnButton().setVisible(false);
		}
	}

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
	
	public void decrementLeastMessage(){
		if(leastMessage > 0){
			leastMessage--;
			this.updateMessages();
			
			this.messageBoard.setColour(Color.yellow);
		}
	}
	
	private void topMessage(){
		this.leastMessage = this.messages.size() - MAX_DISPLAYED_MESSAGES;
		this.messageBoard.setColour(Color.white);
	}
	
	private void bottomMessage(){
		this.leastMessage = 0;
		this.messageBoard.setColour(Color.yellow);
	}
	
	public void latestMessage(){
		topMessage();
		this.updateMessages();
	}
	
	public void oldestMessage(){
		bottomMessage();
		this.updateMessages();
	}
	
	public int getSelectedTurn() {
		return selectedTurn;
	}

	public void setSelectedTurn(int selectedTurn) {
		this.selectedTurn = selectedTurn;
	}
	
	private class Message{
		
		private int turn;
		private String message;

		public Message(int turn, String message){
			this.turn = turn;
			this.message = parseMessage(message);
		}

		private String parseMessage(String message) {
			message = message.replaceAll("playername", conversers[0].getName());
			if(conversers[1] != null) {
				message = message.replaceAll("ainame", conversers[1].getName());
				message = message.replaceAll("aifaction", conversers[1].getFaction());
			}
			else if(talkNode != null) {
				message = message.replaceAll("ainame", talkNode.getName());
			}
			return message;
		}

		public String timeDifference() {
			return Integer.toString(turnProcess.getTurnCount() - this.turn);
		}

		public String getMessage() {
			return message;
		}
	}
	
	public void setConversation(Ai currentAi, Ai speechAi) {
		conversers[0] = currentAi;
		conversers[1] = speechAi;
		this.conversersText.setText(currentAi.getName() + " speaking to " + conversers[1].getName());
		messageManager.loadTopics(currentAi, speechAi);
		SoundBoard.getInstance().playEffect("radio");
	}
	
	public void setInvestigating(Ai currentAi, Ai deadAi) {
		conversers[0] = currentAi;
		conversers[1] = deadAi;
		this.conversersText.setText(currentAi.getName() + " investigating " + conversers[1].getName());
		messageManager.loadTopics(currentAi, deadAi);
	}
	
	public void setConversation(Ai currentAi, Ai speechAi, Dialogue dialogue) {
		conversers[0] = currentAi;
		conversers[1] = speechAi;
		this.conversersText.setText(currentAi.getName() + " speaking to " + conversers[1].getName());
		messageManager.loadDialogue(dialogue);
		SoundBoard.getInstance().playEffect("radio");
	}
	
	public void setConversation(Ai currentAi, TalkNode talkNode) {
		conversers[0] = currentAi;
		this.talkNode = talkNode;
		this.conversersText.setText(currentAi.getName() + " interacting with " + talkNode.getName());
		messageManager.loadTalkNode(talkNode);
	}
	
	@Override
	public double[] getSize() {
		return this.size;
	}
	
	public Ai[] getConversers() {
		return this.conversers;
	}
	
	protected static class SpeechOption extends TextButton{

		private int topicNumber;
		
		private MessageBox messageBox;
		
		public SpeechOption(MessageBox messageBox, int topicNumber) {
			super(TextButton.DEFAULT_ON_COLOUR, TextButton.DEFAULT_OFF_COLOUR);
			this.messageBox = messageBox;
			this.topicNumber = topicNumber;
			this.setActive(false);
		}
		
		@Override
		public boolean mD(Point mousePosition, MouseEvent e) {
			return true;
		}
		
		@Override
		public boolean mU(Point mousePosition, MouseEvent e) {
			messageBox.messageManager.triggerTopic(topicNumber);
			return true;
		}
		
	}
	
	public Dialogue createDialogue(MissionManager missionsManager, String openingLine, String[] options, boolean initiator) {
		return new Dialogue(missionsManager, cartographer, openingLine, options, initiator);
	}

	public TalkNode getTalkNode() {
		return this.talkNode;
	}

}
