/*
 * @author Charles Sherman
 * 
 * Watoydo.com
 */
package watoydoEngine.sounds;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// TODO: Auto-generated Javadoc
/**
 * The Class Sound.
 */
public class Sound {
	
	 /** The clip. */
 	Clip clip;
	
	/**
	 * Instantiates a new sound.
	 *
	 * @param soundFile the sound file
	 */
	public Sound(String soundFile){
		try{
		
			clip = AudioSystem.getClip();
			
			// unique loading method works with sounds 
			URL url = Sound.class.getResource("/watoydoEngine/mods/sounds/"+soundFile);
		    AudioInputStream ais = AudioSystem.getAudioInputStream(url);
		    
			clip.open(ais);
		}
		catch(LineUnavailableException lue){
			System.out.println("LineUnavailableException   " + soundFile);
		}
		catch(IOException ioExcept){
			System.out.println("IOException   " + soundFile);
		}
		catch(UnsupportedAudioFileException uafe){
			System.out.println("UnsupportedAudioFileException   " + soundFile);
		}
	}
	
	/**
	 * Play.
	 */
	public void play(){
		clip.setFramePosition(0);
		//clip.loop(0);
	}
	
	/**
	 * Stop.
	 */
	public void stop(){
		clip.stop();
	}
/*
    public static void main(String[] args) throws Exception {
        URL url = new URL(
            "http://pscode.org/media/leftright.wav");
        Clip clip = AudioSystem.getClip();
        // getAudioInputStream() also accepts a File or InputStream
        AudioInputStream ais = AudioSystem.
            getAudioInputStream( url );
        clip.open(ais);
        // loop continuously
        clip.loop(-1);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // A GUI element to prevent the Clip's daemon Thread
                // from terminating at the end of the main()
                JOptionPane.showMessageDialog(null, "Close to exit!");
            }
        });*/
}