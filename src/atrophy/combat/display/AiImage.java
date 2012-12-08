/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import watoydoEngine.display.tweens.MotionTween;
import watoydoEngine.gubbinz.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.CombatKeyboardHandler;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.ui.InfoTextDisplayable;

// TODO: Auto-generated Javadoc
/**
 * The Class AiImage.
 */
public class AiImage extends AiImageRoster implements InfoTextDisplayable{
	
	private PanningManager panningManager;
	private CombatUiManager combatUiManager;
	private AiCrowd aiCrowd;
	
	/**
	 * The dragging.
	 */
	private boolean dragging;
	private CombatVisualManager combatVisualManager;
	private MouseAbilityHandler mouseAbilityHandler;
	
	/**
	 * Instantiates a new ai image.
	 *
	 * @param tag the tag
	 * @param x the x
	 * @param y the y
	 * @param mouseAbilityHandler 
	 */
	public AiImage(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, PanningManager panningManager, String tag, double x, double y, MouseAbilityHandler mouseAbilityHandler){
		super(aiCrowd, combatMembersManager, tag, null, x, y);
		this.setZ(2);
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatUiManager = combatUiManager;
		this.combatVisualManager = combatVisualManager;
		this.mouseAbilityHandler = mouseAbilityHandler;
	}
	
	// The Void
	
	// edited transformation to account for panning
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#getTransformationForDrawing()
	 */
	@Override
	public AffineTransform getTransformationForDrawing(){
		super.getTransformation().setToTranslation(this.getLocation()[0] + panningManager.getOffset()[0],
												   this.getLocation()[1] + panningManager.getOffset()[1]);
		super.getTransformation().scale(this.getScale(),this.getScale());
		super.getTransformation().rotate(this.getRotation(), this.getSize()[0] / 2, this.getSize()[1] / 2);
		
		return super.getTransformation();
	}
	// Updates image to hold the mask of the this.getAi() and be at it's position
	/**
	 * Update image.
	 */
	public void updateImage(){
		dragging = false;
		combatVisualManager.setDraggableAi(null);
		this.setImage(aiCrowd.getBankedImage(this.getAi().getImage()));
		this.setLocation(this.getAi().getLocation()[0] - (this.getSize()[0] * 0.5), this.getAi().getLocation()[1] - (this.getSize()[1] * 0.68));
		
		if(this.getAi().isDead()){
			this.setZ(1);
			// Cancel stealth effect
			this.setAlpha(1.0f);
		}
		
		this.applyEffects();
	}
	// just changes mask
	/* (non-Javadoc)
	 * @see atrophy.combat.display.AiImageRoster#updateMask()
	 */
	public void updateMask(){
		this.setImage(aiCrowd.getBankedImage(this.getAi().getImage()));
		
		if(this.getAi().isDead()){
			this.setZ(1);
			// Cancel stealth effect
			this.setAlpha(1.0f);
		}
		
		this.applyEffects();
	}
	
	/**
	 * Update tween.
	 */
	public void updateTween(){
		this.setTween(new MotionTween(this, this.getAi().getLocation()[0] - (this.getSize()[0] * 0.5), this.getAi().getLocation()[1] - (this.getSize()[1] * 0.68), 2400, true));
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition){
		if(this.isVisible()){
			combatUiManager.getInfoText().setInfoText(this);
			
			if(!combatVisualManager.isTabled() || !CombatKeyboardHandler.SHIFT_DOWN && combatVisualManager.getDraggableAi() == this.getAi()){
				dragging = false;
				combatVisualManager.setDraggableAi(null);
			}
			
			if(dragging){
				this.setLocation(mousePosition.x - this.getSize()[0] * 0.5 - panningManager.getOffset()[0],
						         mousePosition.y - this.getSize()[1] * 0.5 - panningManager.getOffset()[1]);
				combatUiManager.updateUi();
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
		
		if(!combatVisualManager.isTabled() || !CombatKeyboardHandler.SHIFT_DOWN && combatVisualManager.getDraggableAi() == this.getAi()){
			dragging = false;
			combatVisualManager.setDraggableAi(null);
		}
		
		if(dragging){
			this.setLocation(mousePosition.x - this.getSize()[0] * 0.5 - panningManager.getOffset()[0],
					         mousePosition.y - this.getSize()[1] * 0.5 - panningManager.getOffset()[1]);
			combatUiManager.updateUi();
		}
	}
	
	// Interactions
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mD(Point mousePosition, MouseEvent e){
		if(combatVisualManager.isTabled() && CombatKeyboardHandler.SHIFT_DOWN && combatVisualManager.getDraggableAi() == null){
			dragging = true;
			combatVisualManager.setDraggableAi(this.getAi());
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.display.AiImageRoster#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mU(Point mousePosition, MouseEvent e){
		if(combatVisualManager.isTabled() && combatVisualManager.getDraggableAi() == this.getAi()){
			dragging = false;
			combatVisualManager.setDraggableAi(null);
			return true;
		}
		
		ArrayList<AiImage> ais = getAisNearMouse(mousePosition);
		
		if(ais.size() > 1){
			combatVisualManager.aimingCircle(ais);
			return true;
		}
		
		return false;	
	}
	
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.AiImageRoster#mC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mC(Point mousePosition, MouseEvent e){
		if(!mouseAbilityHandler.isSettingAbility()){
			
			// Not dead and not ally and in the same room, aim weapon at this ai
			if(!this.getAi().isDead() && !this.getAi().getFaction().equals("Player")){
				
				for(int i = 0; i < combatMembersManager.getCurrentAis().size(); i++){
					if(combatMembersManager.getCurrentAi(i).getLevelBlock() == this.getAi().getLevelBlock()){
						combatMembersManager.getCurrentAi(i).aim(this.getAi());
					}
			   }
			}
			// if not dead and ally then select them as current ai
			else if(!this.getAi().isDead() && this.getAi().getFaction().equals("Player")){
				combatMembersManager.changeCurrentAi(this.getAi());
				
				// Update ui to show info for the selected ai
				combatUiManager.getMoveFlag().updateLocation();
			}
			// is dead, transfer loot
			else if(this.getAi().isDead() && combatMembersManager.getCurrentAi() != null){
				combatMembersManager.getCurrentAi().loot(this.getAi());
			}
			
			combatUiManager.updateUi();
			
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the ais near mouse.
	 *
	 * @param point the point
	 * @return the ais near mouse
	 */
	private ArrayList<AiImage> getAisNearMouse(Point point) {
		ArrayList<AiImage> ais = new ArrayList<AiImage>();
		for(AiImage mask : aiCrowd.getMasks()){
			if(mask.isVisible()&&
		       Maths.getDistance(mask.getLocationCentre()[0],
					             mask.getLocationCentre()[1],
					             point.x - panningManager.getOffset()[0],
					             point.y - panningManager.getOffset()[1]) <= 20)
				ais.add(mask);
		}
		return ais;
	}

	// Getters
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
	public String getUiHint(){/*
		if(this.getAi() instanceof ThinkingAi){
			return "Aggression: "+ ((ThinkingAi) this.getAi()).getAggression();
		}*/
		// Show ai name prefixed with faction
		return this.getAi().getFaction() + ": " + this.getAi().getName();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
	
	// Setters
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible){
		super.setVisible(visible);
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#isActive()
	 */
	@Override
	public boolean isActive() {
		if(!this.isVisible()){
			return false;
		}
		return super.isActive();
	}
	
	/**
	 * Apply effects.
	 */
	private void applyEffects(){
		if(this.getAi().isStealthed()){
			this.setAlpha(0.5f);
		}
		else{
			this.setAlpha(1.0f);
		}
	}
	
}
