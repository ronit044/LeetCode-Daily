class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> pq=new PriorityQueue<>((p1,p2)->(p2[0]*p2[0])+(p2[1]*p2[1]) - ((p1[0]*p1[0])+(p1[1]*p1[1])));

       for(int[] x:points){
        pq.add(x);
        if(pq.size()>k) pq.poll();
       }
       int res[][]=new int[k][2];
       while(k>0){
        res[--k]=pq.poll();
      
       }
       return res;
    }
}