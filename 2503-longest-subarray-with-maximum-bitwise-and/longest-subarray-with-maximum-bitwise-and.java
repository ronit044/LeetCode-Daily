class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,res=0,c=0;
        for(int i:nums) max=Math.max(i,max);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                c++;
            }
            else{
                res=Math.max(res,c);
                c=0;
            }
        }
        res=Math.max(res,c);
        return res;
    }
}