/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public void helper(TreeNode root,ArrayList<TreeNode> lt,TreeNode chck){
        if(root==null) return;
        if(root==chck){
            lt.add(root);
            return;
        }
        lt.add(root);
        if(chck.val>root.val)
        {
            helper(root.right,lt,chck);
        }
        if(chck.val<root.val)
        {
            helper(root.left,lt,chck);
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> lt1=new ArrayList<>();
        ArrayList<TreeNode> lt2=new ArrayList<>();
        helper(root,lt1,p);
        helper(root,lt2,q);
        for(int i=Math.min(lt1.size(),lt2.size())-1;i>=0;i--){
            if(lt1.get(i)==lt2.get(i)) return lt1.get(i);
        }
        return root;

    }
}