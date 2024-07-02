class Solution {
    int res=0;
    private int robLinear(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0, current = 0;
        for (int i = start; i <= end; i++) {
            current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
    public int rob(int[] nums) {
        return robLinear(nums,0,nums.length-1);
        // return res;
    }
}