package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.InfoTextDisplayable;

public class DrawDoorToggle extends ButtonMulti implements InfoTextDisplayable{

	private FloatingIcons floatingIcons;
	private CombatUiManager combatUiManager;

	public DrawDoorToggle(FloatingIcons floatingIcons, CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.floatingIcons = floatingIcons;
		this.combatUiManager = combatUiManagers;
	}
	
	@Override
	public boolean mC(Point mousePosition, MouseEvent e){
		this.nextFrame(true);
		if(this.getFrame() == 0){
			floatingIcons.setDrawingDoors(true);
		}
		else{
			floatingIcons.setDrawingDoors(false);
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
		if(floatingIcons.isDrawingDoors()){
			return "Doors Drawn";
		}
		return "Doors Hidden";
	}
	
	@Override
	public int getHintLines(){
		return 1;
	}
	
	
}
