package atrophy.combat.items;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;

public abstract class Weapon extends Item {
	
	public static final int SWING_BONUS = 20;
	
	private int ammoLeft;
	
	private int turnsSpentReloading;
	
	protected Weapon(String name, String description, int magSize){
		super(name,description);
		ammoLeft = magSize;
		turnsSpentReloading = 0;
	}
	
	public abstract int getRange();
	
	public abstract boolean isInRange(Ai ai, Ai targetAi);
	
	public abstract int getAccuracy();
	
	public abstract int getReloadTurns();
	
	public abstract int getMagsize();
	
	public abstract int getMaxSwing();
	
	public abstract int getDamage();
	
	@Override
	public abstract String getName();
	
	public int getAmmoLeft(){
		return this.ammoLeft;
	}
	
	public void reduceAmmoByOne(){
		if(this.ammoLeft > 0){
			this.ammoLeft -= 1;
		}
		
		// reset reload turns since weapon fired
		this.turnsSpentReloading = 0;
	}
	
	public void reduceAmmoByAll() {
		this.ammoLeft = 0;
		this.turnsSpentReloading = 0;
	}
	
	public boolean hasAmmo(){
		if(this.ammoLeft > 0){
			return true;
		}
		return false;
	}
	
	public boolean hasFullAmmo(){
		if(this.ammoLeft == this.getMagsize()){
			return true;
		}
		return false;
	}
	
	public void reload(){
		
		this.turnsSpentReloading++;
		
		if(turnsSpentReloading == this.getReloadTurns()){
			this.ammoLeft = this.getMagsize();
			this.turnsSpentReloading = 0;
		}
	}
	
	public int getTurnsSpentReloading(){
		return this.turnsSpentReloading;
	}
	
	public int getCombatScore(){
		return ( this.ammoLeft * this.getAccuracy() ) + this.getDamage();
	}
	
	public abstract boolean isMelee();
	
	public boolean ignoresLOS(){
		return false;
	}
	
	public boolean ignoresCover() {
		return false;
	}
	
	@Override
	public abstract String getDescription();
	
	public abstract VisualEffect getFireEffect(PanningManager panningManagers, double[] location, double[] targetLocation);
	
	public boolean canAttack(){
		return true;
	}

	// Just to keep things light, all strings can check if they are a weapon with this method
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
