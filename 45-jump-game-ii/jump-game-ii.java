class Solution {
    public int helper(int[] nums, int ind, int[] dp) {
        if (ind >= nums.length - 1) return 0;
        if (dp[ind] != -1) return dp[ind];
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= nums[ind]; i++) {
            int nextJump = helper(nums, ind + i, dp);
            if (nextJump != Integer.MAX_VALUE) {
                res = Math.min(res, nextJump + 1); 
            }
        }
        return dp[ind] = res;
    }
    
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
}
