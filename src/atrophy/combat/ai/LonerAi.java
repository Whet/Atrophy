/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.util.ArrayList;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.CombatInorganicManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.ScoringMechanics;
import atrophy.combat.mechanics.TurnProcess;

/**
 * The Class LonerAi.
 */
public class LonerAi extends ThinkingAi{

	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	/**
	 * Instantiates a new loner ai.
	 *
	 * @param randomName the random name
	 * @param levelManager 
	 * @param combatInorganicManager 
	 * @param d the d
	 * @param e the e
	 */
	public LonerAi(PanningManager panningManager, AiCrowd aiCrowd,CombatVisualManager combatVisualManager, TurnProcess turnProcess, FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler, CombatMembersManager combatMembersManager, String randomName, double x, double y, LevelManager levelManager, CombatInorganicManager combatInorganicManager, CombatUiManager combatUiManager, LootBox lootBox) {
		super(panningManager, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, aiCrowd, combatMembersManager, randomName,x,y, levelManager, combatInorganicManager, combatUiManager, lootBox);
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingAi#isTargetHostile(atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean isTargetHostile(Ai target) {
		return !target.isDead() && target != this;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingAi#isBeingTargeted()
	 */
	@Override
	protected boolean isBeingTargeted() {
		for(Ai ai : aiCrowd.getActors()){
			if((ai.getTargetAi() != null && ai.getTargetAi() == this && ( ai.getAction().equals(AiCombatActions.SHOOTING) || ai.getAction().equals(AiCombatActions.AIMING)))){
				return true;
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingAi#canBeEngaged(atrophy.combat.ai.Ai)
	 */
	@Override
	protected boolean canBeEngaged(Ai ai) {
		if(this.isTargetHostile(ai) &&
		   ai.getLevelBlock() == this.getLevelBlock() &&
		   CombatVisualManager.isAiInSight(this, ai)){
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingAi#engageWithHostiles()
	 */
	protected void engageWithHostiles(){

		int enemyCount = 0;
		
		Ai target = null;
		
		// Shuffle the ai so that one hated individual will not get targeted over others with groups of ai
		ArrayList<Ai> shuffledAi = aiCrowd.getShuffledAi();
		
		for(int i = 0; i < shuffledAi.size(); i++){
			
			// determine if target is hostile and if it is visible by the team
			if(canBeEngaged(shuffledAi.get(i))){
				
				// Prioritise hatedAi or ai aiming at ai
				if(this.getTeamObject().isAiHated(shuffledAi.get(i)) || shuffledAi.get(i).getTargetAi() == this){
					target = shuffledAi.get(i);
					break;
				}
				
			    // find closest target
			    if(this.getTargetAi() == null || Maths.getDistance(this.getLocation(), shuffledAi.get(i).getLocation()) <
						  						 Maths.getDistance(this.getLocation(), this.getTargetAi().getLocation())){

				   target = shuffledAi.get(i);
				}
			   
			}
		}
		
		// report enemies to commander
		// only speak if the area is not already reported
		this.getTeamObject().reportUnits(enemyCount,this.getLevelBlock());
		
		// Combat score of enemies in room and closest target has been established
		if(target != null){
			if(!target.getFaction().equals("Loner")){
				enemyCount = combatMembersManager.getFactionStrength(target.getFaction(), this.getLevelBlock());
			}
			else{
				enemyCount = target.getCombatScore();
			}
			this.emotionEngageReaction(enemyCount, target);
		}
		else{
			
			this.lootAiInRoom();
			
			respondToEnvironmentData();
		}
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingAi#willJoinPlayer(atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean willJoinPlayer(Ai player) {
		return ScoringMechanics.weakIntimidateCheck(player, this, combatMembersManager);
	}
	
}
