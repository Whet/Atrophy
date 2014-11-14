package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.ai.Faction;
import atrophy.gameMenu.saveFile.Missions;

public class MissionsMenu extends Menu{

	private static final int MAX_ITEMS = 10;
	private int page;
	private ArrayList<TextButton> buttons;
	private Missions missions;

	public MissionsMenu(WindowManager windowManager, Missions missions, StashManager stashManager) {
		super(windowManager, new double[]{440,270});
		page = 0;
		addComponents(missions, stashManager);
		
		this.missions = missions;
		updateText();
	}
	
	private void addComponents(final Missions missions, final StashManager stashManager) {
		buttons = new ArrayList<TextButton>(MAX_ITEMS);
		for(int i = 0; i < MAX_ITEMS; i++){
			final int ind = i;
			TextButton tb = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
				
				{
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 41 + 20 * ind);
				}
				
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {;
				
					if(!this.getText().isEmpty()){
						windowManager.addWindow(MissionsMenu.this, new MissionMenu(windowManager, missions, stashManager, ind + MAX_ITEMS * page));
						SoundBoard.getInstance().playEffect("tick");
					}
					return true;
				}
			};
			
			this.addDisplayItem(tb);
			this.addMouseActionItem(tb);
			buttons.add(tb);
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
			page = (int)Math.ceil(missions.getMissionCount() / MAX_ITEMS);
		}
		else if(change == 1 && page == (int)Math.ceil(missions.getMissionCount() / MAX_ITEMS)){
			page = 0;
		}
		else{
			page += change;
		}
	}

	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
		
		if(!drawLess)
			drawContents(drawShape);
	}
	
	protected void drawContents(Graphics2D drawShape) {
		drawComponents(drawShape);
	}

	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString("Missions   Page " + page + "   Rep: Bandits ("+ ((double)Math.round(missions.getSquad().getFactionRelation(Faction.BANDITS) * 1000)/ 1000) + ") White Vista (" + ((double)Math.round(missions.getSquad().getFactionRelation(Faction.WHITE_VISTA) * 1000)/ 1000)  + ")", (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	private void drawComponents(@SuppressWarnings("unused") Graphics2D drawShape) {
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
	
	private void updateText() {
		for(int i = 0; i < buttons.size(); i++){
			buttons.get(i).setText(missions.getMissionName(i + (page * MAX_ITEMS)));
		}
	}

	@Override
	public String[] getMenuInfo() {
		return new String[]{"MissionsMenu"};
	}
	
}
