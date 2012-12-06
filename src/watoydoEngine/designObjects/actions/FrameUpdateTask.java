/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.actions;

import java.util.TimerTask;

import org.newdawn.slick.Music;

import watoydoEngine.workings.displayActivity.ActivePane;

// TODO: Auto-generated Javadoc
/**
 * The Class FrameUpdateTask.
 */
public class FrameUpdateTask extends TimerTask{
	
	/**
	 * The tween timer.
	 */
	private double tweenTimer;
	
	/**
	 * The frame time.
	 */
	private double frameTime;
	
	/**
	 * Instantiates a new frame update task.
	 *
	 * @param frameTime the frame time
	 */
	public FrameUpdateTask(double frameTime){
		tweenTimer = 0;
		
		this.frameTime = frameTime;
	}
	
	// The Void
	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	public void run(){
		
		tweenTimer += frameTime;
		// the tween timer loops so that numbers don't get too big,'railway' tweens are therefore limited to 59 seconds but this is acceptable
		// to animate for longer than 59 seconds a 'free' tween can be used that just adds x,y every frame rather than trying to reach a destination
		if(tweenTimer > 59000){
			tweenTimer = 0;
		}
		
		// check for mouse location dependent events and repaint the screen
		ActivePane.getInstance().mouseEntered();
		ActivePane.getInstance().reloadDisplay();
		Music.poll(0);
	}
	
	// Getters
	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public double getTime(){
		return tweenTimer;
	}
	
}
