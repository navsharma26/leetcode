class Solution {


    public boolean validPalindrome(String s) {

        int l = 0;
        int r = s.length()-1;

        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return ispalamdrome(s,l+1,r)||ispalamdrome(s,l,r-1);
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    

    }

    public boolean ispalamdrome( String s,int l,int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}