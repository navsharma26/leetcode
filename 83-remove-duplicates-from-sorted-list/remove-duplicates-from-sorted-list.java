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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode a=head;
        ListNode b=head;
        while(b!=null){
          
            
            if(a.val==b.val){
                b=b.next;
            }
            else{
                a.next=b;
                  a=b;
            }
           
            
          

           
        }
        a.next=null;
        
        return head;
        
        
    }
}