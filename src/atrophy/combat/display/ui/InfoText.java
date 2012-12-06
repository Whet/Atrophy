/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.gubbinz.LimitedArrayList;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatUiManager;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

// TODO: Auto-generated Javadoc
/**
 * The Class InfoText.
 */
public class InfoText extends Text {
	
	/**
	 * The Constant MAX_HINTS.
	 */
	private static final byte MAX_HINTS = 10;
	
	/**
	 * The Constant hintEditMutex.
	 */
//	private static final Semaphore hintEditTickets = new Semaphore(1,true);
	private static final Mutex hintEditMutex = new Mutex();
	
	/**
	 * The hints.
	 */
	private LimitedArrayList<InfoTextDisplayable> hints;
	
	private CombatUiManager combatUiManager;
	
	/**
	 * Instantiates a new info text.
	 */
	public InfoText(CombatUiManager combatUiManager) {
		super("InfoText",0,0,"");
		hints = new LimitedArrayList<InfoTextDisplayable>(MAX_HINTS);
		this.setFont(FontList.AUD16);
		
		this.combatUiManager = combatUiManager;
	}
	
	// The Void
	/**
	 * Draw hints.
	 */
	private void drawHints(){
		
		this.setText("");
		
		// Set infoText in corner, correct size to show all lines
		this.setLocation(10.0,DisplayManager.getInstance().getResolution()[1] - combatUiManager.getActionsBar().getSize()[1] - (20 * hintLines()));
		
		for(InfoTextDisplayable hint : hints){
			this.appendText(hint.getUiHint() + "@n");
		}
		hintEditMutex.release();
	}
	
	/**
	 * Hint lines.
	 *
	 * @return the int
	 */
	private int hintLines(){
		int totalLines = 0;
		for(InfoTextDisplayable hint : this.hints){
			totalLines += hint.getHintLines();
		}
		return totalLines;
	}
	
	/**
	 * Update info text.
	 */
	public void updateInfoText(){
		try{
			hintEditMutex.acquire();
			drawHints();
		}
		catch(InterruptedException ie){
			System.err.println("Interrupted");
			Thread.currentThread().interrupt();
		}
	}
	
	// Setters
	/**
	 * Sets the info text.
	 *
	 * @param textDisplayer the new info text
	 */
	public void setInfoText(InfoTextDisplayable textDisplayer){
		try{
			if(!hints.contains(textDisplayer)){
				hintEditMutex.acquire();
				hints.add(textDisplayer);
				drawHints();
			}
		}
		catch(InterruptedException ie){
			System.err.println("Interrupted");
			Thread.currentThread().interrupt();
		}
	}
	
	/**
	 * Removes the info text.
	 *
	 * @param textDisplayer the text displayer
	 */
	public void removeInfoText(InfoTextDisplayable textDisplayer){
		try{
			if(hints.contains(textDisplayer)){
				hintEditMutex.acquire();
				hints.remove(textDisplayer);
				drawHints();
			}
		}
		catch(InterruptedException ie){
			System.err.println("Interrupted");
			Thread.currentThread().interrupt();
		}
	}
	
	/**
	 * Update info text.
	 *
	 * @param textDisplayer the text displayer
	 */
	public void updateInfoText(InfoTextDisplayable textDisplayer){
		try{
			if(hints.contains(textDisplayer)){
				hintEditMutex.acquire();
				drawHints();
			}
		}
		catch(InterruptedException ie){
			System.err.println("Interrupted");
			Thread.currentThread().interrupt();
		}
	}

}
