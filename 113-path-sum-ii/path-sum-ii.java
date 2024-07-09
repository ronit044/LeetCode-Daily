/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void helper(TreeNode root,int t,int sum,List<Integer> lt){
        if(root==null) return;
        sum+=root.val;
        lt.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==t){
                res.add(new ArrayList<>(lt));
            }
        }
        helper(root.left,t,sum,new ArrayList<>(lt));
        helper(root.right,t,sum,new ArrayList<>(lt));
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,0,new ArrayList<>());
        return res;
    }
}