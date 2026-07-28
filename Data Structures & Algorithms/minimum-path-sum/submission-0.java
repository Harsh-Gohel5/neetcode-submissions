class Solution {

    public int solve(int[][] grid, int i, int j, int[][] dp) {
        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int moveDown = solve(grid, i + 1, j, dp);
        int moveRight = solve(grid, i, j + 1, dp);

        dp[i][j] =
            grid[i][j] + Math.min(moveDown, moveRight);

        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(grid, 0, 0, dp);
    }
}