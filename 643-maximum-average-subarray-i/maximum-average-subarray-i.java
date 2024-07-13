class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        double res=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            if(i+1>=k){
                if(i-k>=0){
                    sum-=nums[i-k];
                }
                res=Math.max(res,sum/k);
            }
        }
        return res;
    }
}