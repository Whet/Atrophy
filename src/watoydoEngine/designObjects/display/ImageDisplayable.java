package watoydoEngine.designObjects.display;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public interface ImageDisplayable extends Displayable{

	public double[] getSize();
	
	public double getRotation();
	
	public AffineTransform getTransformation();

	public AffineTransform getTransformationForDrawing();

	public void setImage(BufferedImage newImage);

	public BufferedImage getImage();

	public double[] getLocationCentre();
	
}
