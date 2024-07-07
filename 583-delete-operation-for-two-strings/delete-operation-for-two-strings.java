class Solution {
    public int helper(String t1,String t2,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        int y=0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)){
            y=1+helper(t1,t2,i-1,j-1,dp);
        }
        else{
            y=Math.max(helper(t1,t2,i-1,j,dp),helper(t1,t2,i,j-1,dp));
        }
        return dp[i][j]=y;
    }
    public int minDistance(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int[][] dp=new int[l1][l2];
        for(int i=0;i<l1;i++) Arrays.fill(dp[i],-1);
        int lcs=helper(word1,word2,l1-1,l2-1,dp);
        return (word1.length()-lcs)+(word2.length()-lcs);
    }
}