class Solution {
    public int helper(int[] nums, int ind, int sum, int t, int[][] dp) {
        if (ind > nums.length - 1) {
            if (sum == t) {
                return 1;
            }
            return 0;
        }
        if (dp[ind][sum + 1000] != -1) return dp[ind][sum + 1000]; // shifting sum by 1000 to handle negative indices
        int a = helper(nums, ind + 1, sum - nums[ind], t, dp);
        int b = helper(nums, ind + 1, sum + nums[ind], t, dp);
        return dp[ind][sum + 1000] = a + b;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int[][] dp = new int[nums.length][2001]; // range of sum is -1000 to 1000
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(nums, 0, 0, target, dp);
    }
}
