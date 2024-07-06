class Solution {
    public int helper(int[] nums, int ind,int end, int[] dp){
       if(ind>end) return 0;
       if(dp[ind]!=-1) return dp[ind];
       int a=nums[ind]+helper(nums,ind+2,end,dp);
       int b=helper(nums,ind+1,end,dp);
       dp[ind]=Math.max(a,b);
       return dp[ind];
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
      
        int max1 = helper(nums, 0, nums.length - 2,dp1);
        int max2 = helper(nums, 1, nums.length - 1,dp2);
        
        return Math.max(max1, max2);
    }
}
