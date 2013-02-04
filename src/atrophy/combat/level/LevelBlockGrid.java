package atrophy.combat.level;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

public class LevelBlockGrid {
    
    private static final int GRID_BLOCK_SIZE = 5;
    
    private List<List<GridBlock>> blocks;

    public LevelBlockGrid(Polygon hitbox) {
        
        blocks = new ArrayList<>();
        
        convertPolygonToBlocks(hitbox);
        
    }
    
    private void convertPolygonToBlocks(Polygon hitbox) {

        int startX = (int) hitbox.getBounds().getX(); 
        int startY = (int) hitbox.getBounds().getY();
        
        double width = hitbox.getBounds().getWidth();
        double height = hitbox.getBounds().getHeight();
        
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
                                             GRID_BLOCK_SIZE, GRID_BLOCK_SIZE));
                    
                }
            }
            blocks.add(column);
        }
        
        for(int i = 0; i < blocks.size(); i++){
            List<GridBlock> blockList = blocks.get(i);
            for(int j = 0; j < blockList.size(); j++){
                blockList.get(j).calculateNeighbours(blocks,i,j);
            }
        }
    }
    
    public List<List<GridBlock>> getBlocks() {
        return blocks;
    }


   public static class GridBlock {
        
        public int x, y, width, height;
        public GridBlock left,top,right,bottom;
        
        public GridBlock(int x, int y, int width, int height){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        
        public void calculateNeighbours(List<List<GridBlock>> blocks, int i, int j) {
            // Calculate blocks to right and down then add this block to them to cover the top and left
            
            if(j + 1 < blocks.get(i).size()) {
                GridBlock bottomNeighbour = blocks.get(i).get(j + 1);
                if(bottomNeighbour.x == this.x && bottomNeighbour.y == this.y + height) {
                    this.bottom = bottomNeighbour;
                    bottomNeighbour.top = this;
                }
            }
            
            if(i + 1 < blocks.size() && j < blocks.get(i + 1).size()) {
                GridBlock rightNeighbour = blocks.get(i + 1).get(j);
                if(rightNeighbour.x == this.x + width && rightNeighbour.y == this.y) {
                    this.right = rightNeighbour;
                    rightNeighbour.left = this;
                }
            }
                
        }
    }
    
}
