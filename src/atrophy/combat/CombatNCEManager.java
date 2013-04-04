package atrophy.combat;

import java.util.ArrayList;
import java.util.ListIterator;

import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.levelAssets.Grenade;
import atrophy.combat.levelAssets.NonCharacterEntity;

public class CombatNCEManager {
	
	private ArrayList<NonCharacterEntity> assets;
	
	private LevelManager levelManager;
	
	public CombatNCEManager(LevelManager levelManager){
		assets = new ArrayList<NonCharacterEntity>();
		
		this.levelManager = levelManager;
	}
	
	public void updateAssets(){
		
		ListIterator<NonCharacterEntity> litr = assets.listIterator(); 
		while(litr.hasNext()) {

		    NonCharacterEntity element = litr.next(); 
		    
		    element.act();
		    
		    if(element.isExpired()){
		    	litr.remove();
		    }
		} 
	}
	
	public void addLevelAsset(NonCharacterEntity newAsset){
		this.assets.add(newAsset);
	}
	
	public ArrayList<NonCharacterEntity> getLevelAssets(){
		return this.assets;
	}
	
	public NonCharacterEntity getLevelAsset(int i){
		return this.assets.get(i);
	}

	public boolean isGrenadeInRoom(LevelBlock levelBlock) {
		for(NonCharacterEntity asset : this.assets){
			if(asset instanceof Grenade && levelManager.getBlock(asset.getLocation()) == levelBlock){
				return true;
			}
		}
		return false;
	}
	
}
