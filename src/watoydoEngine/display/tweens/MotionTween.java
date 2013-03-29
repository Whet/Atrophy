/*
 * 
 */
package watoydoEngine.display.tweens;

import watoydoEngine.designObjects.actions.ActivePaneTimer;
import watoydoEngine.designObjects.display.Displayable;

// TODO: Auto-generated Javadoc
// Tween from one point to another
/**
 * The Class MotionTween.
 */
public class MotionTween implements TweenDefinable{
	
	// durations should not be longer than 59 seconds
	// has a 1dp precision
	/**
	 * The duration.
	 */
	protected double duration;
	
	/**
	 * The start time.
	 */
	protected double startTime;
	
	/**
	 * The ended.
	 */
	private boolean ended;
	
	/**
	 * The playing.
	 */
	private boolean playing;
	
	// 0 [0 = x][1 = y] = start cord
	// 1 [0 = x][1 = y] = current cord
	// 2 [0 = x][1 = y] = end cord
	/**
	 * The cords.
	 */
	protected double[][] cords;
	
	/**
	 * Instantiates a new motion tween.
	 *
	 * @param parent the parent
	 * @param dx the dx
	 * @param dy the dy
	 * @param duration the duration
	 * @param playing the playing
	 */
	public MotionTween(Displayable parent,double dx,double dy, double duration, boolean playing){
		
		this.duration = duration;
		this.startTime = ActivePaneTimer.getInstance().getTime();
		this.ended = false;
		this.playing = playing;
		cords = new double[3][2];
		cords[0][0] = parent.getLocation()[0];
		cords[0][1] = parent.getLocation()[1];
		cords[2][0] = dx;
		cords[2][1] = dy;
	
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.display.tweens.TweenDefinable#isEnded()
	 */
	public boolean isEnded(){
		return ended;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.display.tweens.TweenDefinable#stop()
	 */
	public void stop(){
		this.playing = false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.display.tweens.TweenDefinable#start()
	 */
	public void start(){
		this.playing = true;
	}
	
	/**
	 * Checks if is playing.
	 *
	 * @return true, if is playing
	 */
	public boolean isPlaying(){
		return this.playing;
	}
	
	// Tween workings
	
	/* (non-Javadoc)
	 * @see watoydoEngine.display.tweens.TweenDefinable#getCord(double[])
	 */
	public double[] getCord(double[] parentPos){
		if(playing){
			cords[1][0] = (loopTime()) * ((cords[2][0] - parentPos[0]) / duration);
			cords[1][1] = (loopTime()) * ((cords[2][1] - parentPos[1]) / duration);
		}
		else{
			cords[1][0] = 0;
			cords[1][1] = 0;
		}
		
		if(loopTime() >= duration){
			this.ended = true;
		}
		
		return cords[1];
	}
	
	// timer is on a loop so this needs to be accounted for to work out how far along the tween should be
	/**
	 * Loop time.
	 *
	 * @return the double
	 */
	protected double loopTime(){
		// the the main timer has looped
		if(ActivePaneTimer.getInstance().getTime() < startTime){
			// timer goes 0-59
			return ((59000 - startTime) + ActivePaneTimer.getInstance().getTime());
		}
		return ActivePaneTimer.getInstance().getTime() - startTime;
	}
	
	// Getters
	/* (non-Javadoc)
	 * @see watoydoEngine.display.tweens.TweenDefinable#getDuration()
	 */
	public double getDuration(){
		return this.duration;
	}
	
	// Editors
	/* (non-Javadoc)
	 * @see watoydoEngine.display.tweens.TweenDefinable#setDuration(double)
	 */
	public void setDuration(double duration){
		this.duration = duration;
	}
	
}
