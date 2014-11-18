package atrophy.combat.actions;

import java.awt.event.KeyEvent;

import watoydoEngine.designObjects.actions.ActivePaneTimer;
import watoydoEngine.designObjects.actions.KeyboardHandler;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Faction;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.CartographerBox;
import atrophy.combat.display.ui.LargeEventText;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.MissionManager;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.StashManager;
import atrophy.hardPanes.GameMenuHardPane;

public class CombatKeyboardHandler extends KeyboardHandler {
	
	private PanningManager panningManager;
	private CombatUiManager combatUiManager;
	private MessageBox messageBox;
	private AiCrowd aiCrowd;
	private CartographerBox cartographerBox;
	private LootBox lootBox;
	private CombatMembersManager combatMembersManager;
	private TurnProcess turnProcess;
	private MouseAbilityHandler mouseAbilityHandler;
	private CombatVisualManager combatVisualManager;
	private TechTree techTree;
	private StashManager stashManager;
	private Missions missions;
	private MissionManager missionManager;
	
	public CombatKeyboardHandler(MouseAbilityHandler mouseAbilityHandler, TurnProcess turnProcess, AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, TechTree techTree, StashManager stashManager, Missions missions, MissionManager missionManager){
		
		this.aiCrowd = aiManagementSuite.getAiCrowd();
		this.combatMembersManager = aiManagementSuite.getCombatMembersManager();
		
		this.combatUiManager = uiUpdaterSuite.getCombatUiManager();
		this.messageBox = uiUpdaterSuite.getMessageBox();
		this.cartographerBox = uiUpdaterSuite.getCartographerBox();
		this.lootBox = uiUpdaterSuite.getLootBox();
		this.combatVisualManager = uiUpdaterSuite.getCombatVisualManager();
		this.panningManager = uiUpdaterSuite.getPanningManager();
		this.missions = missions;
		
		this.turnProcess = turnProcess;
		this.mouseAbilityHandler = mouseAbilityHandler;
		
		this.techTree = techTree;
		this.stashManager = stashManager;
		
		this.missionManager = missionManager;
		this.setActionZ(1);
	}
	
	public static boolean SHIFT_DOWN = false;
	
	@Override
	public boolean kD(KeyEvent e) {
		switch(e.getKeyCode()){
			// left
			case 37:
			case 65:
				panningManager.panX((100 / (60/ ActivePaneTimer.redrawRate)));
			break;
			// right
			case 39:
			case 68:
				panningManager.panX((-100 / (60/ ActivePaneTimer.redrawRate)));
			break;
			// up
			case 38:
			case 87:
				panningManager.panY((100 / (60/ ActivePaneTimer.redrawRate)));
			break;
			// down
			case 40:
			case 83:
				panningManager.panY((-100 / (60/ ActivePaneTimer.redrawRate)));
			break;
			
			// shift
			case 16:
				SHIFT_DOWN = true;
			break;
		}
		return true;
	}
	
	@Override
	public boolean kU(KeyEvent e) {
		switch(e.getKeyCode()){
			
			//[
			case 91:
				messageBox.incrementLeastMessage();
			break;
			
			// ]
			case 93:
				messageBox.decrementLeastMessage();
			break;
		
			// ,
			case 44:
				if(SHIFT_DOWN){
					SoundBoard.getInstance().modifyEffectVolume(-0.1f);
				}
				else{
					SoundBoard.getInstance().modifyMusicVolume(-0.1f);
				}
			break;
			
			// .
			case 46:
				if(SHIFT_DOWN){
					SoundBoard.getInstance().modifyEffectVolume(0.1f);
				}
				else{
					SoundBoard.getInstance().modifyMusicVolume(0.1f);
				}
			break;
				
			//esc
			case 27:
				
				boolean teamInSaferoom = false;
				
				for(int i = 0; i < aiCrowd.getActorCount(); i++){
					if(aiCrowd.getActor(i).getFaction().equals(Faction.PLAYER) &&
					   !aiCrowd.getActor(i).isDead() &&
					   missionManager.isInSaferoom(aiCrowd.getActor(i).getLevelBlock())){
						teamInSaferoom = true;
					}
				}
				
				if(teamInSaferoom){
					// Cleanup timer thread
					LargeEventText.flashTimer.cancel();
					LargeEventText.flashTimer.purge();
					
					missions.checkDeadSpecialCharacters(aiCrowd);
					
					Squad saveToSquad = aiCrowd.saveToSquad();
					
					// saveToSquad calculates mission kills, must be called first
					missions.setPlayerMissionKills(aiCrowd.getBanditKillCount(), aiCrowd.getLonerKillCount(), aiCrowd.getWhiteVistaKillCount());
					missions.setTotalMissionDeaths(aiCrowd.getDirector().getTotalBanditDeaths(), aiCrowd.getDirector().getTotalLonerDeaths(), aiCrowd.getDirector().getTotalWVDeaths());
					missions.setLivingMembers(aiCrowd.getLivingActors(Faction.BANDITS), aiCrowd.getLivingActors(Faction.LONER), aiCrowd.getLivingActors(Faction.WHITE_VISTA));
					
					ActivePane.getInstance().changeRootCrowd(new Crowd(new GameMenuHardPane(saveToSquad, techTree, stashManager, missions)));
				}
				
			break;
		
			// T
			case 84:
				if(combatMembersManager.getCurrentAi() != null){
					combatMembersManager.getCurrentAi().tradeWithClosestAlly();
				}
			break;
			
			// U
			case 85:
				cartographerBox.setVisible(!cartographerBox.isVisible());
				lootBox.closeLootUi(lootBox.isVisible());
				messageBox.setVisible(false);
			break;
		
			// I
			case 73:
				if(combatMembersManager.getCurrentAi() != null && 
				   !combatMembersManager.getCurrentAi().equals("Looting")){
					lootBox.toggleInventoryDisplay(combatMembersManager.getCurrentAi());
					cartographerBox.setVisible(false);
				}
			break;
			
			// O
			case 79:
				messageBox.setVisible(!messageBox.isVisible());
				lootBox.closeLootUi();
				combatUiManager.getActionsBar().setVisible(!messageBox.isVisible());
				cartographerBox.setVisible(false);
			break;
			
			// P
			case 80:
				lootBox.closeLootUi();
				cartographerBox.setVisible(false);
				messageBox.setVisible(false);
				mouseAbilityHandler.setAbility("LookAtInventory");
			break;
			
			// F
			case 70:
				if(combatMembersManager.getCurrentAi() != null && !combatMembersManager.getCurrentAi().isDead()){
					combatMembersManager.getCurrentAi().setSkippingTurns(!combatMembersManager.getCurrentAi().isSkippingTurns());
					combatUiManager.getAllyRoster().updateMasks();
				}
			break;
			
			// k DEBUG
			case 75:
//				combatMembersManager.getCurrentAi().setDead(true);
//				mouseAbilityHandler.setAbility("Hack");
//				mouseAbilityHandler.setAbility("DebugKill");
				mouseAbilityHandler.setAbility("DebugAi");
			break;
			
			// Z
			case 90:
				mouseAbilityHandler.setAbility("PowerKill");
			break;
			
			// X
			case 88:
				mouseAbilityHandler.setAbility("PowerProtect");
			break;
			
			// C
			case 67:
//				mouseAbilityHandler.setAbility("PowerHelp");
				missionManager.changeStability(+10);
			break;
			
			// V
			case 86:
			break;
			
			// X panning
			case 37:
			case 39:
			case 65:
			case 68:
				panningManager.panX(0);
			break;
			// Y panning
			case 38:
			case 40:
			case 87:
			case 83:
				panningManager.panY(0);
			break;
		
			// backspace
			case 8:
				if(combatMembersManager.getCurrentAi() != null){
					combatMembersManager.getCurrentAi().removeOrders(mouseAbilityHandler);
					combatUiManager.updateUi();
				}
			break;
			
			// Space bar
			case 32:
//				if(!messageBox.isVisible())
//					turnProcess.endTurn();
				turnProcess.togglePaused();
			break;
			
			// 1
			case 49:
				combatMembersManager.changeCurrentAi(0);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 2
			case 50:
				combatMembersManager.changeCurrentAi(1);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 3
			case 51:
				combatMembersManager.changeCurrentAi(2);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 4
			case 52:
				combatMembersManager.changeCurrentAi(3);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 5
			case 53:
				combatMembersManager.changeCurrentAi(4);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 6
			case 54:
				combatMembersManager.changeCurrentAi(5);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 7
			case 55:
				combatMembersManager.changeCurrentAi(6);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 8
			case 56:
				combatMembersManager.changeCurrentAi(7);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// 9
			case 57:
				combatMembersManager.changeCurrentAi(8);
				panningManager.panToPlayer();
				SoundBoard.getInstance().playEffect("tick");
				
				if(messageBox.isVisible())
					combatUiManager.getActionsBar().setVisible(false);
			break;
			
			// Num 7
			case 103:
				combatUiManager.getActionsBar().activateButton(0);
			break;
			
			// Num 8
			case 104:
				combatUiManager.getActionsBar().activateButton(1);
			break;
			
			// Num 9
			case 105:
				combatUiManager.getActionsBar().activateButton(2);
			break;
			
			// Num 4
			case 100:
				combatUiManager.getActionsBar().activateButton(3);
			break;
			
			// Num 5
			case 101:
				combatUiManager.getActionsBar().activateButton(4);
			break;
			
			// Num 6
			case 102:
				combatUiManager.getActionsBar().activateButton(5);
			break;
			
			// Num 1
			case 97:
				combatUiManager.getActionsBar().activateButton(6);
			break;
			
			// Num 2
			case 98:
				combatUiManager.getActionsBar().activateButton(7);
			break;
			
			// Num 3
			case 99:
				combatUiManager.getActionsBar().activateButton(8);
			break;
			
			// Q
			case 81:
				combatVisualManager.toggleTableMasks();
			break;
			
			// L
			case 76:
//				messageBox.toggleLock();
//				cartographerBox.toggleLock();
//				lootBox.toggleLock();
			break;
			
			// Num +
			case 107:
				combatVisualManager.revealAll();
			break;
			
			// shift
			case 16:
				SHIFT_DOWN = false;
			break;
			
			default:
				System.out.println(e.getKeyCode());
			break;
		}
		return true;
	}

}
