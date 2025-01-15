class Solution {
    public int maxProduct(int[] nums) {
        int l=nums.length;
        if(l==1) return nums[0];
        int minProduct=nums[0],maxProduct=nums[0],res=nums[0];
        for(int i=1;i<l;i++){
            int temp=minProduct;
            minProduct=Math.min(nums[i],Math.min(nums[i]*minProduct,nums[i]*maxProduct));
            maxProduct=Math.max(nums[i],Math.max(nums[i]*temp,nums[i]*maxProduct));
            res=Math.max(maxProduct,res);
        }
        return res;
    }
}