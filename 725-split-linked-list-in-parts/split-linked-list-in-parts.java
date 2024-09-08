class Solution {
    public int LinkedListLength(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int length = LinkedListLength(head);
        int baseSize = length / k;
        int extraParts = length % k;

        ListNode current = head;
        for (int i = 0; i < k; i++) {
            ListNode partHead = current;
            int currentPartSize = baseSize + (i < extraParts ? 1 : 0);
            
            for (int j = 1; j < currentPartSize; j++) {
                if (current != null) {
                    current = current.next;
                }
            }
            if (current != null) {
                ListNode nextPartHead = current.next;
                current.next = null;
                current = nextPartHead;
            }
            
            res[i] = partHead;
        }
        
        return res;
    }
}
