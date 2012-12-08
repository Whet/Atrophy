/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.TurretAi;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelIO;
import atrophy.combat.level.LevelIO.LevelFormatException;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.ItemMarket;
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
	 * @param levelManager 
	 * @param panningManager 
	 * @param aiCrowd 
	 * @param turnProcess 
	 * @param combatVisualManager 
	 * @param messageBox 
	 */
	public static void loadLevel(File chosenLevel, String owner, int engineeringChance, int medicalChance, int weaponChance, int scienceChance){
		
		// Clear spawns before levelio so turrets aren't also cleared
		AiGeneratorInterface.getInstance().getCommands().clear();
		
		TurnProcess turnProcess = new TurnProcess();
		LevelManager levelManager = new LevelManager();
		CombatInorganicManager combatInorganicManager = new CombatInorganicManager(levelManager);
		AiManagementSuite aiManagementSuite = new AiManagementSuite(turnProcess, combatInorganicManager, levelManager);
		UiUpdaterSuite uiUpdaterSuite = new UiUpdaterSuite(aiManagementSuite, turnProcess, levelManager, combatInorganicManager);
		ActionSuite actionSuite = new ActionSuite(aiManagementSuite, uiUpdaterSuite, turnProcess, levelManager);
		
		try {
			levelManager.setCurrentLevel(LevelIO.loadLevel(chosenLevel, owner, engineeringChance, medicalChance, weaponChance, scienceChance, uiUpdaterSuite.getPanningManager(), uiUpdaterSuite.getCombatVisualManager(), turnProcess, uiUpdaterSuite.getMessageBox(), aiManagementSuite.getAiCrowd(), levelManager));
			aiManagementSuite.lazyLoad(uiUpdaterSuite, actionSuite.getMouseAbilityHandler());
			uiUpdaterSuite.lazyLoad(actionSuite.getMouseAbilityHandler(), aiManagementSuite.getAiCrowd(), levelManager);
			setSpawns(owner, levelManager);
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
		
		ActivePane.getInstance().changePane(new Crowd("CurrentPane",false,new CombatHardPane(turnProcess, aiManagementSuite, uiUpdaterSuite, actionSuite, levelManager, aiManagementSuite.getAiCrowd(), combatInorganicManager)));
	}

	/**
	 * Sets the spawns.
	 *
	 * @param owner the new spawns
	 * @param levelManager 
	 */
	private static void setSpawns(String owner, LevelManager levelManager) {
		
		int banditTeamSpawn = new Random().nextInt((levelManager.getBlocks().length / 5) + 1);
		
		int whiteVistaTeamSpawn = new Random().nextInt((levelManager.getBlocks().length / 5) + 1);
		
		AiGeneratorInterface.LONER_SPAWN_AMOUNT = new Random().nextInt(4);
		
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
		
		// Update security targets
		TurretAi.setTargetFaction(targetFactions);

		// Cancel spawns if not specified
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.BANDITS))
			banditTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.WHITE_VISTA))
			whiteVistaTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.LONER))
			AiGeneratorInterface.LONER_SPAWN_AMOUNT = 0;
		
		for(int i = 0; i < banditTeamSpawn; i++){
			AiGeneratorInterface.getInstance().getCommands().add(new GenerateCommand(2, 4, ItemMarket.getInstance().getBanditsAllowedItems(), ItemMarket.getInstance().getBanditsAllowedWeapons(), AiGenerator.BANDITS));
		}
		for(int i = 0; i <whiteVistaTeamSpawn; i++){
			AiGeneratorInterface.getInstance().getCommands().add(new GenerateCommand(2, 4, ItemMarket.getInstance().getWhiteVistaAllowedItems(), ItemMarket.getInstance().getWhiteVistaAllowedWeapons(), AiGenerator.WHITE_VISTA));
		}

		AiGeneratorInterface.getInstance().getCommands().add(new GenerateCommand(SquadMenu.getSquad().getSquad(), AiGenerator.PLAYER));
		
		AiGeneratorInterface.DAEMON_SPAWN_AMOUNT = 0;
		
	}
	
}
