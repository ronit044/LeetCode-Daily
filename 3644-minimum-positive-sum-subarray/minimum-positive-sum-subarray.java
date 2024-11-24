class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int len=nums.size(),res=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            int sum=0;
            for(int j=i;j<len;j++){
                sum+=nums.get(j);
                int size=j-i+1;
                if(size>=l && size<=r && sum>0) res=Math.min(res,sum);
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}