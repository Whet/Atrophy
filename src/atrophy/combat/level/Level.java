/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;


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

	private Set<LevelBlock> safeRooms;

	private LevelBlock playerSpawn;
	
	public Level(String mapOwner){
		
		bannedBlocks = new HashMap<LevelBlock, Set<String>>();
		
		this.mapOwner = mapOwner;
		
		allowedSpawns = new HashSet<>();
		
		allowedSpawns.add(AiGenerator.BANDITS);
		allowedSpawns.add(AiGenerator.WHITE_VISTA);
		allowedSpawns.add(AiGenerator.LONER);
		
		safeRooms = new HashSet<>();
		
	}
	
	public void generatePortals(ArrayList<double[]> portalData, ArrayList<String> portalSecurity, Level level) {
		// add portals to blocks
		for(int i = 0; i < portalData.size(); i++){
			
			// Add block at end location
			LevelBlock block1 = level.getBlockAt(portalData.get(i)[2], portalData.get(i)[3]);
			LevelBlock block2 = level.getBlockAt(portalData.get(i)[4], portalData.get(i)[5]);
			
			Portal newPortal = new Portal(portalData.get(i)[0], portalData.get(i)[1], 
										  block1, portalData.get(i)[2], portalData.get(i)[3],
										  block2, portalData.get(i)[4], portalData.get(i)[5]);
			newPortal.setFactionWatch(portalSecurity.get(i));
			
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
	
	public void setBlocks(LevelBlock[] levelBlocks){
		this.levelBlocks = levelBlocks;
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

	public void setAllowedSpawns(String[] allowedSpawns) {
		this.allowedSpawns = new HashSet<String>();
		
		for(int i = 0 ; i < allowedSpawns.length; i++){
			this.allowedSpawns.add(allowedSpawns[i]);
		}
	}

	public boolean allowedSpawn(String faction) {
		return this.allowedSpawns.contains(faction);
	}
	
	public void addPlayerSpawn(LevelBlock playerSpawn){
		this.playerSpawn = playerSpawn;
	}
	
	public void addSaferoom(LevelBlock safeRoom){
		this.safeRooms.add(safeRoom);
	}

	public boolean isInSaferoom(LevelBlock levelBlock) {
		return this.safeRooms.contains(levelBlock);
	}

	public LevelBlock getPlayerSpawn() {
		return this.playerSpawn;
	}
	
}
