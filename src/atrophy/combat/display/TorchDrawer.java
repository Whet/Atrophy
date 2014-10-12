package atrophy.combat.display;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

import watoydoEngine.designObjects.display.Displayable;
import watoydoEngine.display.tweens.TweenDefinable;
import watoydoEngine.utils.GraphicsFunctions;
import watoydoEngine.utils.Maths;
import atrophy.combat.CombatMembersManager;
import atrophy.combat.CombatVisualManager;
import atrophy.combat.PanningManager;
import atrophy.combat.ai.Ai;

public class TorchDrawer implements Displayable {

	private Polygon shadowPolygon;
	private Polygon lightPolygon;
	private double oldLookAngle;
	private double[] oldLookLocation;
	
	private static final double ANGLE_TOLERANCE = 0.1;
	
	private int z;
	private boolean visible;
	
	private CombatMembersManager combatMembersManager;
	private PanningManager panningManager;
	
	public TorchDrawer(CombatMembersManager combatMembersManager, PanningManager panningManager) {
		
		this.combatMembersManager = combatMembersManager;
		this.panningManager = panningManager;
		
		shadowPolygon = new Polygon();
		lightPolygon = new Polygon();
		
		oldLookLocation = null;
		z = 0;
		visible = true;
	}
	
	public void updateFovLight(Ai ai) {
		
		if(oldLookLocation != null && ai.getLookAngle() == oldLookAngle && ai.getLocation()[0] == oldLookLocation[0] && ai.getLocation()[1] == oldLookLocation[1])
			return;
		
		oldLookAngle = ai.getLookAngle();
		oldLookLocation = new double[2];
		oldLookLocation[0] = ai.getLocation()[0];
		oldLookLocation[1] = ai.getLocation()[1];
		
		shadowPolygon.reset();
		lightPolygon.reset();
		
		int[] playerLoc = new int[]{(int) ai.getLocation()[0], (int) ai.getLocation()[1]};
		boolean placedAtPlayer = false;
		
		int[] lastPlacedPoint = null;
		int[] previousPoint = null;
		
		if(ai.isIgnoringLOS()) {
			for(double i = 0; i < 360; i += 0.5) {
				int[] lastPointNoCover = CombatVisualManager.getLastPointNoCover(playerLoc, Math.toRadians(i), ai.getLevelBlock());
				
				if(CombatVisualManager.spotFovNoRadius(ai, new double[]{lastPointNoCover[0], lastPointNoCover[1]})) {
					
					double oldAngle = 0;
					double newAngle = 0;
					
					if(previousPoint != null && lastPlacedPoint != null) {
						oldAngle = Maths.getDegrees(lastPlacedPoint, previousPoint);
						newAngle = Maths.getDegrees(lastPlacedPoint, lastPointNoCover);
					}
					
					if(lastPlacedPoint == null || Maths.angleDifference(oldAngle, newAngle) > ANGLE_TOLERANCE) {
						
						placedAtPlayer = false;
						
						if(previousPoint == null) {
							previousPoint = lastPointNoCover;
							continue;
						}
						else
							lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
						
						lightPolygon.addPoint(lastPointNoCover[0], lastPointNoCover[1]);
						lastPlacedPoint = lastPointNoCover;
					}
					
					if(lastPlacedPoint == lastPointNoCover)
						previousPoint = null;
					else
						previousPoint = lastPointNoCover;
				}
				else if(!placedAtPlayer){

					if(previousPoint != null)
						lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
					
					lightPolygon.addPoint(playerLoc[0], playerLoc[1]);
					placedAtPlayer = true;
					
					previousPoint = playerLoc;
					lastPlacedPoint = playerLoc;
				}
			}
		}
		else {
			for(double i = 0; i < 360; i += 0.5) {
				int[] lastPointOverCover = CombatVisualManager.getLastPointOverCover(playerLoc, Math.toRadians(i), ai.getLevelBlock());
				
				if(CombatVisualManager.spotFovNoRadius(ai, new double[]{lastPointOverCover[0], lastPointOverCover[1]})) {
					
					double oldAngle = 0;
					double newAngle = 0;
					
					if(previousPoint != null && lastPlacedPoint != null) {
						oldAngle = Maths.getDegrees(lastPlacedPoint, previousPoint);
						newAngle = Maths.getDegrees(lastPlacedPoint, lastPointOverCover);
//						System.out.println("O: " + oldAngle + "  N: " + newAngle + "  Diff: " + Maths.angleDifference(oldAngle, newAngle));
					}
					
					if(lastPlacedPoint == null || Maths.angleDifference(oldAngle, newAngle) > ANGLE_TOLERANCE) {
						
						placedAtPlayer = false;
						
						if(previousPoint == null) {
							previousPoint = lastPointOverCover;
							continue;
						}
						else
							lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
						
						lightPolygon.addPoint(lastPointOverCover[0], lastPointOverCover[1]);
						lastPlacedPoint = lastPointOverCover;
					}
					
					if(lastPlacedPoint == lastPointOverCover)
						previousPoint = null;
					else
						previousPoint = lastPointOverCover;
				}
				else if(!placedAtPlayer){
					
					if(previousPoint != null)
						lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
					
					lightPolygon.addPoint(playerLoc[0], playerLoc[1]);
					placedAtPlayer = true;
					
					previousPoint = playerLoc;
					lastPlacedPoint = playerLoc;
				}
			}
			if(previousPoint != null)
				lightPolygon.addPoint(previousPoint[0], previousPoint[1]);
		}
		
		for(int i = 0; i < ai.getLevelBlock().getHitBox().npoints; i++) {
			int x = ai.getLevelBlock().getHitBox().xpoints[i];
			int y = ai.getLevelBlock().getHitBox().ypoints[i];
			shadowPolygon.addPoint(x, y);
		}
		
//		System.out.println("Lightpoly points: " + lightPolygon.npoints);
	}
	
	@Override
	public void drawMethod(Graphics2D drawShape) {
		drawFovLight(drawShape, combatMembersManager.getCurrentAi());
	}
	 
	private void drawFovLight(Graphics2D drawShape, final Ai ai){

		AffineTransform transform = drawShape.getTransform();
		
		transform.setToTranslation(panningManager.getOffset()[0], panningManager.getOffset()[1]);
		drawShape.setTransform(transform);
		
//		drawShape.setComposite(GraphicsFunctions.makeComposite(0.3f));
		
//		Point2D center = new Point2D.Float((int)(ai.getLocation()[0]), (int)(ai.getLocation()[1]));
//		float radius = 50;
//		float[] dist = {0.0f, 0.5f, 0.8f};
//		Color[] colors = {new Color(80, 80, 80), new Color(50, 50, 50), new Color(0, 0, 0)};
		
		//RadialGradientPaint gp = new RadialGradientPaint(center, radius, dist, colors);
		
		//drawShape.setPaint(gp);
		
		//drawShape.fillPolygon(shadowPolygon);
		
		/*
	    radius = 420;
	    dist = new float[]{0.0f, 0.9f};
	    colors = new Color[]{Color.WHITE, new Color(20,20,90)};
		
		gp = new RadialGradientPaint(center, radius, dist, colors);
		
		drawShape.setPaint(gp);
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.18f));
		drawShape.fillPolygon(lightPolygon);
		drawShape.setPaint(null);*/
		
		
//		radius = 500;
//	    dist = new float[]{0.0f, 0.9f};
//	    colors = new Color[]{new Color(20,20,90), new Color(90,90,160)};
//		
//		gp = new RadialGradientPaint(center, radius, dist, colors);
		
		Stroke stroke = drawShape.getStroke();
		
		drawShape.setStroke(new BasicStroke(4));
		
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.1f));
//		drawShape.setPaint(gp);
		drawShape.setColor(Color.cyan);
		drawShape.drawPolygon(lightPolygon);
		
		transform.setToTranslation(0, 0);
		drawShape.setTransform(transform);
		
		drawShape.setStroke(stroke);
		
	}

	@Override
	public int getZ() {
		return this.z;
	}

	@Override
	public boolean isVisible() {
		return this.visible;
	}
	
	@Override
	public int compareTo(Displayable otherDisplay) {
		if(otherDisplay.getZ() > this.getZ()){
			 return -1;
		}
		else if(otherDisplay.getZ() < this.getZ()){
			return 1;
		}
		return 0;
	}

	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	@Override
	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public double getScale() {
		return 0;
	}
	
	@Override
	public void move(double x, double y) {
	}

	@Override
	public void kickTween() {
	}

	@Override
	public double[] getLocation() {
		return null;
	}
	
	@Override
	public double[] getSize() {
		return null;
	}

	@Override
	public void setScale(double scale) {
	}

	@Override
	public void setLocation(double x, double y) {
	}

	@Override
	public void setTween(TweenDefinable tween) {
	}

	public Polygon getShadowPolygon() {
		return shadowPolygon;
	}

	public Polygon getLightPolygon() {
		return lightPolygon;
	}
	
}
