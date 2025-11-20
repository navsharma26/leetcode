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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode pre = null;
        ListNode next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode a = dummy;  
        for (int i = 1; i < left; i++) {
            a = a.next;       
        }

        ListNode b = a.next;  
        ListNode c = b;       
        for (int i = left; i < right; i++) {
            c = c.next;
        }

        ListNode d = c.next;   

        a.next = null;
        c.next = null;

        ListNode newHead = reverseList(b);

        a.next = newHead;

        b.next = d;

        return dummy.next;
    }
}