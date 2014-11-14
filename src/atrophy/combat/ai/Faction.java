package atrophy.combat.ai;

public enum Faction {

	BANDITS("Bandits"),
	DAEMON("Daemon"),
	LONER("Loner"),
	PLAYER("Player"),
	TURRET("Turret"),
	WHITE_VISTA("White Vista"), 
	EMPTY(""),
	UNCLAIMED("Unclaimed");

	private String stringRep;

	private Faction(String stringRep) {
		this.stringRep = stringRep;
	}
	
	@Override
	public String toString() {
		return stringRep;
	}

	public static Faction getFaction(String faction) {
		
		for(Faction factionEnum:Faction.values()) {
			if(factionEnum.stringRep.equals(faction))
				return factionEnum;
		}
		
		return null;
	}
	
}
