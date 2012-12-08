/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
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
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.AiGeneratorInterface.TurretGenerateCommand;
import atrophy.combat.ai.ThinkingAi.AiNode;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.display.ui.MessageBox.Dialogue;
import atrophy.combat.display.ui.loot.LootBox.Lootable;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.combat.missions.MissionManager;

/**
 * The Class LevelIO.
 */
public class LevelIO {
	
	/**
	 * Creates the level folders.
	 */
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

	/**
	 * Load level.
	 *
	 * @param levelFile the level file
	 * @param owner the owner
	 * @param engineeringChance the engineering chance
	 * @param medicalChance the medical chance
	 * @param weaponChance the weapon chance
	 * @param scienceChance the science chance
	 * @param panningManager 
	 * @param combatVisualManager 
	 * @param turnProcess 
	 * @param messageBox 
	 * @param aiCrowd 
	 * @param levelManager 
	 * @return the level
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws LevelFormatException the level format exception
	 */
	public static Level loadLevel(File levelFile, String owner, int engineeringChance, int medicalChance, int weaponChance, int scienceChance, PanningManager panningManager, CombatVisualManager combatVisualManager, TurnProcess turnProcess, MessageBox messageBox, AiCrowd aiCrowd, LevelManager levelManager) throws IOException, LevelFormatException{
		Level level = new Level(owner, levelManager);
		
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
		
		readBlocks(levelFile, level, blocksList, aiCrowd, messageBox, turnProcess, combatVisualManager);
		
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

	/**
	 * Read blocks.
	 *
	 * @param levelFile the level file
	 * @param level the level
	 * @param blocksList the blocks list
	 * @param aiCrowd 
	 * @param messageBox 
	 * @param messageBox 
	 * @param turnProcess 
	 * @param combatVisualManager 
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws LevelFormatException the level format exception
	 */
	private static void readBlocks(File levelFile, Level level, Stack<LevelBlock> blocksList, AiCrowd aiCrowd, MessageBox messageBox, TurnProcess turnProcess, CombatVisualManager combatVisualManager) throws IOException, LevelFormatException {
		
		int blockNumber = 0;
		
		int lineNumber  = 0;
		
		String lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		
		AiNode lastNode = null;
		
		while(lineString != null){
			
			if(lineString.startsWith("BLOCK")){
				LevelBlock block = new LevelBlock(blockNumber);
				
				blocksList.add(block);
				
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
				
				
				blockNumber++;
				
			}
			else if(lineString.startsWith("STASH") || lineString.startsWith("COVER")){
				
				if(blocksList.size() == 0){
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
					blocksList.peek().addCover(region);
				
				else if(lineString.startsWith("STASH"))
					blocksList.peek().addStash(region);
				
			}
			else if(lineString.startsWith("SPAWN")){
				
				if(blocksList.size() == 0){
					throw new LevelFormatException(lineNumber,"A region is made before any rooms have been made!");
				}
				
				if(blocksList.peek().getStealthRegion().size() == 0){
					throw new LevelFormatException(lineNumber,"A spawn is defined before any stashes have been made!");
				}
				
				Lootable stash = blocksList.peek().getStashLootAbles().get(blocksList.peek().getStealthRegion().size() - 1);
				
				// Location is used to make the marker so takes into account where block is
				double[] location = new double[]{
						blocksList.peek().getStealthRegion().get(blocksList.peek().getStealthRegion().size() - 1).getBounds2D().getCenterX() +
						blocksList.peek().getLocation()[0],
						blocksList.peek().getStealthRegion().get(blocksList.peek().getStealthRegion().size() - 1).getBounds2D().getCenterY() +
						blocksList.peek().getLocation()[1]};
				
				boolean spawnOnce = Boolean.parseBoolean(ReadWriter.readFromArray(lineString, 2));
				
				MissionManager.getInstance().addSpawnStash(ReadWriter.readFromArray(lineString, 0),stash,location,ReadWriter.readFromArray(lineString, 1),spawnOnce);
			}
			else if(lineString.startsWith("TEXTUREBLOCK")){
				
				if(blocksList.size() == 0){
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
				
				blocksList.peek().addTexturePolygon(texturePoly);
				
			}
			else if(lineString.startsWith("TEXTURE")){
				
				if(blocksList.size() == 0){
					throw new LevelFormatException(lineNumber,"A texture is applied before any rooms have been made!");
				}
				
				try{
					if(blocksList.peek().getTexturePolygons().size() == 0)
						blocksList.peek().setTextureCode(Integer.parseInt(ReadWriter.readFromArray(lineString, 0)));
					else
						blocksList.peek().getTextures().add((Integer.parseInt(ReadWriter.readFromArray(lineString, 0))));
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Texture was applied to block " + blockNumber + " with a non-integer code!");
				}
			}
			else if(lineString.startsWith("TERRITORY") || lineString.startsWith("ZONE")){
				
				if(blocksList.size() == 0){
					throw new LevelFormatException(lineNumber,"A territory is applied before any rooms have been made!");
				}
				
				String[] factions = new String[ReadWriter.getArraySize(lineString)];
				
				for(int i = 0; i < factions.length; i++){
					factions[i] = ReadWriter.readFromArray(lineString, i);
				}
				
				if(lineString.startsWith("TERRITORY"))
					level.addFactionBlock(factions, blocksList.peek());
				else
					level.addBannedBlock(factions, blocksList.peek());
				
			}
			else if(lineString.startsWith("SAFEROOM")) {
				
				if(blocksList.size() == 0){
					throw new LevelFormatException(lineNumber,"A saferoom is applied before any rooms have been made!");
				}
				
				level.addSaferoom(blocksList.peek());
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
				
				AiNode aiNode = new AiNode(aiCrowd, messageBox, turnProcess, vertexX,vertexY);
				
				SoloGenerateCommand command = (SoloGenerateCommand) AiGeneratorInterface.getInstance().getCommands().get(AiGeneratorInterface.getInstance().getCommands().size() - 1);
				
				command.addAiNode(aiNode);
				
				lastNode = aiNode;
			}
			else if(lineString.startsWith("NODE")){
				
				if(blocksList.size() == 0){
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
				
				lastNode = new AiNode(aiCrowd, messageBox, turnProcess, vertexX,vertexY);
				
				blocksList.peek().addNode(lastNode);
				
				for(int i = 0; i < factions.length; i++){
					lastNode.addUsableFaction(factions[i],level.getMapOwner());
				}
				
				
			}
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
			else if(lineString.startsWith("DIALOGUE")){
				
				if(lastNode == null){
					throw new LevelFormatException(lineNumber,"A dialogue is added before any nodes have been made!");
				}
				
//				int tone;
//				String targetFaction;
				String openingLine = null;
				String[] options = null;
				
				try{
//					tone = Integer.parseInt(ReadWriter.readFromArray(lineString, 0));
//					targetFaction = ReadWriter.readFromArray(lineString, 1);
				}
				catch(NumberFormatException e){
					throw new LevelFormatException(lineNumber,"Dialogue was applied to block " + blockNumber + " with a non-integer tone!");
				}
				
				openingLine = ReadWriter.readFromArray(lineString, 2);
				
				options = new String[ReadWriter.getArraySize(lineString) - 3];
				
				for(int i = 0; i < options.length; i++){
					options[i] = ReadWriter.readFromArray(lineString, i + 3);
				}
				
				Dialogue dialogue = new Dialogue(0, openingLine, options);
				lastNode.setDialogue(dialogue);
				lastNode.getDialogue().setTargetFaction(AiGenerator.PLAYER);
			}
			else if(lineString.startsWith("MESSAGE")){
				
				String name = ReadWriter.readFromArray(lineString, 0);
				List<String> speech = new ArrayList<>();
				List<String> speechRequirements = new ArrayList<>();
				
				for(int i = 1; i < ReadWriter.getArraySize(lineString); i++){
					if(ReadWriter.readFromArray(lineString, i).startsWith("REQ:"))
						speechRequirements.add(ReadWriter.readFromArray(lineString, i).substring(4));
					else
						speech.add(ReadWriter.readFromArray(lineString, i));
				}
				
				lastNode.getTopics().addLongSpeech(name,speech.toArray(new String[speech.size()]),speechRequirements.toArray(new String[speechRequirements.size()]));
			}
			else if(lineString.startsWith("TOPICS")){
				
				if(lastNode == null){
					throw new LevelFormatException(lineNumber,"A set of topics is added before any nodes have been made!");
				}
				
				String[] options = new String[ReadWriter.getArraySize(lineString)];
				
				for(int i = 0; i < options.length; i++){
					options[i] = ReadWriter.readFromArray(lineString, i);
				}
				
				lastNode.setTopics(new Dialogue(0, "", options));
			}
			else if(lineString.startsWith("TOPIC")){

				String name = ReadWriter.readFromArray(lineString, 0);
				List<String> speech = new ArrayList<>();
				List<String> speechRequirements = new ArrayList<>();
				
				for(int i = 1; i < ReadWriter.getArraySize(lineString); i++){
					if(ReadWriter.readFromArray(lineString, i).startsWith("REQ:"))
						speechRequirements.add(ReadWriter.readFromArray(lineString, i).substring(4));
					else
						speech.add(ReadWriter.readFromArray(lineString, i));
				}
				
				lastNode.getTopics().addLongSpeech(name,speech.toArray(new String[speech.size()]),speechRequirements.toArray(new String[speechRequirements.size()]));
			}
			else if(lineString.startsWith("TURRET")){

				if(blocksList.size() == 0){
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
				
				
				AiGeneratorInterface.getInstance().getCommands().add(new TurretGenerateCommand(vertexX + blocksList.peek().getLocation()[0],
																							   vertexY + blocksList.peek().getLocation()[1]));
				
			}
			else if(lineString.startsWith("MAPSPAWNS")){
				
				String[] allowedSpawns = new String[ReadWriter.getArraySize(lineString)];
				
				for(int i = 0; i < allowedSpawns.length; i++){
					allowedSpawns[i] = ReadWriter.readFromArray(lineString, i);
				}
				
				level.setAllowedSpawns(allowedSpawns);
				
			}
			else if(lineString.startsWith("AISPAWN")){
				
				if(blocksList.size() == 0){
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
				String weapon = ReadWriter.readFromArray(lineString, 4);
				String[] items = new String[ReadWriter.getArraySize(lineString) - 5];
				
				for(int i = 0; i < items.length; i++){
					items[i] = ReadWriter.readFromArray(lineString, i + 5);
				}
				
				AiGeneratorInterface.getInstance().getCommands().add(new SoloGenerateCommand(vertexX + blocksList.peek().getLocation()[0],
																							 vertexY + blocksList.peek().getLocation()[1],
																							 faction, name, weapon, items));
			}
			
			lineNumber++;
			lineString = ReadWriter.readFromFile(levelFile, lineNumber);
		}
	}

	/**
	 * Read portals.
	 *
	 * @param levelFile the level file
	 * @param portalData the portal data
	 * @param portalSecurity the portal security
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws LevelFormatException the level format exception
	 */
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
	
	/**
	 * The Class LevelFormatException.
	 */
	@SuppressWarnings("serial")
	public static class LevelFormatException extends Exception{
		
		/**
		 * The message.
		 */
		public String message;
	
		/**
		 * Instantiates a new level format exception.
		 *
		 * @param lineNumber the line number
		 * @param message the message
		 */
		public LevelFormatException(int lineNumber, String message){
			this.message = "Error Line: " + lineNumber + " " + message;
		}
	}
	
}
