class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int top=0,bottom=m-1,left=0,right=n-1;
        List<Integer> res=new ArrayList<>();
        int ind=0;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                res.add(matrix[bottom][i]);
            }
            }
            bottom--;
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                res.add(matrix[i][left]);
            }
            }
            left++;
        }
        return res;
    }
}