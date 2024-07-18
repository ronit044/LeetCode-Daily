class Solution {
    public int minCost(int[] start, int[] home, int[] rcost, int[] ccost) {
        int r=0;int c=0;
		for(int i=Math.min(start[0],home[0]);i<=Math.max(start[0],home[0]);i++) r+=rcost[i];
		for(int i=Math.min(start[1],home[1]);i<=Math.max(start[1],home[1]);i++) c+=ccost[i];
		return (r-rcost[start[0]])+(c-ccost[start[1]]);
    }
}