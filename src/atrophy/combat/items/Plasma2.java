package atrophy.combat.items;

import java.awt.Color;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;

public class Plasma2 extends Weapon {
	
	// Combat Score
	// acc * ammo + damage = 120
	public static final String NAME = "Plasma Rifle+";
	
	public static final int RANGE = 160;
	
	public static final int ACCURACY = 25 - Weapon.SWING_BONUS;
	
	public static final int TURNS_TO_RELOAD = 4;
	
	public static final int MAGAZINE_SIZE = 3;
	
	public static final int MAX_SWING = 3;
	
	public static final int DAMAGE = 70;
	
	public static final String DESCRIPTION = "Accuracy: "+ACCURACY+" Damage: "+DAMAGE+" Magazine Size: "+MAGAZINE_SIZE + " Turns to Reload: "+TURNS_TO_RELOAD;
	
	public Plasma2(){
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
		return new VisualEffect.ShotgunBullet(panningManagers, location, targetLocation, Color.cyan, 18);
	}

	@Override
	public boolean isInRange(Ai ai, Ai targetAi) {
		return true;
	}

	@Override
	public boolean isMelee() {
		return false;
	}
	
	@Override
	public int getCombatScore() {
		return super.getCombatScore() + 20;
	}
}
