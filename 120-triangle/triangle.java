class Solution {
    public int helper(List<List<Integer>> triangle, int i,int j,int[][] dp){
        if(i>triangle.size()-1 || j>triangle.get(i).size()-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        int a=helper(triangle,i+1,j,dp);
        int b=helper(triangle,i+1,j+1,dp);
        return dp[i][j]=triangle.get(i).get(j)+Math.min(a,b);
    }
    public int minimumTotal(List<List<Integer>> tri) {
        int l=tri.size();
        int[][] dp=new int[l][tri.get(l-1).size()];
        for(int i=0;i<l;i++) Arrays.fill(dp[i],-1);
       return helper(tri,0,0,dp);
    }
}