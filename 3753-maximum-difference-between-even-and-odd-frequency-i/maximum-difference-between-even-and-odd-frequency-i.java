import java.util.*;

class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Frequency count
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        // Step 2: Separate odd & even frequencies
        for (int freq : map.values()) {
            if (freq % 2 == 1) { // odd
                maxOdd = Math.max(maxOdd, freq);
            } else { // even
                minEven = Math.min(minEven, freq);
            }
        }

        // Step 3: If odd or even not found
        if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
            return 0;
        }

        return maxOdd - minEven;
    }
}
