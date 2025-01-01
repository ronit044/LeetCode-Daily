class Solution {
    public boolean check(int[] nums,int low,int high){
        for(int i=0; i<low-1;i++)
        {
            if(nums[i] >= nums[i + 1])
            {
                return false;
            }
        }
        if(low > 0 && high < nums.length-1 && nums[low-1]>=nums[high + 1])
        {
            return false;
        }
        for(int i = high+1;i<nums.length-1;i++)
        {
            if(nums[i] >= nums[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public int incremovableSubarrayCount(int[] nums) {
        int l=nums.length,res=0;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(check(nums,i,j)) res++;
            }
        }
        return res;
    }
}