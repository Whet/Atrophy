/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui.abilities;

import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.actions.MouseRespondable;
import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.designObjects.display.ImageSingle;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.DisplayManager;
import atrophy.actions.MouseAbilityHandler;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.mechanics.Abilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ActionsBar.
 */
public class ActionsBar extends Crowd{
	
	/**
	 * The Constant BUTTON_SPACING_Y.
	 */
	private static final int BUTTON_SPACING_Y = 40;
	
	/**
	 * The Constant BUTTON_SPACING_X.
	 */
	private static final int BUTTON_SPACING_X = 50;
	
	/**
	 * The Constant BUTTON_X.
	 */
	private static final int BUTTON_X = 13;
	
	/**
	 * The Constant BUTTON_Y_START.
	 */
	private static final int BUTTON_Y_START = 118;
	
	/**
	 * The visible buttons.
	 */
	private ArrayList<ButtonSingle> visibleButtons;
	
	private CombatMembersManager combatMembersManager;
	
	/**
	 * Instantiates a new actions bar.
	 */
	public ActionsBar(CombatMembersManager combatMembersManager, CombatUiManager combatUiManager) {
		super("ActionsBar", true);
		
		ImageSingle abilityBack = null;
		
		this.combatMembersManager = combatMembersManager;
		
		try{
			
			abilityBack = new ImageSingle("abilityBarBackground",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/abilityGrid.png")));
			
			this.addDisplayItem(abilityBack);
			
			BlockDoorAction blockDoor = new BlockDoorAction("blockDoor",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/blockDoor.png")));
			
			this.addButton(blockDoor);
			
			ThrowGrenadeAction throwGrenade = new ThrowGrenadeAction("throwGrenade",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/throwGrenade.png")));
			
			this.addButton(throwGrenade);
			
			ThrowStunGrenadeAction throwStunGrenade = new ThrowStunGrenadeAction("throwStunGrenade",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/throwStunGrenade.png")));
			
			this.addButton(throwStunGrenade);
			
			ScanRoomAction scanRoom = new ScanRoomAction("scanRoom",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			
			this.addButton(scanRoom);
			
			UnitDetectorAction unitDetector = new UnitDetectorAction("unitDetector",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			
			this.addButton(unitDetector);
			
			KillTagAction killTag = new KillTagAction("killTag",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			
			this.addButton(killTag);
			
			ScienceScanRoom scanObjectiveRoom = new ScienceScanRoom("scanObjectiveRoom",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/scanRoom.png")));
			
			this.addButton(scanObjectiveRoom);
			
			LightStealthAction stealth1 = new LightStealthAction("stealth1",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stealthed.png")));
			
			this.addButton(stealth1);
			
			MediumStealthAction stealth2 = new MediumStealthAction("stealth2",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stealthed.png")));
			
			this.addButton(stealth2);
			
			SpeedBoosterAction speedBoost = new SpeedBoosterAction("speedBoost",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/speedBoost.png")));
			
			this.addButton(speedBoost);
			
			SpeechAction speech = new SpeechAction("speech",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/speechIcon.png")));
			
			this.addButton(speech);
			
			StashSearchAction stashSearch = new StashSearchAction("stashSearch",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stashSearch.png")));
			
			this.addButton(stashSearch);
			
			StunAction stunMelee = new StunAction("stunMelee",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/stun.png")));
			
			this.addButton(stunMelee);
			
			BackstabAction backstab = new BackstabAction("backstab",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/backstab.png")));
			
			this.addButton(backstab);
		}
		catch(IOException ioExcept){
			System.err.println("Could not load ActionsBar image. Terminating.");
			System.exit(-1);
		}
		
		visibleButtons = new ArrayList<ButtonSingle>(9);
		
		// move abilities background to bottom left corner
		abilityBack.setLocation(0,
							   DisplayManager.getInstance().getResolution()[1] - abilityBack.getSize()[1]);
		abilityBack.setVisible(true);
		
	}
	
	/**
	 * Update visible buttons.
	 */
	public void updateVisibleButtons(){
		this.visibleButtons.clear();
		
		if(combatMembersManager.getCurrentAi() != null){
			for(int i = 0; i < combatMembersManager.getCurrentAi().getAbilities().size(); i++){
				switch(combatMembersManager.getCurrentAi().getAbilities().get(i)){
					case Abilities.SCAN_SCIENCE:
						this.visibleButtons.add(this.getItem("scanObjectiveRoom"));
					break;
					case Abilities.WELDING:
						this.visibleButtons.add(this.getItem("blockDoor"));
					break;
					case Abilities.GRENADETHROWER:
						this.visibleButtons.add(this.getItem("throwGrenade"));
					break;
					case Abilities.STUNGRENADETHROWER:
						this.visibleButtons.add(this.getItem("throwStunGrenade"));
					break;
					case Abilities.XRAY_SCAN:
						this.visibleButtons.add(this.getItem("scanRoom"));
					break;
					case Abilities.STEALTH1:
						this.visibleButtons.add(this.getItem("stealth1"));
					break;
					case Abilities.STEALTH2:
						this.visibleButtons.add(this.getItem("stealth2"));
					break;
					case Abilities.SPEED_BOOSTER:
						this.visibleButtons.add(this.getItem("speedBoost"));
					break;
					case Abilities.UNIT_DETECTOR:
						this.visibleButtons.add(this.getItem("unitDetector"));
					break;
					case Abilities.KILL_TAGS:
						this.visibleButtons.add(this.getItem("killTag"));
					break;
					case Abilities.STASH_SEARCH:
						this.visibleButtons.add(this.getItem("stashSearch"));
					break;
					case Abilities.SLIT_MELEE:
						this.visibleButtons.add(this.getItem("backstab"));
					break;
					case Abilities.STUN_MELEE:
						this.visibleButtons.add(this.getItem("stunMelee"));
					break;
					case Abilities.SPEECH:
						this.visibleButtons.add(this.getItem("speech"));
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
		
		// make background visible
		super.getItem("abilityBarBackground").setVisible(true);
		
		placeButtons();
	}
	
	/**
	 * Place buttons.
	 */
	private void placeButtons(){
		int xCounter = 0;
		int yCounter = 0;
		for(int i = 0; i < this.visibleButtons.size(); i++){
			
			if(i > 0 && i%3 == 0){
				xCounter = 0;
				yCounter++;
			}
			
			this.visibleButtons.get(i).setLocation(BUTTON_X + (xCounter * BUTTON_SPACING_X), 
					                               DisplayManager.getInstance().getResolution()[1] - BUTTON_Y_START + BUTTON_SPACING_Y * yCounter);
			
			xCounter++;
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#getItem(java.lang.String)
	 */
	@Override
	// changed to return a button
	public ButtonSingle getItem(String tag){
		return (ButtonSingle) super.getItem(tag);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#getSize()
	 */
	@Override
	public double[] getSize(){
		return super.getItem("abilityBarBackground").getSize();
	}
	
	/**
	 * Activate button.
	 *
	 * @param button the button
	 */
	public void activateButton(int button){
		if(button < this.visibleButtons.size()){
			this.visibleButtons.get(button).mC(null,null);
		}
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible){
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
	}
	
}
