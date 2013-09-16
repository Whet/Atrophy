package atrophy.combat.display;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.io.ReadWriter;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiGenerator;
import atrophy.combat.ai.TalkNode;
import atrophy.combat.ai.ThinkingAi;
import atrophy.combat.ai.VehicleAi;
import atrophy.combat.ai.director.DirectorClassification;
import atrophy.combat.ai.director.HealthDirector;
import atrophy.gameMenu.saveFile.Squad;
import atrophy.gameMenu.saveFile.Squad.Squaddie;

public class AiCrowd extends Crowd {
	
	private static final int ANIMATION_FRAME_LENGTH = 200;

	private Map<String, TalkNode> talkNodes;
	private ArrayList<Ai> actors;
	private ArrayList<AiImage> masks;
	private Map<Ai, AiImage> actorToMask;
	
	private Stack<Ai> masterStack;
	private Stack<Ai> shuffledStack;
	
	private Map<String, BufferedImage> images;
	private Map<String, AnimationBlob> animations;
	
	private Squad squad;
	
	private HealthDirector director;
	
	private static Timer animationTimer;
	
	public AiCrowd(Squad squad) {
		super(false);
		images = new HashMap<>();
		animations = new HashMap<>();
		talkNodes= new HashMap<>();
		actors = new ArrayList<Ai>();
		masks = new ArrayList<AiImage>();
		loadPortraits();
		loadAnimations();
		
		this.squad = squad;
		
		if(animationTimer != null) {
			animationTimer.cancel();
			animationTimer.purge();
		}
		
		animationTimer = new Timer();
		animationTimer.scheduleAtFixedRate(new AnimationTimerEvent(this), 0, ANIMATION_FRAME_LENGTH);
		
		this.masterStack = new Stack<Ai>();
		
		this.director = new HealthDirector(this);
		this.actorToMask = new HashMap<>();
		
	}
	
	public void lazyLoad(CombatVisualManager combatVisualManager) {
		this.director.lazyLoad(combatVisualManager);
	}
	
	public HealthDirector getDirector() {
		return director;
	}

	private static class AnimationTimerEvent extends TimerTask {

		private AiCrowd aiCrowd;

		public AnimationTimerEvent(AiCrowd aiCrowd) {
			this.aiCrowd = aiCrowd;
		}

		@Override
		public void run() {
			aiCrowd.updateAnimations();
		}
		
	}
	
	private void loadPortraits(){
		try{
			// Location of head portrait images
			String[] files = {"images/atrophy/combat/heads/beardHead.png",
							  "images/atrophy/combat/heads/beardHeadDamaged.png",
							  
							  "images/atrophy/combat/heads/messyHead.png",
							  "images/atrophy/combat/heads/messyHeadDamaged.png",
							  
							  "images/atrophy/combat/heads/nazcaHead.png",
							  "images/atrophy/combat/heads/nazcaHeadDamaged.png",
							  
							  "images/atrophy/combat/heads/plainHead.png",
							  "images/atrophy/combat/heads/plainHeadDamaged.png",
							  
							  "images/atrophy/combat/heads/raziel.png",
							  "images/atrophy/combat/heads/razielDamaged.png",
							  
							  "images/atrophy/combat/heads/stripeHead.png",
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
							  
							  "images/atrophy/combat/heads/mule.png",
							  "images/atrophy/combat/heads/muleDead.png",
							  };
			BufferedImage img;
			
			String[] names = {"BeardHead", "BeardHeadDead",
							  "MessyHead", "MessyHeadDead",
							  "NazcaHead", "NazcaHeadDead",
							  "PlainHead", "PlainHeadDead",
							  "Raziel",    "RazielDead",
							  "StripeHead","StripeHeadDead",
							  "Engineer",  "EngineerDead",
							  "Sensor",	   "SensorDead",
							  "Stealthed", "StealthedDead",
							  "Scout",	   "ScoutDead",
							  "Armour",	   "ArmourDead",
							  "Mule",	   "MuleDead"
							  };
			
			// Add all heads to the image bank
			for(int i = 0; i < files.length; i++){
				img = ImageIO.read(ReadWriter.getResourceAsInputStream(files[i]));
				this.images.put(names[i], img);
			}
		
		}
		catch(IOException ioexcept){
			System.err.println("Unable to load portraits");
			System.exit(-1);
		}
	}
	
	private void loadAnimations() {
		try{
			
			final String AF = "images/atrophy/combat/heads/animations/";
			
			String[] daemonFiles = {AF+"daemonIdleSpriteSheet.png", AF+"daemonAttackSpriteSheet.png"};
			AnimationBlob daemonBlob = new AnimationBlob(new Animation[]{Animation.IDLE_MELEE, Animation.ATTACK_MELEE}, daemonFiles, new int[]{62, 79});
			this.animations.put("DaemonFull", daemonBlob);
			
			final Animation[] ANIMATION_ORDER = {Animation.DEAD,
												 Animation.IDLE_MELEE, Animation.IDLE_WEP1, Animation.IDLE_WEP2, Animation.IDLE_WEP3,
												 Animation.ATTACK_MELEE, Animation.ATTACK_WEP1, Animation.ATTACK_WEP2, Animation.ATTACK_WEP3,
												 Animation.WALK};
			
			final int[] TILE_WIDTHS = {66,
									   43, 39, 72, 74,
									   68, 64, 72, 74,
									   33};
			
			
			String[] head1Files = {AF+"deadSpriteSheet.png", AF+"idleSpriteSheet1.png", AF+"idleSpriteSheet2.png", AF+"idleSpriteSheet3.png", AF+"idleSpriteSheet4.png", AF+"attackSpriteSheet1.png", AF+"attackSpriteSheet2.png", AF+"attackSpriteSheet3.png", AF+"attackSpriteSheet4.png", AF+"walkSpriteSheet.png"};
			AnimationBlob head1Blob = new AnimationBlob(ANIMATION_ORDER, head1Files, TILE_WIDTHS);
			this.animations.put("BeardHeadFull", head1Blob);
			this.animations.put("MessyHeadFull", head1Blob);
			this.animations.put("NazcaHeadFull", head1Blob);
			this.animations.put("PlainHeadFull", head1Blob);
			this.animations.put("RazielFull", head1Blob);
			this.animations.put("StripeHeadFull", head1Blob);
			this.animations.put("EngineerFull", head1Blob);
			this.animations.put("SensorFull", head1Blob);
			this.animations.put("StealthedFull", head1Blob);
			this.animations.put("ScoutFull", head1Blob);
			this.animations.put("ArmourFull", head1Blob);
			
			String[] head2Files = {AF+"deadSpriteSheetBandit.png", AF+"idleSpriteSheetBandit1.png", AF+"idleSpriteSheetBandit2.png", AF+"idleSpriteSheetBandit3.png", AF+"idleSpriteSheetBandit4.png", AF+"attackSpriteSheetBandit1.png", AF+"attackSpriteSheetBandit2.png", AF+"attackSpriteSheetBandit3.png", AF+"attackSpriteSheetBandit4.png", AF+"walkSpriteSheet.png"};
			AnimationBlob head2Blob = new AnimationBlob(ANIMATION_ORDER, head2Files, TILE_WIDTHS);
			this.animations.put("BanditFull", head2Blob);
			
			String[] muleFiles = {AF+"mule.png", AF+"muleDead.png"};
			AnimationBlob muleBlob = new AnimationBlob(new Animation[]{Animation.IDLE_MELEE, Animation.DEAD}, muleFiles, new int[]{30, 30});
			this.animations.put("MuleFull", muleBlob);
			
		}
		catch(IOException ioexcept){
			System.err.println("Unable to load animations");
			ioexcept.printStackTrace();
			System.exit(-1);
		}
	}
	
	public ArrayList<Ai> getShuffledAi(){
		
		ArrayList<Ai> shuffledList = new ArrayList<Ai>();
		
		// move the Ai to the shuffled list since actors needs to stay in order
		// actors.get(i) has its mask at masks.get(i)
		shuffledList.addAll(this.actors);
		
		Collections.shuffle(shuffledList);
		
		return shuffledList;
	}
	
	public Stack<Ai> getShuffledStack() {
		
		if(this.shuffledStack == null){
			this.shuffledStack = new Stack<Ai>(); 
		}
		
		if(this.shuffledStack.size() == 0){
			shuffledStack.addAll(masterStack);
		}
		
		return shuffledStack;
	}
	
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
	
	public Ai getActor(String tag){
		int i;
		
		for(i = 0; i < actors.size();i ++){
			if(actors.get(i).getName().equals(tag)){
				break;
			}
		}
		
		return actors.get(i);
	}

	public Ai getActor(int i){
		return actors.get(i);
	}
	
	public int getActorCount(){
		return actors.size();
	}
	
	public TalkNode getTalkNode(String name) {
		return this.talkNodes.get(name);
	}
	
	public void addTalkNode(TalkNode talkNode) {
		this.talkNodes.put(talkNode.getName(), talkNode);
	}
	
	public AiImage getActorMask(Ai ai){
		return this.actorToMask.get(ai);
	}
	
	public AiImage getMask(int i){
		return masks.get(i);
	}
	
	public ArrayList<Ai> getActors(){
		return this.actors;
	}
	
	public void addActor(Ai ai, DirectorClassification aiClass){
		actors.add(ai);
		
		this.masterStack.push(ai);
		
		this.director.addAi(ai, aiClass);
	}
	
	public void addMask(AiImage aiImg){
		masks.add(aiImg);
		aiImg.updateImage();
		this.actorToMask.put(aiImg.getAi(), aiImg);
	}

	public ArrayList<AiImage> getMasks() {
		return this.masks;
	}

	public Squad getSquad() {
		return squad;
	}

	public Squad saveToSquad() {
		Squad squad = new Squad();
		
		squad.setFactionRelations(this.squad.getFactionRelation(AiGenerator.WHITE_VISTA), this.squad.getFactionRelation(AiGenerator.BANDITS));
		squad.setAdvance(this.squad.getAdvance());
		
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
		squad.setTechTree(this.squad.getTechTree());
		
		return squad;
		
	}

	public void replaceAi(ThinkingAi thinkingAi, Ai playerAi) {
		for(int i = 0; i < masterStack.size(); i++){
			if(masterStack.get(i) == thinkingAi){
				masterStack.set(i, playerAi);
			}
		}
	}

	public BufferedImage getPortraitImage(String image) {
		return this.images.get(image);
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		super.drawMethod(drawShape);
	}

	public synchronized void updateAnimations() {
		for(AiImage image : this.masks) {
			image.updateAnimation();
			image.setZ((int) image.getLocation()[1]);
		}
		computeZOrder();
	}

	public BufferedImage getAnimationFrame(String image, int frame, Animation animation) {
		try {
			return this.animations.get(image).getFrame(frame, animation);
		}
		catch(NullPointerException e) {
			System.out.println(image + "  FRAME: " + frame + "  ANIMATION: " + animation.toString());
			throw e;
		}
	}
	
	private static class AnimationBlob {
		
		private Map<Animation, BufferedImage[]> animations;
		
		public AnimationBlob(final Animation[] ANIMATION_ORDER, String[] files, int[] tileWidths) throws FileNotFoundException, IOException {
			this.animations = new HashMap<>();
			
			int animationIndex = 0;
			BufferedImage[] img = null;
			
			// Load files
			for(int i = 0; i < files.length; i++){
				
				BufferedImage spriteSheet = ImageIO.read(ReadWriter.getResourceAsInputStream(files[i]));
				
				int tileWidth = tileWidths[animationIndex];
				
				img = new BufferedImage[spriteSheet.getWidth() / tileWidth];
				
				for(int k = 0; k < spriteSheet.getWidth(); k+= tileWidth) {
					img[k / tileWidth] = spriteSheet.getSubimage(k, 0, tileWidth, spriteSheet.getHeight());
				}
				
				this.animations.put(ANIMATION_ORDER[animationIndex], img);
				animationIndex++;
			}
		}
		
		public BufferedImage getFrame(int frame, Animation animation) {
			return this.animations.get(animation)[frame];
		}
		
	}

	public void shuffleAi() {
		Collections.shuffle(this.masterStack);
	}
	
}
