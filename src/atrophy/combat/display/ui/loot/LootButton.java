/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui.loot;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import atrophy.combat.CombatUiManager;
import atrophy.combat.display.ui.InfoTextDisplayable;

import watoydoEngine.designObjects.display.ButtonSingle;

// TODO: Auto-generated Javadoc
/**
 * The Class LootButton.
 */
public class LootButton extends ButtonSingle implements InfoTextDisplayable{

	/**
	 * The return code.
	 */
	private int returnCode;
	
	/**
	 * The loot active.
	 */
	private boolean lootActive;

	private LootBox lootBox;
	private CombatUiManager combatUiManager;
	
	/**
	 * Instantiates a new loot button.
	 *
	 * @param image the image
	 * @param returnCode the return code
	 */
	public LootButton(LootBox lootBox, CombatUiManager combatUiManager, BufferedImage image, int returnCode) {
		super(image);
		lootActive = true;
		this.returnCode = returnCode;
		this.lootBox = lootBox;
		this.combatUiManager = combatUiManager;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mU(Point mousePosition, MouseEvent e){
		if(lootActive){
			lootBox.lootInteraction(this.returnCode);
			combatUiManager.getInfoText().removeInfoText(this);
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mD(Point mousePosition, MouseEvent e) {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition){
		combatUiManager.getInfoText().setInfoText(this);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition){
		combatUiManager.getInfoText().removeInfoText(this);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getUiHint()
	 */
	public String getUiHint(){
		String message = lootBox.getItemAt(returnCode).getName() +"@n"+lootBox.getItemAt(returnCode).getDescription();
		return message;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.display.ui.InfoTextDisplayable#getHintLines()
	 */
	public int getHintLines(){
		return 1;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#setVisible(boolean)
	 */
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
