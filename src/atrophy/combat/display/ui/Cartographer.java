/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.util.ArrayList;

import atrophy.combat.level.LevelBlock;

/**
 * The Class Cartographer.
 */
public class Cartographer {

	/**
	 * The markers.
	 */
	private ArrayList<Marker> markers;
	
	/**
	 * Instantiates a new cartographer.
	 */
	public Cartographer(){
		markers = new ArrayList<Marker>();
	}
	
	/**
	 * Gets the markers.
	 *
	 * @return the markers
	 */
	public ArrayList<Marker> getMarkers(){
		return this.markers;
	}
	
	/**
	 * Mark rooms.
	 *
	 * @param description the description
	 * @param colour the colour
	 * @param rooms the rooms
	 */
	public void markRooms(String description, Color colour, ArrayList<LevelBlock> rooms) {
		for(LevelBlock room : rooms){
			if(markers.size() < CartographerBox.MAX_MARKERS)
			this.markers.add(new Marker(room, colour, description));
		}
	}
	
	/**
	 * Adds the new marker.
	 *
	 * @param location the location
	 * @param colour the colour
	 * @param description the description
	 */
	public void addNewMarker(double[] location, Color colour, String description) {
		if(markers.size() < CartographerBox.MAX_MARKERS)
		this.markers.add(new Marker(location, colour, description));
	}
	
	/**
	 * Adds the new marker.
	 *
	 * @param levelBlock the level block
	 * @param colour the colour
	 * @param description the description
	 */
	public void addNewMarker(LevelBlock levelBlock, Color colour, String description) {
		if(markers.size() < CartographerBox.MAX_MARKERS)
		this.markers.add(new Marker(levelBlock.getCentre(), colour, description));
	}
	

	/**
	 * Removes the marker.
	 *
	 * @param index the index
	 */
	public void removeMarker(int index) {
		this.markers.remove(index);
	}
	
	/**
	 * The Class Marker.
	 */
	public static class Marker{
		
		/**
		 * The colour.
		 */
		private final Color colour;
		
		/**
		 * The location.
		 */
		private final double[] location;
		
		/**
		 * The description.
		 */
		private final String description;
		
		/**
		 * Instantiates a new marker.
		 *
		 * @param location the location
		 * @param colour the colour
		 * @param description the description
		 */
		public Marker(double[] location, Color colour, String description){
			this.colour = colour;
			this.location = location.clone();
			this.description = description;
		}
		
		/**
		 * Instantiates a new marker.
		 *
		 * @param room the room
		 * @param colour the colour
		 * @param description the description
		 */
		public Marker(LevelBlock room, Color colour, String description){
			this.colour = colour;
			this.location = room.getCentre();
			this.description = description;
		}
		
		/**
		 * Gets the colour.
		 *
		 * @return the colour
		 */
		public Color getColour(){
			return this.colour;
		}
		
		/**
		 * Gets the location.
		 *
		 * @return the location
		 */
		public double[] getLocation() {
			return this.location;
		}
		
		/**
		 * Gets the description.
		 *
		 * @return the description
		 */
		public String getDescription(){
			return this.description;
		}
	}
	
}