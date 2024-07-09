class Solution {
    public void helper(int[] nums,List<List<Integer>> res,List<Integer> lt,int l){
        if(l>nums.length-1) {
            res.add(new ArrayList<>(lt));
            return;
        }
        lt.add(nums[l]);
        helper(nums,res,lt,l+1);
        lt.remove(lt.size()-1);
        while (l + 1 < nums.length && nums[l] == nums[l + 1]) l++;
        helper(nums,res,lt,l+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,res,new ArrayList<>(),0);
        return res;
    }
}