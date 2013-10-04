package atrophy.combat.display.ui.combatInfo;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonMulti;
import atrophy.combat.mechanics.TurnProcess;

public class EndTurnButton extends ButtonMulti {

	private TurnProcess turnProcess;

	public EndTurnButton(BufferedImage[] images, TurnProcess turnProcess) {
		super(images);
		this.turnProcess = turnProcess;
		this.setPlaying(false);
	}

	@Override
	public boolean mU(Point mousePosition, MouseEvent e) {
		turnProcess.endTurn();				
		return true;
	}
	
	@Override
	public void mI(Point mousePosition) {
		this.setFrame(1);
	}
	
	@Override
	public void mO(Point mousePosition) {
		this.setFrame(0);
	}
	
}
