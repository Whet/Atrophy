package atrophy.combat.display.ui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Set;

import atrophy.combat.level.LevelBlock;

public class Cartographer {

	private ArrayList<Marker> markers;

	public Cartographer(){
		markers = new ArrayList<Marker>();
	}
	
	public ArrayList<Marker> getMarkers(){
		return this.markers;
	}

	public void markRooms(String description, Color colour, Set<LevelBlock> rooms) {
		for(LevelBlock room : rooms){
			if(markers.size() < CartographerBox.MAX_MARKERS)
			this.markers.add(new Marker(room, colour, description));
		}
	}
	
	public void addNewMarker(double[] location, Color colour, String description) {
		if(markers.size() < CartographerBox.MAX_MARKERS)
			this.markers.add(new Marker(location, colour, description));
	}
	
	public void addNewMarker(LevelBlock levelBlock, Color colour, String description) {
		if(markers.size() < CartographerBox.MAX_MARKERS)
			this.markers.add(new Marker(levelBlock.getCentre(), colour, description));
	}
	
	public void removeMarker(int index) {
		this.markers.remove(index);
	}
	
	public static class Marker{
		
		private final Color colour;
		private final double[] location;
		private final String description;
		
		public Marker(double[] location, Color colour, String description){
			this.colour = colour;
			this.location = location.clone();
			this.description = description;
		}
		
		public Marker(LevelBlock room, Color colour, String description){
			this.colour = colour;
			this.location = room.getCentre();
			this.description = description;
		}
		
		public Color getColour(){
			return this.colour;
		}
		
		public double[] getLocation() {
			return this.location;
		}
		
		public String getDescription(){
			return this.description;
		}
	}
	
}