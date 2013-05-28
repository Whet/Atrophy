package atrophy.combat.display.ui.abilities;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.actions.ActionRegion;
import watoydoEngine.designObjects.actions.MouseRespondable;
import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.designObjects.display.ImageSingle;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.actions.MouseAbilityHandler;
import atrophy.combat.combatEffects.PowerManager;
import atrophy.combat.display.ui.InfoTextDisplayable;
import atrophy.combat.mechanics.Abilities;

public class ActionsBar extends Crowd{
	
	private static final int BUTTON_SPACING_Y = 40;
	private static final int BUTTON_SPACING_X = 50;
	private static final int BUTTON_X = 13;
	private static final int BUTTON_Y_START = 118;
	
	private ArrayList<ButtonSingle> visibleButtons;
	private CombatMembersManager combatMembersManager;
	private Map<String, AbilityButton> actionButtonMap;
	private ImageSingle abilityBack;
	private PowerMouseRegion powerMouseRegion; 
	
	public ActionsBar(CombatMembersManager combatMembersManager) {
		super(true);
		
		actionButtonMap = new HashMap<>();
		
		this.combatMembersManager = combatMembersManager;
		
		try{
			
			abilityBack = new ImageSingle(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/abilityGrid.png")));
			
			this.addDisplayItem(abilityBack);
			
			BlockDoorAction blockDoor = new BlockDoorAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/blockDoor.png")));
			actionButtonMap.put("blockDoor", blockDoor);
			this.addButton(blockDoor);
			
			ThrowGrenadeAction throwGrenade = new ThrowGrenadeAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/throwGrenade.png")));
			actionButtonMap.put("throwGrenade", throwGrenade);
			this.addButton(throwGrenade);
			
			ThrowStunGrenadeAction throwStunGrenade = new ThrowStunGrenadeAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/throwStunGrenade.png")));
			actionButtonMap.put("throwStunGrenade", throwStunGrenade);
			this.addButton(throwStunGrenade);
			
			ScanRoomAction scanRoom = new ScanRoomAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			actionButtonMap.put("scanRoom", scanRoom);
			this.addButton(scanRoom);
			
			UnitDetectorAction unitDetector = new UnitDetectorAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			actionButtonMap.put("unitDetector", unitDetector);
			this.addButton(unitDetector);
			
			KillTagAction killTag = new KillTagAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			actionButtonMap.put("killTag", killTag);
			this.addButton(killTag);
			
			ScienceScanRoom scanObjectiveRoom = new ScienceScanRoom(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			actionButtonMap.put("scanObjectiveRoom", scanObjectiveRoom);
			this.addButton(scanObjectiveRoom);
			
			LightStealthAction stealth1 = new LightStealthAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stealthed.png")));
			actionButtonMap.put("stealth1", stealth1);
			this.addButton(stealth1);
			
			MediumStealthAction stealth2 = new MediumStealthAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stealthed.png")));
			actionButtonMap.put("stealth2", stealth2);
			this.addButton(stealth2);
			
			SpeedBoosterAction speedBoost = new SpeedBoosterAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/speedBoost.png")));
			actionButtonMap.put("speedBoost", speedBoost);
			this.addButton(speedBoost);
			
			SpeechAction speech = new SpeechAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/speechIcon.png")));
			actionButtonMap.put("speech", speech);
			this.addButton(speech);
			
			StashSearchAction stashSearch = new StashSearchAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stashSearch.png")));
			actionButtonMap.put("stashSearch", stashSearch);
			this.addButton(stashSearch);
			
			StunAction stunMelee = new StunAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stun.png")));
			actionButtonMap.put("stunMelee", stunMelee);
			this.addButton(stunMelee);
			
			BackstabAction backstab = new BackstabAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/backstab.png")));
			actionButtonMap.put("backstab", backstab);
			this.addButton(backstab);
			
			HackAction hack = new HackAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/hackTool.png")));
			actionButtonMap.put("hack", hack);
			this.addButton(hack);
			
			ParryAction parry = new ParryAction(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stun.png")));
			actionButtonMap.put("parry", parry);
			this.addButton(parry);
		}
		catch(IOException ioExcept){
			System.err.println("Could not load ActionsBar image. Terminating.");
			System.exit(-1);
		}
		
		visibleButtons = new ArrayList<ButtonSingle>(9);
		
		// move abilities background to bottom left corner
		abilityBack.setLocation(0, DisplayManager.getInstance().getResolution()[1] - abilityBack.getSize()[1]);
		abilityBack.setVisible(true);
		
		powerMouseRegion = new PowerMouseRegion(0, DisplayManager.getInstance().getResolution()[1] - abilityBack.getSize()[1], abilityBack.getSize()[0], 50);
		this.addMouseActionItem(powerMouseRegion);
		
	}
	
	public void lazyLoad(final MouseAbilityHandler mouseAbilityHandler, CombatUiManager combatUiManager) {
		this.addMouseActionItem(new KillPowerButton(10, DisplayManager.getInstance().getResolution()[1] - abilityBack.getSize()[1] + 2, 30, 30, combatUiManager) {
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				mouseAbilityHandler.setAbility("PowerKill");
				return true;
			}
		});
		
		this.addMouseActionItem(new ProtectPowerButton(57, DisplayManager.getInstance().getResolution()[1] - abilityBack.getSize()[1] + 2, 30, 30, combatUiManager) {
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				mouseAbilityHandler.setAbility("PowerProtect");
				return true;
			}
		});
		
		this.addMouseActionItem(new HelpPowerButton(104, DisplayManager.getInstance().getResolution()[1] - abilityBack.getSize()[1] + 2, 30, 30, combatUiManager) {
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				mouseAbilityHandler.setAbility("PowerHelp");
				return true;
			}
		});
	}
	
	public void setPowerManager(PowerManager powerManager) {
		powerMouseRegion.setPowerManager(powerManager);
	}
	
	public void updateVisibleButtons(){
		this.visibleButtons.clear();
		
		if(combatMembersManager.getCurrentAi() != null){
			for(int i = 0; i < combatMembersManager.getCurrentAi().getAbilities().size(); i++){
				switch(combatMembersManager.getCurrentAi().getAbilities().get(i)){
					case Abilities.SCAN_SCIENCE:
						this.visibleButtons.add(actionButtonMap.get("scanObjectiveRoom"));
					break;
					case Abilities.WELDING:
						this.visibleButtons.add(actionButtonMap.get("blockDoor"));
					break;
					case Abilities.GRENADETHROWER:
						this.visibleButtons.add(actionButtonMap.get("throwGrenade"));
					break;
					case Abilities.STUNGRENADETHROWER:
						this.visibleButtons.add(actionButtonMap.get("throwStunGrenade"));
					break;
					case Abilities.XRAY_SCAN:
						this.visibleButtons.add(actionButtonMap.get("scanRoom"));
					break;
					case Abilities.STEALTH1:
						this.visibleButtons.add(actionButtonMap.get("stealth1"));
					break;
					case Abilities.STEALTH2:
						this.visibleButtons.add(actionButtonMap.get("stealth2"));
					break;
					case Abilities.SPEED_BOOSTER:
						this.visibleButtons.add(actionButtonMap.get("speedBoost"));
					break;
					case Abilities.UNIT_DETECTOR:
						this.visibleButtons.add(actionButtonMap.get("unitDetector"));
					break;
					case Abilities.KILL_TAGS:
						this.visibleButtons.add(actionButtonMap.get("killTag"));
					break;
					case Abilities.STASH_SEARCH:
						this.visibleButtons.add(actionButtonMap.get("stashSearch"));
					break;
					case Abilities.SLIT_MELEE:
						this.visibleButtons.add(actionButtonMap.get("backstab"));
					break;
					case Abilities.STUN_MELEE:
						this.visibleButtons.add(actionButtonMap.get("stunMelee"));
					break;
					case Abilities.HACK:
						this.visibleButtons.add(actionButtonMap.get("hack"));
					break;
					case Abilities.SPEECH:
						this.visibleButtons.add(actionButtonMap.get("speech"));
					break;
					case Abilities.PARRY:
						this.visibleButtons.add(actionButtonMap.get("parry"));
					break;
				}
			}
			
		}
		
		for(int i = 0; i < this.getDisplayList().size(); i++){
			if(!this.visibleButtons.contains(this.getDisplayList().get(i))){
				this.getDisplayList().get(i).setVisible(false);
			}
			else{
				this.getDisplayList().get(i).setVisible(true);
			}
		}
		
		abilityBack.setVisible(true);
		
		placeButtons();
	}
	
	private void placeButtons(){
		int xCounter = 0;
		int yCounter = 0;
		for(int i = 0; i < this.visibleButtons.size(); i++){
			
			if(i > 0 && i%3 == 0){
				xCounter = 0;
				yCounter++;
			}
			
			if(this.visibleButtons.get(i) != null)
				this.visibleButtons.get(i).setLocation(BUTTON_X + (xCounter * BUTTON_SPACING_X), 
						                               DisplayManager.getInstance().getResolution()[1] - BUTTON_Y_START + BUTTON_SPACING_Y * yCounter);
			
			xCounter++;
		}
	}
	
	public void activateButton(int button){
		if(button < this.visibleButtons.size()){
			this.visibleButtons.get(button).mC(null,null);
		}
	}
	
	@Override
	public void setVisible(boolean visible){
		super.setVisible(visible);
		
		if(visible){
			updateVisibleButtons();
		}
		else{
			// set all children to same visibility to handle events correctly
			for(Displayable item: this.getDisplayList()){
				item.setVisible(visible);
			}
		}
	}

	public void lazyLoad(CombatMembersManager combatMembersManager, MouseAbilityHandler mouseAbilityHandler, CombatUiManager combatUiManager) {
		for(MouseRespondable button : this.getMouseActionList()){
			if(button instanceof AbilityButton){
				((AbilityButton) button).setMouseAbilityHandler(mouseAbilityHandler);
				((AbilityButton) button).setCombatMembersManager(combatMembersManager);
				((AbilityButton) button).setCombatUiManager(combatUiManager);
			}
		}
		
		powerMouseRegion.setCombatUiManager(combatUiManager);
	}
	
	@Override
	public double[] getSize() {
		return new double[]{0,this.abilityBack.getSize()[1]};
	}
	
	private static class PowerMouseRegion extends ActionRegion implements InfoTextDisplayable {

		private CombatUiManager combatUiManager;
		private PowerManager powerManager;
		
		public PowerMouseRegion(double x, double y, double width, double height) {
			super(x, y, width, height);
		}
		
		public void setCombatUiManager(CombatUiManager combatUiManager) {
			this.combatUiManager = combatUiManager;
		}

		public void setPowerManager(PowerManager powerManager) {
			this.powerManager = powerManager;			
		}

		@Override
		public void mI(Point mousePosition){
			combatUiManager.getInfoText().setInfoText(this);
		}
		
		@Override
		public void mO(Point mousePosition){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		
		public String getUiHint(){
			return "Stability: " + powerManager.getStability() + " (" + powerManager.getRankedStability() + ")";
		}
		
		public int getHintLines(){
			return 1;
		}
		
	}
	
	private static class KillPowerButton extends ActionRegion implements InfoTextDisplayable {

		private CombatUiManager combatUiManager;

		public KillPowerButton(double x, double y, double width, double height, CombatUiManager combatUiManager) {
			super(x, y, width, height);
			this.combatUiManager = combatUiManager;
		}

		@Override
		public String getUiHint() {
			return "Kill Power";
		}

		@Override
		public int getHintLines() {
			return 1;
		}
		
		@Override
		public void mI(Point mousePosition){
			combatUiManager.getInfoText().setInfoText(this);
		}
		
		@Override
		public void mO(Point mousePosition){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		
	}
	
	private static class ProtectPowerButton extends ActionRegion implements InfoTextDisplayable {

		private CombatUiManager combatUiManager;

		public ProtectPowerButton(double x, double y, double width, double height, CombatUiManager combatUiManager) {
			super(x, y, width, height);
			this.combatUiManager = combatUiManager;
		}

		@Override
		public String getUiHint() {
			return "Protect Power";
		}

		@Override
		public int getHintLines() {
			return 1;
		}
		
		@Override
		public void mI(Point mousePosition){
			combatUiManager.getInfoText().setInfoText(this);
		}
		
		@Override
		public void mO(Point mousePosition){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		
	}
	
	private static class HelpPowerButton extends ActionRegion implements InfoTextDisplayable {

		private CombatUiManager combatUiManager;

		public HelpPowerButton(double x, double y, double width, double height, CombatUiManager combatUiManager) {
			super(x, y, width, height);
			this.combatUiManager = combatUiManager;
		}

		@Override
		public String getUiHint() {
			return "Help Power";
		}

		@Override
		public int getHintLines() {
			return 1;
		}
		
		@Override
		public void mI(Point mousePosition){
			combatUiManager.getInfoText().setInfoText(this);
		}
		
		@Override
		public void mO(Point mousePosition){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		
	}
	
}
