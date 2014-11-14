package atrophy.combat.display;

import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.display.ButtonSingle;
import watoydoEngine.sounds.SoundBoard;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.ai.Ai;

public class AiImageRoster extends ButtonSingle {
	
	private Ai aiObject;
	protected AiCrowd aiCrowd;
	protected CombatMembersManager combatMembersManager;
	
	public AiImageRoster(AiCrowd aiCrowd, CombatMembersManager combatMembersManager, Ai ai, double x, double y){
		super(null, x, y);
		this.aiObject = ai;
		this.aiCrowd = aiCrowd;
		this.combatMembersManager = combatMembersManager;
	}
	
	// just changes mask
	public void updateMask(){
		String image = aiObject.getImage();
		
		if(aiObject.isDead())
			image = image + "Dead";
		
		this.setImage(aiCrowd.getPortraitImage(image));
	}
	
	@Override
	public boolean mC(Point mousePosition, MouseEvent e){
		if(!aiObject.isDead()){
			combatMembersManager.changeCurrentAi(aiObject);
			SoundBoard.getInstance().playEffect("tick");
		}
		return true;
	}
	
	public Ai getAi(){
		return this.aiObject;
	}
	
	public void setAi(Ai aiObject){
		this.aiObject = aiObject;
	}
	
}
