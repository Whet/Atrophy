/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.ImageSingle;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.DisplayManager;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.AiImageRoster;
import atrophy.combat.mechanics.TurnProcess;

// TODO: Auto-generated Javadoc
/**
 * The Class AllyRoster.
 */
public class AllyRoster extends Crowd {
	
	/**
	 * The Constant PORTRAIT_SPACING_X.
	 */
	private static final int PORTRAIT_SPACING_X = 75;
	
	/**
	 * The portrait x.
	 */
	private static int portraitX = 0;
	
	/**
	 * The portrait y.
	 */
	private static int portraitY = 0;
	
	/**
	 * The background image.
	 */
	private static BufferedImage backgroundImage;
	
	/**
	 * The roster images.
	 */
	private ArrayList<AiImageRoster> rosterImages;
	
	/**
	 * The roster text.
	 */
	private Map<AiImageRoster,Text> rosterText;
	
	private CombatMembersManager combatMembersManager;
	private TurnProcess turnProcess;
	private AiCrowd aiCrowd;
	
	/**
	 * Instantiates a new ally roster.
	 */
	public AllyRoster(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, TurnProcess turnProcess){
		super("AllyRoster",true);
		
		rosterImages = new ArrayList<AiImageRoster>(4);
		rosterText = new HashMap<AiImageRoster,Text>(4);
		
		try{
			backgroundImage = ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/teamSelect.png"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
		this.turnProcess = turnProcess;
	}
	
	/**
	 * Generate portraits.
	 */
	public void generatePortraits(){
		
		portraitY = 0;
		portraitX = 0;
		
		this.getDisplayList().clear();
		this.rosterImages.clear();

		for(int i = 0; i < combatMembersManager.getAllyCount(); i++){
			
			if((PORTRAIT_SPACING_X * portraitX) + backgroundImage.getWidth() >
			   DisplayManager.getInstance().getResolution()[0] * 0.5){
				portraitY++;
				portraitX = 0;
			}
			
			// image behind button
			ImageSingle backdrop = new ImageSingle(combatMembersManager.getAlly(i).getName() +"Background",
												   backgroundImage,
												   20 + PORTRAIT_SPACING_X * portraitX,
												   ActivePane.getInstance().getInsets().top + (portraitY * backgroundImage.getHeight()));
			this.addDisplayItem(backdrop);
			
			// ai helmet as button
			rosterImages.add(new AiImageRoster(aiCrowd, combatMembersManager, combatMembersManager.getAlly(i).getName() +"Roster",
											   combatMembersManager.getAlly(i),
											   20 + PORTRAIT_SPACING_X * portraitX + backdrop.getSize()[0] * 0.25,
											   ActivePane.getInstance().getInsets().top + backdrop.getSize()[1] * 0.25 + (portraitY * backgroundImage.getHeight())));
			rosterImages.get(i).updateMask();
			this.addButton(rosterImages.get(i));
			
			// text to show hotkey to select ai
			Text text = new Text(combatMembersManager.getAlly(i).getName() +"Hotkey",
								 backdrop.getLocationCentre()[0] - 18,
								 backdrop.getSize()[1] + backdrop.getLocation()[1] - 8,
								 new Integer(i + 1).toString());
			rosterText.put(rosterImages.get(i),text);
			this.addDisplayItem(text);
			
			portraitX++;
		}
	}
	
	/**
	 * Update masks.
	 */
	public void updateMasks(){
		
		Ai currentAi = turnProcess.getTopAi();
		
		
		for(int i = 0; i < rosterImages.size(); i++){
			rosterImages.get(i).updateMask();
			
			if(rosterImages.get(i).getAi().isSkippingTurns()){
				this.rosterText.get(rosterImages.get(i)).setColour(Color.red);
			}
			else if(rosterImages.get(i).getAi() == currentAi){
				this.rosterText.get(rosterImages.get(i)).setColour(Color.yellow);
			}
			else{
				this.rosterText.get(rosterImages.get(i)).setColour(Color.white);
			}
		}
	}
	
}
