/*
 * 
 */
package atrophy.combat;

import java.util.ArrayList;
import java.util.ListIterator;

import atrophy.combat.ai.Ai;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.levelAssets.Grenade;
import atrophy.combat.levelAssets.LevelAsset;

// TODO: Auto-generated Javadoc
/**
 * The Class CombatInorganicManager.
 */
public class CombatInorganicManager {
	
	/**
	 * The assets.
	 */
	private ArrayList<LevelAsset> assets;
	
	private LevelManager levelManager;
	
	/**
	 * Instantiates a new combat inorganic manager.
	 */
	public CombatInorganicManager(LevelManager levelManager){
		assets = new ArrayList<LevelAsset>();
		
		this.levelManager = levelManager;
	}
	
	/**
	 * Update assets.
	 *
	 * @param originator the originator
	 */
	public void updateAssets(Ai originator){
		
		ListIterator<LevelAsset> litr = assets.listIterator(); 
		while(litr.hasNext()) {

		    LevelAsset element = litr.next(); 
		    
		    if(originator == element.getOriginator()){
			    element.act();
			    
			    if(element.isExpired()){
			    	litr.remove();
			    }
		    }
		} 
	}
	
	/**
	 * Adds the level asset.
	 *
	 * @param newAsset the new asset
	 */
	public void addLevelAsset(LevelAsset newAsset){
		this.assets.add(newAsset);
	}
	
	/**
	 * Gets the level assets.
	 *
	 * @return the level assets
	 */
	public ArrayList<LevelAsset> getLevelAssets(){
		return this.assets;
	}
	
	/**
	 * Gets the level asset.
	 *
	 * @param i the i
	 * @return the level asset
	 */
	public LevelAsset getLevelAsset(int i){
		return this.assets.get(i);
	}

	/**
	 * Checks if is grenade in room.
	 *
	 * @param levelBlock the level block
	 * @return true, if is grenade in room
	 */
	public boolean isGrenadeInRoom(LevelBlock levelBlock) {
		for(LevelAsset asset : this.assets){
			if(asset instanceof Grenade && levelManager.getBlock(asset.getLocation()) == levelBlock){
				return true;
			}
		}
		return false;
	}
	
}
