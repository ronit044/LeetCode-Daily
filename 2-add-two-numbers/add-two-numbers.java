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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode dummy=head;
        int sum=0,carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int d1=l1!=null?l1.val:0;
            int d2=l2!=null?l2.val:0;
            sum=d1+d2+carry;
            carry=sum/10;
            int num=sum%10;
            ListNode y=new ListNode(num);
            dummy.next=y;
            dummy=dummy.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return head.next;
    }
}