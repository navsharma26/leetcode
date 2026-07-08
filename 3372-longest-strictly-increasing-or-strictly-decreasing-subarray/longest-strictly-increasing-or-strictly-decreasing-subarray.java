class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int strictlyinc=1;
        int strictlydec=1;
        int result=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                
                strictlyinc++;
                strictlydec=1;
            }
            else if(nums[i]>nums[i+1]){
                
                strictlydec++;
                strictlyinc=1;


            }
            else {
                strictlyinc = 1;
                strictlydec = 1;
            }


            result= Math.max((strictlyinc),Math.max(result,strictlydec));
            
            
        }
        
        return result;
        
    }
}