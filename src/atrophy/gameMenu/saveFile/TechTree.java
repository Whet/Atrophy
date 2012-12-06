package atrophy.gameMenu.saveFile;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TechTree implements Serializable{

	private static final long serialVersionUID = 8090505425163520543L;

	public static final String SUPER_PROJECTILES = 			"Super Projectiles";
	public static final String PLASMA_CONTAINMENT = 		"Plasma Containment";
	public static final String ADVANCED_WEAPONRY = 			"Advanced Weaponry";
	public static final String ADVANCED_SUIT_THRUSTERS = 	"Advanced Suit Thrusters";
	public static final String MOBILE_CLOAKING = 			"Mobile Cloaking";
	public static final String STATIONARY_CLOAKING = 		"Stationary Cloaking";
	public static final String OPTICS = 					"Optics";
	public static final String SCIENTIFIC_OBSERVATIONS = 	"Scientific Observations";
	public static final String SUIT_COMMUNICATION =			"Suit Communication";
	public static final String BASIC_TOOLS = 				"Basic Tools";
	public static final String CONFLICT_WEAPONRY = 			"Conflict Weaponry";
	public static final String IMPROVED_AP_FIREARMS = 		"Improved AP Firearms";
	public static final String AP_FIREARMS = 				"AP Firearms";
	public static final String IMPROVED_FIREARMS = 			"Improved Firearms";
	public static final String FIREARMS = 					"Firearms";
	public static final String BOUNTY_HUNTING = 			"Bounty Hunting";
	public static final String CALIBRATION = 				"Calibration";
	public static final String MECHANICAL_WEAPONS = 		"Mechanical Weapons";
	public static final String HEAVY_ARMOUR = 				"Heavy Armour";
	public static final String BASIC_ARMOUR = 				"Basic Armour";
	public static final String BASIC_INCAPACITATION = 		"Basic Incapacitation";
	public static final String BASIC_EXPLOSIVES = 			"Basic Explosives";
	public static final String SPACE_WALKING = 				"Space Walking";
	
	private static TechTree instance;
	
	public static TechTree getInstance(){
		
		if(instance == null)
			instance = new TechTree();
		
		return instance;
	}
	
	public static void setInstance(TechTree techTree) {
		instance = techTree;
	}
	
	public static void newInstance() {
		instance = new TechTree();
	}
	
	private Map<String, TechnologyNode> techTree;
	
	public TechTree(Map<String, TechnologyNode> techTree){
		this.techTree = techTree;
	}
	
	public TechTree(){

		techTree = new HashMap<String, TechTree.TechnologyNode>();
		
		createTechTree();
		
	}
	
	private void createTechTree() {

		// Always unlocked
		TechnologyNode base = new TechnologyNode(null, SPACE_WALKING,0,0,0,0);
		base.setResearched(true);
		techTree.put(SPACE_WALKING,base);
		
		TechnologyNode grenades = new TechnologyNode(new TechnologyNode[]{base}, BASIC_EXPLOSIVES,0,1,2,0);
		techTree.put(BASIC_EXPLOSIVES,grenades);
		
		TechnologyNode stunGrenades = new TechnologyNode(new TechnologyNode[]{grenades}, BASIC_INCAPACITATION,0,0,0,0);
		techTree.put(BASIC_INCAPACITATION,stunGrenades);
		
		
		TechnologyNode basicArmour = new TechnologyNode(new TechnologyNode[]{base}, BASIC_ARMOUR,0,2,0,0);
		techTree.put(BASIC_ARMOUR,basicArmour);
		
		TechnologyNode heavyArmour = new TechnologyNode(new TechnologyNode[]{basicArmour}, HEAVY_ARMOUR,0,3,0,0);
		techTree.put(HEAVY_ARMOUR,heavyArmour);
		
		
		TechnologyNode mechanicalWeapons = new TechnologyNode(new TechnologyNode[]{base}, MECHANICAL_WEAPONS,0,1,1,0);
		techTree.put(MECHANICAL_WEAPONS,mechanicalWeapons);
		
		TechnologyNode impMechanicalWeapons = new TechnologyNode(new TechnologyNode[]{mechanicalWeapons}, CALIBRATION,1,2,0,0);
		techTree.put(CALIBRATION,impMechanicalWeapons);
		
		TechnologyNode cadTags = new TechnologyNode(new TechnologyNode[]{mechanicalWeapons}, BOUNTY_HUNTING,1,0,0,3);
		techTree.put(BOUNTY_HUNTING,cadTags);
		
		TechnologyNode firearm1 = new TechnologyNode(new TechnologyNode[]{impMechanicalWeapons}, FIREARMS,0,1,5,0);
		techTree.put(FIREARMS,firearm1);
		
		TechnologyNode firearm2 = new TechnologyNode(new TechnologyNode[]{firearm1}, IMPROVED_FIREARMS,1,0,2,0);
		techTree.put(IMPROVED_FIREARMS,firearm2);
		
		TechnologyNode firearm3 = new TechnologyNode(new TechnologyNode[]{firearm1}, AP_FIREARMS,0,0,3,0);
		techTree.put(AP_FIREARMS,firearm3);
		
		TechnologyNode firearm4 = new TechnologyNode(new TechnologyNode[]{firearm3}, IMPROVED_AP_FIREARMS,2,0,3,0);
		techTree.put(IMPROVED_AP_FIREARMS,firearm4);
		
		TechnologyNode shotgun1 = new TechnologyNode(new TechnologyNode[]{firearm3}, CONFLICT_WEAPONRY,0,0,6,0);
		techTree.put(CONFLICT_WEAPONRY,shotgun1);
		
		
		TechnologyNode weldTool = new TechnologyNode(new TechnologyNode[]{base}, BASIC_TOOLS,0,2,0,0);
		techTree.put(BASIC_TOOLS,weldTool);
		
		TechnologyNode unitDetector = new TechnologyNode(new TechnologyNode[]{weldTool,heavyArmour}, SUIT_COMMUNICATION,4,1,0,0);
		techTree.put(SUIT_COMMUNICATION,unitDetector);
		
		TechnologyNode scienceScanner = new TechnologyNode(new TechnologyNode[]{unitDetector}, SCIENTIFIC_OBSERVATIONS,3,1,0,0);
		techTree.put(SCIENTIFIC_OBSERVATIONS,scienceScanner);
		
		TechnologyNode optics = new TechnologyNode(new TechnologyNode[]{unitDetector}, OPTICS,3,2,0,0);
		techTree.put(OPTICS,optics);
		
		TechnologyNode cloaking = new TechnologyNode(new TechnologyNode[]{optics}, STATIONARY_CLOAKING,8,3,0,2);
		techTree.put(STATIONARY_CLOAKING,cloaking);
		
		TechnologyNode cloaking1 = new TechnologyNode(new TechnologyNode[]{cloaking}, MOBILE_CLOAKING,0,0,0,0);
		techTree.put(MOBILE_CLOAKING,cloaking1);
		
		TechnologyNode suitControl = new TechnologyNode(new TechnologyNode[]{unitDetector}, ADVANCED_SUIT_THRUSTERS,4,1,0,0);
		techTree.put(ADVANCED_SUIT_THRUSTERS,suitControl);

		
		TechnologyNode plasmaWeapons = new TechnologyNode(new TechnologyNode[]{suitControl, shotgun1, optics}, ADVANCED_WEAPONRY,3,3,3,0);
		techTree.put(ADVANCED_WEAPONRY,plasmaWeapons);
		
		TechnologyNode plasmaWeapons1 = new TechnologyNode(new TechnologyNode[]{plasmaWeapons}, PLASMA_CONTAINMENT,3,0,3,0);
		techTree.put(PLASMA_CONTAINMENT,plasmaWeapons1);
		
		TechnologyNode railgun = new TechnologyNode(new TechnologyNode[]{plasmaWeapons}, SUPER_PROJECTILES,5,2,5,0);
		techTree.put(SUPER_PROJECTILES,railgun);
		
	}
	
	public boolean isResearched(String techName){
		return getTech(techName).isResearched();
	}
	
	private TechnologyNode getTech(String techName){
		return this.techTree.get(techName);
	}

	private static class TechnologyNode implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -3058448921318626089L;

		private TechnologyNode[] parentNodes;
		
		private String tech;
		
		// Science, Engineering, Weapon, Medical
		private int[] researchRequirements;
		
		private boolean isResearched;
		
		public TechnologyNode(TechnologyNode[] parentNodes, String tech, int science, int engineering, int weapons, int medical){
			this.parentNodes = parentNodes;
			this.tech = tech;
			this.researchRequirements = new int[]{science,engineering,weapons,medical};
			this.isResearched = false;
		}

		public TechnologyNode[] getParentNodes() {
			return parentNodes;
		}

		public String getTech() {
			return tech;
		}

		public int[] getResearchRequirements() {
			return researchRequirements;
		}

		public boolean isResearched() {
			return isResearched;
		}

		public void setResearched(boolean isResearched) {
			this.isResearched = isResearched;
		}
		
	}

}
