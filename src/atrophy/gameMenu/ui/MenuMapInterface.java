/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatInorganicManager;
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
	
	/**
	 * Load level.
	 *
	 * @param chosenLevel the chosen level
	 * @param owner the owner
	 * @param engineeringChance the engineering chance
	 * @param medicalChance the medical chance
	 * @param weaponChance the weapon chance
	 * @param scienceChance the science chance
	 * @param missions 
	 * @param itemMarket 
	 * @param techTree 
	 * @param stashManager 
	 * @param missionManager 
	 * @param levelManager 
	 * @param panningManager 
	 * @param aiCrowd 
	 * @param turnProcess 
	 * @param combatVisualManager 
	 * @param messageBox 
	 */
	public static void loadLevel(File chosenLevel, String owner, Squad squad, int engineeringChance, int medicalChance, int weaponChance, int scienceChance, Missions missions, ItemMarket itemMarket, TechTree techTree, StashManager stashManager){

		List<AiGeneratorInterface.GenerateCommand> generationCommands = new ArrayList<AiGeneratorInterface.GenerateCommand>();
		
		TurnProcess turnProcess = new TurnProcess();
		LevelManager levelManager = new LevelManager();
		CombatInorganicManager combatInorganicManager = new CombatInorganicManager(levelManager);
		AiManagementSuite aiManagementSuite = new AiManagementSuite(turnProcess, combatInorganicManager, levelManager, squad);
		UiUpdaterSuite uiUpdaterSuite = new UiUpdaterSuite(aiManagementSuite, turnProcess, levelManager, combatInorganicManager);
		ActionSuite actionSuite = new ActionSuite(aiManagementSuite, uiUpdaterSuite, turnProcess, levelManager, squad, techTree, stashManager, missions);
		MissionManager missionManager = new MissionManager(missions);
		
		try {
			levelManager.setCurrentLevel(LevelIO.loadLevel(chosenLevel, owner, engineeringChance, medicalChance, weaponChance, scienceChance, uiUpdaterSuite.getPanningManager(), turnProcess, uiUpdaterSuite.getMessageBox(), aiManagementSuite.getAiCrowd(), levelManager, missions, missionManager, generationCommands));
			aiManagementSuite.lazyLoad(uiUpdaterSuite, actionSuite.getMouseAbilityHandler());
			uiUpdaterSuite.lazyLoad(actionSuite.getMouseAbilityHandler(), aiManagementSuite.getAiCrowd(), levelManager);
			setSpawns(owner, levelManager, squad, itemMarket, generationCommands);
			turnProcess.lazyLoad(aiManagementSuite, uiUpdaterSuite, combatInorganicManager, actionSuite);
		} 
		catch (IOException e) {
//			JOptionPane.showMessageDialog(DevMenu.getInstance(), "File could not be loaded");
			System.err.println("Level could not be loaded");
			return;
		} 
		catch (LevelFormatException e) {
//			JOptionPane.showMessageDialog(DevMenu.getInstance(), e.message);
			System.err.println(e.message);
			return;
		}
		
		ActivePane.getInstance().changePane(new Crowd(new CombatHardPane(turnProcess, aiManagementSuite, uiUpdaterSuite, actionSuite, levelManager, aiManagementSuite.getAiCrowd(), combatInorganicManager, itemMarket, generationCommands)));
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
