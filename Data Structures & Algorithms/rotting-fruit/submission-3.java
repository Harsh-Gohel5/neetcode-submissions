class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i,j});
                }
                else if(grid [i][j] == 1) {
                    fresh ++;
                }
            }
        }

        if(fresh == 0) 
        return 0;


    int time = 0;
    int [][] directions = {{0,1},{0,-1},{1,0},{-1,0}
    };
    while (!queue.isEmpty() && fresh > 0) {
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            int [] current = queue.poll();
            int r = current[0];
            int c = current[1];

            for (int[] d : directions) {
                int newRow = r + d[0];
                int newCol = c + d[1];
                
                if(newRow >= 0 && newCol >= 0 && newRow < row && newCol < col && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2;
                    fresh--;
                    queue.offer(new int[] {newRow, newCol});
                }
            }
        }
        time++;
    }
    return fresh == 0 ? time : -1;
}
}

