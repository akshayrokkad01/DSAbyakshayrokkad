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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fptr = dummy;
        ListNode sptr = dummy;

        for (int i = 0; i < n; i++) {
            sptr = sptr.next;
        }
        while (sptr.next != null) {
            fptr = fptr.next;
            sptr = sptr.next;
        }
        fptr.next = fptr.next.next;

        return dummy.next;
    }
}