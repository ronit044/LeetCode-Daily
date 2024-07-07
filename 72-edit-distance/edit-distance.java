class Solution {
    public int helper(String w1, String w2, int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        int ins=0,del=0,rep=0;
        if(w1.charAt(i)==w2.charAt(j)){
            return helper(w1,w2,i-1,j-1,dp);
        }
        else{
            ins=1+helper(w1,w2,i,j-1,dp);
             del=1+helper(w1,w2,i-1,j,dp);
             rep=1+helper(w1,w2,i-1,j-1,dp);
        }
        return dp[i][j]=Math.min(ins,Math.min(del,rep));
    }
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++)
        Arrays.fill(dp[i],-1);
        return helper(word1,word2,word1.length()-1,word2.length()-1,dp);
    }
}