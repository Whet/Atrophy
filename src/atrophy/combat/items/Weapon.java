/*
 * 
 */
package atrophy.combat.items;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;

// TODO: Auto-generated Javadoc
/**
 * The Class Weapon.
 */
public abstract class Weapon extends Item{
	
	/**
	 * The Constant SWING_BONUS.
	 */
	public static final int SWING_BONUS = 25;
	
	/**
	 * The ammo left.
	 */
	private int ammoLeft;
	
	/**
	 * The turns spent reloading.
	 */
	private int turnsSpentReloading;
	
	/**
	 * Instantiates a new weapon.
	 *
	 * @param name the name
	 * @param description the description
	 * @param magSize the mag size
	 */
	protected Weapon(String name, String description, int magSize){
		super(name,description);
		ammoLeft = magSize;
		turnsSpentReloading = 0;
	}
	
	/**
	 * Gets the range.
	 *
	 * @return the range
	 */
	public abstract int getRange();
	
	/**
	 * Checks if is in range.
	 *
	 * @param ai the ai
	 * @param targetAi the target ai
	 * @return true, if is in range
	 */
	public abstract boolean isInRange(Ai ai, Ai targetAi);
	
	/**
	 * Gets the accuracy.
	 *
	 * @return the accuracy
	 */
	public abstract int getAccuracy();
	
	/**
	 * Gets the reload turns.
	 *
	 * @return the reload turns
	 */
	public abstract int getReloadTurns();
	
	/**
	 * Gets the magsize.
	 *
	 * @return the magsize
	 */
	public abstract int getMagsize();
	
	/**
	 * Gets the max swing.
	 *
	 * @return the max swing
	 */
	public abstract int getMaxSwing();
	
	/**
	 * Gets the damage.
	 *
	 * @return the damage
	 */
	public abstract int getDamage();
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.Item#getName()
	 */
	public abstract String getName();
	
	/**
	 * Gets the ammo left.
	 *
	 * @return the ammo left
	 */
	public int getAmmoLeft(){
		return this.ammoLeft;
	}
	
	/**
	 * Reduce ammo by one.
	 */
	public void reduceAmmoByOne(){
		if(this.ammoLeft > 0){
			this.ammoLeft -= 1;
		}
		
		// reset reload turns since weapon fired
		this.turnsSpentReloading = 0;
	}
	
	/**
	 * Checks for ammo.
	 *
	 * @return true, if successful
	 */
	public boolean hasAmmo(){
		if(this.ammoLeft > 0){
			return true;
		}
		return false;
	}
	
	/**
	 * Checks for full ammo.
	 *
	 * @return true, if successful
	 */
	public boolean hasFullAmmo(){
		if(this.ammoLeft == this.getMagsize()){
			return true;
		}
		return false;
	}
	
	/**
	 * Reload.
	 */
	public void reload(){
		
		this.turnsSpentReloading++;
		
		if(turnsSpentReloading == this.getReloadTurns()){
			this.ammoLeft = this.getMagsize();
			this.turnsSpentReloading = 0;
		}
	}
	
	/**
	 * Gets the turns spent reloading.
	 *
	 * @return the turns spent reloading
	 */
	public int getTurnsSpentReloading(){
		return this.turnsSpentReloading;
	}
	
	/**
	 * Gets the combat score.
	 *
	 * @return the combat score
	 */
	public int getCombatScore(){
		return ( this.ammoLeft * this.getAccuracy() ) + this.getDamage();
	}
	
	/**
	 * Checks if is melee.
	 *
	 * @return true, if is melee
	 */
	public abstract boolean isMelee();
	
	/**
	 * Ignores los.
	 *
	 * @return true, if successful
	 */
	public boolean ignoresLOS(){
		return false;
	}
	
	/**
	 * Ignores cover.
	 *
	 * @return true, if successful
	 */
	public boolean ignoresCover() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.items.Item#getDescription()
	 */
	public abstract String getDescription();
	
	/**
	 * Gets the fire effect.
	 *
	 * @param location the location
	 * @param targetLocation the target location
	 * @return the fire effect
	 */
	public abstract VisualEffect getFireEffect(PanningManager panningManagers, double[] location, double[] targetLocation);
	
	public boolean canAttack(){
		return true;
	}

	// Just to keep things light, all strings can check if they are a weapon with this method
	/**
	 * Checks if is weapon.
	 *
	 * @param item the item
	 * @return true, if is weapon
	 */
	public static boolean isWeapon(String item){
		if(item.equals(MeleeWeapon1.NAME) ||
		   item.equals(MeleeWeapon2.NAME) ||
		   item.equals(Pistol1.NAME) ||
		   item.equals(Pistol2.NAME) ||
		   item.equals(Pistol3.NAME) ||
		   item.equals(Pistol4.NAME) ||
		   item.equals(Harpoon1.NAME) ||
		   item.equals(Harpoon2.NAME) ||
		   item.equals(Plasma1.NAME) ||
		   item.equals(Railgun.NAME) ||
		   item.equals(Shotgun1.NAME)){
			return true;
		}
		return false;
	}

	public static Weapon stringToWeapon(String weaponName){
		switch(weaponName){
			case Shotgun1.NAME:
				return new Shotgun1();
			case Pistol1.NAME:
				return new Pistol1();
			case Pistol2.NAME:
				return new Pistol2();
			case Pistol3.NAME:
				return new Pistol3();
			case Pistol4.NAME:
				return new Pistol4();
			case Harpoon1.NAME:
				return new Harpoon1();
			case Harpoon2.NAME:
				return new Harpoon2();
			case Plasma1.NAME:
				return new Plasma1();
			case Plasma2.NAME:
				return new Plasma2();
			case Railgun.NAME:
				return new Railgun();
			case MeleeWeapon1.NAME:
				return new MeleeWeapon1();
			case MeleeWeapon2.NAME:
				return new MeleeWeapon2();
			case UnarmedWeapon.NAME:
				return new UnarmedWeapon();
		}
		return null;
	}

}
