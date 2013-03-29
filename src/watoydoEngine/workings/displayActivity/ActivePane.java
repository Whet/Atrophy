/*
 * 
 */
package watoydoEngine.workings.displayActivity;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import watoydoEngine.designObjects.actions.ActivePaneTimer;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.fonts.FontList;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.DisplayManager;
import atrophy.hardPanes.SplashPane;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

// TODO: Auto-generated Javadoc
/**
 * The Class ActivePane.
 */
@SuppressWarnings("serial")
public class ActivePane extends JFrame implements MouseListener, KeyListener, WindowListener{
	
	// Singleton code
	/**
	 * The instance.
	 */
	private static ActivePane instance;
	
	// returns instance
	/**
	 * Gets the single instance of ActivePane.
	 *
	 * @return single instance of ActivePane
	 */
	public static ActivePane getInstance(){
		if(instance == null){
			instance = new ActivePane();
		}
		return instance;
	}

	// This app uses one Pane but future ones will allow you to swap them around so this variable gives you a reference to the shown pane
	// this is used in HiLo game to grab text boxes and buttons from the pane and reference them locally
	/**
	 * The current pane.
	 */
	private Crowd currentPane;
	
	// Information about the display settings
	/**
	 * The windowed.
	 */
	private boolean windowed;
	
	/**
	 * The res.
	 */
	private int[] res;
	
	// Vars used in drawing things to the screen
	/**
	 * The loaded.
	 */
	private boolean loaded;
	
	/**
	 * The buffer s.
	 */
	private BufferStrategy bufferS;
	
	/**
	 * The d buffer.
	 */
	private Graphics2D dBuffer;
	
	/**
	 * The background colour.
	 */
	private Color backgroundColour;
	
	/**
	 * The Constant loadedMutex.
	 */
	private static final Mutex loadedMutex = new Mutex();
	
	/**
	 * Instantiates a new active pane.
	 */
	private ActivePane(){
		
		// Display settings
		res = new int[2];
		res[0] = 1280;
		res[1] = 720;
		windowed = false;

		
		// Although the program can run windowed we position buttons by resolution sometimes
		// To save effort of resizing everytime the user does the window, it is kept constant
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		backgroundColour = new Color(0,0,0);
		
		// Stops unneeded looping before displaylist has been populated
		loaded = false;

	}
	
	
	// The Void
	
	// This sets up the frame with its window size and resolution so when it goes to the dm.setFrameToScreen method it is set up as the user specified
	/**
	 * Sets the mode.
	 *
	 * @param res the res
	 * @param windowed the windowed
	 */
	public void setMode(int[] res, boolean windowed){
		
		this.res[0] = res[0];
		this.res[1] = res[1];
		
		this.windowed = windowed;
		// If windowed then leave decorations on
		this.setUndecorated(!windowed);
	}
	
	// Set display up when config menu closes, run once
	/**
	 * Sets the display.
	 */
	public void setDisplay(){
		
		// Sets window icon to watoydo logo
		Image watLogo = null;
		this.setTitle("Atrophy");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Image cursorImage = null;
		Point cursorHotSpot = new Point(0,0);	
		
		try{
			watLogo = ImageIO.read(ReadWriter.getResourceAsInputStream("images/watoydo/watoydoLogo.jpg"));
			cursorImage = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/icons/mouseWV.png"));
		}
		catch(FileNotFoundException fnfe){
			System.err.println("watoydo window logo not found");
		}
		catch(IOException ioexcept){
			System.err.println("watoydo window logo not found");
		}
		
		this.setIconImage(watLogo);
		
		Cursor customCursor = toolkit.createCustomCursor(cursorImage, cursorHotSpot, "Cursor");
		this.setCursor(customCursor);
		
		DisplayManager.getInstance().setFrameToScreen(this,windowed,this.res);
		
		this.setLocation((int)(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x - res[0] * 0.5)
						,(int)(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y - res[1] * 0.5));
		
		this.setVisible(true);
		
		// Stops flickering with screen redraws
		this.createBufferStrategy(2);
		bufferS = this.getBufferStrategy();
	}
	
	// Sets up a pane
	/**
	 * Setup.
	 */
	public void setup(){
		
		removeMouseListener(this);
		removeKeyListener(this);
		removeWindowListener(this);
		
		loaded = false;
		
		Thread loadFrame = new Thread(){
			public void run() {
				// Load the first frame
				Crowd intro  = new Crowd(new SplashPane());
				currentPane = intro;
				
				loaded = true;
				
				// Add listeners again
				// The whole frame has a listener for click events, further down you can see their implementation in the action list loops
				addMouseListener(instance);
				
				addWindowListener(instance);
				
				setFocusable(true);
				addKeyListener(instance);
				
				if(!ActivePaneTimer.getInstance().isPlaying())
					ActivePaneTimer.getInstance().start();
			}
		};
		
		// makes the loaded occur later so the loading screen can be drawn
		SwingUtilities.invokeLater(loadFrame);
	}
	
	/**
	 * Change pane.
	 *
	 * @param pane the pane
	 */
	public void changePane(Crowd pane){
		this.loaded = false;
		this.repaint();
		try {
			loadedMutex.acquire();
			this.currentPane = pane;
			this.loaded = true;
		//	DevMenu.getInstance().setVisible(true);
			loadedMutex.release();
		} 
		catch (InterruptedException e1) {
			System.err.println("interrupedWIndowClose");
			Thread.currentThread().interrupt();
		}
	}
	
	// Listeners
	// ALthough the whole screen is listening, only certain regions that contain buttons will act upon the event
	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent e){
		
		requestFocus();
		
		Point mousePosition = new Point(MouseInfo.getPointerInfo().getLocation());
		SwingUtilities.convertPointFromScreen(mousePosition, this);
		
		// Mouse 1
		if(e.getButton() == MouseEvent.BUTTON1){
			for(int i = 0; i < currentPane.getMouseActionList().size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(currentPane.getMouseActionList().get(i).isActive() && currentPane.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(currentPane.getMouseActionList().get(i).mD(mousePosition, e))
						return;
				}
			}
		}
		// Mouse 2, BUTTON2 is middle mouse 
		else if(e.getButton() == MouseEvent.BUTTON3){
			for(int i = 0; i < currentPane.getMouseActionList().size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(currentPane.getMouseActionList().get(i).isActive() && currentPane.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(currentPane.getMouseActionList().get(i).rMD(mousePosition, e))
						return;
				}
			}
		}
		// middle mouse
		else if(e.getButton() == MouseEvent.BUTTON2){
			for(int i = 0; i < currentPane.getMouseActionList().size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(currentPane.getMouseActionList().get(i).isActive() && currentPane.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(currentPane.getMouseActionList().get(i).mMC(mousePosition, e))
						return;
				}
			}
		}
    }
	
    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    public void mouseReleased(MouseEvent e){
    	
    	Point mousePosition = new Point(MouseInfo.getPointerInfo().getLocation());
		SwingUtilities.convertPointFromScreen(mousePosition, this);
    	
		// Mouse 1
		if(e.getButton() == MouseEvent.BUTTON1){
			for(int i = 0; i < currentPane.getMouseActionList().size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(currentPane.getMouseActionList().get(i).isActive() && currentPane.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(currentPane.getMouseActionList().get(i).mU(mousePosition, e))
						return;
				}
			}
		}
		// Mouse 2, BUTTON2 is middle mouse 
		else if(e.getButton() == MouseEvent.BUTTON3){
			for(int i = 0; i < currentPane.getMouseActionList().size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(currentPane.getMouseActionList().get(i).isActive() && currentPane.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(currentPane.getMouseActionList().get(i).rMU(mousePosition, e))
						return;
				}
			}
		}
    }
    
    // Mouse Events
    
    // not used but have to be mentioned due to interface
    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    public void mouseEntered(MouseEvent e){
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    public void mouseExited(MouseEvent e){
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    public void mouseClicked(MouseEvent e){}
    
    // Special mouseEntered/Out listener for individual components
    /**
     * Mouse entered.
     */
    public void mouseEntered(){
    	try {
			loadedMutex.acquire();
			if(loaded){
		    	Point mousePosition = new Point(MouseInfo.getPointerInfo().getLocation());
				SwingUtilities.convertPointFromScreen(mousePosition, this);
				
				for(int i = 0; i < currentPane.getMouseActionList().size(); i++){
					// if the mouse click is in the hitbox then peform the action
					if(currentPane.getMouseActionList().get(i).isActive() && currentPane.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
						currentPane.getMouseActionList().get(i).mI(mousePosition);
					}
					else if(currentPane.getMouseActionList().get(i).isActive() && !currentPane.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
						currentPane.getMouseActionList().get(i).mO(mousePosition);
					}
				}
			}
			loadedMutex.release();
    	}
    	catch(InterruptedException ie){
    		System.err.println("interrupedMouseEnter");
			Thread.currentThread().interrupt();
    	}
    }
    
    // Key Events
    // keyup
    /* (non-Javadoc)
     * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
     */
    public void keyReleased(KeyEvent e){
    	for(int i = 0; i < currentPane.getKeyboardActionList().size(); i++){
    		if(currentPane.getKeyboardActionList().get(i).isFocused()){
    			if(currentPane.getKeyboardActionList().get(i).kU(e))
					return;
    		}
    	}
    }
    // keydown
    /* (non-Javadoc)
     * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
     */
    public void keyPressed(KeyEvent e){
    	for(int i = 0; i < currentPane.getKeyboardActionList().size(); i++){
    		if(currentPane.getKeyboardActionList().get(i).isFocused()){
    			if(currentPane.getKeyboardActionList().get(i).kD(e))
					return;
    		}
    	}
    }

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(KeyEvent e){
		for(int i = 0; i < currentPane.getKeyboardActionList().size(); i++){
			if(currentPane.getKeyboardActionList().get(i).isFocused()){
				if(currentPane.getKeyboardActionList().get(i).kP(e))
					return;
			}
    	}
	}
    
	// Draw
    /* (non-Javadoc)
	 * @see javax.swing.JFrame#update(java.awt.Graphics)
	 */
	public void update(Graphics g){
		paint(g);
    }
    
   // private long timeStart;
    
	/* (non-Javadoc)
    * @see java.awt.Window#paint(java.awt.Graphics)
    */
   public void paint(Graphics g){
	   // dBuffer is a 2dGraphics because affineTranform is used in display classes
	   dBuffer = (Graphics2D) bufferS.getDrawGraphics();

	   dBuffer.setColor(backgroundColour);
	   dBuffer.fillRect(0,0,res[0],res[1]);
	   
	   dBuffer.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	   dBuffer.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	   // If lists are loaded then draw to buffer
	   if(loaded){
		   draw(currentPane.getDisplayList());
	   }
	   else{
		   drawLoading();
	   }
	   // Display strategy
	   bufferS.show();
	   
	   g.dispose();
	   dBuffer.dispose();
   }
	
	/**
	 * Draw loading.
	 */
	private void drawLoading() {
		dBuffer.setColor(Color.black);
		dBuffer.fillRect(0, 0, res[0], res[1]);
		dBuffer.setFont(FontList.AUD24);
		dBuffer.setColor(Color.white);
		dBuffer.drawString("Loading", 5, res[1] - 10);
	}


	/**
	 * Reload display.
	 */
	public void reloadDisplay(){
		this.repaint();
	}
	
	// Draws a crowd or a pane
	/**
	 * Draw.
	 *
	 * @param displayList the display list
	 */
	public void draw(ArrayList<Displayable> displayList){
		for(int i = 0; i < displayList.size(); i++){
			
			// Kicks tweens to their next step in animation
			displayList.get(i).kickTween();
			
			// Asks each item to call ActivePane draw methods to draw itself if visible
			if(displayList.get(i).isVisible()){
				displayList.get(i).drawMethod(dBuffer);
			}
		}
	}
	
	/**
	 * Draw crowd.
	 *
	 * @param crowd the crowd
	 */
	public void drawCrowd(Crowd crowd){
		for(int j = 0; j < crowd.getDisplayList().size(); j++){
			draw(crowd.getDisplayList());
		}
	}
	
	// Getters
	/**
	 * Gets the windowed.
	 *
	 * @return the windowed
	 */
	public boolean getWindowed(){
		return windowed;
	}
	
	/**
	 * Gets the pane.
	 *
	 * @return the pane
	 */
	public Crowd getPane(){
		return currentPane;
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowActivated(WindowEvent e) {}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosed(WindowEvent e) {}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		closeWindow();
	}


	/**
	 * Close window.
	 */
	public void closeWindow() {
		try {
			loadedMutex.acquire();/*
			this.loaded = false;
			this.currentPane.removeOld();
			this.currentPane = null;
			DevMenu.getInstance().setVisible(true);*/
			System.exit(0);
			loadedMutex.release();
		} 
		catch (InterruptedException e1) {
			System.err.println("interrupedWIndowClose");
			Thread.currentThread().interrupt();
		}
	}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowIconified(WindowEvent e) {}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowOpened(WindowEvent e) {}

}