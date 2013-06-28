/*
 * 
 */
package atrophy.combat.level;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;
import atrophy.combat.level.AtrophyScriptReader.LevelBlockInfo;
import atrophy.combat.level.AtrophyScriptReader.PortalInfo;


// TODO: Auto-generated Javadoc
// holds cords of items in level e.g cover, height regions
/**
 * The Class Level.
 */
public class Level {
	
	private LevelBlock[] levelBlocks;
	private int[] size;
	private HashMap<LevelBlock, Set<String>> bannedBlocks;
	private String mapOwner;
	private Set<String> allowedSpawns;
	private LevelBlock playerSpawn;
	
	public Level(String mapOwner){
		
		bannedBlocks = new HashMap<LevelBlock, Set<String>>();
		
		this.mapOwner = mapOwner;
		
		allowedSpawns = new HashSet<>();
		
		allowedSpawns.add(AiGenerator.BANDITS);
		allowedSpawns.add(AiGenerator.WHITE_VISTA);
		allowedSpawns.add(AiGenerator.LONER);
		
	}
	
	public void generatePortals(Stack<PortalInfo> portalStack, Level level) {
		
		PortalInfo portalData;
		
		// add portals to blocks
		while(!portalStack.isEmpty()) {
			portalData = portalStack.pop();
			// Add block at end location
			LevelBlock block1 = level.getBlockAt(portalData.xList.get(1), portalData.yList.get(1));
			LevelBlock block2 = level.getBlockAt(portalData.xList.get(2), portalData.yList.get(2));
			
			Portal newPortal = new Portal(portalData.xList.get(0), portalData.yList.get(0), 
										  block1, portalData.xList.get(1), portalData.yList.get(1),
										  block2, portalData.xList.get(2), portalData.yList.get(2));
			
			newPortal.setFactionWatch(portalData.getSecurity());
			
			// Add portal to blocks
			block1.addPortal(newPortal);
			block2.addPortal(newPortal);
		}
	}
	
	public void spawnItems(int engineeringChance, int medicalChance, int weaponChance,int scienceChance){
		
		Random rand = new Random();
		
		for(int i = 0; i < this.getBlockCount(); i++){
			for(int j = 0; j < this.levelBlocks[i].getStashLootAbles().size(); j++){
				Lootable stash = this.levelBlocks[i].getStashLootAbles().get(j);
				if(rand.nextInt(100) < engineeringChance){
					stash.addItem(EngineeringSupply.getInstance());
				}
				if(rand.nextInt(100) < medicalChance){
					stash.addItem(MedicalSupply.getInstance());
				}
				if(rand.nextInt(100) < weaponChance){
					stash.addItem(WeaponSupply.getInstance());
				}
				if(rand.nextInt(100) < scienceChance){
					stash.addItem(ScienceSupply.getInstance());
				}
			}
			
			if(rand.nextInt(100) < scienceChance * 3)
				this.levelBlocks[i].setContainsScience(true);
		}
	}
	
	public LevelBlock getBlock(int i){
		return this.levelBlocks[i];
	}
	
	public LevelBlock getBlockAt(double x, double y){
		for(int i = 0; i < this.levelBlocks.length; i++){
			if(this.levelBlocks[i].isInBounds(x, y)){
				return this.levelBlocks[i];
			}
		}
		return null;
	}
	
	public boolean isInBounds(double x, double y){
		if(getBlockAt(x,y) == null){
			return false;
		}
		return true;
	}
	
	public int getBlockCount(){
		return this.levelBlocks.length;
	}
	
	public void setBlocks(Stack<LevelBlockInfo> blockStack){
		this.levelBlocks = new LevelBlock[blockStack.size()];
		
		int i = 0;
		LevelBlockInfo blockInfo;
		while(!blockStack.isEmpty()) {
			blockInfo = blockStack.pop();
			this.levelBlocks[i] = blockInfo.toLevelBlock();
			i++;
		}
	}
	
	public LevelBlock[] getBlocks(){
		return this.levelBlocks;
	}

	public int[] getSize() {
		return size;
	}
	
	public void setSize(int[] size){
		this.size = size;
	}

	public void purge() {
		for(LevelBlock block : this.levelBlocks){
			block.purge();
		}
		this.levelBlocks = null;
		bannedBlocks = null;
	}

	public void addBannedBlock(String[] factions, LevelBlock levelBlock){
		this.bannedBlocks.put(levelBlock, new HashSet<String>(Arrays.asList(factions)));
	}
	
	public boolean isBanned(LevelBlock block, String faction){
		
		Set<String> factions = this.bannedBlocks.get(block);
		
		if(factions == null)
			return false;
		
		return factions.contains(faction);
	}

	public String getMapOwner() {
		return this.mapOwner;
	}

	public void setAllowedSpawns(Set<String> allowedSpawns) {
		this.allowedSpawns = allowedSpawns;
	}

	public boolean allowedSpawn(String faction) {
		return this.allowedSpawns.contains(faction);
	}
	
	public void addPlayerSpawn(LevelBlock playerSpawn){
		this.playerSpawn = playerSpawn;
	}
	
	public LevelBlock getPlayerSpawn() {
		return this.playerSpawn;
	}
	
}
