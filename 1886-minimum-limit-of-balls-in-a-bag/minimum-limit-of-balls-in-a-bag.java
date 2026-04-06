class Solution {
    public boolean isPossible(int[] nums, int maxOps, int mid) {
        int totalOps = 0;

        for (int num : nums) {
            totalOps += (num - 1) / mid;
        }

        return totalOps <= maxOps;
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (isPossible(nums, maxOperations, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}