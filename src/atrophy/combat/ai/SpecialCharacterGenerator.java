package atrophy.combat.ai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.director.DirectorArchetype;
import atrophy.combat.level.LevelIO;
import atrophy.gameMenu.saveFile.Missions;

public class SpecialCharacterGenerator {

	public static SoloGenerateCommand specialCharacters(Missions missions, ArrayList<String> allowedItems, ArrayList<String> allowedWeapons, String faction, String sector) {
	
		SoloGenerateCommand specialCharacter = null;
		
		try {
			String fileLocation = ReadWriter.HOME_LOCATION + LevelIO.SUB_FOLDER + "/SpecialCharacters.json";
			JSONTokener tokener = new JSONTokener(new FileInputStream(fileLocation));
			JSONObject root = new JSONObject(tokener);
			
			JSONObject factionRoot = (JSONObject) root.get(faction);
			
			Iterator<?> keys = factionRoot.keys();

			List<CharacterInfo> possibleCharacters = new ArrayList<>();
			
	        while(keys.hasNext()){
	            String key = (String)keys.next();
	            
	            if(factionRoot.get(key) instanceof JSONObject){
	            	JSONObject character = (JSONObject) factionRoot.get(key);
	            	
	            	if(character.get("sector").toString().equals(sector) && missions.isCharacterFree(key)) {
	            		System.out.println("Character Spawned: " + key);
	            		
	            		if(character.has("type"))
	            			possibleCharacters.add(new CharacterInfo(faction, character.get("name").toString(), character.get("weapon").toString(), character.getJSONArray("items"), character.getString("type").toString()));
	            		else
	            			possibleCharacters.add(new CharacterInfo(faction, character.get("name").toString(), character.get("weapon").toString(), character.getJSONArray("items")));
	            		
	            		missions.addCharacterCode(key, character.get("name").toString());
	            	}
	            }
	        }
			
	        if(possibleCharacters.size() > 0)
	        	specialCharacter = possibleCharacters.get(new Random().nextInt(possibleCharacters.size())).toCommand();
		}
		catch(JSONException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return specialCharacter;
		
	}
	
	private static class CharacterInfo {
		
		public String faction;
		public String name;
		public String weapon;
		public String[] items;
		public DirectorArchetype classification;
		
		public CharacterInfo(String faction, String name, String weapon, JSONArray items) throws JSONException {
			this.faction = faction;
			this.name = name;
			this.weapon = weapon;
			this.items = new String[items.length()];
			
			for(int i = 0; i < items.length(); i++) {
				this.items[i] = items.get(i).toString();
			}
			
			this.classification = DirectorArchetype.UNDECIDED;
		}
		
		public CharacterInfo(String faction, String name, String weapon, JSONArray items, String classification) throws JSONException {
			this.faction = faction;
			this.name = name;
			this.weapon = weapon;
			this.items = new String[items.length()];
			
			for(int i = 0; i < items.length(); i++) {
				this.items[i] = items.get(i).toString();
			}
			
			this.classification = DirectorArchetype.getEnum(classification);
		}

		public SoloGenerateCommand toCommand() {
			return new SoloGenerateCommand(faction, classification, false, name, weapon, items);
		}
		
	}
	
}
