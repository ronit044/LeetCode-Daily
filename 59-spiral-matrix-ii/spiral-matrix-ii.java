class Solution {
    public int[][] generateMatrix(int n) {
        int res[][]=new int[n][n];
		int left=0,right=res[0].length-1;
		int top=0, bottom=res.length-1;
		int ind=0,num=1;

		while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
    		    res[top][i]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res[i][right]=num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res[bottom][i]=num++;
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res[i][left]=num++;
                }
            }
            left++;
		}
        return res;
    }
}