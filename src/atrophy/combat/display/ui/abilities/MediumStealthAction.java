package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.MobileInvisibility;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


public class MediumStealthAction extends AbilityButton implements InfoTextDisplayable{

	public MediumStealthAction(BufferedImage image) {
		super(image);
	}
	
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().addEffect(new MobileInvisibility(combatMembersManager.getCurrentAi().getSkillLevel(Abilities.STEALTH2)));
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
		if(combatMembersManager.getCurrentAi().hasEffect(MobileInvisibility.NAME)){
			return "Medium Stealth Duration: "+combatMembersManager.getCurrentAi().getEffect(MobileInvisibility.NAME).getDuration()+
					"  Cooldown: "+combatMembersManager.getCurrentAi().getEffect(MobileInvisibility.NAME).getCooldown();
		}
		else{
			return "Medium Stealth Duration: "+ MobileInvisibility.DURATION + "  Cooldown: "+ MobileInvisibility.COOLDOWN;
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
