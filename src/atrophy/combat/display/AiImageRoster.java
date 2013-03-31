/*
 * 
 */
package atrophy.combat.display;

import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.sounds.SoundBoard;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.ai.Ai;

// TODO: Auto-generated Javadoc
// ai image used on the ally roster, clicking it will select that ai to be the current one unless dead
/**
 * The Class AiImageRoster.
 */
public class AiImageRoster extends ButtonSingle {
	
	// Ai this image represents
	/**
	 * The ai object.
	 */
	private Ai aiObject;
	protected AiCrowd aiCrowd;
	protected CombatMembersManager combatMembersManager;
	
	/**
	 * Instantiates a new ai image roster.
	 *
	 * @param ai the ai
	 * @param x the x
	 * @param y the y
	 */
	public AiImageRoster(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, Ai ai, double x, double y){
		super(null, x, y);
		this.aiObject = ai;
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
	}
	
	// just changes mask
	/**
	 * Update mask.
	 */
	public void updateMask(){
		String image = aiObject.getImage();
		
		if(aiObject.isDead())
			image = image + "Dead";
		
		this.setImage(aiCrowd.getPortraitImage(image));
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractButton#mU(java.awt.Point, java.awt.event.MouseEvent)
	 */
	public boolean mC(Point mousePosition, MouseEvent e){
		if(!aiObject.isDead()){
			combatMembersManager.changeCurrentAi(aiObject);
			SoundBoard.getInstance().playEffect("tick");
		}
		return true;
	}
	
	// Getters
	/**
	 * Gets the ai.
	 *
	 * @return the ai
	 */
	public Ai getAi(){
		return this.aiObject;
	}
	
	// Setters
	/**
	 * Sets the ai.
	 *
	 * @param aiObject the new ai
	 */
	public void setAi(Ai aiObject){
		this.aiObject = aiObject;
	}
	
}
