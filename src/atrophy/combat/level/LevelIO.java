/*
 * 
 */
package atrophy.combat.level;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.RecognitionException;

import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
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
	
	public static Level loadLevelBlocks(File file) throws RecognitionException, IOException {
		Level level = AtrophyScriptReader.readBlocks(file);
		
		for(int i = 0; i < level.getBlockCount(); i++) {
			level.getBlock(i).setDiscovered(true);
		}
		
		return level;
	}
	
	public static Level loadLevel(File file, String owner, int engineeringChance, int medicalChance, int weaponChance, int scienceChance, PanningManager panningManager, TurnProcess turnProcess, MessageBox messageBox, AiCrowd aiCrowd, CombatMembersManager combatMembersManager, Missions missions, MissionManager missionsManager, List<GenerateCommand> generationCommands, ItemMarket itemMarket, TechTree techTree, StashManager stashManager, CombatVisualManager combatVisualManager) throws IOException, RecognitionException{
		return AtrophyScriptReader.readScript(file, owner, engineeringChance, medicalChance, weaponChance, scienceChance, panningManager, turnProcess, messageBox, aiCrowd, combatMembersManager, missions, missionsManager, generationCommands, itemMarket, techTree, stashManager, combatVisualManager);
	}


}
