/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai.thinkingAi.loner;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.thinkingAi.ThinkingTeamObject;
import atrophy.combat.level.LevelBlock;
import atrophy.combat.level.LevelManager;

/**
 * The Class LonerTeamObject.
 */
public class LonerTeamObject extends ThinkingTeamObject{

	/**
	 * The alliances.
	 */
	private Set<String> alliances;
	
	/**
	 * The danger rooms.
	 */
	private Set<LevelBlock> dangerRooms;
	
	/**
	 * The looted ai.
	 */
	private Set<Ai> lootedAi;
	
	/**
	 * Instantiates a new loner team object.
	 *
	 * @param team the team
	 * @param levelManager 
	 */
	public LonerTeamObject(CombatVisualManager combatVisualManager, String team, LevelManager levelManager){
		super(combatVisualManager, levelManager, team, Color.gray);
		alliances = new HashSet<String>();
		dangerRooms = new HashSet<LevelBlock>();
		lootedAi = new HashSet<Ai>();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingTeamObject#reportUnits(int, atrophy.combat.level.LevelBlock)
	 */
	@Override
	public boolean reportUnits(int enemyCount, LevelBlock levelBlock) {
		if(enemyCount > this.getCombatScore()){
			dangerRooms.add(levelBlock);
			
			return true;
		}

		this.dangerRooms.remove(levelBlock);
		
		return false;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingTeamObject#getRoomsToAvoid()
	 */
	@Override
	public ArrayList<LevelBlock> getRoomsToAvoid() {
		return new ArrayList<LevelBlock>(dangerRooms);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingTeamObject#isAlliedWith(java.lang.String)
	 */
	@Override
	public boolean isAlliedWith(String faction) {
		return this.alliances.contains(faction);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingTeamObject#addAlliance(java.lang.String)
	 */
	@Override
	public void addAlliance(String faction) {
		this.alliances.add(faction);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingTeamObject#addLootedAi(atrophy.combat.ai.Ai)
	 */
	@Override
	public void addLootedAi(Ai lootAi) {
		this.lootedAi.add(lootAi);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.thinkingAi.ThinkingTeamObject#isAiLooted(atrophy.combat.ai.Ai)
	 */
	@Override
	public boolean isAiLooted(Ai ai) {
		return this.lootedAi.contains(ai);
	}

}
