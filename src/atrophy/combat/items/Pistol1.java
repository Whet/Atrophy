package atrophy.combat.items;

import java.awt.Color;

import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.VisualEffect;

public class Pistol1 extends Weapon {
	
	// Combat Score
	// acc * ammo + damage = 120
	public static final String NAME = "Light Pistol";
	
	public static final int RANGE = 200;
	
	public static final int ACCURACY = 35 - Weapon.SWING_BONUS;
	
	public static final int TURNS_TO_RELOAD = 2;
	
	public static final int MAGAZINE_SIZE = 2;
	
	public static final int MAX_SWING = 2;
	
	public static final int DAMAGE = 30;
	
	public static final String DESCRIPTION = "Accuracy: "+ACCURACY+" Damage: "+DAMAGE+" Magazine Size: "+MAGAZINE_SIZE + " Turns to Reload: "+TURNS_TO_RELOAD;
	
	public Pistol1(){
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
		return new VisualEffect.Bullet(panningManagers, location, targetLocation, Color.white, 30);
	}
	
	@Override
	public boolean isInRange(Ai ai, Ai targetAi) {
		return true;
	}
	
	@Override
	public boolean isMelee() {
		return false;
	}
}
