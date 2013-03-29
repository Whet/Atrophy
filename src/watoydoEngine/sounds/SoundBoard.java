/*
 * 
 */
package watoydoEngine.sounds;

import java.util.Random;

import org.newdawn.slick.Music;
import org.newdawn.slick.MusicListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;


// TODO: Auto-generated Javadoc
/**
 * The Class SoundBoard.
 */
public class SoundBoard {
	
	/**
	 * The instance.
	 */
	private static SoundBoard instance;
	
	/**
	 * Gets the single instance of SoundBoard.
	 *
	 * @return single instance of SoundBoard
	 */
	public static SoundBoard getInstance(){
		if(instance == null){
			instance = new SoundBoard();
		}
		
		return instance;
	}
	
	/**
	 * The music volume.
	 */
	private float musicVolume;
	
	/**
	 * The effect volume.
	 */
	private float effectVolume;
	
	/**
	 * The mixer.
	 */
	private MusicMix mixer;
	
	/**
	 * The music.
	 */
	private Music music;
	
	/**
	 * The music track.
	 */
	private String musicTrack;
	
	/**
	 * The music collection.
	 */
	private String musicCollection[];
	
	/**
	 * Instantiates a new sound board.
	 */
	private SoundBoard(){
		musicCollection = new String[4];
		
		musicCollection[0] = "watoydoEngine/mods/sounds/music/ambient1.ogg";
		musicCollection[1] = "watoydoEngine/mods/sounds/music/ambient2.ogg";
		musicCollection[2] = "watoydoEngine/mods/sounds/music/ambient3.ogg";
		musicCollection[3] = "watoydoEngine/mods/sounds/music/ambient4.ogg";
		
		musicVolume = 0.1f;
		effectVolume = 0.5f;
		
		mixer = new MusicMix();
	}
	
	/**
	 * Start music.
	 */
	public void startMusic(){
		pickRandomTrack();
	}
	
	public void startMusic(String filename, boolean stream) {
		playTrack(filename, stream);
	}
	
	public void playEffect(String key){
		try{
		
			Sound sound = null;
			
			switch(key){
				case "invClose":
					sound = new Sound("watoydoEngine/mods/sounds/invClose.ogg");
				break;
				case "invOpen":
					sound = new Sound("watoydoEngine/mods/sounds/invOpen.ogg");
				break;
				case "invExchange":
					sound = new Sound("watoydoEngine/mods/sounds/invExchange.ogg");
				break;
				case "tick":
					sound = new Sound("watoydoEngine/mods/sounds/interfaceStart.ogg");
				break;
				case "cancel":
					sound = new Sound("watoydoEngine/mods/sounds/interfaceCancel.ogg");
				break;
			}
			
			if(sound != null)
				sound.play(1, effectVolume);
		
		}
		catch(SlickException e){}
	}
	
	/**
	 * Pick random track.
	 */
	private void pickRandomTrack(){
		Random rand = new Random();
		
		String pickedTrack = null;
		
		pickedTrack = musicCollection[rand.nextInt(musicCollection.length)];
		
		playTrack(pickedTrack);
	}
	
	/**
	 * Pick random track.
	 *
	 * @param excludeTrack the exclude track
	 */
	private void pickRandomTrack(String excludeTrack){
		Random rand = new Random();
		
		String pickedTrack = null;
		
		do{
			pickedTrack = musicCollection[rand.nextInt(musicCollection.length)];
		}
		while(pickedTrack == excludeTrack);
		
		playTrack(pickedTrack);
	}
	
	/**
	 * Play track.
	 *
	 * @param musicTrack the music track
	 */
	private void playTrack(String musicTrack){
		
		// Remove last music without triggering listener
		if(this.music != null){
			this.music.removeListener(mixer);
			this.music.stop();
		}
		
		Music music = null;
		try {
			music = new Music(musicTrack,true);
		} 
		catch (SlickException e) {
			// Don't change music
			return;
		}
		
		this.music = music;
		
		music.addListener(mixer);
		music.play(1,musicVolume);
		
		this.musicTrack = musicTrack;
		
	}
	
	private void playTrack(String musicTrack, boolean stream){
		
		// Remove last music without triggering listener
		if(this.music != null){
			this.music.removeListener(mixer);
			this.music.stop();
		}
		
		Music music = null;
		try {
			music = new Music(musicTrack,stream);
		} 
		catch (SlickException e) {
			// Don't change music
			return;
		}
		
		this.music = music;
		
		music.addListener(mixer);
		music.play(1,musicVolume);
		
		this.musicTrack = musicTrack;
		
	}
	
	/**
	 * The Class MusicMix.
	 */
	private class MusicMix implements MusicListener{

		/* (non-Javadoc)
		 * @see org.newdawn.slick.MusicListener#musicEnded(org.newdawn.slick.Music)
		 */
		@Override
		public void musicEnded(Music music) {
			music.removeListener(this);
			pickRandomTrack(musicTrack);
		}

		/* (non-Javadoc)
		 * @see org.newdawn.slick.MusicListener#musicSwapped(org.newdawn.slick.Music, org.newdawn.slick.Music)
		 */
		@Override
		public void musicSwapped(Music music, Music newMusic){}
		
	}
	
	/**
	 * Sets the music volume.
	 *
	 * @param musicVolume the new music volume
	 */
	public void setMusicVolume(float musicVolume){
		this.musicVolume = musicVolume;
	}
	
	/**
	 * Sets the effect volume.
	 *
	 * @param effectVolume the new effect volume
	 */
	public void setEffectVolume(float effectVolume){
		this.effectVolume = effectVolume;
	}
	
	/**
	 * Modify music volume.
	 *
	 * @param modifier the modifier
	 */
	public void modifyMusicVolume(float modifier){
		this.musicVolume += modifier;
		
		if(musicVolume < 0){
			musicVolume = 0;
		}
		
		for(int i = 0; i < musicCollection.length; i++){
			this.music.setVolume(musicVolume);
		}
		
		System.out.println(this.musicVolume);
	}
	
	/**
	 * Modify effect volume.
	 *
	 * @param modifier the modifier
	 */
	public void modifyEffectVolume(float modifier){
		this.effectVolume += modifier;
		
		if(effectVolume < 0){
			effectVolume = 0;
		}
		
		System.out.println(effectVolume);
	}

}
