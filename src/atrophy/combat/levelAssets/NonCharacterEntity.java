package atrophy.combat.levelAssets;

import java.awt.image.BufferedImage;

import atrophy.combat.ai.Ai;

public interface NonCharacterEntity {
	
	public double[] getLocation();
	
	public void act();
	
	public boolean isExpired();
	
	public BufferedImage getImage();
	
	public Ai getOriginator();

	public int getLife();
	
}
