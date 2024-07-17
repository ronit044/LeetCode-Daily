class Solution {
    public int dfs(int[][] maze,int x,int y,int[][] dp){
        if(x>maze.length-1 || y>maze[0].length-1) return 0;
        if(x==maze.length-1 && y==maze[0].length-1){
            return 1;
        }
        if(dp[x][y]!=-1) return dp[x][y];
        if(maze[x][y]==-1) return 0;
        maze[x][y]=-1;
        int a=dfs(maze,x+1,y,dp);
        int b=dfs(maze,x,y+1,dp);
        // maze[x][y]=0;
        return dp[x][y]=a+b;
    }
    public int uniquePaths(int m, int n) {
        int[][] maze=new int[m][n];
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                maze[i][j]=0;
                dp[i][j]=-1;
            }
        }
        return dfs(maze,0,0,dp);
    }
}