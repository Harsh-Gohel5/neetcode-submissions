class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] t = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                t[i][j] = -1;
            }
        }

        return LCS(text1, text2, n, m, t);
    }

    public int LCS(String x, String y, int n, int m, int[][] t) {
        // Base case
        if (n == 0 || m == 0) {
            return 0;
        }

        if (t[n][m] != -1) {
            return t[n][m];
        }

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            t[n][m] = 1 + LCS(x, y, n - 1, m - 1, t);
            return t[n][m];
        }

        t[n][m] = Math.max(LCS(x, y, n - 1, m, t), LCS(x, y, n, m - 1, t));
        return t[n][m];
    }
}