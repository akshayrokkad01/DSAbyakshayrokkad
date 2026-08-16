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
    public void reorderList(ListNode head) 
    
    {
        // find mid
        if(head==null||head.next==null)
        {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse
        ListNode second=slow.next;
                slow.next=null;
        ListNode prevNode=null;
        while(second!=null)
        {
            ListNode nextNode=second.next;
            second.next=prevNode;
            prevNode=second;
            second=nextNode;
        }        
        //merge
        ListNode first=head;
        second=prevNode;
        while(second!=null)
        {
            ListNode  firstNext=first.next;
              ListNode secondNext=second.next;

              first.next=second;
              second.next=firstNext;

              first=firstNext;
              second=secondNext;
        }
    }
}