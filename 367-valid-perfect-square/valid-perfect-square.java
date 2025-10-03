class Solution {
    public boolean isPerfectSquare(int num) {
        int beg=0;
        int end=num-1;
    while(beg<=end){
        int mid=(beg+end)/2;
        if((long)mid*mid==num){
            return true;

        }
        else if(num==1){
            return true;
        }
        else if((long)mid*mid>num){
           end=mid-1;
        }
        else{
            beg=mid+1;
        }
    }
     return false;

    
    }
   
}



        
        
    
