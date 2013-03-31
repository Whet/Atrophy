/*
 * 
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
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.InfoTextDisplayable;

public class AiImage extends AiImageRoster implements InfoTextDisplayable{
	
	private PanningManager panningManager;
	private CombatUiManager combatUiManager;
	private AiCrowd aiCrowd;
	
	private boolean dragging;
	private CombatVisualManager combatVisualManager;
	private MouseAbilityHandler mouseAbilityHandler;
	
	private int frame, maxFrame;
	private Animation animation;
	private boolean imageChanged;
	
	public AiImage(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, PanningManager panningManager, double x, double y, MouseAbilityHandler mouseAbilityHandler){
		super(aiCrowd, combatMembersManager, null, x, y);
		this.setZ(2);
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatUiManager = combatUiManager;
		this.combatVisualManager = combatVisualManager;
		this.mouseAbilityHandler = mouseAbilityHandler;
		
		this.animation = Animation.IDLE;
		this.frame = 0;
		this.maxFrame = 1;
		this.imageChanged = false;
	}
	
	@Override
	public AffineTransform getTransformationForDrawing(){
		super.getTransformation().setToTranslation(this.getLocation()[0] + panningManager.getOffset()[0],
												   this.getLocation()[1] + panningManager.getOffset()[1]);
		super.getTransformation().scale(this.getScale(),this.getScale());
		super.getTransformation().rotate(this.getRotation(), this.getSize()[0] / 2, this.getSize()[1] / 2);
		
		return super.getTransformation();
	}

	public void updateImage(){
		dragging = false;
		combatVisualManager.setDraggableAi(null);
		this.setLocation(this.getAi().getLocation()[0] - (this.getSize()[0] * 0.5), this.getAi().getLocation()[1] - (this.getSize()[1] * 0.68));
		
		if(this.getAi().isDead()){
			this.setZ(1);
			// Cancel stealth effect
			this.setAlpha(1.0f);
			this.setAnimation(Animation.DEAD, 1);
		}
		
		this.applyEffects();
	}

	public void updateMask(){
		if(this.getAi().isDead()){
			this.setZ(1);
			// Cancel stealth effect
			this.setAlpha(1.0f);
			this.setAnimation(Animation.DEAD, 1);
		}
		
		this.applyEffects();
	}
	
	public void updateTween(){
		this.setTween(new MotionTween(this, this.getAi().getLocation()[0] - (this.getSize()[0] * 0.5), this.getAi().getLocation()[1] - (this.getSize()[1] * 0.68), 2400, true));
	}
	
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
	
	public boolean mD(Point mousePosition, MouseEvent e){
		if(combatVisualManager.isTabled() && CombatKeyboardHandler.SHIFT_DOWN && combatVisualManager.getDraggableAi() == null){
			dragging = true;
			combatVisualManager.setDraggableAi(this.getAi());
			return true;
		}
		return false;
	}

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
	
	public boolean mC(Point mousePosition, MouseEvent e){
		if(!mouseAbilityHandler.isSettingAbility()){
			
			// Not dead and not ally and in the same room, aim weapon at this ai
			if(!this.getAi().isDead() && !this.getAi().getFaction().equals("Player")){
				
				if(CombatVisualManager.isInFiringSight(combatMembersManager.getCurrentAi().getLocation()[0], combatMembersManager.getCurrentAi().getLocation()[1], this.getAi().getLocation()[0], this.getAi().getLocation()[1], this.getAi().getLevelBlock())){
					combatMembersManager.getCurrentAi().aim(this.getAi());
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

	@Override
	public boolean isInBounds(double x, double y){
		return super.isInBounds(x - panningManager.getOffset()[0],
								y - panningManager.getOffset()[1]);
	}
	
	public String getUiHint(){
		return this.getAi().getFaction() + ": " + this.getAi().getName();
	}
	
	public int getHintLines(){
		return 1;
	}
	
	@Override
	public void setVisible(boolean visible){
		super.setVisible(visible);
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	@Override
	public boolean isActive() {
		if(!this.isVisible()){
			return false;
		}
		return super.isActive();
	}
	
	private void applyEffects(){
		if(this.getAi().isStealthed()){
			this.setAlpha(0.5f);
		}
		else{
			this.setAlpha(1.0f);
		}
	}
	
	@Override
	public void setAi(Ai aiObject) {
		super.setAi(aiObject);
		updateAnimation();
	}
	
	private void setAnimation(Animation animation, int maxFrame) {
		this.frame = 0;
		this.maxFrame = maxFrame;
		this.animation = animation;
		this.imageChanged = true;
	}

	public void updateAnimation() {
		
		if(!this.getAi().isDead())
			this.frame++;

		if(this.frame == maxFrame && !this.getAi().isDead()) {
			this.setAnimation(animation, 4);
		}
		
		this.setImage(aiCrowd.getAnimationFrame(this.getAi().getImage() + "Full", frame, animation));
		
		if(imageChanged) {
			this.imageChanged = false;
			this.setLocation(this.getAi().getLocation()[0] - (this.getSize()[0] * 0.5), this.getAi().getLocation()[1] - (this.getSize()[1] * 0.68));
		}
	}
	
}
