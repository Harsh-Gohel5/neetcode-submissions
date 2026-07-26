class Solution {
    int m;
    int n;
    int[][] grid;
    int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        grid = obstacleGrid;
        m = grid.length;
        n = grid[0].length;

        dp = new int[m][n];

        // Fill dp with -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(0, 0);
    }

    private int solve(int i, int j) {
        // Out of boundary or obstacle
        if (i >= m || j >= n || grid[i][j] == 1) {
            return 0;
        }

        // Reached destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = solve(i, j + 1);
        int down = solve(i + 1, j);

        dp[i][j] = right + down;

        return dp[i][j];
    }
}