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
    boolean res=true;
    TreeNode prev=null;
    public void validate(TreeNode root){
       if(root==null) return;
       validate(root.left);
        if(prev!=null){
            if(prev.val>=root.val){
                res=false;
                return;
            }
        }
        prev=root;
       validate(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        validate(root);
        return res;
    }
}