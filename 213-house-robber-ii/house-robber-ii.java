class Solution {
    public int helper(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robFrom(nums, start, end, dp);
    }
    
    public int robFrom(int[] nums, int ind, int end, int[] dp) {
        if (ind > end) return 0;
        if (dp[ind] != -1) return dp[ind];
        
        int rob = nums[ind] + robFrom(nums, ind + 2, end, dp);
        int skip = robFrom(nums, ind + 1, end, dp);
        dp[ind] = Math.max(rob, skip);
        
        return dp[ind];
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int max1 = helper(nums, 0, nums.length - 2);
        int max2 = helper(nums, 1, nums.length - 1);
        
        return Math.max(max1, max2);
    }
}