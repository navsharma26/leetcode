class Solution {
    public int maxSubArray(int[] nums) {
        int csum=0;
        int ssum = Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++){
            csum=csum+nums[i];
            ssum=Math.max(ssum,csum);
            if(csum<0){
                csum=0;
            }
           
           
               
            

        }
         return ssum;
        
        
    }
   
}