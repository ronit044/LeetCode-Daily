class Solution {
    public void moveZeroes(int[] nums) {
        int ind=0,cnt=0,l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]!=0){
                nums[ind++]=nums[i];
            }
            else cnt++;
        }
        for(int i=(l-cnt);i<l;i++) nums[i]=0;
        
    }
}