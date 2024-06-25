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
    public void inorder(TreeNode root,List<Integer> lt){
        if(root==null) return;
        inorder(root.left, lt);
        lt.add(root.val);
        inorder(root.right,lt);
    }
    public boolean isValidBST(TreeNode root) {
    List<Integer> lt=new ArrayList<>();
    inorder(root,lt);
    for(int i=0;i<lt.size()-1;i++){
        if(lt.get(i)>=lt.get(i+1)) return false;
    }
    return true;
        
    }
}