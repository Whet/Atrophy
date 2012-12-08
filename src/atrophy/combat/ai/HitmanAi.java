/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.thinkingAi.loner;

import java.util.Random;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.thinkingAi.ThinkingAi;
import atrophy.combat.display.AiCrowd;

/**
 * The Class HitmanAi.
 */
public class HitmanAi extends ShopkeeperAi {

	/**
	 * The mission given.
	 */
	private boolean missionGiven;
	
	/**
	 * The hitman target ai.
	 */
	private Ai hitmanTargetAi;
	
	/**
	 * Instantiates a new hitman ai.
	 *
	 * @param randomName the random name
	 * @param d the d
	 * @param e the e
	 */
	public HitmanAi(String randomName, double d, double e) {
		super(randomName, d, e);
		shopType = 1;
		
		hitmanTargetAi = AiCrowd.getInstance().randomAi(this);
	}
	
	/**
	 * Checks if is mission given.
	 *
	 * @return true, if is mission given
	 */
	public boolean isMissionGiven(){
		return missionGiven;
	}
	
	/**
	 * Give mission.
	 */
	public void giveMission(){
		missionGiven = true;
		this.setBroadcastingLocation(true);
	}
	
	/**
	 * Gets the hitman target ai.
	 *
	 * @return the hitman target ai
	 */
	public Ai getHitmanTargetAi(){
		return this.hitmanTargetAi;
	}
	
	/**
	 * Claim reward.
	 *
	 * @param receiver the receiver
	 */
	public void claimReward(Ai receiver){
		if(missionGiven)
		super.giveItem(receiver);
		this.setBroadcastingLocation(false);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.loner.ShopkeeperAi#willJoinPlayer(atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean willJoinPlayer(Ai player) {
		if(missionGiven && this.hitmanTargetAi.isDead() && this.getAggression() < 0){
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.loner.LonerAi#engageWithHostiles()
	 */
	protected void engageWithHostiles(){

		int enemyCount = 0;
		
		Ai target = null;
		
		for(int i = 0; i < AiCrowd.getInstance().getActorCount(); i++){
			
			// determine if target is hostile and if it is visible by the team
			if(canBeEngaged(AiCrowd.getInstance().getActor(i))){
				
				// Hitman will engage their target
				if(AiCrowd.getInstance().getActor(i) == this.hitmanTargetAi){
					target = AiCrowd.getInstance().getActor(i);
					break;
				}
				
			   // find closest target
			   if(this.getTargetAi() == null || Maths.getDistance(this.getLocation(), AiCrowd.getInstance().getActor(i).getLocation()) <
						  						Maths.getDistance(this.getLocation(), this.getTargetAi().getLocation())){

				   target = AiCrowd.getInstance().getActor(i);
				}
			   
			}
		}
		
		// report enemies to commander
		// only speak if the area is not already reported
		this.getTeamObject().reportUnits(enemyCount,this.getLevelBlock());
		
		// Combat score of enemies in room and closest target has been established
		if(target != null){
			if(!target.getFaction().equals("Loner")){
				enemyCount = CombatMembersManager.getInstance().getFactionStrength(target.getFaction(), this.getLevelBlock());
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
	 * @see atrophy.combat.ai.thinkingAi.ThinkingAi#emotionEngageReaction(int, atrophy.combat.ai.Ai)
	 */
	protected void emotionEngageReaction(int enemyCount, Ai target) {
		
		// friendly count is mainly made up of what the individual's strength is
		// if combat is initiated the team may easily win but each ai wants to live
		int friendlyCount = (int)((CombatMembersManager.getInstance().getFactionStrength(this.getFaction(), this.getLevelBlock()) - this.getCombatScore()) / (float)1.5) + this.getCombatScore();
		
		reactToCloseEnemy(target);
		
		if(target == this.hitmanTargetAi){
			this.setAiMode("Engaging");
			this.aim(target);
			this.modifyAggression(ThinkingAi.AIMING_AGGRESSION);
		}
		else if(this.getAggression() > 0){
			aggressiveEngageReaction(friendlyCount,enemyCount,target);
		}
		else if(this.getAggression() < 0){
			
			passiveEngageReaction(friendlyCount,enemyCount,target);
		}
		else{
		
			if(new Random().nextBoolean()){
				aggressiveEngageReaction(friendlyCount,enemyCount,target);
			}
			else{
				passiveEngageReaction(friendlyCount,enemyCount,target);
			}
		}
		
		respondToEnvironmentData();
	}

}
