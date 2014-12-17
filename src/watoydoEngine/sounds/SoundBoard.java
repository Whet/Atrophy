package watoydoEngine.sounds;



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

	public void startMusic() {
		// TODO Auto-generated method stub
		
	}

	public void playEffect(String string) {
		// TODO Auto-generated method stub
		
	}

	public void modifyEffectVolume(float f) {
		this.effectVolume += f;
	}

	public void modifyMusicVolume(float f) {
		this.musicVolume += f;
	}
	
}
