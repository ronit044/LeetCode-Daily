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
    public int helper(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int a=0,b=0;
        if(root.left!=null){
            a=1+helper(root.left);
        }
        if(root.right!=null){
            b=1+helper(root.right);
        }
        if(a==0) return b;
        if(b==0) return a;
        return Math.min(a,b);
    }
    public int minDepth(TreeNode root) {
        return helper(root);
    }
}