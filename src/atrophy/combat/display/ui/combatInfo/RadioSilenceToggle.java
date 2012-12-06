/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

// TODO: Auto-generated Javadoc
/**
 * The Class RadioSilenceToggle.
 */
public class RadioSilenceToggle extends ButtonMulti implements InfoTextDisplayable{

	private CombatUiManager combatUiManager;
	private CombatMembersManager combatMembersManager;

	/**
	 * Instantiates a new radio silence toggle.
	 *
	 * @param image the image
	 */
	public RadioSilenceToggle(CombatMembersManager combatMembersManagers, CombatUiManager combatUiManagers, BufferedImage[] image) {
		super("RadioSilenceToggle", image);
		this.combatMembersManager = combatMembersManagers;
		this.combatUiManager = combatUiManagers;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mC(Point mousePosition, MouseEvent e){
		this.nextFrame(true);
		if(this.getFrame() == 0){
			combatMembersManager.getTeamObject("1Player").setRadioSilence(false);
		}
		else{
			combatMembersManager.getTeamObject("1Player").setRadioSilence(true);
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
		if(combatMembersManager.getTeamObject("1Player").isDrawingIndividualSight()){
			return "Draw Individual Sight";
		}
		return "Draw Game Sight";
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
}
