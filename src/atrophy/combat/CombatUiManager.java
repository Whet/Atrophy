package atrophy.combat;

import java.io.IOException;

import javax.imageio.ImageIO;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.actions.MouseAbilityHandler;
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
import atrophy.combat.display.ui.abilities.ActionsBar;
import atrophy.combat.display.ui.combatInfo.CombatInfo;
import atrophy.combat.display.ui.loot.LootBox;
import atrophy.combat.level.LevelManager;
import atrophy.combat.mechanics.TurnProcess;

public class CombatUiManager{
	
	private InfoText infoText;
	private ActionTextBox actionTextBox;
	private MoveFlag moveFlag;
	private LineDrawer lineSurface;
	private AllyRoster allyRoster;
	private CombatInfo combatInfo;
	private ActionsBar actionsBar;
	private FloatingIcons floatingIcons;
	private MiniMap miniMap;
	private LargeEventText largeEventText;

	private CombatMembersManager combatMembersManager;
	private LootBox lootBox;

	public CombatUiManager(Cartographer cartographer, CombatMembersManager combatMembersManager, PanningManager panningManager, AiCrowd aiCrowd, TurnProcess turnProcess, LevelManager levelManager){
		
		this.combatMembersManager = combatMembersManager;
		
		infoText = new InfoText(this);
		
		actionTextBox = new ActionTextBox(panningManager, aiCrowd, combatMembersManager);
		
		actionsBar = new ActionsBar(combatMembersManager);
		
		miniMap = new MiniMap(cartographer, aiCrowd, panningManager, levelManager);
		
		largeEventText = new LargeEventText();
		
		try{
			moveFlag = new MoveFlag(panningManager, this, combatMembersManager, ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/icons/moveMarker.png")), false);
			
			allyRoster = new AllyRoster(aiCrowd, combatMembersManager, turnProcess);
		}
		catch(IOException ioexcept){
			System.err.println("Could not load images in CombatUIManager. Terminating.");
			System.exit(-1);
		}
	}
	
	public void lazyLoad(MouseAbilityHandler mouseAbilityHandler, CombatUiManager combatUiManager, FloatingIcons floatingIcons, CombatVisualManager combatVisualManager, LootBox lootBox, LevelManager levelManager, AiCrowd aiCrowd, PanningManager panningManager) {
		lineSurface = new LineDrawer(aiCrowd, panningManager, combatVisualManager, combatMembersManager, levelManager);
		actionsBar.lazyLoad(combatMembersManager, mouseAbilityHandler, combatUiManager);
		lineSurface.makeMap();
		miniMap.init();
		this.floatingIcons = floatingIcons;
		combatInfo = new CombatInfo(combatMembersManager, this, floatingIcons, combatVisualManager);
		this.lootBox = lootBox;
	}
	
	public void updateUi(){
		infoText.updateInfoText();
		this.moveFlag.updateLocation();
		allyRoster.updateMasks();
		combatInfo.updateText();
		actionTextBox.updateMode();
		actionsBar.updateVisibleButtons();
		
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
	
	public ActionTextBox getActionText(){
		return this.actionTextBox;
	}
	
	public InfoText getInfoText(){
		return this.infoText;
	}
	
	public MoveFlag getMoveFlag(){
		return this.moveFlag;
	}
	
	public LineDrawer getLineSurface(){
		return this.lineSurface;
	}
	
	public AllyRoster getAllyRoster(){
		return this.allyRoster;
	}
	
	public CombatInfo getCombatInfo(){
		return this.combatInfo;
	}
	
	public ActionsBar getActionsBar(){
		return this.actionsBar;
	}
	
	public FloatingIcons getFloatingIcons(){
		return this.floatingIcons;
	}
	
	public MiniMap getMiniMap(){
		return this.miniMap;
	}

	public LargeEventText getLargeEventText() {
		return largeEventText;
	}

}
