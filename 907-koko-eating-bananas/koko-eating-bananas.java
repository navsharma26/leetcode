class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        // Find maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            long totalHours = 0;
            for (int pile : piles) {
                // Ceiling division
                totalHours += (pile + mid - 1) / mid;
            }
            
            if (totalHours <= h) {
                right = mid;       // Try smaller speed
            } else {
                left = mid + 1;    // Increase speed
            }
        }
        
        return left;
    }
}
