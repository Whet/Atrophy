package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

public class IndividualLOSToggle extends ButtonMulti implements InfoTextDisplayable{

	private CombatUiManager combatUiManager;
	private CombatVisualManager combatVisualManager;

	public IndividualLOSToggle(CombatVisualManager combatVisualManager, CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.combatVisualManager = combatVisualManager;
		this.combatUiManager = combatUiManagers;
	}
	
	@Override
	public boolean mC(Point mousePosition, MouseEvent e){
		this.nextFrame(true);
		combatVisualManager.toggleDrawingIndividualSight();
		combatVisualManager.updateVisibleAi();
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
		if(!combatVisualManager.isDrawingIndividualSight()){
			return "Draw Individual Sight";
		}
		return "Draw Game Sight";
	}
	
	@Override
	public int getHintLines(){
		return 1;
	}
}
