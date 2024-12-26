class Solution {
    int res=0;
    public void helper(int[] nums,int ind,int target,int calc){
        if(ind>nums.length-1){
            if(calc==target)
                res++;
            return;
        }
        helper(nums,ind+1,target,calc+nums[ind]);
        helper(nums,ind+1,target,calc-nums[ind]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        helper(nums,0,target,0);
        return res;
    }
}