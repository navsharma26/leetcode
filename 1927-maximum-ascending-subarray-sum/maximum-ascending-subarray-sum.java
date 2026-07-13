class Solution {
    public int maxAscendingSum(int[] nums) {
    int count=nums[0];
        int store=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count += nums[i];
            }
            else {
              
                count =nums[i];
              
                 
                
            }
              store=Math.max(store,count);

        }
       
        
            
        return store;

        
    }
}