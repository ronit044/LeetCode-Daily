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
    private int maxSum = Integer.MIN_VALUE;

    private int helper(TreeNode node) {
        if (node == null) return 0;
        int leftMax = Math.max(0, helper(node.left));
        int rightMax = Math.max(0, helper(node.right));
        maxSum = Math.max(maxSum, leftMax + rightMax + node.val);
        return node.val + Math.max(leftMax, rightMax);
    }

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }
}
