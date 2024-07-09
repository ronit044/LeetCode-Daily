class Solution {
    TreeNode firstElement = null;
    TreeNode secondElement = null;
    TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);
    
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        
        if (firstElement == null && prevElement.val > root.val) {
            firstElement = prevElement;
        }
        
        if (firstElement != null && prevElement.val > root.val) {
            secondElement = root;
        }
        
        prevElement = root; 
        
        inOrder(root.right);
    }
    
    public void recoverTree(TreeNode root) {
        inOrder(root);
        
        int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }
}
