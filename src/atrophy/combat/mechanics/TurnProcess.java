package atrophy.combat.mechanics;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.Maths;
import watoydoEngine.workings.DisplayManager;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.ActionSuite;
import atrophy.combat.actions.CombatKeyboardHandler;
import atrophy.combat.actions.CombatMouseHandler;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiCombatActions;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.combatEffects.PowerManager;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.MapDrawer;
import atrophy.combat.display.ui.CartographerBox;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.MissionManager;
import atrophy.hardPanes.SplashPane;

public class TurnProcess {
	
	private int turnCount;
	
	private Stack<Ai> shuffledAi;
	
	private boolean turnInProgress;

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
	private CombatNCEManager combatInorganicManager;
	private MapDrawer mapDrawer;
	private PanningManager panningManager;
	private PowerManager powerManager;
	private MissionManager missionManager;
	private boolean[] deadAliveAi;
	
	public TurnProcess(){
		turnCount = 0;
		turnInProgress = false;
	}
	
	public void lazyLoad(MissionManager missionManager, AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, CombatNCEManager combatInorganicManager, ActionSuite actionSuite){
		
		this.panningManager = uiUpdaterSuite.getPanningManager();
		
		this.aiCrowd = aiManagementSuite.getAiCrowd();
		this.combatMembersManager = aiManagementSuite.getCombatMembersManager();
		this.combatInorganicManager = combatInorganicManager;
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
		
		shuffledAi = aiCrowd.getShuffledStack();
		
	}
	
	public synchronized void endTurn(){
		if(!turnInProgress && !allPlayersWaiting()){
			
			deadAliveAi = new boolean[aiCrowd.getActorCount()];
			for(int i = 0; i < deadAliveAi.length; i++) {
				deadAliveAi[i] = aiCrowd.getActor(i).isDead();
			}
			
			turnInProgress = true;
			combatMouseHandler.setActive(false);
			combatKeyboardHandler.setFocus(false);
			mouseAbilityHandler.cancelAbilitySetting();
			combatUiManager.getActionsBar().setVisible(false);
			aiCrowd.setActive(false);
				
			if(turnCount > 0 && turnCount%20 == 0){
				combatUiManager.getLargeEventText().flashText("Turn " + turnCount, Color.white);
			}
			
			turnCount++;
			
			messageBox.setVisible(false);
			lootBox.setVisible(false);
			cartographerBox.setVisible(false);
			
			combatVisualManager.setTableMasks(false);
			updateAiLocations();
			updateAiBrass();
			
			updateAi();
			updateTriggers();
			
		}
	}
	
	public void updateTriggers() {
		for(Ai ai : this.aiCrowd.getActors()) {
			if(ai.getFaction().equals(AiGenerator.PLAYER) && !ai.isDead()) {
				missionManager.triggerStoryMessage(ai.getLevelBlock());
			}
		}
		
		missionManager.checkTriggers();
		
		// Check if all units in saferoom to display hint text
		boolean teamInSaferoom = false;
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActor(i).getFaction().equals(AiGenerator.PLAYER) &&
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
		
//		long time = System.currentTimeMillis();
		
		List<Ai> chain = new ArrayList<>();
		
		if(shuffledAi.size() == 0) {
			shuffledAi = aiCrowd.getShuffledStack();
			combatInorganicManager.updateAssets();
			powerManager.tickPowers();
			
			if(checkGameOver()){
				endGame();
				combatUiManager.getLargeEventText().holdText("Defeated", new Color(186,17,18));
				return;
			}
		}

		Ai chainStart = nextNonDeadAi();
		
		Ai ai = chainStart;
		Ai nextAi;
		
		chain.add(ai);
		
		do {
			nextAi = nextNonDeadAi();
			
			// Gameover
			if(nextAi == null)
				return;
			
			if(!nextAi.isSkippingTurns()) {
				shuffledAi.add(nextAi);
				break;
			}
			chain.add(nextAi);
			ai.setNextAi(nextAi);
			ai = nextAi;
		}
		while(nextAi.isSkippingTurns());
		
//		for (Ai aiN : chain) {
//			System.out.print(aiN.getName() + ", ");
//		}
//		System.out.println("");
		
		chainStart.action();

//		System.out.println(System.currentTimeMillis() - time);
		
	}
	
	private Ai nextNonDeadAi() {
		Ai ai;
		do {
			
			if(shuffledAi.size() == 0) {
				shuffledAi = aiCrowd.getShuffledStack();
				combatInorganicManager.updateAssets();
				powerManager.tickPowers();
				
				if(checkGameOver()){
					endGame();
					combatUiManager.getLargeEventText().holdText("Defeated", new Color(186,17,18));
					return null;
				}
			}
			
			ai = shuffledAi.pop();
			
		}
		while(ai.isDead());
		
		return ai;
	}

	private boolean allPlayersWaiting() {
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActor(i).getFaction().equals(AiGenerator.PLAYER) && !aiCrowd.getActor(i).isSkippingTurns() && !aiCrowd.getActor(i).isDead()){
				return false;
			}
		}
		return true;
	}

	public void lastAiUpdated(){
		
		boolean playDeathSound = false;
		for(int i = 0; i < deadAliveAi.length; i++) {
			if(deadAliveAi[i] != aiCrowd.getActor(i).isDead() && combatVisualManager.isAiInSight(null, aiCrowd.getActor(i), AiGenerator.PLAYER)) {
				playDeathSound = true;
				break;
			}
		}
		
		if(shuffledAi.size() == 0){
			shuffledAi = aiCrowd.getShuffledStack();
			combatInorganicManager.updateAssets();
			powerManager.tickPowers();
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
		turnInProgress = false;
		
		updateTweens();
		
		if(aiCrowd.getDirector().isPlayerAttacked())
			SoundBoard.getInstance().playEffect("hostileSound");
		
		if(playDeathSound)
			SoundBoard.getInstance().playEffect("death");
		
		// not else if as isPlayerAttacker resets the boolean for the turn
		if(aiCrowd.getDirector().isPlayerAttacker() && !playDeathSound)
			SoundBoard.getInstance().playEffect("dangerSound");
		
		
	}
	
	private void updateTweens() {
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			aiCrowd.getMask(i).updateTween();
		}
	}

	private void updateUi(){
		
		// Set control to topAi
		if(getTopAi().getFaction().equals(AiGenerator.PLAYER))
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
			   aiCrowd.getActor(i).getFaction().equals("Player")){
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
		return turnCount;
	}
	
	public Ai getTopAi() {
		return this.shuffledAi.peek();
	}

	public void replaceAi(ThinkingAi thinkingAi, Ai playerAi) {
		for(int i = 0; i < shuffledAi.size(); i++){
			if(shuffledAi.get(i) == thinkingAi){
				shuffledAi.set(i, playerAi);
			}
		}
	}

	public void setPowerManager(PowerManager powerManager) {
		this.powerManager = powerManager;
	}
	
}
