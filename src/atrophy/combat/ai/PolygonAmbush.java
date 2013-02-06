/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.ai;

import java.awt.Polygon;
import java.util.HashMap;
import java.util.Random;

import watoydoEngine.gubbinz.Maths;
import atrophy.combat.ai.ThinkingAi.AiMode;
import atrophy.combat.mechanics.Abilities;

// TODO: Auto-generated Javadoc
/**
 * The Class PolygonAmbush.
 */
public class PolygonAmbush extends Formation {
	
	/**
	 * The Constant CORNER_INDENT_RATIO.
	 */
	private static final double CORNER_INDENT_RATIO = 0.1;
	
	/**
	 * The offset.
	 */
	private int offset;

	/**
	 * The spacing.
	 */
	private int spacing;
	
	/**
	 * The ai to region.
	 */
	private HashMap<Ai, Polygon> aiToRegion;
	
	/**
	 * Instantiates a new polygon ambush.
	 */
	public PolygonAmbush(){
		super();
		formationType = AiMode.CAMPING;
		aiToRegion = new HashMap<Ai, Polygon>();
		randomiseElements();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.formations.Formation#getHeading(atrophy.combat.ai.thinkingAi.ThinkingAi)
	 */
	public double getHeading(ThinkingAi ai){
		
		for(int i = 0; i < this.participants.size(); i++){
			
			if(this.participants.get(i) == ai){
		
				if(ai.getLevelBlock().getStealthRegion().size() > 0 && i%2 != 0){
					return new Random().nextInt(360);
				}
				
				return Maths.getDegrees(ai.getLocation(), ai.getLevelBlock().getCentre());
			}
		}
		
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.formations.Formation#getLocation(atrophy.combat.ai.thinkingAi.ThinkingAi)
	 */
	public double[] getLocation(ThinkingAi ai){
		
		for(int i = 0; i < this.participants.size(); i++){
		
			if(this.participants.get(i) == ai){
				
				// try to move into a stealth region if they exist
				// alternate to avoid stacking in stealth region
				if(ai.getLevelBlock().getStealthRegion().size() > 0 && i%2 != 0 && !this.aiToRegion.containsKey(ai)){
					try {
						aiToRegion.put(ai, ai.moveTowardsRandomRegion(ai.getLevelBlock().getStealthRegion()));
						return ai.getMoveLocation();
					} 
					catch (PathNotFoundException e) {}
				}
				else if(this.aiToRegion.containsKey(ai)){	
					double[] loc = {this.aiToRegion.get(ai).getBounds2D().getCenterX() + ai.getLevelBlock().getLocation()[0],
							        this.aiToRegion.get(ai).getBounds2D().getCenterY() + ai.getLevelBlock().getLocation()[1]};
					return loc;
				}
				
				
				i += this.offset;
				i += i * this.spacing;
				
				while(i >= ai.getLevelBlock().getHitBox().npoints){
					i -= ai.getLevelBlock().getHitBox().npoints;
				}
				
				double[] vertex = {ai.getLevelBlock().getHitBox().xpoints[i],
                        		   ai.getLevelBlock().getHitBox().ypoints[i]};
				
				// move slightly towards centre from vertex to avoid trying to enter an adjacent room
				double[] centre = {ai.getLevelBlock().getHitBox().getBounds2D().getCenterX(),
						           ai.getLevelBlock().getHitBox().getBounds2D().getCenterY()};
		
				double dx = Math.abs(vertex[0] - centre[0]);
				double dy = Math.abs(vertex[1] - centre[1]);
				
				if(vertex[0] > centre[0]){
					vertex[0] = vertex[0] - (CORNER_INDENT_RATIO * dx);
				}
				else{
					vertex[0] = vertex[0] + (CORNER_INDENT_RATIO * dx);
				}
				
				if(vertex[1] > centre[1]){
					vertex[1] = vertex[1] - (CORNER_INDENT_RATIO * dy);
				}
				else{
					vertex[1] = vertex[1] + (CORNER_INDENT_RATIO * dy);
				}
				
				return vertex;
			}
		}
		System.out.println("null on polyambush");
		// not reached
		return null;
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.formations.Formation#randomiseElements()
	 */
	@Override
	public void randomiseElements(){
		Random rand = new Random();
		// should be the int, the number pof portals in the target room
		offset = rand.nextInt(9);
		spacing = rand.nextInt(3);
		aiToRegion.clear();
	}
	
	/* (non-Javadoc)
	 * @see atrophy.combat.ai.formations.Formation#prioritiseUnits()
	 */
	@Override
	protected void prioritiseUnits(){
		ThinkingAi swapAi = this.participants.get(0);
		
		// loop to assign an ai with scanning to be the leader or cloaked ai to be in the corners
		for(int i = 1; i < this.participants.size(); i++){
			if(this.participants.get(i).hasAbility(Abilities.XRAY_SCAN)){
				swapAi = this.participants.get(i);
				break;
			}
			if(swapAi.hasAbility(Abilities.STEALTH1) && !this.participants.get(i).hasAbility(Abilities.STEALTH1)){
				swapAi = this.participants.get(i);
				// don't break in case a sensor is found
			}
		}
		
		// insert highest armoured at start
		participants.remove(swapAi);
		participants.add(0, swapAi);
	}
	
}
