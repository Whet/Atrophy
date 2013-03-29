/*
 * 
 */
package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.display.ui.InfoTextDisplayable;


// TODO: Auto-generated Javadoc
/**
 * The Class StashSearchAction.
 */
public class StashSearchAction extends AbilityButton implements InfoTextDisplayable{

	/**
	 * Instantiates a new stash search action.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public StashSearchAction(BufferedImage image) {
		super(image);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().stashSearch();
		
		return super.mC(mousePosition, e);
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
		return "Search Stash";
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible){
		if(!visible){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		super.setVisible(visible);
	}
	
}
