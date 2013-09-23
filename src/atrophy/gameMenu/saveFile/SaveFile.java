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

import atrophy.combat.ai.AiGenerator;
import atrophy.gameMenu.saveFile.MapManager.Sector;
import atrophy.gameMenu.ui.ShopManager;
import atrophy.gameMenu.ui.StashManager;
import atrophy.gameMenu.ui.WindowManager;

public class SaveFile implements Serializable{

	public static String saveLocation = "";
	
	private static final long serialVersionUID = -9063488604100773309L;
	
	public Squad squad;
	public ArrayList<Sector> sectors;
	public ArrayList<String> stash;
	public Integer advance;
	public Double whiteVistaRelation, banditRelation;
	
	public Set<String> spawnCodes;
	public String saveURL;
	
	public FactionMissionPlanner wvResearchAi, banditsResearchAi;
	
	public SaveFile(Squad squad, Missions missions, ArrayList<Sector> sectors, ArrayList<String> stash, TechTree techTree, Set<String> spawnCodes) {
		this.advance = squad.getAdvance();
		this.squad = squad;
		this.sectors = sectors;
		this.stash = stash;
		this.spawnCodes = spawnCodes;
		this.whiteVistaRelation = 1.0;
		this.banditRelation = -1.0;
		this.wvResearchAi = missions.getPlanner(AiGenerator.WHITE_VISTA);
		this.banditsResearchAi = missions.getPlanner(AiGenerator.BANDITS);
	}

	public static void saveGame(File file, Squad squad, Missions missions, ArrayList<Sector> sectors, ArrayList<String> stash, TechTree techTree, Set<String> spawnCodes){
		SaveFile save = new SaveFile(squad,missions,sectors,stash,techTree,spawnCodes);
		save.whiteVistaRelation = squad.getFactionRelation(AiGenerator.WHITE_VISTA);
		save.banditRelation = squad.getFactionRelation(AiGenerator.BANDITS);
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
	
	public static Squad loadGame(File file, StashManager stashManager, MapManager mapWar, ShopManager shopManager, Missions missions, WindowManager windowManager, ItemMarket itemMarket) {
		
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
//			file.delete();
			
			stashManager.setItems(save.stash);
			mapWar.setSectors(save.sectors);
			itemMarket.lazyLoad(save.squad.getTechTree());
			shopManager.randomItems();
			save.banditsResearchAi.loadFromSerialized();
			save.wvResearchAi.loadFromSerialized();
			missions.setResearchAi(save.banditsResearchAi, save.wvResearchAi);
			windowManager.updateWindows();
			missions.setMemCodes(save.spawnCodes);
			
			// set advance to true value
			save.squad.setAdvance(save.advance);
			save.squad.setFactionRelations(save.whiteVistaRelation, save.banditRelation);
			SaveFile.saveLocation = save.saveURL;
		}
		
		return save.squad;
	}
	
}
