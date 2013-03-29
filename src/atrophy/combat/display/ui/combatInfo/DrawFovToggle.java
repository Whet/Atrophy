/*
 * 
 */
package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

// TODO: Auto-generated Javadoc
/**
 * The Class DrawFovToggle.
 */
public class DrawFovToggle extends ButtonMulti implements InfoTextDisplayable{

	private CombatVisualManager combatVisualManager;
	private CombatUiManager combatUiManager;

	/**
	 * Instantiates a new draw fov toggle.
	 *
	 * @param image the image
	 */
	public DrawFovToggle(CombatVisualManager combatVisualManagers, CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.combatVisualManager = combatVisualManagers;
		this.combatUiManager = combatUiManagers;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
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
		if(combatVisualManager.isDrawingFov()){
			return "F.O.V guides drawn";
		}
		return "F.O.V guides hidden";
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
	
	
}
