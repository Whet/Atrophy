/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.InfoTextDisplayable;

// TODO: Auto-generated Javadoc
/**
 * The Class DrawDoorToggle.
 */
public class DrawDoorToggle extends ButtonMulti implements InfoTextDisplayable{

	private FloatingIcons floatingIcons;
	private CombatUiManager combatUiManager;

	/**
	 * Instantiates a new draw door toggle.
	 *
	 * @param image the image
	 */
	public DrawDoorToggle(FloatingIcons floatingIcons, CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.floatingIcons = floatingIcons;
		this.combatUiManager = combatUiManagers;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
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
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition){
		combatUiManager.getInfoText().setInfoText(this);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getUiHint()
	 */
	public String getUiHint(){
		// Show if radio silence engaged
		if(floatingIcons.isDrawingDoors()){
			return "Doors Drawn";
		}
		return "Doors Hidden";
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
	
	
}
