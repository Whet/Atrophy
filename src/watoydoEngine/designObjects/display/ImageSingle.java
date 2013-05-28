package watoydoEngine.designObjects.display;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import watoydoEngine.utils.GraphicsFunctions;


public class ImageSingle extends AbstractImage implements ImageDisplayable{
	
	private BufferedImage image;
	private double rotation;


	public ImageSingle(BufferedImage image){
		super();
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	public ImageSingle(BufferedImage image, double x, double y){
		super(x,y);
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	public ImageSingle(BufferedImage image, boolean visible){
		super(visible);
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	public ImageSingle(BufferedImage image, double x, double y, boolean visible, int z){
		super(x,y,visible,z);
		
		this.image = image;
		
		this.rotation = 0;
	}
	
	public void drawMethod(Graphics2D drawShape){
		drawShape.setComposite(GraphicsFunctions.makeComposite(this.getAlpha()));
		drawShape.drawImage(this.image,this.getTransformationForDrawing(),null);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1));
	}
	
	public double[] getLocationCentre(){
		double editedLocation[] = {this.getLocation()[0] + this.getSize()[0] * 0.5, this.getLocation()[1] + this.getSize()[1] * 0.5};
		return editedLocation;
	}
	
	public double[] getSize(){
		double[] size = new double[2];
		if(image != null){
			size[0] = this.image.getWidth();
			size[1] = this.image.getHeight();
		}
		else{
			size[0] = 0;
			size[1] = 0;
		}
		return size;
	}
	
	public BufferedImage getImage(){
		return this.image;
	}
	
	public void setImage(BufferedImage newImage){
		this.image = newImage;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
}
