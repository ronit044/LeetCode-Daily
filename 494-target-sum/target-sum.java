class Solution {
    public int helper(int[] nums,int ind,int target,int calc,int[][] dp){
        if(ind>nums.length-1){
            if(calc==target)
                return 1;
            return 0;
        }
        if(dp[ind][calc+1000]!=-1) return dp[ind][calc+1000];
        return dp[ind][calc+1000]=helper(nums,ind+1,target,calc+nums[ind],dp)+helper(nums,ind+1,target,calc-nums[ind],dp);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int dp[][]=new int[nums.length][5000];
        for(int ar[]:dp) Arrays.fill(ar,-1);
        return helper(nums,0,target,0,dp);
    }
}