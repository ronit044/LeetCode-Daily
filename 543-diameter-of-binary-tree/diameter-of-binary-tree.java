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
    public class Info{
        int diam;
        int ht;
        Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public Info Calculate(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo = Calculate(root.left);
        Info rightInfo = Calculate(root.right);

        int currdiam = Math.max(Math.max(leftInfo.diam , rightInfo.diam),leftInfo.ht + rightInfo.ht  );
        int currht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(currdiam , currht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return Calculate(root).diam;
    }
}