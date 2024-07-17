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
        if(root==null) return new ArrayList<List<Integer>>(new ArrayList<>());
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> lt=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode r=q.poll();
                // if(r!=null){
                    lt.add(r.val);
                    if(r.left!=null){
                        q.add(r.left);
                    }
                    if(r.right!=null){
                        q.add(r.right);
                    }
                // }
            }
            res.add(lt);
        }
        return res;
    }
}