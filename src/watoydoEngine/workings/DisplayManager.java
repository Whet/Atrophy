/*
 * 
 */
package watoydoEngine.workings;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import watoydoEngine.workings.displayActivity.ActivePane;


// TODO: Auto-generated Javadoc
/**
 * The Class DisplayManager.
 */
public class DisplayManager{
	
	// Singleton code
	/**
	 * The instance.
	 */
	private static DisplayManager instance;
	
	// returns instance
	/**
	 * Gets the single instance of DisplayManager.
	 *
	 * @return single instance of DisplayManager
	 */
	public static DisplayManager getInstance(){
		if(instance == null){
			instance = new DisplayManager();
		}
		return instance;
	}
	
	/**
	 * The dm.
	 */
	private DisplayMode dm;
	
	/**
	 * The main device.
	 */
	private GraphicsDevice mainDevice;
	
	// resolution of active pane
	/**
	 * The resolution.
	 */
	private int[] resolution;
	
	/**
	 * Instantiates a new display manager.
	 */
	private DisplayManager(){
		
		resolution = new int[2];
	
		// sets mainDevice to contain the default screen
		mainDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		
		dm = mainDevice.getDisplayMode();
	}
	
	// Sets up active pane to be fullscreen/windowed at correct resolution
	/**
	 * Sets the frame to screen.
	 *
	 * @param window the window
	 * @param windowed the windowed
	 * @param resolution the resolution
	 */
	public void setFrameToScreen(ActivePane window,boolean windowed, int[] resolution){
		
		this.resolution[0] = resolution[0];
		this.resolution[1] = resolution[1];
		
		dm = new DisplayMode(this.resolution[0],this.resolution[1],32,DisplayMode.REFRESH_RATE_UNKNOWN);
		
		if(!windowed && mainDevice.isFullScreenSupported()){
				mainDevice.setFullScreenWindow(window);
				// Try and change settings
				if(mainDevice.isDisplayChangeSupported()){
					mainDevice.setDisplayMode(dm);
				}
				else{
					window.setMode(resolution,true);
				}
		}
		else{
			
			window.setMode(resolution,true);
			
			window.setPreferredSize(new Dimension(resolution[0],resolution[1]));
			window.pack();
		}
	}
	
	// if not windowed will close fullscreen
	/**
	 * End display.
	 */
	public void endDisplay(){
		if(!ActivePane.getInstance().getWindowed()){
			mainDevice.getFullScreenWindow().dispose();
			mainDevice.setFullScreenWindow(null);
		}
	}
	
	/**
	 * Gets the resolution.
	 *
	 * @return the resolution
	 */
	public int[] getResolution(){
		return this.resolution;
	}

}