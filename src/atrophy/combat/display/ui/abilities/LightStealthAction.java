/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.StationaryInvisibility;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


// TODO: Auto-generated Javadoc
/**
 * The Class LightStealthAction.
 */
public class LightStealthAction extends AbilityButton implements InfoTextDisplayable{

	/**
	 * Instantiates a new light stealth action.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public LightStealthAction(String tag, BufferedImage image) {
		super(tag, image);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().addEffect(new StationaryInvisibility(combatMembersManager.getCurrentAi().getSkillLevel(Abilities.STEALTH1)));
		combatUiManager.updateUi();
		
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
		if(combatMembersManager.getCurrentAi().hasActiveEffect(StationaryInvisibility.NAME)){
			return "Stationary Stealth Duration: "+combatMembersManager.getCurrentAi().getEffect(StationaryInvisibility.NAME).getDuration()+
					"  Cooldown: "+combatMembersManager.getCurrentAi().getEffect(StationaryInvisibility.NAME).getCooldown();
		}
		else{
			return "Stationary Stealth Duration: "+ StationaryInvisibility.DURATION + "  Cooldown: "+ StationaryInvisibility.COOLDOWN;
		}
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
