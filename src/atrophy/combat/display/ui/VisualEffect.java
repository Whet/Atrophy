package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;

import watoydoEngine.utils.Maths;
import atrophy.combat.PanningManager;

public abstract class VisualEffect {

	protected PanningManager panningManager;
	
	private int life;
	
	private double[] location;
	
	public VisualEffect(PanningManager panningManager, int life, double[] location){
		this.life = life;
		this.location = location;
		this.panningManager = panningManager;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public void setLocation(double[] location) {
		this.location = location;
	}

	public double[] getLocation() {
		return location;
	}
	
	public boolean isDead(){
		return life <= 0;
	}
	
	protected abstract void update();
	
	public final void tick(){
		update();
		
		life--;
	}
	
	public abstract void drawMethod(Graphics2D drawShape);
	
	
	public static class Bullet extends VisualEffect{

		private static final int BULLET_LIFE = 28;
		
		protected double distance;
		
		protected double[] targetLocation;
		
		protected double speed;
		
		private double angle;
		
		protected Color colour;

		public Bullet(PanningManager panningManager, double[] location, double[] targetLocation, Color colour, double speed){
			
			super(panningManager, BULLET_LIFE, location);
			
			this.speed = speed;
			this.angle = Maths.getRads(location[0], location[1], targetLocation[0], targetLocation[1]);
			this.colour = colour;
			
			distance = Maths.getDistance(location, targetLocation);
			this.targetLocation = targetLocation;
		}
		
		@Override
		public void drawMethod(Graphics2D drawShape){
			
			drawShape.setColor(this.colour);
			drawShape.drawLine((int)(this.getLocation()[0] + panningManager.getOffset()[0]), 
					           (int)(this.getLocation()[1] + panningManager.getOffset()[1]), 
					           (int)(this.getLocation()[0] + (int)(Math.cos(angle) * speed) + panningManager.getOffset()[0]), 
					           (int)(this.getLocation()[1] + (int)(Math.sin(angle) * speed) + panningManager.getOffset()[1]));
			
			
		}
	
		@Override
		protected void update() {
			double[] newLocation  = {this.getLocation()[0] + Math.cos(angle) * speed, this.getLocation()[1] + Math.sin(angle) * speed};
			this.setLocation(newLocation);
			
			// if moving away then stop
			if(Maths.getDistance(this.getLocation(), this.targetLocation) > distance){
				this.setLife(0);
				return;
			}
			
			distance = Maths.getDistance(this.getLocation(), this.targetLocation);
		}
		
	}
	
	public static class ShotgunBullet extends Bullet {

		private double[] angle;
		
		private double[][] location;
		
		public ShotgunBullet(PanningManager panningManager, double[] location, double[] targetLocation, Color colour, double speed) {
			super(panningManager, location, targetLocation, colour, speed);
			
			this.angle = new double[5];
			this.angle[0] = Maths.getRads(location[0], location[1], targetLocation[0], targetLocation[1]);
			this.angle[1] = Maths.getRads(location[0], location[1], targetLocation[0], targetLocation[1])+ (Math.random() * (Math.PI / (float)16));
			this.angle[2] = Maths.getRads(location[0], location[1], targetLocation[0], targetLocation[1])+ (Math.random() * (Math.PI / (float)16));
			this.angle[3] = Maths.getRads(location[0], location[1], targetLocation[0], targetLocation[1])- (Math.random() * (Math.PI / (float)16));
			this.angle[4] = Maths.getRads(location[0], location[1], targetLocation[0], targetLocation[1])- (Math.random() * (Math.PI / (float)16));
			
			this.location = new double[5][2];
			this.location[0] = location.clone();
			this.location[1] = location.clone();
			this.location[2] = location.clone();
			this.location[3] = location.clone();
			this.location[4] = location.clone();
		}
		
		@Override
		public void drawMethod(Graphics2D drawShape){
			
			drawShape.setColor(this.colour);
			for(int i = 0; i < angle.length; i++){
				drawShape.drawLine((int)(this.location[i][0] + panningManager.getOffset()[0]), 
						           (int)(this.location[i][1] + panningManager.getOffset()[1]), 
						           (int)(this.location[i][0] + (int)(Math.cos(angle[i]) * speed) + panningManager.getOffset()[0]), 
						           (int)(this.location[i][1] + (int)(Math.sin(angle[i]) * speed) + panningManager.getOffset()[1]));
			}
			
			
		}
		
		@Override
		protected void update() {
			
			for(int i = 0; i < angle.length; i++){
				this.location[i][0] += Math.cos(angle[i]) * speed;
				this.location[i][1] += Math.sin(angle[i]) * speed;
			}
			
			this.setLocation(this.location[0]);
			
			// if moving away then stop
			if(Maths.getDistance(this.getLocation(), this.targetLocation) > distance){
				this.setLife(0);
				return;
			}
			
			distance = Maths.getDistance(this.getLocation(), this.targetLocation);
		}

	}
	
}
