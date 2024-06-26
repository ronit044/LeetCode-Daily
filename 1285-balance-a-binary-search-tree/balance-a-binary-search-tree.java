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
    TreeNode sortedArrayToBST(List<Integer> nodes, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nodes.get(mid));

        node.left = sortedArrayToBST(nodes, start, mid - 1);
        node.right = sortedArrayToBST(nodes, mid + 1, end);

        return node;
    }

    public void inOrder(TreeNode root,ArrayList<Integer> lt){
        if(root==null) return;
        inOrder(root.left,lt);
        lt.add(root.val);
        inOrder(root.right,lt);
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> lt=new ArrayList<>();
        inOrder(root,lt);
        return sortedArrayToBST(lt, 0, lt.size() - 1);
    }
}