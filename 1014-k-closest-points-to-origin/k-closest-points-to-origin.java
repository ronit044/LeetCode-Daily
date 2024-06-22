class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int l=points.length;
        double[] arr=new double[l];
        for(int i=0;i<l;i++){
            int ar[]=points[i];
            double x=Math.sqrt(Math.pow(ar[0],2)+Math.pow(ar[1],2));
            arr[i]=x;
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    double x=arr[j];
                    int[] ar=points[j];

                    arr[j]=arr[j+1];
                    points[j]=points[j+1];

                    arr[j+1]=x;
                    points[j+1]=ar;
                }
            }
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            res[i]=points[i];
        }
        return res;
    }
}