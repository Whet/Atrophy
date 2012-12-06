/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.thinkingAi;

import java.awt.Color;
import java.util.Iterator;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.formations.HerringBone;
import atrophy.combat.ai.formations.PolygonAmbush;
import atrophy.combat.level.LevelManager;

// TODO: Auto-generated Javadoc
/**
 * The Class WhiteVistaTeamObject.
 */
public class WhiteVistaTeamObject extends ThinkingTeamObject{

	/**
	 * Instantiates a new white vista team object.
	 *
	 * @param team the team
	 * @param levelManager 
	 */
	public WhiteVistaTeamObject(CombatVisualManager combatVisualManager, String team, LevelManager levelManager){
		super(combatVisualManager, levelManager, team,Color.white);
		this.setFormation(new HerringBone());
	}
	
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.TeamObject#updateTeam()
	 */
	@Override
	/**
	 * Updates the team size to remove dead members. Changes formation to match circumstances.
	 */
	public void updateTeam(){
		
		Iterator<Ai> aiIt = this.getTeamMembers().iterator();
		
		boolean memberDied = false;
		
		while(aiIt.hasNext()){
			Ai ai = aiIt.next();
			if(ai.isDead()){
				
				memberDied = true;
				
				// stop in the room where unit was killed
				this.setTargetRoomIgnoreSetting(ai.getLevelBlock());

				aiIt.remove();
				
				if(((ThinkingAi) ai).getAiNode() != null)
					((ThinkingAi) ai).getAiNode().releaseNode((ThinkingAi) ai);
				
				smartTerrainUsers.remove(ai);
			}
		}
		
		if(memberDied){
			// make all other members aggressive
			for(Ai ai1 : this.getTeamMembers()){
				((ThinkingAi) ai1).modifyAggression(ThinkingAi.TEAM_MEMBER_KILLED);
			}
			
			// move formation to find attacker
			if(this.getTeamFormation() != null){
				this.getTeamFormation().randomiseElements();
			}
		}
			
		
		for(int i = 0; i < this.getTeamSize(); i++){
			if(this.getTeamMember(i).getLevelBlock() == this.getLevelBlock()){
				
				// only change it if ambush not currently not in use
				if(this.getTeamFormation() instanceof HerringBone){
					this.setFormation(new PolygonAmbush());	
				}
				return;
			}
			if(this.getTeamFormation() == null || this.getTeamFormation() instanceof PolygonAmbush){
				this.setFormation(new HerringBone());
			}
		}
	}
}
