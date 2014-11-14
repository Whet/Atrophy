package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.combatEffects.Parrying;
import atrophy.combat.display.ui.InfoTextDisplayable;


public class ParryAction extends AbilityButton implements InfoTextDisplayable{

	public ParryAction(BufferedImage image) {
		super(image);
	}
	
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		combatMembersManager.getCurrentAi().addEffect(new Parrying());
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
		if(combatMembersManager.getCurrentAi().hasEffect(Parrying.NAME)){
			return "Parrying Duration: "+combatMembersManager.getCurrentAi().getEffect(Parrying.NAME).getDuration()+
					"  Cooldown: "+combatMembersManager.getCurrentAi().getEffect(Parrying.NAME).getCooldown();
		}
		else{
			return "Parrying Duration: "+ Parrying.DURATION + "  Cooldown: "+ Parrying.COOLDOWN;
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
