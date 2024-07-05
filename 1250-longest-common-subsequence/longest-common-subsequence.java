class Solution {
    public int helper(String t1,String t2,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int y=0;
        if(t1.charAt(i)==t2.charAt(j)){
            y= 1+helper(t1,t2,i-1,j-1,dp);
        }
        else{
        y= Math.max(helper(t1,t2,i-1,j,dp),helper(t1,t2,i,j-1,dp));
        }
        dp[i][j]=y;
        return y;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++)
            dp[i][j]=-1;
        }
        return helper(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
}