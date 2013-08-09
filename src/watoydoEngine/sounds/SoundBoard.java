package watoydoEngine.sounds;

import java.util.Random;

import org.newdawn.slick.Music;
import org.newdawn.slick.MusicListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;


public class SoundBoard {
	
	private static SoundBoard instance;
	
	public static SoundBoard getInstance(){
		if(instance == null){
			instance = new SoundBoard();
		}
		
		return instance;
	}
	
	private float musicVolume;
	private float effectVolume;
	
	private MusicMix mixer;
	private Music music;
	private String musicTrack;
	private String musicCollection[];

	private SoundBoard(){
		musicCollection = new String[3];
		
		musicCollection[0] = "watoydoEngine/mods/sounds/music/Interloper.ogg";
		musicCollection[1] = "watoydoEngine/mods/sounds/music/Neo Western.ogg";
		musicCollection[2] = "watoydoEngine/mods/sounds/music/Simplex.ogg";
		
		musicVolume = 0.1f;
		effectVolume = 0.5f;
		
	}
	
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
				case "invOpen":
					sound = new Sound("watoydoEngine/mods/sounds/inventory.ogg");
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
				case "radio":
					sound = new Sound("watoydoEngine/mods/sounds/messageMenu.ogg");
				break;
				case "death":
					sound = new Sound("watoydoEngine/mods/sounds/death1.ogg");
				break;
				case"hostileSound":
					switch(new Random().nextInt(3)) {
						case 0:
							sound = new Sound("watoydoEngine/mods/sounds/hostileSound1.ogg");
						break;
						case 1:
							sound = new Sound("watoydoEngine/mods/sounds/hostileSound2.ogg");
						break;
						case 2:
							sound = new Sound("watoydoEngine/mods/sounds/hostileSound3.ogg");
						break;
					}
				break;
			}
			
			if(sound != null)
				sound.play(1, effectVolume);
		
		}
		catch(SlickException e){}
	}
	
	private void pickRandomTrack(){
		Random rand = new Random();
		
		String pickedTrack = null;
		
		pickedTrack = musicCollection[rand.nextInt(musicCollection.length)];
		
		playTrack(pickedTrack);
	}
	
	private void pickRandomTrack(String excludeTrack){
		Random rand = new Random();
		
		String pickedTrack = null;
		
		do{
			pickedTrack = musicCollection[rand.nextInt(musicCollection.length)];
		}
		while(pickedTrack == excludeTrack);
		
		playTrack(pickedTrack);
	}
	
	private void playTrack(String musicTrack){
		
		Music music = null;
		try {
			music = new Music(musicTrack,true);
		} 
		catch (SlickException e) {
			// Don't change music
			return;
		}
		
		this.music = music;
		
		mixer = new MusicMix();
		
		music.addListener(mixer);
		music.play(1,musicVolume);
		
		this.musicTrack = musicTrack;
		
	}
	
	private void playTrack(String musicTrack, boolean stream){
		
		Music music = null;
		try {
			music = new Music(musicTrack,stream);
		} 
		catch (SlickException e) {
			// Don't change music
			return;
		}
		
		this.music = music;
		
		mixer = new MusicMix();
		music.addListener(mixer);
		music.play(1,musicVolume);
		
		this.musicTrack = musicTrack;
		
	}
	
	private class MusicMix implements MusicListener{

		boolean wasSwapped = false;
		
		@Override
		public void musicEnded(Music music) {
			if(wasSwapped)
				return;
			
			System.out.println("Music ended");
			pickRandomTrack(musicTrack);
		}

		@Override
		public void musicSwapped(Music music, Music newMusic){
			System.out.println("Music swapped");
			wasSwapped = true;
		}
		
	}
	
	public void setMusicVolume(float musicVolume){
		this.musicVolume = musicVolume;
	}
	
	public void setEffectVolume(float effectVolume){
		this.effectVolume = effectVolume;
	}
	
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
	
	public void modifyEffectVolume(float modifier){
		this.effectVolume += modifier;
		
		if(effectVolume < 0){
			effectVolume = 0;
		}
		
		System.out.println(effectVolume);
	}

}
