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
	public static Squad squad;
	
	/**
	 * Instantiates a new squad menu.
	 */
	public SquadMenu(){
		super(new double[]{300,460});
		createSquadComponents();
	}

	/**
	 * Creates the squad components.
	 */
	private void createSquadComponents() {
		final int[] windowLocation = new int[]{(int) (this.getLocation()[0]),(int) (this.getLocation()[1])};
		final int spacing = 20;
		
		TextButton stashOpen = new TextButton("Stash", Color.yellow, Color.red) {
			{
				this.setText("Open Stash");
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 40);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				StashMenu menu = new StashMenu();
				WindowManager.getInstance().addWindow(menu);
				SoundBoard.getInstance().playEffect("invOpen");
				return true;
			}
		};
		this.addDisplayItem(stashOpen);
		this.addMouseActionItem(stashOpen);
		
		TextButton openShop = new TextButton("OpenShop", Color.yellow, Color.red) {
			{
				this.setText("Open Shop");
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 60);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ShopMenu menu = new ShopMenu();
				WindowManager.getInstance().addWindow(menu);
				SoundBoard.getInstance().playEffect("invOpen");
				return true;
			}
		};
		this.addDisplayItem(openShop);
		this.addMouseActionItem(openShop);
		
		TextButton buySquaddie = new TextButton("SquadBuy", Color.yellow, Color.red) {
			{
				int BUY_MEMBER_COST = 1400;
				this.setText("Hire Squaddie " + squad.getAdvance() + " / " + BUY_MEMBER_COST);
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 80);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				int BUY_MEMBER_COST = 1400;
				if(squad.getSquadCount() < MAX_SQUAD_COUNT && squad.payAdvance(BUY_MEMBER_COST))
					squad.addSquaddie(new Squaddie(AiGenerator.randomName(), AiGenerator.randomImage(), MeleeWeapon1.NAME, ""));
				
				WindowManager.getInstance().updateWindows();
				return true;
			}
		};
		this.addDisplayItem(buySquaddie);
		this.addMouseActionItem(buySquaddie);
		
//		if(ShopManager.getInstance().getScienceLootLevel() > 1){
		
			TextButton buyMule = new TextButton("MuleBuy", Color.yellow, Color.red) {
				{
					int BUY_MEMBER_COST = 800;
					this.setText("Buy Mule " + squad.getAdvance() + " / " + BUY_MEMBER_COST);
					this.setLocation(windowLocation[0] + 21, windowLocation[1] + 100);
				}
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					int BUY_MEMBER_COST = 800;
					if(squad.getSquadCount() < MAX_SQUAD_COUNT && squad.payAdvance(BUY_MEMBER_COST))
						squad.addSquaddie(new Squaddie(MuleAi.MULE, "Mule", UnarmedWeapon.NAME, MuleAi.MULE));
					
					WindowManager.getInstance().updateWindows();
					return true;
				}
			};
			this.addDisplayItem(buyMule);
			this.addMouseActionItem(buyMule);
		
//		}
		
		Text squadListTag = new Text("title2", windowLocation[0] + 21, windowLocation[1] + 121, "Squad Members");
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
					squaddieName = new TextButton(squad.getSquad().get(i).getName(), Color.yellow, Color.red) {
						
						private int squadIndex = index;
						
						{
							this.setText(squad.getSquad().get(squadIndex).getName());
							this.setLocation(windowLocation[0] + 21, windowLocation[1] + 140 + index * spacing);
							
						}
						
						@Override
						public boolean mD(Point mousePosition, MouseEvent e) {
							SquadMemberMenu menu = new SquadMemberMenu(index);
							WindowManager.getInstance().addWindow(menu);
							SoundBoard.getInstance().playEffect("invOpen");
							return true;
						}
					};
//				}
				this.addDisplayItem(squaddieName);
				this.addMouseActionItem(squaddieName);
			
		}
	}
	
	/**
	 * Gets the squad.
	 *
	 * @return the squad
	 */
	public static Squad getSquad() {
		return squad;
	}

	/**
	 * Sets the squad.
	 *
	 * @param squad2 the new squad
	 */
	public static void setSquad(Squad squad2) {
		
		// update advance for squads returning from missions
		if(squad != null)
			squad2.setAdvance(squad.getAdvance());
		
		squad = squad2;
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
		
		this.createSquadComponents();
	}
	
}
