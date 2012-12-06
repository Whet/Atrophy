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

import atrophy.gameMenu.saveFile.MapWar.Sector;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.SquadMenu;
import atrophy.gameMenu.ui.StashManager;
import atrophy.gameMenu.ui.WindowManager;

/**
 * The Class SaveFile.
 */
public class SaveFile implements Serializable{

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
	
	/**
	 * Instantiates a new save file.
	 *
	 * @param squad the squad
	 * @param sectors the sectors
	 * @param stash the stash
	 */
	public SaveFile(Squad squad, ArrayList<Sector> sectors, ArrayList<String> stash, TechTree techTree, Set<String> spawnCodes) {
		this.advance = squad.getAdvance();
		this.squad = squad;
		this.sectors = sectors;
		this.stash = stash;
		this.quests = Missions.getInstance().getMissionGivers();
		this.economyEffects = Missions.getInstance().getEconomyEffects();
		this.techTree = TechTree.getInstance();
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
	public static void saveGame(File file, Squad squad, ArrayList<Sector> sectors, ArrayList<String> stash, TechTree techTree, Set<String> spawnCodes){
		SaveFile save = new SaveFile(squad,sectors,stash,techTree,spawnCodes);
			
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
	 */
	public static void loadGame(File file) {
		
		SaveFile save = null;
		
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(file));
			save = (SaveFile) stream.readObject();
		}
		catch (IOException | ClassCastException | ClassNotFoundException e) {
			return;
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
			StashManager.getInstance().setItems(save.stash);
			MapWar.getInstance().setSectors(save.sectors);
			SquadMenu.setSquad(save.squad);
			ShopManager.getInstance().randomItems();
			Missions.getInstance().setMissionGivers(save.quests);
			Missions.getInstance().setEconomyEffects(save.economyEffects);
			TechTree.setInstance(save.techTree);
			WindowManager.getInstance().updateWindows();
			Missions.getInstance().setMemCodes(save.spawnCodes);
			
			// set advance to true value
			save.squad.setAdvance(save.advance);
		}
		
		save = null;
	}
	
}
