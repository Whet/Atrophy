package atrophy.combat.mechanics;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.Maths;
import watoydoEngine.workings.DisplayManager;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.actions.CombatKeyboardHandler;
import atrophy.combat.actions.CombatMouseHandler;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiCombatActions;
import atrophy.combat.ai.Faction;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.MapDrawer;
import atrophy.combat.display.ui.CartographerBox;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.MissionManager;
import atrophy.hardPanes.SplashPane;

public class TurnProcess {
	
	private AiCrowd aiCrowd;
	private CombatMouseHandler combatMouseHandler;
	private CombatKeyboardHandler combatKeyboardHandler;
	private CombatUiManager combatUiManager;
	private MessageBox messageBox;
	private LootBox lootBox;
	private CartographerBox cartographerBox;
	private FloatingIcons floatingIcons;
	private MouseAbilityHandler mouseAbilityHandler;
	private CombatVisualManager combatVisualManager;
	private CombatMembersManager combatMembersManager;
	private MapDrawer mapDrawer;
	private PanningManager panningManager;
	private MissionManager missionManager;
	private boolean[] deadAliveAi;

	private TurnOrderer turnOrderer;

	public TurnProcess(TurnOrderer turnOrderer){
		this.turnOrderer = turnOrderer;
	}
	
	public void lazyLoad(MissionManager missionManager, AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, ActionSuite actionSuite){
		
		this.panningManager = uiUpdaterSuite.getPanningManager();
		
		this.aiCrowd = aiManagementSuite.getAiCrowd();
		this.combatMembersManager = aiManagementSuite.getCombatMembersManager();
		this.mapDrawer = uiUpdaterSuite.getCombatUiManager().getMapDrawer();
		
		this.combatVisualManager = uiUpdaterSuite.getCombatVisualManager();
		this.combatUiManager = uiUpdaterSuite.getCombatUiManager();
		this.messageBox = uiUpdaterSuite.getMessageBox();
		this.lootBox = uiUpdaterSuite.getLootBox();
		this.cartographerBox = uiUpdaterSuite.getCartographerBox();
		this.floatingIcons = uiUpdaterSuite.getFloatingIcons();
		
		this.combatMouseHandler = actionSuite.getCombatMouseHandler();
		this.combatKeyboardHandler = actionSuite.getCombatKeyboardHandler();
		this.mouseAbilityHandler = actionSuite.getMouseAbilityHandler();
		
		this.missionManager = missionManager;
		
	}
	
	public void endTurn(){
			
		deadAliveAi = new boolean[aiCrowd.getActorCount()];
		for(int i = 0; i < deadAliveAi.length; i++) {
			deadAliveAi[i] = aiCrowd.getActor(i).isDead();
		}
		
		combatMouseHandler.setActive(false);
		combatKeyboardHandler.setFocus(false);
		mouseAbilityHandler.cancelAbilitySetting();
		combatUiManager.getActionsBar().setVisible(false);
		aiCrowd.setActive(false);
			
		messageBox.setVisible(false);
		lootBox.setVisible(false);
		cartographerBox.setVisible(false);
		
		combatVisualManager.setTableMasks(false);
		updateAiLocations();
		updateAiBrass();
		
		updateAi();
		updateTriggers();
			
	}
	
	public void updateTriggers() {
		for(Ai ai : this.aiCrowd.getActors()) {
			if(ai.getFaction().equals(Faction.PLAYER) && !ai.isDead()) {
				missionManager.triggerStoryMessage(ai.getLevelBlock());
			}
		}
		
		missionManager.checkTriggers();
		
		// Check if all units in saferoom to display hint text
		boolean teamInSaferoom = false;
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActor(i).getFaction().equals(Faction.PLAYER) &&
			   !aiCrowd.getActor(i).isDead() &&
			   missionManager.isInSaferoom(aiCrowd.getActor(i).getLevelBlock())){
				teamInSaferoom = true;
			}
		}
		
		if(teamInSaferoom){
			combatUiManager.getInfoText().displayInfo("Press Esc to leave level");
		}
		else {
			combatUiManager.getInfoText().removeInfo("Press Esc to leave level");
		}
		
		if(checkGameOver())
			this.endGame();
	}

	private void updateAiLocations(){
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			aiCrowd.getMask(i).updateImage();
		}
	}
	
	private void updateAiBrass(){
		combatMembersManager.updateCommanders();
	}
	
	private void updateAi(){
			
		if(checkGameOver()){
			endGame();
			combatUiManager.getLargeEventText().holdText("Defeated", new Color(186,17,18));
			return;
		}

		Ai ai = turnOrderer.getNextAiTurn();
		ai.action();
		
	}
	
	public void lastAiUpdated(){
		
		boolean playDeathSound = false;
		for(int i = 0; i < deadAliveAi.length; i++) {
			if(deadAliveAi[i] != aiCrowd.getActor(i).isDead() && combatVisualManager.isAiInSight(null, aiCrowd.getActor(i), Faction.PLAYER)) {
				playDeathSound = true;
				break;
			}
		}
		
		combatUiManager.getActionsBar().setVisible(true);
		updateUi();
		
		if(checkGameOver()){
			endGame();
			combatUiManager.getLargeEventText().holdText("Defeated", new Color(186,17,18));
			return;
		}
		
		floatingIcons.updatePending();
		messageBox.updateMessages();
		
		combatMouseHandler.setActive(true);
		combatKeyboardHandler.setFocus(true);
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			aiCrowd.getMask(i).setActive(true);
		}
		
		mapDrawer.updateAlphas();
		
		updateTweens();
		
		if(aiCrowd.getDirector().isPlayerAttacked())
			SoundBoard.getInstance().playEffect("hostileSound");
		
		if(playDeathSound)
			SoundBoard.getInstance().playEffect("death");
		
		// not else if as isPlayerAttacker resets the boolean for the turn
		if(aiCrowd.getDirector().isPlayerAttacker() && !playDeathSound)
			SoundBoard.getInstance().playEffect("dangerSound");
		
		turnOrderer.turnOver();
	}
	
	private void updateTweens() {
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			aiCrowd.getMask(i).updateTween();
		}
	}

	private void updateUi(){
		
		combatUiManager.getTorchDrawer().updateFovLight(combatMembersManager.getCurrentAi());
		
		// Set control to topAi
		if(getTopAi().getFaction().equals(Faction.PLAYER))
			combatMembersManager.setCurrentAi(getTopAi());
		
		// Update any graphics or settings since all actors have done their actions
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			
			//Update images to reflect any effects that happened in the turn
			Ai actor = aiCrowd.getActor(i);
			aiCrowd.getActorMask(actor).updateMask();
			
			// If a target was killed/went out of room, all ai aiming at the target need to be updated
			if((actor.getAction().equals(AiCombatActions.AIMING) || actor.getAction().equals(AiCombatActions.SHOOTING)) &&
			   (actor.getTargetAi() == null || actor.getTargetAi().isDead() || 
			    actor.getTargetAi().getLevelBlock() != actor.getLevelBlock() ||
			    (!actor.getWeapon().ignoresLOS() && !CombatVisualManager.isInFiringSight(actor.getLocation()[0],
			    									 actor.getLocation()[1], 
											         actor.getTargetAi().getLocation()[0], 
											         actor.getTargetAi().getLocation()[1],
											         actor.getLevelBlock())))){
				
				actor.setAction("");
				actor.setTargetAi(null);
				actor.setSwing(0);
			}
		}
		
		combatVisualManager.updateVisibleAi();
		
		// If player is at target then remove marker
		if(combatMembersManager.getCurrentAi() != null && Maths.getDistance(combatMembersManager.getCurrentAi().getLocation(), combatMembersManager.getCurrentAi().getMoveLocation()) == 0)
			combatUiManager.getMoveFlag().setVisible(false);
	
		// Update help text as some items might be displaying old information
		combatUiManager.updateUi();
		combatUiManager.getMiniMap().updateAiDrawing();
		combatUiManager.getFloatingIcons().updateOverlappingIcons();
		
		// reorder z in case units died
		ActivePane.getInstance().getRootCrowd().computeZOrder();
	}
	
	private boolean checkGameOver(){
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(!aiCrowd.getActor(i).isDead() &&
			   aiCrowd.getActor(i).getFaction().equals(Faction.PLAYER)){
				return false;
			}
		}
		return true;
	}
	
	private void endGame(){
		
		SoundBoard.getInstance().playEffect("death");
		panningManager.panToPlayer();
		combatUiManager.getAllyRoster().setVisible(false);
		combatUiManager.getActionText().setVisible(false);
		combatUiManager.getActionsBar().setVisible(false);
		combatUiManager.getCombatInfo().setVisible(false);
		
		combatVisualManager.revealAll();
		
		TextButton newGame = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			
			{
				this.setText("To Title Screen");
				this.setVisible(true);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ActivePane.getInstance().changeRootCrowd(new Crowd(new SplashPane()));
				return true;
			}
		};
		newGame.setZ(10);
		newGame.setActionZ(-30);
		newGame.setLocation(DisplayManager.getInstance().getResolution()[0] /2 - 40, DisplayManager.getInstance().getResolution()[1] /2 + 30);
		ActivePane.getInstance().getRootCrowd().addMouseActionItem(newGame);
		ActivePane.getInstance().getRootCrowd().addDisplayItem(newGame);
		ActivePane.getInstance().getRootCrowd().computeZOrder();
		
		combatKeyboardHandler.setFocus(true);
		mapDrawer.updateAlphas();
		updateTweens();
		combatVisualManager.updateVisibleAi();
	}

	public int getTurnCount() {
		return turnOrderer.getTime();
	}
	
	public Ai getTopAi() {
		return turnOrderer.getTopAi();
	}

	public void togglePaused() {
		turnOrderer.togglePaused();
		
		if(turnOrderer.isPaused())
			combatUiManager.getLargeEventText().flashText("Game Paused", Color.white.darker(), 1400);
		else
			combatUiManager.getLargeEventText().flashText("Game Resumed", Color.white.darker(), 1400);
	}
	
	public void pause() {
		turnOrderer.pause();
		combatUiManager.getLargeEventText().flashText("Game Paused", Color.white.darker(), 1400);
	}
	
}
