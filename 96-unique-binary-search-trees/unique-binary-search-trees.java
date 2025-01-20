class Solution {
    public int helper(int n,int []dp){
        if(n==1 || n==0) return 1;
        if(n==2) return 2;
        if(dp[n]!=-1) return dp[n];
        int count=0;
        for(int i=1;i<=n;i++){
            count+=helper(i-1,dp)*helper(n-i,dp);
        } 
        return dp[n]=count;
    }
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
}