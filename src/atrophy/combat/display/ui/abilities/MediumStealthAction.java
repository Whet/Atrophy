/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.MobileInvisibility;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


// TODO: Auto-generated Javadoc
/**
 * The Class MediumStealthAction.
 */
public class MediumStealthAction extends AbilityButton implements InfoTextDisplayable{

	/**
	 * Instantiates a new medium stealth action.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public MediumStealthAction(String tag, BufferedImage image) {
		super(tag, image);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().addEffect(new MobileInvisibility(combatMembersManager.getCurrentAi().getSkillLevel(Abilities.STEALTH2)));
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
		if(combatMembersManager.getCurrentAi().hasActiveEffect(MobileInvisibility.NAME)){
			return "Medium Stealth Duration: "+combatMembersManager.getCurrentAi().getEffect(MobileInvisibility.NAME).getDuration()+
					"  Cooldown: "+combatMembersManager.getCurrentAi().getEffect(MobileInvisibility.NAME).getCooldown();
		}
		else{
			return "Medium Stealth Duration: "+ MobileInvisibility.DURATION + "  Cooldown: "+ MobileInvisibility.COOLDOWN;
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
