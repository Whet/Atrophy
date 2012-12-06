/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package watoydoEngine.hardPanes;

import java.io.FileNotFoundException;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.io.ReadWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class ModdableHardPane.
 */
public abstract class ModdableHardPane implements HardPaneDefineable{
	
	/* (non-Javadoc)
	 * @see watoydoEngine.hardPanes.HardPaneDefineable#load(java.lang.String, watoydoEngine.designObjects.display.Crowd)
	 */
	public abstract void load(String tag, Crowd crowd);
	
	/**
	 * Load soft pane.
	 *
	 * @param tag the tag
	 * @param crowd the crowd
	 */
	protected void loadSoftPane(String tag, Crowd crowd){
		// If the mod file is present then read from it
		try{
			ReadWriter.getResourceAsInputStream("Panes/"+ tag);
			//Lib.getInstance().loadComplex(tag, crowd,true);
		}
		catch(FileNotFoundException fnfe){
		}
	}
	
}
