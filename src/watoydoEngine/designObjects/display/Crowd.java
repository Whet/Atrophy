/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.designObjects.display;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import atrophy.hardPanes.CombatHardPane;
import atrophy.hardPanes.GameMenuHardPane;

import watoydoEngine.designObjects.actions.KeyboardRespondable;
import watoydoEngine.designObjects.actions.MouseRespondable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.hardPanes.HardPaneDefineable;
import watoydoEngine.workings.displayActivity.ActivePane;

// TODO: Auto-generated Javadoc
// contains groups of display objects including other crowds
/**
 * The Class Crowd.
 */
public class Crowd implements Displayable, MouseRespondable, KeyboardRespondable{
	
	/**
	 * The display list.
	 */
	private ArrayList<Displayable> displayList;
	
	/**
	 * The mouse action list.
	 */
	private ArrayList<MouseRespondable> mouseActionList;
	
	/**
	 * The keyboard action list.
	 */
	private ArrayList<KeyboardRespondable> keyboardActionList;
	
	/**
	 * The image bank.
	 */
	private ArrayList<BankedImage> imageBank;
	
	/**
	 * The tag.
	 */
	private String tag;
	
	/**
	 * The scale.
	 */
	private Double scale;
	
	/**
	 * The visible.
	 */
	private boolean visible;
	
	/**
	 * The location.
	 */
	private double[] location;
	// Used to define position,scale and rotation in active pane paint
	/**
	 * The transformation.
	 */
	private AffineTransform transformation;
	
	/**
	 * The tween.
	 */
	private TweenDefinable tween;
	
	/**
	 * The z.
	 */
	private int z;
	
	/**
	 * The action z.
	 */
	private int actionZ;
	
	// Children positioned relative to the crowd's position or the window origin
	/**
	 * The use local cord.
	 */
	private boolean useLocalCord;
	
	/**
	 * The focus.
	 */
	private boolean focus;
	
	/**
	 * The active.
	 */
	private boolean active;
	
	/**
	 * Instantiates a new crowd.
	 *
	 * @param tag the tag
	 * @param loadAsPane the load as pane
	 * @param pane the pane
	 */
	public Crowd(String tag, boolean loadAsPane, HardPaneDefineable pane){
		
		displayList = new ArrayList<Displayable>();
		mouseActionList = new ArrayList<MouseRespondable>();
		keyboardActionList = new ArrayList<KeyboardRespondable>();
		imageBank = new ArrayList<BankedImage>();
		
		this.tag = tag;
		scale = 1.0;
		location = new double[2];
		location[0] = 0;
		location[1] = 0;
		transformation = new AffineTransform();
		
		this.useLocalCord = false;
		
		focus = true;
		active = true;
		visible = true;
		
		z = 0;
		actionZ = 0;
		
		pane.load(tag,this);
		
		computeZOrder();
	}
	
	/**
	 * Instantiates a new crowd.
	 *
	 * @param tag the tag
	 * @param loadAsPane the load as pane
	 * @param pane the pane
	 * @param useLocalCord the use local cord
	 * @param z the z
	 */
	public Crowd(String tag, boolean loadAsPane, HardPaneDefineable pane, boolean useLocalCord, int z){

		displayList = new ArrayList<Displayable>();
		mouseActionList = new ArrayList<MouseRespondable>();
		keyboardActionList = new ArrayList<KeyboardRespondable>();
		imageBank = new ArrayList<BankedImage>();
		
		this.tag = tag;
		scale = 1.0;
		location = new double[2];
		location[0] = 0;
		location[1] = 0;
		transformation = new AffineTransform();
		
		this.useLocalCord = useLocalCord;
		
		focus = true;
		active = true;
		visible = true;
		
		this.z = z;
		actionZ = 0;
		
		pane.load(tag,this);
		
		computeZOrder();
	}
	
	/**
	 * Instantiates a new crowd.
	 *
	 * @param tag the tag
	 * @param visible the visible
	 */
	public Crowd(String tag, boolean visible){
		
		displayList = new ArrayList<Displayable>();
		mouseActionList = new ArrayList<MouseRespondable>();
		keyboardActionList = new ArrayList<KeyboardRespondable>();
		imageBank = new ArrayList<BankedImage>();
		
		this.tag = tag;
		scale = 1.0;
		location = new double[2];
		location[0] = 0;
		location[1] = 0;
		transformation = new AffineTransform();
		
		this.useLocalCord = false;
		
		focus = true;
		active = true;
		this.visible = visible;
		
		z = 0;
		actionZ = 0;
		
		computeZOrder();
	}
	
	/**
	 * Instantiates a new crowd.
	 *
	 * @param tag the tag
	 * @param visible the visible
	 * @param useLocalCord the use local cord
	 * @param z the z
	 */
	public Crowd(String tag, boolean visible,boolean useLocalCord, int z){

		displayList = new ArrayList<Displayable>();
		mouseActionList = new ArrayList<MouseRespondable>();
		keyboardActionList = new ArrayList<KeyboardRespondable>();
		imageBank = new ArrayList<BankedImage>();
		
		this.tag = tag;
		scale = 1.0;
		location = new double[2];
		location[0] = 0;
		location[1] = 0;
		transformation = new AffineTransform();
		
		this.z = z;
		actionZ = 0;
		
		this.useLocalCord = useLocalCord;
		
		focus = true;
		active = true;
		this.visible = visible;
		
		computeZOrder();
	}
	
	// The Void
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#drawMethod(java.awt.Graphics2D)
	 */
	public void drawMethod(Graphics2D drawShape){
		ActivePane.getInstance().drawCrowd(this);
	}

	// Local cords are relative to the crowd's location
	/**
	 * Convert to local.
	 */
	private void convertToLocal(){
		for(int i = 0; i < displayList.size(); i++){
			displayList.get(i).move(location[0],location[1]);
		}
		
	}
	
	/**
	 * Convert to global.
	 */
	private void convertToGlobal(){
		for(int i = 0; i < displayList.size(); i++){
			displayList.get(i).move(- location[0],- location[1]);
		}
	}
	// Orders the display list by .z number
    /**
	 * Computes the z order.
	 */
	public void computeZOrder(){
		Collections.sort(displayList);
		Collections.sort(mouseActionList, new Comparator<MouseRespondable>() {

			@Override
			public int compare(MouseRespondable o1, MouseRespondable o2) {
				if(o2.getActionZ() > o1.getActionZ()){
					 return -1;
				}
				else if(o2.getActionZ() < o1.getActionZ()){
					return 1;
				}
				return 0;
			}
		});
    }
    // Moves tween to next position
    /* (non-Javadoc)
     * @see watoydoEngine.designObjects.display.Displayable#kickTween()
     */
    public void kickTween(){
		if(this.tween != null){
			double[] movePos = this.tween.getCord(this.location);
			this.move(movePos[0],movePos[1]);
			if(this.tween.isEnded()){
				this.tween = null;
			}
		}
	}
    
    /* (non-Javadoc)
     * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kD(java.awt.event.KeyEvent)
     */
    public boolean kD(KeyEvent e) {
    	if(this.focus){
			for(int i = 0; i < keyboardActionList.size(); i++){
				if(keyboardActionList.get(i).isFocused()){
					if(keyboardActionList.get(i).kD(e))
						return true;
				}
	    	}
    	}
    	return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kU(java.awt.event.KeyEvent)
	 */
	public boolean kU(KeyEvent e) {
		if(this.focus){
			for(int i = 0; i < keyboardActionList.size(); i++){
				if(keyboardActionList.get(i).isFocused()){
					if(keyboardActionList.get(i).kU(e))
						return true;
				}
	    	}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#kP(java.awt.event.KeyEvent)
	 */
	public boolean kP(KeyEvent e) {
		if(this.focus){
			for(int i = 0; i < keyboardActionList.size(); i++){
				if(keyboardActionList.get(i).isFocused()){
					if(keyboardActionList.get(i).kP(e))
						return true;
				}
	    	}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mD(Point mousePosition, MouseEvent e) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(mouseActionList.get(i).mD(mousePosition, e))
						return true;
				}
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mU(Point mousePosition, MouseEvent e) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(mouseActionList.get(i).mU(mousePosition, e))
						return true;
				}
			}
		}
		return mC(mousePosition, e);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mC(Point mousePosition, MouseEvent e) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(mouseActionList.get(i).mC(mousePosition, e))
						return true;
				}
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMD(Point mousePosition, MouseEvent e) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(mouseActionList.get(i).rMD(mousePosition, e))
						return true;
				}
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMU(Point mousePosition, MouseEvent e) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(mouseActionList.get(i).rMU(mousePosition, e))
						return true;
				}
			}
		}
		return rMC(mousePosition, e);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#rMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean rMC(Point mousePosition, MouseEvent e) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(mouseActionList.get(i).rMC(mousePosition, e))
						return true;
				}
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mMC(Point mousePosition, MouseEvent e) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					if(mouseActionList.get(i).mMC(mousePosition, e))
						return true;
				}
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mI(java.awt.Point)
	 */
	public void mI(Point mousePosition) {
		if(this.active){
			for(int i = 0; i < mouseActionList.size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(mouseActionList.get(i).isActive() && mouseActionList.get(i).isInBounds(mousePosition.x,mousePosition.y)){
					mouseActionList.get(i).mI(mousePosition);
				}
				// active and not in area
				else if(mouseActionList.get(i).isActive()){
					mouseActionList.get(i).mO(mousePosition);
				}
			}
		}
	}
	
	// never called since crowds always respond to mI actions, always in bounds
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#mO(java.awt.Point)
	 */
	public void mO(Point mousePosition) {}
	
	
    // Populators
 	/**
     * Adds the display item.
     *
     * @param item the item
     */
    public void addDisplayItem(Displayable item){
 		displayList.add(item);
 	}
 	
 	/**
	  * Adds the button.
	  *
	  * @param item the item
	  */
	 public void addButton(AbstractButton item){
 		displayList.add(item);
 		mouseActionList.add(item);
 	}
 	
	 /**
 	 * Adds the input text.
 	 *
 	 * @param item the item
 	 */
	 public void addInputText(TextInput item){
 		displayList.add(item);
 		mouseActionList.add(item);
 		keyboardActionList.add(item);
 	}
 	
	 /**
 	 * Adds the crowd.
 	 *
 	 * @param item the item
 	 */
	 public void addCrowd(Crowd item){
 		displayList.add(item);
 		mouseActionList.add(item);
 		keyboardActionList.add(item);
 	}
 	
	 /**
 	 * Adds the mouse action item.
 	 *
 	 * @param item the item
 	 */
	 public void addMouseActionItem(MouseRespondable item){
 		mouseActionList.add(item);
 	}
 	
	 /**
 	 * Adds the key listener.
 	 *
 	 * @param item the item
 	 */
	 public void addKeyListener(KeyboardRespondable item){
 		keyboardActionList.add(item);
 	}
	
	// Getters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#isVisible()
	 */
	public boolean isVisible(){
		return this.visible;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getScale()
	 */
	public double getScale(){
		return this.scale;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getSize()
	 */
	public double[] getSize(){
		double[] returnInt = new double[2];
		return returnInt;
	}
	// Used for Graphics2D.drawImage
	/**
	 * Transformation.
	 *
	 * @return the affine transform
	 */
	public AffineTransform transformation(){
		this.transformation.setToTranslation(location[0], location[1]);
		this.transformation.scale(scale,scale);
		return this.transformation;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getLocation()
	 */
	public double[] getLocation(){
		return this.location;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#isEqual(java.lang.String)
	 */
	public boolean isEqual(String tag1){
		if(tag1.equals(this.tag)){
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the display list.
	 *
	 * @return the display list
	 */
	public ArrayList<Displayable> getDisplayList(){
		return this.displayList;
	}
	
	/**
	 * Gets the mouse action list.
	 *
	 * @return the mouse action list
	 */
	public ArrayList<MouseRespondable> getMouseActionList(){
		return this.mouseActionList;
	}
	
	/**
	 * Gets the keyboard action list.
	 *
	 * @return the keyboard action list
	 */
	public ArrayList<KeyboardRespondable> getKeyboardActionList(){
		return this.keyboardActionList;
	}
	// Gets an individual image so other places can do local manipulation
	/**
	 * Gets the item.
	 *
	 * @param tag the tag
	 * @return the item
	 */
	public Displayable getItem(String tag){
		for(int i = 0; i < displayList.size(); i++){
			if(displayList.get(i).getTag().equals(tag)){
				return displayList.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Gets the local.
	 *
	 * @return the local
	 */
	public boolean getLocal(){
		return this.useLocalCord;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getZ()
	 */
	public int getZ(){
		return this.z;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#getTag()
	 */
	public String getTag(){
		return this.tag;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#isFocused()
	 */
	public boolean isFocused() {
		return this.focus;
	}
	// crowd just passes mouse events to children so it is always in bounds
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isInBounds(double, double)
	 */
	public boolean isInBounds(double x, double y) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#isActive()
	 */
	public boolean isActive() {
		return this.active;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#compareTo(watoydoEngine.designObjects.display.Displayable)
	 */
	public int compareTo(Displayable otherDisplayable){
		if(otherDisplayable.getZ() > this.getZ()){
			 return -1;
		}
		else if(otherDisplayable.getZ() < this.getZ()){
			return 1;
		}
		return 0;
	}
	
	/**
	 * Gets the banked image.
	 *
	 * @param imageTag the image tag
	 * @return the banked image
	 */
	public BufferedImage getBankedImage(String imageTag){
		for(int i = 0; i < this.imageBank.size(); i++){
			if(this.imageBank.get(i).getTag().equals(imageTag)){
				return this.imageBank.get(i).getImage();
			}
		}
		return null;
	}
	
	/**
	 * Gets the transformation.
	 *
	 * @return the transformation
	 */
	public AffineTransform getTransformation(){
		return this.transformation;
	}
	
	/**
	 * Gets the transformation for drawing.
	 *
	 * @return the transformation for drawing
	 */
	public AffineTransform getTransformationForDrawing(){
		this.transformation.setToTranslation(location[0], location[1]);
		this.transformation.scale(scale,scale);
		return this.transformation;
	}
	
	// Setters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setVisible(boolean)
	 */
	public void setVisible(boolean visible){
		this.visible = visible;
		this.active = visible;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setScale(double)
	 */
	public void setScale(double scale){
		this.scale = scale;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setLocation(double, double)
	 */
	public void setLocation(double x, double y){
		this.location[0] = x;
		this.location[1] = y;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#move(double, double)
	 */
	public void move(double x, double y){
		this.location[0] += x;
		this.location[1] += y;
		if(useLocalCord){
			for(int i = 0; i < displayList.size(); i++){
				displayList.get(i).move(x,y);
			}
		}
	}
	
	/**
	 * Sets the local.
	 *
	 * @param useLocal the new local
	 */
	public void setLocal(boolean useLocal){
		if(useLocal != this.useLocalCord){
			this.useLocalCord = useLocal;
			if(useLocalCord){
				convertToLocal();
			}
			else{
				convertToGlobal();
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setZ(int)
	 */
	public void setZ(int z){
		this.z = z;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Displayable#setTween(watoydoEngine.display.tweens.TweenDefinable)
	 */
	public void setTween(TweenDefinable tween){
		this.tween = tween;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.KeyboardRespondable#setFocus(boolean)
	 */
	public void setFocus(boolean active) {
		this.focus = active;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActive(boolean)
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	/**
	 * Adds the banked image.
	 *
	 * @param image the image
	 */
	public void addBankedImage(BankedImage image){
		imageBank.add(image);
	}
	
	/**
	 * Clear bank.
	 */
	public void clearBank(){
		for(int i = 0; i < this.imageBank.size(); i++){
			this.imageBank.get(i).getImage().flush();
		}
		this.imageBank.clear();
	}
	
	/**
	 * Removes the banked image at.
	 *
	 * @param imageIndex the image index
	 */
	public void removeBankedImageAt(int imageIndex){
		this.imageBank.remove(imageIndex);
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#getActionZ()
	 */
	@Override
	public int getActionZ() {
		return actionZ;
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.MouseRespondable#setActionZ(int)
	 */
	public void setActionZ(int actionZ) {
		this.actionZ = actionZ;
	}

	/**
	 * The template.
	 */
	private String template;
	
	/**
	 * Removes the old.
	 */
	public void removeOld() {
		switch (template) {
			case CombatHardPane.NAME:
				CombatHardPane.clearOld();
			break;
			case GameMenuHardPane.NAME:
				GameMenuHardPane.clearOld();
			break;
		}
		template = "";
	}

	/**
	 * Sets the template.
	 *
	 * @param string the new template
	 */
	public void setTemplate(String string) {
		this.template = string;
	}

	/**
	 * Removes the item.
	 *
	 * @param item the item
	 */
	public void removeItem(Displayable item) {
		this.displayList.remove(item);
		this.keyboardActionList.remove(item);
		this.mouseActionList.remove(item);
	}

	
	
}