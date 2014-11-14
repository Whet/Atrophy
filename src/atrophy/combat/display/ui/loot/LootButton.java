package atrophy.combat.display.ui.loot;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.CombatUiManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

import watoydoEngine.designObjects.display.ButtonSingle;

public class LootButton extends ButtonSingle implements InfoTextDisplayable{

	private int returnCode;
	
	private boolean lootActive;

	private LootBox lootBox;
	private CombatUiManager combatUiManager;
	
	public LootButton(LootBox lootBox, CombatUiManager combatUiManager, BufferedImage image, int returnCode) {
		super(image);
		lootActive = true;
		this.returnCode = returnCode;
		this.lootBox = lootBox;
		this.combatUiManager = combatUiManager;
	}
	
	@Override
	public boolean mU(Point mousePosition, MouseEvent e){
		if(lootActive){
			lootBox.lootInteraction(this.returnCode);
			combatUiManager.getInfoText().removeInfoText(this);
		}
		return true;
	}
	
	@Override
	public boolean mD(Point mousePosition, MouseEvent e) {
		return true;
	}
	
	@Override
	public void mI(Point mousePosition){
		combatUiManager.getInfoText().setInfoText(this);
	}
	
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	@Override
	public String getUiHint(){
		String message = lootBox.getItemAt(returnCode).getName() +"@n"+lootBox.getItemAt(returnCode).getDescription();
		return message;
	}
	
	@Override
	public int getHintLines(){
		return 1;
	}
	
	@Override
	public void setVisible(boolean visible){
		if(!visible){
			combatUiManager.getInfoText().removeInfoText(this);
		}
		super.setVisible(visible);
	}

	/**
	 * Sets the loot active.
	 *
	 * @param allowModification the new loot active
	 */
	public void setLootActive(boolean allowModification) {
		this.lootActive = allowModification;
	}
	
}
