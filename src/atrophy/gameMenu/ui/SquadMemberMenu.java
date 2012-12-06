/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.sounds.SoundBoard;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.ui.popups.SkillPopup;

/**
 * The Class SquadMemberMenu.
 */
public class SquadMemberMenu extends Menu {

	/**
	 * The squad member.
	 */
	private Squaddie squadMember;
	
	/**
	 * The item buttons.
	 */
	private ArrayList<TextButton> itemButtons;
	
	/**
	 * The skill buttons.
	 */
	private Map<TextButton,String> skillButtons;
	
	/**
	 * The index.
	 */
	private int index;
	
	/**
	 * Instantiates a new squad member menu.
	 *
	 * @param index the index
	 */
	public SquadMemberMenu(int index){
		super(new double[]{375,240});
		this.index = index;
		this.squadMember = SquadMenu.getSquad().getSquadMember(index);
		itemButtons = new ArrayList<TextButton>();
		skillButtons = new HashMap<TextButton,String>();
		addComponents();
	}
	
	/**
	 * Adds the components.
	 */
	private void addComponents() {
		addItemButtons();
		addSkillButtons();
	}

	/**
	 * Adds the skill buttons.
	 */
	private void addSkillButtons() {
		Text itemsTag = new Text("", (int)this.getLocation()[0] + 220, (int)this.getLocation()[1] + 41, "Skills");
		this.addDisplayItem(itemsTag);
		
		Iterator<String> skillIt = squadMember.getSkills();
		
		int i = 0;
		
		while(skillIt.hasNext()){
			
			final String skillF = skillIt.next();
			final int ind = i;
			TextButton tb = new TextButton("skill"+skillF, Color.yellow, Color.red) {
				
				{
					this.setLocation((int)this.getLocation()[0] + 220, (int)this.getLocation()[1] + 68 + 20 * ind);
					this.setText(skillF + " - " + squadMember.getSkillLevel(skillF));
				}
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					if(squadMember.getSkillLevel(skillF) < 4 &&
					   SquadMenu.getSquad().getAdvance() >= ShopManager.getInstance().abilityCost(squadMember, skillF)){
						WindowManager.getInstance().addPopup(SquadMemberMenu.this,new SkillPopup(squadMember, skillF));
					}
					
					return true;
				}
			};
			
			this.addDisplayItem(tb);
			this.addMouseActionItem(tb);
			skillButtons.put(tb,skillF);
			i++;
		}
	}

	/**
	 * Adds the item buttons.
	 */
	private void addItemButtons() {
		
		Text itemsTag = new Text("", (int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 51, "Items");
		this.addDisplayItem(itemsTag);
		
		for(int i = 0; i < 5; i++){
			final int ind = i;
			TextButton tb = new TextButton("stashIndex"+ind, Color.yellow, Color.red) {
				
				private int index;
				
				{
					index = ind;
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 68 + 20 * ind);
				}
				
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					
					String item = squadMember.getItem(index);
					if(!item.equals("Empty")){
						StashManager.getInstance().addItem(item);
						squadMember.removeItem(ind);
						SoundBoard.getInstance().playEffect("invExchange");
					}
					this.setText("Empty");
					return true;
				}
			};
			
			this.addDisplayItem(tb);
			this.addMouseActionItem(tb);
			this.itemButtons.add(tb);
		}
		
		Text weaponTag = new Text("",(int)this.getLocation()[0] + 21, (int)this.getLocation()[1] + 201,"Weapon");
		this.addDisplayItem(weaponTag);
		
		TextButton tb = new TextButton("weapon", Color.yellow, Color.red) {
			
			{
				this.setLocation((int)this.getLocation()[0] + 21, (int)this.getLocation()[1] + 220);
			}
			
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				return true;
			}
		};
		
		this.addDisplayItem(tb);
		this.addMouseActionItem(tb);
		this.itemButtons.add(tb);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#mD(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mD(Point mousePosition, MouseEvent e) {
		if(StashManager.getInstance().transferItem(squadMember)){return true;}
		return super.mD(mousePosition, e);
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
		for(int i = 0; i < itemButtons.size() - 1; i++){
			itemButtons.get(i).setText(this.squadMember.getItem(i));
		}
		Iterator<TextButton> buttonIt = this.skillButtons.keySet().iterator();
		
		while(buttonIt.hasNext()){
			TextButton next = buttonIt.next();
			
			next.setText(this.skillButtons.get(next) + " - " + squadMember.getSkillLevel(this.skillButtons.get(next)));
		}
		
		itemButtons.get(itemButtons.size() - 1).setText(this.squadMember.getWeapon());
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
		
	}
	
	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString(squadMember.getName(), (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#updateInformation()
	 */
	@Override
	public void updateInformation() {
		if(SquadMenu.getSquad().getSquad().size() < this.index + 1){
			this.index = 0;
		}
		this.squadMember = SquadMenu.getSquad().getSquadMember(index);
		updateText();
	}

}
