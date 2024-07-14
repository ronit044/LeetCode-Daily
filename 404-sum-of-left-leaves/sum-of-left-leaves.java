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
    public int helper(TreeNode root,int sum,Boolean b){
        if(root==null) return 0;
        if(root.left==null && root.right==null && b){
            sum+=root.val;
            return sum;
        }
        int a=helper(root.left,sum,true);
        int c=helper(root.right,sum,false);
        return a+c;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,0,false);
    }
}