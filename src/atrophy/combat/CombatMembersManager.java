/*
 * 
 */
package atrophy.combat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.BanditCommander;
import atrophy.combat.ai.DaemonAi;
import atrophy.combat.ai.DaemonCommander;
import atrophy.combat.ai.LonerAi;
import atrophy.combat.ai.LonerCommander;
import atrophy.combat.ai.TeamsCommander;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.ai.WhiteVistaCommander;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.LineDrawer;
import atrophy.combat.display.MapDrawer;
import atrophy.combat.display.TorchDrawer;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class CombatMembersManager {

	private Ai currentAi;
	private List<Ai> playerTeam;
	private ArrayList<TeamsCommander> commanders;
	
	private AiCrowd aiCrowd;
	private TurnProcess turnProcess;
	private UiUpdaterSuite uiUpdaterSuite;
	private MouseAbilityHandler mouseAbilityHandler;
	private CombatNCEManager combatInorganicManager;
	private LevelManager levelManager;
	private TorchDrawer torchDrawer;
	private MapDrawer mapDrawer;
	
	public CombatMembersManager(AiCrowd aiCrowd, TurnProcess turnProcess, LevelManager levelManager, CombatNCEManager combatInorganicManager){
		commanders = new ArrayList<TeamsCommander>(2);
		playerTeam = new ArrayList<Ai>(1);
		
		this.aiCrowd = aiCrowd;
		this.turnProcess = turnProcess;
		this.combatInorganicManager = combatInorganicManager;
		this.levelManager = levelManager;
	}
	
	public void createCommanders() {
		commanders.add(new WhiteVistaCommander(turnProcess, levelManager));
		commanders.add(new BanditCommander(turnProcess, levelManager));
	}
	
	public LonerCommander createLonerCommander() {
		LonerCommander lonerCommander = new LonerCommander(turnProcess, levelManager);
		commanders.add(lonerCommander);
		return lonerCommander;
	}
	
	private DaemonCommander createDaemonCommander() {
		DaemonCommander daemonCommander = new DaemonCommander(turnProcess, levelManager);
		commanders.add(daemonCommander);
		return daemonCommander;
	}
	
	public void addAi(Ai ai) {
		switch(ai.getFaction()) {
			case AiGenerator.BANDITS:
				this.getCommander(AiGenerator.BANDITS).addAi((ThinkingAi) ai);
			break;
			case AiGenerator.DAEMON:
				DaemonCommander daemonCommander = this.createDaemonCommander();
				daemonCommander.addAi((ThinkingAi) ai);
			break;
			case AiGenerator.LONER:
				LonerCommander lonerCommander = this.createLonerCommander();
				lonerCommander.addAi((ThinkingAi) ai);
			break;
			case AiGenerator.PLAYER:
				this.playerTeam.add(ai);
			break;
			case AiGenerator.WHITE_VISTA:
				this.getCommander(AiGenerator.WHITE_VISTA).addAi((ThinkingAi) ai);
			break;
		}
	}
	
	public void lazyLoad(UiUpdaterSuite uiUpdaterSuite, MouseAbilityHandler mouseAbilityHandler){
		this.uiUpdaterSuite = uiUpdaterSuite;
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.torchDrawer = uiUpdaterSuite.getTorchDrawer();
		this.mapDrawer = uiUpdaterSuite.getMapDrawer();
	}
	
	public Ai getCurrentAi(){
		return currentAi;
	}
	
	public Ai getAlly(int i){
		return this.playerTeam.get(i);
	}
	
	public int getAllyCount(){
		return this.playerTeam.size();
	}

	public TeamsCommander getCommander(String faction) {
		
		for(TeamsCommander commander : this.commanders){
			if(commander.getFaction().equals(faction)){
				return commander;
			}
		}
		return null;
	}
	
	public TeamsCommander getCommander(LonerAi ai) {
		for(TeamsCommander commander : this.commanders){
			if(commander.hasAi(ai)){
				return commander;
			}
		}
		return null;
	}
	
	public TeamsCommander getCommander(DaemonAi ai) {
		for(TeamsCommander commander : this.commanders){
			if(commander.hasAi(ai)){
				return commander;
			}
		}
		return null;
	}
	
	public ArrayList<TeamsCommander> getCommanders(){
		return this.commanders;
	}
	
	public void setCurrentAi(Ai currentAi){
		this.currentAi = currentAi;
		torchDrawer.updateFovLight(currentAi);
		mapDrawer.updateAlphas();
	}

	public void changeCurrentAi(Ai currentAi){
		this.setCurrentAi(currentAi);
		uiUpdaterSuite.getCombatUiManager().updateUi();
		uiUpdaterSuite.getCombatVisualManager().updateVisibleAi();
		// cancel setting ability since ai changed
		mouseAbilityHandler.cancelAbilitySetting();
		
		if(this.currentAi.getAction().equals("Looting")){
			uiUpdaterSuite.getLootBox().loadLootDisplay(this.currentAi, this.currentAi.getTargetAi());
		}
		else{
			uiUpdaterSuite.getLootBox().closeLootUi(false);
		}
		mapDrawer.updateAlphas();
	}

	public void changeCurrentAi(int i){
		if(i < this.getAllyCount() && this.getAlly(i) != null){
			
			this.changeCurrentAi(this.getAlly(i));
			
			if(this.currentAi.getAction().equals("Looting")){
				uiUpdaterSuite.getLootBox().loadLootDisplay(this.currentAi, this.currentAi.getTargetAi());
			}
			else{
				uiUpdaterSuite.getLootBox().closeLootUi(false);
			}
			
		}
	}
	
	public void updateCommanders(){
		
		for(int i = 0; i < this.commanders.size(); i++){
			this.commanders.get(i).updateInformation();
		}
	}
	
	public boolean isSelected(Ai ai){
		return this.currentAi == ai;
	}
	
	public void pickStartingAi(){
		for(Ai ai : aiCrowd.getActors()){
			if(ai.getFaction().equals(AiGenerator.PLAYER)){
				this.setCurrentAi(ai);
				return;
			}
		}
	}
	
	public int getFactionStrength(String faction, LevelBlock levelBlock) {
		int strength = 0;
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if(aiCrowd.getActor(i).getFaction().equals(faction) && aiCrowd.getActor(i).getLevelBlock() == levelBlock)
				strength += aiCrowd.getActor(i).getCombatScore();
		}
		
		return strength;
	}
	
	public boolean factionsAllied(String faction, String faction2) {
		for(TeamsCommander commander : this.commanders){
			if(commander.getFaction().equals(faction)){
				return commander.isAlliedWith(faction2);
			}
			else if(commander.getFaction().equals(faction2)){
				return commander.isAlliedWith(faction);
			}
		}
		return false;
	}
	
	public void changeThinkingAiToPlayerAi(ThinkingAi thinkingAi){
		Ai playerAi = new Ai(thinkingAi, levelManager, combatInorganicManager);
		
		aiCrowd.getActorMask(thinkingAi).setAi(playerAi);
		aiCrowd.getActors().remove(thinkingAi);
		aiCrowd.getActors().add(playerAi);
		
		this.playerTeam.add(playerAi);
		
		// create roster images
		uiUpdaterSuite.getCombatUiManager().getAllyRoster().generatePortraits();
		
		// if the thinking ai is in the turn stack it needs to be replaced by this ai
		turnProcess.replaceAi(thinkingAi,playerAi);
		aiCrowd.replaceAi(thinkingAi,playerAi);
	}
	
	public int getUnitCount(String string){
		return getUnitCount(string, false);
	}
	
	public int getUnitCount(String string, boolean onlyAlive) {
		int count = 0;
		Set<String> targetFactions = new HashSet<String>(2);
		
		switch(string){
			case AiGenerator.BANDITS:
				targetFactions.add(AiGenerator.BANDITS);
			break;
			case AiGenerator.WHITE_VISTA:
				targetFactions.add(AiGenerator.WHITE_VISTA);
			break;
			case AiGenerator.PLAYER:
				targetFactions.add(AiGenerator.PLAYER);
			break;
			case AiGenerator.LONER:
				targetFactions.add(AiGenerator.LONER);
			break;
			case "PlayerLoner":
				targetFactions.add(AiGenerator.PLAYER);
				targetFactions.add(AiGenerator.LONER);
			break;
		}
		
		for(Ai ai : aiCrowd.getActors()){
			if((!onlyAlive || !ai.isDead()) && targetFactions.contains(ai.getFaction())){
				count++;
			}
		}
		return count;
	}

}
