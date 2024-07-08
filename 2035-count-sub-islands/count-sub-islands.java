class Solution {
    int c=0;
    void dfs(int[][] grid1,int[][]g,int i,int j){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]==0 || g[i][j]==2) return;
        if(grid1[i][j]!=1){
            c=-1000;
            return;
        }
        g[i][j]=2;
        c++;
        dfs(grid1,g,i+1,j);
        dfs(grid1,g,i-1,j);
        dfs(grid1,g,i,j+1);
        dfs(grid1,g,i,j-1);
    }
    public int countSubIslands(int[][] grid1, int[][] g) {
         int l1=g.length,l2=g[0].length,res=0;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(g[i][j]==1){
                    dfs(grid1,g,i,j);
                    if(c>0) res++;
                    c=0;
                }
            }
        }
        return res;
    }
}