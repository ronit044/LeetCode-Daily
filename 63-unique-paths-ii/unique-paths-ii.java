class Solution {
     public int dfs(int[][] maze,int x,int y,int[][] dp){
        if(x>maze.length-1 || y>maze[0].length-1) return 0;
        if(x==maze.length-1 && y==maze[0].length-1 && maze[x][y]!=1){
            return 1;
        }
        if(dp[x][y]!=-1) return dp[x][y];
        if(maze[x][y]==1) return 0;
        if(maze[x][y]==-1) return 0;
        maze[x][y]=-1;
        int a=dfs(maze,x+1,y,dp);
        int b=dfs(maze,x,y+1,dp);
        return dp[x][y]=a+b;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length,n=grid[0].length;
         int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return dfs(grid,0,0,dp);
    }
}