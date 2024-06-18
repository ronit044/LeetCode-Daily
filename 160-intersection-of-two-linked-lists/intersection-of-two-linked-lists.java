/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int countNodes(ListNode x){
        int c=0;
        while(x!=null){
            x=x.next;
            c++;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int l1=countNodes(tempA);
        int l2=countNodes(tempB);
        if(l1>l2){
            for(int i=1;i<=(l1-l2);i++){
                headA=headA.next;
            }
        }
        if(l2>l1){
            for(int i=1;i<=(l2-l1);i++){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}