package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

public class DrawFovToggle extends ButtonMulti implements InfoTextDisplayable{

	private CombatVisualManager combatVisualManager;
	private CombatUiManager combatUiManager;

	public DrawFovToggle(CombatVisualManager combatVisualManagers, CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.combatVisualManager = combatVisualManagers;
		this.combatUiManager = combatUiManagers;
	}
	
	@Override
	public boolean mC(Point mousePosition, MouseEvent e){
		this.nextFrame(true);
		if(this.getFrame() == 0){
			combatVisualManager.setDrawingFov(true);
		}
		else{
			combatVisualManager.setDrawingFov(false);
		}
		
		// update Ui to reflect whether fov drawing is in effect
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
		if(combatVisualManager.isDrawingFov()){
			return "F.O.V guides drawn";
		}
		return "F.O.V guides hidden";
	}
	
	@Override
	public int getHintLines(){
		return 1;
	}
	
	
}
