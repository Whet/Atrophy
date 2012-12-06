package atrophy.combat.ai.thinkingAi.loner;

import java.util.ArrayList;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.thinkingAi.ThinkingAi;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.mechanics.ScoringMechanics;
import atrophy.exceptions.PathNotFoundException;

public class HighwaymanAi extends LonerAi{

	private static final int ROB_THRESHOLD = 40;

	public HighwaymanAi(String randomName, double d, double e) {
		super(randomName,d,e);
	}

	@Override
	protected void emotionEngageReaction(int enemyCount, Ai target) {
		
		// friendly count is mainly made up of what the individual's strength is
		// if combat is initiated the team may easily win but each ai wants to live
		int friendlyCount = (int)((CombatMembersManager.getInstance().getFactionStrength(this.getFaction(), this.getLevelBlock()) - this.getCombatScore()) / (float)1.5) + this.getCombatScore();
		
		if(this.getAggression() < ThinkingAi.MINDLESS_TERROR){
			reactToCloseEnemy(target);
			highwaymanEngageReaction(friendlyCount, enemyCount, target);			
		}
		else{
			super.emotionEngageReaction(enemyCount, target);
		}
	}
	
	private void highwaymanEngageReaction(int friendlyCount, int enemyCount, Ai target){
		if(this.isBeingTargeted()){
			if(enemyCount - friendlyCount < this.getCombatScoreThreshold()){
				this.setAiMode("Engaging");
				this.aim(target);
			}
			else{
				this.getANewRoom();
				try {
					this.flee();
				} 
				catch (PathNotFoundException e) {
					this.setAiMode("Engaging");
					this.aim(target);
				}
			}
			
			this.respondToEnvironmentData();
		}
		else{
			// if a a minor difference in combat ability and this is a highwayman then rob unit
			if(!this.getAiMode().equals("Loot") && enemyCount - friendlyCount < ROB_THRESHOLD && this.getIncapTurns() == 0){
				this.rob(target, enemyCount, friendlyCount);
			}
			else{
				this.respondToEnvironmentData();
			}
		}
	}

	private void rob(Ai target, int enemyCount, int friendlyCount) {
		ArrayList<Ai> aiInRoom = new ArrayList<Ai>(3);
		for(Ai ai : AiCrowd.getInstance().getActors()){
			if(CombatVisualManager.isAiInSight(this, ai) && this.isTargetHostile(ai) && ai.getStunnedTurns() == 0){
				aiInRoom.add(ai);
			}
		}
		
		Ai unitToLoot = null;
		
		for(Ai ai : aiInRoom){
			if(!this.getTeamObject().isAiLooted(ai)){
				unitToLoot = ai;
				break;
			}
		}
		
		if(unitToLoot != null && !ScoringMechanics.weakIntimidateCheck(unitToLoot, this)){	
			if(unitToLoot.getIncapTurns() > 0){
				
				this.setAiMode("Loot");
				this.setAction("Loot");
				this.loot(unitToLoot);
				this.setTrueLookAngle(unitToLoot.getLocation());
				
				this.respondToEnvironmentData();
			}
			else if(!(unitToLoot instanceof ThinkingAi)){
				// open dialogue
		//		MessageBox.getInstance().setConversation(unitToLoot, this, MessageBox.HIGHWAYMAN_TOPIC, 1);
				MessageBox.getInstance().setVisible(true);
			}
			else{
				// check if ai will give in, friendly and enemy count wrong way round since this is from the eyes of the other ai
				if(ScoringMechanics.weakIntimidateCheck(this, unitToLoot)){
					this.setAiMode("Engaging");
					this.aim(unitToLoot);
				}
				else{
					stunAndSteal(unitToLoot);
				}
				
				this.respondToEnvironmentData();
			}
		}
		else{
			// loot corpses
			unitToLoot = null;
			
			this.getANewRoom();
			
			this.respondToEnvironmentData();
		}
	}

	@Override
	public void respondToMessage(String message, Ai speaker) {
		// player fighting
		if(message.equals(MessageBox.PLAYER_RESPOND[0])){
			this.setAiMode("Engaging");
			this.aim(speaker);
			this.modifyAggression(ThinkingAi.HIGHWAYMAN_FIGHT);
		}
		// player conceded
		else if(message.equals(MessageBox.PLAYER_RESPOND[1])){
			stunAndSteal(speaker);
		}
		
		this.respondToEnvironmentData();
	}
	
	private void stunAndSteal(Ai lootTarget){
		this.setAiMode("Loot");
		this.setAction("Loot");
		this.loot(lootTarget);
		
		int turnsToReachTarget =  (int)(Maths.getDistance(this.getLocation(), lootTarget.getLocation()) / this.getMoveDistance());
		
		lootTarget.setIncapTurns(turnsToReachTarget + 4);
	}
	
}
