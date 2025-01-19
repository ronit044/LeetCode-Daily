class Solution {
    public int trapRainWater(int[][] height) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int rows=height.length,cols=height[0].length;
        boolean vis[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            vis[i][0]=true;
            vis[i][cols-1]=true;
            pq.add(new int[]{height[i][0],i,0});
            pq.add(new int[]{height[i][cols-1],i,cols-1});
        }
        for(int i=0;i<cols;i++){
            vis[0][i]=true;
            vis[rows-1][i]=true;
            pq.add(new int[]{height[0][i],0,i});
            pq.add(new int[]{height[rows-1][i],rows-1,i});
        }
        int dirs[][]=new int[][]{
            {0,1},
            {-1,0},
            {1,0},
            {0,-1}
        };
        int ans=0;
        while(!pq.isEmpty()){
            int ar[]=pq.poll();
            int currH=ar[0];
            int currI=ar[1];
            int currJ=ar[2];
            // if(vis[currI][currJ]) continue;
            for(int i=0;i<4;i++){
                int nI=currI+dirs[i][0];
                int nJ=currJ+dirs[i][1];
                if(isValid(nI,nJ,vis)){
                    ans+=Math.max(0,currH-height[nI][nJ]);
                    vis[nI][nJ]=true;
                    pq.add(new int[]{Math.max(currH,height[nI][nJ]),nI,nJ});
                }
            }

        }
        return ans;
    }
    public boolean isValid(int i,int j,boolean[][] vis){
        return i>=0 && j>=0 && i<vis.length && j<vis[0].length && !vis[i][j];
    }
}