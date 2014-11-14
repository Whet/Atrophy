package atrophy.combat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.BanditCommander;
import atrophy.combat.ai.DaemonAi;
import atrophy.combat.ai.DaemonCommander;
import atrophy.combat.ai.Faction;
import atrophy.combat.ai.LonerAi;
import atrophy.combat.ai.LonerCommander;
import atrophy.combat.ai.TeamsCommander;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.ai.WhiteVistaCommander;
import atrophy.combat.display.AiCrowd;
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
	private LevelManager levelManager;
	private TorchDrawer torchDrawer;
	private MapDrawer mapDrawer;
	private Map<LevelBlock, StrengthStub> factionStrengthScores;
	
	public CombatMembersManager(AiCrowd aiCrowd, TurnProcess turnProcess, LevelManager levelManager){
		commanders = new ArrayList<TeamsCommander>(2);
		playerTeam = new ArrayList<Ai>(1);
		
		this.aiCrowd = aiCrowd;
		this.turnProcess = turnProcess;
		this.levelManager = levelManager;
		
	}
	
	private class StrengthStub {
		
		private int code;
		//Faction, [Strength, Turn]
		private Map<Faction, Integer[]> strengthInfo;
		
		public StrengthStub(int code) {
			
			this.code = code;
			
			strengthInfo = new HashMap<>();
			
			strengthInfo.put(Faction.BANDITS, new Integer[]{0,-1});
			strengthInfo.put(Faction.WHITE_VISTA, new Integer[]{0,-1});
			strengthInfo.put(Faction.LONER, new Integer[]{0,-1});
			strengthInfo.put(Faction.PLAYER, new Integer[]{0,-1});
		}

		public int getStrength(Faction faction) {
			
			if(this.strengthInfo.get(faction)[1] == turnProcess.getTurnCount())
				return this.strengthInfo.get(faction)[0];
			
			int strength = 0;
			
			for(int i = 0; i < aiCrowd.getActorCount(); i++){
				if(aiCrowd.getActor(i).getFaction().equals(faction) && aiCrowd.getActor(i).getLevelBlock().getCode() == code)
					strength += aiCrowd.getActor(i).getCombatScore();
			}
			
			this.strengthInfo.put(faction, new Integer[]{strength, turnProcess.getTurnCount()});
			
			return strength;
		}
		
	}
	
	public void createCommanders(double banditRep, double wvRep) {
		WhiteVistaCommander whiteVistaCommander = new WhiteVistaCommander(aiCrowd.getSquad(), turnProcess, levelManager);
		commanders.add(whiteVistaCommander);
		BanditCommander banditCommander = new BanditCommander(aiCrowd.getSquad(), turnProcess, levelManager);
		commanders.add(banditCommander);
		
		if(banditRep >= 1)
			banditCommander.addAlliance(Faction.PLAYER);
		if(wvRep >= 1)
			whiteVistaCommander.addAlliance(Faction.PLAYER);
	}
	
	public LonerCommander createLonerCommander() {
		LonerCommander lonerCommander = new LonerCommander(aiCrowd.getSquad(), turnProcess, levelManager);
		commanders.add(lonerCommander);
		return lonerCommander;
	}
	
	private DaemonCommander createDaemonCommander() {
		DaemonCommander daemonCommander = new DaemonCommander(aiCrowd.getSquad(), turnProcess, levelManager);
		commanders.add(daemonCommander);
		return daemonCommander;
	}
	
	public void addAi(Ai ai) {
		switch(ai.getFaction()) {
			case BANDITS:
				this.getCommander(Faction.BANDITS).addAi((ThinkingAi) ai);
			break;
			case DAEMON:
				DaemonCommander daemonCommander = this.createDaemonCommander();
				daemonCommander.addAi((ThinkingAi) ai);
			break;
			case LONER:
				LonerCommander lonerCommander = this.createLonerCommander();
				lonerCommander.addAi((ThinkingAi) ai);
			break;
			case PLAYER:
				this.playerTeam.add(ai);
			break;
			case WHITE_VISTA:
				this.getCommander(Faction.WHITE_VISTA).addAi((ThinkingAi) ai);
			break;
		}
	}
	
	public void lazyLoad(UiUpdaterSuite uiUpdaterSuite, MouseAbilityHandler mouseAbilityHandler){
		this.uiUpdaterSuite = uiUpdaterSuite;
		this.mouseAbilityHandler = mouseAbilityHandler;
		this.torchDrawer = uiUpdaterSuite.getTorchDrawer();
		this.mapDrawer = uiUpdaterSuite.getMapDrawer();
		
		this.factionStrengthScores = new HashMap<>();
		for(int i = 0; i < this.levelManager.getCurrentLevel().getBlockCount(); i++) {
			this.factionStrengthScores.put(this.levelManager.getCurrentLevel().getBlock(i), new StrengthStub(this.levelManager.getBlock(i).getCode()));
		}
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

	public TeamsCommander getCommander(Faction faction) {
		
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
		if(i < this.getAllyCount() && this.getAlly(i) != null && !this.getAlly(i).isDead()){
			
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
			if(ai.getFaction().equals(Faction.PLAYER)){
				this.setCurrentAi(ai);
				return;
			}
		}
	}
	
	public int getFactionStrength(Faction faction, LevelBlock levelBlock) {
		return this.factionStrengthScores.get(levelBlock).getStrength(faction);
	}
	
	public boolean factionsAllied(Faction faction, Faction faction2) {
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
		Ai playerAi = new Ai(thinkingAi, levelManager);
		
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
	
	public int getUnitCount(Faction faction){
		return getUnitCount(faction, false);
	}
	
	public int getUnitCount(Faction faction, boolean onlyAlive) {
		int count = 0;
		Set<Faction> targetFactions = new HashSet<Faction>(2);
		
		switch(faction){
			case BANDITS:
				targetFactions.add(Faction.BANDITS);
			break;
			case WHITE_VISTA:
				targetFactions.add(Faction.WHITE_VISTA);
			break;
			case PLAYER:
				targetFactions.add(Faction.PLAYER);
			break;
			case LONER:
				targetFactions.add(Faction.LONER);
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
