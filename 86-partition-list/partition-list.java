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
    public ListNode partition(ListNode head, int x) {
        ListNode a=new ListNode(-1);
        ListNode b=new ListNode(-1);
        ListNode tempA=a;
        ListNode tempB=b;

        ListNode temp=head;

        // #a will store the small value then x

        while(temp!=null){
            
            if(temp.val>=x){
                tempB.next=temp;
                tempB=tempB.next;
            }
            else{
                tempA.next=temp;
                tempA=tempA.next;

            }
            temp=temp.next;

        }
       tempB.next=null;
       a=a.next;
       b=b.next;
       if(a==null)return b;
       tempA.next=b;

       


       return a;
        
        

        
    }
}