package atrophy.combat.level;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import watoydoEngine.utils.Maths;

public class LevelBlockGrid {
    
    private static final float GRID_BLOCK_SIZE = 4;
    
    private List<List<GridBlock>> blocks;

    private int startX, startY, width, height;

    public LevelBlockGrid(Polygon hitbox) {
        
        blocks = new ArrayList<>();
        
        convertPolygonToBlocks(hitbox);
        
    }
    
    public GridBlock getGridBlock(double[] location) {
        
        int startIndex = (int) ((location[0] - startX) / GRID_BLOCK_SIZE);
		
        if(startIndex < 0)
        	startIndex = 0;
        
        for(int i = startIndex; i < blocks.size(); i++){
            for(int j = 0; j < blocks.get(i).size(); j++){
                if(blocks.get(i).get(j).contains(location[0], location[1]))
                    return blocks.get(i).get(j);
            }
        }
        
        return null;
    }
    
    public GridBlock getGridBlock(double x, double y) {
        
        int startIndex = (int) ((x - startX) / GRID_BLOCK_SIZE);
        
        if(startIndex < 0)
        	startIndex = 0;
        
		for(int i = startIndex; i < blocks.size(); i++){
            for(int j = 0; j < blocks.get(i).size(); j++){
                if(blocks.get(i).get(j).contains(x, y))
                    return blocks.get(i).get(j);
            }
        }
        
        return null;
    }
    
    public GridBlock getNearestGridBlock(double x, double y) {
    	return getGridBlock(new double[]{x, y});
    }
    
    public GridBlock getNearestGridBlock(double[] location) {
    	
    	 int startIndex = (int) ((location[0] - startX) / GRID_BLOCK_SIZE);
 		
         if(startIndex < 0)
         	startIndex = 0;
         
         for(int i = startIndex; i < blocks.size(); i++){
             for(int j = 0; j < blocks.get(i).size(); j++){
                 if(blocks.get(i).get(j).contains(location[0], location[1]))
                     return blocks.get(i).get(j);
             }
         }
         
         double distance = Maths.getDistance(location, blocks.get(startIndex).get(0).getPathLocation());
         int index = 0;
         
         for(int j = 0; j < blocks.get(startIndex).size(); j++){
        	 // If smaller distance or start of array
             if(Maths.getDistance(location, blocks.get(startIndex).get(j).getPathLocation()) <= distance || j == blocks.get(startIndex).size()){
            	 distance = Maths.getDistance(location, blocks.get(startIndex).get(j).getPathLocation());
            	 index = j;
             }
             // Larger distance
             else{
            	 return blocks.get(startIndex).get(j - 1);
             }
         }
//         return null;
         return blocks.get(startIndex).get(index);
	}
    
    private void convertPolygonToBlocks(Polygon hitbox) {

        startX = (int) hitbox.getBounds().getX(); 
        startY = (int) hitbox.getBounds().getY();
        
        width =  (int) hitbox.getBounds().getWidth();
        height = (int) hitbox.getBounds().getHeight();
        
        for(int i = 0; i < width; i++){
            List<GridBlock> column = new ArrayList<>();
            
            for(int j = 0; j < height; j ++){
                // Check all corners are in the polygon
                if(hitbox.contains(startX + (i * GRID_BLOCK_SIZE),
                                   startY + (j * GRID_BLOCK_SIZE)) &&
                        
                   hitbox.contains(startX + (i * GRID_BLOCK_SIZE),
                                   startY + (j * GRID_BLOCK_SIZE) + GRID_BLOCK_SIZE) &&
                   
                   hitbox.contains(startX + (i * GRID_BLOCK_SIZE) + GRID_BLOCK_SIZE,
                                   startY + (j * GRID_BLOCK_SIZE)) &&
                   
                   hitbox.contains(startX + (i * GRID_BLOCK_SIZE) + GRID_BLOCK_SIZE,
                                   startY + (j * GRID_BLOCK_SIZE) + GRID_BLOCK_SIZE)){
                    
                    column.add(new GridBlock(startX + (i * GRID_BLOCK_SIZE),
                                             startY + (j * GRID_BLOCK_SIZE),
                                             GRID_BLOCK_SIZE, GRID_BLOCK_SIZE, hitbox));
                    
                }
            }
            blocks.add(column);
        }
        
        for(int i = 0; i < blocks.size(); i++){
            List<GridBlock> blockList = blocks.get(i);
            for(int j = 0; j < blockList.size(); j++){
                blockList.get(j).calculateNeighbours(this);
            }
        }
    }
    
    public List<List<GridBlock>> getBlocks() {
        return blocks;
    }


   public static class GridBlock {
        
        public float x, y, width, height;
        public Set<GridBlock> nonDiagNeighbours;
        public Set<GridBlock> neighbours;
        public double g, h, f;
        public boolean picked;
        
        public double[] pathLocation;
        
        public GridBlock(float x, float y, float width, float height, Polygon hitbox){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            neighbours = new HashSet<>();
            nonDiagNeighbours = new HashSet<>();
            picked = false;
            
            if(hitbox.contains(x, y) &&
			   hitbox.contains(x,y + GRID_BLOCK_SIZE) &&
			   hitbox.contains(x + GRID_BLOCK_SIZE, y) &&
			   hitbox.contains(x + GRID_BLOCK_SIZE, y + GRID_BLOCK_SIZE)){
            	pathLocation = new double[]{x + width / 2, y + height / 2};
            }
            else if(hitbox.contains(x + GRID_BLOCK_SIZE, y + GRID_BLOCK_SIZE)) {
            	pathLocation = new double[]{x + GRID_BLOCK_SIZE, y + GRID_BLOCK_SIZE};
            }
            else if(hitbox.contains(x + GRID_BLOCK_SIZE, y)) {
            	pathLocation = new double[]{x + GRID_BLOCK_SIZE, y};
            }
            else if(hitbox.contains(x, y + GRID_BLOCK_SIZE)){
            	pathLocation = new double[]{x, y + GRID_BLOCK_SIZE};
            }
            else if(hitbox.contains(x, y)) {
            	pathLocation = new double[]{x, y};
            }
        }
        
        public void calculateNeighbours(LevelBlockGrid grid) {
            
            GridBlock right = grid.getGridBlock(this.x + this.width + 1, this.y + 1);
            if(right != null) {
                this.neighbours.add(right);
                right.neighbours.add(this);
                
                this.nonDiagNeighbours.add(right);
                right.nonDiagNeighbours.add(this);
            }
            
            GridBlock bottom = grid.getGridBlock(this.x + 1, this.y + this.height + 1);
            if(bottom != null) {
                this.neighbours.add(bottom);
                bottom.neighbours.add(this);
                
                this.nonDiagNeighbours.add(bottom);
                bottom.nonDiagNeighbours.add(this);
            }
            
            GridBlock topRight = grid.getGridBlock(this.x + this.width + 1, this.y - 1);
            if(topRight != null) {
                this.neighbours.add(topRight);
                topRight.neighbours.add(this);
            }
            
            GridBlock bottomRight = grid.getGridBlock(this.x + this.width + 1, this.y + this.height + 1);
            if(bottomRight != null) {
                this.neighbours.add(bottomRight);
                bottomRight.neighbours.add(this);
            }
            
        }

        public boolean contains(double x2, double y2) {
            return this.x <= x2 && this.x + width >= x2 && this.y <= y2 && this.y + height >= y2;
        }

        public boolean contains(double[] location) {
            return this.x <= location[0] && this.x + width >= location[0] && this.y <= location[1] && this.y + height >= location[1];
        }

        public double[] getPathLocation() {
            return this.pathLocation;
        }
        
    }


    public void resetPicks() {
        for(int i = 0; i < blocks.size(); i++){
            List<GridBlock> blockList = blocks.get(i);
            for(int j = 0; j < blockList.size(); j++){
                blockList.get(j).picked = false;
                blockList.get(j).g = 0;
                blockList.get(j).f = 0;
                blockList.get(j).h = 0;
            }
        }    
    }

}
