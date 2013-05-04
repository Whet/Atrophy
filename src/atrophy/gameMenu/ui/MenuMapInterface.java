/*
 * 
 */
package atrophy.gameMenu.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.SwingUtilities;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelIO;
import atrophy.combat.level.MissionManager;
import atrophy.combat.level.LevelIO.LevelFormatException;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.hardPanes.CombatHardPane;

/**
 * The Class MenuMapInterface.
 */
public class MenuMapInterface {
	
	public static void loadLevel(final File chosenLevel, final String owner, final Squad squad, final int engineeringChance, final int medicalChance, final int weaponChance, final int scienceChance, final Missions missions, final ItemMarket itemMarket, final TechTree techTree, final StashManager stashManager) {

		ActivePane.getInstance().showLoading();
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				List<AiGeneratorInterface.GenerateCommand> generationCommands = new ArrayList<AiGeneratorInterface.GenerateCommand>();
				
				TurnProcess turnProcess = new TurnProcess();
				LevelManager levelManager = new LevelManager();
				CombatNCEManager combatInorganicManager = new CombatNCEManager(levelManager);
				AiManagementSuite aiManagementSuite = new AiManagementSuite(turnProcess, combatInorganicManager, levelManager, squad);
				UiUpdaterSuite uiUpdaterSuite = new UiUpdaterSuite(aiManagementSuite, turnProcess, levelManager, combatInorganicManager);
				ActionSuite actionSuite = new ActionSuite(aiManagementSuite, uiUpdaterSuite, turnProcess, levelManager, squad, techTree, stashManager, missions);
				MissionManager missionManager = new MissionManager(missions);
				
				try {
					// A.
					levelManager.setCurrentLevel(LevelIO.loadLevel(chosenLevel, owner, engineeringChance, medicalChance, weaponChance, scienceChance, uiUpdaterSuite.getPanningManager(), turnProcess, uiUpdaterSuite.getMessageBox(), aiManagementSuite.getAiCrowd(), aiManagementSuite.getCombatMembersManager(), missions, missionManager, generationCommands));
					uiUpdaterSuite.lazyLoad(actionSuite.getMouseAbilityHandler(), aiManagementSuite.getAiCrowd(), levelManager, actionSuite.getCombatMouseHandler());
					// Moved from A. without checking		
					aiManagementSuite.lazyLoad(uiUpdaterSuite, actionSuite.getMouseAbilityHandler());
					setSpawns(owner, levelManager, squad, itemMarket, generationCommands);
					turnProcess.lazyLoad(aiManagementSuite, uiUpdaterSuite, combatInorganicManager, actionSuite);
				} 
				catch (IOException e) {
					System.err.println("Level could not be loaded");
					return;
				} 
				catch (LevelFormatException e) {
					System.err.println(e.message);
					return;
				}
				
				ActivePane.getInstance().changePane(new Crowd(new CombatHardPane(turnProcess, aiManagementSuite, uiUpdaterSuite, actionSuite, levelManager, aiManagementSuite.getAiCrowd(), combatInorganicManager, itemMarket, generationCommands)));
			}
		});
		
	}

	/**
	 * Sets the spawns.
	 *
	 * @param owner the new spawns
	 * @param levelManager 
	 * @param squad 
	 * @param itemMarket 
	 * @param generationCommands 
	 */
	private static void setSpawns(String owner, LevelManager levelManager, Squad squad, ItemMarket itemMarket, List<AiGeneratorInterface.GenerateCommand> generationCommands) {
		
		int banditTeamSpawn = new Random().nextInt((levelManager.getBlocks().length / 5) + 1);
		
		int whiteVistaTeamSpawn = new Random().nextInt((levelManager.getBlocks().length / 5) + 1);
		
		AiGeneratorInterface.LONER_SPAWN_AMOUNT = new Random().nextInt(4) + 1;
		
		ArrayList<String> targetFactions =  new ArrayList<String>();
		
		if(owner.equals(AiGenerator.WHITE_VISTA)){
			whiteVistaTeamSpawn += 2;
			
			targetFactions.add(AiGenerator.BANDITS);
		}
		else if(owner.equals(AiGenerator.BANDITS)){
			banditTeamSpawn += 2;
			
			targetFactions.add(AiGenerator.WHITE_VISTA);
			targetFactions.add(AiGenerator.LONER);
			targetFactions.add(AiGenerator.PLAYER);
		}
		// Loners
		else{
			targetFactions.add(AiGenerator.BANDITS);
		}
		
		// Cancel spawns if not specified
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.BANDITS))
			banditTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.WHITE_VISTA))
			whiteVistaTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.LONER))
			AiGeneratorInterface.LONER_SPAWN_AMOUNT = 0;
		
		for(int i = 0; i < banditTeamSpawn; i++){
			generationCommands.add(new GenerateCommand(2, 4, itemMarket.getBanditsAllowedItems(), itemMarket.getBanditsAllowedWeapons(), AiGenerator.BANDITS));
		}
		for(int i = 0; i <whiteVistaTeamSpawn; i++){
			generationCommands.add(new GenerateCommand(2, 4, itemMarket.getWhiteVistaAllowedItems(), itemMarket.getWhiteVistaAllowedWeapons(), AiGenerator.WHITE_VISTA));
		}

		generationCommands.add(new GenerateCommand(squad.getSquad(), AiGenerator.PLAYER));
		
		
	}
	
}
