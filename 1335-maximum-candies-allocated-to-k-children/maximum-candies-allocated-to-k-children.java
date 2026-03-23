class Solution {
    
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = 0;
        
        // max find
        for(int i = 0; i < candies.length; i++){
            right = Math.max(right, candies[i]);
        }

        int result = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(candisribute(candies, k, mid)){
                result = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }

    public boolean candisribute(int[] candies, long k, int mid){
        long count = 0;

        for(int i = 0; i < candies.length; i++){
            count += candies[i] / mid;

            if(count >= k){
                return true;
            }
        }
        return false;
    }
}