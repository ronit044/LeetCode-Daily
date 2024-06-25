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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
          List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        while(!q.isEmpty()){
        List<Integer> lt=new ArrayList<>();
        int l=q.size();
            for(int i=0;i<l;i++){
            TreeNode x=q.peek();
            q.remove();
            if(x!=null){
                lt.add(x.val);
                if(x.left!=null){
                    q.add(x.left);
                }
                if(x.right!=null){
                    q.add(x.right);
                }
            }
        }
        res.add(lt);
    }
       
        return res;
    }
}