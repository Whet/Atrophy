/*
 * 
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.workings.displayActivity.ActivePane;

/**
 * The Class Menu.
 */
public abstract class Menu extends Crowd{

	/**
	 * The window z.
	 */
	public static int windowZ = 0;
	
	private final int DEFAULT_WINDOW_Z;
	
	/**
	 * The mouse down.
	 */
	boolean mouseDown;
	
//	private final int TARGET_SMALL_X = 200;
	private final int TARGET_SMALL_Y = 40;
	
	private final double[] defaultSize;
	
	private final double[] smallSize;
	
	/**
	 * The size.
	 */
	private double[] size;
	
	/**
	 * The drag location.
	 */
	private int[] dragLocation;
	
	/**
	 * The draw less.
	 */
	protected boolean drawLess;
	
	protected WindowManager windowManager;
	
	/**
	 * Instantiates a new menu.
	 *
	 * @param size the size
	 */
	public Menu(WindowManager windowManager, double[] size) {
		super(true);
		mouseDown = false;
		this.defaultSize = size;
		this.size = size;
		smallSize = new double[2];
		smallSize[0] = defaultSize[0];
		
		if(defaultSize[1] <= TARGET_SMALL_Y)
			smallSize[1] = defaultSize[1];
		else
			smallSize[1] = TARGET_SMALL_Y;

		DEFAULT_WINDOW_Z = windowZ;
		
		this.setZ(windowZ);
		this.setActionZ(-windowZ);
		
		windowZ++;
		
		this.windowManager = windowManager;
		
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mD(Point mousePosition, MouseEvent e) {
		if(super.mD(mousePosition, e)){
			return true;
		}
		mouseDown = true;
		dragLocation = new int[]{e.getPoint().x - (int)this.getLocation()[0], e.getPoint().y - (int)this.getLocation()[1]};
		return true;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mU(Point mousePosition, MouseEvent e) {
		super.mU(mousePosition, e);
		mouseDown = false;
		return false;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition) {
		super.mI(mousePosition);
		if(mouseDown){
			double[] move = {mousePosition.x - this.getLocation()[0] - dragLocation[0], mousePosition.y - this.getLocation()[1] - dragLocation[1]};
			for(int i = 0; i < this.getDisplayList().size(); i++){
				this.getDisplayList().get(i).move(move[0], move[1]);
			}
			this.move(move[0], move[1]);
		}
		
		setPriorityMode(windowManager.requestWindowKey(this));
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition) {
		if(mouseDown){
			mouseDown = false;
		}
//		super.mO(mousePosition);
		
		setPriorityMode(false);
	}
	
	public void setPriorityMode(boolean prioritise){
		if(prioritise){
			this.setSize(defaultSize);
			this.setDrawLess(false);
			
			this.setZ(windowZ + 5);
			this.setActionZ(-windowZ - 5);
			windowManager.computeZOrder();
		}
		else{
			windowManager.releaseWindowKey(this);
			this.setDrawLess(true);
			this.setSize(smallSize);
			
			this.setZ(DEFAULT_WINDOW_Z);
			this.setActionZ(-DEFAULT_WINDOW_Z);
			ActivePane.getInstance().getPane().computeZOrder();
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape) {
		drawBackground(drawShape);
		
		if(!drawLess){
			ActivePane.getInstance().drawCrowd(this);
		}
	}
	
	/**
	 * Draw background.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawBackground(Graphics2D drawShape) {
		drawShape.setColor(Color.black);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.9f));
		drawShape.fillRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    (int)size[0],
							    (int)size[1],
							    14,14);
		drawShape.setColor(Color.gray);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.drawRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    (int)size[0],
							    (int)size[1],
							    14,14);
		
//		if(drawLess){
//			drawShape.setColor(new Color(5,5,5));
//			drawShape.drawRect((int)this.getLocation()[0] + 6,
//							   (int)this.getLocation()[1] + 6, 
//							   (int)size[0] - 12,
//							   (int)size[1] - 12);
//		}
		if(!drawLess){
			drawShape.setColor(new Color(2,2,2));
			drawShape.fillRect((int)this.getLocation()[0] + 6,
							   (int)this.getLocation()[1] + 6, 
							   (int)size[0] - 12,
							   (int)size[1] - 12);
		}
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#mC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mC(Point mousePosition, MouseEvent e) {return false;}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#rMD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean rMD(Point mousePosition, MouseEvent e) {return false;}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#rMU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean rMU(Point mousePosition, MouseEvent e) {
		this.setVisible(false);
		windowManager.releaseWindowKey(this);
		windowManager.removeItem(this);
		SoundBoard.getInstance().playEffect("cancel");
		return true;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#rMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean rMC(Point mousePosition, MouseEvent e) {return false;}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#isInBounds(double, double)
	 */
	@Override
	public boolean isInBounds(double x, double y) {
		if(x >= this.getLocation()[0] && x <= this.getLocation()[0] + this.size[0] && y >= this.getLocation()[1] && y <= this.getLocation()[1] + this.size[1])
			return true;
		return false;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#getScale()
	 */
	@Override
	public double getScale() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#getSize()
	 */
	@Override
	public double[] getSize() {
		return this.size;
	}
	
	public void setSize(double[] size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#setScale(double)
	 */
	@Override
	public void setScale(double scale) {}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#setTween(watoydoEngine.display.tweens.TweenDefinable)
	 */
	@Override
	public void setTween(TweenDefinable tween) {}

	/**
	 * Update information.
	 */
	public void updateInformation() {}

	/**
	 * Sets the draw less.
	 *
	 * @param drawLess the new draw less
	 */
	public void setDrawLess(boolean drawLess) {
		this.drawLess = drawLess;
	}
	
	/**
	 * Move all.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void moveAll(double x, double y){
		for(int i = 0; i < this.getDisplayList().size(); i++){
			this.getDisplayList().get(i).move(x, y);
		}
		this.move(x, y);
	}

}
