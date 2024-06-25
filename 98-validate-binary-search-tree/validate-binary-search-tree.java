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
    TreeNode curr;
    TreeNode prev;
    boolean ans=true;
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        curr=root;
        if(prev!=null){
            if(prev.val>=curr.val){ ans=false;
            return;
            }
        }
        prev=curr;
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
    inorder(root);
        return ans;
    }
}