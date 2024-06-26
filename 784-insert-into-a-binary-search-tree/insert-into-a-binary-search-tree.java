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
    public TreeNode insert(TreeNode r,int val){
        if(r==null) return new TreeNode(val);
        if(val>r.val){
            r.right=insert(r.right,val);
        }
        if(val<r.val){
            r.left=insert(r.left,val);
        }
        return r;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
}