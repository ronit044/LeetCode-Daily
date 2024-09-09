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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res=new int[m][n];
        for(int[] ar:res) Arrays.fill(ar,-1);
        int top=0,bottom=m-1,left=0,right=n-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                if(head==null) return res;
                res[top][i]=head.val;
                head=head.next;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(head==null) return res;
                res[i][right]=head.val;
                head=head.next;
            }
            right--;
            for(int i=right;i>=left;i--){
                if(head==null) return res;
                res[bottom][i]=head.val;
                                head=head.next;

            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                if(head==null) return res;
                res[i][left]=head.val;
                                head=head.next;

            }
            left++;
        }
        return res;
    }
}