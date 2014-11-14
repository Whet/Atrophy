package atrophy.combat.items;

import java.awt.Color;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;

public class UnarmedWeapon extends Weapon {
	
	public static final String NAME = "Unarmed";
	
	public static final int RANGE = 0;
	
	public static final int ACCURACY = 0;
	
	public static final int TURNS_TO_RELOAD = 0;
	
	public static final int MAGAZINE_SIZE = 0;
	
	public static final int MAX_SWING = 0;
	
	public static final int DAMAGE = 0;
	
	public static final String DESCRIPTION = "Accuracy: "+ACCURACY+" Damage: "+DAMAGE;
	
	public UnarmedWeapon(){
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
		return new VisualEffect.Bullet(panningManagers, location, targetLocation, Color.black, 10);
	}

	@Override
	public boolean isInRange(Ai ai, Ai targetAi) {
		return false;
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
	public boolean canAttack(){
		return false;
	}
}
