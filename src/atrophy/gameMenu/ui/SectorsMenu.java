/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
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
import atrophy.gameMenu.saveFile.MapWar;

/**
 * The Class SectorsMenu.
 */
public class SectorsMenu extends Menu{

	private List<TextButton> buttons;
	
	/**
	 * Instantiates a new sectors menu.
	 */
	public SectorsMenu() {
		super(new double[]{180, 40 + MapWar.getInstance().getSectorCount() * 20});
		addComponents();
	}

	/**
	 * Adds the components.
	 */
	private void addComponents() {
		buttons = new ArrayList<TextButton>();
		for(int i = 0; i < MapWar.getInstance().getSectorCount(); i++){
			final int ind = i;
			TextButton tb = new TextButton("shoppeIndex"+ind, Color.yellow, Color.red) {
				
				{
					this.setText(MapWar.getInstance().getSector(ind).getName());
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 41 + 20 * ind);
				}
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					MapsMenu menu = new MapsMenu(MapWar.getInstance().getSector(ind));
					WindowManager.getInstance().addWindow(menu);
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
		
//		if(!drawLess)
//			drawContents(drawShape);
	}
	
	/**
	 * Draw contents.
	 *
	 * @param drawShape the draw shape
	 */
	protected void drawContents(Graphics2D drawShape) {
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
	
	/**
	 * Update text.
	 */
	private void updateText() {
		for(int i = 0; i < buttons.size(); i++){
			
			String name = MapWar.getInstance().getSector(i).getName();
			
			// remove .txt
			if(!name.isEmpty())
				buttons.get(i).setText(name);
			else
				buttons.get(i).setText("");
		}
	}
	
}
