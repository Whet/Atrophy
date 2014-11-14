package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;


public class SpeechAction extends AbilityButton implements InfoTextDisplayable{

	public SpeechAction(BufferedImage image) {
		super(image);
	}
	
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){
		mouseAbilityHandler.setAbility(Abilities.SPEECH);
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
		return "Open Speech Menu";
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
