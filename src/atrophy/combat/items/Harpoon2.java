/*
 * 
 */
package atrophy.combat.items;

import java.awt.Color;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;


// TODO: Auto-generated Javadoc
/**
 * The Class Railgun.
 */
public class Harpoon2 extends Weapon {
	
	// Combat Score
	// acc * ammo + damage = 140
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Harpoon Cannon+";
	
	/**
	 * The Constant RANGE.
	 */
	public static final int RANGE = 200;
	
	/**
	 * The Constant ACCURACY.
	 */
	public static final int ACCURACY = 40 - Weapon.SWING_BONUS;
	
	/**
	 * The Constant TURNS_TO_RELOAD.
	 */
	public static final int TURNS_TO_RELOAD = 4;
	
	/**
	 * The Constant MAGAZINE_SIZE.
	 */
	public static final int MAGAZINE_SIZE = 1;
	
	/**
	 * The Constant MAX_SWING.
	 */
	public static final int MAX_SWING = 3;
	
	/**
	 * The Constant DAMAGE.
	 */
	public static final int DAMAGE = 25;
	
	/**
	 * The Constant DESCRIPTION.
	 */
	public static final String DESCRIPTION = "Accuracy: "+ACCURACY+" Damage: "+DAMAGE+" Magazine Size: "+MAGAZINE_SIZE + " Turns to Reload: "+TURNS_TO_RELOAD;
	
	//int range, int accuracy, int reloadTurns, int magSize, int maxSwing, int damage
	/**
	 * Instantiates a new railgun.
	 */
	public Harpoon2(){
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
		return new VisualEffect.Bullet(panningManagers, location, targetLocation, Color.white, 60);
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
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#ignoresLOS()
	 */
	@Override
	public boolean ignoresLOS() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#ignoresCover()
	 */
	@Override
	public boolean ignoresCover(){
		return false;
	}
}
