/*
 * All code unless credited otherwise is copyright 2012 Charles Sherman, all rights reserved
 */
package atrophy.combat.minigames;

import java.util.Random;

/**
 * The Class HackingGame.
 */
public class HackingGame {

	/**
	 * The cells.
	 */
	private int[][] cells;
	
	/**
	 * The mode.
	 */
	private int mode;
	
	/**
	 * Instantiates a new hacking game.
	 *
	 * @param difficulty the difficulty
	 */
	public HackingGame(int difficulty){
		this.cells = new int[difficulty][difficulty];
		mode = 0;
		
		populateCells();
	}

	/**
	 * Populate cells.
	 */
	private void populateCells() {
		Random rand = new Random();
		for(int i = 0; i < cells.length; i++){
			for(int j = 0; j < cells.length; j++){
				cells[j][i] = rand.nextInt(3);
			}
		}
	}
	
	
	// 0 = hacked/black, 1 = white, 2 = grey/cleansweep
	
	/**
	 * Trigger cell.
	 *
	 * @param cellLocation the cell location
	 */
	public void triggerCell(int[] cellLocation){
		switch(mode){
			// Cut
			case 0:
				cells[cellLocation[0]][cellLocation[1]] = 0;
			break;
			// Mine
			case 1:
				cells[cellLocation[0]][cellLocation[1]] = 0;
				
				if(cellLocation[1] + 1 < cells.length)
					cells[cellLocation[0]][cellLocation[1] + 1] = 0;
			break;
			// Bomb
			case 2:
				if(cellLocation[1] - 1 >= 0)
					cells[cellLocation[0]][cellLocation[1] - 1] = 0;
				
				if(cellLocation[1] + 1 < cellLocation.length)
					cells[cellLocation[0]][cellLocation[1] + 1] = 0;
				
				if(cellLocation[0] - 1 >= 0)
					cells[cellLocation[0] - 1][cellLocation[1]] = 0;
				
				if(cellLocation[0] + 1 < cellLocation.length)
					cells[cellLocation[0] + 1][cellLocation[1]] = 0;
				
				cells[cellLocation[0]][cellLocation[1]] = 0;
			break;
		}
	}
}
