/*
 * 
 */
package atrophy.combat.actions;

import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.actions.ActionRegion;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelManager;

// TODO: Auto-generated Javadoc
/**
 * The Class CombatMouseHandler.
 */
public class CombatMouseHandler extends ActionRegion {
	
	/**
	 * The z.
	 */
	private int z;

	private PanningManager panningManager;
	private CombatMembersManager combatMembersManager;
	private CombatUiManager combatUiManager;
	private MouseAbilityHandler mouseAbilityHandler;
	private CombatVisualManager combatVisualManager;
	private LevelManager levelManager;
	
	/**
	 * Instantiates a new combat mouse handler.
	 */
	public CombatMouseHandler(LevelManager levelManager, MouseAbilityHandler mouseAbilityHandler, AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite) {
		super(0, 0, DisplayManager.getInstance().getResolution()[0], DisplayManager.getInstance().getResolution()[1]);
		z = 0;

		this.levelManager = levelManager;
		this.combatMembersManager = aiManagementSuite.getCombatMembersManager();
		this.panningManager = uiUpdaterSuite.getPanningManager();
		this.combatVisualManager = uiUpdaterSuite.getCombatVisualManager();
		this.combatUiManager = uiUpdaterSuite.getCombatUiManager();
		this.mouseAbilityHandler = mouseAbilityHandler;
		
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.ActionRegion#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition){
		panningManager.updatePan();
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.ActionRegion#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mD(Point mousePosition, MouseEvent e){return false;}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.ActionRegion#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mU(Point mousePosition, MouseEvent e){
		// shift click makes ai look at point
		if(CombatKeyboardHandler.SHIFT_DOWN && !combatVisualManager.isTabled()){
			double pointDouble[] = {mousePosition.x - panningManager.getOffset()[0],
									mousePosition.y - panningManager.getOffset()[1]};
			
			combatMembersManager.getCurrentAi().setLookAngle(pointDouble);
			
			mouseAbilityHandler.cancelAbilitySetting();
		}
		// if the mouse click is used to set up an ability e.g point where a grenade is thrown
		// then pass the click to the ability handler
		else if(mouseAbilityHandler.isSettingAbility()){
				mouseAbilityHandler.applyAbility(mousePosition);
				return true;
		}
		
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.ActionRegion#rMU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean rMU(Point mousePosition, MouseEvent e){
		
		// only place move flag if in map
		if(combatMembersManager.getCurrentAi() != null &&
		   levelManager.getCurrentLevel().isInBounds(mousePosition.x - panningManager.getOffset()[0],
				                                                   mousePosition.y - panningManager.getOffset()[1]) &&
				                                                   
																   mousePosition.x != combatMembersManager.getCurrentAi().getLocation()[0] && 
																   mousePosition.y != combatMembersManager.getCurrentAi().getLocation()[1])
		    {
			
			// set move flag position
			combatUiManager.getMoveFlag().setAiMoveLocation(mousePosition.x - panningManager.getOffset()[0],
														    mousePosition.y - panningManager.getOffset()[1]);
			SoundBoard.getInstance().playEffect("cancel");
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.ActionRegion#mMC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mMC(Point mousePosition, MouseEvent e) {
		double pointDouble[] = {mousePosition.x - panningManager.getOffset()[0],
								mousePosition.y - panningManager.getOffset()[1]};

		combatMembersManager.getCurrentAi().setLookAngle(pointDouble);
		
		mouseAbilityHandler.cancelAbilitySetting();
		
		return true;
	}
	
	/**
	 * Gets the z.
	 *
	 * @return the z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * Sets the z.
	 *
	 * @param z the new z
	 */
	public void setZ(int z) {
		this.z = z;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.actions.ActionRegion#isInBounds(double, double)
	 */
	@Override
	public boolean isInBounds(double x, double y) {
		return true;
	}

}
