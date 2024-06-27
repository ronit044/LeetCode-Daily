class Solution {
    public int findCenter(int[][] edges) {
        int prev=edges[0][1],ans=0;
        for(int i=1;i<edges.length;i++){
            if(edges[i][0]==prev) ans=prev;
            prev=edges[i][1];
        }   
        return ans!=0?ans:prev;
    }
}