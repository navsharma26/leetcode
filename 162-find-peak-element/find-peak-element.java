class Solution {
    public int findPeakElement(int[] nums) {
        
        int first = 0;
        int last = nums.length - 1;
        
        while (first < last) {
            
            int middle = first + (last - first) / 2;
            
            if (nums[middle] > nums[middle + 1]) {
                // Peak left side me hai (including middle)
                last = middle;
            } else {
                // Peak right side me hai
                first = middle + 1;
            }
        }
        
        return first;  // peak index
    }
}
