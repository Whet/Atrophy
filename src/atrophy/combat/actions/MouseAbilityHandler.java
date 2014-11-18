package atrophy.combat.actions;

import java.awt.Point;

import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiDebugger;
import atrophy.combat.ai.Faction;
import atrophy.combat.ai.TalkNode;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.combatEffects.RapidFireEffect;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImage;
import atrophy.combat.display.AiManagementSuite;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.UiUpdaterSuite;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.Abilities;

public class MouseAbilityHandler {
		
	private String abilityApplied;
	private boolean settingAbility;

	private CombatMembersManager combatMembersManager;
	private PanningManager panningManager;
	private CombatUiManager combatUiManager;
	private MessageBox messageBox;
	private LootBox lootBox;
	private AiCrowd aiCrowd;
	private LevelManager levelManager;
	
	public MouseAbilityHandler(AiManagementSuite aiManagementSuite, UiUpdaterSuite uiUpdaterSuite, LevelManager levelManager){
		abilityApplied = "";
		settingAbility = false;
		
		this.combatMembersManager = aiManagementSuite.getCombatMembersManager();
		this.aiCrowd = aiManagementSuite.getAiCrowd();
		
		this.panningManager = uiUpdaterSuite.getPanningManager();
		this.combatUiManager = uiUpdaterSuite.getCombatUiManager();
		this.messageBox = uiUpdaterSuite.getMessageBox();
		this.lootBox = uiUpdaterSuite.getLootBox();
		this.levelManager = levelManager;
	}
	
	public void setAbility(String abilityApplied){
		this.abilityApplied = abilityApplied;
		settingAbility = true;
	}
	
	public void cancelAbilitySetting(){
		settingAbility = false;
	}
	
	public boolean isSettingAbility(){
		return this.settingAbility;
	}
	
	public void applyAbility(Point mousePoint){

		final int AI_CLICK_RADIUS = 60;
		
		// abilities that don't need to be in a room
		switch(abilityApplied){
			case Abilities.SPEECH:
				Ai speechAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS);
				if(speechAi != null && speechAi.getLevelBlock() == combatMembersManager.getCurrentAi().getLevelBlock() &&
				   !speechAi.getFaction().equals(Faction.PLAYER) && ( !(speechAi instanceof ThinkingAi) || !((ThinkingAi)speechAi).isBlockPlayerConvo())){
					
					messageBox.setConversation(combatMembersManager.getCurrentAi(), speechAi);
					lootBox.closeLootUi(lootBox.isVisible());
					messageBox.setVisible(true);
					this.cancelAbilitySetting();
					return;
				}
				TalkNode talkNode = getClosestTalkNodeToMouse(mousePoint, AI_CLICK_RADIUS);
				if(talkNode != null && levelManager.getBlock(new double[]{talkNode.getX(), talkNode.getY()}) == combatMembersManager.getCurrentAi().getLevelBlock()) {
					messageBox.setConversation(combatMembersManager.getCurrentAi(), talkNode);
					lootBox.closeLootUi(lootBox.isVisible());
					messageBox.setVisible(true);
					this.cancelAbilitySetting();
					return;
				}
			break;
			case Abilities.STUN_MELEE:
				Ai targetAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS);
				if(targetAi != null && !targetAi.getFaction().equals(Faction.PLAYER)){
					combatMembersManager.getCurrentAi().setStunTarget(targetAi);
				}
			break;
			case Abilities.RAPID_FIRE:
				targetAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS);
				if(targetAi != null && !targetAi.getFaction().equals(Faction.PLAYER)){
					combatMembersManager.getCurrentAi().addEffect(new RapidFireEffect());
					combatMembersManager.getCurrentAi().setTargetAi(targetAi);
				}
			break;
			case Abilities.GRAPPLE:
				targetAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS);
				if(targetAi != null && !targetAi.getFaction().equals(Faction.PLAYER)){
					combatMembersManager.getCurrentAi().setGrappleTarget(targetAi);
				}
			break;
			case Abilities.SLIT_MELEE:
				targetAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS);
				if(targetAi != null && !targetAi.getFaction().equals(Faction.PLAYER)){
					combatMembersManager.getCurrentAi().setBackstabTarget(targetAi);
				}
			break;
			case "LookAtInventory":
				Ai invAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS);
				if(invAi != null){
					lootBox.loadInventoryDisplay(invAi, false);
				}
				
				// avoid the ui update
				this.cancelAbilitySetting();
				return;
			case "DebugAi":
				targetAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS, true);
				@SuppressWarnings("unused")
				AiDebugger d = new AiDebugger(mousePoint.x, mousePoint.y, targetAi);
			break;
			case Abilities.INVESTIGATE:
				speechAi = getClosestAiToMouse(mousePoint, AI_CLICK_RADIUS, true);
				if(speechAi != null && speechAi.getLevelBlock() == combatMembersManager.getCurrentAi().getLevelBlock() && speechAi.isDead()){
					messageBox.setInvestigating(combatMembersManager.getCurrentAi(), speechAi);
					lootBox.closeLootUi(lootBox.isVisible());
					messageBox.setVisible(true);
					this.cancelAbilitySetting();
					return;
				}
			break;
		}
		
		SoundBoard.getInstance().playEffect("cancel");
		combatUiManager.updateUi();
		this.cancelAbilitySetting();
	}
	
	private TalkNode getClosestTalkNodeToMouse(Point mousePosition, int minRadius) {
		
		TalkNode nearestNode = null;
		double nearestDist = 0;
		
		for(TalkNode node: aiCrowd.getNodes()) {
			if(node.hasLocation() && Maths.getDistance(mousePosition.x - panningManager.getOffset()[0],
													   mousePosition.y - panningManager.getOffset()[1],
													   node.getX(),
													   node.getY()) < minRadius && 
													   (nearestNode == null || Maths.getDistance(mousePosition.x - panningManager.getOffset()[0],
															   									 mousePosition.y - panningManager.getOffset()[1],
																							     node.getX(),
																							     node.getY()) < nearestDist)) {
				
				nearestDist = Maths.getDistance(mousePosition.x - panningManager.getOffset()[0], mousePosition.y - panningManager.getOffset()[1], node.getX(), node.getY()) ;
				nearestNode = node;
			}
		}
		
		return nearestNode;
	}

	public Ai getClosestAiToMouse(Point mousePosition, int minRadius){
		return this.getClosestAiToMouse(mousePosition, minRadius, false);
	}
	
	private Ai getClosestAiToMouse(Point mousePosition, int minRadius, boolean allowDead){
		
		AiImage closestAiImage = null;
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			if((allowDead || !aiCrowd.getMask(i).getAi().isDead()) &&
				aiCrowd.getMask(i).isVisible() &&
				// within min radius
				Maths.getDistance(mousePosition.x - panningManager.getOffset()[0],
					              mousePosition.y - panningManager.getOffset()[1],
					              aiCrowd.getMask(i).getLocation()[0],
					              aiCrowd.getMask(i).getLocation()[1]) <= minRadius &&
					              
				(closestAiImage == null || 
				// new ai is closer than current closest ai
			    Maths.getDistance(mousePosition.x - panningManager.getOffset()[0],
			    		          mousePosition.y - panningManager.getOffset()[1],
			    		          aiCrowd.getMask(i).getLocation()[0],
			    		          aiCrowd.getMask(i).getLocation()[1]) <
			    		          
			    Maths.getDistance(closestAiImage.getLocation()[0], closestAiImage.getLocation()[1], 
			    		          mousePosition.x - panningManager.getOffset()[0],
			    		          mousePosition.y - panningManager.getOffset()[1]))){
				
				closestAiImage = aiCrowd.getMask(i);
			}
		}
		
		if(closestAiImage != null){
			return closestAiImage.getAi();
		}
		
		return null;
	}
	
}	
