class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char [n][n];

        for (int i = 0; i < n; i++) {
        Arrays.fill(board[i], '.');
        }

        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];

        solve(0, board, ans, leftRow, lowerDiagonal, upperDiagonal, n);
        return ans;
    }

    private void solve(int col, char[][] board, List<List<String>> ans, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal, int n) {
        if (col == n){
            ans.add(constructBoard(board, n));
            return;
        }
        for (int row = 0; row < n; row++) {
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {
                board[row][col] ='Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;
                solve (col + 1, board, ans, leftRow, lowerDiagonal, upperDiagonal, n);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }

    private List<String> constructBoard(char[][] board, int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }
}