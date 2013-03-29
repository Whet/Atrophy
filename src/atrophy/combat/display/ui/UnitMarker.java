/*
 * 
 */
package atrophy.combat.display.ui;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import watoydoEngine.designObjects.display.ImageSingle;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatUiManager;
import atrophy.combat.PanningManager;
import atrophy.combat.display.AiCrowd;

// TODO: Auto-generated Javadoc
/**
 * The Class UnitMarker.
 */
public class UnitMarker extends ImageSingle {

	private PanningManager panningManager;
	private CombatMembersManager combatMembersManager;
	private CombatUiManager combatUiManager;
	private AiCrowd aiCrowd;
	
	/**
	 * Instantiates a new unit marker.
	 *
	 * @param image the image
	 */
	public UnitMarker(AiCrowd aiCrowd, PanningManager panningManager, CombatMembersManager combatMembersManager, CombatUiManager combatUiManager, BufferedImage image){
		super("UnitMarker",image,true);
		this.panningManager = panningManager;
		this.combatMembersManager = combatMembersManager;
		this.combatUiManager = combatUiManager;
		this.aiCrowd = aiCrowd;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.ImageSingle#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape){
		updateUnitMarker();
		drawShape.drawImage(this.getImage(),this.getTransformationForDrawing(),null);
	}
	// edited transformation to account for panning
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.AbstractImage#getTransformationForDrawing()
	 */
	@Override
	public AffineTransform getTransformationForDrawing(){
			super.getTransformation().setToTranslation(this.getLocation()[0] + panningManager.getOffset()[0],
					   								   this.getLocation()[1] + panningManager.getOffset()[1]);	
			
		super.getTransformation().scale(this.getScale(),this.getScale());
		return super.getTransformation();
	}
	
	/**
	 * Update unit marker.
	 */
	private void updateUnitMarker(){
		if(combatMembersManager.getCurrentAi() != null){
			this.setVisible(true);
			// Update ai selection marker to highlight the mask of current ai
			combatUiManager.getUnitMarker().setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0]
																	  - combatUiManager.getUnitMarker().getSize()[0] * 0.25,
																	  aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1]
																	  + aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getSize()[1] - 20);
		}
		else{
			this.setVisible(false);
		}
	}
	
}
