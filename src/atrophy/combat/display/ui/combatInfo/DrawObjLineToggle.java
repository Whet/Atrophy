package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

public class DrawObjLineToggle extends ButtonMulti implements InfoTextDisplayable{

	private CombatUiManager combatUiManager;
	private CombatVisualManager combatVisualManager;

	public DrawObjLineToggle(CombatVisualManager combatVisualManagers, CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.combatVisualManager = combatVisualManagers;
		this.combatUiManager = combatUiManagers;
	}
	
	@Override
	public boolean mC(Point mousePosition, MouseEvent e){
		this.nextFrame(true);
		if(this.getFrame() == 0){
			combatVisualManager.setDrawingObjLines(false);
		}
		else{
			combatVisualManager.setDrawingObjLines(true);
		}
		
		// update Ui to reflect whether radio silence is in effect
		combatUiManager.updateUi();
		
		return true;
	}
	
	@Override
	public void mI(Point mousePosition){
		combatUiManager.getInfoText().setInfoText(this);
	}
	
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	@Override
	public String getUiHint(){
		// Show if radio silence engaged
		if(combatVisualManager.isDrawingObjLines()){
			return "Drawing lines to objectives";
		}
		return "Not drawing lines to objectives";
	}
	
	@Override
	public int getHintLines(){
		return 1;
	}
	
}
