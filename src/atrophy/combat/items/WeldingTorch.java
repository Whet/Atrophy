/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.items;


/**
 * The Class WeldingTorch.
 */
public class WeldingTorch extends Item {
	
	/**
	 * The Constant NAME.
	 */
	public static final String NAME = "Welding Torch";
	
	/**
	 * The instance.
	 */
	private static WeldingTorch instance;
	
	/**
	 * Gets the single instance of WeldingTorch.
	 *
	 * @return single instance of WeldingTorch
	 */
	public static WeldingTorch getInstance(){
		
		if(instance == null){
			instance = new WeldingTorch();
		}
		
		return instance;
	}
	
	/**
	 * Instantiates a new welding torch.
	 */
	private WeldingTorch(){
		super(NAME, "- Can be used to seal doors shut and open them.");
	}
	
}
