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
	
	public String openingLine;
	public String[] options;
	
	// string which is cycled through when continue is pressed
	public Map<String, String[][]> longSpeeches;
	
	public String[] longSpeech;
	private boolean initiator;
	public int longSpeechPoint;
	public List<Ai> talkedTo;
	
	private MissionManager missionManager;
	private Cartographer cartographer;
	
	public Dialogue(MissionManager missionManager, Cartographer cartographer, String openingLine, String[] options, boolean initiator){
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

			if((Item.isItem(requirements[i]) &&
			   (
			   (currentAi.getInventory().hasItemByName(requirements[i]) && requirements[i].startsWith("!")) ||
			   (!currentAi.getInventory().hasItemByName(requirements[i]) && !requirements[i].startsWith("!"))
			   )) ||
			   (
			   (missionManager.hasMemCode(requirements[i]) &&
					   requirements[i].startsWith("!")) ||
			   (!missionManager.hasMemCode(requirements[i]) &&
					   !requirements[i].startsWith("!"))
			   ))
				return false;
		}
		
		return true;
	}

	public boolean checkTriggers(String speech, MessageBox messageBox) {
		if(speech.startsWith("#")){
			
			// remove the # and spaces
			String itemName = speech.substring(1).replaceAll(" ", "");
			
			// check if the spawn also has an id
			// id ex. ##ABCDItemName
			if(itemName.startsWith("#")){
				
				// id already included so exit
				if(missionManager.hasMemCode(itemName.substring(1, 5)))
					return true;
				
				missionManager.addMemCode(itemName.substring(1, 5));
				
				itemName = itemName.substring(5);
			}
			// Command
			else if(itemName.startsWith("*")) {
				missionManager.runCommand(itemName.substring(1, 5));
				return true;
			}
			// Event code
			else if(itemName.startsWith("!$")){
				missionManager.removeMemCode(itemName.substring(2, 6));
				return true;
			}
			else if(itemName.startsWith("$")){
				missionManager.addMemCode(itemName.substring(1, 5));
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
			
			if(swapItems.length == 2){
				if(Weapon.isWeapon(swapItems[1]) && (!Weapon.isWeapon(swapItems[0]) || messageBox.getConversers()[0].getWeapon().getName().equals(swapItems[1]))){
					messageBox.getConversers()[0].setWeapon(Weapon.stringToWeapon(swapItems[1]));
				}
				else if(Item.isItem(swapItems[1]) && (!Item.isItem(swapItems[0]) || messageBox.getConversers()[0].getInventory().hasItemByName(swapItems[0]))){
					messageBox.getConversers()[0].getInventory().removeItem(Item.stringToItem(swapItems[0]));
					messageBox.getConversers()[0].getInventory().addItem(Item.stringToItem(swapItems[1]));
				}
				else if(swapItems[1].startsWith("*") && messageBox.getConversers()[0].getInventory().hasItemByName(swapItems[0])) {
					missionManager.runCommand(swapItems[1].substring(1));
					messageBox.getConversers()[0].getInventory().removeItem(Item.stringToItem(swapItems[0]));
				}
				else if(swapItems[1].startsWith("^") && messageBox.getConversers()[0].getInventory().hasItemByName(swapItems[0])) {
					String[] talkMapUpdates = itemName.substring(1).split("#");
					missionManager.getTalkMap(talkMapUpdates[0]).setToStage(Integer.parseInt(talkMapUpdates[1]));
				}
				messageBox.getConversers()[0].assignAbilities();
			}
			
			return true;
		}
		return false;
	}

	public void addLongSpeech(String speechName, String[] speech, String[] requiredItems){
		this.longSpeeches.put(speechName, new String[][]{speech,requiredItems});
	}

	public void setLongSpeech(String speechName){
		
		if(longSpeeches.get(speechName)[0] != longSpeech)
			longSpeechPoint = 0;
		
		this.longSpeech = this.longSpeeches.get(speechName)[0];
	}
	
	public String nextSpeechDialogue() {
		if(longSpeechPoint < longSpeech.length){
			longSpeechPoint++;		
		}
		return longSpeech[longSpeechPoint - 1];
	}

	public boolean canTalkTo(Ai actor) {
		return !this.talkedTo.contains(actor);
	}
	
	public void talkedTo(Ai actor){
		this.talkedTo.add(actor);
	}

	public boolean isInitiator() {
		return this.initiator;
	}

}