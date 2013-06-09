package atrophy.combat.levelAssets;

import java.awt.image.BufferedImage;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.MapPainter;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.ScoringMechanics;

public class Grenade implements NonCharacterEntity{
	
	public static final int FUSE_TIME = 5;
	
	private boolean expired;
	private double[] location;
	private double angleHeading;
	private double momentum;
	protected LevelBlock room;
	private byte counter;
	private int skillLevel;
	protected Ai originator;
	protected AiCrowd aiCrowd;
	protected FloatingIcons floatingIcons;
	private LevelManager levelManager;

	public Grenade(AiCrowd aiCrowd, FloatingIcons floatingIcons, LevelManager levelManager, Ai originator, double[] location, double angleHeading, double momentum, int skillLevel){

		this.originator = originator;
		this.location = location;
		this.angleHeading = angleHeading;
		this.momentum = momentum;
		
		this.room = levelManager.getBlock(location);
		
		counter = FUSE_TIME;
		
		expired = false;
		
		this.skillLevel = skillLevel;
		
		this.aiCrowd = aiCrowd;
		this.floatingIcons = floatingIcons;
		this.levelManager = levelManager;
	}

	protected Grenade(AiCrowd aiCrowd, FloatingIcons floatingIcons, LevelManager levelManager, Ai originator, double[] location, double angleHeading, double momentum, byte fuseTime) {
		
		this.location = location;
		this.angleHeading = angleHeading;
		this.momentum = momentum;
		
		this.originator = originator;
		
		this.room = levelManager.getBlock(location);
		
		counter = fuseTime;
		
		expired = false;
		

		this.aiCrowd = aiCrowd;
		this.floatingIcons = floatingIcons;
		this.levelManager = levelManager;
	}

	/**
	 * Move.
	 */
	private void move() {		
		
		double[] newLocation = {this.location[0] + Math.cos(angleHeading) * this.momentum, this.location[1] += Math.sin(angleHeading) * this.momentum};
		
		if(levelManager.getBlock(this.location) != levelManager.getBlock(newLocation)){
			this.explode();
		}
		else{
			this.location = newLocation;
		}
		
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.LevelAsset#getLocation()
	 */
	@Override
	public double[] getLocation() {
		return this.location;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.LevelAsset#act()
	 */
	@Override
	public void act() {
		
		move();
		
		counter--;
		
		if(counter == 0){
			this.explode();
		}
	}
	
	/**
	 * Explode.
	 */
	protected void explode(){
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActor(i).getLevelBlock() == this.room && ScoringMechanics.grenadeDamage(aiCrowd.getActor(i), skillLevel) && 
			   CombatVisualManager.isInFiringSight(this.getLocation()[0], this.getLocation()[1], aiCrowd.getActor(i).getLocation()[0], aiCrowd.getActor(i).getLocation()[1], this.room)){
				
				aiCrowd.getActor(i).setDead(originator, true);
			}
		}
		
		expired = true;
		
		floatingIcons.addPendingPaint(MapPainter.EFFECT_SCARS[0], this.getLocation(), 0.8);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.LevelAsset#isExpired()
	 */
	public boolean isExpired(){
		return this.expired;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.LevelAsset#getImageName()
	 */
	public BufferedImage getImage(){
		return floatingIcons.getImage(GrenadeItem.NAME);
	}
	
	/**
	 * Sets the expired.
	 *
	 * @param expired the new expired
	 */
	protected void setExpired(boolean expired){
		this.expired = expired;
	}
	
	/**
	 * Gets the room.
	 *
	 * @return the room
	 */
	protected LevelBlock getRoom(){
		return this.room;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.LevelAsset#getOriginator()
	 */
	@Override
	public Ai getOriginator() {
		return this.originator;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.LevelAsset#getLife()
	 */
	@Override
	public int getLife() {
		return this.counter;
	}

}
