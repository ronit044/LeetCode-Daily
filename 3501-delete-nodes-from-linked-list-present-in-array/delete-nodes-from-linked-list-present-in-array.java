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
    public void deleteNode(ListNode head,HashSet<Integer> lt){
        ListNode prev=head;
        ListNode dummy=head.next;
            while(dummy!=null){
                if(lt.contains(dummy.val)){
                    prev.next=dummy.next;
                    dummy=prev.next;
                    continue;
                }
                prev=dummy;
                dummy=dummy.next;
            }
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> lt=new HashSet<>();
        for(int i:nums) lt.add(i);
            while(lt.contains(head.val))
                 head=head.next;
            deleteNode(head,lt);
        return head;
    }
}