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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=reverse(slow.next);
        slow.next=null;
        ListNode ptr=head,ptr2=second;
        while(ptr2!=null) 
        {
            ListNode temp=ptr.next;
            ListNode temp2=ptr2.next;
            ptr.next=ptr2;
            ptr2.next=temp;
            ptr=temp;
            ptr2=temp2;        
        }
    }
    private ListNode reverse(ListNode curr)
    {
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}