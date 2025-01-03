class Solution {
    int dirs[][]=new int[][]{{0,0},{0,1},{1,0},{1,1},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
    public int calculateAverage(int[][] img,int i,int j)
    {
        int rows=img.length,cols=img[0].length;
        int sum=0,total=0;
        for(int []ar:dirs){
            int x=i+ar[0];
            int y=j+ar[1];
            if((x>=0 && x<=rows-1) && (y>=0 && y<=cols-1)){
                sum+=img[x][y];
                total++;
            }
        }
        // System.out.println("i: "+i+", j: "+j);
        // System.out.println("sum= "+sum+", total= "+total);
        // System.out.println("_____________");
        return (int)(sum/total);
    }
    public int[][] imageSmoother(int[][] img) {
        int rows=img.length,cols=img[0].length;
        int res[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[i][j]=calculateAverage(img,i,j);
            }
        }
        return res;
    }
}

