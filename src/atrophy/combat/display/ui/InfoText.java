package atrophy.combat.display.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatUiManager;

public class InfoText extends Text {
	
	
	private static final Semaphore hintEditMutex = new Semaphore(1);
	
	private List<InfoTextDisplayable> hints;
	private List<String> specialHints;
	
	private CombatUiManager combatUiManager;
	
	public InfoText(CombatUiManager combatUiManager) {
		super(0,0,"");
		hints = new ArrayList<InfoTextDisplayable>();
		this.setFont(FontList.AUD16);
		
		this.combatUiManager = combatUiManager;
		
		this.specialHints = new ArrayList<>();
	}
	
	private void drawHints(){
		
		this.setText("");
		
		// Set infoText in corner, correct size to show all lines
		this.setLocation(10.0,DisplayManager.getInstance().getResolution()[1] - combatUiManager.getActionsBar().getSize()[1] - (20 * (hintLines() + specialHints.size())));
		
		for(InfoTextDisplayable hint : hints){
			this.appendText(hint.getUiHint() + "@n");
		}
		
		for(String hint: specialHints) {
			this.appendText(hint + "@n");
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

	public void displayInfo(String string) {
		if(!specialHints.contains(string)) {
			try {
				hintEditMutex.acquire();
				specialHints.add(string);
				drawHints();
			}
			catch(InterruptedException ie){
				System.err.println("Interrupted");
				Thread.currentThread().interrupt();
			}
		}
	}

	public void removeInfo(String string) {
		try {
			hintEditMutex.acquire();
			specialHints.remove(string);
			drawHints();
		}
		catch(InterruptedException ie){
			System.err.println("Interrupted");
			Thread.currentThread().interrupt();
		}
	}

}
