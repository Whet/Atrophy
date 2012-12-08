package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.actions.MouseAbilityHandler;

import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.sounds.SoundBoard;

public abstract class AbilityButton extends ButtonSingle {

	protected MouseAbilityHandler mouseAbilityHandler;
	protected CombatMembersManager combatMembersManager;
	protected CombatUiManager combatUiManager;
	
	public AbilityButton(String tag, BufferedImage image) {
		super(tag, image);
	}
	
	@Override
	public boolean mC(Point mousePosition, MouseEvent e) {
		SoundBoard.getInstance().playEffect("tick");
		
		return true;
	}

	public void setMouseAbilityHandler(MouseAbilityHandler mouseAbilityHandler) {
		this.mouseAbilityHandler = mouseAbilityHandler;
	}

	public void setCombatMembersManager(CombatMembersManager combatMembersManager) {
		this.combatMembersManager = combatMembersManager;
	}

	public void setCombatUiManager(CombatUiManager combatUiManager) {
		this.combatUiManager = combatUiManager;
	}
	
}
