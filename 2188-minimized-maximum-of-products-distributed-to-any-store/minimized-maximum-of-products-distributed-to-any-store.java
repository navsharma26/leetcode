class Solution {

     boolean canDistribute(int[] quantities, int n, int mid) {
    int stores = 0;

    for (int i = 0; i < quantities.length; i++) {
        stores += (quantities[i] + mid - 1) / mid;
    }

    if (stores <= n) {
        return true;
    } else {
        return false;
    }
     }

    public int minimizedMaximum(int n, int[] quantities) {
        int left=1;
        int right=java.util.Arrays.stream(quantities).max().getAsInt();
        int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canDistribute( quantities,  n,  mid)){
                result=mid;
                right=mid-1;

            }
            else{
                left=mid+1;
            }
        
        }
        return result;
        
    }
}