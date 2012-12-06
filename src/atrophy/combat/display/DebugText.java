/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display;

import java.awt.Graphics2D;

import watoydoEngine.designObjects.display.Text;

// TODO: Auto-generated Javadoc
/**
 * The Class DebugText.
 */
public class DebugText extends Text {
	
	// Singleton code
	/**
	 * The instance.
	 */
	private static DebugText instance;
		
	// returns instance
	/**
	 * Gets the single instance of DebugText.
	 *
	 * @return single instance of DebugText
	 */
	public static DebugText getInstance(){
		if(instance == null){
			instance = new DebugText();
		}
		return instance;
	}
	
	
	/**
	 * Instantiates a new debug text.
	 */
	//private Long paintTime;
	
	/**
	 * Instantiates a new debug text.
	 */
	private DebugText(){
		super("DebugText",50,120);
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Text#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape){
		//writeDebug();
		pointInText = 0;
		lineY = this.getLocation()[1];
		drawShape.setColor(this.getColour());
		while(pointInText < this.getText().length()){
			drawShape.drawString(computeLines(),(int) this.getLocation()[0],(int) lineY);
		}
	}
	
	/**
	 * Sets the paint time.
	 *
	 * @param paintTime the new paint time
	 *//*
	private void writeDebug(){
		this.setText("DEBUG@n"+
					 "Paint Time: "+ paintTime+" mil@n"+
					 "Ai in: "+CombatMembersManager.getInstance().getCurrentAi().getLevelBlock()+"@n"+
					 "Ai heading to point: "+ CombatMembersManager.getInstance().getCurrentAi().getMoveLocation()[0] +", "+
					CombatMembersManager.getInstance().getCurrentAi().getMoveLocation()[1]+
					"@nPoint in room"+LevelManager.getInstance().getBlock(CombatMembersManager.getInstance().getCurrentAi().getMoveLocation()));
	}*/
	
	
	/**
	 * Sets the paint time.
	 *
	 * @param paintTime the new paint time
	 */
	public void setPaintTime(long paintTime){
		//this.paintTime = paintTime;
	}
}
