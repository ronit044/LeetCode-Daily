class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr=new int[m][n];
        int i=0,j=0,ind=0;
        if(original.length!=(m*n)) return new int[][]{};
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j]=original[ind++];
                if(ind>=original.length) break;
            }
            if(ind>=original.length) break;
        }
        if(ind<original.length) return new int[][]{};
        return arr;
    }
}