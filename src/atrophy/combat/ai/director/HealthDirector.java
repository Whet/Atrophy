package atrophy.combat.ai.director;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.Faction;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.mechanics.ScoringMechanics;

public class HealthDirector {

	private CombatVisualManager combatVisualManager;
	private AiCrowd aiCrowd;
	
	private int stealthKills;
	private Map<Ai, DirectorClassification> clf;
	private boolean playerAttacked;
	private boolean playerAttacker;
	
	private ArrayList<String> lonerKills;
	private ArrayList<String> banditKills;
	private ArrayList<String> wvKills;
	
	private int totalLonerDeaths, totalWVDeaths, totalBanditDeaths;
	
	public HealthDirector(AiCrowd aiCrowd) {
		this.clf = new HashMap<>();
		this.stealthKills = 0;
		this.aiCrowd = aiCrowd;
		this.playerAttacked = false;
		this.playerAttacker = false;
		
		this.totalLonerDeaths = 0;
		this.totalWVDeaths = 0;
		this.totalBanditDeaths = 0;
		
		this.lonerKills = new ArrayList<>();
		this.banditKills = new ArrayList<>();
		this.wvKills = new ArrayList<>();
	}
	
	public boolean addKill(Ai killer, Ai killedAi, boolean dead) {
		
		if(!dead)
			return dead;
		
		switch(killedAi.getFaction()) {
			case LONER:
				totalLonerDeaths++;
				if(killer.getFaction().equals(Faction.PLAYER))
					lonerKills.add(killedAi.getName());
			break;
			case WHITE_VISTA:
				totalWVDeaths++;
				if(killer.getFaction().equals(Faction.PLAYER))
					wvKills.add(killedAi.getName());
			break;
			case BANDITS:
				totalBanditDeaths++;
				if(killer.getFaction().equals(Faction.PLAYER))
					banditKills.add(killedAi.getName());
			break;
		}
		
		return dead;
	}
	
	public int getTotalLonerDeaths() {
		return totalLonerDeaths;
	}

	public int getTotalWVDeaths() {
		return totalWVDeaths;
	}

	public int getTotalBanditDeaths() {
		return totalBanditDeaths;
	}

	public ArrayList<String> getLonerKills() {
		return lonerKills;
	}

	public ArrayList<String> getBanditKills() {
		return banditKills;
	}

	public ArrayList<String> getWvKills() {
		return wvKills;
	}

	public boolean judge(boolean dead, Ai killedAi, Ai killer, int turn) {
		
		// If someone isn't classified, add them
		if(this.clf.get(killer) == null)
			this.addAi(killer, new DirectorClassification(DirectorArchetype.UNDECIDED));
		
		if(this.clf.get(killedAi) == null)
			this.addAi(killedAi, new DirectorClassification(DirectorArchetype.UNDECIDED));
		
		// Handle attackers that shouldn't be able to attack
		if(killer.getStunnedTurns() > 0 || killer.getIncapTurns() > 0) {
			return addKill(killer, killedAi, false);
		}
		
		// Don't handle ai on ai conflict beyond pure dice rolling
		if(!this.clf.get(killedAi).getType().equals(DirectorArchetype.PLAYER) && !this.clf.get(killer).getType().equals(DirectorArchetype.PLAYER)) {
			return addKill(killer, killedAi, dead);
		}
		
		if(this.clf.get(killedAi).getType().equals(DirectorArchetype.PLAYER)) {
			playerAttacked = true;
		}
		if(this.clf.get(killer).getType().equals(DirectorArchetype.PLAYER)) {
			playerAttacker = true;
		}
		
		// Handle cod attacking
		if(clf.get(killer).getType().equals(DirectorArchetype.COD)) {
			
			appealArchetypeChange(dead, killer, clf.get(killer).getOriginalType());
			return addKill(killer, killedAi, false);
		}
		
		
		// Register attack
		clf.get(killedAi).addAttackRecord(turn);
		
		// Handle attacking swam/cod
		if((clf.get(killedAi).getType().equals(DirectorArchetype.COD) ||
		   (clf.get(killedAi).getType().equals(DirectorArchetype.SWARM) &&
		   (getFactionInRoom(killedAi) > 3) || getFactionInRoom(killedAi) == 1)) &&
			clf.get(killer).getType().equals(DirectorArchetype.PLAYER)) {
			
//			if(Math.random() > 0.8) {
//				changeClassification(killedAi, DirectorArchetype.COD);
//				return false;
//			}
			
			return addKill(killer, killedAi, true);
		}
		
		// Handle swarm attacking
		if(clf.get(killedAi).getType().equals(DirectorArchetype.PLAYER) && clf.get(killer).getType().equals(DirectorArchetype.SWARM)) {
			
			// Complete swarming will kill careless player
			if(clf.get(killedAi).getAttackedCount(turn) == getFactionInRoom(killer) && getFactionInRoom(killer) > 3)
				return addKill(killer, killedAi, true);
			
			// Some swarming, give the swarm a chance
			if(getFactionInRoom(killer) > 2)
				return addKill(killer, killedAi, dead);
			
			// A lone swarmer cannot kill
			return addKill(killer, killedAi, false);
		}
		
		// Handle elite attacking
		if(clf.get(killer).getType().equals(DirectorArchetype.PLAYER) && clf.get(killedAi).getType().equals(DirectorArchetype.ELITE)) {
			// Multiple attacks remove elite status
			if(clf.get(killedAi).getAttackedCount(turn) > 1) {
				
				changeClassification(killedAi, DirectorArchetype.UNDECIDED);
				
				return addKill(killer, killedAi, dead);
			}
			
			// Make the attacker re-roll
			if(dead)
				return addKill(killer, killedAi, ScoringMechanics.killedTarget(killer, killedAi));
			
			return addKill(killer, killedAi, dead);
		}
		
		// Handle stealth kills
		if(dead || (!clf.get(killedAi).getType().equals(DirectorArchetype.SPEAKER) && stealthKillChecks(killedAi, killer))) {
			return addKill(killer, killedAi, true);
		}
		
		return addKill(killer, killedAi, false);
	}

	private void appealArchetypeChange(boolean dead, Ai killer, DirectorArchetype desiredArchetype) {
		
		if(clf.get(killer).getType().equals(DirectorArchetype.COD) && dead)
			changeClassification(killer, desiredArchetype);
		
	}

	private boolean stealthKillChecks(Ai killedAi, Ai killer) {
		
		if(stealthKills < 3 && killer.getWeapon().isMelee() && !combatVisualManager.isAiInSight(killedAi, killer, killedAi.getFaction())) {
			
			stealthKills++;
			
			return true;
		}
//		else if(killer.getWeapon().isMelee() && !combatVisualManager.isAiInSight(killedAi, killer, killedAi.getFaction()) && getFactionInRoom(killedAi) == 1) {
//			
//			changeClassification(killedAi, DirectorArchetype.COD);
//			
//			return false;
//		}
		
		return false;
	}

	private int getFactionInRoom(Ai queriedAi) {
		
		int count = 0;
		
		for(Ai ai: aiCrowd.getActors()) {
			if(ai.getFaction().equals(queriedAi.getFaction()) && ai.getLevelBlock() == queriedAi.getLevelBlock() && !ai.isDead())
				count++;
		}
		
		return count;
	}

	public void addAi(Ai ai, DirectorClassification aiClass) {
		this.clf.put(ai, aiClass);
	}

	private void changeClassification(Ai ai, DirectorArchetype desiredArchetype) {
		this.clf.get(ai).setType(desiredArchetype);
		System.out.println(ai.getName() + "  is type " + desiredArchetype.toString());
	}
	
	public void lazyLoad(CombatVisualManager combatVisualManager) {
		this.combatVisualManager = combatVisualManager;
	}

	public boolean isPlayerAttacked() {
		boolean r = this.playerAttacked;
		this.playerAttacked = false;
		return r;
	}

	public boolean isPlayerAttacker() {
		boolean r = this.playerAttacker;
		this.playerAttacker = false;
		return r;
	}

	public boolean isImmuneToDeath(Ai target) {
		return this.clf.get(target).getType().equals(DirectorArchetype.SPEAKER);
	}

	public void changeClassification(Ai ai, String classification) {
		this.clf.get(ai).setType(classification);
	}
	
	
}
