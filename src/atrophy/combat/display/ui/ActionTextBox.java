package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.fonts.FontList;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.AiActions;
import atrophy.combat.ai.AiCombatActions;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.mechanics.Abilities;

public class ActionTextBox extends Text{
	
	private static final int BOX_MARGIN = 10;

	private static final Color MOVE_COLOUR = 		new Color(11, 119, 195);
	private static final Color AIM_COLOUR_SHOOT = 	new Color(233, 95, 62);
	private static final Color AIM_COLOUR = 		new Color(188, 113, 62);
	private static final Color SHOOT_COLOUR = 		new Color(232, 22, 0);
	private static final Color ACTION_COLOUR = 		new Color(56, 134, 64);
	private static final Color APPLYING_COLOUR = 	new Color(208, 142, 219);
	private static final Color STUNNED_COLOUR = 	new Color(109, 112, 106);
	private static final Color TEXT_COLOUR = 		Color.white;
	
	private FontMetrics metrics;
	
	private PanningManager panningManager;
	private AiCrowd aiCrowd;
	private CombatMembersManager combatMembersManager;
	
	public ActionTextBox(PanningManager panningManager, AiCrowd aiCrowd, CombatMembersManager combatMembersManager) {
		this.setFont(FontList.AUD14);
		this.panningManager = panningManager;
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
	}
	
	@Override
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
		
		drawShape.setColor(this.getColour().darker());
		
		drawShape.drawRect((int) (this.getLocation()[0] + panningManager.getOffset()[0] - 
		                		 (metrics.getStringBounds(this.getText(), drawShape).getWidth() * 0.5)),
						   (int) (this.getLocation()[1] - 15 + panningManager.getOffset()[1]),
						   
						   (int) (metrics.getStringBounds(this.getText(), drawShape).getWidth()) + BOX_MARGIN * 2,
						   20);
		
		// Draw text
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(TEXT_COLOUR);
		pointInText = 0;
		while(pointInText < this.getText().length()){
			drawShape.drawString(computeLines(),(int)(this.getLocation()[0] + BOX_MARGIN + panningManager.getOffset()[0] - 
													 (metrics.getStringBounds(this.getText(), drawShape).getWidth() * 0.5)),
													 
												(int)( this.getLocation()[1] + panningManager.getOffset()[1]));
		}
	}
	
	public void setMode(String action){
		if(combatMembersManager.getCurrentAi() != null){
			this.setVisible(true);
			
			switch(action){
			
			case "Move":
				this.setColour(MOVE_COLOUR);
				this.setText("Move");
				// for some reason only move is out of location for x?
				this.setLocation(combatMembersManager.getCurrentAi().getMoveLocation()[0] - BOX_MARGIN, 
								 combatMembersManager.getCurrentAi().getMoveLocation()[1] - 35);
			break;
			
			case AiCombatActions.AIMING:
				if(combatMembersManager.getCurrentAi().getSwing() > 0) {
					this.setColour(AIM_COLOUR_SHOOT);
					this.setText("Aim - Click to Shoot");
					this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
									 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
				}
				else {
					this.setColour(AIM_COLOUR);
					this.setText("Aim");
					this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
									 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
				}
			break;
			
			case AiCombatActions.SHOOTING:
				this.setColour(SHOOT_COLOUR);
				this.setText("Shoot");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
							     aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.WELD_TOGGLE:
			case AiActions.WELD_OPEN:
			case AiActions.WELD_SHUT:
				this.setColour(ACTION_COLOUR);
				this.setText("Weld " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+ 
				            (Abilities.turnsToDo(Abilities.WELDING, combatMembersManager.getCurrentAi().getSkillLevel(Abilities.WELDING)) + 2));
				
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.THROW_GRENADE:
			case AiActions.THROW_STUN_GRENADE:
				this.setColour(ACTION_COLOUR);
				this.setText("Grenade");
				this.setLocation(combatMembersManager.getCurrentAi().getAbilityLocation()[0], 
								 combatMembersManager.getCurrentAi().getAbilityLocation()[1] - 25);
			break;
			
			case Abilities.XRAY_SCAN:
				this.setColour(ACTION_COLOUR);
				this.setText("Scan");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case Abilities.SCAN_SCIENCE:
				this.setColour(ACTION_COLOUR);
				this.setText("Scanning " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+
							(Abilities.turnsToDo(Abilities.SCAN_SCIENCE, combatMembersManager.getCurrentAi().getSkillLevel(Abilities.SCAN_SCIENCE)) + 2));
				
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case Abilities.HACK:
				this.setColour(ACTION_COLOUR);
				this.setText("Hacking " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+
							(Abilities.turnsToDo(Abilities.HACK, combatMembersManager.getCurrentAi().getSkillLevel(Abilities.SCAN_SCIENCE)) + 2));
				
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case "Stealthed":
				this.setColour(ACTION_COLOUR);
				this.setText("Stealthed");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.LOOT:
				this.setColour(ACTION_COLOUR);
				this.setText("Looting " + combatMembersManager.getCurrentAi().getActionTurns() +"/"+ (Abilities.TURNS_TO_LOOT + 2));
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.BACKSTAB:
				this.setColour(SHOOT_COLOUR);
				this.setText("Backstab");
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
			break;
			
			case AiActions.STUN_TARGET:
				this.setColour(SHOOT_COLOUR);
				this.setText("Stun Target");
				if(combatMembersManager.getCurrentAi().getTargetAi() != null)
					this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[0], 
							 		 aiCrowd.getActorMask(combatMembersManager.getCurrentAi().getTargetAi()).getLocation()[1] - 25);
			break;
			
			default:
				this.setVisible(false);
			break;
			
			}
			
			if(action.startsWith("Applying:")){
				this.setColour(APPLYING_COLOUR);
				this.setText(action.substring(10));
				this.setLocation(aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[0], 
								 aiCrowd.getActorMask(combatMembersManager.getCurrentAi()).getLocation()[1] - 25);
				this.setVisible(true);
			}
			
			if(combatMembersManager.getCurrentAi().getStunnedTurns() > 0){
				this.setColour(STUNNED_COLOUR);
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
	
	public void updateMode(){
		if(combatMembersManager.getCurrentAi() != null){
			this.setMode(combatMembersManager.getCurrentAi().getAction());
		}
		else{
			this.setVisible(false);
		}
	}

}
