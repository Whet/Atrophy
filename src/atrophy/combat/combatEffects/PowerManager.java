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
				this.powers.add(new KillEffect((Ai) target, aiGenerator, squad.getStability()));
			break;
			case PROTECT:
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

	private static abstract class PowerEffect {
		
		private int life;
		protected Power type;
		
		// 0 = no stability, 1 = med, 2 = high stability
		protected int stability;
		
		public PowerEffect(Power type, int life, int stability) {
			this.type = type;
			this.life = life;
			this.stability = stability;
		}
		
		public final void tick() {
			this.life--;
			
			if(this.life <= 0)
				this.tickEffect();
		}

		protected abstract void tickEffect();
		
	}
	
	private static class KillEffect extends PowerEffect {

		private static final int[] STABILITY_LIFE = {0, 5, 5};
		
		private AiGenerator aiGenerator;
		private Ai target;
		
		public KillEffect(Ai target, AiGenerator aiGenerator, int stability) {
			super(Power.KILL, STABILITY_LIFE[stability], stability);
			this.target = target;
			this.aiGenerator = aiGenerator;
		}

		@Override
		protected void tickEffect() {
			
//			this.target.setDead(true);
			
			if(stability == 0) {
				// Summon daemon
				double[] location = this.target.getLocation();
				GenerateCommand daemonCommand = new AiGeneratorInterface.SoloGenerateCommand(location[0], location[1], AiGenerator.LONER, true, " ", DaemonWeapon.NAME, new String[]{});
				aiGenerator.spawnAi(daemonCommand );
			}
		}
		
		
	}
	
}
