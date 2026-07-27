class Solution {
    public int uniquePaths(int m, int n) {
        int totalMoves = m + n - 2;
        int choose = Math.min(m - 1, n - 1);

        long ans = 1;

        for (int i = 1; i <= choose; i++) {
            ans = ans * (totalMoves - choose + i) / i;
        }

        return (int) ans;
    }
}