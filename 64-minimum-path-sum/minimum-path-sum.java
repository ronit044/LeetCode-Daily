class Solution {
    public int dfs(int i,int j,int[][] grid,int[][] dp){
        if(i>grid.length-1 || j>grid[0].length-1) return Integer.MAX_VALUE;
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int a=dfs(i+1,j,grid,dp);
        int b=dfs(i,j+1,grid,dp);
        return dp[i][j]=grid[i][j]+Math.min(a,b);
    }
    public int minPathSum(int[][] grid) {
        int l=grid.length;
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<l;i++)
        Arrays.fill(dp[i],-1);
        return dfs(0,0,grid,dp);
    }
}