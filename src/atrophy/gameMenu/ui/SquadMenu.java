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
import watoydoEngine.fonts.FontList;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.sounds.SoundBoard;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.MuleAi;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.UnarmedWeapon;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

/**
 * The Class SquadMenu.
 */
public class SquadMenu extends Menu{

	protected static final int MAX_SQUAD_COUNT = 3;
	
	/**
	 * The squad.
	 */
	private Squad squad;
	private ShopManager shopManager;
	private StashManager stashManager;
	
	/**
	 * Instantiates a new squad menu.
	 * @param squad 
	 * @param shopManager 
	 */
	public SquadMenu(WindowManager windowManager, ShopManager shopManager, StashManager stashManager, Squad squad){
		super(windowManager, new double[]{300,460});
		
		this.squad = squad;
		this.shopManager = shopManager;
		this.stashManager = stashManager;
		
		createSquadComponents(shopManager, stashManager);
	}

	/**
	 * Creates the squad components.
	 */
	private void createSquadComponents(final ShopManager shopManager, final StashManager stashManager) {
		final int[] windowLocation = new int[]{(int) (this.getLocation()[0]),(int) (this.getLocation()[1])};
		final int spacing = 20;
		
		TextButton stashOpen = new TextButton(Color.yellow, Color.red) {
			{
				this.setText("Open Stash");
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 40);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				StashMenu menu = new StashMenu(windowManager, stashManager);
				windowManager.addWindow(menu);
				SoundBoard.getInstance().playEffect("invOpen");
				return true;
			}
		};
		this.addDisplayItem(stashOpen);
		this.addMouseActionItem(stashOpen);
		
		TextButton openShop = new TextButton(Color.yellow, Color.red) {
			{
				this.setText("Open Shop");
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 60);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ShopMenu menu = new ShopMenu(windowManager, shopManager, stashManager);
				windowManager.addWindow(menu);
				SoundBoard.getInstance().playEffect("invOpen");
				return true;
			}
		};
		this.addDisplayItem(openShop);
		this.addMouseActionItem(openShop);
		
		TextButton buySquaddie = new TextButton(Color.yellow, Color.red) {
			{
				int BUY_MEMBER_COST = 1400;
				this.setText(FontList.digitString(5, squad.getAdvance()) + " *" + FontList.digitString(5, BUY_MEMBER_COST) + "   " + "Hire Squaddie");
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 80);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				int BUY_MEMBER_COST = 1400;
				if(squad.getSquadCount() < MAX_SQUAD_COUNT && squad.payAdvance(BUY_MEMBER_COST))
					squad.addSquaddie(new Squaddie(AiGenerator.randomName(), AiGenerator.randomImage(), MeleeWeapon1.NAME, ""));
				
				windowManager.updateWindows();
				return true;
			}
		};
		this.addDisplayItem(buySquaddie);
		this.addMouseActionItem(buySquaddie);
		
//		if(ShopManager.getInstance().getScienceLootLevel() > 1){
		
			TextButton buyMule = new TextButton(Color.yellow, Color.red) {
				{
					int BUY_MEMBER_COST = 800;
					this.setText(FontList.digitString(5, squad.getAdvance()) + " *" + FontList.digitString(5, BUY_MEMBER_COST) + "   " + "Buy Mule");
					this.setLocation(windowLocation[0] + 21, windowLocation[1] + 100);
				}
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					int BUY_MEMBER_COST = 800;
					if(squad.getSquadCount() < MAX_SQUAD_COUNT && squad.payAdvance(BUY_MEMBER_COST))
						squad.addSquaddie(new Squaddie(MuleAi.MULE, "Mule", UnarmedWeapon.NAME, MuleAi.MULE));
					
					windowManager.updateWindows();
					return true;
				}
			};
			this.addDisplayItem(buyMule);
			this.addMouseActionItem(buyMule);
		
//		}
		
		Text squadListTag = new Text(windowLocation[0] + 21, windowLocation[1] + 121, "Squad Members");
		this.addDisplayItem(squadListTag);
		
		for(int i = 0; i < squad.getSquad().size(); i++){
			
				final int index = i;
				
				TextButton squaddieName = null;
				
//				if(squad.getSquad().get(index).isVehicle()){
//						squaddieName = new TextButton(squad.getSquad().get(i).getName(), Color.gray, Color.gray) {
//						
//						private int squadIndex = index;
//						
//						{
//							this.setText(squad.getSquad().get(squadIndex).getName());
//							this.setLocation(windowLocation[0] + 21, windowLocation[1] + 140 + index * spacing);
//							
//						}
//						
//					};
//				}
//				else{
					squaddieName = new TextButton(Color.yellow, Color.red) {
						
						private int squadIndex = index;
						
						{
							this.setText(squad.getSquad().get(squadIndex).getName());
							this.setLocation(windowLocation[0] + 21, windowLocation[1] + 140 + index * spacing);
							
						}
						
						@Override
						public boolean mD(Point mousePosition, MouseEvent e) {
							SquadMemberMenu menu = new SquadMemberMenu(windowManager, squad, stashManager, index);
							windowManager.addWindow(menu);
							SoundBoard.getInstance().playEffect("invOpen");
							return true;
						}
					};
//				}
				this.addDisplayItem(squaddieName);
				this.addMouseActionItem(squaddieName);
			
		}
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
		
	}
	
	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString("Squad Menu", (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	/* (non-Javadoc)
	 * @see atrophy.gameMenu.ui.Menu#updateInformation()
	 */
	@Override
	public void updateInformation() {
		this.getDisplayList().clear();
		this.getMouseActionList().clear();
		
		this.createSquadComponents(shopManager, stashManager);
	}
	
}
