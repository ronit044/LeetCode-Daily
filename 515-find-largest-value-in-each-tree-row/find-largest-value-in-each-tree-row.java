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
    HashMap<Integer,Integer> hm=new HashMap<>();
    public void helper(TreeNode curr,int level){
        if(curr==null) return;
        hm.put(level,Math.max(hm.getOrDefault(level,Integer.MIN_VALUE),curr.val));
        helper(curr.left,level+1);
        helper(curr.right,level+1);
    }
    public List<Integer> largestValues(TreeNode root) {
        helper(root,0);
        List<Integer> lt=new ArrayList<>(hm.values());
        return lt;
    }
}