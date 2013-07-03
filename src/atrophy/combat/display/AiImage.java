/*
 * 
 */
package atrophy.combat.display;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import watoydoEngine.display.tweens.MotionTween;
import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.CombatKeyboardHandler;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.items.DaemonWeapon;
import atrophy.combat.items.Harpoon1;
import atrophy.combat.items.Harpoon2;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.MeleeWeapon2;
import atrophy.combat.items.Pistol1;
import atrophy.combat.items.Pistol2;
import atrophy.combat.items.Pistol3;
import atrophy.combat.items.Pistol4;
import atrophy.combat.items.Plasma1;
import atrophy.combat.items.Plasma2;
import atrophy.combat.items.Railgun;
import atrophy.combat.items.Shotgun1;

public class AiImage extends AiImageRoster implements InfoTextDisplayable{
	
	private static final Map<Animation, double[]> ANIMATION_OFFSETS = new HashMap<>();
	protected int attackFrame = 5;
	
	{
		ANIMATION_OFFSETS.put(Animation.DEAD, 			new double[]{0.5, 0.86});
		ANIMATION_OFFSETS.put(Animation.WALK, 			new double[]{0.5, 0.86});
		
		ANIMATION_OFFSETS.put(Animation.IDLE_MELEE, 	new double[]{0.5, 0.86});
		ANIMATION_OFFSETS.put(Animation.IDLE_WEP1, 		new double[]{0.40, 0.86});
		ANIMATION_OFFSETS.put(Animation.IDLE_WEP2, 		new double[]{0.28, 0.74});
		ANIMATION_OFFSETS.put(Animation.IDLE_WEP3, 		new double[]{0.25, 0.74});
		
		ANIMATION_OFFSETS.put(Animation.ATTACK_MELEE, 	new double[]{0.3, 0.74});
		ANIMATION_OFFSETS.put(Animation.ATTACK_WEP1, 	new double[]{0.24, 0.73});
		ANIMATION_OFFSETS.put(Animation.ATTACK_WEP2, 	new double[]{0.28, 0.74});
		ANIMATION_OFFSETS.put(Animation.ATTACK_WEP3, 	new double[]{0.25, 0.74});
	}
	
	protected double xOffset = 0.5;
	protected double yOffset = 0.86;
	
	protected FloatingIcons floatingIcons;
	protected PanningManager panningManager;
	private CombatUiManager combatUiManager;
	protected AiCrowd aiCrowd;
	
	private boolean dragging;
	private CombatVisualManager combatVisualManager;
	private MouseAbilityHandler mouseAbilityHandler;
	
	protected int deathFrame;
	protected int frame;
	protected int maxFrame;
	protected Animation animation;
	protected boolean imageChanged;
	protected Ai attackTarget;
	
	public AiImage(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, PanningManager panningManager, double x, double y, MouseAbilityHandler mouseAbilityHandler, FloatingIcons floatingIcons){
		super(aiCrowd, combatMembersManager, null, x, y);
		this.setZ(2);
		
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatUiManager = combatUiManager;
		this.combatVisualManager = combatVisualManager;
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.floatingIcons = floatingIcons;
		
		this.animation = Animation.IDLE_MELEE;
		this.deathFrame = 0;
		this.frame = 0;
		this.maxFrame = 1;
		this.imageChanged = false;
	}
	
	@Override
	public AffineTransform getTransformationForDrawing(){
		super.getTransformation().setToTranslation((int)(this.getLocation()[0] - (this.getSize()[0] * xOffset) + panningManager.getOffset()[0]),
												   (int)(this.getLocation()[1] - (this.getSize()[1] * yOffset) + panningManager.getOffset()[1]));
		super.getTransformation().scale(this.getScale(),this.getScale());
		super.getTransformation().rotate(this.getRotation(), this.getSize()[0] / 2, this.getSize()[1] / 2);
		
		return super.getTransformation();
	}

	public void updateImage(){
		this.setTween(null);
		dragging = false;
		combatVisualManager.setDraggableAi(null);
		
		this.applyEffects();
		this.setLocation(this.getAi().getLocation()[0], this.getAi().getLocation()[1]);
	}
	
	public void updateMask(){
		if(this.getAi().isDead()){
			this.setLocation(this.getAi().getLocation()[0], this.getAi().getLocation()[1]);
		}
		
		this.applyEffects();
	}
	
	public void updateTween(){
		if(this.isVisible() && Maths.getDistance(this.getLocation()[0], this.getLocation()[1], this.getAi().getLocation()[0], this.getAi().getLocation()[1]) > 1) {
			this.setTween(new MotionTween(this, this.getAi().getLocation()[0], this.getAi().getLocation()[1], 6000, true));
		}
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
				this.setLocation(mousePosition.x - panningManager.getOffset()[0],
						         mousePosition.y - panningManager.getOffset()[1]);
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
			this.setLocation(mousePosition.x - panningManager.getOffset()[0],
					         mousePosition.y - panningManager.getOffset()[1]);
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
		return super.isInBounds(x + (this.getSize()[0] * xOffset) - panningManager.getOffset()[0],
								y + (this.getSize()[1] * yOffset) - panningManager.getOffset()[1]);
	}
	
	@Override
	public double[] getLocationCentre(){
		double editedLocation[] = {this.getLocation()[0] - (this.getSize()[0] * xOffset * 0.5), this.getLocation()[1] - (this.getSize()[1] * yOffset * 0.5)};
		return editedLocation;
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
		if(this.getAi().isStealthed() && !this.getAi().isDead()){
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
	
	public void setAnimation(Animation animation, int maxFrame) {
		this.frame = 0;
		this.maxFrame = maxFrame;
		
		if(!this.animation.equals(animation) && !animation.equals(Animation.WALK)) {
			this.animation = animation;
			this.imageChanged = true;
			this.setTween(null);
			this.setLocation(this.getAi().getLocation()[0], this.getAi().getLocation()[1]);
			updateAnimation();
		}
		
		this.animation = animation;
		
		double[] animationOffset = ANIMATION_OFFSETS.get(animation);
		this.xOffset = animationOffset[0];
		this.yOffset = animationOffset[1];
	}

	public void updateAnimation() {
		
		if(!this.getAi().isDead())
			this.frame++;
		else if(deathFrame < attackFrame)
			deathFrame++;
		
		if(this.frame >= maxFrame && !this.getAi().isDead()) {
			this.setAnimation(this.getIdleAnimation(), 4);
		}
		
		this.setImage(aiCrowd.getAnimationFrame(this.getAi().getImage() + "Full", frame, animation));
		
		if(deathFrame >= attackFrame && !this.animation.equals(Animation.DEAD)) {
			this.setAnimation(Animation.DEAD, 1);
			this.updateAnimation();
		}
		
		if(this.isVisible() && this.frame >= attackFrame &&
		  (this.animation.equals(Animation.ATTACK_MELEE) || this.animation.equals(Animation.ATTACK_WEP1) || this.animation.equals(Animation.ATTACK_WEP2) || this.animation.equals(Animation.ATTACK_WEP3))){
			floatingIcons.addEffect(this.getAi().getWeapon().getFireEffect(panningManager, this.getAi().getLocation(), attackTarget.getLocation()));
			attackTarget = null;
		}
		
		if(imageChanged) {
			this.imageChanged = false;
			updateImage();
		}
	}

	protected Animation getIdleAnimation() {
		String weapon = this.getAi().getWeapon().getName();
		
		switch(weapon) {
			case MeleeWeapon1.NAME:
			case MeleeWeapon2.NAME:
			case DaemonWeapon.NAME: 
				return Animation.IDLE_MELEE;
				
			case Harpoon1.NAME:
			case Harpoon2.NAME:
				return Animation.IDLE_WEP2;
				
			case Pistol1.NAME:
			case Pistol2.NAME:
			case Pistol3.NAME:
			case Pistol4.NAME:
				return Animation.IDLE_WEP1;
				
			case Plasma1.NAME:
			case Plasma2.NAME:
			case Shotgun1.NAME:
			case Railgun.NAME:
				return Animation.IDLE_WEP3;
				
			default:
				return Animation.IDLE_MELEE;
			
		}
	}
	
	public void setAttackingAnimation(Ai targetAi) {
		
		this.attackTarget = targetAi;
		
		int maxFrame = 6;
		
		if(this.getAi().getWeapon().isMelee())
			maxFrame = 5;

		this.setAnimation(getAttackAnimation(), maxFrame);
	}
	
	protected Animation getAttackAnimation() {
		String weapon = this.getAi().getWeapon().getName();
		
		switch(weapon) {
			case MeleeWeapon1.NAME:
			case MeleeWeapon2.NAME:
				return Animation.ATTACK_MELEE;
				
			case Harpoon1.NAME:
			case Harpoon2.NAME:
				return Animation.ATTACK_WEP2;
				
			case Pistol1.NAME:
			case Pistol2.NAME:
			case Pistol3.NAME:
			case Pistol4.NAME:
				return Animation.ATTACK_WEP1;
				
			case Plasma1.NAME:
			case Plasma2.NAME:
			case Shotgun1.NAME:
			case Railgun.NAME:
				return Animation.ATTACK_WEP3;
				
			default:
				return Animation.IDLE_MELEE;
			
		}
	}
	
}
