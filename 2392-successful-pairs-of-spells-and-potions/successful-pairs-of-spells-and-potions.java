import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int[] ans = new int[spells.length];
        
        // Sort only once
        Arrays.sort(potions);
        
        for(int i = 0; i < spells.length; i++) {
            
            long n = spells[i];
            
            int left = 0;
            int right = potions.length - 1;
            int index = potions.length; 
            
            while(left <= right) {
                
                int mid = left + (right - left) / 2;
                
                if(n * potions[mid] >= success) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            ans[i] = potions.length - index;
        }
        
        return ans;
    }
}