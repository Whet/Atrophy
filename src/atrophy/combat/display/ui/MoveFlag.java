package atrophy.combat.display.ui;

import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.PathNotFoundException;

public class MoveFlag extends ButtonSingle implements InfoTextDisplayable{
	
	private PanningManager panningManager;
	private CombatUiManager combatUiManager;
	private CombatMembersManager combatMembersManager;
	
	public MoveFlag(PanningManager panningManager, CombatUiManager combatUiManager, CombatMembersManager combatMembersManager, BufferedImage image, boolean visible) {
		super(image, visible);
		this.panningManager = panningManager;
		this.combatUiManager = combatUiManager;
		this.combatMembersManager = combatMembersManager;
	}
	
	// edited transformation to account for panning
	@Override
	public AffineTransform getTransformationForDrawing(){
		super.getTransformation().setToTranslation(this.getLocation()[0] + panningManager.getOffset()[0],
												   this.getLocation()[1] + panningManager.getOffset()[1]);
		super.getTransformation().scale(this.getScale(),this.getScale());
		return super.getTransformation();
	}
	
	@Override
	public void setLocation(double x, double y){
		super.setLocation(x - (this.getSize()[0] * 0.5), y - (this.getSize()[1] * 0.5));
	}
	
	// sets flag position and ai target location
	public void setAiMoveLocation(double x, double y){
		try{
			combatMembersManager.getCurrentAi().setMoveLocation(x,y,true);
			
			super.setLocation(combatMembersManager.getCurrentAi().getMoveLocation()[0] - (this.getSize()[0] * 0.5),
					          combatMembersManager.getCurrentAi().getMoveLocation()[1] - (this.getSize()[1] * 0.5));
			
			if(Maths.getDistance(combatMembersManager.getCurrentAi().getMoveLocation(), combatMembersManager.getCurrentAi().getLocation()) > 0){
				combatMembersManager.getCurrentAi().setAction("Move");
				this.setVisible(true);
			}
		}
		catch(PathNotFoundException pnfe){
			combatMembersManager.getCurrentAi().setMoveLocationToSelf();
			combatMembersManager.getCurrentAi().setAction("");
			combatUiManager.updateUi();
			this.setVisible(false);
		}
	}
	
	// used when swapping ai, updates the flag image without changing ai properties
	public void updateLocation(){
		if(combatMembersManager.getCurrentAi() != null){
			super.setLocation(combatMembersManager.getCurrentAi().getMoveLocation()[0] - (this.getSize()[0] * 0.5) , 
							  combatMembersManager.getCurrentAi().getMoveLocation()[1] - (this.getSize()[1] * 0.5));
			
			// if ai is at location then hide flag
			if(combatMembersManager.getCurrentAi().getMoveLocation()[0] == combatMembersManager.getCurrentAi().getLocation()[0] &&
			   combatMembersManager.getCurrentAi().getMoveLocation()[1] == combatMembersManager.getCurrentAi().getLocation()[1]){
				this.setVisible(false);
			}
			else{
				this.setVisible(true);
			}
		}
		else{
			this.setVisible(false);
		}
	}
	
	@Override
	public void mI(Point mousePosition){
		if(this.isVisible()){
			combatUiManager.getInfoText().setInfoText(this);
		}
	}
	
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	@Override
	public boolean isInBounds(double x, double y){
		return super.isInBounds(x - panningManager.getOffset()[0],
								y - panningManager.getOffset()[1]);
	}
	
	@Override
	public String getUiHint(){
		if(combatMembersManager.getCurrentAi() != null){
			return // UIhint is turns to get to flag for the player
				   ("Turns to destination " + Math.ceil(Maths.getDistance(combatMembersManager.getCurrentAi().getLocation(), 
						   												  combatMembersManager.getCurrentAi().getMoveLocation()) / 
						   												  combatMembersManager.getCurrentAi().getMoveDistance()));
		}
		return "";
	}
	
	@Override
	public int getHintLines(){
		return 1;
	}
	
	@Override
	public void setVisible(boolean visible){
		super.setVisible(visible);
		
		if(visible == false){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		else{
			combatUiManager.getActionText().setMode("Move");
		}
	}
}
