/*
 * 
 */
package atrophy.combat.items;

import java.awt.Color;

import watoydoEngine.utils.Maths;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;


// TODO: Auto-generated Javadoc
/**
 * The Class MeleeWeapon1.
 */
public class MeleeWeapon1 extends Weapon {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Scrap Weapon";
	
	/**
	 * The Constant RANGE.
	 */
	public static final int RANGE = 40;
	
	/**
	 * The Constant ACCURACY.
	 */
	public static final int ACCURACY = 20;
	
	/**
	 * The Constant TURNS_TO_RELOAD.
	 */
	public static final int TURNS_TO_RELOAD = 0;
	
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
	public static final int DAMAGE = 4;
	
	/**
	 * The Constant DESCRIPTION.
	 */
	public static final String DESCRIPTION = "Accuracy: "+ACCURACY+" Damage: "+DAMAGE;
	
	//int range, int accuracy, int reloadTurns, int magSize, int maxSwing, int damage
	/**
	 * Instantiates a new melee weapon1.
	 */
	public MeleeWeapon1(){
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
		return new VisualEffect.Bullet(panningManagers, location, targetLocation, Color.black, 4);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#isInRange(atrophy.combat.ai.Ai, atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean isInRange(Ai ai, Ai targetAi) {
		return Maths.getDistance(ai.getLocation(), targetAi.getLocation()) <= RANGE;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#reduceAmmoByOne()
	 */
	@Override
	public void reduceAmmoByOne() {
		// melee doesn't use ammo
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#getCombatScore()
	 */
	@Override
	public int getCombatScore() {
		return DAMAGE;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.weapons.Weapon#isMelee()
	 */
	@Override
	public boolean isMelee() {
		return true;
	}
	
	@Override
	public boolean ignoresCover() {
		return true;
	}
}
