/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.workings.DisplayManager;

/**
 * The Class LargeEventText.
 */
public class LargeEventText extends Text {

	/**
	 * The Constant TIMER_TIME.
	 */
	private static final int TIMER_TIME = 4000;
	
	/**
	 * The flash timer.
	 */
	private Timer flashTimer;
	
	/**
	 * Instantiates a new large event text.
	 */
	public LargeEventText() {
		super("LargeEventText",0,DisplayManager.getInstance().getResolution()[1] * 0.5);
		this.setFont(FontList.AUD24);
		// initialise just to avoid if(null)
		flashTimer = new Timer();
	}

	/**
	 * Flash text.
	 *
	 * @param string the string
	 */
	public void flashText(String string) {
		this.setText(string);
		flashTimer.cancel();
		flashTimer.purge();
		flashTimer = new Timer();
		flashTimer.schedule(new flashTimerEvent(string), TIMER_TIME);
	}
	
	/**
	 * Flash text.
	 *
	 * @param string the string
	 * @param colour the colour
	 */
	public void flashText(String string, Color colour) {
		this.setText(string);
		this.setColour(colour);
		flashTimer.schedule(new flashTimerEvent(string), TIMER_TIME);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#drawMethod(java.awt.Graphics2D)
	 */
	@Override 
	public void drawMethod(Graphics2D drawShape){
		FontMetrics metrics = drawShape.getFontMetrics(this.getFont());
		this.setLocation((DisplayManager.getInstance().getResolution()[0] * 0.5) - metrics.stringWidth(this.getText()) * 0.5, this.getLocation()[1]);
		super.drawMethod(drawShape);
	}
	
	/**
	 * The Class flashTimerEvent.
	 */
	private class flashTimerEvent extends TimerTask{

		/**
		 * The text.
		 */
		private String text;
		
		/**
		 * Instantiates a new flash timer event.
		 *
		 * @param text the text
		 */
		private flashTimerEvent(String text){
			this.text =  text;
		}
		
		/* (non-Javadoc)
		 * @see java.util.TimerTask#run()
		 */
		@Override
		public void run() {
			if(text.equals(getText())){
				setText("");
			}
			this.cancel();
		}
		
	}

}
