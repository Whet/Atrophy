/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.io.ReadWriter;
import atrophy.combat.ai.AiGenerator;
import atrophy.gameMenu.saveFile.MapWar.Sector;
import atrophy.gameMenu.ui.popups.ErrorPopup;

/**
 * The Class MapsMenu.
 */
public class MapsMenu extends Menu {

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
	 * The map owners.
	 */
	private ArrayList<Text> mapOwners;
	
	/**
	 * The sector.
	 */
	private Sector sector;
	
	/**
	 * Instantiates a new maps menu.
	 *
	 * @param sector the sector
	 */
	public MapsMenu(Sector sector){
		super(new double[]{380,270});
		page = 0;
		addComponents();
		this.sector = sector;
	}
	
	/**
	 * Adds the components.
	 */
	private void addComponents() {
		buttons = new ArrayList<TextButton>(MAX_ITEMS);
		for(int i = 0; i < MAX_ITEMS; i++){
			final int ind = i;
			TextButton tb = new TextButton("mapsMenu"+ind, Color.yellow, Color.red) {
				
				{
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 41 + 20 * ind);
				}
				
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {;
					try {
						setPriorityMode(false);
						MenuMapInterface.loadLevel(ReadWriter.getRootFile("Maps\\" + sector.getMap(ind + (page * MAX_ITEMS))), sector.getOwner(ind + (page * MAX_ITEMS)),
																		  sector.getEngineeringChance(),sector.getMedicalChance(),sector.getWeaponChance(),sector.getScienceChance());
						SquadMenu.getSquad().resetKills();
					} 
					catch (IOException e1) {
						ErrorPopup popup = new ErrorPopup("Could Not Load Map At: " + System.getProperty("user.home") + "\\Atrophy\\Maps\\" + sector.getMaps()[ind + (page * MAX_ITEMS)]);
						WindowManager.getInstance().addPopup(MapsMenu.this,popup);
					}
					return true;
				}
			};
			
			this.addDisplayItem(tb);
			this.addMouseActionItem(tb);
			buttons.add(tb);
		}
		
		mapOwners = new ArrayList<Text>();
		for(int i = 0; i < MAX_ITEMS; i++){
			final int ind = i;
			Text owner = new Text("", (int)this.getLocation()[0] + 211, (int)this.getLocation()[1] + 41 + 20 * ind);
			
			this.addDisplayItem(owner);
			this.mapOwners.add(owner);
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
			page = (int)Math.ceil(sector.getMaps().length / MAX_ITEMS);
		}
		else if(change == 1 && page == (int)Math.ceil(sector.getMaps().length / MAX_ITEMS)){
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
		drawShape.drawString(this.sector.getName() + "  Page " + page, (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
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
			
			String name = sector.getMap(i + (page * MAX_ITEMS));
			
			// remove .txt
			if(!name.isEmpty())
				buttons.get(i).setText(name.substring(0, name.length() - 4));
			else
				buttons.get(i).setText("");
			
			mapOwners.get(i).setText(sector.getOwner(i + (page * MAX_ITEMS)));
			
			if(sector.getOwner(i + (page * MAX_ITEMS)).equals(AiGenerator.BANDITS)){
				mapOwners.get(i).setColour(Color.red.darker());
			}
			else if(sector.getOwner(i + (page * MAX_ITEMS)).equals(AiGenerator.WHITE_VISTA)){
				mapOwners.get(i).setColour(Color.white);
			}
			else{
				mapOwners.get(i).setColour(Color.gray);
			}
		}
	}

}
