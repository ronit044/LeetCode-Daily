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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode dummyHead=new ListNode();
        ListNode dummy=dummyHead;
        head=head.next;
        while(head!=null){
            if(head.val==0 && sum!=0){
                ListNode newNode=new ListNode(sum);
                if(dummyHead==null){
                    dummyHead=newNode;
                    dummy=dummyHead;
                }
                else{
                    dummy.next=newNode;
                    dummy=dummy.next;
                }
                sum=0;
            }
            sum+=head.val;
            head=head.next;
        }
        return dummyHead.next;
    }
}