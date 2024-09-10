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
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            if(prev!=null && curr!=null){
                ListNode newNode=new ListNode(gcd(curr.val,prev.val));
                curr=curr.next;
                ListNode dummyCurr=prev.next;
                prev.next=newNode;
                newNode.next=dummyCurr;
                prev=dummyCurr;
                continue;
            }
            prev=curr;
        curr=curr.next;
        }
        return head;
    }
}