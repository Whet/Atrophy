package atrophy.combat.display.ui.combatInfo;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.ButtonMulti;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.ImageSingle;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.DisplayManager;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.items.Weapon;
import atrophy.combat.mechanics.TurnProcess;

public class CombatInfo extends Crowd {
	
	private Text ammoText;
	private Text reloadText;
	private Text swingText;
	private ButtonMulti combatButtons[];

	private CombatMembersManager combatMembersManager;

	// handles counter at bottom right of screen with target info
	// also handles various other combat variables as buttons above the target info
	public CombatInfo(CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, CombatVisualManager combatVisualManager, TurnProcess turnProcess){
		super(true);
		
		this.combatMembersManager = combatMembersManager;
		
		// background image
		ImageSingle combatBack = null;
		
		try{
			combatBack = new ImageSingle(ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/combatInfo.png")));
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
			
			BufferedImage[] drawMiniMap = {ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/miniMapEnabled.png")),
                    					   ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/miniMapDisabled.png"))};

			combatButtons[4] = new MiniMapVisibleToggle(combatUiManager, drawMiniMap);
			
			combatButtons[4].setLocation(DisplayManager.getInstance().getResolution()[0] - 40, 200);
			
			this.addButton(combatButtons[4]);

		}
		catch(IOException ioExcept){
			System.err.println("Could not load combatinfo image. Terminating.");
			System.exit(-1);
		}
		
		// move combat info background to bottom right corner
		combatBack.setLocation(147,
							   DisplayManager.getInstance().getResolution()[1] - combatBack.getSize()[1]);
		
	}

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
	
	public Text getAmmoText(){
		return this.ammoText;
	}
	
	public Text getSwingText(){
		return this.swingText;
	}
	
}
