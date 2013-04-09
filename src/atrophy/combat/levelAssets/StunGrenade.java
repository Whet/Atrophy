package atrophy.combat.levelAssets;

import java.awt.image.BufferedImage;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.level.LevelManager;

public class StunGrenade extends Grenade{
	
	public static final byte FUSE_TIME = 2;
	private static final int STUN_TURNS = 5;
	private int skillLevel;
	
	public StunGrenade(AiCrowd aiCrowd, FloatingIcons floatingIcons, LevelManager levelManager, Ai originator, double[] location, double angleHeading, double momentum, int skillLevel){
		super(aiCrowd, floatingIcons, levelManager, originator,location,angleHeading,momentum,FUSE_TIME);
		this.skillLevel = skillLevel;
	}
	
	@Override
	protected void explode(){
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActor(i).getLevelBlock() == this.getRoom() &&
			   CombatVisualManager.isInFiringSight(this.getLocation()[0], this.getLocation()[1], aiCrowd.getActor(i).getLocation()[0], aiCrowd.getActor(i).getLocation()[1], this.room)){
				aiCrowd.getActor(i).setStunnedTurns(STUN_TURNS + skillLevel);
			}
		}
		
		this.setExpired(true);
	}
	
	@Override
	public BufferedImage getImage() {
		return floatingIcons.getImage(StunGrenadeItem.NAME);
	}
	

}
