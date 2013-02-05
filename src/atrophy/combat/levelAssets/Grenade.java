/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
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

// TODO: Auto-generated Javadoc
/**
 * The Class Grenade.
 */
public class Grenade implements LevelAsset{
	
	/**
	 * The Constant FUSE_TIME.
	 */
	public static final int FUSE_TIME = 5;
	
	/**
	 * The expired.
	 */
	private boolean expired;
	
	/**
	 * The location.
	 */
	private double[] location;
	
	/**
	 * The angle heading.
	 */
	private double angleHeading;
	
	/**
	 * The momentum.
	 */
	private double momentum;
	
	/**
	 * The room.
	 */
	protected LevelBlock room;
	
	/**
	 * The counter.
	 */
	private byte counter;
	
	/**
	 * The skill level.
	 */
	private int skillLevel;
	
	/**
	 * The originator.
	 */
	protected Ai originator;
	
	protected AiCrowd aiCrowd;
	protected FloatingIcons floatingIcons;
	private LevelManager levelManager;

	private BufferedImage image;
	
	/**
	 * Instantiates a new grenade.
	 *
	 * @param originator the originator
	 * @param location the location
	 * @param angleHeading the angle heading
	 * @param momentum the momentum
	 * @param skillLevel the skill level
	 * @param levelManager 
	 */
	public Grenade(AiCrowd aiCrowd, FloatingIcons floatingIcons, LevelManager levelManager, Ai originator, double[] location, double angleHeading, double momentum, int skillLevel){

		this.image = floatingIcons.getImage(GrenadeItem.NAME);
		
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

	/**
	 * Instantiates a new grenade.
	 *
	 * @param originator the originator
	 * @param location the location
	 * @param angleHeading the angle heading
	 * @param momentum the momentum
	 * @param fuseTime the fuse time
	 */
	protected Grenade(String imageName, AiCrowd aiCrowd, FloatingIcons floatingIcons, LevelManager levelManager, Ai originator, double[] location, double angleHeading, double momentum, byte fuseTime) {
		
		this.image = floatingIcons.getImage(imageName);
		
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
				
				aiCrowd.getActor(i).setDead(true);
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
		return this.image;
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
