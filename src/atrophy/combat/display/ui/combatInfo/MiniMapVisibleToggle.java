package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

public class MiniMapVisibleToggle extends ButtonMulti implements InfoTextDisplayable{

	private CombatUiManager combatUiManager;

	public MiniMapVisibleToggle(CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.combatUiManager = combatUiManagers;
	}
	
	@Override
	public boolean mC(Point mousePosition, MouseEvent e){
		this.nextFrame(true);
		if(this.getFrame() == 0){
			combatUiManager.getMiniMap().setVisible(true);
		}
		else{
			combatUiManager.getMiniMap().setVisible(false);
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
		if(combatUiManager.getMiniMap().isVisible()){
			return "Minimap Visible";
		}
		return "Minimap Not Visible";
	}
	
	@Override
	public int getHintLines(){
		return 1;
	}
}
