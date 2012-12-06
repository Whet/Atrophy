/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.gubbinz.GraphicsFunctions;
import atrophy.combat.ai.AiGenerator;
import atrophy.gameMenu.saveFile.MissionGiver;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Missions.Mission;

/**
 * The Class MissionMenu.
 */
public class MissionMenu extends Menu {

	/**
	 * The mission.
	 */
	private Mission mission;
	
	/**
	 * The giver.
	 */
	private MissionGiver giver;
	
	/**
	 * The index.
	 */
	private int index;
	
	/**
	 * The text boxes.
	 */
	private Text textBoxes[];
	
	/**
	 * Instantiates a new mission menu.
	 *
	 * @param index the index
	 */
	public MissionMenu(int index){
		super(new double[]{400,240});
		this.index = index;
		this.mission = Missions.getInstance().getMission(index);
		this.giver = Missions.getInstance().getGiver(mission);
		addComponents();
	}

	/**
	 * Adds the components.
	 */
	private void addComponents() {
		
		textBoxes = new Text[4];
		
		Text missionOwner = new Text("", (int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 45, mission.getName());
		this.addDisplayItem(missionOwner);
		textBoxes[0] = missionOwner;
		
		Text missionDescription = new Text("", (int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 72, mission.getDescription());
		this.addDisplayItem(missionDescription);
		textBoxes[1] = missionDescription;
		
		TextButton handin = new TextButton("", Color.green, Color.green.darker()){
			
			{
				this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 228);
				this.setText("Complete");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				if(Missions.getInstance().interactMission(index)){
					MissionMenu.this.setVisible(false);
					WindowManager.getInstance().removeItem(MissionMenu.this);
					WindowManager.getInstance().updateWindows();
					StashManager.getInstance().removeSelectedItem();
					setPriorityMode(false);
				}
				
				return true;
			}
			
		};
		this.addDisplayItem(handin);
		this.addMouseActionItem(handin);
		textBoxes[3] = handin;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#mI(java.awt.Point)
	 */
	@Override
	public void mI(Point mousePosition) {
		super.mI(mousePosition);
		updateText();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition) {
		updateText();
		super.mO(mousePosition);
	}

	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
	}

	/**
	 * Draw title.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString(mission.getName(), (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	/**
	 * Update text.
	 */
	private void updateText() {
//		textBoxes[0].setText(mission.getName());
		textBoxes[0].setText(this.giver.getName() + " - " + this.giver.getFaction());
		
		switch(this.giver.getFaction()){
			case AiGenerator.WHITE_VISTA:
				textBoxes[0].setColour(Color.white);
			break;
			case AiGenerator.BANDITS:
				textBoxes[0].setColour(Color.red);
			break;
			case AiGenerator.LONER:
				textBoxes[0].setColour(Color.gray);
			break;
		}
		
		textBoxes[1].setText(mission.getDescription());
	}
	
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#updateInformation()
	 */
	@Override
	public void updateInformation() {
		if(Missions.getInstance().getMissionCount() < this.index + 1){
			this.index = 0;
		}
		this.mission = Missions.getInstance().getMission(index);
		this.giver = Missions.getInstance().getGiver(mission);
		updateText();
	}

}
