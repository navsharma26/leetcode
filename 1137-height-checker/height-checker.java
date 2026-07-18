class Solution {
    public int heightChecker(int[] heights) {
        int count=0;

       int[]real= heights.clone();
       Arrays.sort(real);
       for(int i=0;i<heights.length;i++){
        if(real[i]!=heights[i])
        count++;

       }
       return count;
       

        
    }
}