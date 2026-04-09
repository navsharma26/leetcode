class Solution {
     private boolean isPossible(int[] ranks, long mid, int cars) {
        long carsRepaired = 0;
        for (int i=0;i<ranks.length;i++) {
            int rank=ranks[i];
            carsRepaired += Math.sqrt(1.0 * mid / rank);
        }
        return carsRepaired >= cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long left=1;
        long right=1L * cars * cars * Arrays.stream(ranks).max().orElse(Integer.MIN_VALUE); 
        long result = -1;
        while(left<=right){
            long mid=left+(right-left)/2;
               if (isPossible(ranks, mid, cars)){
                result= mid;
                right=mid-1;

            }
            else{
                left=mid+1;
            }
        }
        return result;
    }
}