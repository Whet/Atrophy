package atrophy.gameMenu.ui;

import java.util.ArrayList;
import java.util.Random;

import watoydoEngine.fonts.FontList;
import atrophy.combat.ai.Faction;
import atrophy.gameMenu.saveFile.ItemMarket;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

public class ShopManager{

	private static final double SELL_WEAKNESS = 0.6;
	
	private ArrayList<String> items;
	
	private Squad squad;
	private WindowManager windowManager;
	private StashManager stashManager;
	private ItemMarket itemMarket;
	
	public ShopManager(WindowManager windowManager, StashManager stashManager, ItemMarket itemMarket){
		items = new ArrayList<String>();
		
		this.windowManager = windowManager;
		this.stashManager = stashManager;
		this.itemMarket = itemMarket;
	}
	
	public void lazyLoad(Squad squad) {
		this.squad = squad;
	}

	public void sellItem(String selectedItem) {
		squad.payAdvance(-sellCost(selectedItem));
		windowManager.updateWindows();
	}
	
	public int sellCost(String selectedItem){
		return (int)(itemMarket.getItemCost(selectedItem) * SELL_WEAKNESS);
	}
	
	public int buyCost(String selectedItem){
		return itemMarket.getItemCost(selectedItem);
	}
	
	public boolean canAfford(String item) {
		return this.buyCost(item) <= squad.getAdvance();
	}

	public void buyItem(int i) {
		if(squad.payAdvance(this.buyCost(this.items.get(i)))){
			stashManager.addItem(this.items.get(i));
			this.items.remove(i);
		}
		windowManager.updateWindows();
	}

	public String getItem(int i) {
		if(i >= 0 && i < this.items.size())
			return FontList.digitString(5, squad.getAdvance()) + " *" + FontList.digitString(5, this.buyCost(this.items.get(i))) + "   " + this.items.get(i);
		
		return "Empty";
	}
	
	public String getItemName(int i) {
		if(i >= 0 && i < this.items.size())
			return this.items.get(i);
		
		return "Empty";
	}

	public static int abilityCost(Squaddie squadMember, String skill) {
		switch(squadMember.getSkillLevel(skill) + 1){
			case 1:
				return 500;
			case 2:
				return 750;
			case 3:
				return 1200;
			case 4:
				return 2000;
		}
		return 99999;
	}

	public void randomItems() {
		this.items.clear();
		
		int count = new Random().nextInt(20);
		for(int i = 0; i < count; i++){
			
			this.items.add(itemMarket.getRandomMarketItem(this.squad.getFactionRelation(Faction.WHITE_VISTA), this.squad.getFactionRelation(Faction.BANDITS)));
		}
	}

	public int getItemCount() {
		return this.items.size();
	}

	public void randomShopItems() {
		this.randomItems();
	}
	
}
