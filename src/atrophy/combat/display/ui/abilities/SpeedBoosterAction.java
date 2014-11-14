package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.SpeedBoost;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


public class SpeedBoosterAction extends AbilityButton implements InfoTextDisplayable{

	public SpeedBoosterAction(BufferedImage image) {
		super(image);
	}
	
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().addEffect(new SpeedBoost(combatMembersManager.getCurrentAi().getSkillLevel(Abilities.SPEED_BOOSTER)));
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
		if(combatMembersManager.getCurrentAi().hasEffect(SpeedBoost.NAME)){
			return "Speed Booster Duration: " + combatMembersManager.getCurrentAi().getEffect(SpeedBoost.NAME).getDuration()+
					"  Cooldown: "+combatMembersManager.getCurrentAi().getEffect(SpeedBoost.NAME).getCooldown();
		}
		else{
			return "Speed Booster Duration: "+ SpeedBoost.DURATION + "  Cooldown: "+ SpeedBoost.COOLDOWN;
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
