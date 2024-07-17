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
        ListNode dummy1=l1,dummy2=l2;
        ListNode dummyHead=null;
        ListNode dummy=dummyHead;
        int carry=0;
        while(dummy1!=null && dummy2!=null){
            int sum=dummy1.val+dummy2.val+carry;
            carry=sum/10;
            int finalSum=sum%10;
            if(dummyHead==null){
                dummyHead=new ListNode(finalSum);
                dummy=dummyHead;
            }
            else{
                dummy.next=new ListNode(finalSum);
                dummy=dummy.next;
            }
            dummy1=dummy1.next;
            dummy2=dummy2.next;
        }
        while(dummy1!=null){
            int sum=dummy1.val+carry;
            carry=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            dummy1=dummy1.next;
        }
        while(dummy2!=null){
            int sum=dummy2.val+carry;
            carry=sum/10;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            dummy2=dummy2.next;
        }
        if(carry!=0) dummy.next=new ListNode(carry);
        return dummyHead;
    }
}
