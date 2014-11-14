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
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.Faction;
import atrophy.combat.ai.SpecialCharacterGenerator;
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
	
	public static void loadLevel(final File chosenLevel, final Faction owner, final Squad squad, final int engineeringChance, final int medicalChance, final int weaponChance, final int scienceChance, final Missions missions, final ItemMarket itemMarket, final TechTree techTree, final StashManager stashManager, final String sector) throws IOException, RecognitionException {

		ActivePane.getInstance().showLoading();
		
		final List<AiGeneratorInterface.GenerateCommand> generationCommands = new ArrayList<AiGeneratorInterface.GenerateCommand>();
		
		final TurnProcess turnProcess = new TurnProcess();
		final LevelManager levelManager = new LevelManager();
		final AiManagementSuite aiManagementSuite = new AiManagementSuite(turnProcess, levelManager, squad);
		final UiUpdaterSuite uiUpdaterSuite = new UiUpdaterSuite(aiManagementSuite, turnProcess, levelManager);
		final MissionManager missionManager = new MissionManager(missions, uiUpdaterSuite.getCombatUiManager().getLargeEventText());
		final ActionSuite actionSuite = new ActionSuite(aiManagementSuite, uiUpdaterSuite, turnProcess, levelManager, techTree, stashManager, missions, missionManager);
		final Level level = LevelIO.loadLevel(chosenLevel, owner, engineeringChance, medicalChance, weaponChance, scienceChance, uiUpdaterSuite.getPanningManager(), turnProcess, uiUpdaterSuite.getMessageBox(), aiManagementSuite.getAiCrowd(), aiManagementSuite.getCombatMembersManager(), missions, missionManager, itemMarket, techTree, stashManager, uiUpdaterSuite.getCombatVisualManager());

		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

//				missions.updatePlanners();
				
				// A.
				levelManager.setCurrentLevel(level);
				uiUpdaterSuite.lazyLoad(actionSuite.getMouseAbilityHandler(), aiManagementSuite.getAiCrowd(), levelManager, actionSuite.getCombatMouseHandler(), turnProcess);
				// Moved from A. without checking		
				aiManagementSuite.lazyLoad(uiUpdaterSuite, actionSuite.getMouseAbilityHandler());
				setSpawns(levelManager, squad, itemMarket, generationCommands, missions, sector);
				turnProcess.lazyLoad(missionManager, aiManagementSuite, uiUpdaterSuite, actionSuite);
				
				ActivePane.getInstance().changeRootCrowd(new Crowd(new CombatHardPane(turnProcess, aiManagementSuite, uiUpdaterSuite, actionSuite, levelManager, aiManagementSuite.getAiCrowd(), generationCommands, missionManager, uiUpdaterSuite.getMessageBox())));
			}
		});
		
	}

	private static void setSpawns(LevelManager levelManager, Squad squad, ItemMarket itemMarket, List<AiGeneratorInterface.GenerateCommand> generationCommands, Missions missions, String sector) {
		
		int banditTeamSpawn = levelManager.getBlocks().length / 5 + 1;
		
		if(banditTeamSpawn > 5)
			banditTeamSpawn = 5;
		
		int whiteVistaTeamSpawn = levelManager.getBlocks().length / 5 + 1;
		
		if(whiteVistaTeamSpawn > 5)
			whiteVistaTeamSpawn = 5;
		
		int lonerTeamSpawn = new Random().nextInt(4);
		
		// Cancel spawns if not specified
		if(!levelManager.getCurrentLevel().allowedSpawn(Faction.BANDITS))
			banditTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(Faction.WHITE_VISTA))
			whiteVistaTeamSpawn = 0;
		
		if(!levelManager.getCurrentLevel().allowedSpawn(Faction.LONER))
			lonerTeamSpawn = 0;
		
		for(int i = 0; i < banditTeamSpawn; i++){
			SoloGenerateCommand specialCharacter = null;
			
			if(new Random().nextInt(10) < 1)
				specialCharacter = SpecialCharacterGenerator.specialCharacters(missions, Faction.BANDITS, sector);
			
			// There may be no available special characters
			if(specialCharacter == null)
				generationCommands.add(new GenerateCommand(1, 2, itemMarket.getBanditsAllowedItems(), itemMarket.getBanditsAllowedWeapons(), Faction.BANDITS));
			else
				generationCommands.add(specialCharacter);
			
		}
		for(int i = 0; i < whiteVistaTeamSpawn; i++){
			SoloGenerateCommand specialCharacter = null;
			
			if(new Random().nextInt(10) < 1)
				specialCharacter = SpecialCharacterGenerator.specialCharacters(missions, Faction.WHITE_VISTA, sector);
			
			// There may be no available special characters
			if(specialCharacter == null)
				generationCommands.add(new GenerateCommand(1, 2, itemMarket.getWhiteVistaAllowedItems(), itemMarket.getWhiteVistaAllowedWeapons(), Faction.WHITE_VISTA));
			else
				generationCommands.add(specialCharacter);
		}
		for(int i = 0; i < lonerTeamSpawn; i++){
			SoloGenerateCommand specialCharacter = null;
			
			if(new Random().nextInt(10) < 1)
				specialCharacter = SpecialCharacterGenerator.specialCharacters(missions, Faction.LONER, sector);
			
			// There may be no available special characters
			if(specialCharacter == null)
				generationCommands.add(new GenerateCommand(1, 2, itemMarket.getLonerAllowedItems(), itemMarket.getLonerAllowedWeapons(), Faction.LONER));
			else
				generationCommands.add(specialCharacter);
		}

		generationCommands.add(new GenerateCommand(squad.getSquad(), Faction.PLAYER));
		
		
	}
	
}
