/*
 * 
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.gubbinz.GraphicsFunctions;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.AiActions;
import atrophy.combat.ai.AiCombatActions;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.mechanics.Abilities;

// TODO: Auto-generated Javadoc
// Displays text on a background showing the player's current action
/**
 * The Class ActionTextBox.
 */
public class ActionTextBox extends Text{
	
	/**
	 * The Constant BOX_MARGIN.
	 */
	private static final int BOX_MARGIN = 10;
	
	/**
	 * The metrics.
	 */
	private FontMetrics metrics;
	
	private PanningManager panningManager;
	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	/**
	 * Instantiates a new action text box.
	 */
	public ActionTextBox(PanningManager panningManager, AiCrowd aiCrowd, CombatMembersManager combatMembersManager) {
		this.setFont(FontList.AUD14);
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#drawMethod(java.awt.Graphics2D)
	 */
	public void drawMethod(Graphics2D drawShape){
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.6f));
		
		this.updateMode();
		
		metrics = drawShape.getFontMetrics(this.getFont());
		
		// the centre of the text should be at location[]
		
		// Draw backdrop
		drawShape.setColor(this.getColour());
		drawShape.setFont(this.getFont());
		
		drawShape.fillRect((int) (this.getLocation()[0] + panningManager.getOffset()[0] - 
				                 (metrics.getStringBounds(this.getText(), drawShape).getWidth() * 0.5)),
						   (int) (this.getLocation()[1] - 15 + panningManager.getOffset()[1]),
						   
						   (int) (metrics.getStringBounds(this.getText(), drawShape).getWidth()) + BOX_MARGIN * 2,
						   20);
		
		// Draw text
		
		pointInText = 0;
		drawShape.setColor(Color.white);
		while(pointInText < this.getText().length()){
			drawShape.drawString(computeLines(),(int)(this.getLocation()[0] + BOX_MARGIN + panningManager.getOffset()[0] - 
													 (metrics.getStringBounds(this.getText(), drawShape).getWidth() * 0.5)),
													 
												(int)( this.getLocation()[1] + panningManager.getOffset()[1]));
		}
	}
	
	/**
	 * Sets the mode.
	 *
	 * @param action the new mode
	 */
	public void setMode(String action){
		if(combatMembersManager.getCurrentAi() != null){
			this.setVisible(true);
			
			switch(action){
			
			case "Move":
				this.setColour(Color.blue);
				this.setText("Move");
				// for some reason only move is out of location for x?
				this.setLocation(combatMembersManager.getCurrentAi().getMoveLocation()[0] - BOX_MARGIN, 
								 combatMembersManager.getCurrentAi().getMoveLocation()[1] - 35);
			break;
			
			case AiCombatActions.AIMING:
				if(combatMembersManager.getCurrentAi().getSwing() > 0) {
					this.setColour(Color.orange);
					this.setText("Aim - Click to Shoot");
					this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
									 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
				}
				else {
					this.setColour(Color.orange.darker());
					this.setText("Aim");
					this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
									 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
				}
			break;
			
			case AiCombatActions.SHOOTING:
				this.setColour(Color.red.darker());
				this.setText("Shoot");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
							     aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.WELD_TOGGLE:
			case AiActions.WELD_OPEN:
			case AiActions.WELD_SHUT:
				this.setColour(Color.green.darker());
				this.setText("Weld " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+ 
				            (Abilities.turnsToDo(Abilities.WELDING, combatMembersManager.getCurrentAi().getSkillLevel(Abilities.WELDING)) + 2));
				
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.THROW_GRENADE:
			case AiActions.THROW_STUN_GRENADE:
				this.setColour(Color.green.darker());
				this.setText("Grenade");
				this.setLocation(combatMembersManager.getCurrentAi().getAbilityLocation()[0], 
								 combatMembersManager.getCurrentAi().getAbilityLocation()[1] - 25);
			break;
			
			case Abilities.XRAY_SCAN:
				this.setColour(Color.green.darker());
				this.setText("Scan");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case Abilities.SCAN_SCIENCE:
				this.setColour(Color.green.darker());
				this.setText("Scanning " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+
							(Abilities.turnsToDo(Abilities.SCAN_SCIENCE, combatMembersManager.getCurrentAi().getSkillLevel(Abilities.SCAN_SCIENCE)) + 2));
				
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case Abilities.HACK:
				this.setColour(Color.green.darker());
				this.setText("Hacking " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+
							(Abilities.turnsToDo(Abilities.HACK, combatMembersManager.getCurrentAi().getSkillLevel(Abilities.SCAN_SCIENCE)) + 2));
				
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case "Stealthed":
				this.setColour(Color.green.darker());
				this.setText("Stealthed");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.LOOT:
				this.setColour(Color.green.darker());
				this.setText("Looting " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+ (Abilities.TURNS_TO_LOOT + 2));
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.BACKSTAB:
				this.setColour(Color.red.darker());
				this.setText("Backstab");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.STUN_TARGET:
				this.setColour(Color.red.darker());
				this.setText("Stun Target");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
						 		 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
			break;
			
			default:
				this.setVisible(false);
			break;
			
			}
			
			if(action.startsWith("Applying:")){
				this.setColour(Color.red.darker());
				this.setText(action.substring(10));
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
				this.setVisible(true);
			}
			
			if(combatMembersManager.getCurrentAi().getStunnedTurns() > 0){
				this.setColour(Color.red.darker());
				this.setText("Stunned " + combatMembersManager.getCurrentAi().getStunnedTurns());
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
				this.setVisible(true);
			}
		}
		else{
			this.setVisible(false);
		}
	}
	
	/**
	 * Update mode.
	 */
	public void updateMode(){
		if(combatMembersManager.getCurrentAi() != null){
			this.setMode(combatMembersManager.getCurrentAi().getAction());
		}
		else{
			this.setVisible(false);
		}
	}

}
