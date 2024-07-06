class Solution {
    private static final int MOD = 1000000007;
    public int helper(int[][] grid, int i, int j, int k, int[][][] dp, int sum) {
        if (i >= grid.length || j >= grid[0].length) return 0;
        sum = (sum + grid[i][j]) % k;
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return sum == 0 ? 1 : 0;
        }
        if (dp[i][j][sum] != -1) return dp[i][j][sum];
        int downPaths = helper(grid, i + 1, j, k, dp, sum);
        int rightPaths = helper(grid, i, j + 1, k, dp, sum);
        dp[i][j][sum] = (downPaths + rightPaths) % MOD;
        return dp[i][j][sum];
    }
    public int numberOfPaths(int[][] grid, int k) {
        int r = grid.length, c = grid[0].length;
        int[][][] dp = new int[r][c][k];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(grid, 0, 0, k, dp, 0);
    }
}
