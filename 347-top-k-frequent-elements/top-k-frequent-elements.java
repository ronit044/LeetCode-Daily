class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int i:hm.keySet()) {
            pq.add(new int[]{i, hm.get(i)});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq);
        int res[]=new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()){
            res[i++]=pq.poll()[0];
        }
        return res;
    }
}