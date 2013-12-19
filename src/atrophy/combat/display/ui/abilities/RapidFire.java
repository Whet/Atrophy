package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.RapidFireEffect;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


public class RapidFire extends AbilityButton implements InfoTextDisplayable{

	public RapidFire(BufferedImage image) {
		super(image);
	}
	
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		if(!combatMembersManager.getCurrentAi().hasEffect(RapidFireEffect.NAME) || combatMembersManager.getCurrentAi().getEffect(RapidFireEffect.NAME).getCooldown() == 0)
			mouseAbilityHandler.setAbility(Abilities.RAPID_FIRE);
		combatUiManager.updateUi();
		
		return super.mC(mousePosition, e);
	}
	
	@Override
	public void mI(Point mousePosition){
		combatUiManager.getInfoText().setInfoText(this);
	}
	
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	public String getUiHint(){
		if(combatMembersManager.getCurrentAi().hasEffect(RapidFireEffect.NAME)){
			return Abilities.RAPID_FIRE + "  Cooldown: "+ combatMembersManager.getCurrentAi().getEffect(RapidFireEffect.NAME).getCooldown();
		}
		else{
			return Abilities.RAPID_FIRE;
		}
	}
	
	public int getHintLines(){
		return 1;
	}
	
	@Override
	public void setVisible(boolean visible){
		if(!visible){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		super.setVisible(visible);
	}
	
}
