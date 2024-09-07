class Solution {
    public boolean check(ListNode head, TreeNode root) {
        if (head == null) return true; // Linked list is fully traversed, so return true
        if (root == null) return false; // Tree node is null but the list is not, return false

        // Check if current node matches and recursively check the next node in the list
        if (head.val == root.val) {
            return check(head.next, root.left) || check(head.next, root.right);
        }
        
        // If the current node does not match, return false
        return false;
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false; // No tree node left to check

        // Check if the path starting at the current root matches, or check the left or right subtree
        return check(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}
