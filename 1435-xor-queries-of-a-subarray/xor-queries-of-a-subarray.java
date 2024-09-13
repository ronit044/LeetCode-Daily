class Solution {
    public int xorCalc(int[] arr,int start,int end){
        int res=arr[start];
        for(int i=start+1;i<=end;i++){
            res^=arr[i];
        }
        return res;
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        int l=queries.length;
        int res[]=new int[l];
        for(int i=0;i<l;i++){
            res[i]=xorCalc(arr,queries[i][0],queries[i][1]);
        }
        return res;
    }
}