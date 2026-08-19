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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head ;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            //for odd
            odd.next = odd.next.next; //   2 --> 3
            odd = odd.next; // odd ---> 3
            //for even
            even.next = even.next.next;
            even = even.next;

        }
        odd.next = evenHead;
        return head;
    }
}