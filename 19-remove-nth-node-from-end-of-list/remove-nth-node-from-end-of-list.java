class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode ptr = dummy;
        ListNode curr = dummy;

        while (ptr.next != null) {
            ptr = ptr.next;
            size++;
        }

        for (int i = 0; i < size - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }
}