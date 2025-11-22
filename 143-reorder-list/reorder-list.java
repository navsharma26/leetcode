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
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverselist(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        ListNode Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;


        }
        return pre;


    }
    public void reorderList(ListNode head) {
        ListNode left= middleNode(head);
        ListNode head2=left.next;
        left.next=null;
        head2=reverselist(head2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head!=null&& head2!=null){
            temp.next=head;
            head=head.next;
            temp=temp.next;
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
            
        }
        if(head==null) temp.next=head2;
        if(head2==null) temp.next=head;
        head=dummy.next;
         

        
    }
}