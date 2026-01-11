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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode previous=null;

        int sz = 0;
        while(slow!=null){
            slow = slow.next;
            sz++;
        }

        if(sz==1){
            return previous;
        }

        slow = head;

        
       
        if(head==null||head.next==null) return head;
        while(fast!=null&&fast.next!=null){
            previous=slow;
            slow=slow.next;
            fast=fast.next.next;
            
        }
        
        previous.next=slow.next;
        slow.next=null;

        return head;
    }
}