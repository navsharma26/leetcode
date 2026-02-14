class Solution {

    public int leftmost(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int leftmost = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                leftmost = mid;
                right = mid - 1;   // move left
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return leftmost;
    }

    public int rightmost(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int rightmost = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                rightmost = mid;
                left = mid + 1;   // move right
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return rightmost;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{ leftmost(nums, target), rightmost(nums, target) };
    }
}
