class Solution {
    public int climbStairs(int n) {
        int k=2;
        int dp[]=new int[n+1];
        dp[0]=1;dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]*2-(i-k-1>=0?dp[i-k-1]:0);
        }
        return dp[n];
    }
}