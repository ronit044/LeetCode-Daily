class Solution {
    public int waysToSplitArray(int[] nums) {
        int l=nums.length;
        long totalSum=0;
        for(int i:nums) totalSum+=i;
        long sum=0;
        long res=0;
        for(int i=0;i<l-1;i++){
            sum+=nums[i];
            if(sum>=(totalSum-sum)) res++;
        }
        return (int)res;
    }
}