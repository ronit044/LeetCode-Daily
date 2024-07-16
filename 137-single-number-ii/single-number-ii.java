class Solution {
    public int singleNumber(int[] nums) {
        int x=0,c=0;
        long res=0;
        for(int i=0;i<=31;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                if((nums[j] & (1<<i)) !=0) c++;
            }
            if(c%3!=0) res+=Math.pow(2,i);
        }
        return (int)res;
    }
}