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

public class CombatMouseHandler extends ActionRegion {
	
	private int z;

	private PanningManager panningManager;
	private CombatMembersManager combatMembersManager;
	private CombatUiManager combatUiManager;
	private MouseAbilityHandler mouseAbilityHandler;
	private CombatVisualManager combatVisualManager;
	private LevelManager levelManager;

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
	
	@Override
	public void mI(Point mousePosition){
		panningManager.updatePan();
	}
	
	@Override
	public boolean mD(Point mousePosition, MouseEvent e){
		return false;
	}
	
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
			SoundBoard.getInstance().playEffect("tick");
			return true;
		}
		return false;
	}
	
	@Override
	public boolean mMC(Point mousePosition, MouseEvent e) {
		double pointDouble[] = {mousePosition.x - panningManager.getOffset()[0],
								mousePosition.y - panningManager.getOffset()[1]};

		combatMembersManager.getCurrentAi().setLookAngle(pointDouble);
		
		mouseAbilityHandler.cancelAbilitySetting();
		
		return true;
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public boolean isInBounds(double x, double y) {
		return true;
	}

}
