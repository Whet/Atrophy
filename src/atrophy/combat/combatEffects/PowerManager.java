package atrophy.combat.combatEffects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.items.DaemonWeapon;
import atrophy.gameMenu.saveFile.Squad;

public class PowerManager {

	private AiGenerator aiGenerator;
	private Squad squad;
	
	private List<PowerEffect> powers;
	
	public PowerManager(Squad squad, AiGenerator aiGenerator) {
		this.aiGenerator = aiGenerator;
		this.squad = squad;
		
		this.powers = new ArrayList<>();
	}
	
	public void usePower(Power power, Object target) {
		switch(power) {
			case HELP:
			break;
			case KILL:
				if(!((Ai) target).isDead())
					this.powers.add(new KillEffect(this, (Ai) target, aiGenerator, getRankedStability()));
			break;
			case PROTECT:
				if(!((Ai) target).isDead())
					this.powers.add(new ProtectEffect(this, (Ai) target, getRankedStability()));
			break;
			default:
			break;
		}
	}
	
	public void tickPowers() {
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
		
		if(squad.getStability() < 0)
			squad.setStability(0);
		
		if(squad.getStability() > Squad.MAX_STABILITY)
			squad.setStability(Squad.MAX_STABILITY);
	}
	
	private int getRankedStability() {
		if(squad.getStability() > 80)
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
			
			powerManager.modifyStability(-40);
			
			this.target.setDead(true);
			
			if(stability == 0) {
				// Summon daemon
				double[] location = this.target.getLocation();
				GenerateCommand daemonCommand = new AiGeneratorInterface.SoloGenerateCommand(location[0], location[1], AiGenerator.LONER, true, " ", DaemonWeapon.NAME, new String[]{});
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
		return this.powers;
	}
	
}
