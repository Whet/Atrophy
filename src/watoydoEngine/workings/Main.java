/*
 * 
 */
package watoydoEngine.workings;

import javax.swing.SwingUtilities;

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
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SetupWindow.getInstance();
			}
		});
	}

}