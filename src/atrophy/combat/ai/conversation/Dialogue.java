package atrophy.combat.ai.conversation;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import atrophy.combat.ai.Ai;
import atrophy.combat.display.ui.Cartographer;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.items.Item;
import atrophy.combat.items.Weapon;
import atrophy.combat.level.MissionManager;
import atrophy.gameMenu.saveFile.Missions;

public class Dialogue{
	
	/**
	 * The opening line.
	 */
	public String openingLine;
	
	/**
	 * The options.
	 */
	public String[] options;
	
	// string which is cycled through when continue is pressed
	/**
	 * The long speeches.
	 */
	public Map<String, String[][]> longSpeeches;
	
	/**
	 * The long speech.
	 */
	public String[] longSpeech;
	
	private boolean initiator;
	
	/**
	 * The long speech point.
	 */
	public int longSpeechPoint;
	
	/**
	 * The talked to.
	 */
	public List<Ai> talkedTo;
	
	private Missions missions;
	private MissionManager missionManager;
	private Cartographer cartographer;
	
	/**
	 * Instantiates a new dialogue.
	 * @param i 
	 *
	 * @param openingLine the opening line
	 * @param options the options
	 * @param initiator 
	 */
	public Dialogue(Missions missions, MissionManager missionManager, Cartographer cartographer, String openingLine, String[] options, boolean initiator){
		this.missions = missions;
		this.openingLine = openingLine;
		this.options = options;
		this.missionManager = missionManager;
		this.cartographer = cartographer;
		longSpeechPoint = 0;
		this.initiator = initiator;
		this.longSpeeches = new LinkedHashMap<String,String[][]>(2);
		talkedTo = new ArrayList<Ai>();
	}
	
	public boolean requirementsMet(String[] requirements, Ai currentAi) {
		
		for(int i = 0; i < requirements.length; i++){
			if(!currentAi.getInventory().hasItemByName(requirements[i]) && !missions.hasMemCode(requirements[i]))
				return false;
		}
		
		return true;
	}

	/**
	 * Check triggers.
	 *
	 * @param speech the speech
	 * @param messageBox 
	 * @return true, if successful
	 */
	public boolean checkTriggers(String speech, MessageBox messageBox) {
		if(speech.startsWith("#")){
			
			// remove the #
			String itemName = speech.substring(1);
			
			// check if the spawn also has an id
			// id ex. ##ABCDItemName
			if(itemName.startsWith("#")){
				
				// id already included so exit
				if(missions.hasMemCode(itemName.substring(1, 5)))
					return true;
				
				missions.addMemCode(itemName.substring(1, 5));
				
				itemName = itemName.substring(5);
			}
			// Event code
			else if(itemName.startsWith("$")){
				missions.addMemCode(itemName.substring(1, 5));
				return true;
			}
			// Talktree update ^TAG#STAGE.NUMBER
			else if(itemName.startsWith("^")){
				String[] talkMapUpdates = itemName.substring(1).split("#");
				missionManager.getTalkMap(talkMapUpdates[0]).setToStage(Integer.parseInt(talkMapUpdates[1]));
				return true;
			}
			
			// Check if the spawn is a swap
			String[] swapItems = itemName.split("#");
			
			if(swapItems.length == 1){
				// Spawn given stash
				double[] location = missionManager.spawnItem(itemName); 
				
				// mark the location as a stash
				cartographer.addNewMarker(location, Color.white, messageBox.getConversers()[1].getName() + "'s Stash");
			}
			else{
				if(Weapon.isWeapon(swapItems[0])){
					messageBox.getConversers()[0].setWeapon(Weapon.stringToWeapon(swapItems[1]));
				}
				else{
					messageBox.getConversers()[0].getInventory().removeItem(Item.stringToItem(swapItems[0]));
					messageBox.getConversers()[0].getInventory().addItem(Item.stringToItem(swapItems[1]));
				}
				messageBox.getConversers()[0].assignAbilities();
			}
			
			return true;
		}
		return false;
	}

	/**
	 * Adds the long speech.
	 *
	 * @param speechName the speech name
	 * @param speech the speech
	 */
	public void addLongSpeech(String speechName, String[] speech, String[] requiredItems){
		this.longSpeeches.put(speechName, new String[][]{speech,requiredItems});
	}

	/**
	 * Sets the long speech.
	 *
	 * @param speechName the new long speech
	 */
	public void setLongSpeech(String speechName){
		
		if(longSpeeches.get(speechName)[0] != longSpeech)
			longSpeechPoint = 0;
		
		this.longSpeech = this.longSpeeches.get(speechName)[0];
	}
	
	/**
	 * Next speech dialogue.
	 *
	 * @return the string
	 */
	public String nextSpeechDialogue() {
		if(longSpeechPoint < longSpeech.length){
			longSpeechPoint++;		
		}
		return longSpeech[longSpeechPoint - 1];
	}

	/**
	 * Can talk to.
	 *
	 * @param actor the actor
	 * @return true, if successful
	 */
	public boolean canTalkTo(Ai actor) {
		return !this.talkedTo.contains(actor);
	}
	
	/**
	 * Talked to.
	 *
	 * @param actor the actor
	 */
	public void talkedTo(Ai actor){
		this.talkedTo.add(actor);
	}

	public boolean isInitiator() {
		return this.initiator;
	}

}