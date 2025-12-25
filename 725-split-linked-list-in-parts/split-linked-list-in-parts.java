class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        // step 1: find length
        ListNode curr = head;
        int l = 0;
        while (curr != null) {
            l++;
            curr = curr.next;
        }

        // step 2: bucket size and remainder
        int eachBucket = l / k;
        int remainder = l % k;

        // step 3: split
        ListNode[] result = new ListNode[k];
        curr = head;

        for (int i = 0; i < k; i++) {
            result[i] = curr;
            int size = eachBucket + (remainder > 0 ? 1 : 0);

            ListNode prev = null;
            for (int j = 0; j < size; j++) {
                prev = curr;
                if (curr != null) curr = curr.next;
            }

            if (prev != null) prev.next = null;
            if (remainder > 0) remainder--;
        }

        return result;
    }
}
