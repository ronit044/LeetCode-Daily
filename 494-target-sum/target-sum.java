class Solution {
    int count=0;
    public void helper(int[] nums,int ind,int sum,int t,int[] dp){
        if(ind>nums.length-1){
            if(sum==t)
            {
                count++;
            }
            return;
        }
        helper(nums,ind+1,(sum-nums[ind]),t,dp);
        helper(nums,ind+1,(sum+nums[ind]),t,dp);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        helper(nums,0,0,target,dp);
        return count;
    }
}