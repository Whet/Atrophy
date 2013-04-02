/*
 * 
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.sounds.SoundBoard;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager;
import atrophy.gameMenu.saveFile.MapManager.Sector;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;

/**
 * The Class SectorsMenu.
 */
public class SectorsMenu extends Menu{

	private List<TextButton> buttons;
	
	private MapManager mapWar;
	
	/**
	 * Instantiates a new sectors menu.
	 * @param techTree 
	 * @param stashManager 
	 */
	public SectorsMenu(MapManager mapWar, WindowManager windowManager, Missions missions, Squad squad, ItemMarket itemMarket, TechTree techTree, StashManager stashManager) {
		super(windowManager, new double[]{180, 40 + mapWar.getSectorCount() * 20});
		this.mapWar = mapWar;
		addComponents(squad, missions, itemMarket, techTree, stashManager);
		updateText();
	}

	/**
	 * Adds the components.
	 */
	private void addComponents(final Squad squad, final Missions missions, final ItemMarket itemMarket, final TechTree techTree, final StashManager stashManager) {
		buttons = new ArrayList<TextButton>();
		for(int i = 0; i < mapWar.getSectorCount(); i++){
			final int ind = i;
			TextButton tb = new TextButton(Color.yellow, Color.red) {
				
				{
					this.setText(mapWar.getSector(ind).getName());
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 41 + 20 * ind);
				}
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					MapsMenu menu = new MapsMenu(windowManager, missions, squad, mapWar.getSector(ind), itemMarket, techTree, stashManager);
					windowManager.addWindow(menu);
					SoundBoard.getInstance().playEffect("tick");
					return true;
				}
				
			};
			
			this.addDisplayItem(tb);
			this.addMouseActionItem(tb);
			buttons.add(tb);
		}
		
	}

	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#drawMethod(java.awt.Graphics2D)
	 */
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
		drawShape.drawString("Ship Sectors", (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	@Override
	public void mI(Point mousePosition) {
		super.mI(mousePosition);
//		updateText();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#mO(java.awt.Point)
	 */
	@Override
	public void mO(Point mousePosition) {
		super.mO(mousePosition);
		updateText();
	}
	
	/**
	 * Update text.
	 */
	private void updateText() {
		for(int i = 0; i < buttons.size(); i++){
			
			Sector sector = mapWar.getSector(i);
			String name = sector.getName();
			
			// remove .txt
			if(!name.isEmpty() && sector.getUnlockedMapCount() > 0)
				buttons.get(i).setText(name);
			else
				buttons.get(i).setText("");
		}
	}
	
}
