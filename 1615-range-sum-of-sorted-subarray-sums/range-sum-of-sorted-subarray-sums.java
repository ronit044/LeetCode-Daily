class Solution {
   public List<Integer> generateContiguousSubarraySums(int[] nums) {
        List<Integer> subarraySums = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int subarraySum = 0;
            for (int j = i; j < n; j++) {
                subarraySum += nums[j];
                subarraySums.add(subarraySum);
            }
        }
        
        return subarraySums;
    }
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        List<Integer> res=generateContiguousSubarraySums(nums);
        Collections.sort(res);
        long sumres=0;
        for(int i=left-1;i<=right-1;i++){
            sumres+=res.get(i);
        }
        return (int)(sumres%mod);
    }
}