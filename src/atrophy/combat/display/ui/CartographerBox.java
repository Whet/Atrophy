/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.display.ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;

import watoydoEngine.designObjects.actions.ActionRegion;
import watoydoEngine.designObjects.display.Crowd;
import watoydoEngine.designObjects.display.TextButton;
import watoydoEngine.designObjects.display.TextInput;
import watoydoEngine.gubbinz.GraphicsFunctions;
import watoydoEngine.workings.displayActivity.ActivePane;
import atrophy.combat.PanningManager;

/**
 * The Class CartographerBox.
 */
public class CartographerBox extends Crowd{
	
	/**
	 * The Constant MAX_MARKERS.
	 */
	public static final int MAX_MARKERS = 26;
	
	/**
	 * The Constant size.
	 */
	private static final int[] size = {320,550};
	
	/**
	 * The add marker buttons.
	 */
	private AddMarkerText[] addMarkerButtons;
	
	/**
	 * The map markers.
	 */
	private TextButton[] mapMarkers;
	
	/**
	 * The mouse drag region.
	 */
	private ActionRegion mouseDragRegion;
	
	/**
	 * The drag location.
	 */
	private int[] dragLocation;
	
	private PanningManager panningManager;
	
	private Cartographer cartographer;
	
	/**
	 * Instantiates a new cartographer box.
	 */
	public CartographerBox(final PanningManager panningManager){
		super("CartBox", false);
		
		this.cartographer = new Cartographer();
		
		this.panningManager = panningManager;
		
		this.setLocation(ActivePane.getInstance().getWidth() - 340, 30);
		
		addMarkerButtons = new AddMarkerText[3];
		
		for(int i = 0; i < 3; i++){
			addMarkerButtons[i] = new AddMarkerText("Marker1",this.getLocation()[0] + 12, this.getLocation()[1] + 22 + i * 18);
			this.addInputText(addMarkerButtons[i]);
			addMarkerButtons[i].setActionZ(-1);
		}
		
		addMarkerButtons[0].setMarkerColour(Color.red.darker());
		addMarkerButtons[1].setMarkerColour(Color.green.darker());
		addMarkerButtons[2].setMarkerColour(Color.white.darker());
		
		mapMarkers = new TextButton[MAX_MARKERS];
		for(int i = 0; i < mapMarkers.length; i++){
			mapMarkers[i] = new MarkerText(i){
				
				@Override
				public boolean mD(Point mousePosition, MouseEvent e) {
					return true;
				}
				
				@Override
				public boolean mU(Point mousePosition, MouseEvent e) {
					panningManager.panToPoint(cartographer.getMarkers().get(this.getIndex()).getLocation());
					return true;
				}
				
				@Override
				public boolean rMU(Point mousePosition, MouseEvent e) {
					cartographer.removeMarker(this.getIndex());
					updateTextButtons();
					return true;
				}
			};
			mapMarkers[i].setLocation(this.getLocation()[0] + 12, this.getLocation()[1] + 78 + i * 18);
			
			this.addDisplayItem(mapMarkers[i]);
			this.addMouseActionItem(mapMarkers[i]);
			mapMarkers[i].setActionZ(-1);
		}
		
		mouseDragRegion = new ActionRegion(this.getLocation()[0], this.getLocation()[1], size[0], size[1], false) {
			
			private boolean mouseDown = false;
			
			@Override
			public boolean mD(Point mousePosition, MouseEvent e) {
				mouseDown = true;
				for(int i = 0; i < mapMarkers.length; i++){
					mapMarkers[i].setVisible(false);
				}
				for(int i = 0; i < 3; i++){
					addMarkerButtons[i].setVisible(false);
				}
				dragLocation = new int[]{e.getPoint().x - (int)this.getLocation()[0], e.getPoint().y - (int)this.getLocation()[1]};
				return true;
			}
			
			@Override
			public boolean mU(Point mousePosition, MouseEvent e) {
				mouseDown = false;
				updateLocations();
				return true;
			}
			
			@Override
			public void mI(Point mousePosition) {
				if(mouseDown){
					CartographerBox.this.setLocation(mousePosition.x - dragLocation[0], mousePosition.y - dragLocation[1]);
					this.setLocation(mousePosition.x - dragLocation[0], mousePosition.y - dragLocation[1]);
				}
			}
			
			@Override
			public void mO(Point mousePosition) {
				if(mouseDown){
					mouseDown = false;
					updateLocations();
				}
			}
		};
		this.addMouseActionItem(mouseDragRegion);
		mouseDragRegion.setActive(false);
		
		this.setVisible(false);
		
		this.computeZOrder();
	}
	
	/**
	 * Update text buttons.
	 */
	private void updateTextButtons(){
		
		for(TextButton text : this.mapMarkers){
			text.setText("");
		}
		
		for(int i = 0; i < cartographer.getMarkers().size(); i++){
			this.mapMarkers[i].setText(cartographer.getMarkers().get(i).getDescription());
			this.mapMarkers[i].setOnColour(cartographer.getMarkers().get(i).getColour());
			this.mapMarkers[i].setOffColour(cartographer.getMarkers().get(i).getColour().darker());
		}
	}

	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#drawMethod(java.awt.Graphics2D)
	 */
	@Override
	public void drawMethod(Graphics2D drawShape) {
		drawBackdrop(drawShape);
		super.drawMethod(drawShape);
	}

	/**
	 * Draw backdrop.
	 *
	 * @param drawShape the draw shape
	 */
	private void drawBackdrop(Graphics2D drawShape) {
		drawShape.setColor(Color.black);
		drawShape.setComposite(GraphicsFunctions.makeComposite(0.8f));
		drawShape.fillRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    size[0],
							    size[1],
							    14,14);
		drawShape.setColor(Color.gray);
		drawShape.setComposite(GraphicsFunctions.makeComposite(1.0f));
		drawShape.drawRoundRect((int)this.getLocation()[0],
							    (int)this.getLocation()[1], 
							    size[0],
							    size[1],
							    14,14);
		drawShape.drawRect((int)this.getLocation()[0] + 6,
						   (int)this.getLocation()[1] + 6, 
						   size[0] - 12,
						   size[1] - 12);
	}
	
	/**
	 * Update locations.
	 */
	private void updateLocations(){
		for(int i = 0; i < mapMarkers.length; i++){
			mapMarkers[i].setLocation(this.getLocation()[0] + 12, this.getLocation()[1] + 78 + i * 18);
			mapMarkers[i].setVisible(true);
		}
		for(int i = 0; i < 3; i++){
			addMarkerButtons[i].setLocation(this.getLocation()[0] + 12, this.getLocation()[1] + 22 + i * 18);
			addMarkerButtons[i].setVisible(true);
		}
	}

	/**
	 * Toggle lock.
	 */
	public void toggleLock(){
		this.mouseDragRegion.setActive(!this.mouseDragRegion.isActive());
		updateLocations();
	}
	
	/* (non-Javadoc)
	 * @see watoydoEngine.designObjects.display.Crowd#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		
		if(visible){
			this.updateTextButtons();
		}
		
		for(TextButton button: this.mapMarkers){
			button.setVisible(visible);
		}
	}
	
	/**
	 * The Class MarkerText.
	 */
	private class MarkerText extends TextButton{

		/**
		 * The index.
		 */
		private int index;

		/**
		 * Instantiates a new marker text.
		 *
		 * @param index the index
		 */
		public MarkerText(int index) {
			super("", Color.red, Color.yellow);
			this.index = index;
		}

		/**
		 * Gets the index.
		 *
		 * @return the index
		 */
		public int getIndex() {
			return index;
		}
	}
	
	/**
	 * The Class AddMarkerText.
	 */
	private class AddMarkerText extends TextInput{

		/**
		 * The marker colour.
		 */
		private Color markerColour;
		
		/**
		 * Instantiates a new adds the marker text.
		 *
		 * @param tag the tag
		 * @param x the x
		 * @param y the y
		 */
		public AddMarkerText(String tag, double x, double y){
			super(tag,x,y,"Generate Marker: ");
			this.markerColour = Color.red.darker();
			this.setMaxLetters("Generate Marker: ".length() + 24);
			this.setMinLetters("Generate Marker: ".length());
		}

		/* (non-Javadoc)
		 * @see watoydoEngine.designObjects.display.TextInput#setFocus(boolean)
		 */
		@Override
		public void setFocus(boolean focus) {
			
			if(this.isFocused() && !focus){
				// String without "Generate marker: "
				String markerName = this.getText().substring("Generate Marker: ".length());
				if(markerName.length() > 0){
					cartographer.addNewMarker(panningManager.getLocationAtCentreOfScreen(), this.markerColour, markerName);
					CartographerBox.this.updateTextButtons();
				}
				
				this.setText("Generate Marker: ");
			}
			super.setFocus(focus);
		}
		
		/**
		 * Sets the marker colour.
		 *
		 * @param markerColour the new marker colour
		 */
		public void setMarkerColour(Color markerColour) {
			this.markerColour = markerColour;
			this.setColour(markerColour);
		}
		
	}
	
}
