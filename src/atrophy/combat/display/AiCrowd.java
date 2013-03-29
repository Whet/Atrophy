/*
 * 
 */
package atrophy.combat.display;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.io.ReadWriter;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.ai.VehicleAi;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

// TODO: Auto-generated Javadoc
/**
 * The Class AiCrowd.
 */
public class AiCrowd extends Crowd {
	
	/**
	 * The actors.
	 */
	private ArrayList<Ai> actors;
	
	/**
	 * The masks.
	 */
	private ArrayList<AiImage> masks;
	
	/**
	 * The master stack.
	 */
	private Stack<Ai> masterStack;
	
	/**
	 * The shuffled stack.
	 */
	private Stack<Ai> shuffledStack;
	
	private Squad squad;

	private Map<String, BufferedImage> images;
	
	/**
	 * Instantiates a new ai crowd.
	 * @param squadMenu 
	 */
	public AiCrowd(Squad squad) {
		super(false);
		images = new HashMap<>();
		actors = new ArrayList<Ai>();
		masks = new ArrayList<AiImage>();
		loadBank();
		
		this.squad = squad;
	}
	
	// the void
	
	/**
	 * Load bank.
	 */
	private void loadBank(){
		try{
			// Location of head portrait images
			String[] files = {"images/atrophy/combat/heads/beardHead.png",
							  "images/atrophy/combat/heads/messyHead.png",
							  "images/atrophy/combat/heads/nazcaHead.png",
							  "images/atrophy/combat/heads/plainHead.png",
							  "images/atrophy/combat/heads/raziel.png",
							  "images/atrophy/combat/heads/stripeHead.png",
							  "images/atrophy/combat/heads/beardHeadDamaged.png",
							  "images/atrophy/combat/heads/messyHeadDamaged.png",
							  "images/atrophy/combat/heads/nazcaHeadDamaged.png",
							  "images/atrophy/combat/heads/plainHeadDamaged.png",
							  "images/atrophy/combat/heads/razielDamaged.png",
							  "images/atrophy/combat/heads/stripeHeadDamaged.png",
							  "images/atrophy/combat/heads/engineerHead.png",
							  "images/atrophy/combat/heads/engineerHeadDamaged.png",
							  "images/atrophy/combat/heads/sensorHead.png",
							  "images/atrophy/combat/heads/sensorHeadDamaged.png",
							  "images/atrophy/combat/heads/stealthHead.png",
							  "images/atrophy/combat/heads/stealthHeadDamaged.png",
							  "images/atrophy/combat/heads/speedHead.png",
							  "images/atrophy/combat/heads/speedHeadDamaged.png",
							  "images/atrophy/combat/heads/armourHead.png",
							  "images/atrophy/combat/heads/armourHeadDamaged.png",
							  "images/atrophy/combat/heads/daemonHead.png",
							  "images/atrophy/combat/heads/nodeHead.png",
							  "images/atrophy/combat/heads/turret.png",
							  "images/atrophy/combat/heads/turret.png",
							  "images/atrophy/combat/heads/mule.png",
							  "images/atrophy/combat/heads/muleDead.png"
							  };
			BufferedImage img;
			
			String[] names = {"BeardHead","MessyHead","NazcaHead","PlainHead","Raziel","StripeHead",
							  "BeardHeadDead","MessyHeadDead","NazcaHeadDead","PlainHeadDead","RazielDead","StripeHeadDead",
							  "Engineer","EngineerDead",
							  "Sensor","SensorDead",
							  "Stealthed","StealthedDead",
							  "Scout","ScoutDead",
							  "Armour","ArmourDead",
							  "Daemon", "Node",
							  "Turret", "TurretDead",
							  "Mule","MuleDead"
							  };
			
			// Add all heads to the image bank
			for(int i = 0; i < files.length; i++){
				img = ImageIO.read(ReadWriter.getResourceAsInputStream(files[i]));
				this.images.put(names[i],img);
			}
		
		}
		catch(IOException ioexcept){
			System.err.println("Unable to load aiCrowd images. Terminating.");
			System.exit(-1);
		}
	}
	
	/**
	 * Gets the shuffled ai.
	 *
	 * @return the shuffled ai
	 */
	public ArrayList<Ai> getShuffledAi(){
		
		ArrayList<Ai> shuffledList = new ArrayList<Ai>();
		
		// move the Ai to the shuffled list since actors needs to stay in order
		// actors.get(i) has its mask at masks.get(i)
		shuffledList.addAll(this.actors);
		
		Collections.shuffle(shuffledList);
		
		return shuffledList;
	}
	
	/**
	 * Gets the shuffled stack.
	 *
	 * @return the shuffled stack
	 */
	public Stack<Ai> getShuffledStack() {
		
		if(this.masterStack == null || this.masterStack.size() == 0){
			masterStack = new Stack<Ai>();
			
			masterStack.addAll(this.actors);
			
			Collections.shuffle(masterStack);
		}
		
		if(this.shuffledStack == null){
			this.shuffledStack = new Stack<Ai>(); 
		}
		
		if(this.shuffledStack.size() == 0){
			shuffledStack.addAll(masterStack);
		}
		
		return shuffledStack;
	}
	
	// Overriden method, makes it so each click only selects one unit
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#mC(java.awt.Point, java.awt.event.MouseEvent)
	 */
	@Override
	public boolean mC(Point mousePosition, MouseEvent e) {
		if(this.isActive()){
			for(int i = 0; i < this.getMouseActionList().size(); i++){
				// if the mouse click is in the hitbox then peform the action
				if(this.getMouseActionList().get(i).isActive() && 
				   this.getMouseActionList().get(i).isInBounds(mousePosition.x,mousePosition.y)){
					this.getMouseActionList().get(i).mC(mousePosition, e);
					return true;
				}
			}
		}
		return false;
	}
	
	// Getters
	
	// get actor by their name
	/**
	 * Gets the actor.
	 *
	 * @param tag the tag
	 * @return the actor
	 */
	public Ai getActor(String tag){
		int i;
		
		for(i = 0; i < actors.size();i ++){
			if(actors.get(i).getName().equals(tag)){
				break;
			}
		}
		
		return actors.get(i);
	}
	// get actor by position in array
	/**
	 * Gets the actor.
	 *
	 * @param i the i
	 * @return the actor
	 */
	public Ai getActor(int i){
		return actors.get(i);
	}
	
	/**
	 * Gets the actor count.
	 *
	 * @return the actor count
	 */
	public int getActorCount(){
		return actors.size();
	}
	
	// gets mask of an ai
	/**
	 * Gets the actor mask.
	 *
	 * @param ai the ai
	 * @return the actor mask
	 */
	public AiImage getActorMask(Ai ai){
		int i;
		
		for(i = 0; i < this.masks.size(); i++){
			if(this.masks.get(i).getAi() == ai){
				break;
			}
		}
		
		return this.masks.get(i);
	}
	
	/**
	 * Gets the mask.
	 *
	 * @param i the i
	 * @return the mask
	 */
	public AiImage getMask(int i){
		return masks.get(i);
	}
	
	/**
	 * Gets the actors.
	 *
	 * @return the actors
	 */
	public ArrayList<Ai> getActors(){
		return this.actors;
	}
	
	
	// Setters
	/**
	 * Adds the actor.
	 *
	 * @param ai the ai
	 */
	public void addActor(Ai ai){
		actors.add(ai);
	}
	
	/**
	 * Adds the mask.
	 *
	 * @param aiImg the ai img
	 */
	public void addMask(AiImage aiImg){
		masks.add(aiImg);
		aiImg.updateImage();
	}

	/**
	 * Gets the masks.
	 *
	 * @return the masks
	 */
	public ArrayList<AiImage> getMasks() {
		return this.masks;
	}

	/**
	 * Random ai.
	 *
	 * @param excludeAi the exclude ai
	 * @return the ai
	 */
	public Ai randomAi(Ai excludeAi) {
		Ai returnAi;
		do{
			returnAi = actors.get(new Random().nextInt(actors.size()));
		}
		while(returnAi == excludeAi);
		return returnAi;
	}

	/**
	 * Save to squad.
	 */
	public Squad saveToSquad() {
		Squad squad = new Squad();
		
		squad.setAdvance(this.squad.getAdvance());
		squad.setKills(this.squad.getSquadKills());
		
		for(int i = 0; i < this.actors.size(); i++){
			if(actors.get(i).getFaction().equals(AiGenerator.PLAYER) && !actors.get(i).isDead()){
				Ai ai = actors.get(i);
				
				
				Squaddie squadMember;
				
				if(this.getActorMask(ai) instanceof VehicleImage)
					squadMember = new Squaddie(ai.getName(), ai.getImage(), ai.getWeapon().getName(), ((VehicleAi)ai).getVehicleType());
				else
					squadMember = new Squaddie(ai.getName(), ai.getImage(), ai.getWeapon().getName(), "");
				
				for(int j = 0; j < ai.getInventory().getItemCount(); j++){
					squadMember.addItem(ai.getInventory().getItemAt(j).getName());
				}
				
				Iterator<String> skillIt = ai.getSkills().keySet().iterator();
				
				while(skillIt.hasNext()){
					String skill = skillIt.next();
					squadMember.setSkillLevel(skill, ai.getSkillLevel(skill));
				}
				
				squad.addSquaddie(squadMember);
			}
		}
		
		return squad;
		
	}

	/**
	 * Replace ai.
	 *
	 * @param thinkingAi the thinking ai
	 * @param playerAi the player ai
	 */
	public void replaceAi(ThinkingAi thinkingAi, Ai playerAi) {
		for(int i = 0; i < masterStack.size(); i++){
			if(masterStack.get(i) == thinkingAi){
				masterStack.set(i, playerAi);
			}
		}
	}

	public BufferedImage getBankedImage(String image) {
		return this.images.get(image);
	}

}
