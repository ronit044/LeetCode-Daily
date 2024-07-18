class Solution {
    public int helper(int[] nums,int ind,int sum,int[][] dp){
        if(ind>nums.length-1) return sum;
        if(dp[ind][sum]!=-1) return dp[ind][sum];
        // if(ind==nums.length-1) return sum;
        int a=helper(nums,ind+2,sum+nums[ind],dp);
        int b=helper(nums,ind+1,sum,dp);
        return dp[ind][sum]=Math.max(a,b);
    }
    public int rob(int[] nums) {
        int[][] dp=new int[nums.length][10001];
        for(int i=0;i<nums.length;i++)
        Arrays.fill(dp[i],-1);
        return helper(nums,0,0,dp);
    }
}