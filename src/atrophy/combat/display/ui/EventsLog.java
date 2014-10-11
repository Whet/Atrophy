package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.utils.GraphicsFunctions;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.mechanics.TurnProcess;

public class EventsLog extends Crowd {

	private final int MAX_MESSAGES = 5;
	
	private Queue<Message> messages;
	private TurnProcess turnProcess;
	private Text messageBoard;
	private double[] size;
	
	private final int FADE_OUT_TIME = 200;
			
	private int fadeTime;
	private float alphaFade;

	public EventsLog(TurnProcess turnProcess) {
		super(true);
		
		this.turnProcess = turnProcess;
		
		messages = new LinkedList<Message>();
		
		this.size = new double[2];
		this.size[0] = 300;
		this.size[1] = 110;
		
		this.alphaFade = 0;
		this.fadeTime = 0;
		
		this.setLocation(ActivePane.getInstance().getWidth() - this.size[0] - 20,
						 ActivePane.getInstance().getHeight() - this.size[1] - 20);
		
		messageBoard = new Text();
		messageBoard.setFont(FontList.AUD14);
		messageBoard.setLocation(this.getLocation().clone());
		
		messageBoard.setColour(Color.white);
		messageBoard.move(10, 20);
		this.addDisplayItem(messageBoard);
	}
	
	public void addMessage(String message) {
		this.messages.add(new Message(turnProcess.getTurnCount(), message));
		updateMessages();
		
		fadeTime = 0;
		alphaFade = 1;
	}
	
	public void updateMessages(){
		
		this.messageBoard.setText("");
		
		Iterator<Message> messageIt =  this.messages.iterator();
		
		for(int i = 0; i < MAX_MESSAGES; i++){
			if(messageIt.hasNext()){
				Message message =  messageIt.next();
				this.messageBoard.appendText(message.timeDifference() + ": " + message.getMessage() + "@n");
			}
			else{
				return;
			}
		}
	}
	
	@Override
	public void mI(Point mousePosition) {
		super.mI(mousePosition);
		fadeIn();
			
	}
	
	@Override
	public void mO(Point mousePosition) {
		super.mO(mousePosition);
		fateOut();
	}
	
	private void fadeIn() {
		if(this.alphaFade < 1)
			this.alphaFade += 0.05;
		
		if(alphaFade > 1)
			alphaFade = 1;
		
		this.fadeTime = 0;
	}
	
	private void fateOut() {

		if(fadeTime < this.FADE_OUT_TIME)
			this.fadeTime ++;
		else if(this.alphaFade > 0.01)
			this.alphaFade -= 0.01;
		
		if(alphaFade < 0)
			alphaFade = 0;
	}

	@Override
	public boolean isInBounds(double x, double y) {
		return x >= this.getLocation()[0] && x <= this.getLocation()[0] + size[0] && y >=  this.getLocation()[1] && y <=  this.getLocation()[1] + size[1];
	}

	@Override
	public void drawMethod(Graphics2D drawShape) {
		this.drawBackdrop(drawShape);
		super.drawMethod(drawShape);
		this.messageBoard.setAlpha(alphaFade);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
	}
	
	private void drawBackdrop(Graphics2D drawShape) {
		drawShape.setColor(Color.black);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.8f * alphaFade));
		drawShape.fillRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    (int)this.size[0], 
							    (int)this.size[1],
							    14,14);
		drawShape.setColor(Color.gray);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f  * alphaFade));
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
	
	private class Message{
		
		private int turn;
		private String message;

		public Message(int turn, String message){
			this.turn = turn;
			this.message = message;
		}

		public String timeDifference() {
			return Integer.toString(turnProcess.getTurnCount() - this.turn);
		}

		public String getMessage() {
			return message;
		}
	}

}
