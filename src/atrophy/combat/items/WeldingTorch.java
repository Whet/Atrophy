package atrophy.combat.items;

public class WeldingTorch extends Item {
	
	public static final String NAME = "Welding Torch";
	
	private static WeldingTorch instance;
	
	public static WeldingTorch getInstance(){
		
		if(instance == null){
			instance = new WeldingTorch();
		}
		
		return instance;
	}
	
	private WeldingTorch(){
		super(NAME, "- Can be used to seal doors shut and open them.");
	}
	
}
