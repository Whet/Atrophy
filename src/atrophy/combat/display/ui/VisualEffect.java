/*
 * 
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;

import watoydoEngine.utils.Maths;
import atrophy.combat.PanningManager;

/**
 * The Class VisualEffect.
 */
public abstract class VisualEffect {

	protected PanningManager panningManager;
	
	/**
	 * The life.
	 */
	private int life;
	
	/**
	 * The location.
	 */
	private double[] location;
	
	/**
	 * Instantiates a new visual effect.
	 *
	 * @param life the life
	 * @param location the location
	 */
	public VisualEffect(PanningManager panningManager, int life, double[] location){
		this.life = life;
		this.location = location;
		this.panningManager = panningManager;
	}

	/**
	 * Gets the life.
	 *
	 * @return the life
	 */
	public int getLife() {
		return life;
	}

	/**
	 * Sets the life.
	 *
	 * @param life the new life
	 */
	public void setLife(int life) {
		this.life = life;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(double[] location) {
		this.location = location;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public double[] getLocation() {
		return location;
	}
	
	/**
	 * Checks if is dead.
	 *
	 * @return true, if is dead
	 */
	public boolean isDead(){
		return life <= 0;
	}
	
	/**
	 * Update.
	 */
	protected abstract void update();
	
	/**
	 * Tick.
	 */
	public final void tick(){
		update();
		
		life--;
	}
	
	/**
	 * Draw method.
	 *
	 * @param drawShape the draw shape
	 */
	public abstract void drawMethod(Graphics2D drawShape);
	
	
	/**
	 * The Class Bullet.
	 */
	public static class Bullet extends VisualEffect{

		/**
		 * The Constant BULLET_LIFE.
		 */
		private static final int BULLET_LIFE = 28;
		
		/**
		 * The distance.
		 */
		protected double distance;
		
		/**
		 * The target location.
		 */
		protected double[] targetLocation;
		
		/**
		 * The speed.
		 */
		protected double speed;
		
		/**
		 * The angle.
		 */
		private double angle;
		
		/**
		 * The colour.
		 */
		protected Color colour;

		/**
		 * Instantiates a new bullet.
		 *
		 * @param location the location
		 * @param targetLocation the target location
		 * @param colour the colour
		 * @param speed the speed
		 */
		public Bullet(PanningManager panningManager, double[] location, double[] targetLocation, Color colour, double speed){
			
			super(panningManager, BULLET_LIFE, location);
			
			this.speed = speed;
			this.angle = Maths.getRads(location[0], location[1], targetLocation[0], targetLocation[1]);
			this.colour = colour;
			
			distance = Maths.getDistance(location, targetLocation);
			this.targetLocation = targetLocation;
		}
		
		/* (non-Javadoc)
		 * @see atrophy.combat.display.ui.VisualEffect#drawMethod(java.awt.Graphics2D)
		 */
		public void drawMethod(Graphics2D drawShape){
			
			drawShape.setColor(this.colour);
			drawShape.drawLine((int)(this.getLocation()[0] + panningManager.getOffset()[0]), 
					           (int)(this.getLocation()[1] + panningManager.getOffset()[1]), 
					           (int)(this.getLocation()[0] + (int)(Math.cos(angle) * speed) + panningManager.getOffset()[0]), 
					           (int)(this.getLocation()[1] + (int)(Math.sin(angle) * speed) + panningManager.getOffset()[1]));
			
			
		}
	
		/* (non-Javadoc)
		 * @see atrophy.combat.display.ui.VisualEffect#update()
		 */
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
	
	/**
	 * The Class ShotgunBullet.
	 */
	public static class ShotgunBullet extends Bullet {

		/**
		 * The angle.
		 */
		private double[] angle;
		
		/**
		 * The location.
		 */
		private double[][] location;
		
		/**
		 * Instantiates a new shotgun bullet.
		 *
		 * @param location the location
		 * @param targetLocation the target location
		 * @param colour the colour
		 * @param speed the speed
		 */
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
		
		/* (non-Javadoc)
		 * @see atrophy.combat.display.ui.VisualEffect.Bullet#drawMethod(java.awt.Graphics2D)
		 */
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
		
		/* (non-Javadoc)
		 * @see atrophy.combat.display.ui.VisualEffect.Bullet#update()
		 */
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
