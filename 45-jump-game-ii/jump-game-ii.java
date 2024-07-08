import java.util.Arrays;

class Solution {
    public int helper(int[] nums, int i, int[] dp) {
        if (i >= nums.length - 1) return 0;  
        if (dp[i] != -1) return dp[i];  
        int minJumps = Integer.MAX_VALUE - 1;
        for (int j = 1; j <= nums[i]; j++) {  
            if (i + j < nums.length) {
                minJumps = Math.min(minJumps, 1 + helper(nums, i + j, dp));
            }
        }
        return dp[i] = minJumps;
    }

    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
    
}
