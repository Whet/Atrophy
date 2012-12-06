/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.items.resources.EngineeringSupply;
import atrophy.combat.items.resources.MedicalSupply;
import atrophy.combat.items.resources.ScienceSupply;
import atrophy.combat.items.resources.WeaponSupply;


// TODO: Auto-generated Javadoc
// holds cords of items in level e.g cover, height regions
/**
 * The Class Level.
 */
public class Level {
	
	/**
	 * The level blocks.
	 */
	private LevelBlock[] levelBlocks;
	
	/**
	 * The size.
	 */
	private int[] size;

	/**
	 * The faction blocks.
	 */
	private HashMap<String[], LevelBlock> factionBlocks;
	
	/**
	 * The banned blocks.
	 */
	private HashMap<LevelBlock, Set<String>> bannedBlocks;
	
	/**
	 * The target blocks.
	 */
	private HashMap<String, LevelBlock> targetBlocks;
	
	/**
	 * The map owner.
	 */
	private String mapOwner;
	
	private Set<String> allowedSpawns;

	private LevelManager levelManager;
	
	/**
	 * Instantiates a new level.
	 *
	 * @param mapOwner the map owner
	 * @param levelManager 
	 */
	public Level(String mapOwner, LevelManager levelManager){
		
		this.levelManager = levelManager;
		
		factionBlocks = new HashMap<String[], LevelBlock>();
		bannedBlocks = new HashMap<LevelBlock, Set<String>>();
		targetBlocks = new HashMap<String, LevelBlock>();
		
		this.mapOwner = mapOwner;
		
		allowedSpawns = new HashSet<>();
		
		allowedSpawns.add(AiGenerator.BANDITS);
		allowedSpawns.add(AiGenerator.WHITE_VISTA);
		allowedSpawns.add(AiGenerator.LONER);
		
	}
	
	/**
	 * Generate portals.
	 *
	 * @param portalData the portal data
	 * @param portalSecurity the portal security
	 * @param level the level
	 */
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
	
	/**
	 * Spawn items.
	 *
	 * @param engineeringChance the engineering chance
	 * @param medicalChance the medical chance
	 * @param weaponChance the weapon chance
	 * @param scienceChance the science chance
	 */
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
	
	/**
	 * Gets the block.
	 *
	 * @param i the i
	 * @return the block
	 */
	public LevelBlock getBlock(int i){
		return this.levelBlocks[i];
	}
	
	/**
	 * Gets the block at.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the block at
	 */
	public LevelBlock getBlockAt(double x, double y){
		for(int i = 0; i < this.levelBlocks.length; i++){
			if(this.levelBlocks[i].isInBounds(x, y)){
				return this.levelBlocks[i];
			}
		}
		return null;
	}
	
	/**
	 * Checks if is in bounds.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if is in bounds
	 */
	public boolean isInBounds(double x, double y){
		if(getBlockAt(x,y) == null){
			return false;
		}
		return true;
	}
	
	/**
	 * Gets the block count.
	 *
	 * @return the block count
	 */
	public int getBlockCount(){
		return this.levelBlocks.length;
	}
	
	/**
	 * Sets the blocks.
	 *
	 * @param levelBlocks the new blocks
	 */
	public void setBlocks(LevelBlock[] levelBlocks){
		this.levelBlocks = levelBlocks;
	}
	
	/**
	 * Gets the blocks.
	 *
	 * @return the blocks
	 */
	public LevelBlock[] getBlocks(){
		return this.levelBlocks;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int[] getSize() {
		return size;
	}
	
	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(int[] size){
		this.size = size;
	}

	/**
	 * Purge.
	 */
	public void purge() {
		for(LevelBlock block : this.levelBlocks){
			block.purge();
		}
		this.levelBlocks = null;
		factionBlocks = null;
		bannedBlocks = null;
		targetBlocks = null;
	}

	/**
	 * Adds the faction block.
	 *
	 * @param factions the factions
	 * @param levelBlock the level block
	 */
	public void addFactionBlock(String[] factions, LevelBlock levelBlock) {
		
		// check for * to mark a target room
		for(int i = 0; i < factions.length; i++){
			if(factions[i].startsWith("*")){
				factions[i] = factions[i].substring(1);
				
				factions[i] = modFactionName(factions[i]);
				
				addTargetBlock(factions[i], levelBlock);
			}
			else{
				factions[i] = modFactionName(factions[i]);
			}
			
		}
		
		this.factionBlocks.put(factions, levelBlock);
	}
	
	/**
	 * Mod faction name.
	 *
	 * @param faction the faction
	 * @return the string
	 */
	private String modFactionName(String faction) {
		// When loner is map owner: loner/white vista/bandits work
		if(mapOwner.equals(AiGenerator.LONER)){
			
			if(faction.equals("INVADER") || faction.equals("OWNER")){
				faction = "";
			}
			
		}
		// When wv/bandits are owner: owner/invader/loner work
		else{
			
			if(faction.equals(AiGenerator.WHITE_VISTA) || faction.equals(AiGenerator.BANDITS)){
				faction = "";
			}
			else if(faction.equals("OWNER")){
				faction = mapOwner;
			}
			else if(faction.equals("INVADER") && mapOwner.equals(AiGenerator.BANDITS)){
				faction = AiGenerator.WHITE_VISTA;
			}
			else if(faction.equals("INVADER") && mapOwner.equals(AiGenerator.WHITE_VISTA)){
				faction = AiGenerator.BANDITS;
			}
			
		}
		
		return faction;
	}

	/**
	 * Adds the banned block.
	 *
	 * @param factions the factions
	 * @param levelBlock the level block
	 */
	public void addBannedBlock(String[] factions, LevelBlock levelBlock){
		this.bannedBlocks.put(levelBlock, new HashSet<String>(Arrays.asList(factions)));
	}
	
	/**
	 * Adds the target block.
	 *
	 * @param faction the faction
	 * @param levelBlock the level block
	 */
	public void addTargetBlock(String faction, LevelBlock levelBlock){
		this.targetBlocks.put(faction, levelBlock);
	}
	
	// will return a block belonging to a faction or a random block if none can be found
	/**
	 * Gets the faction room.
	 *
	 * @param faction the faction
	 * @return the faction room
	 */
	public LevelBlock getFactionRoom(String faction){
		
		ArrayList<LevelBlock> blocks = new ArrayList<LevelBlock>();
		
		Iterator<String[]> factionIt = factionBlocks.keySet().iterator();
		
		while(factionIt.hasNext()){
			String[] factions = factionIt.next();
			
			for(int i = 0; i < factions.length; i++){
				if(factions[i].equals(faction))
					blocks.add(this.factionBlocks.get(factions));
			}
		}
		if(blocks.size() > 0)
			return blocks.get(new Random().nextInt(blocks.size()));
		
		return levelManager.randomRoom();
	}
	
	/**
	 * Checks if is banned.
	 *
	 * @param block the block
	 * @param faction the faction
	 * @return true, if is banned
	 */
	public boolean isBanned(LevelBlock block, String faction){
		
		Set<String> factions = this.bannedBlocks.get(block);
		
		if(factions == null)
			return false;
		
		return factions.contains(faction);
	}

	/**
	 * Gets the target block.
	 *
	 * @param faction the faction
	 * @return the target block
	 */
	public LevelBlock getTargetBlock(String faction) {
		return this.targetBlocks.get(faction);
	}

	
	/**
	 * Gets the map owner.
	 *
	 * @return the map owner
	 */
	public String getMapOwner() {
		return this.mapOwner;
	}

	public HashMap<String, LevelBlock> getTargetBlocks() {
		return targetBlocks;
	}

	public void setTargetBlocks(HashMap<String, LevelBlock> targetBlocks) {
		this.targetBlocks = targetBlocks;
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
	
}
