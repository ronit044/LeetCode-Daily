class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int left[]=new int[l];
        int right[]=new int[l];
        int p=1;
        left[0]=p;
        for(int i=1;i<l;i++){
            p*=nums[i-1];
            left[i]=p;
        }
        p=1;
        right[l-1]=p;
        for(int i=l-2;i>=0;i--){
            p*=nums[i+1];
            right[i]=p;
        }
        int res[]=new int[l];
        for(int i=0;i<l;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
}