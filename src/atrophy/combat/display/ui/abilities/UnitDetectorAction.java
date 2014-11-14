package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.ai.Faction;
import atrophy.combat.display.ui.InfoTextDisplayable;


public class UnitDetectorAction extends AbilityButton implements InfoTextDisplayable{

	public UnitDetectorAction(BufferedImage image) {
		super(image);
	}
	
	@Override 
	public boolean mC(Point mousePosition, MouseEvent e){		
		return true;
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
		return "Units in Area:@n" +
			   "Bandits: " + combatMembersManager.getUnitCount(Faction.BANDITS,true) + "@n" +
			   "White Vista: " + combatMembersManager.getUnitCount(Faction.WHITE_VISTA,true) + "@n" +
				"Other: " + (combatMembersManager.getUnitCount(Faction.PLAYER,true) + combatMembersManager.getUnitCount(Faction.LONER,true));
	}
	
	@Override
	public int getHintLines(){
		return 4;
	}
	
	@Override
	public void setVisible(boolean visible){
		if(!visible){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		super.setVisible(visible);
	}
	
}
