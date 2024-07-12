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
    List<String> res=new ArrayList<>();
    public void helper(TreeNode root,String st){
        if(root==null) return;
        if(root.left==null && root.right==null){
            st+=root.val;
            res.add(st);
        }
        st+=root.val+"->";
        if(root.left!=null) helper(root.left,st);
        if(root.right!=null) helper(root.right,st);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return res;
    }
}