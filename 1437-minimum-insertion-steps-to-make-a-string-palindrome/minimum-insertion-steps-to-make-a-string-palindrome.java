class Solution {
      public int helper(String t1,String t2,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        int y=0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)){
            y= 1+helper(t1,t2,i-1,j-1,dp);
        }
        else{
            y= Math.max(helper(t1,t2,i-1,j,dp),helper(t1,t2,i,j-1,dp));
        }
        return dp[i][j]=y; 
    }
    public int minInsertions(String s) {
        String s2="";
        int l=s.length();
        int[][] dp=new int[l][l];
        for(int i=0;i<l;i++) Arrays.fill(dp[i],-1);
        for(char ch:s.toCharArray()){
            s2=ch+s2;
        }
        return s.length()-helper(s,s2,s.length()-1,s.length()-1,dp);
    }
}