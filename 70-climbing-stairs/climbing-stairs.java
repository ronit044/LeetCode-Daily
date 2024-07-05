class Solution {
    public int helper(int n,int dp[]){
        if(n<0) return 0;
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==0) return 1;
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
       return helper(n,dp);
    }
}