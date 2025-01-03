class Solution {
    public int helper(int []nums,int checkInd){
        int moves=0;
        for(int i=0;i<nums.length;i++){
            if(i==checkInd) continue;
            moves+=Math.abs(nums[checkInd]-nums[i]);
        }
        return moves;
    }
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if((l&1)==0){
            return Math.min(helper(nums,(l/2)),helper(nums,(l/2)-1));
        }
        return helper(nums,(int)(l/2));
    }
}

// 1,2,9,10