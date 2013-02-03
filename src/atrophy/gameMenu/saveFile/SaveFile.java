/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.saveFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import atrophy.gameMenu.saveFile.MapManager.Sector;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.StashManager;
import atrophy.gameMenu.ui.WindowManager;

/**
 * The Class SaveFile.
 */
public class SaveFile implements Serializable{

	public static String saveLocation = "";
	
	/**
	 * The Constant serialVersionUID.
	 */
	private static final long serialVersionUID = -9063488604100773309L;
	
	/**
	 * The squad.
	 */
	public Squad squad;
	
	/**
	 * The sectors.
	 */
	public ArrayList<Sector> sectors;
	
	/**
	 * The stash.
	 */
	public ArrayList<String> stash;
	
	/**
	 * The quests.
	 */
	public ArrayList<MissionGiver> quests;
	
	/**
	 * The economy effects.
	 */
	public ArrayList<String> economyEffects;
	
	/**
	 * The advance.
	 */
	public Integer advance;
	
	/**
	 * The shop item level.
	 */
	public TechTree techTree;
	
	public Set<String> spawnCodes;
	
	public String saveURL;
	
	/**
	 * Instantiates a new save file.
	 *
	 * @param squad the squad
	 * @param sectors the sectors
	 * @param stash the stash
	 */
	public SaveFile(Squad squad, Missions missions, ArrayList<Sector> sectors, ArrayList<String> stash, TechTree techTree, Set<String> spawnCodes) {
		this.advance = squad.getAdvance();
		this.squad = squad;
		this.sectors = sectors;
		this.stash = stash;
		this.economyEffects = missions.getEconomyEffects();
		this.techTree = techTree;
		this.spawnCodes = spawnCodes;
	}

	/**
	 * Save game.
	 *
	 * @param file the file
	 * @param squad the squad
	 * @param sectors the sectors
	 * @param stash the stash
	 */
	public static void saveGame(File file, Squad squad, Missions missions, ArrayList<Sector> sectors, ArrayList<String> stash, TechTree techTree, Set<String> spawnCodes){
		SaveFile save = new SaveFile(squad,missions,sectors,stash,techTree,spawnCodes);
		
		save.saveURL = file.getAbsolutePath();
		
		ObjectOutputStream stream = null;
		
		try {
			stream = new ObjectOutputStream(new FileOutputStream(file));   
		
			stream.writeObject(save);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				stream.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	/**
	 * Load game.
	 *
	 * @param file the file
	 * @param stashManager 
	 * @param mapWar 
	 * @param squadMenu 
	 * @param shopManager 
	 * @param missions 
	 * @param windowManager 
	 * @return 
	 */
	public static Squad loadGame(File file, StashManager stashManager, MapManager mapWar, ShopManager shopManager, Missions missions, WindowManager windowManager) {
		
		SaveFile save = null;
		
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(file));
			save = (SaveFile) stream.readObject();
		}
		catch (IOException | ClassCastException | ClassNotFoundException e) {
			return null;
		}
		finally{
			try {
				stream.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(save != null){
			
			//Delete save file
			file.delete();
			
			stashManager.setItems(save.stash);
			mapWar.setSectors(save.sectors);
			shopManager.randomItems();
			missions.setEconomyEffects(save.economyEffects);
//			TechTree.setInstance(save.techTree);
			windowManager.updateWindows();
			missions.setMemCodes(save.spawnCodes);
			
			// set advance to true value
			save.squad.setAdvance(save.advance);
			
			SaveFile.saveLocation = save.saveURL;
		}
		
		return save.squad;
	}
	
}
