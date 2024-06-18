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
    public ListNode rotateRightByOne(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode secondLast = null;
        ListNode last = head;
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
        last.next = head;
        head = last;
        return head;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length = length + 1;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        for (int i = 0; i < k; i++) {
            head = rotateRightByOne(head);
        }
        return head;
    }
}
