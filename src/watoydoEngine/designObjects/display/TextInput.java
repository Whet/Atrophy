package watoydoEngine.designObjects.display;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import watoydoEngine.designObjects.actions.KeyboardRespondable;
import watoydoEngine.designObjects.actions.MouseRespondable;

public class TextInput extends Text implements MouseRespondable,KeyboardRespondable{
	
	private boolean active;
	private int actionZ;
	private boolean focus;
	private int maxLetters;
	private int minLetters;
	private Rectangle2D boundBox;

	public TextInput(){
		active = true;
		focus = false;
	}

	public TextInput(double x, double y){
		super(x,y,"");
		
		active = true;
		focus = false;
	}

	public TextInput(double x, double y, String message) {
		super(x,y,message);
		
		active = true;
		focus = false;
	}

	public final void drawMethod(Graphics2D drawShape){
		
		updateText();
		
		
		if(this.boundBox == null){
			FontMetrics metric = drawShape.getFontMetrics(this.getFont());
			this.boundBox = metric.getStringBounds(this.getText(), drawShape);
		}
		
		super.drawMethod(drawShape);
	}
	
	// If a sublass wants to define it's text with a string variable, this method gets called before drawing
	// so a user doesn't have to call setText every time they update the variable
	protected void updateText(){};

	public boolean kD(KeyEvent e){
		// if backspace, delete last letter
		// doesn't work with getKeyCode
		if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE && this.getText().length() > minLetters){
			this.setText(this.getText().substring(0, this.getText().length() - 1));
		}
		// always return true to stop other things running
		return true;
	}

	public boolean kU(KeyEvent e){
		if((e.getKeyCode() == 32 || Character.isAlphabetic(e.getKeyChar()) || Character.isDigit(e.getKeyChar())) && (maxLetters == 0 || maxLetters > this.getText().length())){
			this.appendText(e.getKeyChar());
		}
		return true;
	}

	public boolean kP(KeyEvent e){
		return false;
	}

	public boolean mD(Point mousePosition, MouseEvent e){
		this.setFocus(true);
		return true;
	}

	public boolean mU(Point mousePosition, MouseEvent e){
		this.setFocus(true);
		return true;
	}

	public boolean rMD(Point mousePosition, MouseEvent e){
		return false;
	}

	public boolean rMU(Point mousePosition, MouseEvent e){
		return false;
	}

	public void mI(Point mousePosition){}

	public void mO(Point mousePosition) {
		this.setFocus(false);
	}

	public boolean mMC(Point mousePosition, MouseEvent e) {return false;}
	
	public boolean isActive(){
		return active;
	}

	public boolean isFocused(){
		return focus;
	}

	public boolean isInBounds(double x, double y){
		if(this.boundBox == null){
			return false;
		}
		return boundBox.contains(x - this.getLocation()[0], y - this.getLocation()[1]);
	}

	public int getMaxLetters(){
		return this.maxLetters;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public void setFocus(boolean focus){
		this.focus = focus;
	}

	public void setMaxLetters(int maxLetters){
		this.maxLetters = maxLetters;
	}

	public int getMinLetters() {
		return minLetters;
	}

	public void setMinLetters(int minLetters) {
		this.minLetters = minLetters;
	}

	@Override
	public boolean mC(Point mousePosition, MouseEvent e) {
		return false;
	}

	@Override
	public boolean rMC(Point mousePosition, MouseEvent e) {
		return false;
	}

	@Override
	public int getActionZ() {
		return this.actionZ;
	}

	@Override
	public void setActionZ(int actionZ) {
		this.actionZ = actionZ;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		this.setActive(visible);
	}
	
}
