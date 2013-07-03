package atrophy.combat.display.ui.loot;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.actions.ActionRegion;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.sounds.SoundBoard;
import watoydoEngine.utils.GraphicsFunctions;
import atrophy.combat.CombatUiManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.CartographerBox;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.items.ArmourPlates1;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.EngineeringSupply;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Harpoon1;
import atrophy.combat.items.Harpoon2;
import atrophy.combat.items.Inventory;
import atrophy.combat.items.Item;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MedicalSupply;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.MeleeWeapon1;
import atrophy.combat.items.MeleeWeapon2;
import atrophy.combat.items.Pistol1;
import atrophy.combat.items.Pistol2;
import atrophy.combat.items.Pistol3;
import atrophy.combat.items.Pistol4;
import atrophy.combat.items.Plasma1;
import atrophy.combat.items.Plasma2;
import atrophy.combat.items.Railgun;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.ScienceSupply;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.Shotgun1;
import atrophy.combat.items.SpeedBooster;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.UnarmedWeapon;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.items.Weapon;
import atrophy.combat.items.WeaponSupply;
import atrophy.combat.items.WeldingTorch;

public class LootBox extends Crowd{
	
	private static final int LOOT_BUTTON_SPACING = 35;
	private static final int LOOTER_X = 10;
	private static final int LOOTER_Y = 10;
	private static final int LOOTED_X = 320;
	private static final int LOOTED_Y = 10;
	
	private ArrayList<LootButton> looterButtons;
	private ArrayList<LootButton> lootedButtons;
	private LootButton[] weaponLootButtons;
	private Lootable[] lootLink;
	private Text[] lootText; 
	private Text skillText;
	private final int [] size= {360,360};
	private int[] dragLocation;
	private Map<String, BufferedImage> images;
	
	private ActionRegion mouseDragRegion;
	private CombatUiManager combatUiManager;
	private MessageBox messageBox;
	private CartographerBox cartographerBox;
	
	public LootBox(CombatUiManager combatUiManager, MessageBox messageBox, CartographerBox cartographerBox){
		super(true);
		
		this.setVisible(false);
		
		this.combatUiManager = combatUiManager;
		this.messageBox = messageBox;
		this.cartographerBox = cartographerBox;
		
		try{
			
			this.setLocation(300, 80);
			
			weaponLootButtons = new LootButton[2];
			
			weaponLootButtons[0] = new LootButton(this, combatUiManager, null,10);
			this.weaponLootButtons[0].setVisible(false);
			
			weaponLootButtons[1] = new LootButton(this, combatUiManager, null,11);
			this.weaponLootButtons[1].setVisible(false);
			
			this.addButton(this.weaponLootButtons[0]);
			this.addButton(this.weaponLootButtons[1]);
			
			lootLink = new Lootable[2];
			lootLink[0] = null;
			lootLink[1] = null;
			
			looterButtons = new ArrayList<LootButton>(5);
			lootedButtons = new ArrayList<LootButton>(5);
			
			LootButton lootButton;
			
			for(int i = 0; i < 5; i++){
				lootButton = new LootButton(this, combatUiManager, null,i);
				lootButton.setVisible(false);
				this.looterButtons.add(lootButton);
				this.addButton(lootButton);
			}
			
			for(int i = 0; i < 5; i++){
				lootButton = new LootButton(this, combatUiManager, null,i + 5);
				lootButton.setVisible(false);
				this.lootedButtons.add(lootButton);
				this.addButton(lootButton);
			}
			
			lootText = new Text[2];
			lootText[0] = new Text();
			lootText[1] = new Text();
			
			skillText = new Text();
			this.addDisplayItem(skillText);
			
			lootText[0].setColour(Color.yellow.darker());
			lootText[1].setColour(Color.yellow.darker());
			
			this.addDisplayItem(lootText[0]);
			this.addDisplayItem(lootText[1]);
			
			images = new HashMap<>();
			
			// load banked images
			String[] files = {"images/atrophy/combat/ui/weldTorch.png",
							  "images/atrophy/combat/ui/sensorSuite.png",
							  "images/atrophy/combat/ui/sensorSuite.png",
							  "images/atrophy/combat/ui/sensorSuite.png",
							  "images/atrophy/combat/ui/stealthModule.png",
							  "images/atrophy/combat/ui/stealthModule.png",
							  "images/atrophy/combat/ui/throwGrenade.png",
							  "images/atrophy/combat/ui/throwStunGrenade.png",
							  "images/atrophy/combat/ui/speedBooster.png",
							  "images/atrophy/combat/ui/armour1.png",
							  "images/atrophy/combat/ui/armour2.png",
							  "images/atrophy/combat/ui/engineeringSupply.png",
							  "images/atrophy/combat/ui/scienceSupply.png",
							  "images/atrophy/combat/ui/medicalSupply.png",
							  "images/atrophy/combat/ui/weaponSupply.png",
							  "images/atrophy/combat/items/harpoon1.png",
							  "images/atrophy/combat/items/harpoon2.png",
							  "images/atrophy/combat/items/pistol1.png",
							  "images/atrophy/combat/items/pistol2.png",
							  "images/atrophy/combat/items/pistol3.png",
							  "images/atrophy/combat/items/pistol4.png",
							  "images/atrophy/combat/items/shotgun.png",
							  "images/atrophy/combat/items/plasma1.png",
							  "images/atrophy/combat/items/plasma2.png",
							  "images/atrophy/combat/items/junkWeapon.png",
							  "images/atrophy/combat/items/shank.png",
							  "images/atrophy/combat/items/railgun.png",
							  };
			BufferedImage img;
			
			String[] names = {WeldingTorch.getInstance().getName(),ScienceScanner.getInstance().getName(),UnitDetector.getInstance().getName(),
							  SensorSuite.getInstance().getName(),
							  LightStealthField.getInstance().getName(),MediumStealthField.getInstance().getName(),
							  GrenadeItem.getInstance().getName(), StunGrenadeItem.getInstance().getName(),
							  SpeedBooster.getInstance().getName(),
							  ArmourPlates1.getInstance().getName(), ArmourPlates2.getInstance().getName(),
							  EngineeringSupply.NAME, ScienceSupply.NAME, MedicalSupply.NAME, WeaponSupply.NAME,
							  Harpoon1.NAME, Harpoon2.NAME,
							  Pistol1.NAME, Pistol2.NAME, Pistol3.NAME, Pistol4.NAME,
							  Shotgun1.NAME, Plasma1.NAME, Plasma2.NAME, MeleeWeapon1.NAME, MeleeWeapon2.NAME,
							  Railgun.NAME};
		
			// Add all items to the image bank
			for(int i = 0; i < files.length; i++){
				img = ImageIO.read(ReadWriter.getResourceAsInputStream(files[i]));
				images.put(names[i],img);
			}
			
			images.put(UnarmedWeapon.NAME, new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
			
		}
		catch(IOException ioExcept){
			System.err.println("Could not load LootBox image. Terminating.");
			System.exit(-1);
		}
		
		mouseDragRegion = new ActionRegion(this.getLocation()[0], this.getLocation()[1], size[0], size[1]) {
			
			private boolean mouseDown = false;
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				mouseDown = true;
				for(int i = 0; i < looterButtons.size(); i++){
					looterButtons.get(i).setVisible(false);
				}
				for(int i = 0; i < lootedButtons.size(); i++){
					lootedButtons.get(i).setVisible(false);
				}
				for(int i = 0; i < weaponLootButtons.length; i++){
					weaponLootButtons[i].setVisible(false);
				}
				for(int i = 0; i < lootText.length; i++){
					lootText[i].setVisible(false);
				}
				skillText.setVisible(false);
				dragLocation = new int[]{e.getPoint().x - (int)this.getLocation()[0], e.getPoint().y - (int)this.getLocation()[1]};
				return true;
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				mouseDown = false;
				updateLocations();
				return true;
			}

			@Override
			public void mI(Point mousePosition) {
				if(mouseDown){
					this.setLocation(mousePosition.x - dragLocation[0], mousePosition.y - dragLocation[1]);
					this.setLocation(mousePosition.x - dragLocation[0], mousePosition.y - dragLocation[1]);
				}
			}
			
			@Override
			public void mO(Point mousePosition) {
				if(mouseDown){
					mouseDown = false;
					updateLocations();
				}
			}
		};
		this.addMouseActionItem(mouseDragRegion);
		mouseDragRegion.setActive(false);
		
		this.computeZOrder();
		
		this.updateLocations();
	}
	
	private void updateLocations() {
		for(int i = 0; i < looterButtons.size(); i++){
			looterButtons.get(i).setLocation(this.getLocation()[0] + LOOTER_X, this.getLocation()[1] + LOOTER_Y + i * LOOT_BUTTON_SPACING);
		}
		for(int i = 0; i < lootedButtons.size(); i++){
			lootedButtons.get(i).setLocation(this.getLocation()[0] + LOOTED_X, this.getLocation()[1] + LOOTED_Y + i * LOOT_BUTTON_SPACING);
		}
		lootText[0].setLocation(this.getLocation()[0] + 50, this.getLocation()[1] + 23);
		lootText[1].setLocation(this.getLocation()[0] + 190, this.getLocation()[1] + 23);
		
		lootText[0].setVisible(true);
		lootText[1].setVisible(true);
		
		skillText.setLocation(this.getLocation()[0] + 50, this.getLocation()[1] + 108);
		
		skillText.setVisible(true);
		
		this.weaponLootButtons[0].setLocation(this.getLocation()[0] + LOOTER_X + 30, this.getLocation()[1] + LOOTER_Y);
		this.weaponLootButtons[1].setLocation(this.getLocation()[0] + LOOTER_X + 170, this.getLocation()[1] + LOOTER_Y);
		
		if(this.lootLink[1] != null && this.lootLink[0] != null){
			this.reloadLootDisplay();
		}
		else if(this.lootLink[0] != null){
			this.reloadInventoryDisplay();
		}
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		drawBackdrop(drawShape);
		super.drawMethod(drawShape);
	}
	
	private void drawBackdrop(Graphics2D drawShape) {
		drawShape.setColor(Color.black);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.8f));
		drawShape.fillRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    size[0],
							    size[1],
							    14,14);
		drawShape.setColor(Color.gray);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.drawRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    size[0],
							    size[1],
							    14,14);
		drawShape.drawRect((int)this.getLocation()[0] + 6,
						   (int)this.getLocation()[1] + 6, 
						   size[0] - 12,
						   size[1] - 12);
	}
	
	public void loadLootDisplay(Lootable looter, Lootable looted){
		loadLootDisplay(looter, looted, true);
	}
	
	public void loadLootDisplay(Lootable looter, Lootable looted, boolean playSound){

		this.closeLootUi(false);
		this.setVisible(true);
		
		// hide abilities and cancel events to stop ai operating while in menu
		hideNonLootUi();
		
		lootLink[0] = looter;
		lootLink[1] = looted;
		
		this.weaponLootButtons[0].setImage(images.get(looter.getWeapon().getName()));
		this.weaponLootButtons[0].setVisible(true);
		
		if(lootLink[1].getWeapon() != null){
			this.weaponLootButtons[1].setImage(images.get(looted.getWeapon().getName()));
			this.weaponLootButtons[1].setVisible(true);
		}
		else{
			this.weaponLootButtons[1].setVisible(false);
		}
		
		for(int i = 0; i < looter.getInventory().getItemCount(); i++){
			looterButtons.get(i).setImage(images.get(looter.getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
			looterButtons.get(i).setLootActive(true);
		}
		
		for(int i = 0; i < looted.getInventory().getItemCount(); i++){
			lootedButtons.get(i).setImage(images.get(looted.getInventory().getItemAt(i).getName()));
			lootedButtons.get(i).setVisible(true);
		}
		
		this.lootText[0].setText(looter.getName());
		this.lootText[1].setText("");
		
		this.lootText[0].setVisible(true);
		this.lootText[1].setVisible(true);
		
		this.loadSkillText();

		if(playSound)
			SoundBoard.getInstance().playEffect("invOpen");
		
	}
	
	private void loadSkillText() {
		this.skillText.setVisible(true);
		
		this.skillText.setText("");
		
		Iterator<String> skillIterator = ((Ai) this.lootLink[0]).getSkills().keySet().iterator();
		
		while(skillIterator.hasNext()){
			String next = skillIterator.next();
			this.skillText.appendText(next + ": " + ((Ai) this.lootLink[0]).getSkillLevel(next) + "@n");
		}
	}

	public void loadInventoryDisplay(Lootable looter, boolean allowModification){
		
		this.closeLootUi(false);
		this.setVisible(true);
		
		// hide abilities and cancel events to stop ai operating while in menu
		hideNonLootUi();
		
		lootLink[0] = looter;
		lootLink[1] = null;
		
		for(int i = 0; i < looter.getInventory().getItemCount(); i++){
			looterButtons.get(i).setImage(images.get(looter.getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
			looterButtons.get(i).setLootActive(allowModification);
		}
		for(LootButton button: this.lootedButtons){
			button.setVisible(false);
		}
		
		this.weaponLootButtons[0].setImage(images.get(looter.getWeapon().getName()));
		this.weaponLootButtons[0].setVisible(true);
		
		this.lootText[0].setText(looter.getName());
		this.lootText[1].setText("");
		
		this.lootText[0].setVisible(true);
		this.lootText[1].setVisible(true);
		
		loadSkillText();
		
		SoundBoard.getInstance().playEffect("invOpen");
	}
	
	public void toggleInventoryDisplay(Lootable looter){
		// menu open, so close
		if(this.lootLink[0] == looter){
			// update abilities
			combatUiManager.updateUi();
			
			this.closeLootUi();
		}
		else{
			this.loadInventoryDisplay(looter, true);
		}
	}
	
	private void reloadLootDisplay(){
		
		this.weaponLootButtons[0].setImage(images.get(this.lootLink[0].getWeapon().getName()));
		
		if(lootLink[1].getWeapon() != null){
			this.weaponLootButtons[1].setImage(images.get(this.lootLink[1].getWeapon().getName()));
		}
		
		// hide all buttons
		for(LootButton button: this.looterButtons){
			button.setVisible(false);
		}
		for(LootButton button: this.lootedButtons){
			button.setVisible(false);
		}
		
		// show proper ones
		for(int i = 0; i < this.lootLink[0].getInventory().getItemCount(); i++){
			looterButtons.get(i).setImage(images.get(this.lootLink[0].getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
		}
		
		for(int i = 0; i < this.lootLink[1].getInventory().getItemCount(); i++){
			lootedButtons.get(i).setImage(images.get(this.lootLink[1].getInventory().getItemAt(i).getName()));
			lootedButtons.get(i).setVisible(true);
		}
		
		this.weaponLootButtons[0].setVisible(true);
		
		if(this.lootLink[1].getWeapon() != null){
			this.weaponLootButtons[1].setVisible(true);
		}

	}
	
	private void reloadInventoryDisplay(){
		
		this.weaponLootButtons[0].setImage(images.get(this.lootLink[0].getWeapon().getName()));
		this.weaponLootButtons[0].setVisible(true);
		this.weaponLootButtons[1].setVisible(false);
		
		// hide all buttons
		for(LootButton button: this.looterButtons){
			button.setVisible(false);
		}
		for(LootButton button: this.lootedButtons){
			button.setVisible(false);
		}
		
		// show proper ones
		for(int i = 0; i < this.lootLink[0].getInventory().getItemCount(); i++){
			looterButtons.get(i).setImage(images.get(this.lootLink[0].getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
		}
		
		this.weaponLootButtons[0].setVisible(true);
	}
	
	private void hideNonLootUi(){
		combatUiManager.getActionsBar().setVisible(false);
		messageBox.setVisible(false);
		cartographerBox.setVisible(false);
	}
	
	public void closeLootUi(){
		closeLootUi(true);
	}
	
	public void closeLootUi(boolean playSound){

		if(playSound)
			SoundBoard.getInstance().playEffect("invClose");
		
		this.lootLink[0] = null;
		this.lootLink[1] = null;
		
		combatUiManager.getActionsBar().setVisible(true);
		
		for(LootButton button: this.looterButtons){
			button.setVisible(false);
		}
		for(LootButton button: this.lootedButtons){
			button.setVisible(false);
		}
		
		this.weaponLootButtons[0].setVisible(false);
		this.weaponLootButtons[1].setVisible(false);
		
		this.lootText[0].setVisible(false);
		this.lootText[1].setVisible(false);
		
		this.setVisible(false);
		
	}

	public void lootInteraction(int code){
		
		synchronized(this){
			if(this.lootLink[0] != null &&
			   this.lootLink[1] != null){
			
				// 0 - 4 are looter buttons, objects left on corpse
				if(code < 5 &&
				   this.lootLink[1].getInventory().getItemCount() < Inventory.MAX_SIZE){
					
					this.lootLink[1].addItem(this.lootLink[0].getInventory().getItemAt(code));
					this.lootLink[0].getInventory().removeItemAt(code);
				}
				// 5 - 9 are looted buttons, objects taken from corpse
				else if(code >= 5 && code < 10 &&
					    this.lootLink[0].getInventory().getItemCount() < Inventory.MAX_SIZE){
					
					this.lootLink[0].addItem(this.lootLink[1].getInventory().getItemAt(code - 5));
					this.lootLink[1].getInventory().removeItemAt(code - 5);
				}
				else if((code  == 10 || code == 11) && this.lootLink[1].getWeapon() != null && this.lootLink[0].getWeapon().canAttack() && this.lootLink[1].getWeapon().canAttack()){
					Weapon exchange = this.lootLink[0].getWeapon();
					this.lootLink[0].setWeapon(this.lootLink[1].getWeapon());
					this.lootLink[1].setWeapon(exchange);
				}
				
				lootLink[0].assignAbilities();
				lootLink[1].assignAbilities();
				
				this.reloadLootDisplay();
				
				SoundBoard.getInstance().playEffect("invExchange");
				
			}
			else{
				// objects the ai owns are destroyed
				if(code < 5){
				
					this.lootLink[0].getInventory().removeItemAt(code);
					this.reloadInventoryDisplay();
					
					lootLink[0].assignAbilities();
					
					SoundBoard.getInstance().playEffect("invExchange");
				}
			}
		}
	}
	
	protected Item getItemAt(int code){
		
		synchronized(this){
			if(code < 5){
				return this.lootLink[0].getInventory().getItemAt(code);
			}
			else if(code < 10){
				return this.lootLink[1].getInventory().getItemAt(code - 5);
			}
			else if(code == 10){
				return this.lootLink[0].getWeapon();
			}
			else{
				return this.lootLink[1].getWeapon();
			}
		}
	}

	public static interface Lootable{
		
		public Weapon getWeapon();
		public void setWeapon(Weapon weapon);
		public Inventory getInventory();
		public void assignAbilities();
		public void addItem(Item item);
		public String getName();
	}

	public void toggleLock() {
		this.mouseDragRegion.setActive(!this.mouseDragRegion.isActive());
	}
	
}
