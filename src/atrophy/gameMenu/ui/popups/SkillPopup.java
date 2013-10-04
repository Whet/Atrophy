package atrophy.gameMenu.ui.popups;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.WindowManager;

public class SkillPopup extends Popup {
	
	public SkillPopup(Squaddie squadMember, String skill, WindowManager windowManager, Squad squad) {
		super(windowManager, new Text(0, 0, "Are you sure you want to increase " + skill + " for " + ShopManager.abilityCost(squadMember,skill) + "?"),getOptions(squad, windowManager,squadMember,skill));
	}

	private static TextButton[] getOptions(final Squad squad, final WindowManager windowManager, final Squaddie squadMember, final String skill) {
		TextButton[] options = new TextButton[2];
		
		options[0] = new TextButton(Color.green,Color.green.darker()) {
			
			{
				this.setText("Increase Skill");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				squad.payAdvance(ShopManager.abilityCost(squadMember,skill));
				squadMember.setSkillLevel(skill, squadMember.getSkillLevel(skill) + 1);	
				windowManager.setPopupOpen(false);
				return true;
			}
			
		};
		
		options[1] = new TextButton(Color.yellow,Color.red) {
			
			{
				this.setText("Cancel");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				windowManager.setPopupOpen(false);
				return true;
			}
			
		};
		
		return options;
	}
	
	@Override
	public String[] getMenuInfo() {
		return null;
	}


}
