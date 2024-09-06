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
        HashSet<Integer> lt=new HashSet<>();
        for(int i:nums) lt.add(i);
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            if(lt.contains(curr.val)){
                if(prev==null || head.val==curr.val){
                    head=head.next;
                }
                else{
                    prev.next=curr.next;
                }
            }
            else
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}