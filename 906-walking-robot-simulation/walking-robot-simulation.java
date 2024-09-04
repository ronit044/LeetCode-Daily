class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int d[][]=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
        int curr[]=new int[]{0,0};
        Set<String> st=new HashSet<>();
        int dir=1,res=0;
        for(int ar[]:obstacles){
            st.add(ar[0]+","+ar[1]);
        }
        for(int i:commands){
            if(i==-1){
                dir=(dir+1)%4;
            }
            else if(i==-2){
                dir=(dir+3)%4;
            }
            else{
                for(int j=1;j<=i;j++){
                    int x=curr[0]+d[dir][0];
                    int y=curr[1]+d[dir][1];
                    if(st.contains(x+","+y)){
                        break;
                    }
                    curr[0]=x;
                    curr[1]=y;
                    res=Math.max(res,((curr[0]*curr[0]) + (curr[1]*curr[1])));
                }
            }
        }
        return res;
    }
}