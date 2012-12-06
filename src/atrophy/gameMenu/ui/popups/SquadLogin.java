/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.sounds.SoundBoard;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.MissionsMenu;
import atrophy.gameMenu.ui.SquadMenu;
import atrophy.gameMenu.ui.WindowManager;

/**
 * The Class SquadLogin.
 */
public class SquadLogin extends Popup {
	
	/**
	 * Instantiates a new squad login.
	 */
	public SquadLogin() {
		super(new Text("",0,0,"Select a Squad Member to Login"), squadButtons());
	}

	/**
	 * Squad buttons.
	 *
	 * @return the text button[]
	 */
	private static TextButton[] squadButtons() {
		TextButton[] buttons = new TextButton[SquadMenu.getSquad().getSquad().size()];
		
		for(int i = 0; i < SquadMenu.getSquad().getSquad().size(); i++){
			
			final Squaddie member = SquadMenu.getSquad().getSquad().get(i);
			
			buttons[i] = new TextButton("", Color.yellow, Color.red) {
				
				@Override
				public boolean mU(Point mousePosition, MouseEvent e) {
					Missions.getInstance().setInteractingMember(member);
					WindowManager.getInstance().setPopupOpen(false);
					WindowManager.getInstance().addWindow(new MissionsMenu());
					SoundBoard.getInstance().playEffect("tick");
					return true;
				}
				
			};
			
			buttons[i].setText(SquadMenu.getSquad().getSquad().get(i).getName());
		}
		
		return buttons;
	}

}
