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
 class Solution{
    public void reverselist(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        ListNode Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
         
    }

    public ListNode reverseBetween(ListNode head,int left,int right){
        if(head.next==null||left==right) return head;
        ListNode a=null;
        ListNode b=null;
        ListNode c=null;
        ListNode d=null;
        int pos=1;
        ListNode temp=head;
        while(temp!=null){
            if(pos==left-1) a=temp;
              if(pos==left) b=temp;
                if(pos==right) c=temp;
                  if(pos==right+1) d=temp;
                  temp=temp.next;
                  pos++;
                  
        }
         if(a!=null) a.next=null;
           if(c!=null)       c.next=null;
                  reverselist(b);
                if(a!=null)  a.next=c;
                  b.next=d;
                  if(a==null) return c;
                  return head;

 }

 }
 
