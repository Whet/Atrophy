package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.StationaryInvisibility;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


public class LightStealthAction extends AbilityButton implements InfoTextDisplayable{

	public LightStealthAction(BufferedImage image) {
		super(image);
	}
	
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().addEffect(new StationaryInvisibility(combatMembersManager.getCurrentAi().getSkillLevel(Abilities.STEALTH1)));
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
	
	@Override
	public String getUiHint(){
		if(combatMembersManager.getCurrentAi().hasEffect(StationaryInvisibility.NAME)){
			return "Stationary Stealth Duration: "+combatMembersManager.getCurrentAi().getEffect(StationaryInvisibility.NAME).getDuration()+
					"  Cooldown: "+combatMembersManager.getCurrentAi().getEffect(StationaryInvisibility.NAME).getCooldown();
		}
		else{
			return "Stationary Stealth Duration: "+ StationaryInvisibility.DURATION + "  Cooldown: "+ StationaryInvisibility.COOLDOWN;
		}
	}
	
	@Override
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
