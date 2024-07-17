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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode first=head;
       for(int i=1;i<=k-1;i++){
            first=first.next;
       }
       ListNode temp=first;
       ListNode second=head;
       while(temp.next!=null){
        temp=temp.next;
        second=second.next;
       }
       int temp2=first.val;
       first.val=second.val;
       second.val=temp2;
       return head;       
    }
}