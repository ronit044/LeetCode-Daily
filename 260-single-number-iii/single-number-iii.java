class Solution {
    public int[] singleNumber(int[] nums) {
        int x=0;
        for(int i:nums) x^=i;
        int r=x & -x;
        int n1=0,n2=0;
        for(int i:nums){
            if((i&r)!=0) n1^=i;
            else n2^=i;
        }
        return new int[]{n1,n2};
    }
}