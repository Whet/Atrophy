/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.sounds.SoundBoard;
import atrophy.gameMenu.saveFile.Missions;

/**
 * The Class MissionsMenu.
 */
public class MissionsMenu extends Menu{

	/**
	 * The Constant MAX_ITEMS.
	 */
	private static final int MAX_ITEMS = 10;
	
	/**
	 * The page.
	 */
	private int page;
	
	/**
	 * The buttons.
	 */
	private ArrayList<TextButton> buttons;

	/**
	 * Instantiates a new missions menu.
	 */
	public MissionsMenu() {
		super(new double[]{300,270});
		page = 0;
		addComponents();
	}
	
	/**
	 * Adds the components.
	 */
	private void addComponents() {
		buttons = new ArrayList<TextButton>(MAX_ITEMS);
		for(int i = 0; i < MAX_ITEMS; i++){
			final int ind = i;
			TextButton tb = new TextButton("missionIndex"+ind, Color.yellow, Color.red) {
				
				{
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 41 + 20 * ind);
				}
				
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {;
				
					if(!this.getText().isEmpty()){
						WindowManager.getInstance().addWindow(new MissionMenu(ind + MAX_ITEMS * page));
						SoundBoard.getInstance().playEffect("tick");
					}
					return true;
				}
			};
			
			this.addDisplayItem(tb);
			this.addMouseActionItem(tb);
			buttons.add(tb);
		}
		
		TextButton previous = new TextButton("next",Color.yellow,Color.red) {
			
			{
				this.setText("Next");
				this.setLocation((int)this.getLocation()[0] + 100, (int)this.getLocation()[1] + 250);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				changePage(1);
				return true;
			}
		};
		this.addDisplayItem(previous);
		this.addMouseActionItem(previous);
		
		TextButton next = new TextButton("previous",Color.yellow,Color.red) {
			
			{
				this.setText("Previous");
				this.setLocation((int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 250);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				changePage(-1);
				return true;
			}
		};
		this.addDisplayItem(next);
		this.addMouseActionItem(next);
	}
	
	/**
	 * Change page.
	 *
	 * @param change the change
	 */
	private void changePage(int change){
		if(change == -1 && page == 0){
			page = (int)Math.ceil(Missions.getInstance().getMissionCount() / MAX_ITEMS);
		}
		else if(change == 1 && page == (int)Math.ceil(Missions.getInstance().getMissionCount() / MAX_ITEMS)){
			page = 0;
		}
		else{
			page += change;
		}
	}


	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
		
		if(!drawLess)
			drawContents(drawShape);
	}
	
	/**
	 * Draw contents.
	 *
	 * @param drawShape the draw shape
	 */
	protected void drawContents(Graphics2D drawShape) {
//		drawTitle(drawShape);
		drawComponents(drawShape);
	}

	/**
	 * Draw title.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString("Missions   Page " + page, (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	/**
	 * Draw components.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawComponents(Graphics2D drawShape) {
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
	
	/**
	 * Update text.
	 */
	private void updateText() {
		for(int i = 0; i < buttons.size(); i++){
			buttons.get(i).setText(Missions.getInstance().getGiverShortFaction(Missions.getInstance().getMission(i + (page * MAX_ITEMS))) + "  " +
					               Missions.getInstance().getMissionName(i + (page * MAX_ITEMS)));
		}
	}

	
}
