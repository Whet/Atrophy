/*
 * 
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.RecognitionException;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.display.ui.MiniMapLines;
import atrophy.combat.level.Level;
import atrophy.combat.level.LevelIO;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.MapManager.Sector;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.popups.ErrorPopup;

/**
 * The Class MapsMenu.
 */
public class MapsMenu extends Menu {

	private static final int MAX_ITEMS = 10;
	private int page;
	private ArrayList<TextButton> buttons;
	private ArrayList<Text> mapOwners;
	private Sector sector;
	private MiniMapLines miniMapLines;
	private Missions missions;
	
	public MapsMenu(WindowManager windowManager, Missions missions, Squad squad, Sector sector, ItemMarket itemMarket, TechTree techTree, StashManager stashManager){
		super(windowManager, new double[]{820,270});
		page = 0;
		addComponents(squad, missions, itemMarket, techTree, stashManager);
		this.sector = sector;
		this.missions = missions;
		updateText(missions);
	}
	
	private void addComponents(final Squad squad, final Missions missions, final ItemMarket itemMarket, final TechTree techTree, final StashManager stashManager) {
		buttons = new ArrayList<TextButton>(MAX_ITEMS);
		for(int i = 0; i < MAX_ITEMS; i++){
			final int ind = i;
			TextButton tb = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
				
				boolean mapMade;
				
				{
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 41 + 20 * ind);
					this.mapMade = false;
				}
				
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {;
					try {
						
						squad.createWindowLayout(windowManager);
						
						setPriorityMode(false);
						MenuMapInterface.loadLevel(ReadWriter.getRootFile("Maps/" + sector.getMap(ind + (page * MAX_ITEMS))), sector.getOwner(missions, ind + (page * MAX_ITEMS)),
																		  squad, sector.getEngineeringChance(),sector.getMedicalChance(),sector.getWeaponChance(),sector.getScienceChance(), missions, itemMarket, techTree, stashManager, sector.getName());
					} 
					catch (IOException e1) {
						ErrorPopup popup = new ErrorPopup(windowManager, "Could Not Load Map At: " + ReadWriter.HOME_LOCATION + "/Atrophy/Maps/" + sector.getMaps().get(ind + (page * MAX_ITEMS)));
						windowManager.addPopup(MapsMenu.this,popup);
					} catch (RecognitionException e1) {
						e1.printStackTrace();
					}
					return true;
				}
				
				@Override
				public void mI(Point mousePosition) {
					super.mI(mousePosition);

					if(mapMade)
						return;
					
					this.mapMade = true;
					Level currentLevel;
					try {
						currentLevel = LevelIO.loadLevelBlocks(ReadWriter.getRootFile("Maps/" + sector.getMap(ind + (page * MAX_ITEMS))));
					} catch (FileNotFoundException e) {
						e.printStackTrace();
						return;
					} catch (IOException e) {
						e.printStackTrace();
						return;
					} catch (RecognitionException e) {
						e.printStackTrace();
						return;
					}
					
					float scale = 200 / (float)(currentLevel.getSize()[0] - currentLevel.getSize()[1]);
					miniMapLines = new MiniMapLines(scale, currentLevel);
					miniMapLines.setLocation(MapsMenu.this.getLocation()[0] + 400, MapsMenu.this.getLocation()[1] + 60);
				}
				
				@Override
				public void mO(Point mousePosition) {
					super.mO(mousePosition);
					this.mapMade = false;
				}
			};
			
			this.addDisplayItem(tb);
			this.addMouseActionItem(tb);
			buttons.add(tb);
		}
		
		mapOwners = new ArrayList<Text>();
		for(int i = 0; i < MAX_ITEMS; i++){
			final int ind = i;
			Text owner = new Text((int)this.getLocation()[0] + 211, (int)this.getLocation()[1] + 41 + 20 * ind);
			
			this.addDisplayItem(owner);
			this.mapOwners.add(owner);
		}
		
		TextButton previous = new TextButton(Color.yellow,Color.red) {
			
			{
				this.setText("Next");
				this.setLocation((int)this.getLocation()[0] + 100, (int)this.getLocation()[1] + 250);
				this.setDrawBox(false);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				changePage(1);
				return true;
			}
		};
		this.addDisplayItem(previous);
		this.addMouseActionItem(previous);
		
		TextButton next = new TextButton(Color.yellow,Color.red) {
			
			{
				this.setText("Previous");
				this.setLocation((int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 250);
				this.setDrawBox(false);
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
	
	private void changePage(int change){
		if(change == -1 && page == 0){
			page = (int)Math.ceil(sector.getMaps().size() / MAX_ITEMS);
		}
		else if(change == 1 && page == (int)Math.ceil(sector.getMaps().size() / MAX_ITEMS)){
			page = 0;
		}
		else{
			page += change;
		}
		updateText(missions);
	}


	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
		
		if(!drawLess)
			drawContents(drawShape);
	}
	
	protected void drawContents(Graphics2D drawShape) {
//		drawTitle(drawShape);
		drawComponents(drawShape);
		if(miniMapLines != null)
			miniMapLines.drawMethod(drawShape);
	}

	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString(this.sector.getName() + "  Page " + page, (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	private void drawComponents(@SuppressWarnings("unused") Graphics2D drawShape) {
	}
	
	@Override
	public void mI(Point mousePosition) {
		super.mI(mousePosition);
	}
	
	@Override
	public void mO(Point mousePosition) {
		updateText(missions);
		super.mO(mousePosition);
	}
	
	private void updateText(Missions missions) {
		for(int i = 0; i < buttons.size(); i++){
			
			String name = sector.getMap(i + (page * MAX_ITEMS));
			
			// remove .txt
			if(!name.isEmpty())
				buttons.get(i).setText(name.substring(0, name.length() - 4));
			else
				buttons.get(i).setText("");
			
			mapOwners.get(i).setText(sector.getOwner(missions, i + (page * MAX_ITEMS)));
			
			if(sector.getOwner(missions, i + (page * MAX_ITEMS)).equals(AiGenerator.BANDITS)){
				mapOwners.get(i).setColour(Color.red.darker());
			}
			else if(sector.getOwner(missions, i + (page * MAX_ITEMS)).equals(AiGenerator.WHITE_VISTA)){
				mapOwners.get(i).setColour(Color.white);
			}
			else{
				mapOwners.get(i).setColour(Color.gray);
			}
		}
	}
	
	@Override
	public void move(double x, double y) {
		super.move(x, y);
		
		if(miniMapLines!= null)
			miniMapLines.move(x, y);
	}

	@Override
	public String[] getMenuInfo() {
		return new String[]{"MapsMenu",this.sector.getName()};
	}


}
