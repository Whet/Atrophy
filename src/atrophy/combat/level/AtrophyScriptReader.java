package atrophy.combat.level;

import java.awt.Polygon;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
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
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.ai.AiGeneratorInterface.GenerateCommand;
import atrophy.combat.ai.AiGeneratorInterface.SoloGenerateCommand;
import atrophy.combat.ai.conversation.Dialogue;
import atrophy.combat.ai.conversation.TalkMap;
import atrophy.combat.display.AiCrowd;
import atrophy.combat.display.ui.MessageBox;
import atrophy.combat.items.GrenadeItem;
import atrophy.combat.items.Item;
import atrophy.combat.items.StunGrenadeItem;
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
		Stack<StoredCommand> commandStack = new Stack<>();
		
		Level level = new Level(owner);
		
		Tree initTree = AtrophyScriptReader.walkTree(level, prog.tree, blockStack, portalStack, commandStack, missionsManager, combatMembersManager, missions, messageBox, aiCrowd, combatMembersManager);
		
		level.setBlocks(blockStack);
		level.generatePortals(portalStack, level);
		panningManager.setMaxOffsets(level.getSize());
		level.spawnItems(engineeringChance,medicalChance,weaponChance,scienceChance);
		missionsManager.addCommands(commandStack);
		
		if(initTree != null)
			runCommands(initTree, missionsManager);
		
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
					combatMembersManager.getCommander(entry.getKey()).setBlockHeuristic(levelBlock, entry.getValue());
				}
			}
			
			levelBlock.createNavigationGrid();
			if(saferoom)
				level.addSaferoom(levelBlock);
			
			for(RegionInfo region : this.cover) {
				Polygon regionPolygon = new Polygon();
				for(int i = 0; i < region.xList.size(); i++) {
					regionPolygon.addPoint(region.xList.get(i), region.yList.get(i));
				}
				
				levelBlock.addCover(regionPolygon);
			}
			for(RegionInfo region : this.stashes) {
				Polygon regionPolygon = new Polygon();
				for(int i = 0; i < region.xList.size(); i++) {
					regionPolygon.addPoint(region.xList.get(i), region.yList.get(i));
				}
				
				levelBlock.addStash(regionPolygon);
			}
			
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
	
	public static Tree walkTree(Level level, Tree tree, Stack<LevelBlockInfo> blockStack, Stack<PortalInfo> portalStack, Stack<StoredCommand> commands, MissionManager missionManager, CombatMembersManager combatMembersManager, Missions missions, MessageBox messageBox, AiCrowd aiCrowd, CombatMembersManager combatMembersManager2) {
		Tree initTree = null;		
		int blockNumber = 0;
		
		switch(tree.toString()) {
			case "INIT":
				return tree;
			case "MAPSIZE":
				List<Integer> size = createIntList(tree);
				int[] sizeArray = {size.get(0), -size.get(1), size.get(2), -size.get(3)};
				level.setSize(sizeArray);
				return null;
			case "BLOCK":
				blockStack.add(createBlock(blockNumber, tree, missionManager, level, combatMembersManager));
				blockNumber++;
				return null;
			case "PORTAL":
				portalStack.add(createPortal(tree));
				return null;
			case "TEXTUREBLOCK":
				createRegion(tree);
				return null;
			case "TRIGGER":
				//TODO
				createTrigger(tree, missionManager, missions, aiCrowd, messageBox, combatMembersManager);
				return null;
			case "COMMAND":
				commands.add(createCommand(tree, missionManager, missions, aiCrowd, messageBox, combatMembersManager));
				return null;
			case "TALK":
				TalkInfo talkInfo = createTalkTopic(tree, missions, missionManager, messageBox);
				missionManager.getTalkMap(talkInfo.parent).addDialogue(talkInfo.talkStage, talkInfo.dialogue);
				return null;
			case "MAPSPAWNS":
				Set<String> allowedSpawns = new HashSet<>();
				for(int i = 0 ; i < tree.getChildCount(); i++) {
					allowedSpawns.add(tree.getChild(i).toString().replaceAll("_", " "));
				}
				
				level.setAllowedSpawns(allowedSpawns);
				return null;
		}
		
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			Tree returnTree = walkTree(level, tree.getChild(i), blockStack, portalStack, commands, missionManager, combatMembersManager, missions, messageBox, aiCrowd, combatMembersManager2);
			
			if(returnTree != null)
				initTree = returnTree;
		}
		
		return initTree;
	}
	
	protected static class StoredCommand {
		
		public String name;
		public List<TriggerEffect> effects;
		
		public StoredCommand(String name, List<TriggerEffect> effects) {
			this.name = name;
			this.effects = effects;
		}
		
		public void run() {
			for(int i = 0; i < this.effects.size(); i++) {
				this.effects.get(i).run();
			}
		}
		
	}
	
	protected static class TriggerCommand extends StoredCommand {

		public List<TriggerCond> conditions;
		
		public TriggerCommand(String name, List<TriggerEffect> effects, List<TriggerCond> conditions) {
			super(name, effects);
			this.conditions = conditions;
		}
		
		@Override
		public void run() {
			if(conditionsMet())
				super.run();
		}

		private boolean conditionsMet() {
			return true;
		}
		
	}
	
	private static StoredCommand createCommand(Tree tree, MissionManager missionManager, Missions missions, AiCrowd aiCrowd, MessageBox messageBox, CombatMembersManager combatMembersManager) {
		
		String name = "";
		List<TriggerEffect> effects = new ArrayList<>();
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "TRIGGEREFFECT":
					effects = createEffects(tree.getChild(i), missionManager, missions, aiCrowd, messageBox, combatMembersManager);
				break;
				case "VAR":
					name = tree.getChild(i).getChild(0).toString();
				break;
			}
		}
		
		return new StoredCommand(name, effects);
		
	}

	private static void createTrigger(Tree tree, MissionManager missionManager, Missions missions, AiCrowd aiCrowd, MessageBox messageBox, CombatMembersManager combatMembersManager) {
		
		String name = "";
		TriggerCond condition = null;
		List<TriggerEffect> effects = new ArrayList<>();
		
		for(int i = 0 ; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "TRIGGERCOND":
					condition = new TriggerCond(tree.getChild(i));
				break;
				case "TRIGGEREFFECT":
					effects = createEffects(tree.getChild(i), missionManager, missions, aiCrowd, messageBox, combatMembersManager);
				break;
				case "VAR":
					name = tree.getChild(i).getChild(0).toString();
				break;
			}
		}
		
	}
	
	private static class TriggerCond {
		
		public TriggerCond(Tree child) {
			// TODO Auto-generated constructor stub
		}

		private static abstract class TruthCond {
			
			public abstract boolean truthCheck();
			
		}
		
		private static class AND extends TruthCond{
			TriggerCond op1, op2;
			
			public AND(TriggerCond op1, TriggerCond op2) {
				this.op1 = op1;
				this.op2 = op2;
			}
			
			@Override
			public boolean truthCheck() {
				return true;
			}
		}
		
	}
	
	protected abstract static class TriggerEffect {
		
		public abstract void run();
		
	}
	
	protected abstract static class UnitInfoEffect extends TriggerEffect {
		
		protected List<String> possibleNames;
		protected List<String> possibleFactions;
		protected List<String> possibleItems;
		protected List<String> possibleWeapons;
		protected Boolean mustBeAlive;
		protected Boolean mustBeInvestigated;
		protected Boolean isDaemon;
		protected List<Integer> xList;
		protected List<Integer> yList;
		protected Integer minTeamSize;
		protected Integer maxTeamSize;
		protected AiCrowd aiCrowd;
		
		public UnitInfoEffect(Tree tree, AiCrowd aiCrowd) {
			this.aiCrowd = aiCrowd;
			processUnitInfo(tree);
		}

		private void processUnitInfo(Tree tree) {
			for(int i = 0; i < tree.getChildCount(); i++) {
				switch(tree.getChild(i).toString()) {
					case "ISNAME":
						possibleNames = new ArrayList<>();
						for(int j = 0; j < tree.getChild(i).getChildCount(); j++) {
							possibleNames.add(tree.getChild(i).getChild(j).toString().replaceAll("_", " "));
						}
					break;
					case "ISFACTION":
						possibleFactions = new ArrayList<>();
						for(int j = 0; j < tree.getChild(i).getChildCount(); j++) {
							possibleFactions.add(tree.getChild(i).getChild(j).toString().replaceAll("_", " "));
						}
					break;
					case "HASITEM":
						possibleItems = new ArrayList<>();
						for(int j = 0; j < tree.getChild(i).getChildCount(); j++) {
							possibleItems.add(tree.getChild(i).getChild(j).toString().replaceAll("_", " "));
						}
					break;
					case "HASWEAPON":
						possibleWeapons = new ArrayList<>();
						for(int j = 0; j < tree.getChild(i).getChildCount(); j++) {
							possibleWeapons.add(tree.getChild(i).getChild(j).toString().replaceAll("_", " "));
						}
					break;
					case "ISALIVE":
						mustBeAlive = true;
					break;
					case "ISDEAD":
						mustBeAlive = false;
					break;
					case "ISINVESTIGATED":
						mustBeInvestigated = true;
					break;
					case "ISNOTINVESTIGATED":
						mustBeInvestigated = false;
					break;
					case "ISDAEMON":
						isDaemon = true;
					break;
					case "ISNOTDAEMON":
						isDaemon = false;
					break;
					case "TELEDEST":
						xList = createIntList(tree.getChild(i).getChild(0));
						yList = createIntList(tree.getChild(i).getChild(1));
					break;
					case "MINTEAMSIZE":
						minTeamSize = Integer.parseInt(tree.getChild(i).getChild(0).toString());
					break;
					case "MAXTEAMSIZE":
						maxTeamSize = Integer.parseInt(tree.getChild(i).getChild(0).toString());
					break;
				}
			}
		}
		
		protected List<Ai> matchAi() {
			List<Ai> matchingAi = new ArrayList<>();
			
			for(Ai ai : this.aiCrowd.getActors()) {
				if( (possibleNames == null || possibleNames.contains(ai.getName())) &&
					(possibleFactions == null || possibleFactions.contains(ai.getFaction())) &&
					(possibleWeapons == null || possibleWeapons.contains(ai.getWeapon().getName())) &&
					(mustBeAlive == null || ai.isDead() == !mustBeAlive)) {
					
					if(possibleItems != null) {
						boolean hasItem = false;
						for(int i = 0; i < ai.getInventory().getItemCount(); i++) {
							if(possibleItems.contains(ai.getInventory().getItemAt(i).getName()))
								hasItem = true;
						}
						
						if(!hasItem)
							continue;
					}
					
					matchingAi.add(ai);
					
				}
			}
			
			return matchingAi;
		}
		
	}
	
	protected static class SpawnTeamEffect extends UnitInfoEffect {

		public AiGenerator aiGenerator;
		
		public SpawnTeamEffect(Tree tree, AiCrowd aiCrowd) {
			super(tree, aiCrowd);
		}

		@Override
		public void run() {
			aiGenerator.spawnAi(new GenerateCommand((int)minTeamSize, (int)maxTeamSize,
													this.possibleItems, this.possibleWeapons,
													this.possibleFactions.get(new Random().nextInt(this.possibleFactions.size()))));
		}
		
	}
	
	protected static final class SpawnCharacterEffect extends SpawnTeamEffect {
		
		public SpawnCharacterEffect(Tree tree, AiCrowd aiCrowd) {
			super(tree, aiCrowd);
		}
		
		@Override
		public void run() {
			
			String[] items;
			
			if(possibleItems.size() > 5) {
				
				List<String> itemList = new ArrayList<>();
				
				int randomItemCount = new Random().nextInt(5);
				
				for(int i = 0; i < randomItemCount; i++){
					String item = this.possibleItems.get(new Random().nextInt(possibleItems.size()));
					
					if(itemList.contains(item) && !item.equals(GrenadeItem.NAME) && !item.equals(StunGrenadeItem.NAME))
						itemList.add(item);
				}

				items = new String[itemList.size()];
				
				for(int i = 0; i < itemList.size(); i++) {
					items[i] = itemList.get(i);
				}
				
			}
			else {
				items = new String[possibleItems.size()];
				
				for(int i = 0; i < this.possibleItems.size(); i++) {
					items[i] = this.possibleItems.get(i);
				}
			}
			
			aiGenerator.spawnAi(new SoloGenerateCommand(this.xList.get(new Random().nextInt(this.xList.size())),
														this.yList.get(new Random().nextInt(this.yList.size())),
														this.possibleFactions.get(new Random().nextInt(this.possibleFactions.size())),
														isDaemon,
														this.possibleNames.get(new Random().nextInt(this.possibleNames.size())),
														this.possibleWeapons.get(new Random().nextInt(this.possibleWeapons.size())),
														items));
		}
		
	}
	
	protected static final class RemoveEffect extends UnitInfoEffect {

		public RemoveEffect(Tree tree, AiCrowd aiCrowd) {
			super(tree, aiCrowd);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	protected static final class KillEffect extends UnitInfoEffect {

		public KillEffect(Tree tree, AiCrowd aiCrowd) {
			super(tree, aiCrowd);
		}

		@Override
		public void run() {
			for(Ai ai:matchAi()) {
				ai.setDead(true);
			}
		}
		
	}
	
	protected static final class TeleportEffect extends UnitInfoEffect {

		public TeleportEffect(Tree tree, AiCrowd aiCrowd) {
			super(tree, aiCrowd);
		}

		@Override
		public void run() {
			List<Ai> matchAi = matchAi();
			
			for(int i = 0; i < matchAi.size(); i++) {
				
				int rand = new Random().nextInt(this.xList.size());
				
				matchAi.get(i).setLocation(this.xList.get(rand), this.yList.get(rand));
			}
		}
		
	}
	
	protected static final class ConverseEffect extends UnitInfoEffect {

		private MessageBox messageBox;
		private CombatMembersManager combatMembersManager;
		
		public ConverseEffect(Tree tree, AiCrowd aiCrowd, MessageBox messageBox, CombatMembersManager combatMembersManager) {
			super(tree, aiCrowd);
			this.messageBox = messageBox;
			this.combatMembersManager = combatMembersManager;
		}

		@Override
		public void run() {
			List<Ai> matchAi = matchAi();
			Ai ai = matchAi.get(new Random().nextInt(matchAi.size()));
			
			if(ai instanceof ThinkingAi && ((ThinkingAi) ai).getAiNode() != null)
				messageBox.setConversation(combatMembersManager.getCurrentAi(), ai, ((ThinkingAi) ai).getAiNode().getInitiatorDialogue());
			else
				messageBox.setConversation(combatMembersManager.getCurrentAi(), ai);
			
			messageBox.setVisible(true);
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
	
	protected static final class MakeSaferoomEffect extends RoomInfoEffect {

		public MakeSaferoomEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	protected static final class RemoveSaferoomEffect extends RoomInfoEffect {

		public RemoveSaferoomEffect(Tree tree) {
			super(tree);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	protected static final class LoadMapEffect extends TriggerEffect {
		
		public LoadMapEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	protected static final class LockDoorEffect extends TriggerEffect {
			
			public LockDoorEffect(Tree tree) {
				
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}
	
	protected static final class UnlockDoorEffect extends TriggerEffect {
		
		public UnlockDoorEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	protected static final class AddTagEffect extends TriggerEffect {
			
			private Missions missions;
			private String tag;
		
			public AddTagEffect(Tree tree, Missions missions) {
				this.missions = missions;
				this.tag = tree.getChild(0).toString();
			}

			@Override
			public void run() {
				this.missions.addMemCode(tag);
			}
			
		}
	
	protected static final class RemoveTagEffect extends TriggerEffect {
		
		private Missions missions;
		private String tag;
		
		public RemoveTagEffect(Tree tree, Missions missions) {
			this.missions = missions;
			this.tag = tree.getChild(0).toString();
		}

		@Override
		public void run() {
			this.missions.removeMemCode(tag);
		}
		
	}
	
	protected static final class ModifyDirectorEffect extends TriggerEffect {
		
		public ModifyDirectorEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	protected static final class ChangeAiNodeEffect extends TriggerEffect {
		
		public ChangeAiNodeEffect(Tree tree) {
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	protected static final class UpdateTalkEffect extends TriggerEffect {
			
			private MissionManager missionManager;
			private String talkMap;
			private int stage;
		
			public UpdateTalkEffect(Tree tree, MissionManager missionManager) {
				this.missionManager = missionManager;
				this.talkMap = tree.getChild(0).toString();
				this.stage = Integer.parseInt(tree.getChild(1).toString());
			}

			@Override
			public void run() {
				missionManager.getTalkMap(talkMap).setToStage(stage);
			}
			
		}
	
	protected static final class CommandCallEffect extends TriggerEffect {
		
		private final MissionManager missionManager;
		private final String commandTag;
		
		public CommandCallEffect(Tree tree, MissionManager missionManager) {
			this.missionManager = missionManager;
			commandTag = tree.getChild(0).toString();
		}

		@Override
		public void run() {
			missionManager.runCommand(commandTag);			
		}
		
	}
	
	private static List<TriggerEffect> createEffects(Tree tree, MissionManager missionManager, Missions missions, AiCrowd aiCrowd, MessageBox messageBox, CombatMembersManager combatMembersManager) {
		List<TriggerEffect> effects = new ArrayList<>();
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			switch(tree.getChild(i).toString()) {
				case "SPAWNTEAM":
					effects.add(new SpawnTeamEffect(tree.getChild(i), aiCrowd));
				break;
				case "SPAWNCHARACTER":
					effects.add(new SpawnCharacterEffect(tree.getChild(i), aiCrowd));
				break;
				case "REMOVEUNIT":
					effects.add(new RemoveEffect(tree.getChild(i), aiCrowd));
				break;
				case "KILLUNIT":
					effects.add(new KillEffect(tree.getChild(i), aiCrowd));
				break;
				case "TELEPORT":
					effects.add(new TeleportEffect(tree.getChild(i), aiCrowd));
				break;
				case "CONVERSE":
					effects.add(new ConverseEffect(tree.getChild(i), aiCrowd, messageBox, combatMembersManager));
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
					effects.add(new AddTagEffect(tree.getChild(i), missions));
				break;
				case "REMOVETAG":
					effects.add(new RemoveTagEffect(tree.getChild(i), missions));
				break;
				case "DIRECTORBIAS":
					effects.add(new ModifyDirectorEffect(tree.getChild(i)));
				break;
				case "CHANGEAINODE":
					effects.add(new ChangeAiNodeEffect(tree.getChild(i)));
				break;
				case "UPDATETALK":
					effects.add(new UpdateTalkEffect(tree.getChild(i), missionManager));
				break;
				case "COMMAND CALL":
					effects.add(new CommandCallEffect(tree.getChild(i), missionManager));
				break;
			}
		}
		
		return effects;
	}

	private static class TalkInfo {
		
		public final String parent;
		public final Integer talkStage;
		public final Dialogue dialogue;
		
		public TalkInfo(String parent, Integer talkStage, Dialogue dialogue) {
			this.parent = parent;
			this.talkStage = talkStage;
			this.dialogue = dialogue;
		}
		
	}
	
	private static TalkInfo createTalkTopic(Tree tree, Missions missions, MissionManager missionManager, MessageBox messageBox) {

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
					openingLine = createString(tree.getChild(i));
				break;
				case "LINE":
					lines.add(createString(tree.getChild(i)));
				break;
			}
		}
		
		String[] options = new String[lines.size()];
		
		for(int i = 0; i < lines.size(); i++) {
			options[i] = lines.get(i);
		}
		
		if(missionManager.getTalkMap(parent) == null)
			missionManager.addTalkMap(parent, new TalkMap(parent));
		
		return new TalkInfo(parent, talkStage, messageBox.createDialogue(missions, missionManager, openingLine, options, aiInit));
	}
	
	private static RegionInfo createRegion(Tree tree) {
		
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
		
		return new RegionInfo(name, xList, yList);
	}

	private static PortalInfo createPortal(Tree tree) {
		
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
		
		return new PortalInfo(name, security, xList, yList);
	}

	private static LevelBlockInfo createBlock(int blockNumber, Tree tree, MissionManager missionManager, Level level, CombatMembersManager combatMembersManager) {
		
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		String name = "";
		Map<String, Integer> territory = new HashMap<String, Integer>();
		List<String> zone = new ArrayList<>();
		boolean saferoom = false;
		List<RegionInfo> stashes = new ArrayList<>();
		List<RegionInfo> cover = new ArrayList<>();
		
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
						territory.put(tree.getChild(i).getChild(0).toString().replaceAll("_", " "),
						Integer.parseInt(tree.getChild(i).getChild(1).toString()));
				break;
				case "ZONE":
					for(int j = 0; j < tree.getChild(i).getChildCount(); j++) {
						zone.add(tree.getChild(i).getChild(j).toString().replaceAll("_", " "));
					}
				break;
				case "SAFEROOM":
					saferoom = true;
				break;
				case "COVER":
					cover.add(createRegion(tree.getChild(i)));
				break;
				case "STASH":
					stashes.add(createRegion(tree.getChild(i)));
				break;
			}
		}
		
		LevelBlockInfo levelBlockInfo = new LevelBlockInfo(blockNumber, name, xList, yList, territory, zone, saferoom, missionManager, level, combatMembersManager);
		
		for(RegionInfo info : stashes) {
			levelBlockInfo.addStash(info);
		}
		for(RegionInfo info : cover) {
			levelBlockInfo.addCover(info);
		}
		
		return levelBlockInfo;
	}

	private static List<Integer> createIntList(Tree tree) {
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < tree.getChildCount(); i++) {
			integers.add(Integer.parseInt(tree.getChild(i).toString()));
		}
		return integers;
	}
	
	private static String createString(Tree tree) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < tree.getChildCount(); i++) {
			if(i > 0)
				sb.append(" ");
			
			sb.append(tree.getChild(i).toString());
		}
		return sb.toString();
	}

	private static void runCommands(Tree tree, MissionManager missionManager) {
		
		for(int i = 0; i < tree.getChildCount(); i++) {
			if(tree.getChild(i).toString().equals("COMMAND_CALL")) {
				String commandTag = tree.getChild(i).getChild(0).toString();
				missionManager.addInitCommand(commandTag);
			}
		}
		
	}
	
}
