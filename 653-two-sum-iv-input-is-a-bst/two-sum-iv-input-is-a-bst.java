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
    public boolean helper(TreeNode r1, TreeNode r2, int k) {
        if (r1 == null || r2 == null) return false;
        int sum = r1.val + r2.val;
        if (r1 != r2 && sum == k) return true;
        if (sum < k) return helper(r1.right, r2, k) || helper(r1, r2.right, k);
        else return helper(r1.left, r2, k) || helper(r1, r2.left, k);
    }

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        return helper(root, root, k);
    }
}