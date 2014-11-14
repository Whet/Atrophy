package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.ai.Faction;
import atrophy.gameMenu.saveFile.Missions;

public class NewsMenu extends Menu {

	private Missions missions;
	private Text newsTicker;
	
	public NewsMenu(WindowManager windowManager, Missions missions) {
		super(windowManager, new double[]{300, 400});
		this.missions = missions;
		newsTicker = new Text();
		this.addDisplayItem(newsTicker);
		newsTicker.setLocation(this.getLocation()[0] + 4, this.getLocation()[1] + 40);
		newsTicker.setColour(Color.white);
		updateNews();
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
		
	}
	
	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString("News", (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	public void updateNews() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("WHITE VISTA@n");

		sb.append(missions.getPlanner(Faction.WHITE_VISTA).getNews() + "@n@nBANDITS@n");
		
		sb.append(missions.getPlanner(Faction.BANDITS).getNews());
		
		newsTicker.setText(sb.toString());
	}

	@Override
	public String[] getMenuInfo() {
		return new String[]{"NewsMenu"};
	}

}
