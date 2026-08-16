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
    public boolean isPalindrome(ListNode head) 
    {

        //find mid
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;  // 1x speed
            fast=fast.next.next;  //2x speed
        }
        if(fast!=null)
        {
            slow=slow.next;
        }

        // reverse second part
        ListNode prevNode=null;
        while(slow!=null)
        {
            ListNode nextNode=slow.next;
            slow.next=prevNode;
            prevNode=slow;
            slow=nextNode;
        }

        //compare fist and second values
        ListNode first=head;
        ListNode second=prevNode;
        while(second!=null)
        {if(first.val != second.val){
            return false;
        }
            first=first.next;
            second=second.next;
        }

return true;
    }
}