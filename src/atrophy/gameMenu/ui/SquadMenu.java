package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.fonts.FontList;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.Faction;
import atrophy.combat.ai.MuleAi;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.UnarmedWeapon;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.saveFile.TechTree;

public class SquadMenu extends Menu{

	protected static final int MAX_SQUAD_COUNT = 3;
	
	private Squad squad;
	private ShopManager shopManager;
	private StashManager stashManager;
	private TechTree techTree;
	
	public SquadMenu(WindowManager windowManager, ShopManager shopManager, StashManager stashManager, Squad squad, TechTree techTree){
		super(windowManager, new double[]{300,240});
		
		this.squad = squad;
		this.shopManager = shopManager;
		this.stashManager = stashManager;
		this.techTree = techTree;
		
		createSquadComponents(shopManager, stashManager);
		updateInformation();
	}

	private void createSquadComponents(final ShopManager shopManager, final StashManager stashManager) {
		final int[] windowLocation = new int[]{(int) (this.getLocation()[0]),(int) (this.getLocation()[1])};
		final int spacing = 20;
		
		TextButton stashOpen = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			{
				this.setText("Open Stash");
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 40);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				StashMenu menu = new StashMenu(windowManager, stashManager);
				windowManager.addWindow(SquadMenu.this, menu);
				SoundBoard.getInstance().playEffect("invOpen");
				return true;
			}
		};
		this.addDisplayItem(stashOpen);
		this.addMouseActionItem(stashOpen);
		
		TextButton openShop = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
			{
				this.setText("Open Shop");
				this.setLocation(windowLocation[0] + 21, windowLocation[1] + 60);
			}
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				ShopMenu menu = new ShopMenu(windowManager, shopManager, stashManager);
				windowManager.addWindow(SquadMenu.this, menu);
				SoundBoard.getInstance().playEffect("invOpen");
				return true;
			}
		};
		this.addDisplayItem(openShop);
		this.addMouseActionItem(openShop);
		
		TextButton buySquaddie = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
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
		
		if(techTree.isResearched(TechTree.MULE, Faction.LONER)){
		
			TextButton buyMule = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
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
		
		}
		
		Text squadListTag = new Text(windowLocation[0] + 21, windowLocation[1] + 121, "Squad Members (" + squad.getSquadCount() + "/" + MAX_SQUAD_COUNT + ")");
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
					squaddieName = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
						
						private int squadIndex = index;
						
						{
							this.setText(squad.getSquad().get(squadIndex).getName());
							this.setLocation(windowLocation[0] + 21, windowLocation[1] + 140 + index * spacing);
							
						}
						
						@Override
						public boolean mD(Point mousePosition, MouseEvent e) {
							SquadMemberMenu menu = new SquadMemberMenu(windowManager, squad, stashManager, index);
							windowManager.addWindow(SquadMenu.this, menu);
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
	
	@Override
	public void updateInformation() {
		this.getDisplayList().clear();
		this.getMouseActionList().clear();
		
		this.createSquadComponents(shopManager, stashManager);
	}
	
	@Override
	public String[] getMenuInfo() {
		return new String[]{"SquadMenu"};
	}
	
}
