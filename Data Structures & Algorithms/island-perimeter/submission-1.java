class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int landcells = 0;
        int sharedcells = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    landcells++;
                    if(i + 1 < rows && grid[i + 1][j] == 1) {
                        sharedcells++;
                    }
                    if(j + 1 < cols && grid[i][j + 1] == 1){
                        sharedcells++;
                    }
                }
            }
        }
        return landcells * 4 - sharedcells * 2;
    }
}