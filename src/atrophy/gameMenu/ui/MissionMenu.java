package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Missions.Mission;

public class MissionMenu extends Menu {

	private Mission mission;
	private Text textBoxes[];
	private Missions missions;
	
	public MissionMenu(WindowManager windowManager, Missions missions, StashManager stashManager, int index){
		super(windowManager, new double[]{400,240});
		this.mission = missions.getMission(index);
		this.missions = missions;
		addComponents(stashManager);
		updateText();
	}

	private void addComponents(final StashManager stashManager) {
		
		textBoxes = new Text[4];
		
		Text missionOwner = new Text((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 45, mission.getName());
		this.addDisplayItem(missionOwner);
		textBoxes[0] = missionOwner;
		
		Text missionDescription = new Text((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 72, mission.getDescription());
		this.addDisplayItem(missionDescription);
		textBoxes[1] = missionDescription;
		
		TextButton handin = new TextButton(Color.green, Color.green.darker()){
			
			{
				this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 228);
				this.setText("Complete");
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				if(mission.interact()){
					MissionMenu.this.setVisible(false);
					windowManager.removeItem(MissionMenu.this);
					windowManager.updateWindows();
					stashManager.removeSelectedItem();
					setPriorityMode(false);
					missions.updatePlannersKeepNews();
					missions.updateMissions();
				}
				
				updateText();
				
				return true;
			}
			
		};
		this.addDisplayItem(handin);
		this.addMouseActionItem(handin);
		textBoxes[3] = handin;
	}
	
	@Override
	public void mI(Point mousePosition) {
		super.mI(mousePosition);
	}
	
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

	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString(mission.getName() + "  Time Left: " + mission.getTimeToLive(), (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	private void updateText() {
		textBoxes[1].setText(mission.getDescription());
	}
	
	@Override
	public void updateInformation() {
		updateText();
	}
	
	@Override
	public String[] getMenuInfo() {
		return new String[]{"MissionMenu"};
	}

}
