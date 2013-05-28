package atrophy.combat.display.ui;

import java.util.ArrayList;
import java.util.List;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatUiManager;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

public class InfoText extends Text {
	
	
	private static final Mutex hintEditMutex = new Mutex();
	
	private List<InfoTextDisplayable> hints;
	
	private CombatUiManager combatUiManager;
	
	public InfoText(CombatUiManager combatUiManager) {
		super(0,0,"");
		hints = new ArrayList<InfoTextDisplayable>();
		this.setFont(FontList.AUD16);
		
		this.combatUiManager = combatUiManager;
	}
	
	private void drawHints(){
		
		this.setText("");
		
		// Set infoText in corner, correct size to show all lines
		this.setLocation(10.0,DisplayManager.getInstance().getResolution()[1] - combatUiManager.getActionsBar().getSize()[1] - (20 * hintLines()));
		
		for(InfoTextDisplayable hint : hints){
			this.appendText(hint.getUiHint() + "@n");
		}
		hintEditMutex.release();
	}
	
	private int hintLines(){
		int totalLines = 0;
		for(InfoTextDisplayable hint : this.hints){
			totalLines += hint.getHintLines();
		}
		return totalLines;
	}
	
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
