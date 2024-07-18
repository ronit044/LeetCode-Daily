class Solution {
    public boolean helper(int[] nums,int t,int d){
        int sum=0;
        for(int i:nums){
            sum+=Math.ceil((double)i/(double)d);
        }
        if(sum<=t) return true;
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low=1,high=nums[nums.length-1];
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(nums,threshold,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
}