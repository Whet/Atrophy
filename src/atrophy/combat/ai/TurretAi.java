package atrophy.combat.ai;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import watoydoEngine.utils.Maths;
import atrophy.combat.CombatNCEManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.Railgun;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.WeaponSupply;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class TurretAi extends LonerAi {

	private Set<String> targetFactions;
	
	private int lookTurnCounter;
	
	private boolean hacked;
	
	private String faction;
	private AiCrowd aiCrowd;
	private TeamsCommander commander;
	
	public TurretAi(PanningManager panningManager, AiCrowd aiCrowd, CombatVisualManager combatVisualManager, TurnProcess turnProcess, FloatingIcons floatingIcons, MouseAbilityHandler mouseAbilityHandler, CombatMembersManager combatMembersManager, double x, double y, LevelManager levelManager, CombatNCEManager combatInorganicManager, CombatUiManager combatUiManager, LootBox lootBox) {
		super(panningManager, aiCrowd, combatVisualManager, turnProcess, floatingIcons, mouseAbilityHandler, combatMembersManager, AiGenerator.TURRET, x, y, levelManager, combatInorganicManager, combatUiManager, lootBox);
		this.aiMode = AiMode.EMPTY;
		
		lookTurnCounter = 0;
		
		this.setArmour(100);
		this.setDefaultArmour(100);
		
		this.setTrueLookAngle(this.getLevelBlock().getPortal(new Random().nextInt(this.getLevelBlock().getPortalCount())).getLocation());
		
		this.setDefaultFov(90);
		this.setFov(90);
		
		equipTurret();
		
		this.faction = levelManager.getCurrentLevel().getMapOwner();
		
		this.aiCrowd = aiCrowd;
		this.targetFactions = new HashSet<>();
		this.hacked = false;
	}
	
	public void setCommander(TeamsCommander commander) {
		this.commander = commander;
	}

	private void equipTurret() {
		// Choose weapon from set list
		this.setWeapon(new Railgun());
	}

	@Override
	public String getFaction() {
		return this.faction;
	}
	
	public void setFaction(String faction) {
		this.faction = faction;
	}
	
	@Override
	protected void gatherEnvironmentData(){
		
		// since this is done during a turn some variables that are swept up at the end of the turn will be incorrect
		// e.g aiming at a dead target
		cleanupIntraTurnVars();

		if(this.getTargetAi() == null){
			engageWithHostiles();
		}
		else{
			respondToEnvironmentData();
		}
		
		this.endTurn();
	}
	
	@Override
	protected void computeLookDirection() {
		
		lookTurnCounter++;
		
		//Look at doors of room
		if(lookTurnCounter > 4){
			this.setTrueLookAngle(this.getLevelBlock().getPortal(new Random().nextInt(this.getLevelBlock().getPortalCount())).getLocation());
			lookTurnCounter = 0;
		}
		
	}
	
	protected void engageWithHostiles(){

		Ai target = null;
		
		for(int i = 0; i < aiCrowd.getActorCount(); i++){
			
			// determine if target is hostile and if it is visible by the team
			if(canBeEngaged(aiCrowd.getActor(i))){
				
			   // find closest target
			   if(this.getTargetAi() == null || Maths.getDistance(this.getLocation(), aiCrowd.getActor(i).getLocation()) <
						  						Maths.getDistance(this.getLocation(), this.getTargetAi().getLocation())){

				   target = aiCrowd.getActor(i);
				}
			   
			}
		}
		
		if(target != null){
			this.aim(target);
			this.aiMode = AiMode.ENGAGING;
			lookTurnCounter = 0;
		}
		else{
			this.aiMode = AiMode.EMPTY;
			computeLookDirection();
		}
	}

	@Override
	public boolean isTargetHostile(Ai target) {
		
		if(!hacked) {
			if(!target.isDead() &&
			   !this.getFaction().equals(target.getFaction()) &&
			   (this.getFaction().equals(AiGenerator.LONER)) ||
                !this.commander.isAlliedWith(target.getFaction())
               )
				return true;
		}
		else {
			if(target != this && targetFactions.contains(target.getFaction()) && !target.isDead())
				return true;
		}
		
		return false;
	}
	
	@Override
	public boolean willJoinPlayer(Ai player) {
		return false;
	}
	
	@Override
	public void setDead(boolean dead) {
		
		// setdead without blood death effect and remove weapon
		
		this.dead = dead;
		
		if(this.dead){	
			
			this.setWeapon(new MeleeWeapon1());
			
			this.setTargetAi(null); 
			this.setSkippingTurns(true);
			
			if(!this.getImage().endsWith("Dead")){
				this.setImage(this.getImage() + "Dead");
			}
			
			// Add a random goodie for kill
			if(new Random().nextBoolean()){
				this.addItem(EngineeringSupply.getInstance());
				this.addItem(ScienceSupply.getInstance());
			}
			else{
				this.addItem(WeaponSupply.getInstance());
				this.addItem(ScienceSupply.getInstance());
			}
		}
	}

	public void addTargetFaction(String faction) {
		targetFactions.add(faction);
	}
	
	public void removeTargetFaction(String faction) {
		targetFactions.remove(faction);
	}
	
	public void setTargetFaction(Set<String> targetFactions) {
		this.targetFactions = targetFactions;
	}
	
	@Override
	public boolean isStealthed() {
		return false;
	}
	
	public void hack(Set<String> targetFactions) {
		this.hacked = true;
		this.targetFactions = targetFactions;
	}
	
	public void hack(String targetFaction) {
		this.hacked = true;
		this.targetFactions.add(targetFaction);
	}
	
}
