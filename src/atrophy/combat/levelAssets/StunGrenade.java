/*
 * 
 */
package atrophy.combat.levelAssets;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.level.LevelManager;

// TODO: Auto-generated Javadoc
/**
 * The Class StunGrenade.
 */
public class StunGrenade extends Grenade{
	
	/**
	 * The Constant FUSE_TIME.
	 */
	public static final byte FUSE_TIME = 2;

	/**
	 * The Constant STUN_TURNS.
	 */
	private static final int STUN_TURNS = 5;
	
	/**
	 * The skill level.
	 */
	private int skillLevel;
	
	/**
	 * Instantiates a new stun grenade.
	 *
	 * @param originator the originator
	 * @param location the location
	 * @param angleHeading the angle heading
	 * @param momentum the momentum
	 * @param skillLevel the skill level
	 */
	public StunGrenade(AiCrowd aiCrowd, FloatingIcons floatingIcons, LevelManager levelManager, Ai originator, double[] location, double angleHeading, double momentum, int skillLevel){
		super(StunGrenadeItem.NAME, aiCrowd, floatingIcons, levelManager, originator,location,angleHeading,momentum,FUSE_TIME);
		this.skillLevel = skillLevel;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.Grenade#explode()
	 */
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
	
	/* (non-Javadoc)
	 * @see atrophy.combat.levelAssets.LevelAsset#getImageName()
	 */
	public String getImageName(){
		return LevelAssetImageNames.STUNGRENADE;
	}

}
