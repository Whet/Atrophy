package atrophy.combat.items;

import java.awt.Color;

import watoydoEngine.utils.Maths;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;

public class DaemonWeapon extends Weapon {
	
	public static final String NAME = "Daemonic Hammer";
	
	public static final int RANGE = 60;
	
	public static final int ACCURACY = 50;
	
	public static final int TURNS_TO_RELOAD = 0;
	
	public static final int MAGAZINE_SIZE = 1;
	
	public static final int MAX_SWING = 1;
	
	public static final int DAMAGE = 50;
	
	public static final String DESCRIPTION = "Accuracy: "+ACCURACY+" Damage: "+DAMAGE;
	
	public DaemonWeapon(){
		super(NAME,DESCRIPTION,MAGAZINE_SIZE);
	}
	
	@Override
	public int getRange() {
		return RANGE;
	}

	@Override
	public int getAccuracy() {
		return ACCURACY;
	}

	@Override
	public int getReloadTurns() {
		return TURNS_TO_RELOAD;
	}

	@Override
	public int getMagsize() {
		return MAGAZINE_SIZE;
	}

	@Override
	public int getMaxSwing() {
		return MAX_SWING;
	}

	@Override
	public int getDamage() {
		return DAMAGE;
	}

	@Override
	public String getName() {
		return NAME;
	}
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

	@Override
	public VisualEffect getFireEffect(PanningManager panningManagers, double[] location, double[] targetLocation) {
		return new VisualEffect.Bullet(panningManagers, location, targetLocation, Color.black, 4);
	}
	
	@Override
	public boolean isInRange(Ai ai, Ai targetAi) {
		return Maths.getDistance(ai.getLocation(), targetAi.getLocation()) <= RANGE;
	}
	
	@Override
	public void reduceAmmoByOne() {
		// melee doesn't use ammo
	}
	
	@Override
	public int getCombatScore() {
		return DAMAGE;
	}
	
	@Override
	public boolean isMelee() {
		return true;
	}
	
	@Override
	public boolean ignoresCover() {
		return true;
	}
}
