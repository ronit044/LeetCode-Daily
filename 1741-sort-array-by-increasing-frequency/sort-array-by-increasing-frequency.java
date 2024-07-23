class Solution {
    public int[] frequencySort(int[] nums) {
          HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int freqA = hm.get(a);
            int freqB = hm.get(b);
            if (freqA == freqB) {
                return b - a; // If frequencies are the same, compare values (decreasing order)
            } else {
                return freqA - freqB; // Compare by frequency (increasing order)
            }
        });

        for (int key : hm.keySet()) {
            pq.add(key);
        }

        int[] result = new int[nums.length];
        int index = 0;
        
        while (!pq.isEmpty()) {
            int num = pq.poll();
            int count = hm.get(num);
            for (int i = 0; i < count; i++) {
                result[index++] = num;
            }
        }
        return result;
        
    }
}