import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Create a set to store all values to be deleted
        HashSet<Integer> toDelete = new HashSet<>();
        for (int i : nums) {
            toDelete.add(i);
        }

        // Create a dummy node to simplify edge case handling for the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        // Traverse the list once and remove nodes whose values are in the set
        while (curr != null) {
            if (toDelete.contains(curr.val)) {
                prev.next = curr.next;  // Skip the current node
            } else {
                prev = curr;  // Move to the next node
            }
            curr = curr.next;
        }

        return dummy.next;  // Return the updated list, skipping the dummy node
    }
}
