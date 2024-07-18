class Solution {
    public int helper(List<List<Integer>>  triangle,int x,int y,int[][] dp){
        if(x>triangle.size()-1 || y>triangle.get(x).size()-1) return 0;
        if(dp[x][y]!=-1) return dp[x][y];
        if(x==triangle.size()-1){
            return triangle.get(x).get(y);
        }
        int b=helper(triangle,x+1,y,dp);
        int a=helper(triangle,x+1,y+1,dp);
        return dp[x][y]=triangle.get(x).get(y)+Math.min(a,b);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int l=triangle.size(),l2=triangle.get(l-1).size();
        int[][] dp=new int[l][l2];
        for(int i=0;i<l;i++)
        Arrays.fill(dp[i],-1);
        return helper(triangle,0,0,dp);
    }
}