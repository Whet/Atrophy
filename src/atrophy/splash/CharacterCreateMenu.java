package atrophy.splash;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.ButtonMulti;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.Text;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.designObjects.display.TextInput;
import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.items.MeleeWeapon2;
import atrophy.combat.items.Pistol1;
import atrophy.combat.items.ScienceScanner;
import atrophy.combat.items.SensorSuite;
import atrophy.combat.items.UnitDetector;
import atrophy.combat.items.WeldingTorch;
import atrophy.combat.mechanics.Abilities;
import atrophy.gameMenu.saveFile.Missions;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;
import atrophy.gameMenu.saveFile.TechTree;
import atrophy.gameMenu.ui.StashManager;
import atrophy.hardPanes.GameMenuHardPane;

public class CharacterCreateMenu extends Crowd{

	private static final int START_ADVANCE = 200;

	private TextInput name;
	private ImageSelect image;

	public CharacterCreateMenu() {
		super(true);
		addComponents();
	}

	private void addComponents() {
		
		try {
			image = new ImageSelect();
			image.setLocation(this.getLocation()[0] + 66, this.getLocation()[1] + 60);
		} 
		catch (IOException e1) {
			System.err.println("Couldn't load heads");
			System.exit(-1);
		}
		this.addButton(image);
		
		Text nameTag = new Text(this.getLocation()[0] + 30, this.getLocation()[1] + 50, "Name: ");
		this.addDisplayItem(nameTag);
		
		name = new TextInput(this.getLocation()[0] + 66, this.getLocation()[1] + 50,"Julian");
		name.setMaxLetters(20);
		this.addInputText(name);
		
		
		for(int i = 0; i < 5; i++){
			
			final int ind = i;
			
			TextButton newGame = new TextButton(TextButton.DEFAULT_ON_COLOUR,TextButton.DEFAULT_OFF_COLOUR) {
				
				{
					this.setText(getTypeName(ind));
					this.setVisible(true);
					this.setDrawBox(true);
				}
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					startgame(ind, name.getText());
					return true;
				}
			};
			
			newGame.setLocation(this.getLocation()[0] + 30, this.getLocation()[1] + 150 + 80 * i);
			this.addMouseActionItem(newGame);
			this.addDisplayItem(newGame);
			
			Text startDescription = new Text(this.getLocation()[0] + 30, this.getLocation()[1] + 178 + 80 * i, getDescription(ind));
			this.addDisplayItem(startDescription);
		}
	}
	
	private String getTypeName(int ind) {
		switch(ind){
			case 0:
				return "Survivor Start";
			case 1:
				return "Engineer Start";
			case 2:
				return "Hunter Start";
			case 3:
				return "Tech Start";
			case 4:
				return "Marksman Start";
		}
		return "";
	}
	
	private String getDescription(int ind) {
		switch(ind){
			case 0:
				return "You survived the incident but nothing more.@nYou will stuggle at first, armed with nothing but your suit and a knife.";
			case 1:
				return "Your upbringing made you handy with tools.@nYou have a welding torch and your upbringing makes you more skilled with it.";
			case 2:
				return "You have a personnel detector which tracks who is in the surrounding area.";
			case 3:
				return "Your family worked in the science labs before the incident.@nYou have a rare sensor suite that can detect people through walls and scanner to gather scientific data.";
			case 4:
				return "Your family has kept themselves safe by grabbing some weapons from the armoury.@nYou have a pistol, a powerful tool for intimidation and less subtle things.";
		}
		return "";
	}

	private void startgame(int startType, String name){
		Squad squad = new Squad();
		squad.setAdvance(START_ADVANCE);
		
		squad.addSquaddie(new Squaddie(specialNames(name),this.image.getImageName(),MeleeWeapon2.NAME, ""));
		
		switch(startType){
			case 1:
				squad.getSquadMember(0).addItem(WeldingTorch.NAME);
				squad.getSquadMember(0).setSkillLevel(Abilities.WELDING, 1);
			break;
			case 2:
				squad.getSquadMember(0).addItem(UnitDetector.NAME);
			break;
			case 3:
				squad.getSquadMember(0).addItem(SensorSuite.NAME);
				squad.getSquadMember(0).addItem(ScienceScanner.NAME);
			break;
			case 4:
				squad.getSquadMember(0).setWeapon(Pistol1.NAME);
			break;
		}
		
		TechTree techTree = new TechTree();
		squad.setTechTree(techTree);
		StashManager stashManager = new StashManager(null);
		Missions missions = new Missions();
		ActivePane.getInstance().changeRootCrowd(new Crowd(new GameMenuHardPane(squad, techTree, stashManager, missions)));
	}
	
	private String specialNames(String name) {
		
		switch(name){
			case "":
			break;
		}
		
		if(name.isEmpty()){
			name = "Anon";
		}
		
		return name;
	}

	private static class ImageSelect extends ButtonMulti{

		public String[] names = {"PlainHead","MessyHead","NazcaHead","BeardHead","Raziel","StripeHead"};
		
		public ImageSelect() throws FileNotFoundException, IOException {
			super(new BufferedImage[]{
					ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/heads/plainHead.png")),
					ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/heads/messyHead.png")),
					ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/heads/nazcaHead.png")),
					ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/heads/beardHead.png")),
					ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/heads/raziel.png")),
					ImageIO.read(ReadWriter.getResourceAsInputStream("images/atrophy/combat/heads/stripeHead.png"))
			});
		}
		
		@Override
		public boolean mU(Point mousePosition, MouseEvent e) {
			this.nextFrame(true);
			return true;
		}
		
		@Override
		public boolean rMU(Point mousePosition, MouseEvent e) {
			this.previousFrame(true);
			return true;
		}
		
		public String getImageName(){
			return this.names[this.getFrame()];
		}
	}

}
