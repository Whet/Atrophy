/*
 * 
 */
package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatUiManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

// TODO: Auto-generated Javadoc
/**
 * The Class MiniMapVisibleToggle.
 */
public class MiniMapVisibleToggle extends ButtonMulti implements InfoTextDisplayable{

	private CombatUiManager combatUiManager;

	/**
	 * Instantiates a new mini map visible toggle.
	 *
	 * @param image the image
	 */
	public MiniMapVisibleToggle(CombatUiManager combatUiManagers, BufferedImage[] image) {
		super(image);
		this.combatUiManager = combatUiManagers;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
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
		if(combatUiManager.getMiniMap().isVisible()){
			return "Minimap Visible";
		}
		return "Minimap Not Visible";
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
}
