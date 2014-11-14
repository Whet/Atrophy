package atrophy.combat.combatEffects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.ai.Faction;
import atrophy.combat.ai.director.HealthDirector;
import atrophy.combat.items.DaemonWeapon;
import atrophy.gameMenu.saveFile.Squad;

public class PowerManager {

	private static final int POWER_STABILITY_DEDUCTION = 20;
	
	private HealthDirector director;
	private AiGenerator aiGenerator;
	private Squad squad;
	
	private List<PowerEffect> powerBuffer;
	private List<PowerEffect> powers;
	
	public PowerManager(Squad squad, HealthDirector healthDirector, AiGenerator aiGenerator) {
		this.aiGenerator = aiGenerator;
		this.squad = squad;
		this.director = healthDirector;
		
		this.powers = new ArrayList<>();
		this.powerBuffer = new ArrayList<>();
	}
	
	public void usePower(Power power, Object target) {
		
		if(target == null || powerExists(target, power))
			return;
		
		// Must have stability greater than 0
		if(squad.getStability() - (powerBuffer.size() * POWER_STABILITY_DEDUCTION) <= 0)
			return;
		
		switch(power) {
			case HELP:
			break;
			case KILL:
				if(!((Ai) target).isDead() && !director.isImmuneToDeath((Ai) target))
					this.powerBuffer.add(new KillEffect(this, (Ai) target, aiGenerator, getRankedStability()));
			break;
			case PROTECT:
				if(!((Ai) target).isDead())
					this.powerBuffer.add(new ProtectEffect(this, (Ai) target, getRankedStability()));
			break;
			default:
			break;
		}
	}
	
	private boolean powerExists(Object target, Power power) {
		
		for(PowerEffect powerEffect:this.powerBuffer) {
			if(powerEffect.getTarget().equals(target) && powerEffect.getType().equals(power))
				return true;
		}
		
		return false;
	}

	public void clearBuffer() {
		this.powerBuffer.clear();
	}
	
	public void tickPowers() {
		
		// Add powers to list for ticking and clear buffer
		for(PowerEffect power : powerBuffer) {
			this.modifyStability(-POWER_STABILITY_DEDUCTION);
			this.powers.add(power);
		}
		
		powerBuffer.clear();
		
		Iterator<PowerEffect> it = powers.iterator();
		while (it.hasNext()) {
			PowerManager.PowerEffect powerEffect = (PowerManager.PowerEffect) it.next();
			powerEffect.tick();
			
			if(powerEffect.life <= 0)
				it.remove();
		}
	}
	
	private void modifyStability(int modification) {
		squad.setStability(squad.getStability() + modification);
	}
	
	public int getRankedStability() {
		if(squad.getStability() >= Squad.MAX_STABILITY)
			return 2;
		else if(squad.getStability() > 20)
			return 1;
		
		return 0;
	}

	public static abstract class PowerEffect {
		
		private int life;
		protected Power type;
		
		// 0 = no stability, 1 = med, 2 = high stability
		protected int stability;
		protected PowerManager powerManager;
		
		public PowerEffect(PowerManager powerManager, Power type, int life) {
			this.powerManager = powerManager;
			this.type = type;
			this.life = life;
			this.stability = powerManager.getRankedStability();
		}
		
		public final void tick() {
			this.life--;
			
			if(this.life <= 0)
				this.tickEffect();
		}

		protected abstract void tickEffect();

		public abstract Object getTarget();

		public Power getType() {
			return type;
		}

	}
	
	private static class KillEffect extends PowerEffect {

		private static final int[] STABILITY_LIFE = {0, 5, 5};
		
		private AiGenerator aiGenerator;
		private Ai target;
		
		public KillEffect(PowerManager powerManager, Ai target, AiGenerator aiGenerator, int rankedStability) {
			super(powerManager, Power.KILL, STABILITY_LIFE[rankedStability]);
			this.target = target;
			this.aiGenerator = aiGenerator;
		}

		@Override
		protected void tickEffect() {
			
			this.target.setDead(true);
			
			if(stability == 0) {
				// Summon daemon
				double[] location = this.target.getLocation();
				GenerateCommand daemonCommand = new AiGeneratorInterface.SoloGenerateCommand(location[0], location[1], Faction.LONER, true, " ", DaemonWeapon.NAME, new String[]{});
				aiGenerator.spawnAi(daemonCommand );
			}
		}

		@Override
		public Object getTarget() {
			return target;
		}
	}
	
	private static class ProtectEffect extends PowerEffect {

		private Ai target;
		
		public ProtectEffect(PowerManager powerManager, Ai target, int stability) {
			super(powerManager, Power.PROTECT, 0);
			this.target = target;
			this.stability = stability;
			target.addEffect(new ProtectPowerEffect(stability));
		}

		@Override
		protected void tickEffect() {
		}

		@Override
		public Object getTarget() {
			return target;
		}
		
	}

	public List<PowerEffect> getPowers() {
		List<PowerEffect> powers = new ArrayList<>();
		
		powers.addAll(this.powers);
		powers.addAll(this.powerBuffer);
		
		return powers;
	}

	public int getStability() {
		return this.squad.getStability();
	}
	
}
