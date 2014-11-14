package atrophy.hardPanes;

import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.hardPanes.HardPaneDefineable;
import watoydoEngine.sounds.SoundBoard;
import atrophy.gameMenu.ui.Menu;
import atrophy.splash.SplashMenu;


public class SplashPane implements HardPaneDefineable{
	
	@Override
	public void load(Crowd crowd){
		
		SoundBoard.getInstance().startMusic();
		
		clearOld();
		
		crowd.addCrowd(new SplashMenu());
		
	}

	public static void clearOld() {
		Menu.windowZ = 0;
	}
	
}
