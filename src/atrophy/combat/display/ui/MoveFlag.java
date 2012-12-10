/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.gubbinz.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.PathNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Class MoveFlag.
 */
public class MoveFlag extends ButtonSingle implements InfoTextDisplayable{
	
	private PanningManager panningManager;
	private CombatUiManager combatUiManager;
	private CombatMembersManager combatMembersManager;
	
	/**
	 * Instantiates a new move flag.
	 *
	 * @param image the image
	 * @param visible the visible
	 */
	public MoveFlag(PanningManager panningManager, CombatUiManager combatUiManager, CombatMembersManager combatMembersManager, BufferedImage image, boolean visible) {
		super(image, visible);
		this.panningManager = panningManager;
		this.combatUiManager = combatUiManager;
		this.combatMembersManager = combatMembersManager;
	}
	
	// edited transformation to account for panning
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#getTransformationForDrawing()
	 */
	@Override
	public AffineTransform getTransformationForDrawing(){
		super.getTransformation().setToTranslation(this.getLocation()[0] + panningManager.getOffset()[0],
												   this.getLocation()[1] + panningManager.getOffset()[1]);
		super.getTransformation().scale(this.getScale(),this.getScale());
		return super.getTransformation();
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#setLocation(double, double)
	 */
	public void setLocation(double x, double y){
		super.setLocation(x - (this.getSize()[0] * 0.5), y - (this.getSize()[1] * 0.5));
	}
	
	// sets flag position and ai target location
	/**
	 * Sets the ai move location.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void setAiMoveLocation(double x, double y){
		for(int i = 0; i < combatMembersManager.getCurrentAis().size(); i++){
			try{
				combatMembersManager.getCurrentAi(i).setMoveLocation(x,y,true);
				
				super.setLocation(combatMembersManager.getCurrentAi(i).getMoveLocation()[0] - (this.getSize()[0] * 0.5),
						          combatMembersManager.getCurrentAi(i).getMoveLocation()[1] - (this.getSize()[1] * 0.5));
				
				if(Maths.getDistance(combatMembersManager.getCurrentAi(i).getMoveLocation(), combatMembersManager.getCurrentAi(i).getLocation()) > 0){
					combatMembersManager.getCurrentAi(i).setAction("Move");
					this.setVisible(true);
				}
			}
			catch(PathNotFoundException pnfe){
				combatMembersManager.getCurrentAi(i).setMoveLocationToSelf();
				combatMembersManager.getCurrentAi(i).setAction("");
				combatUiManager.updateUi();
				this.setVisible(false);
			}
		}
	}
	
	// used when swapping ai, updates the flag image without changing ai properties
	/**
	 * Update location.
	 */
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
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition){
		if(this.isVisible()){
			combatUiManager.getInfoText().setInfoText(this);
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	// getters
	// edited inbounds for panning
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ButtonSingle#isInBounds(double, double)
	 */
	@Override
	public boolean isInBounds(double x, double y){
		return super.isInBounds(x - panningManager.getOffset()[0],
								y - panningManager.getOffset()[1]);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getUiHint()
	 */
	public String getUiHint(){
		if(combatMembersManager.getCurrentAi() != null){
			return // UIhint is turns to get to flag for the player
				   ("Turns to destination " + Math.ceil(Maths.getDistance(combatMembersManager.getCurrentAi().getLocation(), 
						   												  combatMembersManager.getCurrentAi().getMoveLocation()) / 
						   												  combatMembersManager.getCurrentAi().getMoveDistance()));
		}
		return "";
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
	
	// setters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#setVisible(boolean)
	 */
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
