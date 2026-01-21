class Solution {
    public int countSeniors(String[] details) {
        if(details.length == 0) return 0;
        int count = 0;
        for(int i = 0; i < details.length; i++){
            // age > 60 check karna hai
            if(details[i].charAt(11) > '6' || 
              (details[i].charAt(11) == '6' && details[i].charAt(12) > '0')){
                count++;
            }
        }
        return count;
    }
}
