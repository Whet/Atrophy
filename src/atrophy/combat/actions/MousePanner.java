package atrophy.combat.actions;

import java.awt.Point;
import java.awt.event.MouseEvent;

import atrophy.combat.PanningManager;

import watoydoEngine.designObjects.actions.MouseRespondable;
import watoydoEngine.workings.displayActivity.ActivePane;

public class MousePanner implements MouseRespondable{

	private boolean mousePanning;
	private Point mousePanClickPoint;
	private double[] panAtClick;
	
	private PanningManager panningManager;
	private int actionZ;
	
	public MousePanner(PanningManager panningManager) {
		this.mousePanning = false;
		this.panningManager = panningManager;
		actionZ = 0;
	}

	@Override
	public boolean mD(Point mousePosition, MouseEvent e) {
		if(!mousePanning && !CombatKeyboardHandler.SHIFT_DOWN) {
			this.mousePanning = true;
			mousePanClickPoint = mousePosition;
			panAtClick = panningManager.getOffset().clone();
			return true;
		}
		else if(mousePanning) {
			return true;
		}
		return false;
	}

	@Override
	public boolean mU(Point mousePosition, MouseEvent e) {
		boolean wasPanning = this.mousePanning;
		this.mousePanning = false;
		return wasPanning;
	}

	@Override
	public boolean mC(Point mousePosition, MouseEvent e) {
		return false;
	}

	@Override
	public boolean rMD(Point mousePosition, MouseEvent e) {
		return false;
	}

	@Override
	public boolean rMU(Point mousePosition, MouseEvent e) {
		return false;
	}

	@Override
	public boolean rMC(Point mousePosition, MouseEvent e) {
		return false;
	}

	@Override
	public boolean mMC(Point mousePosition, MouseEvent e) {
		return false;
	}

	@Override
	public void mI(Point mousePosition) {
		if(mousePanning)
			panningManager.updatePan(this.mousePanClickPoint, mousePosition, panAtClick);
		
		if(!ActivePane.L_MOUSE_DOWN) {
			mousePanning = false;
		}
	}

	@Override
	public void mO(Point mousePosition) {
		
	}

	@Override
	public boolean isActive() {
		return true;
	}

	@Override
	public double[] getLocation() {
		return null;
	}

	@Override
	public boolean isInBounds(double x, double y) {
		return true;
	}

	@Override
	public void setLocation(double x, double y) {
		
	}

	@Override
	public void setActive(boolean active) {
		
	}

	@Override
	public int getActionZ() {
		return this.actionZ;
	}

	@Override
	public void setActionZ(int actionZ) {
		this.actionZ = actionZ;
	}

	
	
}
