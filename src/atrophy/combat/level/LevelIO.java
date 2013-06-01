/*
 * 
 */
package atrophy.combat.level;

import java.awt.Polygon;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.AiGeneratorInterface.TurretGenerateCommand;
import atrophy.combat.ai.ThinkingAi.AiNode;
import atrophy.combat.ai.conversation.Dialogue;
import atrophy.combat.ai.conversation.TalkMap;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Missions;

public class LevelIO {
	
	public static void createLevelFolders(){
		
		String homeLocation = System.getProperty("user.home");
		
		// Atrophy folder
		File file =  new File(homeLocation + "/Atrophy");
		
		boolean exit = false;
		
		if(!file.exists()){
			file.mkdir();
			exit = true;
		}
		
		// Map file
		file =  new File(homeLocation + "/Atrophy/Sectors.txt");
		
		if(!file.exists()){
			try {
				
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				writer.write("Underbelly[]\n");
				writer.append("Engineering Beta[]\n");
				writer.append("Residence One[]\n");
				writer.append("Stores[]\n");
				writer.append("Production[]\n");
				writer.append("Robotics[]\n");
				writer.append("Mixed Sciences[]\n");
				writer.append("Energy[]\n");
				writer.append("Bridge[]\n");
				writer.append("Shrapnel[]\n");
				writer.append("#DO NOT CHANGE ORDER OF SECTORS\n");
				writer.append("#ORDER DETERMINES WHAT MAPS GO WHERE");
				
				writer.close();
			} 
			catch (IOException e) {
				System.err.println("sector write failed");
			}
			exit = true;
		}
		
		// Maps folder
		file =  new File(homeLocation + "/Atrophy/Maps");
		
		if(!file.exists()){
			file.mkdir();
			exit = true;
		}
		
		// Saves folder
		file =  new File(homeLocation + "/Atrophy/Saves");
		
		if(!file.exists()){
			file.mkdir();
			exit = true;
		}
		
		if(exit){
			System.err.println("Your folders didn't exist! Please populate the data folders and reload the game");
			System.err.println("A folder was made at: " + homeLocation + "/Atrophy");
			System.exit(-1);
		}
		
	}

	public static Level loadLevelBlocks(File levelFile) throws LevelFormatException, IOException {
		Level level = new Level("");
		Stack<LevelBlock> blocksList = new Stack<LevelBlock>();
		
		try{
			level.setSize(new int[]{
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 0)),
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 1)),
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 2)),
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 3))
									});
		}
		catch(NumberFormatException e){
			throw new LevelFormatException(0,"The size line is not correctly defined! It should be on line 0 and as '[width Min, -width Max, height Min, -height Max]' ");
		}
		
		int blockNumber = 0;
		
		int lineNumber  = 0;
		
		String lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		
		while(lineString != null){
			
			if(lineString.startsWith("BLOCK")){
				LevelBlock block = new LevelBlock(blockNumber, null);
				
				// Add verticies
				int arraySize = ReadWriter.getArraySize(lineString);
				
				for(int i = 0; i < arraySize; i += 2){
					
					try{
						int vertexX = Integer.parseInt(ReadWriter.readFromArray(lineString, i));
						int vertexY = Integer.parseInt(ReadWriter.readFromArray(lineString, i + 1));
						
						block.addVertex(vertexX, vertexY);
					}
					catch(NumberFormatException e){
						throw new LevelFormatException(lineNumber,"Room " + blockNumber + " has a vertex co-ordinate that is not an integer!");
					}
				}
				block.setDiscovered(true);
				blocksList.add(block);
				blockNumber++;
			}
			
			lineNumber++;
			lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		}
		
		LevelBlock[] levelBlocks = new LevelBlock[blocksList.size()];
		
		for(int i = 0; i < blocksList.size(); i++){
			levelBlocks[i] = blocksList.get(i);
		}
		
		level.setBlocks(levelBlocks);
		
		return level;
	}
	
	public static Level loadLevel(File levelFile, String owner, int engineeringChance, int medicalChance, int weaponChance, int scienceChance, PanningManager panningManager, TurnProcess turnProcess, MessageBox messageBox, AiCrowd aiCrowd, CombatMembersManager combatMembersManager, Missions missions, MissionManager missionsManager, List<GenerateCommand> generationCommands) throws IOException, LevelFormatException{
		Level level = new Level(owner);
		
		Stack<LevelBlock> blocksList = new Stack<LevelBlock>();
		
		ArrayList<double[]> portalData = new ArrayList<double[]>();
		ArrayList<String> portalSecurity = new ArrayList<String>();
		
		try{
			level.setSize(new int[]{
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 0)),
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 1)),
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 2)),
								    Integer.parseInt(ReadWriter.readFromArray(ReadWriter.readFromFile(levelFile, 0), 3))
									});
		}
		catch(NumberFormatException e){
			throw new LevelFormatException(0,"The size line is not correctly defined! It should be on line 0 and as '[width Min, -width Max, height Min, -height Max]' ");
		}
		
		readBlocks(levelFile, level, blocksList, aiCrowd, messageBox, turnProcess, missions, missionsManager, generationCommands, combatMembersManager);
		
		readPortals(levelFile, portalData, portalSecurity);
		// Place components into level object
		LevelBlock[] levelBlocks = new LevelBlock[blocksList.size()];
		
		for(int i = 0; i < blocksList.size(); i++){
			levelBlocks[i] = blocksList.get(i);
		}
		
		level.setBlocks(levelBlocks);
		
		level.generatePortals(portalData, portalSecurity, level);
		
		panningManager.setMaxOffsets(level.getSize());
		
		level.spawnItems(engineeringChance,medicalChance,weaponChance,scienceChance);
		
		return level;
	}

	private static void readBlocks(File levelFile, Level level, Stack<LevelBlock> blockStack, AiCrowd aiCrowd, MessageBox messageBox, TurnProcess turnProcess, Missions missions, MissionManager missionsManager, List<AiGeneratorInterface.GenerateCommand> generationCommands, CombatMembersManager combatMembersManager) throws IOException, LevelFormatException {
		
		int blockNumber = 0;
		
		int lineNumber  = 0;
		
		String lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		
		AiNode lastNode = null;
		
		TalkMap lastTalkMap = null;
		
		while(lineString != null){
			
			if(lineString.startsWith("BLOCK")){
				LevelBlock block = new LevelBlock(blockNumber, missionsManager);
				
				blockStack.add(block);
				
				// Add verticies
				int arraySize = ReadWriter.getArraySize(lineString);
				
				for(int i = 0; i < arraySize; i += 2){
					
					try{
						int vertexX = Integer.parseInt(ReadWriter.readFromArray(lineString, i));
						int vertexY = Integer.parseInt(ReadWriter.readFromArray(lineString, i + 1));
						
						block.addVertex(vertexX, vertexY);
					}
					catch(NumberFormatException e){
						throw new LevelFormatException(lineNumber,"Room " + blockNumber + " has a vertex co-ordinate that is not an integer!");
					}
				}
				
				block.createNavigationGrid();
				
				blockNumber++;
				
			}
			else if(lineString.startsWith("STASH") || lineString.startsWith("COVER")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A region is made before any rooms have been made!");
				}
				
				// Add verticies
				int arraySize = ReadWriter.getArraySize(lineString);
				
				Polygon region = new Polygon();
				
				// Add verticies
				for(int i = 0; i < arraySize; i += 2){
					
					try{
						int vertexX = Integer.parseInt(ReadWriter.readFromArray(lineString, i));
						int vertexY = Integer.parseInt(ReadWriter.readFromArray(lineString, i + 1));
						
						region.addPoint(vertexX, vertexY);
					}
					catch(NumberFormatException e){
						throw new LevelFormatException(lineNumber,"Room " + blockNumber + " has a region vertex co-ordinate that is not an integer!");
					}
				}
				
				// Add polygon to list
				if(lineString.startsWith("COVER"))
					blockStack.peek().addCover(region);
				
				else if(lineString.startsWith("STASH"))
					blockStack.peek().addStash(region);
				
			}
			else if(lineString.startsWith("SPAWN")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A region is made before any rooms have been made!");
				}
				
				if(blockStack.peek().getStealthRegion().size() == 0){
					throw new LevelFormatException(lineNumber,"A spawn is defined before any stashes have been made!");
				}
				
				Lootable stash = blockStack.peek().getStashLootAbles().get(blockStack.peek().getStealthRegion().size() - 1);
				
				// Location is used to make the marker so takes into account where block is
				double[] location = new double[]{
						blockStack.peek().getStealthRegion().get(blockStack.peek().getStealthRegion().size() - 1).getBounds2D().getCenterX() +
						blockStack.peek().getLocation()[0],
						blockStack.peek().getStealthRegion().get(blockStack.peek().getStealthRegion().size() - 1).getBounds2D().getCenterY() +
						blockStack.peek().getLocation()[1]};
				 
				// SPAWN[tag,itemName,#TAGV]
				if(ReadWriter.readFromArray(lineString, 2).startsWith("#")) {
					missionsManager.addSpawnStash(ReadWriter.readFromArray(lineString, 0), stash,location,ReadWriter.readFromArray(lineString, 1),ReadWriter.readFromArray(lineString, 2));
				}
				// SPAWN[tag,itemName,spawnOnce_Bool]
				else{
					boolean spawnOnce = Boolean.parseBoolean(ReadWriter.readFromArray(lineString, 2));
					missionsManager.addSpawnStash(ReadWriter.readFromArray(lineString, 0),stash,location,ReadWriter.readFromArray(lineString, 1),spawnOnce);
				}
			}
			else if(lineString.startsWith("TEXTUREBLOCK")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A texture polygon is added before any rooms have been made!");
				}
				
				Polygon texturePoly = new Polygon();
				
				// Add verticies
				int arraySize = ReadWriter.getArraySize(lineString);
				
				for(int i = 0; i < arraySize; i += 2){
					
					try{
						int vertexX = Integer.parseInt(ReadWriter.readFromArray(lineString, i));
						int vertexY = Integer.parseInt(ReadWriter.readFromArray(lineString, i + 1));
						
						texturePoly.addPoint(vertexX, vertexY);
					}
					catch(NumberFormatException e){
						throw new LevelFormatException(lineNumber,"TextureBlock has a vertex co-ordinate that is not an integer!");
					}
				}
				
				blockStack.peek().addTexturePolygon(texturePoly);
				
			}
			else if(lineString.startsWith("TEXTURE")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A texture is applied before any rooms have been made!");
				}
				
				try{
					if(blockStack.peek().getTexturePolygons().size() == 0)
						blockStack.peek().setTextureCode(Integer.parseInt(ReadWriter.readFromArray(lineString, 0)));
					else
						blockStack.peek().getTextures().add((Integer.parseInt(ReadWriter.readFromArray(lineString, 0))));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Texture was applied to block " + blockNumber + " with a non-integer code!");
				}
			}
			else if(lineString.startsWith("ZONE")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A zone is applied before any rooms have been made!");
				}
				
				String[] factions = new String[ReadWriter.getArraySize(lineString)];
				
				for(int i = 0; i < factions.length; i++){
					factions[i] = ReadWriter.readFromArray(lineString, i);
				}
				
				level.addBannedBlock(factions, blockStack.peek());
				
			}
			else if(lineString.startsWith("TERRITORY")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A territory is applied before any rooms have been made!");
				}
				
				String faction = ReadWriter.readFromArray(lineString, 0);
				
				if(faction.equals(AiGenerator.PLAYER))
					level.addPlayerSpawn(blockStack.peek());
				else
					combatMembersManager.getCommander(faction).setBlockHeuristic(blockStack.peek(), Integer.parseInt(ReadWriter.readFromArray(lineString, 1)));
				
			}
			else if(lineString.startsWith("SAFEROOM")) {
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A saferoom is applied before any rooms have been made!");
				}
				
				level.addSaferoom(blockStack.peek());
			}
			else if(lineString.startsWith("LOCKEDNODE")){
				double vertexX;
				double vertexY;
				
				try{
					vertexX = Double.parseDouble(ReadWriter.readFromArray(lineString, 0));
					vertexY = Double.parseDouble(ReadWriter.readFromArray(lineString, 1));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Room " + blockNumber + " has a lockedNode co-ordinate that is not a number!");
				}
				
				AiNode aiNode = new AiNode(aiCrowd, messageBox, turnProcess, missionsManager, vertexX,vertexY);
				
				SoloGenerateCommand command = (SoloGenerateCommand) generationCommands.get(generationCommands.size() - 1);
				
				command.addAiNode(aiNode);
				
				lastNode = aiNode;
			}
			else if(lineString.startsWith("NODE")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A node is added before any rooms have been made!");
				}
				
				double vertexX;
				double vertexY;
				String[] factions;
				
				try{
					vertexX = Double.parseDouble(ReadWriter.readFromArray(lineString, 0));
					vertexY = Double.parseDouble(ReadWriter.readFromArray(lineString, 1));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Room " + blockNumber + " has a node co-ordinate that is not a number!");
				}
				
				factions = new String[ReadWriter.getArraySize(lineString) - 2];
				for(int i = 0; i < factions.length; i++){
					factions[i] = ReadWriter.readFromArray(lineString, i + 2);
				}
				
				lastNode = new AiNode(aiCrowd, messageBox, turnProcess, missionsManager, vertexX,vertexY);
				
				blockStack.peek().addNode(lastNode);
				
				for(int i = 0; i < factions.length; i++){
					lastNode.addUsableFaction(factions[i],level.getMapOwner());
				}
				
				
			}
			else if(lineString.startsWith("BEHAVIOUR")){
				
				ArrayList<String> behaviours = new ArrayList<String>();
				
				int size = ReadWriter.getArraySize(lineString);
				
				for(int i = 0; i < size; i++){
					behaviours.add(ReadWriter.readFromArray(lineString, i));
				}
				
				lastNode.addBehaviours(behaviours);
			}
			//TODO: Fix smart tag, is a bit of a outdated mess atm
			else if(lineString.startsWith("SMART")){
				
				if(lastNode == null){
					throw new LevelFormatException(lineNumber,"Smart settings applied before any nodes have been made!");
				}
				
				double angle;
				boolean mustBeOccupied;
				boolean hasThoughts;
				int users;
				String[] disabler;
				
				try{
					angle = Double.parseDouble(ReadWriter.readFromArray(lineString, 0));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Smart settings were applied to block " + blockNumber + " with a non-number angle!");
				}
				
				mustBeOccupied = Boolean.parseBoolean(ReadWriter.readFromArray(lineString, 1));
				hasThoughts = Boolean.parseBoolean(ReadWriter.readFromArray(lineString, 2));
				
				try{
					users =Integer.parseInt(ReadWriter.readFromArray(lineString, 3));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Smart settings were applied to block " + blockNumber + " with a non-integer max population!");
				}
				
				disabler = new String[ReadWriter.getArraySize(lineString) - 4];
				for(int i = 0; i < disabler.length; i++){
					disabler[i] = ReadWriter.readFromArray(lineString, i + 4);
				}
				
				lastNode.setAngle(angle);
				lastNode.setMustBeOccupied(mustBeOccupied);
				lastNode.setThinks(hasThoughts);
				lastNode.setDisabler(disabler);
				lastNode.setMaxUsers(users);
				
			}
			else if(lineString.startsWith("PRIORITY")){
				
				if(lastNode == null){
					throw new LevelFormatException(lineNumber,"Priority settings applied before any nodes have been made!");
				}
				
				ArrayList<String> priorities = new ArrayList<String>();
				
				int size = ReadWriter.getArraySize(lineString);
				
				for(int i = 0; i < size; i++){
					priorities.add(ReadWriter.readFromArray(lineString, i));
				}
				
				lastNode.addPriorities(priorities);
			}
			else if(lineString.startsWith("TALKMAP")){
				
				String tag = ReadWriter.readFromArray(lineString, 0);
				
				lastTalkMap = new TalkMap(tag);
				
				missionsManager.addTalkMap(tag, lastTalkMap);
				
			}
			else if(lineString.startsWith("TALKSTAGE")){
				
				int stage = Integer.parseInt(ReadWriter.readFromArray(lineString, 0));
				boolean initiator = Boolean.parseBoolean(ReadWriter.readFromArray(lineString, 1));
				String openingLine = ReadWriter.readFromArray(lineString, 2);
				String[] options = new String[ReadWriter.getArraySize(lineString) - 3];
				
				for(int i = 3; i < ReadWriter.getArraySize(lineString); i++){
					options[i - 3] = ReadWriter.readFromArray(lineString, i);
				}
				
				Dialogue dialogue = messageBox.createDialogue(missions, missionsManager, openingLine, options, initiator);
				
				lastTalkMap.addDialogue(stage, dialogue);
				
			}
			else if(lineString.startsWith("TALK")){

				int stage = Integer.parseInt(ReadWriter.readFromArray(lineString, 0));
				String name = ReadWriter.readFromArray(lineString, 1);
				List<String> speech = new ArrayList<>();
				List<String> speechRequirements = new ArrayList<>();
				
				for(int i = 2; i < ReadWriter.getArraySize(lineString); i++){
					if(ReadWriter.readFromArray(lineString, i).startsWith("REQ:"))
						speechRequirements.add(ReadWriter.readFromArray(lineString, i).substring(4));
					else
						speech.add(ReadWriter.readFromArray(lineString, i));
				}
				
				lastTalkMap.getDialogue(stage).addLongSpeech(name,speech.toArray(new String[speech.size()]),speechRequirements.toArray(new String[speechRequirements.size()]));
			}
			else if(lineString.startsWith("SUBSCRIBE")){
				
				String[] talkMaps = new String[ReadWriter.getArraySize(lineString)];
				
				for(int i = 0; i < ReadWriter.getArraySize(lineString); i++){
					talkMaps[i] = ReadWriter.readFromArray(lineString, i);
				}
				
				lastNode.subscribeToTalkMaps(talkMaps);
			}
			else if(lineString.startsWith("TURRET")){

				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"A turret is added before any rooms have been made!");
				}
				
				double vertexX;
				double vertexY;
				
				try{
					vertexX = Double.parseDouble(ReadWriter.readFromArray(lineString, 0));
					vertexY = Double.parseDouble(ReadWriter.readFromArray(lineString, 1));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Room " + blockNumber + " has a turret co-ordinate that is not a number!");
				}
				
				
				generationCommands.add(new TurretGenerateCommand(vertexX + blockStack.peek().getLocation()[0],
																							   vertexY + blockStack.peek().getLocation()[1]));
				
			}
			else if(lineString.startsWith("MAPSPAWNS")){
				
				String[] allowedSpawns = new String[ReadWriter.getArraySize(lineString)];
				
				for(int i = 0; i < allowedSpawns.length; i++){
					allowedSpawns[i] = ReadWriter.readFromArray(lineString, i);
				}
				
				level.setAllowedSpawns(allowedSpawns);
				
			}
			else if(lineString.startsWith("AISPAWN")){
				
				if(blockStack.size() == 0){
					throw new LevelFormatException(lineNumber,"An ai spawn is added before any rooms have been made!");
				}
				
				double vertexX;
				double vertexY;
				
				try{
					vertexX = Double.parseDouble(ReadWriter.readFromArray(lineString, 0));
					vertexY = Double.parseDouble(ReadWriter.readFromArray(lineString, 1));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Room " + blockNumber + " has an ai co-ordinate that is not a number!");
				}
				
				String name = ReadWriter.readFromArray(lineString, 2);
				String faction = ReadWriter.readFromArray(lineString, 3);
				String isDaemon = ReadWriter.readFromArray(lineString, 4);
				String weapon = ReadWriter.readFromArray(lineString, 5);
				String[] items = new String[ReadWriter.getArraySize(lineString) - 6];
				
				for(int i = 0; i < items.length; i++){
					items[i] = ReadWriter.readFromArray(lineString, i + 6);
				}
				
				generationCommands.add(new SoloGenerateCommand(vertexX + blockStack.peek().getLocation()[0],
																							 vertexY + blockStack.peek().getLocation()[1],
																							 faction, Boolean.parseBoolean(isDaemon), name, weapon, items));
			}
			else if(lineString.startsWith("AIALLIANCE")){
				SoloGenerateCommand command = (SoloGenerateCommand) generationCommands.get(generationCommands.size() - 1);
				
				String[] alliances = new String[ReadWriter.getArraySize(lineString)];
				for(int i = 0; i < alliances.length; i++){
					alliances[i] = ReadWriter.readFromArray(lineString, i);
				}
				
				command.setAlliances(alliances);
			}
			
			lineNumber++;
			lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		}
		
	}

	private static void readPortals(File levelFile, ArrayList<double[]> portalData, ArrayList<String> portalSecurity) throws IOException, LevelFormatException {
		
		ArrayList<String> factions = new ArrayList<String>();
		factions.add(AiGenerator.BANDITS); factions.add(AiGenerator.WHITE_VISTA);
		
		int lineNumber  = 0;
		
		String lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		
		while(lineString != null){
			
			if(lineString.startsWith("PORTAL")){
				
				double[] portalNumbers = new double[6];
				
				try{
					for(int i = 0; i < 6; i++){
						portalNumbers[i] = Double.parseDouble(ReadWriter.readFromArray(lineString, i));
					}
					
					portalData.add(portalNumbers);
					portalSecurity.add("");
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"A portal has a value that is not a number!");
				}
				
			}
			else if(lineString.startsWith("SECURITY")){
				if(portalData.size() == 0)
					throw new LevelFormatException(lineNumber,"A security level was set when no portals exist!");
				
				String faction = ReadWriter.readFromArray(lineString, 0);
				
				if(!factions.contains(faction))
					throw new LevelFormatException(lineNumber,"A security level was set for a non-existant faction! Factions are: " + AiGenerator.BANDITS + ", " + AiGenerator.WHITE_VISTA);
				
				// Change last entry
				portalSecurity.remove(portalSecurity.size() - 1);
				portalSecurity.add(faction);
			}
			
			lineNumber++;
			lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		}
	}
	
	@SuppressWarnings("serial")
	public static class LevelFormatException extends Exception{
		
		public String message;
	
		public LevelFormatException(int lineNumber, String message){
			this.message = "Error Line: " + lineNumber + " " + message;
		}
	}

}
