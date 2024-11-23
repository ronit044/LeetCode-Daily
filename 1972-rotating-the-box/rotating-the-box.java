class Solution {
    public void bringDown(char[][] res,int i,int j){
        i++;
        while(i<res.length && j<res[0].length && res[i][j]=='.'){
            res[i-1][j]='.';
            res[i][j]='#';
            i++;
        }
    }
    public char[][] rotateTheBox(char[][] box) {
      int m = box.length;
        int n = box[0].length;
        char[][] res = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - 1 - i] = box[i][j];
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<m;j++){
                if(res[i][j]=='#'){
                    bringDown(res,i,j);
                }
            }
        }
        return res;
    }
}