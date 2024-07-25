class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums) pq.add(i);
        int[] res=new int[nums.length];
        int k=0;
        while(!pq.isEmpty()) res[k++]=pq.poll();
        return res;
    }
}