/*
 * 
 */
package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.SpeedBoost;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


// TODO: Auto-generated Javadoc
/**
 * The Class SpeedBoosterAction.
 */
public class SpeedBoosterAction extends AbilityButton implements InfoTextDisplayable{

	/**
	 * Instantiates a new speed booster action.
	 *
	 * @param tag the tag
	 * @param image the image
	 */
	public SpeedBoosterAction(BufferedImage image) {
		super(image);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().addEffect(new SpeedBoost(combatMembersManager.getCurrentAi().getSkillLevel(Abilities.SPEED_BOOSTER)));
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
		if(combatMembersManager.getCurrentAi().hasEffect(SpeedBoost.NAME)){
			return "Speed Booster Duration: " + combatMembersManager.getCurrentAi().getEffect(SpeedBoost.NAME).getDuration()+
					"  Cooldown: "+combatMembersManager.getCurrentAi().getEffect(SpeedBoost.NAME).getCooldown();
		}
		else{
			return "Speed Booster Duration: "+ SpeedBoost.DURATION + "  Cooldown: "+ SpeedBoost.COOLDOWN;
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
