class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, oddCount = 0;
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);
        for (int num : nums) {
            if ((num & 1) != 0) oddCount++;
            if (prefixMap.containsKey(oddCount - k)) res += prefixMap.get(oddCount - k);
            prefixMap.put(oddCount, prefixMap.getOrDefault(oddCount, 0) + 1);
        }
        return res;
    }
}
