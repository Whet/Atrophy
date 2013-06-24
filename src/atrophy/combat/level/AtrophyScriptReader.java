package atrophy.combat.level;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

import watoydoEngine.io.ReadWriter;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.level.AtrophyScriptParser.prog_return;
import atrophy.combat.mechanics.TurnProcess;
import atrophy.gameMenu.saveFile.Missions;

public class AtrophyScriptReader {


	protected static Level readScript(File file, String owner,
								     int engineeringChance, int medicalChance, int weaponChance, int scienceChance,
								     PanningManager panningManager, TurnProcess turnProcess, MessageBox messageBox,
								     AiCrowd aiCrowd, CombatMembersManager combatMembersManager, Missions missions,
								     MissionManager missionsManager, List<GenerateCommand> generationCommands) throws RecognitionException, IOException {
		
		StringBuffer sb = new StringBuffer();
		String lineString;
		int line = 0;
		
		while((lineString = ReadWriter.readFromFile(file, line)) != null) {
			sb.append(lineString);
			line++;
		}
		
		CharStream stream =	new ANTLRStringStream(sb.toString());
		AtrophyScriptLexer lexer = new AtrophyScriptLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		AtrophyScriptParser parser = new AtrophyScriptParser(tokenStream);
		prog_return prog = parser.prog();
		
		Stack<LevelBlockInfo> blockStack = new Stack<>();
		Stack<PortalInfo> portalStack = new Stack<>();

		Level level = new Level(owner);
		
		AtrophyScriptReader.walkTree(level, prog.tree, blockStack, portalStack, missionsManager, combatMembersManager);
		
		level.setBlocks(blockStack);
		level.generatePortals(portalStack, level);
		panningManager.setMaxOffsets(level.getSize());
		level.spawnItems(engineeringChance,medicalChance,weaponChance,scienceChance);
		
		return level;
	}
	
	private static class RegionInfo {
		
		public final String name;
		public final List<Integer> xList;
		public final List<Integer> yList;
		
		public RegionInfo(String name, List<Integer> xList, List<Integer> yList) {
			this.name = name;
			this.xList = xList;
			this.yList = yList;
		}
		
	}
	
	protected static class LevelBlockInfo {

		public MissionManager missionManager;
		public String name;
		public List<Integer> xList;
		public List<Integer> yList;
		public List<RegionInfo> cover;
		public List<RegionInfo> stashes;
		public Map<String, Integer> territory;
		public List<String> zone;
		public int number;
		private Level level;
		private CombatMembersManager combatMembersManager;
		private boolean saferoom;
		
		public LevelBlockInfo(int number, String name, List<Integer> xList, List<Integer> yList, Map<String, Integer> territory, List<String> zone, boolean saferoom, MissionManager missionManager, Level level, CombatMembersManager combatMembersManager) {
			this.number = number;
			this.name = name;
			this.xList = xList;
			this.yList = yList;
			
			this.cover = new ArrayList<RegionInfo>();
			this.stashes = new ArrayList<RegionInfo>();
			
			this.territory = territory;
			this.zone = zone;
			
			this.saferoom = saferoom;
			
			this.missionManager = missionManager;
			this.level = level;
			this.combatMembersManager = combatMembersManager;
		}

		public void addCover(RegionInfo region) {
			this.cover.add(region);
		}
		
		public void addStash(RegionInfo region) {
			this.stashes.add(region);
		}

		public LevelBlock toLevelBlock() {
			LevelBlock levelBlock = new LevelBlock(number, missionManager);
			for(int i = 0; i < xList.size(); i++) {
				levelBlock.addVertex(xList.get(i), yList.get(i));
			}
			
			for(Entry<String, Integer> entry:territory.entrySet()) {
				
				if(entry.getKey().equals(AiGenerator.PLAYER)) {
					level.addPlayerSpawn(levelBlock);
				}
				else {
					
					if(entry.getKey().equals("WhiteVista"))
						combatMembersManager.getCommander(AiGenerator.WHITE_VISTA).setBlockHeuristic(levelBlock, entry.getValue());
					else
						combatMembersManager.getCommander(entry.getKey()).setBlockHeuristic(levelBlock, entry.getValue());
				}
			}
			
			levelBlock.createNavigationGrid();
			if(saferoom)
				level.addSaferoom(levelBlock);
			
			return levelBlock;
		}
	}
	
	protected static class PortalInfo {

		public String name;
		public String security = "";
		public List<Integer> xList;
		public List<Integer> yList;

		public PortalInfo(String name, String security, List<Integer> xList, List<Integer> yList) {
			this.name = name;
			this.xList = xList;
			this.yList = yList;
			this.security = security;
		}

		public String getSecurity() {
			return this.security;
		}

	}
	
	public static void walkTree(Level level, Tree tree, Stack<LevelBlockInfo> blockStack, Stack<PortalInfo> portalStack, MissionManager missionManager, CombatMembersManager combatMembersManager) {
		// system.out.println(tree.toString());
		
		int blockNumber = 0;
		
		switch(tree.toString()) {
			case "INIT":
				runCommands(tree);
				return;
			case "MAPSIZE":
				List<Integer> size = createIntList(tree);
				int[] sizeArray = {size.get(0), -size.get(1), size.get(2), -size.get(3)};
				level.setSize(sizeArray);
				return;
			case "BLOCK":
				blockStack.add(createBlock(blockNumber, tree, missionManager, level, combatMembersManager));
				blockNumber++;
				return;
			case "PORTAL":
				portalStack.add(createPortal(tree));
				return;
			case "COVER":
				blockStack.peek().addCover(createRegion(tree));
				return;
			case "STASH":
				blockStack.peek().addStash(createRegion(tree));
				return;
			case "TEXTUREBLOCK":
				createRegion(tree);
				return;
			case "TRIGGER":
				createTrigger(tree);
				return;
			case "COMMAND":
				//TODO
				createCommand(tree);
				return;
			case "TALKTREE":
				// TODO
				createTalkTree(tree);
				return;
			case "TALK":
				// TODO
				createTalkTopic(tree);
				return;
			case "MAPSPAWNS":
				Set<String> allowedSpawns = new HashSet<>();
				for(int i = 0 ; i < tree.getChildCount(); i++) {
					if(tree.getChild(i).toString().equals("WhiteVista"))
						allowedSpawns.add(AiGenerator.WHITE_VISTA);
					else
						allowedSpawns.add(tree.getChild(i).toString());
				}
				
				level.setAllowedSpawns(allowedSpawns);
				return;
		}
		
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			walkTree(level, tree.getChild(i), blockStack, portalStack, missionManager, combatMembersManager);
		}
	}

	private static void createCommand(Tree tree) {
		// system.out.println("CREATING COMMAND");
		
		String name = "";
		List<TriggerEffect> effects = new ArrayList<>();
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "TRIGGEREFFECT":
					effects = createEffects(tree.getChild(i));
				break;
				case "VAR":
					name = tree.getChild(i).getChild(0).toString();
				break;
			}
		}
		
		// system.out.println("CommandName: " + name);
		// system.out.println("Effects: " + effects);
	}

	private static void createTrigger(Tree tree) {
		// system.out.println("CREATING TRIGGER");
		
		String name = "";
		List<TriggerCond> conditions = new ArrayList<>();
		List<TriggerEffect> effects = new ArrayList<>();
		
		for(int i = 0 ; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "TRIGGERCOND":
					conditions = createConditions(tree.getChild(i));
				break;
				case "TRIGGEREFFECT":
					effects = createEffects(tree.getChild(i));
				break;
				case "VAR":
					name = tree.getChild(i).getChild(0).toString();
				break;
			}
		}
		
		// system.out.println("TriggerName: " + name);
		// system.out.println("Conds: " + conditions);
		// system.out.println("Effects: " +  effects);
	}
	
	private static List<TriggerCond> createConditions(Tree child) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static class TriggerCond {
		
	}
	
	private abstract static class TriggerEffect {
		
		public abstract void run();
		
	}
	
	private abstract static class UnitInfoEffect extends TriggerEffect {
		
		public UnitInfoEffect(Tree tree) {
			processUnitInfo(tree);
		}

		private void processUnitInfo(Tree tree) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class SpawnEffect extends UnitInfoEffect {

		public SpawnEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class RemoveEffect extends UnitInfoEffect {

		public RemoveEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class KillEffect extends UnitInfoEffect {

		public KillEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class TeleportEffect extends UnitInfoEffect {

		public TeleportEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class ConverseEffect extends UnitInfoEffect {

		public ConverseEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private abstract static class RoomInfoEffect extends TriggerEffect {
		
		public RoomInfoEffect(Tree tree) {
			processRoomInfo(tree);
		}

		private void processRoomInfo(Tree tree) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class MakeSaferoomEffect extends RoomInfoEffect {

		public MakeSaferoomEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class RemoveSaferoomEffect extends RoomInfoEffect {

		public RemoveSaferoomEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class LoadMapEffect extends TriggerEffect {
		
		public LoadMapEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class LockDoorEffect extends TriggerEffect {
			
			public LockDoorEffect(Tree tree) {
				
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}
	
	private static final class UnlockDoorEffect extends TriggerEffect {
		
		public UnlockDoorEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class AddTagEffect extends TriggerEffect {
			
			public AddTagEffect(Tree tree) {
				
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}
	
	private static final class RemoveTagEffect extends TriggerEffect {
		
		public RemoveTagEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class ModifyDirectorEffect extends TriggerEffect {
		
		public ModifyDirectorEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class ChangeAiNodeEffect extends TriggerEffect {
		
		public ChangeAiNodeEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static final class UpdateTalkEffect extends TriggerEffect {
			
			public UpdateTalkEffect(Tree tree) {
				
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}
	
	private static final class CommandCallEffect extends TriggerEffect {
		
		public CommandCallEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private static List<TriggerEffect> createEffects(Tree tree) {
		List<TriggerEffect> effects = new ArrayList<>();
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "SPAWNUNIT":
					effects.add(new SpawnEffect(tree.getChild(i)));
				break;
				case "REMOVEUNIT":
					effects.add(new RemoveEffect(tree.getChild(i)));
				break;
				case "KILLUNIT":
					effects.add(new KillEffect(tree.getChild(i)));
				break;
				case "TELEPORT":
					effects.add(new TeleportEffect(tree.getChild(i)));
				break;
				case "CONVERSE":
					effects.add(new ConverseEffect(tree.getChild(i)));
				break;
				case "SAFEROOM":
					effects.add(new MakeSaferoomEffect(tree.getChild(i)));
				break;
				case "REMOVESAFEROOM":
					effects.add(new RemoveSaferoomEffect(tree.getChild(i)));
				break;
				case "LOADMAP":
					effects.add(new LoadMapEffect(tree.getChild(i)));
				break;
				case "LOCKDOOR":
					effects.add(new LockDoorEffect(tree.getChild(i)));
				break;
				case "UNLOCKDOOR":
					effects.add(new UnlockDoorEffect(tree.getChild(i)));
				break;
				case "ADDTAG":
					effects.add(new AddTagEffect(tree.getChild(i)));
				break;
				case "REMOVETAG":
					effects.add(new RemoveTagEffect(tree.getChild(i)));
				break;
				case "DIRECTORBIAS":
					effects.add(new ModifyDirectorEffect(tree.getChild(i)));
				break;
				case "CHANGEAINODE":
					effects.add(new ChangeAiNodeEffect(tree.getChild(i)));
				break;
				case "UPDATETALK":
					effects.add(new UpdateTalkEffect(tree.getChild(i)));
				break;
				case "COMMAND CALL":
					effects.add(new CommandCallEffect(tree.getChild(i)));
				break;
			}
		}
		
		return effects;
	}

	private static void createTalkTopic(Tree tree) {
		// system.out.println("CREATING TALKTOPIC");
		
		String parent = "";
		Integer talkStage = null;
		Boolean aiInit = null;
		String openingLine = null;
		List<String> lines = new ArrayList<>();
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "TALKPARENT":
					parent = tree.getChild(i).getChild(0).toString();
				break;
				case "TALKSTAGE":
					talkStage = Integer.parseInt(tree.getChild(i).getChild(0).toString());
				break;
				case "AIINIT":
					aiInit = Boolean.parseBoolean(tree.getChild(i).getChild(0).toString());
				break;
				case "OPENINGLINE":
					openingLine = tree.getChild(i).getChild(0).toString();
				break;
				case "LINE":
					lines.add(tree.getChild(i).getChild(0).toString());
				break;
			}
		}
		
		// system.out.println("Member of: " + parent);
		// system.out.println("At stage: " + talkStage);
		// system.out.println("AiInit: " + aiInit);
		// system.out.println("Opening: " + openingLine);
		// system.out.println(lines);
	}

	private static void createTalkTree(Tree tree) {
		// system.out.println("CREATING TALKTREE");
		
		List<Integer> stages = new ArrayList<>();
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "STAGELIST":
					stages = createIntList(tree.getChild(i));
				break;
			}
		}
		
		// system.out.println(stages);
	}

	private static RegionInfo createRegion(Tree tree) {
		// system.out.println("CREATING REGION");
		
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		String name = "";
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "XLIST":
					xList = createIntList(tree.getChild(i));
				break;
				case "YLIST":
					yList = createIntList(tree.getChild(i));
				break;
				case "VAR":
					name = tree.getChild(i).getChild(0).toString();
				break;
			}
		}
		
		// system.out.println("X " + xList);
		// system.out.println("Y " + yList);
		// system.out.println("Name " + name);
		
		return new RegionInfo(name, xList, yList);
	}

	private static PortalInfo createPortal(Tree tree) {
		// system.out.println("CREATING PORTAL");
		
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		String name = "";
		String security = "";
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "XLIST":
					xList = createIntList(tree.getChild(i));
				break;
				case "YLIST":
					yList = createIntList(tree.getChild(i));
				break;
				case "VAR":
					name = tree.getChild(i).getChild(0).toString();
				break;
			}
		}
		
		// system.out.println("X " + xList);
		// system.out.println("Y " + yList);
		// system.out.println("Name " + name);
		
		return new PortalInfo(name, security, xList, yList);
	}

	private static LevelBlockInfo createBlock(int blockNumber, Tree tree, MissionManager missionManager, Level level, CombatMembersManager combatMembersManager) {
		// system.out.println("CREATING BLOCK");
		
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		String name = "";
		Map<String, Integer> territory = new HashMap<String, Integer>();
		List<String> zone = new ArrayList<>();
		boolean saferoom = false;
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "XLIST":
					xList = createIntList(tree.getChild(i));
				break;
				case "YLIST":
					yList = createIntList(tree.getChild(i));
				break;
				case "VAR":
					name = tree.getChild(i).getChild(0).toString();
				break;
				case "TERRITORY":
						territory.put(tree.getChild(i).getChild(0).toString(),
						Integer.parseInt(tree.getChild(i).getChild(1).toString()));
				break;
				case "ZONE":
					for(int j = 0; j < tree.getChild(i).getChildCount(); j++) {
						zone.add(tree.getChild(i).getChild(j).toString());
					}
				break;
				case "SAFEROOM":
					saferoom = true;
				break;
			}
		}
		
		// system.out.println("X " + xList);
		// system.out.println("Y " + yList);
		// system.out.println("Name " + name);
		
		return new LevelBlockInfo(blockNumber, name, xList, yList, territory, zone, saferoom, missionManager, level, combatMembersManager);
	}

	private static List<Integer> createIntList(Tree tree) {
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < tree.getChildCount(); i++) {
			integers.add(Integer.parseInt(tree.getChild(i).toString()));
		}
		return integers;
	}

	private static void runCommands(Tree tree) {
		
		if(tree.getChild(0).toString().equals("COMMAND_CALL")) {
			// Call command
			// system.out.println("   " + tree.getChild(0).getChild(0));
			return;
		}
		
	}
	
}
