/*
 * 
 */
package watoydoEngine.workings;

import javax.swing.SwingUtilities;

import watoydoEngine.io.ReadWriter;
import watoydoEngine.workings.displayActivity.SetupWindow;


// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main{
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		@SuppressWarnings("unused")
		Main main = new Main();
	}
	
	/**
	 * Instantiates a new main.
	 */
	public Main(){
		
		ReadWriter.HOME_LOCATION = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		if(ReadWriter.HOME_LOCATION.endsWith("Atrophy.jar"))
			ReadWriter.HOME_LOCATION = ReadWriter.HOME_LOCATION.substring(0, ReadWriter.HOME_LOCATION.length() - "Atrophy.jar".length());
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SetupWindow.getInstance();
			}
		});
	}

}