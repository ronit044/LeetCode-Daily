class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int res[]=new int[l];
        int p=1;
        res[0]=p;
        for(int i=1;i<l;i++){
            p*=nums[i-1];
            res[i]=p;
        }
        p=1;
        for(int i=l-2;i>=0;i--){
            p*=nums[i+1];
            res[i]*=p;
        }
        return res;
    }
}