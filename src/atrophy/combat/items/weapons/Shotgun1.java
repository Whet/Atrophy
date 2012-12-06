/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items.weapons;

import java.awt.Color;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;


// TODO: Auto-generated Javadoc
/**
 * The Class Shotgun1.
 */
public class Shotgun1 extends Weapon {
	
	// Combat Score
	// acc * ammo + damage = 140
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Heavy Shotgun";
	
	/**
	 * The Constant RANGE.
	 */
	public static final int RANGE = 200;
	
	/**
	 * The Constant ACCURACY.
	 */
	public static final int ACCURACY = 80 - Weapon.SWING_BONUS;
	
	/**
	 * The Constant TURNS_TO_RELOAD.
	 */
	public static final int TURNS_TO_RELOAD = 5;
	
	/**
	 * The Constant MAGAZINE_SIZE.
	 */
	public static final int MAGAZINE_SIZE = 1;
	
	/**
	 * The Constant MAX_SWING.
	 */
	public static final int MAX_SWING = 1;
	
	/**
	 * The Constant DAMAGE.
	 */
	public static final int DAMAGE = 60;
	
	/**
	 * The Constant DESCRIPTION.
	 */
	public static final String DESCRIPTION = "Accuracy: "+ACCURACY+" Damage: "+DAMAGE+" Magazine Size: "+MAGAZINE_SIZE + " Turns to Reload: "+TURNS_TO_RELOAD;
	
	//int range, int accuracy, int reloadTurns, int magSize, int maxSwing, int damage
	/**
	 * Instantiates a new shotgun1.
	 */
	public Shotgun1(){
		super(NAME,DESCRIPTION,MAGAZINE_SIZE);
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getRange()
	 */
	@Override
	public int getRange() {
		return RANGE;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getAccuracy()
	 */
	@Override
	public int getAccuracy() {
		return ACCURACY;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getReloadTurns()
	 */
	@Override
	public int getReloadTurns() {
		return TURNS_TO_RELOAD;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getMagsize()
	 */
	@Override
	public int getMagsize() {
		return MAGAZINE_SIZE;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getMaxSwing()
	 */
	@Override
	public int getMaxSwing() {
		return MAX_SWING;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getDamage()
	 */
	@Override
	public int getDamage() {
		return DAMAGE;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getName()
	 */
	@Override
	public String getName() {
		return NAME;
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getDescription()
	 */
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getFireEffect(double[], double[])
	 */
	@Override
	public VisualEffect getFireEffect(PanningManager panningManagers, double[] location, double[] targetLocation) {
		return new VisualEffect.ShotgunBullet(panningManagers, location, targetLocation, Color.orange, 24);
	}

	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#isInRange(atrophy.combat.ai.Ai, atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean isInRange(Ai ai, Ai targetAi) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#isMelee()
	 */
	@Override
	public boolean isMelee() {
		return false;
	}
}
