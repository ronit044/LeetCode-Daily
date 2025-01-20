class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length,n=mat[0].length,l=m*n;
        HashMap<Integer,int[]> hm=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                hm.put(mat[i][j],new int[]{i,j});
            }
        }
        int []rows=new int[m];
        Arrays.fill(rows,0);
        int []cols=new int[n];
        Arrays.fill(cols,0);
        for(int i=0;i<l;i++){
            int ar[]=hm.get(arr[i]);
            rows[ar[0]]++;
            cols[ar[1]]++;
            if(rows[ar[0]]==n) {
                return i;
            }
            if(cols[ar[1]]==m){
                return i;
            }
        }
        return l;
    }
}