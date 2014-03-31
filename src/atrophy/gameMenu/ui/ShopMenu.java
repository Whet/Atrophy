package atrophy.gameMenu.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.gameMenu.ui.popups.ShopBuyPopup;

public class ShopMenu extends Menu{

	private static final int MAX_ITEMS = 10;
	
	private int page;
	
	private ArrayList<TextButton> buttons;
	
	private ShopManager shopManager;
	private StashManager stashManager;
	
	public ShopMenu(WindowManager windowManager, ShopManager shopManager, StashManager stashManager){
		super(windowManager, new double[]{280,270});
		page = 0;
		addComponents();
		this.shopManager = shopManager;
		this.stashManager = stashManager;
		updateText();
	}
	
	private void addComponents() {
		buttons = new ArrayList<TextButton>(MAX_ITEMS);
		for(int i = 0; i < MAX_ITEMS; i++){
			final int ind = i;
			TextButton tb = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
				
				private int index;
				
				{
					index = ind;
					this.setLocation((int)this.getLocation()[0] + 11, (int)this.getLocation()[1] + 41 + 20 * ind);
				}
				
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					if(!this.getText().equals("Empty")) {
						windowManager.addPopup(null, new ShopBuyPopup(windowManager, shopManager, shopManager.getItemName(page * MAX_ITEMS + index), page * MAX_ITEMS + index));
//						shopManager.buyItem(page * MAX_ITEMS + index);
					}
					ShopMenu.this.updateText();
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
			page = (int)Math.ceil(shopManager.getItemCount() / MAX_ITEMS);
		}
		else if(change == 1 && page == (int)Math.ceil(shopManager.getItemCount() / MAX_ITEMS)){
			page = 0;
		}
		else{
			page += change;
		}
		this.updateText();
	}


	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
		
		drawTitle(drawShape);
	}
	
	private void drawTitle(Graphics2D drawShape) {
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.setColor(Color.white);
		drawShape.drawString("Shop   Page " + page, (int)this.getLocation()[0] + 20, (int)this.getLocation()[1] + 21);
	}
	
	@Override
	public boolean mD(Point mousePosition, MouseEvent e){
		if(stashManager.transferItem(this)){
			SoundBoard.getInstance().playEffect("invExchange");
			return true;
		}
		return super.mD(mousePosition, e);
	}
	
	@Override
	public void mI(Point mousePosition) {
		super.mI(mousePosition);
//		updateText();
	}
	
	@Override
	public void mO(Point mousePosition) {
		updateText();
		super.mO(mousePosition);
	}
	
	private void updateText() {
		for(int i = 0; i < buttons.size(); i++){
			buttons.get(i).setText(shopManager.getItem(i + (page * MAX_ITEMS)));
		}
	}

	@Override
	public String[] getMenuInfo() {
		return new String[]{"ShopMenu"};
	}
	
}
