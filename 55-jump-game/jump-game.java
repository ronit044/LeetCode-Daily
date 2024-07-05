class Solution {
    public boolean helper(int[] nums,int ind,int[] dp)
    {
        if(ind>nums.length-1) return false;
        if(dp[ind]!=-1){
            return dp[ind]==1?true:false;
        }
        if(ind==nums.length-1) return true;
        for(int i=1;i<=nums[ind];i++){
            if(helper(nums,i+ind,dp)==true){
                dp[i+ind]=1;
                return true;
            }
        }
        dp[ind]=0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int dp[]=new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helper(nums,0,dp);
    }
}