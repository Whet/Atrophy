package atrophy.gameMenu.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.SwingUtilities;

import org.antlr.runtime.RecognitionException;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.SpecialCharacterGenerator;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.Level;
import atrophy.combat.level.LevelIO;
import atrophy.combat.level.LevelManager;
import atrophy.combat.level.MissionManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.hardPanes.CombatHardPane;

public class MenuMapInterface {
	
//	private static final int DAEMON_SPAWN_CHANCE = 2;

	public static void loadLevel(final File chosenLevel, final String owner, final Squad squad, final int engineeringChance, final int medicalChance, final int weaponChance, final int scienceChance, final Missions missions, final ItemMarket itemMarket, final TechTree techTree, final StashManager stashManager, final String sector) throws IOException, RecognitionException {

		ActivePane.getInstance().showLoading();
		
		final List<AiGeneratorInterface.GenerateCommand> generationCommands = new ArrayList<AiGeneratorInterface.GenerateCommand>();
		
		final TurnProcess turnProcess = new TurnProcess();
		final LevelManager levelManager = new LevelManager();
		final CombatNCEManager combatInorganicManager = new CombatNCEManager(levelManager);
		final AiManagementSuite aiManagementSuite = new AiManagementSuite(turnProcess, combatInorganicManager, levelManager, squad);
		final UiUpdaterSuite uiUpdaterSuite = new UiUpdaterSuite(aiManagementSuite, turnProcess, levelManager, combatInorganicManager);
		final MissionManager missionManager = new MissionManager(missions, uiUpdaterSuite.getCombatUiManager().getLargeEventText());
		final ActionSuite actionSuite = new ActionSuite(aiManagementSuite, uiUpdaterSuite, turnProcess, levelManager, squad, techTree, stashManager, missions, missionManager);
		final Level level = LevelIO.loadLevel(chosenLevel, owner, engineeringChance, medicalChance, weaponChance, scienceChance, uiUpdaterSuite.getPanningManager(), turnProcess, uiUpdaterSuite.getMessageBox(), aiManagementSuite.getAiCrowd(), aiManagementSuite.getCombatMembersManager(), missions, missionManager, generationCommands, itemMarket, techTree, stashManager, uiUpdaterSuite.getCombatVisualManager());
		
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

//				missions.updatePlanners();
				
				// A.
				levelManager.setCurrentLevel(level);
				uiUpdaterSuite.lazyLoad(actionSuite.getMouseAbilityHandler(), aiManagementSuite.getAiCrowd(), levelManager, actionSuite.getCombatMouseHandler(), turnProcess);
				// Moved from A. without checking		
				aiManagementSuite.lazyLoad(uiUpdaterSuite, actionSuite.getMouseAbilityHandler());
				setSpawns(owner, levelManager, squad, itemMarket, generationCommands, missions, sector);
				turnProcess.lazyLoad(missionManager, aiManagementSuite, uiUpdaterSuite, combatInorganicManager, actionSuite);
				
				ActivePane.getInstance().changeRootCrowd(new Crowd(new CombatHardPane(turnProcess, aiManagementSuite, uiUpdaterSuite, actionSuite, levelManager, aiManagementSuite.getAiCrowd(), combatInorganicManager, generationCommands, missionManager, missions, uiUpdaterSuite.getCartographer(), uiUpdaterSuite.getMessageBox())));
			}
		});
		
	}

	private static void setSpawns(String owner, LevelManager levelManager, Squad squad, ItemMarket itemMarket, List<AiGeneratorInterface.GenerateCommand> generationCommands, Missions missions, String sector) {
		
//		if(new Random().nextInt(10) < DAEMON_SPAWN_CHANCE && levelManager.getCurrentLevel().allowedSpawn(AiGenerator.DAEMON)) {
//			// Spawn daemon only map
//			generationCommands.add(new AiGeneratorInterface.DaemonRandomSpawn(AiGeneratorInterface.DaemonRandomSpawn.AXE));
//			generationCommands.add(new GenerateCommand(squad.getSquad(), AiGenerator.PLAYER));
//			return;
//		}
		
		int banditTeamSpawn = levelManager.getBlocks().length / 4 + 1;
		
		if(banditTeamSpawn > 5)
			banditTeamSpawn = 5;
		
		int whiteVistaTeamSpawn = levelManager.getBlocks().length / 4 + 1;
		
		if(whiteVistaTeamSpawn > 5)
			whiteVistaTeamSpawn = 5;
		
		int lonerTeamSpawn = new Random().nextInt(4);
		
		// Cancel spawns if not specified
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.BANDITS))
			banditTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.WHITE_VISTA))
			whiteVistaTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(AiGenerator.LONER))
			lonerTeamSpawn = 0;
		
		for(int i = 0; i < banditTeamSpawn; i++){
			SoloGenerateCommand specialCharacter = null;
			
			if(new Random().nextInt(10) < 1)
				specialCharacter = SpecialCharacterGenerator.specialCharacters(missions, itemMarket.getBanditsAllowedItems(), itemMarket.getBanditsAllowedWeapons(), AiGenerator.BANDITS, sector);
			
			if(specialCharacter == null)
				generationCommands.add(new GenerateCommand(2, 3, itemMarket.getBanditsAllowedItems(), itemMarket.getBanditsAllowedWeapons(), AiGenerator.BANDITS));
			else
				generationCommands.add(specialCharacter);
			
		}
		for(int i = 0; i < whiteVistaTeamSpawn; i++){
			SoloGenerateCommand specialCharacter = null;
			
			if(new Random().nextInt(10) < 1)
				specialCharacter = SpecialCharacterGenerator.specialCharacters(missions, itemMarket.getWhiteVistaAllowedItems(), itemMarket.getWhiteVistaAllowedWeapons(), AiGenerator.WHITE_VISTA, sector);
			
			if(specialCharacter == null)
				generationCommands.add(new GenerateCommand(2, 3, itemMarket.getWhiteVistaAllowedItems(), itemMarket.getWhiteVistaAllowedWeapons(), AiGenerator.WHITE_VISTA));
			else
				generationCommands.add(specialCharacter);
		}
		for(int i = 0; i < lonerTeamSpawn; i++){
			SoloGenerateCommand specialCharacter = null;
			
			if(new Random().nextInt(10) < 1)
				specialCharacter = SpecialCharacterGenerator.specialCharacters(missions, itemMarket.getLonerAllowedItems(), itemMarket.getLonerAllowedWeapons(), AiGenerator.LONER, sector);
			
			if(specialCharacter == null)
				generationCommands.add(new GenerateCommand(2, 3, itemMarket.getLonerAllowedItems(), itemMarket.getLonerAllowedWeapons(), AiGenerator.LONER));
			else
				generationCommands.add(specialCharacter);
		}

		generationCommands.add(new GenerateCommand(squad.getSquad(), AiGenerator.PLAYER));
		
		
	}
	
}
