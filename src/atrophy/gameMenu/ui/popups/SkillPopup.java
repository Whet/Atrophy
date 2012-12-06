/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.SquadMenu;
import atrophy.gameMenu.ui.WindowManager;

/**
 * The Class SkillPopup.
 */
public class SkillPopup extends Popup {
	
	/**
	 * Instantiates a new skill popup.
	 *
	 * @param squadMember the squad member
	 * @param skill the skill
	 */
	public SkillPopup(Squaddie squadMember, String skill) {
		super(new Text("", 0, 0, "Are you sure you want to increase " + skill + " for " + ShopManager.getInstance().abilityCost(squadMember,skill) + "?"),getOptions(squadMember,skill));
	}

	/**
	 * Gets the options.
	 *
	 * @param squadMember the squad member
	 * @param skill the skill
	 * @return the options
	 */
	private static TextButton[] getOptions(final Squaddie squadMember, final String skill) {
		TextButton[] options = new TextButton[2];
		
		options[0] = new TextButton("",Color.green,Color.green.darker()) {
			
			{
				this.setText("Increase Skill");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				SquadMenu.getSquad().payAdvance(ShopManager.getInstance().abilityCost(squadMember,skill));
				squadMember.setSkillLevel(skill, squadMember.getSkillLevel(skill) + 1);	
				WindowManager.getInstance().setPopupOpen(false);
				return true;
			}
			
		};
		
		options[1] = new TextButton("",Color.yellow,Color.red) {
			
			{
				this.setText("Cancel");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				WindowManager.getInstance().setPopupOpen(false);
				return true;
			}
			
		};
		
		return options;
	}

}
