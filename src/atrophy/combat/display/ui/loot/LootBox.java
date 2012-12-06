/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui.loot;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.actions.ActionRegion;
import watoydoEngine.designObjects.display.BankedImage;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.sounds.SoundBoard;
import atrophy.combat.CombatUiManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.CartographerBox;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.items.ArmourPlates1;
import atrophy.combat.items.ArmourPlates2;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Inventory;
import atrophy.combat.items.Item;
import atrophy.combat.items.KillTags;
import atrophy.combat.items.LightStealthField;
import atrophy.combat.items.MediumStealthField;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.SpeedBooster;
import atrophy.combat.items.StunGrenadeItem;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.items.WeldingTorch;
import atrophy.combat.items.resources.EngineeringSupply;
import atrophy.combat.items.resources.MedicalSupply;
import atrophy.combat.items.resources.ScienceSupply;
import atrophy.combat.items.resources.WeaponSupply;
import atrophy.combat.items.weapons.Harpoon1;
import atrophy.combat.items.weapons.Harpoon2;
import atrophy.combat.items.weapons.MeleeWeapon1;
import atrophy.combat.items.weapons.MeleeWeapon2;
import atrophy.combat.items.weapons.Pistol1;
import atrophy.combat.items.weapons.Pistol2;
import atrophy.combat.items.weapons.Pistol3;
import atrophy.combat.items.weapons.Pistol4;
import atrophy.combat.items.weapons.Plasma1;
import atrophy.combat.items.weapons.Plasma2;
import atrophy.combat.items.weapons.Railgun;
import atrophy.combat.items.weapons.Shotgun1;
import atrophy.combat.items.weapons.UnarmedWeapon;
import atrophy.combat.items.weapons.Weapon;

// TODO: Auto-generated Javadoc
/**
 * The Class LootBox.
 */
public class LootBox extends Crowd{
	
	/**
	 * The Constant LOOT_BUTTON_SPACING.
	 */
	private static final int LOOT_BUTTON_SPACING = 35;
	
	/**
	 * The Constant LOOTER_X.
	 */
	private static final int LOOTER_X = 10;
	
	/**
	 * The Constant LOOTER_Y.
	 */
	private static final int LOOTER_Y = 10;
	
	/**
	 * The Constant LOOTED_X.
	 */
	private static final int LOOTED_X = 320;
	
	/**
	 * The Constant LOOTED_Y.
	 */
	private static final int LOOTED_Y = 10;
	
	/**
	 * The looter buttons.
	 */
	private ArrayList<LootButton> looterButtons;
	
	/**
	 * The looted buttons.
	 */
	private ArrayList<LootButton> lootedButtons;
	
	/**
	 * The weapon loot buttons.
	 */
	private LootButton[] weaponLootButtons;
	
	/**
	 * The loot link.
	 */
	private Lootable[] lootLink;
	
	/**
	 * The loot text.
	 */
	private Text[] lootText; 
	
	/**
	 * The skill text.
	 */
	private Text skillText;
	
	/**
	 * The size.
	 */
	private final int [] size= {360,360};
	
	/**
	 * The drag location.
	 */
	private int[] dragLocation;
	
	/**
	 * The mouse drag region.
	 */
	private ActionRegion mouseDragRegion;

	private CombatUiManager combatUiManager;

	private MessageBox messageBox;

	private CartographerBox cartographerBox;
	
	/**
	 * Instantiates a new loot box.
	 */
	public LootBox(CombatUiManager combatUiManager, MessageBox messageBox, CartographerBox cartographerBox){
		super("LootBox", true);
		
		this.setVisible(false);
		
		this.combatUiManager = combatUiManager;
		this.messageBox = messageBox;
		this.cartographerBox = cartographerBox;
		
		try{
			
			this.setLocation(300, 80);
			
			weaponLootButtons = new LootButton[2];
			
			weaponLootButtons[0] = new LootButton(this, combatUiManager, "Weapon1",null,10);
			this.weaponLootButtons[0].setVisible(false);
			
			weaponLootButtons[1] = new LootButton(this, combatUiManager, "Weapon2",null,11);
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
				lootButton = new LootButton(this, combatUiManager, "LooterButton"+i,null,i);
				lootButton.setVisible(false);
				this.looterButtons.add(lootButton);
				this.addButton(lootButton);
			}
			
			for(int i = 0; i < 5; i++){
				lootButton = new LootButton(this, combatUiManager, "LootedButton"+i,null,i + 5);
				lootButton.setVisible(false);
				this.lootedButtons.add(lootButton);
				this.addButton(lootButton);
			}
			
			lootText = new Text[2];
			lootText[0] = new Text("LooterName");
			lootText[1] = new Text("LootedName");
			
			skillText = new Text("SkillText");
			this.addDisplayItem(skillText);
			
			lootText[0].setColour(Color.yellow.darker());
			lootText[1].setColour(Color.yellow.darker());
			
			this.addDisplayItem(lootText[0]);
			this.addDisplayItem(lootText[1]);
			
			// load banked images
			String[] files = {"images/atrophy/combat/ui/weldTorch.png",
							  "images/atrophy/combat/ui/sensorSuite.png",
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
							  SensorSuite.getInstance().getName(), KillTags.getInstance().getName(),
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
				this.addBankedImage(new BankedImage(names[i],img));
			}
			
			this.addBankedImage(new BankedImage(UnarmedWeapon.NAME, new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB)));
			
		}
		catch(IOException ioExcept){
			System.err.println("Could not load LootBox image. Terminating.");
			System.exit(-1);
		}
		
		mouseDragRegion = new ActionRegion(this.getLocation()[0], this.getLocation()[1], size[0], size[1], false) {
			
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
	
	/**
	 * Update locations.
	 */
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
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape) {
		drawBackdrop(drawShape);
		super.drawMethod(drawShape);
	}
	
	/**
	 * Draw backdrop.
	 *
	 * @param drawShape the draw shape
	 */
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
	
	/**
	 * Load loot display.
	 *
	 * @param looter the looter
	 * @param looted the looted
	 */
	
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
		
		this.weaponLootButtons[0].setImage(this.getBankedImage(looter.getWeapon().getName()));
		this.weaponLootButtons[0].setVisible(true);
		
		if(lootLink[1].getWeapon() != null){
			this.weaponLootButtons[1].setImage(this.getBankedImage(looted.getWeapon().getName()));
			this.weaponLootButtons[1].setVisible(true);
		}
		else{
			this.weaponLootButtons[1].setVisible(false);
		}
		
		for(int i = 0; i < looter.getInventory().getItemCount(); i++){
			looterButtons.get(i).setImage(this.getBankedImage(looter.getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
			looterButtons.get(i).setLootActive(true);
		}
		
		for(int i = 0; i < looted.getInventory().getItemCount(); i++){
			lootedButtons.get(i).setImage(this.getBankedImage(looted.getInventory().getItemAt(i).getName()));
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
	
	/**
	 * Load skill text.
	 */
	private void loadSkillText() {
		this.skillText.setVisible(true);
		
		this.skillText.setText("");
		
		Iterator<String> skillIterator = ((Ai) this.lootLink[0]).getSkills().keySet().iterator();
		
		while(skillIterator.hasNext()){
			String next = skillIterator.next();
			this.skillText.appendText(next + ": " + ((Ai) this.lootLink[0]).getSkillLevel(next) + "@n");
		}
	}

	/**
	 * Load inventory display.
	 *
	 * @param looter the looter
	 * @param allowModification the allow modification
	 */
	public void loadInventoryDisplay(Lootable looter, boolean allowModification){
		
		this.closeLootUi(false);
		this.setVisible(true);
		
		// hide abilities and cancel events to stop ai operating while in menu
		hideNonLootUi();
		
		lootLink[0] = looter;
		lootLink[1] = null;
		
		for(int i = 0; i < looter.getInventory().getItemCount(); i++){
			looterButtons.get(i).setImage(this.getBankedImage(looter.getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
			looterButtons.get(i).setLootActive(allowModification);
		}
		for(LootButton button: this.lootedButtons){
			button.setVisible(false);
		}
		
		this.weaponLootButtons[0].setImage(this.getBankedImage(looter.getWeapon().getName()));
		this.weaponLootButtons[0].setVisible(true);
		
		this.lootText[0].setText(looter.getName());
		this.lootText[1].setText("");
		
		this.lootText[0].setVisible(true);
		this.lootText[1].setVisible(true);
		
		loadSkillText();
		
		SoundBoard.getInstance().playEffect("invOpen");
	}
	
	/**
	 * Toggle inventory display.
	 *
	 * @param looter the looter
	 */
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
	
	/**
	 * Reload loot display.
	 */
	private void reloadLootDisplay(){
		
		this.weaponLootButtons[0].setImage(this.getBankedImage(this.lootLink[0].getWeapon().getName()));
		
		if(lootLink[1].getWeapon() != null){
			this.weaponLootButtons[1].setImage(this.getBankedImage(this.lootLink[1].getWeapon().getName()));
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
			looterButtons.get(i).setImage(this.getBankedImage(this.lootLink[0].getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
		}
		
		for(int i = 0; i < this.lootLink[1].getInventory().getItemCount(); i++){
			lootedButtons.get(i).setImage(this.getBankedImage(this.lootLink[1].getInventory().getItemAt(i).getName()));
			lootedButtons.get(i).setVisible(true);
		}
		
		this.weaponLootButtons[0].setVisible(true);
		
		if(this.lootLink[1].getWeapon() != null){
			this.weaponLootButtons[1].setVisible(true);
		}

	}
	
	/**
	 * Reload inventory display.
	 */
	private void reloadInventoryDisplay(){
		
		this.weaponLootButtons[0].setImage(this.getBankedImage(this.lootLink[0].getWeapon().getName()));
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
			looterButtons.get(i).setImage(this.getBankedImage(this.lootLink[0].getInventory().getItemAt(i).getName()));
			looterButtons.get(i).setVisible(true);
		}
		
		this.weaponLootButtons[0].setVisible(true);
	}
	
	
	/**
	 * Hide non loot ui.
	 */
	private void hideNonLootUi(){
		combatUiManager.getActionsBar().setVisible(false);
		messageBox.setVisible(false);
		cartographerBox.setVisible(false);
	}
	
	/**
	 * Close loot ui.
	 */
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
	
	/**
	 * Loot interaction.
	 *
	 * @param code the code
	 */
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
	
	/**
	 * Gets the item at.
	 *
	 * @param code the code
	 * @return the item at
	 */
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

	/**
	 * The Interface Lootable.
	 */
	public static interface Lootable{
		
		/**
		 * Gets the weapon.
		 *
		 * @return the weapon
		 */
		public Weapon getWeapon();
		
		/**
		 * Sets the weapon.
		 *
		 * @param weapon the new weapon
		 */
		public void setWeapon(Weapon weapon);
		
		/**
		 * Gets the inventory.
		 *
		 * @return the inventory
		 */
		public Inventory getInventory();
		
		/**
		 * Assign abilities.
		 */
		public void assignAbilities();
		
		/**
		 * Adds the item.
		 *
		 * @param item the item
		 */
		public void addItem(Item item);
		
		/**
		 * Gets the name.
		 *
		 * @return the name
		 */
		public String getName();
	}

	/**
	 * Toggle lock.
	 */
	public void toggleLock() {
		this.mouseDragRegion.setActive(!this.mouseDragRegion.isActive());
	}
	
}
