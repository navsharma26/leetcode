class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 100000;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int store = 0; // reset every iteration

            for (int i = 0; i < quantities.length; i++) {
                store += (quantities[i] + mid - 1) / mid;
            }

            if (store <= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}