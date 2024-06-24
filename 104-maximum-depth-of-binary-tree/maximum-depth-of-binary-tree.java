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
    public int helper(TreeNode root,int res){
        if(root==null) return res;
        return Math.max(helper(root.left,res+1),helper(root.right,res+1));
    }
    public int maxDepth(TreeNode root) {
        return helper(root,0);
    }
}