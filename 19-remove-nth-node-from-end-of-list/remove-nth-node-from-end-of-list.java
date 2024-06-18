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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=null;     
        ListNode fast=head;
        // ListNode dummy=new ListNode
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            if(slow==null) slow=head;
            else slow=slow.next;
            fast=fast.next;
        }
        if(slow==null) return head.next;
        if(slow!=null && slow.next!=null){
            slow.next=slow.next.next;
        }
        return head;
        
    }
}