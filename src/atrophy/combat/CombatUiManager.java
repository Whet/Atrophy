/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat;

import java.io.IOException;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.ImageSingle;
import watoydoEngine.io.ReadWriter;
import atrophy.actions.MouseAbilityHandler;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.LineDrawer;
import atrophy.combat.display.ui.ActionTextBox;
import atrophy.combat.display.ui.AllyRoster;
import atrophy.combat.display.ui.Cartographer;
import atrophy.combat.display.ui.FloatingIcons;
import atrophy.combat.display.ui.InfoText;
import atrophy.combat.display.ui.LargeEventText;
import atrophy.combat.display.ui.MiniMap;
import atrophy.combat.display.ui.MoveFlag;
import atrophy.combat.display.ui.UnitMarker;
import atrophy.combat.display.ui.abilities.ActionsBar;
import atrophy.combat.display.ui.combatInfo.CombatInfo;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

// TODO: Auto-generated Javadoc
/**
 * The Class CombatUiManager.
 */
public class CombatUiManager{
	
	/**
	 * The info text.
	 */
	private InfoText infoText;
	
	/**
	 * The action text box.
	 */
	private ActionTextBox actionTextBox;
	
	//private ActiveEffectsText effectsTextBox;
	
	/**
	 * The move flag.
	 */
	private MoveFlag moveFlag;
	
	/**
	 * The line surface.
	 */
	private LineDrawer lineSurface;
	
	/**
	 * The unit marker.
	 */
	private ImageSingle unitMarker;
	
	/**
	 * The ally roster.
	 */
	private AllyRoster allyRoster;
	
	/**
	 * The combat info.
	 */
	private CombatInfo combatInfo;
	
	/**
	 * The actions bar.
	 */
	private ActionsBar actionsBar;
	
	/**
	 * The floating icons.
	 */
	private FloatingIcons floatingIcons;
	
	/**
	 * The mini map.
	 */
	private MiniMap miniMap;
	
	/**
	 * The large event text.
	 */
	private LargeEventText largeEventText;

	private CombatMembersManager combatMembersManager;
	private LootBox lootBox;

	/**
	 * Instantiates a new combat ui manager.
	 * @param mouseAbilityHandler 
	 * @param combatVisualManager 
	 * @param levelManager 
	 */
	public CombatUiManager(Cartographer cartographer, CombatMembersManager combatMembersManager, PanningManager panningManager, AiCrowd aiCrowd, TurnProcess turnProcess, LevelManager levelManager){
		
		this.combatMembersManager = combatMembersManager;
		
		infoText = new InfoText(this);
		
		actionTextBox = new ActionTextBox(panningManager, aiCrowd, combatMembersManager);
		
		//effectsTextBox = new ActiveEffectsText();
		
		actionsBar = new ActionsBar(combatMembersManager, this);
		
		miniMap = new MiniMap(cartographer, aiCrowd, panningManager, levelManager, "MiniMap");
		
		largeEventText = new LargeEventText();
		
		try{
			moveFlag = new MoveFlag(panningManager, this, combatMembersManager, ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/icons/moveMarker.png")), false);
			
			unitMarker = new UnitMarker(aiCrowd, panningManager, combatMembersManager, this, ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/ui/selectedUnitMarker.png")));
			
			allyRoster = new AllyRoster(aiCrowd, combatMembersManager, turnProcess);
		}
		catch(IOException ioexcept){
			System.err.println("Could not load images in CombatUIManager. Terminating.");
			System.exit(-1);
		}
	}
	
	public void lazyLoad(MouseAbilityHandler mouseAbilityHandler, CombatUiManager combatUiManager, FloatingIcons floatingIcons, CombatVisualManager combatVisualManager, LootBox lootBox, CombatVisualManager combatVisualManager2, LevelManager levelManager, AiCrowd aiCrowd, PanningManager panningManager) {
		lineSurface = new LineDrawer(aiCrowd, panningManager, combatVisualManager, combatMembersManager, levelManager);
		actionsBar.lazyLoad(combatMembersManager, mouseAbilityHandler, combatUiManager);
		lineSurface.makeMap();
		miniMap.init();
		this.floatingIcons = floatingIcons;
		combatInfo = new CombatInfo(combatMembersManager, this, floatingIcons, combatVisualManager);
		this.lootBox = lootBox;
	}
	
	// The Void
	/**
	 * Update ui.
	 */
	public void updateUi(){
		infoText.updateInfoText();
		this.moveFlag.updateLocation();
		allyRoster.updateMasks();
		combatInfo.updateText();
		actionTextBox.updateMode();
		actionsBar.updateVisibleButtons();
		// minimap excluded since it is much heavier on calculation and less likely to need updating
		
		if(combatMembersManager.getCurrentAi() != null &&
		   combatMembersManager.getCurrentAi().getAction().equals("Looting")){
			lootBox.loadLootDisplay(combatMembersManager.getCurrentAi(), 
					                              combatMembersManager.getCurrentAi().getTargetAi(),
					                              false);
		}
		else{
			lootBox.closeLootUi(false);
		}
	}
	
	// Getters
	/**
	 * Gets the action text.
	 *
	 * @return the action text
	 */
	public ActionTextBox getActionText(){
		return this.actionTextBox;
	}
	
	//public ActiveEffectsText getEffectsText(){
	//	return this.effectsTextBox;
	//}
	
	/**
	 * Gets the info text.
	 *
	 * @return the info text
	 */
	public InfoText getInfoText(){
		return this.infoText;
	}
	
	/**
	 * Gets the move flag.
	 *
	 * @return the move flag
	 */
	public MoveFlag getMoveFlag(){
		return this.moveFlag;
	}
	
	/**
	 * Gets the line surface.
	 *
	 * @return the line surface
	 */
	public LineDrawer getLineSurface(){
		return this.lineSurface;
	}
	
	/**
	 * Gets the unit marker.
	 *
	 * @return the unit marker
	 */
	public ImageSingle getUnitMarker(){
		return this.unitMarker;
	}
	
	/**
	 * Gets the ally roster.
	 *
	 * @return the ally roster
	 */
	public AllyRoster getAllyRoster(){
		return this.allyRoster;
	}
	
	/**
	 * Gets the combat info.
	 *
	 * @return the combat info
	 */
	public CombatInfo getCombatInfo(){
		return this.combatInfo;
	}
	
	/**
	 * Gets the actions bar.
	 *
	 * @return the actions bar
	 */
	public ActionsBar getActionsBar(){
		return this.actionsBar;
	}
	
	/**
	 * Gets the floating icons.
	 *
	 * @return the floating icons
	 */
	public FloatingIcons getFloatingIcons(){
		return this.floatingIcons;
	}
	
	/**
	 * Gets the mini map.
	 *
	 * @return the mini map
	 */
	public MiniMap getMiniMap(){
		return this.miniMap;
	}

	/**
	 * Gets the large event text.
	 *
	 * @return the large event text
	 */
	public LargeEventText getLargeEventText() {
		return largeEventText;
	}

}
