/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null||headB==null) return null;
        
        // #finding length

        int lena=0;
        ListNode tempa=headA;
       while(tempa!=null){
        tempa=tempa.next;
        lena++;
       }
       int lenb=0;
        ListNode tempb=headB;
       while(tempb!=null){
        tempb=tempb.next;
        lenb++;
       }

    //    #now after finding the length we should back temp into there respective head
tempa=headA;
tempb=headB;

// #now compare both length if a>b we should exicute a firstly and rech the parallary to b and traversing them togtether when they meet they are the centere or intersection point

if(lena>lenb){
    for(int i=0;i<(lena-lenb);i++){
        tempa=tempa.next;
    }
}
else{
    for(int i=0;i<(lenb-lena);i++){
        tempb=tempb.next;
    }
}

while(tempa!=tempb){
    tempa=tempa.next;
    tempb=tempb.next;
}
return tempa;

    }
}