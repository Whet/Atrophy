/*
 * 
 */
package atrophy.combat.level;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.RecognitionException;

import watoydoEngine.io.ReadWriter;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.StashManager;

public class LevelIO {
	
	public static final String SUB_FOLDER = "GameData";
	
	public static void createLevelFolders(){
		
		String homeLocation = ReadWriter.HOME_LOCATION;
		
		// Atrophy folder
		File file =  new File(homeLocation + "/" + SUB_FOLDER);
		
		boolean exit = false;
		if(!file.exists()){
			file.mkdir();
			exit = true;
		}
		
		// Map file
		file =  new File(homeLocation + "/" + SUB_FOLDER + "/Sectors.txt");
		
		if(!file.exists()){
			try {
				
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				writer.write("Underbelly[]\n");
				writer.append("Engineering Beta[]\n");
				writer.append("Residence One[]\n");
				writer.append("Stores[]\n");
				writer.append("Production[]\n");
				writer.append("Robotics[]\n");
				writer.append("Mixed Sciences[]\n");
				writer.append("Energy[]\n");
				writer.append("Bridge[]\n");
				writer.append("Shrapnel[]\n");
				writer.append("#DO NOT CHANGE ORDER OF SECTORS\n");
				writer.append("#ORDER DETERMINES WHAT MAPS GO WHERE");
				
				writer.close();
			} 
			catch (IOException e) {
				System.err.println("sector write failed");
			}
			exit = true;
		}
		
		// Maps folder
		file =  new File(homeLocation + "/" + SUB_FOLDER + "/Maps");
		
		if(!file.exists()){
			file.mkdir();
			exit = true;
		}
		
		// Saves folder
		file =  new File(homeLocation + "/" + SUB_FOLDER + "/Saves");
		
		if(!file.exists()){
			file.mkdir();
			exit = true;
		}
		
		if(exit){
			System.err.println("Your folders didn't exist! Please populate the data folders and reload the game");
			System.err.println("A folder was made at: " + homeLocation + "/" + SUB_FOLDER);
			System.exit(-1);
		}
		
	}

	public static Level loadLevelBlocks(File file) throws RecognitionException, IOException {
		Level level = AtrophyScriptReader.readBlocks(file);
		
		for(int i = 0; i < level.getBlockCount(); i++) {
			level.getBlock(i).setDiscovered(true);
		}
		
		return level;
	}
	
	public static Level loadLevel(File file, String owner, int engineeringChance, int medicalChance, int weaponChance, int scienceChance, PanningManager panningManager, TurnProcess turnProcess, MessageBox messageBox, AiCrowd aiCrowd, CombatMembersManager combatMembersManager, Missions missions, MissionManager missionsManager, List<GenerateCommand> generationCommands, ItemMarket itemMarket, TechTree techTree, StashManager stashManager) throws IOException, RecognitionException{
		return AtrophyScriptReader.readScript(file, owner, engineeringChance, medicalChance, weaponChance, scienceChance, panningManager, turnProcess, messageBox, aiCrowd, combatMembersManager, missions, missionsManager, generationCommands, itemMarket, techTree, stashManager);
	}


}
