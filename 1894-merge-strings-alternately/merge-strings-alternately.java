class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sc =new StringBuilder();
        int w1=word1.length();
        int w2=word2.length();
        int i=0;
        while(i<w1||i<w2)
        {
            if(i<w1)
                sc.append(word1.charAt(i));
            
            if(i<w2)
                sc.append(word2.charAt(i));
            
            i++;
        }
       return sc.toString();
        
    }
}