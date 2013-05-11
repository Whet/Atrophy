/*
 * 
 */
package atrophy.combat.display.ui.combatInfo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.AbstractButton;
import watoydoEngine.designObjects.display.ButtonMulti;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.ImageSingle;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.DisplayManager;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.items.Weapon;
import atrophy.combat.mechanics.TurnProcess;


// TODO: Auto-generated Javadoc
/**
 * The Class CombatInfo.
 */
public class CombatInfo extends Crowd {
	
	/**
	 * The ammo text.
	 */
	private Text ammoText;
	
	/**
	 * The reload text.
	 */
	private Text reloadText;
	
	/**
	 * The swing text.
	 */
	private Text swingText;
	
	/**
	 * The combat buttons.
	 */
	private ButtonMulti combatButtons[];

	private CombatMembersManager combatMembersManager;

	private EndTurnButton endTurnButton;
	
	
	// handles counter at bottom right fo screen with target info
	// also handles various other combat variables as buttons above the target info
	/**
	 * Instantiates a new combat info.
	 * @param combatUiManager 
	 * @param floatingIcons 
	 * @param combatVisualManager 
	 * @param turnProcess 
	 */
	public CombatInfo(CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, FloatingIcons floatingIcons, CombatVisualManager combatVisualManager, TurnProcess turnProcess){
		super(true);
		
		this.combatMembersManager = combatMembersManager;
		
		// background image
		ImageSingle combatBack = null;
		
		try{
			combatBack = new ImageSingle("CombatInfoBackground",ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/combatInfo.png")));
			this.addDisplayItem(combatBack);
			
			// add swing counter and ammo counter text
			ammoText = new Text(160,
								DisplayManager.getInstance().getResolution()[1] - 44,
								"0");
			ammoText.setColour(Color.white);
			ammoText.setFont(FontList.AUD16);
			this.addDisplayItem(ammoText);

			reloadText = new Text(160,
								  DisplayManager.getInstance().getResolution()[1] - 25,
								  "0");
			reloadText.setColour(Color.white);
			reloadText.setFont(FontList.AUD16);
			this.addDisplayItem(reloadText);

			swingText = new Text(160,
								 DisplayManager.getInstance().getResolution()[1] - 80,
								 "18");
			swingText.setColour(Color.white);
			swingText.setFont(FontList.AUD16);
			this.addDisplayItem(swingText);
			
			combatButtons = new ButtonMulti[5];
			
			BufferedImage[] radioSilenceIcons = {ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/radioEnabled.png")),
												 ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/radioDisabled.png"))};
			
			combatButtons[0] = new IndividualLOSToggle(combatVisualManager, combatUiManager, radioSilenceIcons);
			
			combatButtons[0].setLocation(DisplayManager.getInstance().getResolution()[0] - 40, 240);
			
			this.addButton(combatButtons[0]);
			
//			BufferedImage[] drawFovIcons = {ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/fovEnabled.png")),
//					 						ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/fovDisabled.png"))};
//
//			combatButtons[1] = new DrawFovToggle(combatVisualManager, combatUiManager, drawFovIcons);
//			
//			combatButtons[1].setLocation(DisplayManager.getInstance().getResolution()[0] - 40,
//				 		 				 DisplayManager.getInstance().getResolution()[1] - 210);
//			
//			this.addButton(combatButtons[1]);
//			
//			BufferedImage[] drawObjLines = {ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/objLineDisabled.png")),
//					                        ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/objLineEnabled.png"))};
//
//			combatButtons[2] = new DrawObjLineToggle(combatVisualManager, combatUiManager, drawObjLines);
//			
//			combatButtons[2].setLocation(DisplayManager.getInstance().getResolution()[0] - 40,
//				 		 				 DisplayManager.getInstance().getResolution()[1] - 250);
//			
//			this.addButton(combatButtons[2]);
//			
//			BufferedImage[] drawDoors = {ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/doorsEnabled.png")),
//										 ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/doorsDisabled.png"))};
//
//			combatButtons[3] = new DrawDoorToggle(floatingIcons, combatUiManager, drawDoors);
//			
//			combatButtons[3].setLocation(DisplayManager.getInstance().getResolution()[0] - 40,
//										 DisplayManager.getInstance().getResolution()[1] - 290);
//			
//			this.addButton(combatButtons[3]);
			
			BufferedImage[] drawMiniMap = {ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/miniMapEnabled.png")),
                    					   ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/miniMapDisabled.png"))};

			combatButtons[4] = new MiniMapVisibleToggle(combatUiManager, drawMiniMap);
			
			combatButtons[4].setLocation(DisplayManager.getInstance().getResolution()[0] - 40, 200);
			
			this.addButton(combatButtons[4]);
			
			BufferedImage[] endTurnImages = {ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/endTurnButton.png")),
											 ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/endTurnButtonOn.png"))};

			
			endTurnButton = new EndTurnButton(endTurnImages, turnProcess);
			endTurnButton.setLocation(DisplayManager.getInstance().getResolution()[0] / 2 - endTurnButton.getSize()[0] / 2, ActivePane.getInstance().getInsets().top);
			this.addButton(endTurnButton);
		}
		catch(IOException ioExcept){
			System.err.println("Could not load combatinfo image. Terminating.");
			System.exit(-1);
		}
		
		// move combat info background to bottom right corner
		combatBack.setLocation(147,
							   DisplayManager.getInstance().getResolution()[1] - combatBack.getSize()[1]);
		
	}
	
	// The Void
	/**
	 * Update text.
	 */
	public void updateText(){
		if(combatMembersManager.getCurrentAi() != null){
			
			if(!combatMembersManager.getCurrentAi().getWeapon().canAttack()){
				swingText.setText("UNARMED");
				ammoText.setText("N/A");
				reloadText.setText("N/A");
				return;
			}
			
			if(combatMembersManager.getCurrentAi().getSwing() == combatMembersManager.getCurrentAi().getWeapon().getMaxSwing()){
				// show swing is maxed out
				swingText.setText("M " + 
				                 (combatMembersManager.getCurrentAi().getSwing() * Weapon.SWING_BONUS + combatMembersManager.getCurrentAi().getWeapon().getAccuracy()) +
				                 "% Hit");
			}
			else if(combatMembersManager.getCurrentAi().getSwing() > 0){
				// shows swing on target
				swingText.setText((combatMembersManager.getCurrentAi().getSwing() * Weapon.SWING_BONUS + combatMembersManager.getCurrentAi().getWeapon().getAccuracy()) +
		                 "% Hit");
			}
			else{
				swingText.setText("No Target");
			}
			
			if(combatMembersManager.getCurrentAi().getWeapon().isMelee()) {
				ammoText.setText("Melee");
			}
			else{
				// shows how many shots left
				ammoText.setText(Integer.toString(combatMembersManager.getCurrentAi().getWeapon().getAmmoLeft()) + "/" +
								 Integer.toString(combatMembersManager.getCurrentAi().getWeapon().getMagsize()) + " Ammo.");
			}
			
			if(combatMembersManager.getCurrentAi().getReloadTurns() > 0) {
			// show reload turns
			reloadText.setText(Integer.toString(combatMembersManager.getCurrentAi().getReloadTurns()) + "/" +
							   Integer.toString(combatMembersManager.getCurrentAi().getWeapon().getReloadTurns()) + " Reloaded.");
			}
			else{
				reloadText.setText("");
			}
		}
	}
	
	// Getters
	/**
	 * Gets the ammo text.
	 *
	 * @return the ammo text
	 */
	public Text getAmmoText(){
		return this.ammoText;
	}
	
	/**
	 * Gets the swing text.
	 *
	 * @return the swing text
	 */
	public Text getSwingText(){
		return this.swingText;
	}

	public AbstractButton getTurnButton() {
		return this.endTurnButton;
	}
	
}
